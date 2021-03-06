package com.wisedu.crowd.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.alibaba.fastjson.JSONObject;
import com.wisedu.crowd.common.code.HttpCodeEnum;
import com.wisedu.crowd.common.code.YhxxShztEnum;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.entity.yhgl.extend.XqfxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public class AuthIsXqfInteceptor  extends HandlerInterceptorAdapter{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        
    	if(!(handler instanceof HandlerMethod)){
    		return true;
    	}
        HandlerMethod methodHandler=(HandlerMethod) handler;
        AuthIsXqfAnnotation auth=methodHandler.getMethodAnnotation(AuthIsXqfAnnotation.class);
        if(auth==null){
        	return true;
        }
        //如果方法中添加了@AuthCheckAnnotation 这里的auth不为null
        //如果@AuthCheckAnnotation(check=false) 这里的auth为false,即不用进行拦截验证，@AuthCheckAnnotation默认为前面定义的true　　
        if(auth!=null&&!auth.check()){
           return true;  
        }
        int errCode=-1;
        if(!checkLogin(methodHandler,request)){
        	errCode=HttpCodeEnum.NOT_LOGIN.getCode();
        	 if (request.getHeader("Accept").contains("application/json")){
             	response.getWriter().append(JSONObject.toJSONString(DataResult.error(errCode,"")));
             }else{
            	 response.sendRedirect(request.getContextPath()+"/error/index?errorCode="+errCode);
             }
        	return false;
        }
        Object kfzxxObject=request.getSession().getAttribute(ConstantsUtil.SESSION_XQFXX);
        if(kfzxxObject!=null){
        	XqfxxInfoExtend kfzxxInfoExtend=(XqfxxInfoExtend)kfzxxObject;
    		if(kfzxxInfoExtend.getShzt().equals(YhxxShztEnum.CG.getCode())){
    			errCode=HttpCodeEnum.IS_NOT_XQF.getCode();
    		}else if(kfzxxInfoExtend.getShzt().equals(YhxxShztEnum.DSH.getCode())){
    			errCode=HttpCodeEnum.XQF_SFRZ_PASSING.getCode();
    		}else if(kfzxxInfoExtend.getShzt().equals(YhxxShztEnum.WTG.getCode())){
    			errCode=HttpCodeEnum.XQF_SFRZ_NOT_PASS.getCode();
    		}else if(kfzxxInfoExtend.getShzt().equals(YhxxShztEnum.YTG.getCode())){
    			return true;
    		}
    	}else{
    		errCode=HttpCodeEnum.IS_NOT_XQF.getCode();
    	}
        if (request.getHeader("Accept").contains("application/json")){
        	response.getWriter().append(JSONObject.toJSONString(DataResult.error(errCode,"")));
        }else{
        	response.sendRedirect(request.getContextPath()+"/error/index?errorCode="+errCode);
        }
        return false;
    }
    
    private boolean checkLogin(HandlerMethod methodHandler,HttpServletRequest request){
		  
	        	if (request.getSession().getAttribute(ConstantsUtil.SESSION_YHJBXX) != null) {
	    			return true;
	    		}else{
	    			return false;
	    		}
	}
}