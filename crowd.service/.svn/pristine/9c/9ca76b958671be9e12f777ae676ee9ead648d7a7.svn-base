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

@Service
public class TbRwjbxxMessages {
	@Autowired
	@Qualifier("rwjbxxTbMqTemplate")
    private JmsTemplate jmsTemplate;
    
    public void sendMsg(final String rwid,final String kfzid,final String tbid) {
        
    	jmsTemplate.send(new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				Map<String,Object> map=new HashMap<String,Object>();
				map.put("kfzid", kfzid);
				map.put("rwid", rwid);
				map.put("tbid", tbid);
				return session.createTextMessage(JSON.toJSONString(map));
			}
		});
    }
}
