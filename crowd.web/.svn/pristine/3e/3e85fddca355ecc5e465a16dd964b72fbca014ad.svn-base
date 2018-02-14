/**
 * Project Name:crowd.web
 * File Name:DemandMessageController.java
 * Package Name:com.wisedu.crowd.controller.message
 * Date:2017年12月7日上午10:18:50
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.controller.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisedu.crowd.common.code.YesNoEnum;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.xxgl.XqxxInfo;
import com.wisedu.crowd.entity.xxgl.extend.GrxxszInfoExtend;
import com.wisedu.crowd.entity.xxgl.extend.XqxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.xxgl.GrxxszInfoService;
import com.wisedu.crowd.service.xxgl.XqxxInfoService;

/**
 * ClassName:DemandMessageController <br/>
 * Function: TODO 需求消息中心. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年12月7日 上午10:18:50 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Controller
@RequestMapping("demandMessage")
public class DemandMessageController extends BaseController{
    
    @Autowired
    private XqxxInfoService xqxxInfoService;
    
    @Autowired
    private GrxxszInfoService grxxszInfoService;
    
    /**
     * 需求消息首页
     * @author dell
     * @param model
     * @return
     * @since JDK 1.6
     */
    @RequestMapping("index")
    public String index(Model model){
/*        if(!StringUtil.isEmpty(this.getYhId())){
            XqxxInfoExtend  xqxxInfoExtend=new XqxxInfoExtend();
            xqxxInfoExtend.setJsr(getYhId());
            QueryCondition<XqxxInfoExtend> condition=new QueryCondition<>();
            condition.setQuery(xqxxInfoExtend);
//            condition.setOrderBy(orderBy);
            DataResult<List<XqxxInfoExtend>> result= xqxxInfoService.selectDisplayByCondition(condition);
            model.addAttribute("xqxxList", result.getDatas());
        }*/
        return "message/demand/index";
    }
    
    @ResponseBody
    @RequestMapping("queryXqxxInfo")
    public DataResult<List<XqxxInfoExtend>> queryXqxxInfo(Integer pageNum, Integer pageSize) throws Exception{
        if(!StringUtil.isEmpty(this.getYhId())){
        	PageInfo pageInfo=new PageInfo();
    		if(pageNum!=null){
    			pageInfo.setPageNum(pageNum);
    		}
    		if(pageSize!=null){
    			pageInfo.setPageSize(pageSize);
    		}
    		XqxxInfoExtend xqxxInfoExtend = new XqxxInfoExtend();
            xqxxInfoExtend.setJsr(getYhId());
            QueryCondition<XqxxInfoExtend> condition=new QueryCondition<>();
            condition.setQuery(xqxxInfoExtend);
            condition.setPageInfo(pageInfo);
            return xqxxInfoService.selectDisplayByCondition(condition);
        }
        return  DataResult.success(null);
    }
    
    @ResponseBody
    @RequestMapping("delXqxxInfo")
    public DataResult<Integer> delXqxxInfo(XqxxInfo xqxxInfo) throws Exception{
        return  xqxxInfoService.deleteByPrimaryKey(xqxxInfo.getWid());
    }
    
    @ResponseBody
    @RequestMapping("markReaded")
    public DataResult<Integer> markReaded(String wids) throws Exception{
        String[] ids = wids.split(",");
        return xqxxInfoService.markXqxxInfo(ids, YesNoEnum.YES.getCode());
    }
    
    @ResponseBody
    @RequestMapping("markUnread")
    public DataResult<Integer> markUnread(String wids) throws Exception{
        String[] ids = wids.split(",");
        return xqxxInfoService.markXqxxInfo(ids, YesNoEnum.NO.getCode());
    }
    
    @ResponseBody
    @RequestMapping("queryGrxxszInfo")
    public DataResult<List<GrxxszInfoExtend>> queryGrxxszInfo(GrxxszInfoExtend grxxszInfoExtend){
        if(!StringUtil.isEmpty(this.getYhId())){
            grxxszInfoExtend.setYhid(getYhId());
            QueryCondition<GrxxszInfoExtend> condition=new QueryCondition<>();
            condition.setQuery(grxxszInfoExtend);
            return grxxszInfoService.selectDisplayByCondition(condition);
        }
        return  DataResult.success(null);
    }
    @ResponseBody
    @RequestMapping("queryNotReadCount")
    public DataResult<Integer> queryNotReadCount() throws Exception{
    	if(!StringUtil.isEmpty(this.getYhId())){
    		XqxxInfoExtend queryXqxxInfoExtend=new XqxxInfoExtend();
    		queryXqxxInfoExtend.setJsr(this.getYhId());
    		queryXqxxInfoExtend.setSfyd(StringUtil.toInt(YesNoEnum.NO.getCode()));
    		return xqxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryXqxxInfoExtend), this.createCustomOperateLog());
    	}else{
    		return DataResult.success(0);
    	}
    }
}