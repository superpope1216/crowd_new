/**
 * Project Name:crowd.web
 * File Name:DeveloperQualifyController.java
 * Package Name:com.wisedu.crowd.controller.train
 * Date:2018年1月17日上午11:10:07
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.controller.train;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.yhgl.extend.KfzzzxxInfoExtend;
import com.wisedu.crowd.interceptor.AuthKfzAnnotation;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.yhgl.KfzzzxxInfoService;

/**
 * ClassName:DeveloperQualifyController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月17日 上午11:10:07 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Controller
@RequestMapping("developerQualify")
public class DeveloperQualifyController extends BaseController{

	@Autowired
	private KfzzzxxInfoService kfzzzxxInfoService;
	
	@RequestMapping("index")
	public String index() throws Exception{
		return "train/trainee/qualify";
	}
	
	@RequestMapping("queryQualify")
	@ResponseBody
	@AuthKfzAnnotation
	public DataResult<List<KfzzzxxInfoExtend>> queryQualify(Integer pageNum, Integer pageSize) throws Exception{
		KfzzzxxInfoExtend queryKfzzzxxInfoExtend = new KfzzzxxInfoExtend();
		queryKfzzzxxInfoExtend.setKfzid(this.getKfzxx().getWid());
		QueryCondition<KfzzzxxInfoExtend> condition = ConditionUtil.createCondition(queryKfzzzxxInfoExtend);
        PageInfo pageInfo=new PageInfo();
        if(pageNum!=null){
            pageInfo.setPageNum(pageNum);
        }
        if(pageSize!=null){
            pageInfo.setPageSize(pageSize);
        }
        condition.setPageInfo(pageInfo);
		return kfzzzxxInfoService.selectByCondition(condition, this.createCustomOperateLog());
	}
}

