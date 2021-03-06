/**
 * Project Name:crowd.web
 * File Name:TraineeBasicInfoContoller.java
 * Package Name:com.wisedu.crowd.controller.train
 * Date:2018年1月9日下午2:44:42
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.controller.train;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.train.TrainStudentInfo;
import com.wisedu.crowd.entity.train.extend.TrainStudentInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.train.TrainStudentInfoService;

/**
 * 
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Controller
@RequestMapping("xyBasicInfo")
public class TraineeBasicInfoContoller extends BaseController{
    
    @Autowired
    private TrainStudentInfoService trainStudentInfoService;

    @RequestMapping("index")
    public String index(Model model){
        return "train/trainee/basicInfo";
    }
    
    @ResponseBody
    @RequestMapping("queryTrainStudentInfo")
    public DataResult<List<TrainStudentInfoExtend>> queryTrainStudentInfo() throws Exception{
        TrainStudentInfoExtend queryTrainStudentInfoExtend = new TrainStudentInfoExtend();
        queryTrainStudentInfoExtend.setYhid(getYhId());
        return trainStudentInfoService.selectByCondition(ConditionUtil.createCondition(queryTrainStudentInfoExtend), this.createCustomOperateLog());
    }
    
    @ResponseBody
    @RequestMapping(value = "saveOrUpdateTrainStudentInfo", method = RequestMethod.POST)
    public DataResult<TrainStudentInfo> saveOrUpdateTrainStudentInfo(TrainStudentInfo trainStudentInfo,HttpServletRequest request) throws Exception{
        trainStudentInfo.setYhid(getYhId());
        DataResult<TrainStudentInfo> result=null;
        if(StringUtil.isEmpty(trainStudentInfo.getWid())){
            result= trainStudentInfoService.firstSave(trainStudentInfo, this.createCustomOperateLog());
            request.getSession().setAttribute(ConstantsUtil.SESSION_XYXX,result.getDatas());
            return result;
        }
        result= trainStudentInfoService.updateTrainStudentInfo(trainStudentInfo, this.createCustomOperateLog());
        request.getSession().setAttribute(ConstantsUtil.SESSION_XYXX,result.getDatas());
        return result;
    }
}

