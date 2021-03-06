package com.wisedu.crowd.controller.kfzxx;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wisedu.crowd.common.code.DictionaryEnum;
import com.wisedu.crowd.common.code.RwcfxxZtEnum;
import com.wisedu.crowd.common.code.XtcsEnum;
import com.wisedu.crowd.common.code.YesNoEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.DecimalUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dictionary.DictionaryInfo;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.rwgl.extend.RwcfxxInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.xtgl.extend.XtcsbInfoExtend;
import com.wisedu.crowd.interceptor.AuthIsKfzAnnotation;
import com.wisedu.crowd.interceptor.AuthKfzAnnotation;
import com.wisedu.crowd.service.dictionary.DictionaryService;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rwgl.RwcfxxInfoService;
import com.wisedu.crowd.service.xtgl.XtcsbInfoService;

@Controller
@RequestMapping("kfzCfOrder")
public class KfzCfOrderController extends BaseController{

	@Autowired
	private XtcsbInfoService xtcsbInfoService; 
	@Autowired
	private RwcfxxInfoService rwcfxxInfoService;
	
	@Autowired
	private DictionaryService  dictionaryService;
	
	@RequestMapping("index")
	@AuthKfzAnnotation
	public ModelAndView index() throws Exception{
		ModelAndView mv=new ModelAndView();
		RwcfxxInfoExtend queryRwcfxxInfoExtend=new RwcfxxInfoExtend();
		queryRwcfxxInfoExtend.setKfzid(this.getKfzxx().getWid());
		queryRwcfxxInfoExtend.setRwzt(StringUtil.toShort(RwcfxxZtEnum.DQE.getCode()));
		mv.addObject("dqr", rwcfxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwcfxxInfoExtend), this.createCustomOperateLog()).getDatas());
		queryRwcfxxInfoExtend.setRwzt(StringUtil.toShort(RwcfxxZtEnum.KFZ.getCode()));
		mv.addObject("kfz", rwcfxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwcfxxInfoExtend), this.createCustomOperateLog()).getDatas());
	
		queryRwcfxxInfoExtend.setRwzt(StringUtil.toShort(RwcfxxZtEnum.DYS.getCode()));
		mv.addObject("dys", rwcfxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwcfxxInfoExtend), this.createCustomOperateLog()).getDatas());
	
		queryRwcfxxInfoExtend.setRwzt(StringUtil.toShort(RwcfxxZtEnum.YWC.getCode()));
		mv.addObject("ywc", rwcfxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwcfxxInfoExtend), this.createCustomOperateLog()).getDatas());
	
		queryRwcfxxInfoExtend.setRwzt(StringUtil.toShort(RwcfxxZtEnum.YJJ.getCode()));
		mv.addObject("yjj", rwcfxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwcfxxInfoExtend), this.createCustomOperateLog()).getDatas());
	
		queryRwcfxxInfoExtend.setRwzt(StringUtil.toShort(RwcfxxZtEnum.YSBTG.getCode()));
		mv.addObject("yswtg", rwcfxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwcfxxInfoExtend), this.createCustomOperateLog()).getDatas());
	
		List<DictionaryInfo> sjdList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_SJD);
		mv.addObject("sjdList", sjdList);
		
		mv.setViewName("kfzgl/rwgl/cf_order");
		return mv;
	}
	@RequestMapping("queryOrders")
	@AuthKfzAnnotation
	@ResponseBody
	public DataResult<List<RwcfxxInfoExtend>> queryOrders(String state,Integer pageNum,Integer pageSize,String serchCondition) throws Exception{
		RwcfxxInfoExtend queryRwcfxxInfoExtend=new RwcfxxInfoExtend();
		queryRwcfxxInfoExtend.setRwzt(StringUtil.toShort(state));
		queryRwcfxxInfoExtend.setNeedRwjbxx(true);
		queryRwcfxxInfoExtend.setKfzid(this.getKfzxx().getWid());
		if(!StringUtil.isEmpty(serchCondition)){
			queryRwcfxxInfoExtend.setCondition(serchCondition);
		}
		QueryCondition<RwcfxxInfoExtend> condition=ConditionUtil.createCondition(queryRwcfxxInfoExtend);
		PageInfo pageInfo=new PageInfo();
		if(pageNum!=null){
			pageInfo.setPageNum(pageNum);
		}
		if(pageSize!=null){
			pageInfo.setPageSize(pageSize);
		}
		condition.setPageInfo(pageInfo);
		XtcsbInfoExtend xtcsbInfoExtend=new XtcsbInfoExtend();
		xtcsbInfoExtend.setCsmc(XtcsEnum.RWCS_SQBL.getCode());
		DataResult<List<XtcsbInfoExtend>> rwcsSqblDatas=xtcsbInfoService.selectByCondition(xtcsbInfoExtend);
		DataResult<List<RwcfxxInfoExtend>> datas=rwcfxxInfoService.selectByCondition(condition, this.createCustomOperateLog());
		if(CommonUtil.isNotEmptyList(datas.getDatas())){
			for(RwcfxxInfoExtend rwcfxxInfoExtend:datas.getDatas()){
				if(rwcfxxInfoExtend.getSfsqfy().equals(YesNoEnum.YES.getCode())){
					BigDecimal je=DecimalUtil.div(DecimalUtil.mul(rwcfxxInfoExtend.getRwjg(),DecimalUtil.toDecimal(rwcsSqblDatas.getDatas().get(0).getCsz())),DecimalUtil.toDecimal("100"));
					rwcfxxInfoExtend.setRwjg(DecimalUtil.sub(rwcfxxInfoExtend.getRwjg(),je));
				}
			}
		}
		return datas;
	}
	@RequestMapping("accept")
	@AuthIsKfzAnnotation
	@ResponseBody
	public DataResult<Integer> accept(String wid,String sfjs) throws Exception{
		return rwcfxxInfoService.accept(wid, sfjs, this.createCustomOperateLog());
	}
	@RequestMapping("applyAccept")
	@AuthIsKfzAnnotation
	@ResponseBody
	public DataResult<Integer> applyAccept(String wid) throws Exception{
		return rwcfxxInfoService.applyAccept(wid, this.createCustomOperateLog());
	}
	
	
}
