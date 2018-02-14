package com.wisedu.crowd.controller.kfzxx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisedu.crowd.common.code.DictionaryEnum;
import com.wisedu.crowd.common.code.SqzylbEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dictionary.DictionaryInfo;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.zygl.ZysqjlInfo;
import com.wisedu.crowd.entity.zygl.extend.ZysqjlInfoExtend;
import com.wisedu.crowd.interceptor.AuthKfzAnnotation;
import com.wisedu.crowd.service.dictionary.DictionaryService;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.zygl.ZysqjlInfoService;

@Controller
@RequestMapping("deskstop")
public class DeskstopController extends BaseController{
    
    @Autowired
    private ZysqjlInfoService zysqjlInfoService;
    @Autowired
    private DictionaryService  dictionaryService;

	@RequestMapping("index")
	public String index(Model model){
	    List<DictionaryInfo> zylbList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_ZYLB);
        model.addAttribute("zylbList", zylbList);
        model.addAttribute("date", DateUtil.getCurrentDateStr());
		return "yhgl/deskstop";
	}
	
	@RequestMapping("queryDeskstop")
	@ResponseBody
	@AuthKfzAnnotation
	public DataResult<List<ZysqjlInfoExtend>> queryDeskstop(String state,Integer pageNum,Integer pageSize) throws Exception{
	    ZysqjlInfoExtend queryZysqjlInfoExtend = new ZysqjlInfoExtend();
	    queryZysqjlInfoExtend.setSqr(this.getKfzxx().getWid());
	    QueryCondition<ZysqjlInfoExtend> condition=ConditionUtil.createCondition(queryZysqjlInfoExtend);
        PageInfo pageInfo=new PageInfo();
        if(pageNum!=null){
            pageInfo.setPageNum(pageNum);
        }
        if(pageSize!=null){
            pageInfo.setPageSize(pageSize);
        }
        condition.setPageInfo(pageInfo);
        DataResult<List<ZysqjlInfoExtend>> result = new DataResult<List<ZysqjlInfoExtend>>();
	    if("1".equals(state)){//云桌面
	        queryZysqjlInfoExtend.setSqzylb(SqzylbEnum.YZM.getCode());
	        result = zysqjlInfoService.selectYzmDisplayByCondition(condition, this.createCustomOperateLog());
	    }else if("2".equals(state)){
	        queryZysqjlInfoExtend.setSqzylb(SqzylbEnum.SJK.getCode());
	        result = zysqjlInfoService.selectSjkDisplayByCondition(condition, this.createCustomOperateLog());
	    }else if("3".equals(state)){
            queryZysqjlInfoExtend.setSqzylb(SqzylbEnum.SVN.getCode());
            result = zysqjlInfoService.selectSvnDisplayByCondition(condition, this.createCustomOperateLog());
        }else if("4".equals(state)){
            queryZysqjlInfoExtend.setSqzylb(SqzylbEnum.VPN.getCode());
            result = zysqjlInfoService.selectVpnDisplayByCondition(condition, this.createCustomOperateLog());
        }
        return result;
	}
	
	@RequestMapping(value = "saveDeskstop", method = RequestMethod.POST)
	@ResponseBody
	@AuthKfzAnnotation
	public DataResult<Integer> saveDeskstop(ZysqjlInfo zysqjlInfo, String sqzylbs) throws Exception{
	if(StringUtil.isEmpty(sqzylbs)){
			throw new ServiceException("参数为空");
		}
		zysqjlInfo.setSqr(this.getKfzxx().getWid());
		DataResult<Integer> result = new DataResult<Integer>();
		String[] sqzylb = sqzylbs.split(",");
		for (String str : sqzylb) {
			int zylb = StringUtil.toInt(str);
			zysqjlInfo.setSqzylb(zylb);
			result = zysqjlInfoService.applyDeskstop(zysqjlInfo, this.createCustomOperateLog());
		}
	    return result;
	}
}
