package com.wisedu.crowd.controller.kfzxx;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisedu.crowd.common.code.JsztEnum;
import com.wisedu.crowd.common.code.RwztStateEnum;
import com.wisedu.crowd.common.code.SzlbEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.cwgl.extend.KfzzhmxInfoExtend;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.yhgl.extend.KfzxxInfoExtend;
import com.wisedu.crowd.interceptor.AuthKfzAnnotation;
import com.wisedu.crowd.service.cwgl.KfzzhmxInfoService;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.yhgl.KfzxxInfoService;

@Controller
@RequestMapping("kfzxx")
public class PersonController extends BaseController{

	
	@Autowired
	private KfzxxInfoService kfzxxInfoService;
	@Autowired
	private KfzzhmxInfoService kfzzhmxInfoService;
	
	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	@RequestMapping("index")
	@AuthKfzAnnotation
	public String index(Model model) throws Exception{
		
		KfzxxInfoExtend kfzxxInfoExtend=new KfzxxInfoExtend();
		
		if(!StringUtil.isEmpty(this.getYhId())){
			kfzxxInfoExtend.setYhid(this.getYhId());
			QueryCondition<KfzxxInfoExtend> condition=new QueryCondition<>();
			PageInfo page=PageUtil.cratePageInfo(null, null);
			condition.setPageInfo(page);
			condition.setQuery(kfzxxInfoExtend);
			DataResult<List<KfzxxInfoExtend>> result=kfzxxInfoService.selectByCondition(condition,this.createCustomOperateLog());
			if(CommonUtil.isNotEmptyList(result.getDatas())){
				System.out.println("==========="+result.getDatas().get(0).getKfzlb());
			model.addAttribute("kfzxx", result.getDatas().get(0));
		 }
		}
		return "/kfzgl/kfzxx/index";
	}
	@RequestMapping("queryTotal")
	@AuthKfzAnnotation
	@ResponseBody
	public DataResult<Double> queryTotal() throws Exception{
		KfzzhmxInfoExtend queryKfzzhmxInfoExtend=new KfzzhmxInfoExtend();
		queryKfzzhmxInfoExtend.setSzlbid(SzlbEnum.XMSR.getCode());
		queryKfzzhmxInfoExtend.setKfzid(this.getKfzxx().getWid());
		return kfzzhmxInfoService.selectTotalMoney(ConditionUtil.createCondition(queryKfzzhmxInfoExtend), this.createCustomOperateLog());	
	}
	@RequestMapping("queryMonthTotal")
	@AuthKfzAnnotation
	@ResponseBody
	public DataResult<Double> queryMonthTotal() throws Exception{
		KfzzhmxInfoExtend queryKfzzhmxInfoExtend=new KfzzhmxInfoExtend();
		queryKfzzhmxInfoExtend.setSzlbid(SzlbEnum.XMSR.getCode());
		queryKfzzhmxInfoExtend.setKfzid(this.getKfzxx().getWid());
		queryKfzzhmxInfoExtend.setMinMonth(DateUtil.getCurrentMonthStr());
		queryKfzzhmxInfoExtend.setMaxMonth(DateUtil.getCurrentMonthStr());
		return kfzzhmxInfoService.selectTotalMoney(ConditionUtil.createCondition(queryKfzzhmxInfoExtend), this.createCustomOperateLog());	
	}
	@RequestMapping("queryDzfTotal")
	@AuthKfzAnnotation
	@ResponseBody
	public DataResult<Double> queryDzfTotal() throws Exception{
		KfzzhmxInfoExtend queryKfzzhmxInfoExtend=new KfzzhmxInfoExtend();
		queryKfzzhmxInfoExtend.setSzlbid(SzlbEnum.TX.getCode());
		queryKfzzhmxInfoExtend.setKfzid(this.getKfzxx().getWid());
		queryKfzzhmxInfoExtend.setJszt(StringUtil.toShort(JsztEnum.DZF.getCode()));
		return kfzzhmxInfoService.selectTotalMoney(ConditionUtil.createCondition(queryKfzzhmxInfoExtend), this.createCustomOperateLog());
	}
	@RequestMapping("queryKfzTotal")
	@AuthKfzAnnotation
	@ResponseBody
	public DataResult<Integer> queryKfzTotal() throws Exception{
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.KFZ.getCode());
		queryRwjbxxInfoExtend.setKfzid(this.getKfzxx().getWid());
		return rwjbxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend), this.createCustomOperateLog());
	}
	
	@RequestMapping("queryDsqjcTotal")
	@AuthKfzAnnotation
	@ResponseBody
	public DataResult<Integer> queryDsqjcTotal() throws Exception{
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.JCBTG.getCode());
		queryRwjbxxInfoExtend.setKfzid(this.getKfzxx().getWid());
		return rwjbxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend), this.createCustomOperateLog());
	}
	
	@RequestMapping("queryDsqysTotal")
	@AuthKfzAnnotation
	@ResponseBody
	public DataResult<Integer> queryDsqysTotal() throws Exception{
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.YSBTG.getCode());
		queryRwjbxxInfoExtend.setKfzid(this.getKfzxx().getWid());
		return rwjbxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend), this.createCustomOperateLog());
	}
	
	@RequestMapping("queryDsqshTotal")
	@AuthKfzAnnotation
	@ResponseBody
	public DataResult<Integer> queryDsqshTotal() throws Exception{
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.SHBTG.getCode());
		queryRwjbxxInfoExtend.setKfzid(this.getKfzxx().getWid());
		return rwjbxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend), this.createCustomOperateLog());
	}
}
