package com.wisedu.crowd.controller.xqfxx;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wisedu.crowd.common.code.RwztStateEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.yhgl.extend.XqfxxInfoExtend;
import com.wisedu.crowd.interceptor.AuthXqfAnnotation;
import com.wisedu.crowd.service.cwgl.KfzzhmxInfoService;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.yhgl.XqfxxInfoService;

@Controller
@RequestMapping("xqfxx")
public class XqfxxController extends BaseController {
	
	
	@Autowired
	private XqfxxInfoService xqfxxInfoService;
	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	
	
	
	@RequestMapping("index")
	@AuthXqfAnnotation
	public ModelAndView index() throws Exception {
		ModelAndView mv=new ModelAndView();
		XqfxxInfoExtend  xqfxxInfoExtend=new XqfxxInfoExtend();
		QueryCondition<XqfxxInfoExtend> condition=new QueryCondition<>();
		if(!StringUtil.isEmpty(this.getYhId())){
			xqfxxInfoExtend.setYhid(this.getYhId());
			condition.setQuery(xqfxxInfoExtend);
			DataResult<List<XqfxxInfoExtend>> result= xqfxxInfoService.selectByCondition(condition,createCustomOperateLog());
			if(CommonUtil.isNotEmptyList(result.getDatas())){
				mv.addObject("xqfxx",result.getDatas().get(0));
			}	
		}
		
		
		mv.setViewName("xqfgl/xqfxx/index");
		return mv;
	}
	@ResponseBody
	@RequestMapping("queryDxb")
	@AuthXqfAnnotation
	public DataResult<Integer> queryDxb() throws Exception{
		return rwjbxxInfoService.selectCountHasTb(this.getXqfxx().getWid(), RwztStateEnum.ZBZ.getCode(), this.createCustomOperateLog());
	}
	
	@ResponseBody
	@RequestMapping("queryDys")
	@AuthXqfAnnotation
	public DataResult<Integer> queryDys() throws Exception{
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.YSZ.getCode());
		queryRwjbxxInfoExtend.setXqfid(this.getXqfxx().getWid());
		return rwjbxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend), this.createCustomOperateLog());
	}
	@ResponseBody
	@RequestMapping("queryShbtg")
	@AuthXqfAnnotation
	public DataResult<Integer> queryShbtg() throws Exception{
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.SHBTG.getCode());
		queryRwjbxxInfoExtend.setXqfid(this.getXqfxx().getWid());
		return rwjbxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend), this.createCustomOperateLog());
	}
	@ResponseBody
	@RequestMapping("queryDsh")
	@AuthXqfAnnotation
	public DataResult<Integer> queryDsh() throws Exception{
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.SHJSDQR.getCode());
		queryRwjbxxInfoExtend.setXqfid(this.getXqfxx().getWid());
		return rwjbxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend), this.createCustomOperateLog());
	}
	

	
}
