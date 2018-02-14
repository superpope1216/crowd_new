package com.wisedu.crowd.controller.yhgl.login;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisedu.crowd.common.code.DictionaryEnum;
import com.wisedu.crowd.common.code.HttpCodeEnum;
import com.wisedu.crowd.common.code.SmsMessageTempleateEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.SessionUser;
import com.wisedu.crowd.common.util.SessionUserUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.dto.Result;
import com.wisedu.crowd.entity.dictionary.DictionaryInfo;
import com.wisedu.crowd.entity.dictionary.XzqhInfo;
import com.wisedu.crowd.entity.yhgl.KfzxxInfo;
import com.wisedu.crowd.entity.yhgl.XqfxxInfo;
import com.wisedu.crowd.entity.yhgl.YhjbxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.YhjbxxInfoExtend;
import com.wisedu.crowd.service.dictionary.DictionaryService;
import com.wisedu.crowd.service.dictionary.XzqhInfoService;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.messages.SmsSendMessage;
import com.wisedu.crowd.service.yhgl.YhjbxxInfoService;

@Controller
@RequestMapping("register")
public class RegisterController extends BaseController{
	
	@Autowired
	private SmsSendMessage smsSendMessage;
	@Autowired
	@Qualifier("yhjbxxInfoService")
	private YhjbxxInfoService yhjbxxInfoService;
	
	@Autowired
	private DictionaryService  dictionaryService;
	

	@Autowired
	private XzqhInfoService   xzqhInfoService;
	/**
	 * 个人需求方注册
	 * @return
	 */
	@RequestMapping("demandPersonal")
	public String demandPersonal(Model model){
		List<DictionaryInfo> rangeList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_USER_RANGE);
		model.addAttribute("rangeList", rangeList);
		XzqhInfo  xzqhInfo=new XzqhInfo();
		xzqhInfo.setCc("1");
		List<XzqhInfo>  provinceList=xzqhInfoService.selectByCondition(xzqhInfo);
		model.addAttribute("provinceList", provinceList);
		xzqhInfo.setCc("2");
		List<XzqhInfo>  cityList=xzqhInfoService.selectByCondition(xzqhInfo);
		model.addAttribute("cityList", cityList);
		xzqhInfo.setCc("3");
		List<XzqhInfo>  areaList=xzqhInfoService.selectByCondition(xzqhInfo);
		model.addAttribute("areaList", areaList);
		return "yhgl/register/demandPersonal";
	}
	/**
	 * 企业需求方注册
	 * @return
	 */
	@RequestMapping("demandEnterprise")
	public String demandEnterprise(Model model){
		List<DictionaryInfo> rangeList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_USER_RANGE);
		model.addAttribute("rangeList", rangeList);
		XzqhInfo  xzqhInfo=new XzqhInfo();
		xzqhInfo.setCc("1");
		List<XzqhInfo>  provinceList=xzqhInfoService.selectByCondition(xzqhInfo);
		model.addAttribute("provinceList", provinceList);
		xzqhInfo.setCc("2");
		List<XzqhInfo>  cityList=xzqhInfoService.selectByCondition(xzqhInfo);
		model.addAttribute("cityList", cityList);
		xzqhInfo.setCc("3");
		List<XzqhInfo>  areaList=xzqhInfoService.selectByCondition(xzqhInfo);
		model.addAttribute("areaList", areaList);
		return "yhgl/register/demandEnterprise";
	}
	/**
	 * 个人开发方注册
	 * @return
	 */
	@RequestMapping("developerPersonal")
	public String developerPersonal(Model model){
		List<DictionaryInfo> booleanList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_BOOLEAN);
		model.addAttribute("booleanList", booleanList);
		List<DictionaryInfo> gzxzList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_GZXZ);
		model.addAttribute("gzxzList", gzxzList);
		List<DictionaryInfo> gzlxList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_KFZGZLX);
		model.addAttribute("gzlxList", gzlxList);
		List<DictionaryInfo> scjsList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_KFZSCJS);
		model.addAttribute("scjsList", scjsList);
		List<DictionaryInfo> gznxList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_KFZGZNX);
		model.addAttribute("gznxList", gznxList);
		List<DictionaryInfo> rangeList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_USER_RANGE);
		model.addAttribute("rangeList", rangeList);
		List<DictionaryInfo> kxsjList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_KFZKXSJ);
		model.addAttribute("kxsjList", kxsjList);
		List<DictionaryInfo> rwxs=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_RWXS);
		model.addAttribute("rwxsList", rwxs);
		List<DictionaryInfo> rwkfkj=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_RWKFKJ);
		model.addAttribute("rwkfkjList",rwkfkj);
		
		XzqhInfo  xzqhInfo=new XzqhInfo();
		xzqhInfo.setCc("1");
		List<XzqhInfo>  provinceList=xzqhInfoService.selectByCondition(xzqhInfo);
		model.addAttribute("provinceList", provinceList);
		xzqhInfo.setCc("2");
		List<XzqhInfo>  cityList=xzqhInfoService.selectByCondition(xzqhInfo);
		model.addAttribute("cityList", cityList);
		xzqhInfo.setCc("3");
		List<XzqhInfo>  areaList=xzqhInfoService.selectByCondition(xzqhInfo);
		model.addAttribute("areaList", areaList);
		return "yhgl/register/developerPersonal";
	}
    /**
     * 企业开发方注册
     * @return
     */
	@RequestMapping("developerEnterprise")
	public String developerEnterprise(Model model){
		List<DictionaryInfo> booleanList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_BOOLEAN);
		model.addAttribute("booleanList", booleanList);
		List<DictionaryInfo> gzxzList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_GZXZ);
		model.addAttribute("gzxzList", gzxzList);
		List<DictionaryInfo> gzlxList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_KFZGZLX);
		model.addAttribute("gzlxList", gzlxList);
		List<DictionaryInfo> scjsList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_KFZSCJS);
		model.addAttribute("scjsList", scjsList);
		List<DictionaryInfo> gznxList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_KFZGZNX);
		model.addAttribute("gznxList", gznxList);
		List<DictionaryInfo> rangeList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_USER_RANGE);
		model.addAttribute("rangeList", rangeList);
		List<DictionaryInfo> kxsjList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_KFZKXSJ);
		model.addAttribute("kxsjList", kxsjList);
		List<DictionaryInfo> rwxs=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_RWXS);
		model.addAttribute("rwxsList", rwxs);
		List<DictionaryInfo> rwkfkj=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_RWKFKJ);
		model.addAttribute("rwkfkjList",rwkfkj);
		
		XzqhInfo  xzqhInfo=new XzqhInfo();
		xzqhInfo.setCc("1");
		List<XzqhInfo>  provinceList=xzqhInfoService.selectByCondition(xzqhInfo);
		model.addAttribute("provinceList", provinceList);
		xzqhInfo.setCc("2");
		List<XzqhInfo>  cityList=xzqhInfoService.selectByCondition(xzqhInfo);
		model.addAttribute("cityList", cityList);
		xzqhInfo.setCc("3");
		List<XzqhInfo>  areaList=xzqhInfoService.selectByCondition(xzqhInfo);
		model.addAttribute("areaList", areaList);
		return "yhgl/register/developerEnterprise";
	}
	
	
	@RequestMapping("index")
	public String index(){
		return "yhgl/login/register";
	}
	
	@RequestMapping("sendVerification")
	@ResponseBody
	public DataResult<Integer> sendVerification(@RequestParam String phone,HttpServletRequest request) throws Exception{
		if(StringUtil.isEmpty(phone)){
			throw new ServiceException("手机号不能为空，请输入！");
		}
		String verification=StringUtil.radomString(4);
		
		//判断手机号是否存在
		YhjbxxInfoExtend  yhjbxxInfo=new YhjbxxInfoExtend();
		yhjbxxInfo.setSjh(phone);
		List<YhjbxxInfoExtend> list=yhjbxxInfoService.selectByCondition(yhjbxxInfo);
		if(CommonUtil.isNotEmptyList(list)){
			throw new ServiceException(HttpCodeEnum.EXIST_PHONE.getCode(),HttpCodeEnum.EXIST_PHONE.getName());
        }
		try{
		String content=SmsMessageTempleateEnum.TITLE.getName()+String.format(SmsMessageTempleateEnum.REGISTER.getName(), verification);
		smsSendMessage.sendMessage(phone, content);
		}catch(Exception e){
			throw new ServiceException("发送失败");
		}
		SessionUser sessionUser=new SessionUser(phone, verification, new Date());
		request.getSession().setAttribute(ConstantsUtil.PHONE_VERIFICATION, sessionUser);
		return DataResult.success(1);
	}
	@ResponseBody
	@RequestMapping("register")
	public DataResult<Integer> register(YhjbxxInfoExtend yhjbxxInfo,String confirmYhmm,String yzm,HttpServletRequest request) throws Exception{
		if(StringUtil.isEmpty(yzm)){
			throw new ServiceException("验证码不能为空，请重新输入！");
		}
		/*if(!validateCaptchaCode(request,yhjbxxInfo.getSjh(),yzm))
		{
			throw new ServiceException("验证码错误，请重新输入！");
		}*/
		yhjbxxInfo=yhjbxxInfoService.register(yhjbxxInfo, confirmYhmm,this.createCustomOperateLog());
		request.getSession(true).setAttribute(ConstantsUtil.SESSION_YHJBXX, yhjbxxInfo);
		return DataResult.success(1);
	}
	
	
	 private boolean validateCaptchaCode(HttpServletRequest request, String username, String captchaCode) {
			return SessionUserUtil.validateCaptchaCode(request,ConstantsUtil.PHONE_VERIFICATION, captchaCode);
		}
	 
	 
	 

		/**
		 * 需求方 注册
		 * @param yhjbxxInfo
		 * @param confirmYhmm
		 * @param yzm
		 * @param request
		 * @return
		 * @throws Exception
		 */
		@ResponseBody
		@RequestMapping("demandRegister")
		public DataResult<Integer> demandRegister(YhjbxxInfoExtend yhjbxxInfo,String confirmYhmm,String yzm,XqfxxInfo record,HttpServletRequest request) throws Exception{
			if(StringUtil.isEmpty(yzm)){
			  throw new ServiceException(HttpCodeEnum.NULL_CAPTCHACODE.getCode(),HttpCodeEnum.NULL_CAPTCHACODE.getName());
	        }
		    if(!validateCaptchaCode(request,yhjbxxInfo.getSjh(),yzm)){
			  throw new ServiceException(HttpCodeEnum.ERROR_CAPTCHACODE.getCode(),HttpCodeEnum.ERROR_CAPTCHACODE.getName());
             }
			yhjbxxInfo=yhjbxxInfoService.demandRegister(yhjbxxInfo, confirmYhmm,record,this.createCustomOperateLog());
			request.getSession(true).setAttribute(ConstantsUtil.SESSION_YHJBXX, yhjbxxInfo);
			return DataResult.success(1);
		}
		
		/**
		 * 开发方注册
		 * @param yhjbxxInfo
		 * @param confirmYhmm
		 * @param yzm
		 * @param record
		 * @param request
		 * @return
		 * @throws Exception
		 */
		@ResponseBody
		@RequestMapping("developerRegister")
		public DataResult<Integer> developerRegister(YhjbxxInfoExtend yhjbxxInfo,String confirmYhmm,String yzm,KfzxxInfo record,HttpServletRequest request) throws Exception{
			if(StringUtil.isEmpty(yzm)){
			  throw new ServiceException(HttpCodeEnum.NULL_CAPTCHACODE.getCode(),HttpCodeEnum.NULL_CAPTCHACODE.getName());
	        }
		    if(!validateCaptchaCode(request,yhjbxxInfo.getSjh(),yzm)){
			  throw new ServiceException(HttpCodeEnum.ERROR_CAPTCHACODE.getCode(),HttpCodeEnum.ERROR_CAPTCHACODE.getName());
             }
			yhjbxxInfo=yhjbxxInfoService.developerRegister(yhjbxxInfo, confirmYhmm,record,this.createCustomOperateLog());
			request.getSession(true).setAttribute(ConstantsUtil.SESSION_YHJBXX, yhjbxxInfo);
			return DataResult.success(1);
		}
	
}
