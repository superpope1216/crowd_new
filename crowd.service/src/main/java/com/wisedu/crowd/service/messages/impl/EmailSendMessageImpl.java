/**
 * Project Name:crowd-service
 * File Name:sms.java
 * Package Name:com.wisedu.crowd.message.email
 * Date:2017年8月23日上午11:40:25
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.messages.impl;



import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.service.messages.EmailSendMessage;


/**
 * ClassName:sms <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年8月23日 上午11:40:25 <br/>
 * @author   de
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

@Service("emailSendMessage")
public class EmailSendMessageImpl implements EmailSendMessage{

    private MailSender mailSender;  
    private SimpleMailMessage simpleMailMessage;  
      
    //Spring 依赖注入  
    public void setMailSender(MailSender mailSender) {  
        this.mailSender = mailSender;  
    }  
      
    //Spring 依赖注入  
    public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {  
        this.simpleMailMessage = simpleMailMessage;  
    }  
   

    public  boolean sendMessage(List<String> users,String title,String content)  throws Exception{
        if(CommonUtil.isEmptyList(users)){
            throw new Exception("请选择邮件发送人");
        }
        if(StringUtils.isEmpty(title)){
            throw new Exception("输入邮件的发送主题");
        }
        if(StringUtils.isEmpty(content)){
            throw new Exception("输入邮件的发送内容");
        }
        
        simpleMailMessage.setTo(ListChangetoStr(users));
        simpleMailMessage.setSubject(title);  
        simpleMailMessage.setText(content);  
        mailSender.send(simpleMailMessage);  
        return true;
    }  
  
    public String ListChangetoStr(List<String> list){
    	String users="";
    	for(String str:list){
    		users+=str+",";
    	}
    	if(users.length()>=1){
    		users=users.substring(0, users.length()-1);
    	}
    	System.out.println("---------users-----------"+users);
		return users;
    }
    
}

