/**
 * Project Name:crowd.web
 * File Name:TraineeController.java
 * Package Name:com.wisedu.crowd.controller.train
 * Date:2018年1月9日上午9:16:40
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.controller.train;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisedu.crowd.common.code.BmztEnum;
import com.wisedu.crowd.common.code.KhjgEnum;
import com.wisedu.crowd.common.code.YykhztEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.train.extend.TrainEnrolInfoExtend;
import com.wisedu.crowd.entity.train.extend.TrainStudentInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.train.TrainEnrolInfoService;
import com.wisedu.crowd.service.train.TrainStudentInfoService;

/**
 * ClassName:TraineeController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月9日 上午9:16:40 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Controller
@RequestMapping("xyxx")
public class TraineeController extends BaseController{
    
    @Autowired
    private TrainEnrolInfoService trainEnrolInfoService;
    @Autowired
    private TrainStudentInfoService trainStudentInfoService;

    /**
     * 学员中心首页
     * @author dell
     * @param model
     * @return
     * @since JDK 1.6
     */
    @RequestMapping("index")
    public String index(Model model) throws Exception{
        TrainStudentInfoExtend queryTrainStudentInfoExtend = new TrainStudentInfoExtend();
        
        if(!StringUtil.isEmpty(this.getYhId())){
            queryTrainStudentInfoExtend.setYhid(getYhId());
            QueryCondition<TrainStudentInfoExtend> condition=new QueryCondition<>();
            condition.setQuery(queryTrainStudentInfoExtend);
            DataResult<List<TrainStudentInfoExtend>> result= trainStudentInfoService.selectByCondition(condition, this.createCustomOperateLog());
            if(CommonUtil.isNotEmptyList(result.getDatas())){
                System.out.println("==========="+result.getDatas().get(0).getXm());
                model.addAttribute("xyxx", result.getDatas().get(0));
            }
        }
        return "train/trainee/index";
    }
    
    @ResponseBody
    @RequestMapping("queryTotal")
    public DataResult<Integer> queryTotal() throws Exception{
        if(!this.isXy()){
            return null;
        }
        TrainEnrolInfoExtend queryTrainEnrolInfoExtend = new TrainEnrolInfoExtend();
        queryTrainEnrolInfoExtend.setXyid(getXyxx().getWid());
        return trainEnrolInfoService.selectCountByCondition(ConditionUtil.createCondition(queryTrainEnrolInfoExtend), this.createCustomOperateLog());
    }
    
    @ResponseBody
    @RequestMapping("queryPass")
    public DataResult<Integer> queryPass() throws Exception{
        if(!this.isXy()){
            return null;
        }
        TrainEnrolInfoExtend queryTrainEnrolInfoExtend = new TrainEnrolInfoExtend();
        queryTrainEnrolInfoExtend.setXyid(getXyxx().getWid());
        queryTrainEnrolInfoExtend.setKhjg(KhjgEnum.TG.getCode());
        return trainEnrolInfoService.selectCountByCondition(ConditionUtil.createCondition(queryTrainEnrolInfoExtend), this.createCustomOperateLog());
    }
    
    @ResponseBody
    @RequestMapping("queryDbm")
    public DataResult<Integer> queryDbm() throws Exception{
        if(!this.isXy()){
            return null;
        }
        TrainEnrolInfoExtend queryTrainEnrolInfoExtend = new TrainEnrolInfoExtend();
        queryTrainEnrolInfoExtend.setXyid(getXyxx().getWid());
        queryTrainEnrolInfoExtend.setBmzt(BmztEnum.YYBM.getCode());
        return trainEnrolInfoService.selectCountByCondition(ConditionUtil.createCondition(queryTrainEnrolInfoExtend), this.createCustomOperateLog());
    }
    
    @ResponseBody
    @RequestMapping("queryDyy")
    public DataResult<Integer> queryDyy() throws Exception{
        if(!this.isXy()){
            return null;
        }
        TrainEnrolInfoExtend queryTrainEnrolInfoExtend = new TrainEnrolInfoExtend();
        List<Integer> yykhzts = new ArrayList<Integer>();
        yykhzts.add(YykhztEnum.WYY.getCode());
        yykhzts.add(YykhztEnum.QXYY.getCode());
        queryTrainEnrolInfoExtend.setXyid(getXyxx().getWid());
        queryTrainEnrolInfoExtend.setBmzt(BmztEnum.ZSBM.getCode());
        queryTrainEnrolInfoExtend.setYykhzts(yykhzts);
        return trainEnrolInfoService.selectCountByCondition(ConditionUtil.createCondition(queryTrainEnrolInfoExtend), this.createCustomOperateLog());
    }
    
    @ResponseBody
    @RequestMapping("queryDkh")
    public DataResult<Integer> queryDkh() throws Exception{
        if(!this.isXy()){
            return null;
        }
        TrainEnrolInfoExtend queryTrainEnrolInfoExtend = new TrainEnrolInfoExtend();
        queryTrainEnrolInfoExtend.setXyid(getXyxx().getWid());
        queryTrainEnrolInfoExtend.setBmzt(BmztEnum.ZSBM.getCode());
        queryTrainEnrolInfoExtend.setYykhzt(YykhztEnum.APDKH.getCode());
        return trainEnrolInfoService.selectCountByCondition(ConditionUtil.createCondition(queryTrainEnrolInfoExtend), this.createCustomOperateLog());
    }
}

