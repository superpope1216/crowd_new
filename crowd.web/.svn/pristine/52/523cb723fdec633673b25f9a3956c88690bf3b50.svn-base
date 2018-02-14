package com.wisedu.crowd.controller.center;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wisedu.crowd.common.code.DictionaryEnum;
import com.wisedu.crowd.common.code.RwlbEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dictionary.DictionaryInfo;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.xmgl.extend.YwxWorkTimeExtend;
import com.wisedu.crowd.interceptor.AuthIsXqfAnnotation;
import com.wisedu.crowd.interceptor.AuthLoginAnnotation;
import com.wisedu.crowd.service.dictionary.DictionaryService;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.xmgl.YwxWorkTimeService;


/**
 * 估价标准  
 * @author 11651
 *
 */
@Controller
@RequestMapping("estimateStandard")
public class EstimateStandardController extends BaseController {
	@Autowired
	private DictionaryService dictionaryService;

	@Autowired
	private YwxWorkTimeService  ywxWorkTimeService;

	@RequestMapping("index")
	@AuthLoginAnnotation
	public ModelAndView index(String flag,String kfkj,String ywx) throws Exception {
		List<DictionaryInfo> ywxList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_YWXLB, null);

        ModelAndView mv = new ModelAndView();
		mv.setViewName("center/estimateStandard");
		mv.addObject("ywx", ywxList);
		return mv;
		
	}
	
	
	
	@RequestMapping("query")
	@ResponseBody
	public DataResult<List<YwxWorkTimeExtend>> queryList( Integer startPage, Integer pageSize,YwxWorkTimeExtend ywxWorkTimeExtend) throws ServiceException, Exception {
		QueryCondition<YwxWorkTimeExtend> condition = new QueryCondition<>();
		PageInfo page = PageUtil.cratePageInfo(startPage, pageSize);
		condition.setPageInfo(page);
		condition.setQuery(ywxWorkTimeExtend);
		DataResult<List<YwxWorkTimeExtend>> datas = ywxWorkTimeService.selectByCondition(condition, this.createCustomOperateLog());
        return datas;
	}

	
}
