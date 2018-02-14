package com.wisedu.crowd.message.rwjbxx.listener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.listener.SessionAwareMessageListener;

import com.alibaba.fastjson.JSON;
import com.wisedu.crowd.common.code.SmsMessageTempleateEnum;
import com.wisedu.crowd.common.code.XxlxEnum;
import com.wisedu.crowd.common.code.YesNoEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.entity.rwgl.RwjbxxInfo;
import com.wisedu.crowd.entity.xtgl.extend.YwxShryInfoExtend;
import com.wisedu.crowd.entity.xtgl.extend.YwxdzbInfoExtend;
import com.wisedu.crowd.entity.xxgl.XqxxInfo;
import com.wisedu.crowd.entity.yhgl.XqfxxInfo;
import com.wisedu.crowd.entity.yhgl.YhjbxxInfo;
import com.wisedu.crowd.message.send.EmailSendService;
import com.wisedu.crowd.message.send.SmsSendService;
import com.wisedu.crowd.service.messages.SmsSendMessage;
/**
 * 投标任务监听
 * @author de
 *
 */
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.xxgl.XqxxInfoService;
import com.wisedu.crowd.service.yhgl.XqfxxInfoService;
import com.wisedu.crowd.service.yhgl.YhjbxxInfoService;

public class TbRwjbxxListener implements SessionAwareMessageListener<Message> {

	@Autowired
	private EmailSendService emailSendSerive;
	@Autowired
	private SmsSendService smsSendService;
	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	@Autowired
	private XqfxxInfoService xqfxxInfoService;
	@Autowired
	private YhjbxxInfoService yhjbxxInfoService;
	@Autowired
	private XqxxInfoService xqxxInfoService;
	private final static Logger LOG = LoggerFactory.getLogger(PublishingRwjbxxListener.class);

	@Override
	public void onMessage(Message message, Session session) throws JMSException {
		TextMessage msg = (TextMessage) message;
		Map<String, Object> rwxx = (Map<String, Object>) JSON.parse(msg.getText());
		String rwid = StringUtil.toStr(rwxx.get("rwid"));
		String kfzid = StringUtil.toStr(rwxx.get("kfzid"));
		String tbid = StringUtil.toStr(rwxx.get("tbid"));
		try {
			sendMsg(rwid, kfzid, tbid);
		} catch (Exception e) {
			throw new JMSException(e.getMessage());
		}
	}

	private void sendMsg(String rwid, String kfzid, String tbid) throws Exception {
		try {
			RwjbxxInfo rwjbxxInfo = rwjbxxInfoService.selectByPrimaryKey(rwid).getDatas();
			XqfxxInfo xqfxxInfo = xqfxxInfoService.selectByPrimaryKey(rwjbxxInfo.getXqfid(), null).getDatas();
			YhjbxxInfo yhjbxxInfo = yhjbxxInfoService.selectByPrimaryKey(xqfxxInfo.getYhid());
			String content = String.format(SmsMessageTempleateEnum.TB.getName(),
					"【" + rwjbxxInfo.getRwbh() + "】" + rwjbxxInfo.getRwmc());
			// 发送短信
			try {
				smsSendService.sendMessage(yhjbxxInfo.getSjh(), SmsMessageTempleateEnum.TITLE.getName() + content);
			} catch (Exception ee) {
				LOG.error("任务编号：" + rwid + "，投标：" + tbid + "短信发送失败!" + ee + DateUtil.getCurrentDateTimeStr());
			}
			String emailContent = "您好：您发布的需求【" + rwjbxxInfo.getRwbh() + "】" + rwjbxxInfo.getRwmc() + ",已有投标，请及时进行确认选标！";
			// 发送邮件
			try {
				emailSendSerive.sendMessage(xqfxxInfo.getGh() + ConstantsUtil.EMAIL_NAME,
						SmsMessageTempleateEnum.TITLE.getName() + "需求选标通知", emailContent);
			} catch (Exception ee) {
				LOG.error("任务编号：" + rwid + "，投标：" + tbid + "邮件发送失败!" + ee + DateUtil.getCurrentDateTimeStr());
			}
			// 保存消息
			try {
				XqxxInfo xqxxInfo = new XqxxInfo();
				xqxxInfo.setWid(StringUtil.getUuId());
				xqxxInfo.setFssj(DateUtil.getCurrentDateTimeStr());
				xqxxInfo.setJsr(yhjbxxInfo.getWid());
				xqxxInfo.setRq(DateUtil.getCurrentDateStr());
				xqxxInfo.setRwid(rwid);
				xqxxInfo.setSfyd(StringUtil.toInt(YesNoEnum.NO.getCode()));
				xqxxInfo.setXxlx(XxlxEnum.TBTX.getCode());
				xqxxInfo.setXxnr(emailContent);
				xqxxInfoService.insertSelective(xqxxInfo);
			} catch (Exception ee) {
				LOG.error("任务编号：" + rwid + "，投标：" + tbid + "消息保存失败!" + ee + DateUtil.getCurrentDateTimeStr());
			}
		} catch (Exception e) {
			LOG.error("任务编号：" + rwid + "邮件发送失败!" + DateUtil.getCurrentDateTimeStr());
		}
	}

}
