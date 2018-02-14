package com.wisedu.crowd.controller.xqfxx;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wisedu.crowd.common.code.DictionaryEnum;
import com.wisedu.crowd.common.code.SzlbEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.DecimalUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.cwgl.extend.XqfzhmxInfoExtend;
import com.wisedu.crowd.entity.dictionary.DictionaryInfo;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.yhgl.extend.XqfxxInfoExtend;
import com.wisedu.crowd.interceptor.AuthXqfAnnotation;
import com.wisedu.crowd.service.cwgl.XqfzhmxInfoService;
import com.wisedu.crowd.service.dictionary.DictionaryService;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.yhgl.XqfxxInfoService;

@Controller
@RequestMapping("xqfMoney")
public class XqfMoneyController extends BaseController {

	@Autowired
	private XqfzhmxInfoService xqfzhmxInfoService;
	@Autowired
	private XqfxxInfoService xqfxxInfoService;
	
	@Autowired
	private DictionaryService  dictionaryService;
	
	@RequestMapping("index")
	@AuthXqfAnnotation
	public ModelAndView index() throws Exception {
		ModelAndView mv = new ModelAndView();
		XqfxxInfoExtend  xqfxxInfoExtend=new XqfxxInfoExtend();
		QueryCondition<XqfxxInfoExtend> condition=new QueryCondition<>();
		if(!StringUtil.isEmpty(this.getYhId())){
			xqfxxInfoExtend.setYhid(this.getYhId());
			condition.setQuery(xqfxxInfoExtend);
			DataResult<List<XqfxxInfoExtend>> result= xqfxxInfoService.selectByCondition(condition,createCustomOperateLog());
			if(CommonUtil.isNotEmptyList(result.getDatas())){
				mv.addObject("xqfxx", result.getDatas().get(0));
			}	
		}
		List<DictionaryInfo> zhszlb=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_KFZZHSZLB);
		mv.addObject("zhszlbList",zhszlb);
		mv.setViewName("xqfgl/money/index");
		return mv;
	}

	@RequestMapping("queryTotal")
	@ResponseBody
	@AuthXqfAnnotation
	public DataResult<Double> queryTotal() throws Exception {

		XqfzhmxInfoExtend queryXqfzhmxInfoExtend = new XqfzhmxInfoExtend();
		queryXqfzhmxInfoExtend.setXqfid(this.getXqfxx().getWid());
		queryXqfzhmxInfoExtend.setSzlbid(SzlbEnum.XMZF.getCode());
		Double datas = xqfzhmxInfoService
				.selectTotalMoney(ConditionUtil.createCondition(queryXqfzhmxInfoExtend), this.createCustomOperateLog())
				.getDatas();

		return DataResult.success(DecimalUtil.round(datas,2));

	}

	@RequestMapping("queryMonth")
	@ResponseBody
	@AuthXqfAnnotation
	public DataResult<Map<String, Object>> queryMonth() throws Exception {
		String maxMonth = DateUtil.getCurrentMonthStr();
		String minMonth = DateUtil.addMonth(maxMonth, -11);
		XqfzhmxInfoExtend queryXqfzhmxInfoExtend = new XqfzhmxInfoExtend();
		queryXqfzhmxInfoExtend.setXqfid(this.getXqfxx().getWid());
		queryXqfzhmxInfoExtend.setSzlbid(SzlbEnum.XMZF.getCode());
		queryXqfzhmxInfoExtend.setMinMonth(minMonth);
		queryXqfzhmxInfoExtend.setMaxMonth(maxMonth);
		List<Map<String, Object>> datas = xqfzhmxInfoService.selectTotalMoneyByMonth(
				ConditionUtil.createCondition(queryXqfzhmxInfoExtend), this.createCustomOperateLog()).getDatas();
		Map<String, Object> monthDatas = new HashMap<String, Object>();
		if (CommonUtil.isNotEmptyList(datas)) {
			for(Map<String,Object> map:datas){
				monthDatas.put(StringUtil.toStr(map.get("month")),map.get("je"));
			}
		}
		Map<String, Object> monthMap = new LinkedHashMap<String, Object>();
		for (int i = 0; i < 12; i++) {
			if (monthDatas.containsKey(minMonth)) {
				monthMap.put(minMonth, monthDatas.get(minMonth));
			} else {
				monthMap.put(minMonth, 0);
			}
			minMonth = DateUtil.addMonth(minMonth, 1);
		}
		return DataResult.success(monthMap);

	}
	@AuthXqfAnnotation
	@ResponseBody
	@RequestMapping("queryDetail")
	public DataResult<List<XqfzhmxInfoExtend>> queryDetail(Integer pageNum,Integer pageSize,XqfzhmxInfoExtend xqfzhmxInfoExtend) throws Exception{
		PageInfo pageInfo=new PageInfo();
		if(pageNum!=null){
			pageInfo.setPageNum(pageNum);
		}
		if(pageSize!=null){
			pageInfo.setPageSize(pageSize);
		}
	
		XqfzhmxInfoExtend queryXqfzhmxInfoExtend=new XqfzhmxInfoExtend();
		if(!StringUtil.isEmpty(xqfzhmxInfoExtend.getSzlbid())){
			queryXqfzhmxInfoExtend.setSzlbid(xqfzhmxInfoExtend.getSzlbid());
		}
		if(!StringUtil.isEmpty(xqfzhmxInfoExtend.getBeginDate())){
			queryXqfzhmxInfoExtend.setBeginDate(xqfzhmxInfoExtend.getBeginDate());
		}
		if(!StringUtil.isEmpty(xqfzhmxInfoExtend.getEndDate())){
			queryXqfzhmxInfoExtend.setEndDate(xqfzhmxInfoExtend.getEndDate());
		}
		queryXqfzhmxInfoExtend.setXqfid(this.getXqfxx().getWid());
		QueryCondition<XqfzhmxInfoExtend> condition=ConditionUtil.createCondition(queryXqfzhmxInfoExtend);
		condition.setPageInfo(pageInfo);
		DataResult<List<XqfzhmxInfoExtend>> datas=this.xqfzhmxInfoService.selectDisplayByCondition(condition, this.createCustomOperateLog());
		
		 return datas;
				
	}
}
