package com.wisedu.crowd.controller.kfzxx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisedu.crowd.common.code.DictionaryEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dictionary.DictionaryInfo;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.xmgl.RbxxNewInfo;
import com.wisedu.crowd.entity.xmgl.extend.RbxxNewInfoExtend;
import com.wisedu.crowd.interceptor.AuthIsKfzAnnotation;
import com.wisedu.crowd.service.dictionary.DictionaryService;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.xmgl.RbxxNewInfoService;

@Controller
@RequestMapping("kfzrbgl")
public class KfzRbglController extends BaseController {
      
	@Autowired
	private RbxxNewInfoService  rbxxNewInfoService;
	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	@Autowired
	private DictionaryService  dictionaryService;
	/**
	 * 日报 首页
	 * @param model
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	@RequestMapping("index")
	@AuthIsKfzAnnotation
	public String index(Model model) throws ServiceException, Exception{
		
		List<DictionaryInfo> sjdList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_SJD);
		model.addAttribute("sjdList", sjdList);
		model.addAttribute("date", DateUtil.getCurrentDateStr());
		model.addAttribute("ldate",DateUtil.addDate(DateUtil.getCurrentDateStr(), -1));
		return "kfzgl/rbgl/index";
	}
	
	/**
	 * 查询当前开发者 日报信息
	 * @param rfzxxInfoExtend
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@AuthIsKfzAnnotation
	@RequestMapping("queryRbxxNewInfo")
	public DataResult<List<RbxxNewInfoExtend>> queryRbxxNewInfo(Integer startPage, Integer pageSize,RbxxNewInfoExtend rbxxNewInfoExtend) throws Exception{
		if(!StringUtil.isEmpty(this.getKfzxx())){
			rbxxNewInfoExtend.setKfzid(this.getKfzxx().getWid());
			QueryCondition<RbxxNewInfoExtend> condition=new QueryCondition<>();
			PageInfo page = PageUtil.cratePageInfo(startPage, pageSize);
			condition.setPageInfo(page);
			condition.setQuery(rbxxNewInfoExtend);
			return  rbxxNewInfoService.selectByCondition(condition,createCustomOperateLog());
		}
		return  DataResult.success(null);
	}
	
	/**
	 * 添加或修改开发者 日报信息
	 * @param kfzxxInfo
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@AuthIsKfzAnnotation
	@RequestMapping(value="saveOrUpdateRbxxNewInfo",method=RequestMethod.POST)
	public DataResult<Integer> saveOrUpdateRbxxNewInfo(RbxxNewInfo rbxxNewInfo) throws Exception{
		
		if(StringUtil.isEmpty(rbxxNewInfo.getWid())){
			rbxxNewInfo.setXm(this.getKfzxx().getXm());
			rbxxNewInfo.setKfzid(this.getKfzxx().getWid());
			return rbxxNewInfoService.insertSelective(rbxxNewInfo, this.createCustomOperateLog());
		}
		return  rbxxNewInfoService.updateByPrimaryKeySelective(rbxxNewInfo, this.createCustomOperateLog());
	}
	
	
	/**
	 * 删除日报
	 * @param rbxxNewInfo
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@AuthIsKfzAnnotation
	@RequestMapping(value="delRbxxNewInfo",method=RequestMethod.POST)
	public DataResult<Integer> delRbxxNewInfo(RbxxNewInfo rbxxNewInfo) throws Exception{
		return  rbxxNewInfoService.deleteByPrimaryKey(rbxxNewInfo.getWid(), this.createCustomOperateLog());
	}
	
	
	/**
	 * 根据任务编号模糊查询
	 * @param rwjbxxInfoExtend
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("queryRwjbxxInfo")
	public DataResult<List<RwjbxxInfoExtend>> queryRwjbxxInfo(RwjbxxInfoExtend rwjbxxInfoExtend) throws Exception{
		    
		    PageInfo page=PageUtil.cratePageInfo(1, 10);
			QueryCondition<RwjbxxInfoExtend> condition=new QueryCondition<>();
			rwjbxxInfoExtend.setKfzid(this.getKfzxx().getWid());
			condition.setPageInfo(page);
			condition.setQuery(rwjbxxInfoExtend);
			return  rwjbxxInfoService.selectDisplayByLikeCondition(condition);
		
	}
	
	
	
}
