package com.wisedu.crowd.controller.yhgl.login;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisedu.crowd.common.code.HttpCodeEnum;
import com.wisedu.crowd.common.code.SmsMessageTempleateEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.common.util.SessionUser;
import com.wisedu.crowd.common.util.SessionUserUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;

import com.wisedu.crowd.entity.yhgl.extend.YhjbxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.messages.SmsSendMessage;
import com.wisedu.crowd.service.yhgl.YhjbxxInfoService;

@Controller
@RequestMapping("resetPwd")
public class ResetPwdController extends BaseController{
	
	/**
	 * 重置密码   忘记密码
	 */
	@Autowired
	private SmsSendMessage smsSendMessage;
	
	@Autowired
	private YhjbxxInfoService yhjbxxInfoService;
	

	/**
	 * 个人需求方注册
	 * @return
	 */
	@RequestMapping("index")
	public String resetPwd(Model model){
		return "yhgl/resetPwd/resetPwd";
	}
	/**
	 * 
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping("doResetPwd")
	public DataResult<Integer> doResetPwd(String yzm,String phone,String newPassword,String confirmPassword ){
		if(StringUtil.isEmpty(yzm)){
			  throw new ServiceException(HttpCodeEnum.NULL_CAPTCHACODE.getCode(),HttpCodeEnum.NULL_CAPTCHACODE.getName());
	        }
		    if(!validatePhoneCaptchaCode(request,phone,yzm)){
			  throw new ServiceException(HttpCodeEnum.ERROR_CAPTCHACODE.getCode(),HttpCodeEnum.ERROR_CAPTCHACODE.getName());
           }
		    yhjbxxInfoService.resetPwd(phone, newPassword, confirmPassword);
			return DataResult.success(1);
	}
	
	/**
	 *  忘记密码  发送验证码
	 * @param phone
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("sendVerification")
	@ResponseBody
	public DataResult<Integer> sendVerification(@RequestParam String phone,HttpServletRequest request) throws Exception{
		if(StringUtil.isEmpty(phone)){
			throw new ServiceException("手机号不能为空，请输入！");
		}
		String verification=StringUtil.radomString(4);
		
		//判断手机号是否存在   不存在异常
		YhjbxxInfoExtend  yhjbxxInfo=new YhjbxxInfoExtend();
		yhjbxxInfo.setSjh(phone);
		List<YhjbxxInfoExtend> list=yhjbxxInfoService.selectByCondition(yhjbxxInfo);
		if(CommonUtil.isEmptyList(list)){
			throw new ServiceException(HttpCodeEnum.NOT_EXIST_PHONE.getCode(),HttpCodeEnum.NOT_EXIST_PHONE.getName());
        }
		try{
		String content=SmsMessageTempleateEnum.TITLE.getName()+String.format(SmsMessageTempleateEnum.REGISTER.getName(), verification);
		smsSendMessage.sendMessage(phone, content);
		}catch(Exception e){
			e.printStackTrace();
			throw new ServiceException("发送失败");
		}
		SessionUser sessionUser=new SessionUser(phone, verification, new Date());
		request.getSession().setAttribute(ConstantsUtil.PHONE_VERIFICATION, sessionUser);
		return DataResult.success(1);
	}
	  
	 private boolean validatePhoneCaptchaCode(HttpServletRequest request, String username, String captchaCode) {
			return SessionUserUtil.validateCaptchaCode(request,ConstantsUtil.PHONE_VERIFICATION, captchaCode);
		}
}
