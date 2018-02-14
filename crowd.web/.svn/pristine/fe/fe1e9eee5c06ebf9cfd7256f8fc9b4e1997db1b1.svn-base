package com.wisedu.crowd.controller.kfzxx;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wisedu.crowd.common.code.DictionaryEnum;
import com.wisedu.crowd.common.code.NwbEnum;
import com.wisedu.crowd.common.code.RwtbztEnum;
import com.wisedu.crowd.common.code.RwztStateEnum;
import com.wisedu.crowd.common.code.XtcsEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dictionary.DictionaryInfo;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.rwgl.RwcfxxInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwcfxxInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwtbxxInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwztbglsInfoExtend;
import com.wisedu.crowd.entity.xtgl.extend.XtcsbInfoExtend;
import com.wisedu.crowd.entity.yhgl.KfzxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.KfzxxInfoExtend;
import com.wisedu.crowd.interceptor.AuthIsKfzAnnotation;
import com.wisedu.crowd.interceptor.AuthKfzAnnotation;
import com.wisedu.crowd.service.dictionary.DictionaryService;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rwgl.RwcfxxInfoService;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.rwgl.RwztbglsInfoService;
import com.wisedu.crowd.service.xtgl.XtcsbInfoService;
import com.wisedu.crowd.service.yhgl.KfzxxInfoService;

@Controller
@RequestMapping("kfzOrder")
public class KfzOrderController extends BaseController {
	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	@Autowired
	private XtcsbInfoService xtcsbInfoService; 
	
	@Autowired
	private  KfzxxInfoService kfzxxInfoService;
	@Autowired
	private RwcfxxInfoService rwcfxxInfoService;
	@Autowired
	private DictionaryService  dictionaryService;
	@Autowired
	private RwztbglsInfoService rwztbglsInfoService;
	
	@RequestMapping("index")
	@AuthKfzAnnotation
	public ModelAndView index() throws Exception{
		ModelAndView mv=new ModelAndView();
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		//开发中的学校
		QueryCondition<RwjbxxInfoExtend> condition=ConditionUtil.createCondition(queryRwjbxxInfoExtend);
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.KFZ.getCode());
		queryRwjbxxInfoExtend.setKfzid(this.getKfzxx().getWid());
		mv.addObject("kfz",rwjbxxInfoService.selectCountByCondition(condition, this.createCustomOperateLog()).getDatas());
		
		queryRwjbxxInfoExtend.setXmzt(null);
		queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.JCZ.getCode());
		queryRwjbxxInfoExtend.setMaxXmzt(RwztStateEnum.DPJ.getCode());
		mv.addObject("jxz",rwjbxxInfoService.selectCountByCondition(condition, this.createCustomOperateLog()).getDatas());
		queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.YJX.getCode());
		queryRwjbxxInfoExtend.setMaxXmzt(null);
		queryRwjbxxInfoExtend.setXmzt(null);
		mv.addObject("yjs",rwjbxxInfoService.selectCountByCondition(condition, this.createCustomOperateLog()).getDatas());
		
		queryRwjbxxInfoExtend.setKfzid(null);
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.ZBZ.getCode());
		queryRwjbxxInfoExtend.setMinXmzt(null);
		queryRwjbxxInfoExtend.setMaxXmzt(null);
		RwtbxxInfoExtend queryRwtbxxInfoExtend=new RwtbxxInfoExtend();
		queryRwtbxxInfoExtend.setKfzid(this.getKfzxx().getWid());
		queryRwjbxxInfoExtend.setRwtbxxInfoExtend(queryRwtbxxInfoExtend);
		mv.addObject("zbz",rwjbxxInfoService.selectCountByCondition(condition, this.createCustomOperateLog()).getDatas());
		
		queryRwjbxxInfoExtend.setXmzt(null);
		queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.KFZ.getCode());
		queryRwtbxxInfoExtend.setZbzt(RwtbztEnum.WZB.getCode());
		queryRwtbxxInfoExtend.setKfzid(this.getKfzxx().getWid());
		
		mv.addObject("wzb",rwjbxxInfoService.selectCountByCondition(condition, this.createCustomOperateLog()).getDatas());
		
		List<DictionaryInfo> sjdList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_SJD);
		mv.addObject("sjdList", sjdList);
		
		XtcsbInfoExtend xtcsbInfoExtend=new XtcsbInfoExtend();
		xtcsbInfoExtend.setCsmc(XtcsEnum.RWCS_SQBL.getCode());
		DataResult<List<XtcsbInfoExtend>> rwcsSqblDatas=xtcsbInfoService.selectByCondition(xtcsbInfoExtend);
		mv.addObject("rwcfsqbl", rwcsSqblDatas.getDatas().get(0).getCsz());
		mv.addObject("isnbkfz", NwbEnum.NB.getCode().equals(this.getKfzxx().getKfzlb())?true:false);
		mv.setViewName("kfzgl/rwgl/order");
		return mv;
	}
	
	@RequestMapping("kfzxxs")
	@ResponseBody
	@AuthIsKfzAnnotation
	public DataResult<List<KfzxxInfoExtend>> queryKfzxxs(String condition) throws Exception{
		if(StringUtil.isEmpty(condition)){
			List<KfzxxInfoExtend> listInfo=new  ArrayList<KfzxxInfoExtend>();
			return DataResult.success(listInfo);
		}
		KfzxxInfoExtend queryKfzxxInfoExtend=new KfzxxInfoExtend();
		queryKfzxxInfoExtend.setCondition(condition);
		queryKfzxxInfoExtend.setKfzlb(NwbEnum.NB.getCode());
		PageInfo pageInfo=new PageInfo();
		pageInfo.setPageNum(1);
		QueryCondition<KfzxxInfoExtend> queryCondition=ConditionUtil.createCondition(queryKfzxxInfoExtend);
		queryCondition.setPageInfo(pageInfo);
		return kfzxxInfoService.selectByCondition(queryCondition, this.createCustomOperateLog());
	}
	@RequestMapping("orders")
	@ResponseBody
	@AuthKfzAnnotation
	public DataResult<List<RwjbxxInfoExtend>> queryOrders(String state,Integer pageNum,Integer pageSize,String serchCondition){
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		
		queryRwjbxxInfoExtend.setNeedXqfxx(true);
		queryRwjbxxInfoExtend.setNeedBugZrr(true);
		if(!StringUtil.isEmpty(serchCondition)){
			queryRwjbxxInfoExtend.setCondition(serchCondition);
		}
		if("1".equals(state)){//开发中
			queryRwjbxxInfoExtend.setKfzid(this.getKfzxx().getWid());
			queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.KFZ.getCode());
			queryRwjbxxInfoExtend.setNeedRwcf(true);
			queryRwjbxxInfoExtend.setNeedChildByKfz(true);
		}else if("2".equals(state)){//进行中
			queryRwjbxxInfoExtend.setKfzid(this.getKfzxx().getWid());
			queryRwjbxxInfoExtend.setNeedRwcf(true);
			queryRwjbxxInfoExtend.setNeedChildByKfz(true);
			queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.JCZ.getCode());
			queryRwjbxxInfoExtend.setMaxXmzt(RwztStateEnum.DPJ.getCode());
		}else if("3".equals(state)){//已结束
			queryRwjbxxInfoExtend.setKfzid(this.getKfzxx().getWid());
			List<String> xmzts=new ArrayList<String>();
			queryRwjbxxInfoExtend.setXmzt(null);
			queryRwjbxxInfoExtend.setNeedRwcf(true);
			queryRwjbxxInfoExtend.setNeedChildByKfz(true);
			queryRwjbxxInfoExtend.setMaxXmzt(RwztStateEnum.YGB.getCode());
			queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.YJX.getCode());
		}else if("4".equals(state)){//招标中
			queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.ZBZ.getCode());
			RwtbxxInfoExtend queryRwtbxxInfoExtend=new RwtbxxInfoExtend();
			queryRwtbxxInfoExtend.setKfzid(this.getKfzxx().getWid());
			queryRwjbxxInfoExtend.setRwtbxxInfoExtend(queryRwtbxxInfoExtend);
		}else if("5".equals(state)){//未中标
			queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.KFZ.getCode());
			RwtbxxInfoExtend queryRwtbxxInfoExtend=new RwtbxxInfoExtend();
			queryRwtbxxInfoExtend.setZbzt(RwtbztEnum.WZB.getCode());
			queryRwtbxxInfoExtend.setKfzid(this.getKfzxx().getWid());
			queryRwjbxxInfoExtend.setRwtbxxInfoExtend(queryRwtbxxInfoExtend);
		}
		
		QueryCondition<RwjbxxInfoExtend> condition=ConditionUtil.createCondition(queryRwjbxxInfoExtend);
		PageInfo pageInfo=new PageInfo();
		if(pageNum!=null){
			pageInfo.setPageNum(pageNum);
		}
		if(pageSize!=null){
			pageInfo.setPageSize(pageSize);
		}
		condition.setPageInfo(pageInfo);
		return rwjbxxInfoService.selectDisplayByCondition(condition);
	}
	
	
	@ResponseBody
	@RequestMapping("rwcf")
	@AuthIsKfzAnnotation
	public DataResult<Integer> rwcf(RwcfxxInfo rwcfxxInfo) throws Exception{
		return rwcfxxInfoService.saveRwcfxxInfo(rwcfxxInfo, this.createCustomOperateLog());
	}
	@ResponseBody
	@RequestMapping("rwcfHistory")
	@AuthIsKfzAnnotation
	public DataResult<List<RwcfxxInfoExtend>> rwcfHistory(String rwid) throws Exception{
		RwcfxxInfoExtend queryRwcfxxInfo=new RwcfxxInfoExtend();
		queryRwcfxxInfo.setRwid(rwid);
		return rwcfxxInfoService.selectByCondition(ConditionUtil.createCondition(queryRwcfxxInfo), this.createCustomOperateLog());
		
	}
	
	@ResponseBody
	@RequestMapping("deleteCfrw")
	@AuthIsKfzAnnotation
	public DataResult<String> deleteCfrw(String cfrwid) throws Exception{
		return rwcfxxInfoService.deleteCfrw(cfrwid, this.createCustomOperateLog());
	}
	@ResponseBody
	@RequestMapping("queryCfrw")
	@AuthIsKfzAnnotation
	public DataResult<RwcfxxInfoExtend> queryCfrw(String cfrwid) throws Exception{
		RwcfxxInfoExtend queryRwcfxxInfoExtend=new RwcfxxInfoExtend();
		queryRwcfxxInfoExtend.setWid(cfrwid);
		return DataResult.success(rwcfxxInfoService.selectByCondition(ConditionUtil.createCondition(queryRwcfxxInfoExtend), this.createCustomOperateLog()).getDatas().get(0));
		
	}
	@ResponseBody
	@RequestMapping("supply")
	@AuthIsKfzAnnotation
	public DataResult<Integer> supply(String cfrwid,String sfjs) throws Exception{
		return rwcfxxInfoService.supply(cfrwid, sfjs, this.createCustomOperateLog());
	}
	
	@RequestMapping("queryYsbtg")
	@AuthIsKfzAnnotation
	@ResponseBody
	public DataResult<RwztbglsInfoExtend> queryYsbtg(String rwid) throws Exception{
		RwztbglsInfoExtend queryRwztbglsInfoExtend=new RwztbglsInfoExtend();
		queryRwztbglsInfoExtend.setXmid(rwid);
		queryRwztbglsInfoExtend.setZt(StringUtil.toShort(RwztStateEnum.YSBTG.getCode()));
		List<RwztbglsInfoExtend> datas= rwztbglsInfoService.selectByCondition(ConditionUtil.createCondition(queryRwztbglsInfoExtend), this.createCustomOperateLog()).getDatas();
		if(CommonUtil.isNotEmptyList(datas)){
			return DataResult.success(datas.get(0));
		}
		return DataResult.success(new RwztbglsInfoExtend());
	}
}
