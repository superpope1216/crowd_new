package com.wisedu.crowd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.alibaba.fastjson.JSONObject;
import com.wisedu.crowd.common.code.NwbEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.train.extend.TrainStudentInfoExtend;
import com.wisedu.crowd.entity.yhgl.YhjbxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.KfzxxInfoExtend;
import com.wisedu.crowd.entity.yhgl.extend.XqfxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.yhgl.KfzxxInfoService;
import com.wisedu.crowd.service.yhgl.XqfxxInfoService;

public class BaseController {
		private static final Logger LOG = LoggerFactory.getLogger(BaseController.class);

	    @Autowired
	    protected  HttpServletRequest request;
	    
	    @Autowired
	    private KfzxxInfoService kfzxxInfoService;
	    @Autowired
	    private XqfxxInfoService xqfxxInfoService;
	    @ExceptionHandler(Exception.class)
	    public void exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception)
	            throws IOException, ServletException {
	    	LOG.error("============="+request.getRequestURI(), exception);
	        if (request.getHeader("Accept").contains("application/json")) {
	            response.setCharacterEncoding("UTF-8");
	            response.setContentType("application/json;charset=UTF-8");
	            if (exception instanceof ServiceException) {
	            	request.getRequestURI();
	            	ServiceException serviceException=(ServiceException)exception;
	            	
	                response.getWriter().append(JSONObject.toJSONString(DataResult.error(serviceException.getCode(),serviceException.getMessage())));
	            } else {
	                response.getWriter().append(JSONObject.toJSONString(DataResult.error()));
	            }
	            response.getWriter().flush();
	            response.getWriter().close();
	        } else {
	            String url = "/error/index";
	            response.setCharacterEncoding("UTF-8");
	            response.setContentType("text/html;charset=UTF-8");
	            response.sendRedirect(request.getContextPath() + url);
	        }
	    }
	    public CustomOperateLog createCustomOperateLog() throws Exception{
	        CustomOperateLog customOperateLog=new CustomOperateLog();
	        customOperateLog.setCustomIp(getRemoteHost());
	        customOperateLog.setDateTime(DateUtil.getCurrentDateTimeStr());
	        //customOperateLog.setRegisterId(this.getRegisterId());
	        customOperateLog.setUserId(this.getYhId());
	        customOperateLog.setKfzxxInfo(this.getKfzxx());
	        customOperateLog.setXqfxxInfo(this.getXqfxx());
	        customOperateLog.setXqfId(this.getXqfxx()!=null?this.getXqfxx().getWid():null);
	        customOperateLog.setKfzId(this.getKfzxx()!=null?this.getKfzxx().getWid():null);
	        customOperateLog.setXm((this.getXqfxx()!=null?this.getXqfxx().getXm():(this.getKfzxx()!=null?this.getKfzxx().getXm():this.getSjh())));
	        //customOperateLog.setUserId(this.getUserId());
	        customOperateLog.setRegisterId(this.getYhId());
	        customOperateLog.setSjh(this.getSjh());
	        return customOperateLog;
	    }

	    public  String getRemoteHost() {
	        String ip = request.getHeader("x-forwarded-for");
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	            ip = request.getHeader("Proxy-Client-IP");
	        }
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	            ip = request.getHeader("WL-Proxy-Client-IP");
	        }
	        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	            ip = request.getRemoteAddr();
	        }
	        return ip.equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : ip;
	    }
	    
	    public YhjbxxInfo getYhjbxx() {
	    	if(request.getSession().getAttribute(ConstantsUtil.SESSION_YHJBXX)!=null){
	    		return (YhjbxxInfo)request.getSession().getAttribute(ConstantsUtil.SESSION_YHJBXX);
	    	}
	        return null;
	    }
	    
	    
	    public String getYhId(){
	    	YhjbxxInfo yhjbxx=this.getYhjbxx();
	    	if(yhjbxx!=null){
	    		return yhjbxx.getWid();
	    	}
	    	return "";
	    }
	    
	    public KfzxxInfoExtend getKfzxx(){
	    	Object kfzxxObject=request.getSession().getAttribute(ConstantsUtil.SESSION_KFZXX);
	    	if(kfzxxObject!=null){
	    		return (KfzxxInfoExtend)kfzxxObject;
	    	}
	    	return null;
	    }
	    
	    public XqfxxInfoExtend getXqfxx(){
	    	Object xqfxxObject=request.getSession().getAttribute(ConstantsUtil.SESSION_XQFXX);
	    	if(xqfxxObject!=null){
	    		return (XqfxxInfoExtend)xqfxxObject;
	    	}
	    	return null;
	    }
	    
	    public TrainStudentInfoExtend getXyxx(){
	        Object xyxxObject=request.getSession().getAttribute(ConstantsUtil.SESSION_XYXX);
	        if(xyxxObject!=null){
	            return (TrainStudentInfoExtend)xyxxObject;
	        }
	        return null;
	    }
	    
	    public boolean isKfz(){
	    	Object isKfzObject=request.getSession().getAttribute(ConstantsUtil.IS_KFZ);
	    	if(isKfzObject!=null){
	    		return (boolean)isKfzObject;
	    	}
	    	return false;
	    }
	    
	    public boolean isXy(){
	        Object siXyObject=request.getSession().getAttribute(ConstantsUtil.IS_XY);
            if(siXyObject!=null){
                return (boolean)siXyObject;
            }
            return false;
	    }
	    
	    /**
	     * 是否是内部开发者
	     * @return
	     */
	    public boolean isNbkfz(){
	    	Object kfzxxObject=request.getSession().getAttribute(ConstantsUtil.SESSION_KFZXX);
	    	if(kfzxxObject!=null){
	    		KfzxxInfoExtend kfzxxInfo= (KfzxxInfoExtend)kfzxxObject;
	    		if(kfzxxInfo.getKfzlb().equals(NwbEnum.NB.getCode())){
	    			return false;
	    		}
	    	}
	    	return true;
	    }
	    
	    
	    
	    public boolean isXqf(){
	    	Object isXqfObject=request.getSession().getAttribute(ConstantsUtil.IS_XQF);
	    	if(isXqfObject!=null){
	    		return (boolean)isXqfObject;
	    	}
	    	return false;
	    }
	    
	    public String getSjh(){
	    	YhjbxxInfo yhjbxx=this.getYhjbxx();
	    	if(yhjbxx!=null){
	    		return yhjbxx.getSjh();
	    	}
	    	return "";
	    }
	    
	  
		
}
