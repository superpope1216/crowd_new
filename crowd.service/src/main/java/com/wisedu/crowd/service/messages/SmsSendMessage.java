/**
 * Project Name:crowd-service
 * File Name:SmsSendMessageImpl.java
 * Package Name:com.wisedu.crowd.message.sms
 * Date:2017年8月23日下午12:31:42
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.messages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;



/**
 * ClassName:SmsSendMessageImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年8月23日 下午12:31:42 <br/>
 * @author   de
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface SmsSendMessage {
	
	boolean sendMessage(String mobile,String message) throws Exception;
}

