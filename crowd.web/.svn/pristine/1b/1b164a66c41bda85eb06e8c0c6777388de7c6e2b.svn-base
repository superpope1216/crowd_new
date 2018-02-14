package com.wisedu.crowd.controller.yhgl.login;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.util.StringUtils;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.dto.Result;
import com.wisedu.crowd.entity.yhgl.extend.YhjbxxInfoExtend;
import com.wisedu.crowd.interceptor.AuthLoginAnnotation;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.yhgl.YhjbxxInfoService;
import javax.servlet.http.Cookie;


@Controller
@RequestMapping("login")
public class LoginController extends BaseController{
	@Autowired
	private YhjbxxInfoService yhjbxxInfoService;
	@RequestMapping("index")
	public ModelAndView index(String backurl){
		ModelAndView mv=new ModelAndView();
		mv.addObject("backurl", backurl);
		mv.setViewName("yhgl/login/login");
		return mv;
	}
	
	@RequestMapping("login")
	@ResponseBody
	public DataResult<Integer> login(@RequestParam String username,@RequestParam String password,String backurl,HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataResult<YhjbxxInfoExtend> yhjbxxInfoExtend=yhjbxxInfoService.login(username, password, this.createCustomOperateLog());
		request.getSession(true).invalidate();
		request.getSession().setAttribute(ConstantsUtil.SESSION_YHJBXX, yhjbxxInfoExtend.getDatas());
		return DataResult.success(1);
	}
	@AuthLoginAnnotation
	@RequestMapping("logout")
	public void logout(HttpServletRequest request,HttpServletResponse response) throws IOException{
		request.getSession().invalidate();
		
		//清楚cookies
		   Cookie[] cookies = request.getCookies();
           if(!StringUtil.isEmpty(cookies)&&cookies.length>0){
                 for(Cookie cookie : cookies){
                     Cookie tempcookie = new Cookie(cookie.getName(), null);
                     tempcookie.setMaxAge(0);
                     tempcookie.setDomain("campusphere.cn");
	                 tempcookie.setPath("/");
                     response.addCookie(tempcookie);
                 }
           }
		response.sendRedirect(request.getContextPath()+"/index.jsp");
	}
}
