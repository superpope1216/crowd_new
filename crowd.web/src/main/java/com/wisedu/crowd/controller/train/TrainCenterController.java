package com.wisedu.crowd.controller.train;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wisedu.crowd.common.code.DictionaryEnum;
import com.wisedu.crowd.common.code.PxztEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.train.extend.TrainBasicInfoExtend;
import com.wisedu.crowd.service.dictionary.DictionaryService;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.train.TrainBasicInfoService;

@Controller
@RequestMapping("trainCenter")
public class TrainCenterController extends BaseController{
	@Autowired
	private DictionaryService dictionaryService;
	@Autowired
	private TrainBasicInfoService trainBasicInfoService;
	@RequestMapping("index")
	public ModelAndView index() throws Exception{
		ModelAndView mv=new ModelAndView();
		mv.addObject("pxlx",dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_PXLX, null));
		mv.addObject("pxfs",dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_PXFS, null));
		mv.addObject("bmzt",dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_PXBMZT, null));
		mv.setViewName("train/center");
		return mv;
	}
	
	@RequestMapping("queryPxxx")
	@ResponseBody
	public DataResult<List<TrainBasicInfoExtend>> queryPxxx(String bmzt,String pxlx,String pxfs,Integer pageNum,Integer pageSize) throws Exception{
		TrainBasicInfoExtend queryTrainBasicInfoExtend=new TrainBasicInfoExtend();
		queryTrainBasicInfoExtend.setPxzt(StringUtil.toShort(PxztEnum.YSL.getCode()));
		queryTrainBasicInfoExtend.setNeedBmCount(true);
		if(!StringUtil.isEmpty(bmzt) && !"null".equals(bmzt)){
		    queryTrainBasicInfoExtend.setBmzt(bmzt);
		}
		if(!StringUtil.isEmpty(pxfs) && !"null".equals(pxfs)){
		    queryTrainBasicInfoExtend.setSfwxspx(StringUtil.toShort(pxfs));
		}
		QueryCondition<TrainBasicInfoExtend> condition=ConditionUtil.createCondition(queryTrainBasicInfoExtend);
		condition.setPageInfo(new PageInfo(pageSize,pageNum));
		DataResult<List<TrainBasicInfoExtend>> datas=trainBasicInfoService.selectPlanDisplayByCondition(condition,this.createCustomOperateLog());
		if(CommonUtil.isNotEmptyList(datas.getDatas())){
			for(TrainBasicInfoExtend trainBasicInfoExtend:datas.getDatas()){
				trainBasicInfoExtend.setPxzq(StringUtil.toStr(DateUtil.getDaysBetween(trainBasicInfoExtend.getPxkssj(), trainBasicInfoExtend.getPxjssj())+1));
			
			}
		}
		return datas;
	}
}
