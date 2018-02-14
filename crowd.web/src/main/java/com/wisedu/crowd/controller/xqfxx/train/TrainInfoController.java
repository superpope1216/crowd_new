package com.wisedu.crowd.controller.xqfxx.train;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.train.extend.TrainBasicInfoExtend;
import com.wisedu.crowd.interceptor.AuthXqfAnnotation;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.train.TrainBasicInfoService;

@Controller
@RequestMapping("xqfTrainInfo")
public class TrainInfoController extends BaseController{

	@Autowired
	private TrainBasicInfoService trainBasicInfoService;
	@RequestMapping("index")
	public ModelAndView index() throws Exception{
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("xqfgl/train/index");
		return mv;
	}
	@RequestMapping("query")
	@ResponseBody
	@AuthXqfAnnotation
	public DataResult<List<TrainBasicInfoExtend>> queryTrain(String condition,String states,Integer pageSize,Integer pageNum) throws Exception{
		TrainBasicInfoExtend queryTrainBasicInfoExtend=new TrainBasicInfoExtend();
		if(!StringUtil.isEmpty(states)){
			queryTrainBasicInfoExtend.setPxzt(StringUtil.toShort(states));
		}
		
		queryTrainBasicInfoExtend.setSqr(this.getXqfxx().getWid());
		QueryCondition<TrainBasicInfoExtend> queryCondition=ConditionUtil.createCondition(queryTrainBasicInfoExtend);
		queryCondition.setPageInfo(new PageInfo(pageSize,pageNum));
		queryCondition.setQuery(queryTrainBasicInfoExtend);
		return  trainBasicInfoService.selectDisplayByCondition(queryCondition,this.createCustomOperateLog());
	}
	
}
