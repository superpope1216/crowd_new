package com.wisedu.crowd.controller.xqfxx;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wisedu.crowd.common.code.RwztStateEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.DecimalUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.rwgl.RwjbxxInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.xtgl.extend.YwxShryInfoExtend;
import com.wisedu.crowd.entity.xtgl.extend.YwxdzbInfoExtend;
import com.wisedu.crowd.interceptor.AuthIsXqfAnnotation;
import com.wisedu.crowd.interceptor.AuthXqfAnnotation;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.xtgl.YwxShryInfoService;
import com.wisedu.crowd.service.xtgl.YwxdzbInfoService;

@Controller
@RequestMapping("xqfOrder")
public class XqfOrderController extends BaseController{

	@Autowired
	private YwxShryInfoService ywxShryInfoService;
	@Autowired
	private YwxdzbInfoService ywxdzbInfoService;
	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	@RequestMapping("index")
	@AuthXqfAnnotation
	public ModelAndView index(String parentId,String tabValue,String rwState,String rwxb) throws Exception{
		ModelAndView mv=new ModelAndView();
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		QueryCondition<RwjbxxInfoExtend> condition=ConditionUtil.createCondition(queryRwjbxxInfoExtend);
		if(!StringUtil.isEmpty(parentId)){
			queryRwjbxxInfoExtend.setParentId(parentId);
		}
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.CG.getCode());
		queryRwjbxxInfoExtend.setXqfid(this.getXqfxx().getWid());
		mv.addObject("cg",rwjbxxInfoService.selectCountByCondition(condition, this.createCustomOperateLog()).getDatas());
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.DSH.getCode());
		mv.addObject("dsh",rwjbxxInfoService.selectCountByCondition(condition, this.createCustomOperateLog()).getDatas());
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.SHBTG.getCode());
		mv.addObject("shbtg",rwjbxxInfoService.selectCountByCondition(condition, this.createCustomOperateLog()).getDatas());
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.ZBZ.getCode());
		mv.addObject("zbz",rwjbxxInfoService.selectCountByCondition(condition, this.createCustomOperateLog()).getDatas());
		
		queryRwjbxxInfoExtend.setXmzt(null);
		queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.KFZ.getCode());
		queryRwjbxxInfoExtend.setMaxXmzt(RwztStateEnum.DPJ.getCode());
		mv.addObject("jxz",rwjbxxInfoService.selectCountByCondition(condition, this.createCustomOperateLog()).getDatas());
		queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.YJX.getCode());
		queryRwjbxxInfoExtend.setMaxXmzt(null);
		mv.addObject("yjs",rwjbxxInfoService.selectCountByCondition(condition, this.createCustomOperateLog()).getDatas());
		mv.addObject("parentId", parentId);
		mv.addObject("tabValue",StringUtil.toStr(tabValue));
		mv.addObject("rwState",StringUtil.toStr(rwState));
		mv.addObject("rwxb",StringUtil.toStr(rwxb));//查询有投标人数的需求标注
		mv.addObject("date", DateUtil.getCurrentDateStr());
		mv.setViewName("xqfgl/rwgl/order");
		return mv;
	}
	
	@RequestMapping("orders")
	@ResponseBody
	@AuthXqfAnnotation
	public DataResult<List<RwjbxxInfoExtend>> queryOrders(String states,String xmzt,String rwxb,String parentId,Integer pageNum,Integer pageSize,String serchCondition){
		if(StringUtil.isEmpty(states)){
			states="0";
		}
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setXqfid(this.getXqfxx().getWid());
		queryRwjbxxInfoExtend.setNeedKfzxx(true);
		queryRwjbxxInfoExtend.setNeedChild(true);
		queryRwjbxxInfoExtend.setNeedSumRbxx(true);
		
		if(!StringUtil.isEmpty(serchCondition)){
			queryRwjbxxInfoExtend.setCondition(serchCondition);
		}
		if(!StringUtil.isEmpty(xmzt)){
			queryRwjbxxInfoExtend.setXmzt(StringUtil.toInt(xmzt));
			
		}
		if(!StringUtil.isEmpty(rwxb) && "1".equals(rwxb)){
			queryRwjbxxInfoExtend.setNeedSumRbxx(true);
			queryRwjbxxInfoExtend.setTbSum(0);
		}
		if(!StringUtil.isEmpty(parentId)){
			queryRwjbxxInfoExtend.setParentId(parentId);
		}
		if("0".equals(states)){//全部
			queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.CG.getCode());
		}else if("1".equals(states)){
			queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.CG.getCode());
		}else if("2".equals(states)){
			queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.DSH.getCode());
		}else if("3".equals(states)){
			queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.ZBZ.getCode());
		}else if("4".equals(states)){
			queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.KFZ.getCode());
			queryRwjbxxInfoExtend.setMaxXmzt(RwztStateEnum.DPJ.getCode());
		}else if("5".equals(states)){
			queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.YJX.getCode());
		}else if("6".equals(states)){
			queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.SHBTG.getCode());
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
		DataResult<List<RwjbxxInfoExtend>> datas=rwjbxxInfoService.selectDisplayByCondition(condition);
		if(CommonUtil.isNotEmptyList(datas.getDatas())){
			for(RwjbxxInfoExtend rwjbxxInfoExtend:datas.getDatas()){
				String rbgzl=rwjbxxInfoExtend.getRbgzl();
				if(DecimalUtil.toDecimal(rwjbxxInfoExtend.getZbje()).compareTo(DecimalUtil.ZERO)!=0){
					BigDecimal bzgzl=DecimalUtil.round(DecimalUtil.mul(DecimalUtil.div(DecimalUtil.toDecimal(rbgzl),DecimalUtil.div( DecimalUtil.toDecimal(rwjbxxInfoExtend.getZbje()), ConstantsUtil.HOUR_MONEY)),DecimalUtil.ONE_HUNDRED),0);
					if(DecimalUtil.ONE_HUNDRED.compareTo(bzgzl)==-1){
						bzgzl=DecimalUtil.ONE_HUNDRED;
					}
					rwjbxxInfoExtend.setYwcbl(StringUtil.toStr(bzgzl));
				}
			}
		}
		return datas;
	}
	/**
	 * 收回需求
	 * @param rwid
	 * @return
	 * @throws Exception
	 */
	
	@RequestMapping("reback")
	@ResponseBody
	@AuthIsXqfAnnotation
	public DataResult<Integer> reback(String rwid,String shly) throws Exception{
		 return rwjbxxInfoService.reback(rwid, shly, this.createCustomOperateLog());
	}
	
	@RequestMapping("queryDate")
	@ResponseBody
	@AuthIsXqfAnnotation
	public DataResult<RwjbxxInfo> queryDate(String rwid) throws Exception{
		DataResult<RwjbxxInfo> rwjbxxInfoData=rwjbxxInfoService.selectByPrimaryKey(rwid);
		if(rwjbxxInfoData.getDatas()==null){
			throw new ServiceException("该需求不存在，请重新确认");
		}
		RwjbxxInfo rwjbxxInfo=new RwjbxxInfo();
		rwjbxxInfo.setWid(rwid);
		rwjbxxInfo.setZbjzrq(rwjbxxInfoData.getDatas().getZbjzrq());
		rwjbxxInfo.setJfrq(rwjbxxInfoData.getDatas().getJfrq());
		return DataResult.success(rwjbxxInfo);
	}
	@RequestMapping("modifyDate")
	@ResponseBody
	@AuthIsXqfAnnotation
	public DataResult<Integer> modifyDate(String wid,String zbjzrq,String jfrq) throws Exception{
		return rwjbxxInfoService.modifyDate(wid,zbjzrq, jfrq, this.createCustomOperateLog());
	}
	@RequestMapping("delete")
	@ResponseBody
	@AuthIsXqfAnnotation
	public DataResult<Integer> delete(String rwid) throws Exception{
		return rwjbxxInfoService.delete(rwid, this.createCustomOperateLog());
	}
	@RequestMapping("publishingQuestion")
	@ResponseBody
	@AuthIsXqfAnnotation
	public DataResult<Integer> publishingQuestion(String rwid,String rwmc,String xmgs,String jfrq) throws Exception{
		return rwjbxxInfoService.publishingQuestion(rwid, rwmc, xmgs, jfrq,this.createCustomOperateLog());
	}
	
	@RequestMapping("queryShr")
	@ResponseBody
	@AuthIsXqfAnnotation
	public DataResult<List<YwxShryInfoExtend>> queryShr(String rwid) throws Exception{
		RwjbxxInfo rwjbxxInfo = rwjbxxInfoService.selectByPrimaryKey(rwid).getDatas();
		YwxdzbInfoExtend queryYwxdzbInfoExtend = new YwxdzbInfoExtend();
		queryYwxdzbInfoExtend.setXywx(rwjbxxInfo.getYwxlb());

		YwxdzbInfoExtend ywxdzbInfoExtend = ywxdzbInfoService
				.selectByCondition(ConditionUtil.createCondition(queryYwxdzbInfoExtend), null).getDatas().get(0);
		YwxShryInfoExtend queryYwxShryInfoExtend = new YwxShryInfoExtend();
		queryYwxShryInfoExtend.setYwxid(ywxdzbInfoExtend.getYywx());
		return  ywxShryInfoService.selectDisplayByCondition(ConditionUtil.createCondition(queryYwxShryInfoExtend), this.createCustomOperateLog());
	}
}
