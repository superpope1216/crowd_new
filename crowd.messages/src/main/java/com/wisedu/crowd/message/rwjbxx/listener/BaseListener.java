package com.wisedu.crowd.message.rwjbxx.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

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

public class BaseListener {
	private final static Logger LOG = LoggerFactory.getLogger(BaseListener.class);
	@Autowired
	private EmailSendService emailSendSerive;
	@Autowired
	private SmsSendService smsSendService;
	@Autowired
	private KfzxxInfoService kfzxxInfoService;

	@Autowired
	private XqfxxInfoService xqfInfoService;
	@Autowired
	private YhjbxxInfoService yhjbxxInfoService;
	@Autowired
	private XqxxInfoService xqxxInfoService;

	protected void sendToKfz(RwjbxxInfo rwjbxxInfo, String kfzid, String title, String content, Integer xxlx) {

		KfzxxInfo kfzxxInfo = kfzxxInfoService.selectByPrimaryKey(kfzid, null).getDatas();
		String email = kfzxxInfo.getGh() + ConstantsUtil.EMAIL_NAME;
		if (NwbEnum.WB.getCode().equals(kfzxxInfo.getKfzlb())) {
			email = kfzxxInfo.getDzyx();
		}
		send(rwjbxxInfo, xxlx, title, content, email, kfzxxInfo.getKfzlb(), kfzxxInfo.getYhid());
	}

	protected void sendToXqf(RwjbxxInfo rwjbxxInfo, String xqfId, String title, String content, Integer xxlx) {
		XqfxxInfo xqfxxInfo = xqfInfoService.selectByPrimaryKey(xqfId, null).getDatas();
		String email = xqfxxInfo.getGh() + ConstantsUtil.EMAIL_NAME;
		if (NwbEnum.WB.getCode().equals(xqfxxInfo.getXqflb())) {
			email = xqfxxInfo.getLxydzyx();
		}
		send(rwjbxxInfo, xxlx, title, content, email, StringUtil.toStr(xqfxxInfo.getXqflb()), xqfxxInfo.getYhid());
	}

	private void send(RwjbxxInfo rwjbxxInfo, Integer xxlx, String title, String content, String email, String yhlb,
			String yhid) {
		YhjbxxInfo yhjbxxInfo = yhjbxxInfoService.selectByPrimaryKey(yhid);
		content = String.format(content, "【" + rwjbxxInfo.getRwbh() + "】" + rwjbxxInfo.getRwmc());
		title = SmsMessageTempleateEnum.TITLE.getName() + title;
		// 发送短信
		if (NwbEnum.WB.getCode().equals(yhlb)) {
			try {
				smsSendService.sendMessage(yhjbxxInfo.getSjh(), SmsMessageTempleateEnum.TITLE.getName() + content);
			} catch (Exception ee) {
				LOG.error("消息类型：" + xxlx + ",任务编号：" + rwjbxxInfo.getWid() + " 发送失败!" + ee
						+ DateUtil.getCurrentDateTimeStr());
			}
		}

		// 发送邮件
		try {
			emailSendSerive.sendMessage(email, title, content);
		} catch (Exception ee) {
			LOG.error(
					"消息类型：" + xxlx + ",任务编号" + rwjbxxInfo.getWid() + "邮件发送失败!" + ee + DateUtil.getCurrentDateTimeStr());
		}
		// 保存消息
		try {
			XqxxInfo xqxxInfo = new XqxxInfo();
			xqxxInfo.setWid(StringUtil.getUuId());
			xqxxInfo.setFssj(DateUtil.getCurrentDateTimeStr());
			xqxxInfo.setJsr(yhjbxxInfo.getWid());
			xqxxInfo.setRq(DateUtil.getCurrentDateStr());
			xqxxInfo.setRwid(rwjbxxInfo.getWid());
			xqxxInfo.setSfyd(StringUtil.toInt(YesNoEnum.NO.getCode()));
			xqxxInfo.setXxlx(xxlx);
			xqxxInfo.setXxnr(content);
			xqxxInfoService.insertSelective(xqxxInfo);
		} catch (Exception ee) {
			LOG.error("消息类型：" + xxlx + ",任务编号：" + rwjbxxInfo.getWid() + "，选标消息保存失败!" + ee
					+ DateUtil.getCurrentDateTimeStr());
		}
	}
}
