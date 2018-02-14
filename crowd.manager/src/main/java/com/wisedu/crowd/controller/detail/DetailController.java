package com.wisedu.crowd.controller.detail;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisedu.crowd.common.util.ConditionUtil;

import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.statics.extend.XqfGzjdInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.XqfGzjdInfoService;


/**
 * 详情页面 操作类 
 * @author 11651
 *
 */
@Controller
@RequestMapping("detail")
public class DetailController {
	
	@Autowired
	private XqfGzjdInfoService xqfGzjdInfoService;
	
	/**
	 *   需求方发布任务详情 页面
	 * @return
	 */
	@RequestMapping("xqfgzjdxq")
	public String xqfgzjdxq() {
		return "detail/xqfgzjdxq";
	}
	
	    @ResponseBody
	    @RequestMapping("queryList")
	    public DataResult<List<Map<String, Object>>> getXqfgzjd(HttpServletRequest request,Integer pageNum,Integer pageSize,String draw) throws Exception{
	       
	        XqfGzjdInfoExtend queryXqfGzjdInfoExtend = new XqfGzjdInfoExtend();
	       // queryXqfGzjdInfoExtend.setYjbm(getXqfSsbm());
	        QueryCondition<XqfGzjdInfoExtend> condition=ConditionUtil.createCondition(queryXqfGzjdInfoExtend);
	        PageInfo pageInfo=new PageInfo();
	        if(pageNum!=null){
	            pageInfo.setPageNum(pageNum);
	        }
	        if(pageSize!=null){
	            pageInfo.setPageSize(pageSize);
	        }
	        condition.setPageInfo(pageInfo);
	        DataResult<List<Map<String, Object>>> result=xqfGzjdInfoService.selectXqfGzjdInfoByCondition(condition);
	        result.setDraw(draw);
	        return result;
	    }
	
}
