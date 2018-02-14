package com.wisedu.crowd.common.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class HttpMoocUtil {
   
	public static JSONObject httpPost(String url,Map<String,Object> map) throws Exception {
        HttpPost httpPost = new HttpPost(url);
        CloseableHttpResponse response = null;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        RequestConfig requestConfig = RequestConfig.custom().
        		setSocketTimeout(2000).setConnectTimeout(2000).build();
        httpPost.setConfig(requestConfig);
        httpPost.addHeader("Content-Type","application/x-www-form-urlencoded");
        try {
        	if(null!=map&&!map.isEmpty()){
        		 List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
            	 for(String key:map.keySet()){
                     urlParameters.add(new BasicNameValuePair(key,map.get(key).toString()));
            	 }
                 HttpEntity params = new UrlEncodedFormEntity(urlParameters,"UTF-8");
                 httpPost.setEntity(params);
        	}
             response = httpClient.execute(httpPost, new BasicHttpContext());
            if (response.getStatusLine().getStatusCode() != 200) {
                System.out.println("request url failed, http code=" + response.getStatusLine().getStatusCode()
                                   + ", url=" + url);
                return null;
            }
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String resultStr = EntityUtils.toString(entity, "utf-8");
                JSONObject result = JSON.parseObject(resultStr);
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return null;
    }
	
}
