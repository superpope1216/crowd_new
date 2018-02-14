package com.wisedu.crowd.service.mq.message;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

/**
 * 发布任务通知
 * @author de
 *
 */
@Service
public class PublishingRwjbxxMessages  {
	@Autowired
	@Qualifier("rwjbxxFbMqTemplate")
    private JmsTemplate jmsTemplate;
    
    public void sendMsg(final String rwid) {
        
    	jmsTemplate.send(new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(rwid);
			}
		});
    }
}
