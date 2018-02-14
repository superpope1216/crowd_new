package com.wisedu.crowd.webSocket;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.entity.yhgl.YhjbxxInfo;

public class WebSocketInterceptor implements HandshakeInterceptor {

	@Override
	public void afterHandshake(ServerHttpRequest arg0, ServerHttpResponse arg1, WebSocketHandler arg2, Exception arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler arg2,
			Map<String, Object> map) throws Exception {
		 if (request instanceof ServletServerHttpRequest) {
	            ServletServerHttpRequest serverHttpRequest = (ServletServerHttpRequest) request;
	            HttpSession session = serverHttpRequest.getServletRequest().getSession();
//	            Map parameterMap = serverHttpRequest.getServletRequest().getParameterMap();
//	            System.out.println(parameterMap);
	            if (session != null) {
	            	YhjbxxInfo yhjbxxInfo=(YhjbxxInfo)session.getAttribute(ConstantsUtil.SESSION_YHJBXX);
	            	if(yhjbxxInfo!=null){
	            		map.put(ConstantsUtil.SESSION_YHJBXX_ID, yhjbxxInfo.getWid());
	            		
	            	}else{
	            		return false;
	            	}
	                
	            }else{
	            	return false;
	            }

	        }
	        return true;
	}
	
}
