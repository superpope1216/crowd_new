package com.wisedu.crowd.controller.xqfxx;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisedu.crowd.common.code.DictionaryEnum;
import com.wisedu.crowd.common.code.RwxsEnum;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dictionary.DictionaryInfo;
import com.wisedu.crowd.entity.dictionary.XzqhInfo;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.yhgl.extend.KfzxxInfoExtend;
import com.wisedu.crowd.entity.yhgl.extend.XqfxxInfoExtend;
import com.wisedu.crowd.interceptor.AuthLoginAnnotation;
import com.wisedu.crowd.interceptor.AuthXqfAnnotation;
import com.wisedu.crowd.service.dictionary.DictionaryService;
import com.wisedu.crowd.service.dictionary.XzqhInfoService;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.yhgl.XqfxxInfoService;

@Controller
@RequestMapping("xqfConfrim")
public class XqfConfirmController extends BaseController {
	

	
	@Autowired
	private DictionaryService  dictionaryService;
	
	@Autowired
	private XzqhInfoService   xzqhInfoService;
	
	@Autowired
	private XqfxxInfoService xqfxxInfoService;

	@RequestMapping("index")
	@AuthXqfAnnotation
	public String index(Model model){
		
		if(StringUtil.isEmpty(this.getXqfxx().getXm())||StringUtil.isEmpty(this.getXqfxx().getNc())){
			return "redirect:../xqfSupply/index";
		}
		
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
		return "xqfgl/xqfxx/confirm";
	}
	
	
	
	/**
	 *  确认页面或者注册页面     用户更新基本信息   
	 * @param xqfxxInfo
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("saveXqfxxBasicInfo")
	@AuthLoginAnnotation
	public DataResult<Integer> saveXqfxxBasicInfo(XqfxxInfoExtend xqfxxInfo) throws Exception{
		xqfxxInfo.setYhid(this.getYhId());
		if(!StringUtil.isEmpty(this.getXqfxx())&&!StringUtil.isEmpty(this.getXqfxx().getWid())){
			xqfxxInfo.setWid(this.getXqfxx().getWid());
		}
		DataResult<XqfxxInfoExtend> result=xqfxxInfoService.saveXqfxxBasicInfo(xqfxxInfo, this.createCustomOperateLog());
		return  DataResult.success(1);
	}
	

	/**
	 * 确认页面   用户更新认证信息
	 * @param xqfxxInfo
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("saveXqfxxCardInfo")
	@AuthLoginAnnotation
	public DataResult<Integer> saveXqfxxCardInfo(XqfxxInfoExtend xqfxxInfo) throws Exception{
		xqfxxInfo.setYhid(this.getYhId());
		if(!StringUtil.isEmpty(this.getXqfxx())&&!StringUtil.isEmpty(this.getXqfxx().getWid())){
			xqfxxInfo.setWid(this.getXqfxx().getWid());
		}
		xqfxxInfoService.saveXqfxxCardInfo(xqfxxInfo, this.createCustomOperateLog());
		return  DataResult.success(1);
	}
	
	
	
	/**
	 * 注册页面 更新开发者 认证信息
	 * @param xqfxxInfo
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("saveRegisterXqfxxCardInfo")
	@AuthLoginAnnotation
	public DataResult<Integer> saveRegisterXqfxxCardInfo(XqfxxInfoExtend xqfxxInfo) throws Exception{
		xqfxxInfo.setYhid(this.getYhId());
		if(!StringUtil.isEmpty(this.getXqfxx())&&!StringUtil.isEmpty(this.getXqfxx().getWid())){
			xqfxxInfo.setWid(this.getXqfxx().getWid());
		}
			xqfxxInfoService.saveXqfxxCardInfo(xqfxxInfo, this.createCustomOperateLog());
		XqfxxInfoExtend  xqfxxInfoExtend=new XqfxxInfoExtend();
		xqfxxInfoExtend.setYhid(this.getYhId());
		QueryCondition<XqfxxInfoExtend> condition=new QueryCondition<>();
		PageInfo page=PageUtil.cratePageInfo(null, null);
		condition.setPageInfo(page);
		condition.setQuery(xqfxxInfoExtend);
		DataResult<List<XqfxxInfoExtend>> result= xqfxxInfoService.selectByCondition(condition,createCustomOperateLog());
	    //更新session
	    request.getSession().setAttribute(ConstantsUtil.SESSION_XQFXX, result.getDatas().get(0));
	    return  DataResult.success(1);
	}
	
	
}
