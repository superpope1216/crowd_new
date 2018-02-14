package com.wisedu.crowd.service.mq.message;

import java.util.HashMap;
import java.util.Map;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
/**
 * 自动验收不通过提醒
 * @author de
 *
 */
@Service
public class AutoShNotPsssMessages {
	@Autowired
	@Qualifier("autoShNotPassRwjbxxMqTemplate")
    private JmsTemplate jmsTemplate;
    
	
    public void sendMsg(final String rwid,final String kfzid) {
        
    	jmsTemplate.send(new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				Map<String,Object> map=new HashMap<String,Object>();
				map.put("rwid", rwid);
				map.put("kfzid", kfzid);
				return session.createTextMessage(JSON.toJSONString(map));
			}
		});
    }
}
