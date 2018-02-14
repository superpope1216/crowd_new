package com.wisedu.crowd.message.send;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.message.rwjbxx.listener.PublishingRwjbxxListener;

public class EmailSendService {
	private final static Logger    LOG = LoggerFactory.getLogger(EmailSendService.class);
	    private SimpleMailMessage simpleMailMessage;  
	    private MailSender mailSender;  
	    
	    //Spring 依赖注入  
	    public void setMailSender(MailSender mailSender) {  
	        this.mailSender = mailSender;  
	    }  
	      
	    //Spring 依赖注入  
	    public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {  
	        this.simpleMailMessage = simpleMailMessage;  
	    }  
	   
	    public  void sendMessage(List<String> users,String title,String content)  throws Exception{
	        
	        
	        if(CommonUtil.isNotEmptyList(users)){
	        	for(String user:users){
	        		sendMessage(user,title,content);
	        	}
	        }
	    } 
	    
	    public  void sendMessage(String user,String title,String content)  throws Exception{
	    	try{
	        
	        simpleMailMessage.setTo(user);
	        simpleMailMessage.setSubject(title);  
	        simpleMailMessage.setText(content); 
	        mailSender.send(simpleMailMessage);
	    	}catch(Exception e){
	    		LOG.error(user+"   "+title+"   "+content+"   "+e  );
	    	}
	    } 
}
