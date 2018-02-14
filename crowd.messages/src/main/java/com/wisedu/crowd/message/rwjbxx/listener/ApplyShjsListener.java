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
import com.wisedu.crowd.common.code.SmsMessageTempleateEnum;
import com.wisedu.crowd.common.code.XxlxEnum;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.entity.rwgl.RwjbxxInfo;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;

/**
 * 申请售后结束监听
 * @author de
 *
 */
public class ApplyShjsListener extends BaseListener implements SessionAwareMessageListener<Message>{

	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	private final static Logger LOG = LoggerFactory.getLogger(ApplyShjsListener.class);

	@Override
	public void onMessage(Message message, Session session) throws JMSException {
		TextMessage msg = (TextMessage) message;
		Map<String, Object> rwxx = (Map<String, Object>) JSON.parse(msg.getText());
		String rwid = StringUtil.toStr(rwxx.get("rwid"));
		try {
			sendMsg(rwid);
		} catch (Exception e) {
			throw new JMSException(e.getMessage());
		}
	}

	private void sendMsg(String rwid) throws Exception {
		try {
			RwjbxxInfo rwjbxxInfo = rwjbxxInfoService.selectByPrimaryKey(rwid).getDatas();
			this.sendToXqf(rwjbxxInfo, rwjbxxInfo.getXqfid(), "申请售后结束通知", SmsMessageTempleateEnum.APPLY_SQSHJS.getName(), XxlxEnum.SHJSTX.getCode());
		} catch (Exception e) {
			LOG.error("任务编号：" + rwid + "邮件发送失败!" + DateUtil.getCurrentDateTimeStr());
		}
	}
}
