package com.wisedu.crowd.controller.center;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.wisedu.crowd.common.code.DictionaryEnum;
import com.wisedu.crowd.common.code.RwlbEnum;
import com.wisedu.crowd.common.code.RwxsEnum;
import com.wisedu.crowd.common.code.YesNoEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.DecimalUtil;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.cwgl.extend.KfzzhmxInfoExtend;
import com.wisedu.crowd.entity.dictionary.DictionaryInfo;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.rwgl.RwjbxxInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.statics.extend.RwjbxxDataInfoExtend;
import com.wisedu.crowd.interceptor.AuthIsKfzAnnotation;
import com.wisedu.crowd.interceptor.AuthKfzAnnotation;
import com.wisedu.crowd.service.cwgl.KfzzhmxInfoService;
import com.wisedu.crowd.service.dictionary.DictionaryService;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;

@Controller
@RequestMapping("center")
public class CenterController extends BaseController {
	@Autowired
	private DictionaryService dictionaryService;

	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	
	@AuthIsKfzAnnotation
	@RequestMapping("toIndex")
	public ModelAndView toIndex() throws Exception{
		List<DictionaryInfo> rwxsList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_RWXS, null);
		List<DictionaryInfo> ywxList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_YWXLB, null);
		List<DictionaryInfo> rwkjList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_RWKFKJ, null);
		List<DictionaryInfo> rwjbList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_RWJD_NEW, null);
		List<DictionaryInfo> rwlbList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_RWLB, null);

		ModelAndView mv = new ModelAndView();

		
		mv.setViewName("center/center");
		mv.addObject("flag", "");
		mv.addObject("rwxs", rwxsList);
		mv.addObject("ywx", ywxList);
		mv.addObject("kfkj", rwkjList);
		mv.addObject("rwjd", rwjbList);
		mv.addObject("rwlb", rwlbList);
		mv.addObject("ywxselect", "");
		mv.addObject("kfkjselect","");
		mv.addObject("condition", "");
		return mv;
	}
	@RequestMapping("index")
	public ModelAndView index(String flag,String kfkj,String ywx,String condition) throws Exception {
		List<DictionaryInfo> rwxsList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_RWXS, null);
		List<DictionaryInfo> ywxList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_YWXLB, null);
		List<DictionaryInfo> rwkjList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_RWKFKJ, null);
		List<DictionaryInfo> rwjbList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_RWJD_NEW, null);
		List<DictionaryInfo> rwlbList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_RWLB, null);

		ModelAndView mv = new ModelAndView();

		flag=StringUtil.toStr(flag);
		if(StringUtil.isEmpty(kfkj)){
			kfkj="";
		}
		if(StringUtil.isEmpty(ywx)){
			ywx="";
		}
		mv.setViewName("center/center");
		mv.addObject("flag", flag);
		mv.addObject("rwxs", rwxsList);
		mv.addObject("ywx", ywxList);
		mv.addObject("kfkj", rwkjList);
		mv.addObject("rwjd", rwjbList);
		mv.addObject("rwlb", rwlbList);
		mv.addObject("ywxselect", ywx);
		mv.addObject("kfkjselect", kfkj);
		mv.addObject("condition", condition);
		return mv;
	}

	@RequestMapping("index2")
	public ModelAndView index2() throws Exception {
		List<DictionaryInfo> rwxsList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_RWXS, null);
		List<DictionaryInfo> ywxList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_YWXLB, null);
		List<DictionaryInfo> rwkjList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_RWKFKJ, null);
		List<DictionaryInfo> rwjbList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_RWJD_NEW, null);
		ModelAndView mv = new ModelAndView();

		mv.setViewName("center/center2");
		mv.addObject("rwxs", rwxsList);
		mv.addObject("ywx", ywxList);
		mv.addObject("kfkj", rwkjList);
		mv.addObject("rwjd", rwjbList);
		return mv;
	}

	@RequestMapping("query")
	@ResponseBody
	public DataResult<List<RwjbxxInfoExtend>> queryList(String rwxs, String rwbh, String kfkj, String rwmc, String rwjd,
			String rwlb, String ywxlb, Integer startPage, Integer pageSize, String order, String orderDesc,String sfxsrw,String queryCondition) {
		QueryCondition<RwjbxxInfoExtend> condition = new QueryCondition<>();
		PageInfo page = PageUtil.cratePageInfo(startPage, pageSize);
		condition.setPageInfo(page);
		RwjbxxInfoExtend queryRwjbxxInfoExtend = new RwjbxxInfoExtend();
		if(!StringUtil.isEmpty(rwxs)){
			queryRwjbxxInfoExtend.setRwxs(rwxs);
		}
		if(!StringUtil.isEmpty(rwbh)){
			queryRwjbxxInfoExtend.setRwbh(rwbh);
		}
		if(!StringUtil.isEmpty(rwmc)){
			queryRwjbxxInfoExtend.setRwmc(rwmc);
		}
		if(!StringUtil.isEmpty(kfkj)){
			queryRwjbxxInfoExtend.setKfkj(kfkj);
		}
		if(!StringUtil.isEmpty(rwjd)){
			queryRwjbxxInfoExtend.setRwjd(rwjd);
		}
		if(!StringUtil.isEmpty(queryCondition)){
			queryRwjbxxInfoExtend.setCondition(queryCondition);
		}
		if (!StringUtil.isEmpty(rwlb)) {
			if (RwlbEnum.ALL.getCode().equals(rwlb)) {
				rwlb = "";
			}
		}
		if (!StringUtil.isEmpty(rwlb)) {
			queryRwjbxxInfoExtend.setRwlb(rwlb);
		}
		if(!StringUtil.isEmpty(sfxsrw)){
			queryRwjbxxInfoExtend.setSfxsrw(sfxsrw);
		}
		if(!StringUtil.isEmpty(ywxlb)){
			queryRwjbxxInfoExtend.setXmzywx(ywxlb);
		}
		
		condition.setQuery(queryRwjbxxInfoExtend);
		List<String> orderBy = new ArrayList<String>();

		if (!StringUtil.isEmpty(order)) {
			if ("1".equals(order)) {
				if ("1".equals(orderDesc)) {
					orderBy.add("NVL(T_CROWD_XMGL_RWJBXX.ZBJE,T_CROWD_XMGL_RWJBXX.XMYSJE) desc ");
				} else {
					orderBy.add("NVL(T_CROWD_XMGL_RWJBXX.ZBJE,T_CROWD_XMGL_RWJBXX.XMYSJE)");
				}

			} else if ("2".equals(order)) {
				if ("1".equals(orderDesc)) {
					orderBy.add("t.shtgsj desc ");
				} else {
					orderBy.add("t.shtgsj ");
				}

			}
			condition.setOrderBy(orderBy);
		}
		

		DataResult<List<RwjbxxInfoExtend>> datas = rwjbxxInfoService.selectForCenter(condition);

		if (CommonUtil.isNotEmptyList(datas.getDatas())) {
			for (RwjbxxInfoExtend rwjbxxInfo : datas.getDatas()) {
				Date startDate = rwjbxxInfo.getShtgsj();
				if (startDate == null) {
					rwjbxxInfo.setFbsj("1天前");
					continue;
				}
				Date endDate = DateUtil.getCurrentDate();

				long time = DateUtil.getMinutesBetween(startDate, endDate);
				String dw = "分";
				if (time >= 60) {
					time = DateUtil.getHoursBetween(startDate, endDate);
					dw = "小时";
					if (time >= 24) {
						time = DateUtil.getDaysBetween(DateUtil.formatDate(startDate), DateUtil.formatDate(endDate));
						dw = "天";
					}
				}
				rwjbxxInfo.setFbsj(time + dw + "前");
			}
		}
		return datas;

	}

	@RequestMapping("rwxxStatics")
	@ResponseBody
	public DataResult<String> rwxxStatics() throws Exception {
		return DataResult.success("");
	}

	@AuthKfzAnnotation
	@RequestMapping("toNeed")
	@ResponseBody
	public DataResult<Integer> toNeed() throws Exception {
		return DataResult.success(1);
	}

}
