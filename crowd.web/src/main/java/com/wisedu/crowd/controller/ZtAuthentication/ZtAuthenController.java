package com.wisedu.crowd.controller.ZtAuthentication;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;

/**
 *  知途认证 操作类 
 * @author 11651
 *
 */
@Controller
@RequestMapping(value="ztAuthen")
public class ZtAuthenController extends BaseController{
	
	private static final Logger LOG=LoggerFactory.getLogger(ZtAuthenController.class);
	
	@RequestMapping("index")
	public void index(String redirectUrl,HttpServletRequest request,HttpServletResponse response) throws IOException{
		LOG.info("--知途对接认证 ---");
		if(StringUtil.isEmpty(this.getYhId())){
			System.out.println("用户未登录");
			String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() +  request.getContextPath() + "/";
			System.out.println("进入首页  "+basePath);
            response.sendRedirect(basePath+"login/index");
            return;
		}
		 Cookie[] cookies = request.getCookies();
		 String isLogin="0";
		 String crowdUserId="";
		 if(!StringUtil.isEmpty(this.getYhId())){
			  isLogin="1";
			  crowdUserId=this.getYhjbxx().getSjh();
		 }
		 Cookie isLoginCookie=new Cookie("isLogin",isLogin); 
		 Cookie redirectUrlCookie=new Cookie("redirectUrl",redirectUrl); 
		 Cookie crowdUserIdCookie=new Cookie("crowdUserId",crowdUserId);
		 
		 
		 crowdUserIdCookie.setDomain("campusphere.cn");
		 redirectUrlCookie.setDomain("campusphere.cn");
		 isLoginCookie.setDomain("campusphere.cn");
		 isLoginCookie.setPath("/");
		 crowdUserIdCookie.setPath("/");
		 redirectUrlCookie.setPath("/");
		 response.addCookie(isLoginCookie);
		 response.addCookie(redirectUrlCookie);
		 response.addCookie(crowdUserIdCookie);
		 LOG.info("isLogin"+isLogin);
		 LOG.info("crowdUserId"+crowdUserId);
		 System.out.println("--传递的redirectUrl---"+redirectUrl);
		// redirectUrl=redirectUrl.replace("http://auth.campusphere.cn:9090/", "http://3w.campusphere.cn/authZtxt/");
         System.out.println("--replace之后的 url---"+redirectUrl);
		 response.sendRedirect(redirectUrl);
	//	 response.sendRedirect("http://172.16.6.13/test4/");
	}
	
}
