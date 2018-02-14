package com.wisedu.crowd.controller.train;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.StringUtil;
import com.wisedu.crowd.common.code.BmztEnum;
import com.wisedu.crowd.common.code.YykhztEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.train.TrainStudentInfo;
import com.wisedu.crowd.entity.train.extend.TrainBasicInfoExtend;
import com.wisedu.crowd.entity.train.extend.TrainEnrolInfoExtend;
import com.wisedu.crowd.entity.train.extend.TrainPlanInfoExtend;
import com.wisedu.crowd.entity.train.extend.TrainStudentInfoExtend;
import com.wisedu.crowd.entity.yhgl.XqfxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.XqfxxExtInfoExtend;
import com.wisedu.crowd.interceptor.AuthLoginAnnotation;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.train.TrainBasicInfoService;
import com.wisedu.crowd.service.train.TrainEnrolInfoService;
import com.wisedu.crowd.service.train.TrainPlanInfoService;
import com.wisedu.crowd.service.train.TrainStudentInfoService;
import com.wisedu.crowd.service.yhgl.XqfxxInfoService;

@Controller
@RequestMapping("trainDetail")
public class TrainDetailController extends BaseController{
	@Autowired
	private TrainBasicInfoService trainBasicInfoService;
	@Autowired
	private TrainPlanInfoService trainPlanInfoService;
	@Autowired
	private TrainEnrolInfoService trainEnrolInfoService;
	@Autowired
	private TrainStudentInfoService trainStudentInfoService;
	@Autowired
	private XqfxxInfoService xqfxxInfoService;
	
	@RequestMapping("index")
	public  ModelAndView index(String pxid) throws Exception{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("train/pxxx_detail");
		TrainBasicInfoExtend queryTrainBasicInfoExtend=new TrainBasicInfoExtend();
		queryTrainBasicInfoExtend.setNeedBmCount(true);
		queryTrainBasicInfoExtend.setWid(pxid);
		boolean isXqf = this.isXqf();
		if(isXqf){
		    mv.addObject("xqfId", this.getXqfxx().getWid());
	        mv.addObject("isXqf", this.isXqf());
		}
        if (this.getXyxx() != null) {
            TrainEnrolInfoExtend queryTrainEnrolInfoExtend = new TrainEnrolInfoExtend();
            queryTrainEnrolInfoExtend.setPxid(pxid);
            queryTrainEnrolInfoExtend.setXyid(this.getXyxx().getWid());
            DataResult<Integer> countData = trainEnrolInfoService.selectCountByCondition(
                    ConditionUtil.createCondition(queryTrainEnrolInfoExtend), this.createCustomOperateLog());
            if (countData.getDatas() > 0) {
                mv.addObject("hasBm", true);
            } else {
                mv.addObject("hasBm", false);
            }
        } else {
            mv.addObject("hasBm", false);
        }
		mv.addObject("pxid", pxid);
		List<TrainBasicInfoExtend> datas = trainBasicInfoService.selectDisplayByCondition(ConditionUtil.createCondition(queryTrainBasicInfoExtend), this.createCustomOperateLog()).getDatas();
		mv.addObject("pxxx", datas.get(0));
		String sqr="";
		if(datas!=null && CommonUtil.isNotEmptyList(datas)){
			mv.addObject("rwjbxx", datas.get(0));
			sqr=datas.get(0).getSqr();
		}
		if(!StringUtil.isEmpty(sqr)){
			DataResult<XqfxxInfo> xqfxxData=xqfxxInfoService.selectByPrimaryKey(sqr,this.createCustomOperateLog());
			mv.addObject("xqfxx",xqfxxData.getDatas());		
		}
		return mv;
	}
	
	@ResponseBody
	@RequestMapping("queryPlan")
	public DataResult<TrainPlanInfoExtend> queryPlan(String pxid) throws Exception{
		TrainPlanInfoExtend queryTrainPlanInfoExtend=new TrainPlanInfoExtend();
		queryTrainPlanInfoExtend.setPxid(pxid);
		List<TrainPlanInfoExtend> datas=trainPlanInfoService.selectByCondition(ConditionUtil.createCondition(queryTrainPlanInfoExtend),this.createCustomOperateLog()).getDatas();
		if(CommonUtil.isNotEmptyList(datas)){
			return DataResult.success(datas.get(0));
		}else{
			return DataResult.success(null);
		}
	}
	@ResponseBody
	@RequestMapping("queryEnrol")
	public DataResult<List<TrainEnrolInfoExtend>> queryEnrol(String pxid) throws Exception{
		TrainEnrolInfoExtend queryTrainEnrolInfoExtend=new TrainEnrolInfoExtend();
		queryTrainEnrolInfoExtend.setPxid(pxid);
		return trainEnrolInfoService.selectEnrolByCondition(ConditionUtil.createCondition(queryTrainEnrolInfoExtend),this.createCustomOperateLog());
		
	}
	
	@ResponseBody
	@RequestMapping(value = "doTrainEnroll", method = RequestMethod.POST)
	@AuthLoginAnnotation
	public DataResult<List<TrainStudentInfoExtend>> doTrainEnroll(String pxid) throws Exception{
	    if(StringUtil.isEmpty(this.getYhId())){
	        throw new ServiceException("您还未登录系统");
        }
	    TrainStudentInfoExtend queryTrainStudentInfoExtend = new TrainStudentInfoExtend();
	    queryTrainStudentInfoExtend.setYhid(getYhId());
	    DataResult<List<TrainStudentInfoExtend>> datas = trainStudentInfoService.selectByCondition(ConditionUtil.createCondition(queryTrainStudentInfoExtend), this.createCustomOperateLog());
	    if(CommonUtil.isNotEmptyList(datas.getDatas())){
	        TrainStudentInfoExtend trainStudentInfoExtend = datas.getDatas().get(0);
	        TrainEnrolInfoExtend queryTrainEnrolInfoExtend = new TrainEnrolInfoExtend();
	        queryTrainEnrolInfoExtend.setXyid(trainStudentInfoExtend.getWid());
	        queryTrainEnrolInfoExtend.setPxid(pxid);
	        DataResult<List<TrainEnrolInfoExtend>> enrolDatas = trainEnrolInfoService.selectByCondition(ConditionUtil.createCondition(queryTrainEnrolInfoExtend), this.createCustomOperateLog());
	        if(CommonUtil.isNotEmptyList(enrolDatas.getDatas())){
	            throw new ServiceException("您已报名该培训课程");
	        }
	    }
	    return datas;
	}
	
	@ResponseBody
	@RequestMapping("toTrainEnroll")
	@AuthLoginAnnotation
	public DataResult<Integer> toTrainEnroll(TrainStudentInfo record, String pxid, HttpServletRequest request) throws Exception{
	    if(StringUtil.isEmpty(this.getYhId())){
	        throw new ServiceException("您还未登录系统");
        }
	    record.setYhid(getYhId());
	    DataResult<TrainStudentInfo> trainStudentInfo = null;
	    if(StringUtil.isEmpty(record.getWid())){
	        trainStudentInfo = trainStudentInfoService.firstSave(record, this.createCustomOperateLog());
	    }else{
	        trainStudentInfo = trainStudentInfoService.updateTrainStudentInfo(record, this.createCustomOperateLog());
	    }
	    request.getSession().setAttribute(ConstantsUtil.SESSION_XYXX, trainStudentInfo.getDatas());
	    
	    TrainPlanInfoExtend queryTrainPlanInfoExtend = new TrainPlanInfoExtend();
	    queryTrainPlanInfoExtend.setPxid(pxid);
	    TrainPlanInfoExtend trainPlanInfoExtend = trainPlanInfoService.selectByCondition(ConditionUtil.createCondition(queryTrainPlanInfoExtend), this.createCustomOperateLog()).getDatas().get(0);
	    
	    TrainEnrolInfoExtend insertTrainEnrolInfoExtend = new TrainEnrolInfoExtend();
	    insertTrainEnrolInfoExtend.setWid(com.wisedu.crowd.common.util.StringUtil.getUuId());
	    insertTrainEnrolInfoExtend.setPxid(pxid);
	    insertTrainEnrolInfoExtend.setXyid(trainStudentInfo.getDatas().getWid());
	    if(StringUtil.isEmpty(trainPlanInfoExtend.getJcnljcdz())){
	        insertTrainEnrolInfoExtend.setBmzt(BmztEnum.ZSBM.getCode());
	    }else{
	        insertTrainEnrolInfoExtend.setBmzt(BmztEnum.YYBM.getCode());
	    }
	    insertTrainEnrolInfoExtend.setYykhzt(YykhztEnum.WYY.getCode());
	    return trainEnrolInfoService.insertSelective(insertTrainEnrolInfoExtend, this.createCustomOperateLog());
	}
	
}
