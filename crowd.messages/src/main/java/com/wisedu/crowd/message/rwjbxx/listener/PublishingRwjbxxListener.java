package com.wisedu.crowd.message.rwjbxx.listener;

import java.util.ArrayList;
import java.util.List;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.listener.SessionAwareMessageListener;

import com.alibaba.fastjson.JSON;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.rwgl.RwjbxxInfo;
import com.wisedu.crowd.entity.xtgl.extend.YwxShryInfoExtend;
import com.wisedu.crowd.entity.xtgl.extend.YwxdzbInfoExtend;
import com.wisedu.crowd.message.send.EmailSendService;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.xtgl.YwxShryInfoService;
import com.wisedu.crowd.service.xtgl.YwxdzbInfoService;
import com.wisedu.crowd.service.yhgl.KfzxxInfoService;

/**
 * 发布任务消息接口
 * 
 * @author de
 *
 */
public class PublishingRwjbxxListener implements SessionAwareMessageListener<Message> {

	private final static Logger LOG = LoggerFactory.getLogger(PublishingRwjbxxListener.class);

	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	@Autowired
	private YwxShryInfoService ywxShryInfoService;
	@Autowired
	private YwxdzbInfoService ywxdzbInfoService;
	@Autowired
	private EmailSendService emailSendService;

	@Override
	public void onMessage(Message message, Session session) throws JMSException {
		TextMessage msg = (TextMessage) message;
		String rwid = msg.getText();
		try {
			sendMsg(rwid);
		} catch (Exception e) {
			throw new JMSException(e.getMessage());
		}
	}

	private void sendMsg(String rwid) throws Exception {
		try {
			RwjbxxInfo rwjbxxInfo = rwjbxxInfoService.selectByPrimaryKey(rwid).getDatas();
			YwxdzbInfoExtend queryYwxdzbInfoExtend = new YwxdzbInfoExtend();
			queryYwxdzbInfoExtend.setXywx(rwjbxxInfo.getYwxlb());

			YwxdzbInfoExtend ywxdzbInfoExtend = ywxdzbInfoService
					.selectByCondition(ConditionUtil.createCondition(queryYwxdzbInfoExtend), null).getDatas().get(0);
			YwxShryInfoExtend queryYwxShryInfoExtend = new YwxShryInfoExtend();
			queryYwxShryInfoExtend.setYwxid(ywxdzbInfoExtend.getYywx());
			List<YwxShryInfoExtend> lst = ywxShryInfoService
					.selectDisplayByCondition(ConditionUtil.createCondition(queryYwxShryInfoExtend), null).getDatas();
			if (CommonUtil.isNotEmptyList(lst)) {
				List<String> users = new ArrayList<String>();
				for (YwxShryInfoExtend ywxShryInfoExtend : lst) {
					users.add(ywxShryInfoExtend.getGh() + ConstantsUtil.EMAIL_NAME);
				}
				emailSendService.sendMessage(users, "需求审核申请", "任务编号：" + rwjbxxInfo.getRwbh() + "任务名称："
						+ rwjbxxInfo.getRwmc() + "邀请您进行审核，请及时和需求方进行联系确认审核工作！");

			}
		} catch (Exception e) {
			LOG.error("任务编号：" + rwid + "邮件发送失败!" + DateUtil.getCurrentDateTimeStr());
			throw e;
		}
	}

}
