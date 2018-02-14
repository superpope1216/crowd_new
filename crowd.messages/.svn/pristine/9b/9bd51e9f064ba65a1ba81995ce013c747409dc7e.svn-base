package com.wisedu.crowd.message.rwjbxx.listener;

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
import com.wisedu.crowd.common.code.NwbEnum;
import com.wisedu.crowd.common.code.SmsMessageTempleateEnum;
import com.wisedu.crowd.common.code.XxlxEnum;
import com.wisedu.crowd.common.code.YesNoEnum;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.entity.rwgl.RwjbxxInfo;
import com.wisedu.crowd.entity.xxgl.XqxxInfo;
import com.wisedu.crowd.entity.yhgl.KfzxxInfo;
import com.wisedu.crowd.entity.yhgl.XqfxxInfo;
import com.wisedu.crowd.entity.yhgl.YhjbxxInfo;
import com.wisedu.crowd.message.send.EmailSendService;
import com.wisedu.crowd.message.send.SmsSendService;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.xxgl.XqxxInfoService;
import com.wisedu.crowd.service.yhgl.KfzxxInfoService;
import com.wisedu.crowd.service.yhgl.XqfxxInfoService;
import com.wisedu.crowd.service.yhgl.YhjbxxInfoService;

/**
 * 选标任务监听
 * 
 * @author de
 *
 */
public class SelectRwjbxxListener  extends BaseListener implements SessionAwareMessageListener<Message> {

	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	private final static Logger LOG = LoggerFactory.getLogger(SelectRwjbxxListener.class);

	@Override
	public void onMessage(Message message, Session session) throws JMSException {
		TextMessage msg = (TextMessage) message;
		Map<String, Object> rwxx = (Map<String, Object>) JSON.parse(msg.getText());
		String rwid = StringUtil.toStr(rwxx.get("rwid"));
		String kfzid = StringUtil.toStr(rwxx.get("kfzid"));
		try {
			sendMsg(rwid,kfzid);
		} catch (Exception e) {
			throw new JMSException(e.getMessage());
		}
	}

	private void sendMsg(String rwid, String kfzid) throws Exception {
		try {
			RwjbxxInfo rwjbxxInfo = rwjbxxInfoService.selectByPrimaryKey(rwid).getDatas();
			this.sendToKfz(rwjbxxInfo, kfzid, "需求中标通知", SmsMessageTempleateEnum.XB.getName(), XxlxEnum.ZBTX.getCode());
		} catch (Exception e) {
			LOG.error("任务编号：" + rwid + "邮件发送失败!" + DateUtil.getCurrentDateTimeStr());
		}
	}

}
