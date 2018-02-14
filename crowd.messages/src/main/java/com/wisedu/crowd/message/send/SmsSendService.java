/**
 * Project Name:crowd-service
 * File Name:SmsSendMessageImpl.java
 * Package Name:com.wisedu.crowd.message.sms
 * Date:2017年8月23日下午12:31:42
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.message.send;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wisedu.crowd.common.util.CommonUtil;

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
public class SmsSendService {

	private final static Logger    LOG = LoggerFactory.getLogger(EmailSendService.class);
    private String apiKey;
   
    /**
     * 获取用户账户信息地址
     */
    private String uriGetUserInfo;
    
    /**
     * 智能匹配模板发送接口的http地址 
     */
    private String uriSendSms;
    
    /**
     * 模板发送接口的http地址
     */
    private String uriTplSendSms;
    
    /**
     * 发送语音验证码接口的http地址
     */
    private String uriSendVoice;
   
    /**
     * 编码
     */
    private String encoding;
    public void sendMessage(String user,String message) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        //String content=String.format(SmsMessageTempleateEnum.TITLE.getName()+SmsMessageTempleateEnum.REGISTER.getName(), sendMessageObject.getContent());
        try{
        params.put("apikey", apiKey);
        params.put("text", message);
        params.put("mobile", user);
        post(uriSendSms, params);
        }catch(Exception e){
        	LOG.error("用户短信"+user+"  "+message+"发送失败！失败原因"+e);
        }
    }
    
    public void sendMessage(List<String> users,String message) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        //String content=String.format(SmsMessageTempleateEnum.TITLE.getName()+SmsMessageTempleateEnum.REGISTER.getName(), sendMessageObject.getContent());
        if(CommonUtil.isNotEmptyList(users)){
        	for(String user:users){
        		sendMessage(user, message);
        	}
        }
    }
    public  String post(String url, Map<String, String> paramsMap) {
        CloseableHttpClient client = HttpClients.createDefault();
        String responseText = "";
        CloseableHttpResponse response = null;
        try {
            HttpPost method = new HttpPost(url);
            if (paramsMap != null) {
                List<NameValuePair> paramList = new ArrayList<NameValuePair>();
                for (Map.Entry<String, String> param : paramsMap.entrySet()) {
                    NameValuePair pair = new BasicNameValuePair(param.getKey(),
                            param.getValue());
                    paramList.add(pair);
                }
                method.setEntity(new UrlEncodedFormEntity(paramList, encoding));
            }
            response = client.execute(method);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                responseText = EntityUtils.toString(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return responseText;
    }
    public String getUriGetUserInfo() {
        return uriGetUserInfo;
    }
    public void setUriGetUserInfo(String uriGetUserInfo) {
        this.uriGetUserInfo = uriGetUserInfo;
    }
    public String getUriSendSms() {
        return uriSendSms;
    }
    public void setUriSendSms(String uriSendSms) {
        this.uriSendSms = uriSendSms;
    }
    public String getUriTplSendSms() {
        return uriTplSendSms;
    }
    public void setUriTplSendSms(String uriTplSendSms) {
        this.uriTplSendSms = uriTplSendSms;
    }
    public String getUriSendVoice() {
        return uriSendVoice;
    }
    public void setUriSendVoice(String uriSendVoice) {
        this.uriSendVoice = uriSendVoice;
    }
    public String getEncoding() {
        return encoding;
    }
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
    
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
    
}

