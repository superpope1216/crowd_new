package com.wisedu.crowd.controller.center;

import java.util.List;
import java.util.Map;

import org.quartz.impl.calendar.BaseCalendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wisedu.crowd.common.code.RwxsEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.statics.extend.KfzjlMonthExtend;
import com.wisedu.crowd.entity.statics.extend.KfzjlWglInfoExtend;
import com.wisedu.crowd.entity.statics.extend.ManpowerInfoExtend;
import com.wisedu.crowd.entity.statics.extend.RwjbxxRwxsDataInfoExtend;
import com.wisedu.crowd.entity.statics.extend.YwxbugInfoExtend;
import com.wisedu.crowd.entity.statics.extend.YwxyqInfoExtend;
import com.wisedu.crowd.interceptor.AuthLoginAnnotation;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.KfzjlMonthInfoService;
import com.wisedu.crowd.service.statics.KfzjlWglInfoService;
import com.wisedu.crowd.service.statics.ManpowerInfoService;
import com.wisedu.crowd.service.statics.RwjbxxRwxsDataInfoService;
import com.wisedu.crowd.service.statics.YwxbugInfoService;
import com.wisedu.crowd.service.statics.YwxyqInfoService;

@Controller
@RequestMapping("manager")
public class ManagerController extends BaseController{
	@Autowired
	private RwjbxxRwxsDataInfoService rwjbxxRwxsDataInfoService;
	
	@Autowired
	private ManpowerInfoService manpowerInfoService;
	
	@Autowired
	private KfzjlMonthInfoService kfzjlMonthInfoService;
	@Autowired
	private KfzjlWglInfoService kfzjlWglInfoService;
	
	@Autowired
	private YwxyqInfoService ywxyqInfoService;
	
	@Autowired
	private YwxbugInfoService ywxbugInfoService;
	@RequestMapping("index")
	public ModelAndView index() throws Exception{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("center/manager");
		mv.addObject("year", DateUtil.getFiscalYear());
		mv.addObject("month", DateUtil.getCurrentMonthStr());
		return mv;
	}
	@RequestMapping("queryRwjbxxSum")
	@ResponseBody
	@AuthLoginAnnotation
	public DataResult<RwjbxxRwxsDataInfoExtend> queryRwjbxxSum() throws Exception{
		RwjbxxRwxsDataInfoExtend queryRwjbxxRwxsDataInfoExtend=new RwjbxxRwxsDataInfoExtend();
		queryRwjbxxRwxsDataInfoExtend.setKfxs(RwxsEnum.KF.getCode());
		queryRwjbxxRwxsDataInfoExtend.setYear(DateUtil.getFiscalYear());
		List<RwjbxxRwxsDataInfoExtend> datas=rwjbxxRwxsDataInfoService.selectByCondition(ConditionUtil.createCondition(queryRwjbxxRwxsDataInfoExtend), this.createCustomOperateLog()).getDatas();
		if(CommonUtil.isNotEmptyList(datas)){
			return DataResult.success(datas.get(0));
		}
		return DataResult.success(new RwjbxxRwxsDataInfoExtend());
	}
	/**
	 * 获取业务线剩余任务开发周期
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("queryYwxSyzq")
	@ResponseBody
	@AuthLoginAnnotation
	public DataResult<List<ManpowerInfoExtend>> queryYwxSyzq() throws Exception{
		ManpowerInfoExtend queryManpowerInfoExtend=new ManpowerInfoExtend();
		queryManpowerInfoExtend.setRwxs(RwxsEnum.KF.getCode());
		return manpowerInfoService.selectByCondition(ConditionUtil.createCondition(queryManpowerInfoExtend), this.createCustomOperateLog());
	}
	/**
	 * 获取业务线得分
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("queryYwxScore")
	@AuthLoginAnnotation
	public DataResult<List<KfzjlMonthExtend>> queryYwxScore() throws Exception{
		KfzjlMonthExtend queryKfzjlMonthExtend=new KfzjlMonthExtend();
		queryKfzjlMonthExtend.setMonth(DateUtil.addMonth(DateUtil.getCurrentMonthStr(), -1));
		return kfzjlMonthInfoService.selectStaticsKfzjlTotal(ConditionUtil.createCondition(queryKfzjlMonthExtend),this.createCustomOperateLog());
	}
	/**
	 * 获取业务线当前月完工量
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("queryWglYwx")
	@AuthLoginAnnotation
	public DataResult<List<KfzjlWglInfoExtend>> queryWglYwx() throws Exception{
		KfzjlWglInfoExtend queryKfzjlWglInfoExtend=new KfzjlWglInfoExtend();
		queryKfzjlWglInfoExtend.setMonth(DateUtil.getCurrentMonthStr());
		return kfzjlWglInfoService.selectStaticsYwxwglInfo(ConditionUtil.createCondition(queryKfzjlWglInfoExtend), this.createCustomOperateLog());
	}
	@ResponseBody
	@RequestMapping("queryWglMonth")
	@AuthLoginAnnotation
	/**
	 * 获取财年完工量
	 * @return
	 * @throws Exception
	 */
	public DataResult<List<Map<String,Object>>> queryWglMonth() throws Exception{
		KfzjlWglInfoExtend queryKfzjlWglInfoExtend=new KfzjlWglInfoExtend();
		queryKfzjlWglInfoExtend.setBeginMonth(DateUtil.getBeginMonth());
		queryKfzjlWglInfoExtend.setEndMonth(DateUtil.getEndMonth());
		return kfzjlWglInfoService.selectStaticsKfzjlWglMonthInfo(ConditionUtil.createCondition(queryKfzjlWglInfoExtend), this.createCustomOperateLog());
	}
	
	@ResponseBody
	@RequestMapping("queryYqYwx")
	@AuthLoginAnnotation
	/**
	 * 获取业务线延期
	 * @return
	 * @throws Exception
	 */
	public DataResult<List<YwxyqInfoExtend>> queryYqYwx() throws Exception{
		YwxyqInfoExtend queryYwxyqInfoExtend=new YwxyqInfoExtend();
		queryYwxyqInfoExtend.setMonth(DateUtil.getCurrentMonthStr());
		return ywxyqInfoService.selectStaticsYwxyqInfo(ConditionUtil.createCondition(queryYwxyqInfoExtend),this.createCustomOperateLog());
	}
	@ResponseBody
	@RequestMapping("queryYqMonth")
	@AuthLoginAnnotation
	/**
	 * 获取月度延期
	 * @return
	 * @throws Exception
	 */
	public DataResult<List<YwxyqInfoExtend>> queryYqMonth() throws Exception{
		YwxyqInfoExtend queryYwxyqInfoExtend=new YwxyqInfoExtend();
		queryYwxyqInfoExtend.setBeginMonth(DateUtil.getBeginMonth());
		queryYwxyqInfoExtend.setEndMonth(DateUtil.getEndMonth());
		return ywxyqInfoService.selectStaticsMonthDelayInfo(ConditionUtil.createCondition(queryYwxyqInfoExtend),this.createCustomOperateLog());
	}
	
	
	
	@ResponseBody
	@RequestMapping("queryBugYwx")
	@AuthLoginAnnotation
	/**
	 * 获取业务线BUG
	 * @return
	 * @throws Exception
	 */
	public DataResult<List<YwxbugInfoExtend>> queryBugYwx() throws Exception{
		YwxbugInfoExtend queryYwxbugInfoExtend=new YwxbugInfoExtend();
		queryYwxbugInfoExtend.setMonth(DateUtil.getCurrentMonthStr());
		return ywxbugInfoService.selectStaticsYwxbugInfo(ConditionUtil.createCondition(queryYwxbugInfoExtend),this.createCustomOperateLog());
	}
	@ResponseBody
	@RequestMapping("queryBugMonth")
	@AuthLoginAnnotation
	/**
	 * 获取月度延期
	 * @return
	 * @throws Exception
	 */
	public DataResult<List<YwxbugInfoExtend>> queryBugMonth() throws Exception{
		YwxbugInfoExtend queryYwxbugInfoExtend=new YwxbugInfoExtend();
		queryYwxbugInfoExtend.setBeginMonth(DateUtil.getBeginMonth());
		queryYwxbugInfoExtend.setEndMonth(DateUtil.getEndMonth());
		return ywxbugInfoService.selectStaticsMonthBugInfo(ConditionUtil.createCondition(queryYwxbugInfoExtend),this.createCustomOperateLog());
	}
}
