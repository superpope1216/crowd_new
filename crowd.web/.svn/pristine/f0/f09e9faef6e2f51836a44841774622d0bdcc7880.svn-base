package com.wisedu.crowd.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StringUtils;

import com.github.pagehelper.StringUtil;
import com.wisedu.crowd.common.util.CommonUtil;

public class XssFilter implements Filter{
	/**  
	    * 需要排除的页面  
	    */    
	    private String excludedPages;    
	        
	    private String[] excludedPageArray;   
	      
	    @SuppressWarnings("unused")  
	    private FilterConfig filterConfig;  
	  
	    public void destroy() {  
	        this.filterConfig = null;  
	    }  
	      
	    public void doFilter(ServletRequest request, ServletResponse response,  
	            FilterChain chain) throws IOException, ServletException {  
	          
	        boolean isExcludedPage = false;  
	          
	        HttpServletRequest request2 = (HttpServletRequest) request;  
	        String ctx_path = request2.getContextPath();  
	        String request_uri = request2.getRequestURI();  
	        String action = request_uri.substring(ctx_path.length());  
	          
	        //判断是否在过滤url之外   
	        if(excludedPageArray!=null){
	        	for (String page : excludedPageArray) {  
		            if (page.equals(action)) {  
		                isExcludedPage = true;   
		                break;  
		            }  
		        }  
	        }
	        
	          
	        if (isExcludedPage) {  
	            chain.doFilter(request, response);  
	        } else {  
	            chain.doFilter(new XssRequestWrapper(request2), response);  
	        }  
	          
	    }  
	      
	    /** 
	     * 自定义过滤规则 
	     */  
	    public void init(FilterConfig filterConfig) throws ServletException {  
	        this.filterConfig = filterConfig;  
	        excludedPages = filterConfig.getInitParameter("excludedPages");    
	        if (StringUtil.isNotEmpty(excludedPages)) {  
	            excludedPageArray = excludedPages.replaceAll("[\\s]", "").split(",");  
	        }  
	    }  
}
