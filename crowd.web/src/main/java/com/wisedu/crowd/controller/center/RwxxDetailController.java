package com.wisedu.crowd.controller.center;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wisedu.crowd.common.code.HttpCodeEnum;
import com.wisedu.crowd.common.code.RwxqlxEnum;
import com.wisedu.crowd.common.code.RwxsEnum;
import com.wisedu.crowd.common.code.RwztStateEnum;
import com.wisedu.crowd.common.code.YhxxShztEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.datacode.xtgl.XtcsbTypeEnum;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.rwgl.RwjbxxInfo;
import com.wisedu.crowd.entity.rwgl.RwtbxxInfo;
import com.wisedu.crowd.entity.rwgl.XmjbxxInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxExtInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwtbxxInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.XmjbxxInfoExtend;
import com.wisedu.crowd.entity.xtgl.extend.XtcsbInfoExtend;
import com.wisedu.crowd.entity.yhgl.XqfxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.KfzxxInfoExtend;
import com.wisedu.crowd.entity.yhgl.extend.XqfxxExtInfoExtend;
import com.wisedu.crowd.entity.yhgl.extend.XqfxyjfInfoExtend;
import com.wisedu.crowd.interceptor.AuthIsKfzAnnotation;
import com.wisedu.crowd.interceptor.AuthIsXqfAnnotation;
import com.wisedu.crowd.interceptor.AuthLoginAnnotation;
import com.wisedu.crowd.interceptor.AuthXqfAnnotation;
import com.wisedu.crowd.service.rwgl.RwjbxxExtInfoService;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.rwgl.RwtbxxInfoService;
import com.wisedu.crowd.service.rwgl.XmjbxxInfoService;
import com.wisedu.crowd.service.xtgl.XtcsbInfoService;
import com.wisedu.crowd.service.yhgl.XqfxxExtInfoService;
import com.wisedu.crowd.service.yhgl.XqfxxInfoService;
import com.wisedu.crowd.service.yhgl.XqfxyjfInfoService;

@Controller
@RequestMapping("rwxxDetail")
public class RwxxDetailController extends BaseController{

	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	@Autowired
	private RwtbxxInfoService rwtbxxInfoService;
	@Autowired
	private RwjbxxExtInfoService rwjbxxExtInfoService;
	@Autowired
	private XqfxxInfoService xqfxxInfoService;
	
	@Autowired
	private XqfxxExtInfoService xqfxxExtInfoService;
	@Autowired
	private XtcsbInfoService xtcsbInfoService;
	@Autowired
	private XqfxyjfInfoService xqfxyjfInfoService;
	
	@RequestMapping("index")
	public ModelAndView index(String rwid) throws Exception{
		ModelAndView mv=new ModelAndView();
		mv.addObject("rwid", rwid);
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setWid(rwid);
		DataResult<List<RwjbxxInfoExtend>>  datas=rwjbxxInfoService.selectDisplayByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend));
		String xqfId="";
		if(datas!=null && CommonUtil.isNotEmptyList(datas.getDatas())){
			mv.addObject("rwjbxx", datas.getDatas().get(0));
			xqfId=datas.getDatas().get(0).getXqfid();
		}
		RwtbxxInfoExtend queryRwtbxxInfoExtend=new RwtbxxInfoExtend();
		queryRwtbxxInfoExtend.setRwid(rwid);
		DataResult<List<RwtbxxInfoExtend>> rwtbxxData=rwtbxxInfoService.selectDisplayByCondition(ConditionUtil.createCondition(queryRwtbxxInfoExtend));
		mv.addObject("isXqf",this.isXqf());
		if(this.isXqf()){
			mv.addObject("xqfId", this.getXqfxx().getWid());
		}
		mv.addObject("rwtbxxCount",rwtbxxData.getDatas()!=null?rwtbxxData.getDatas().size():0);
		mv.addObject("rwtbxx",rwtbxxData.getDatas());
		if(this.getKfzxx()!=null){
		queryRwtbxxInfoExtend.setKfzid(this.getKfzxx().getWid());
		 DataResult<Integer> countData=rwtbxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwtbxxInfoExtend));
		 if(StringUtil.toInt(countData.getDatas())>0){
			 mv.addObject("hasTb",true);
		 }else{
			 mv.addObject("hasTb",false);
		 }
		}else{
			mv.addObject("hasTb",false);
		}
		if(!StringUtil.isEmpty(xqfId)){
			DataResult<XqfxxInfo> xqfxxData=xqfxxInfoService.selectByPrimaryKey(xqfId,this.createCustomOperateLog());
			mv.addObject("xqfxx",xqfxxData.getDatas());
/*			XqfxxExtInfoExtend queryXqfxxExtInfoExtend=new XqfxxExtInfoExtend();
			queryXqfxxExtInfoExtend.setXqfid(xqfId);
			DataResult<List<XqfxxExtInfoExtend>> xqfxxExtInfoExtendDatas=xqfxxExtInfoService.selectByCondition(ConditionUtil.createCondition(queryXqfxxExtInfoExtend), this.createCustomOperateLog());
			Integer score=100;
			if(CommonUtil.isNotEmptyList(xqfxxExtInfoExtendDatas.getDatas())){
				score=xqfxxExtInfoExtendDatas.getDatas().get(0).getScore();
			}*/
			XqfxyjfInfoExtend queryXqfxyjfInfoExtend=new XqfxyjfInfoExtend();
			queryXqfxyjfInfoExtend.setXqfid(xqfId);
			DataResult<List<XqfxyjfInfoExtend>> xqfxyjfInfoExtendDatas=xqfxyjfInfoService.selectByCondition(ConditionUtil.createCondition(queryXqfxyjfInfoExtend), this.createCustomOperateLog());
			Integer score=100;
			if(CommonUtil.isNotEmptyList(xqfxyjfInfoExtendDatas.getDatas())){
				score = xqfxyjfInfoExtendDatas.getDatas().get(0).getScore().intValue();
			}
			mv.addObject("score",score);
			
		}
		XtcsbInfoExtend queryXtcsbInfoExtend = new XtcsbInfoExtend();
		queryXtcsbInfoExtend.setCsmc(XtcsbTypeEnum.XMGL_TBJGHDBL.getCode());
		DataResult<List<XtcsbInfoExtend>> xtcsbInfoDatas = xtcsbInfoService.selectByCondition(queryXtcsbInfoExtend);
		mv.addObject("fdxt", xtcsbInfoDatas.getDatas().get(0).getCsz());
		mv.setViewName("center/rwxx_detail");
		return mv;
	}
	/**
	 * 退出投标
	 * @param rwid
	 * @return
	 * @throws Exception
	 */
	@AuthLoginAnnotation
	@ResponseBody
	@RequestMapping("outTb")
	public DataResult<Integer> outTb(String rwid) throws Exception{
		return rwjbxxInfoService.outTb(rwid, this.createCustomOperateLog());
	}
	@RequestMapping("rwjbxxExt")
	@ResponseBody
	public DataResult<RwjbxxExtInfoExtend> queryXmjbxxByXmbh(String rwid) throws Exception{
		RwjbxxExtInfoExtend queryRwjbxxExtInfoExtend=new RwjbxxExtInfoExtend();
		queryRwjbxxExtInfoExtend.setRwid(rwid);
		List<RwjbxxExtInfoExtend> datas=rwjbxxExtInfoService.selectDisplayByCondition(ConditionUtil.createCondition(queryRwjbxxExtInfoExtend), this.createCustomOperateLog()).getDatas();
		if(CommonUtil.isNotEmptyList(datas)){
			return DataResult.success(datas.get(0));
		}else{
			return DataResult.success(null);
		}
	}
	@RequestMapping("queryRwxx")
	@ResponseBody
	
	public DataResult<RwjbxxInfoExtend> queryRwjbxxDetail(String rwid){
		
		
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setWid(rwid);
		DataResult<List<RwjbxxInfoExtend>>  datas=rwjbxxInfoService.selectDisplayByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend));
		if(datas!=null && CommonUtil.isNotEmptyList(datas.getDatas())){
			return DataResult.success(datas.getDatas().get(0));
		}
		return DataResult.error("该需求不存在");
	}
	@RequestMapping("queryRwtbxx")
	@ResponseBody
	@AuthIsXqfAnnotation
	public DataResult<List<RwtbxxInfoExtend>> queryRwtbxxList(String rwid) throws Exception{
		DataResult<RwjbxxInfo>  rwjbxxInfoDatas=rwjbxxInfoService.selectByPrimaryKey(rwid);
		if(rwjbxxInfoDatas.getDatas()==null){
			throw new ServiceException("该需求不存在，请重新确认！");
		}
		if(!rwjbxxInfoDatas.getDatas().getXqfid().equals(this.getXqfxx().getWid())){
			throw new ServiceException("您不是该需求的发布者，无权查看该需求的投标信息！");
		}
		RwtbxxInfoExtend queryRwtbxxInfoExtend=new RwtbxxInfoExtend();
		queryRwtbxxInfoExtend.setRwid(rwid);
		return rwtbxxInfoService.selectDisplayByCondition(ConditionUtil.createCondition(queryRwtbxxInfoExtend));
	}
	
	@ResponseBody
	@RequestMapping(value="doTb",method=RequestMethod.POST)
	@AuthIsKfzAnnotation
	public DataResult<Integer> doTb(String rwid) throws Exception{
		checkTb();
		rwjbxxInfoService.doTb(rwid, this.createCustomOperateLog());
		return DataResult.success(1);
	}
	@ResponseBody
	@RequestMapping(value="toTb",method=RequestMethod.POST)
	@AuthIsKfzAnnotation
	public DataResult<Integer> toTb(RwtbxxInfo rwtbxxInfo) throws Exception{
		checkTb();
		return rwjbxxInfoService.toTb(rwtbxxInfo, this.createCustomOperateLog());
		
	}
	
	private void checkTb() throws ServiceException{
		if(StringUtil.isEmpty(this.getYhId())){
			throw new ServiceException(HttpCodeEnum.NOT_LOGIN.getCode(),HttpCodeEnum.NOT_LOGIN.getName());
		}
		if(this.getKfzxx()==null){
			throw new ServiceException(HttpCodeEnum.IS_NOT_KFZ.getCode(),HttpCodeEnum.IS_NOT_KFZ.getName());
		}
		KfzxxInfoExtend kfzxxInfoExtend=this.getKfzxx();
		if(YhxxShztEnum.CG.getCode().equals(kfzxxInfoExtend.getShzt())){
			throw new ServiceException(HttpCodeEnum.KFZ_SFRZ_NOT_SUBMIT.getCode(),HttpCodeEnum.KFZ_SFRZ_NOT_SUBMIT.getName());
		}else if(YhxxShztEnum.DSH.getCode().equals(kfzxxInfoExtend.getShzt())){
			throw new ServiceException(HttpCodeEnum.KFZ_SFRZ_PASSING.getCode(),HttpCodeEnum.KFZ_SFRZ_PASSING.getName());
		}else if(YhxxShztEnum.WTG.getCode().equals(kfzxxInfoExtend.getShzt())){
			throw new ServiceException(HttpCodeEnum.KFZ_SFRZ_NOT_PASS.getCode(),HttpCodeEnum.KFZ_SFRZ_NOT_PASS.getName());
		}
	}
	
	@ResponseBody
	@RequestMapping(value="queryNewRwxx",method=RequestMethod.GET)
	public DataResult<List<RwjbxxInfoExtend>> queryNewRwxx(Integer pageSize){
		QueryCondition<RwjbxxInfoExtend> queryCondition=new QueryCondition<RwjbxxInfoExtend>();
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setRwlx(StringUtil.toShort(RwxqlxEnum.XQ.getCode()));
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.ZBZ.getCode());
		//queryRwjbxxInfoExtend.setRwxs(RwxsEnum.KF.getCode());
		PageInfo pageInfo=new PageInfo();
		pageInfo.setPageNum(1);
		if(pageSize!=null){
			pageInfo.setPageSize(pageSize);
		}else{
			pageInfo.setPageSize(5);
		}
		
		queryCondition.setPageInfo(pageInfo);
		List<String> orders=new ArrayList<String>();
		orders.add("T_CROWD_XMGL_RWJBXX.XMYSJE DESC");
		orders.add("T_CROWD_XMGL_RWJBXX.CJSJ DESC");
		queryCondition.setOrderBy(orders);
		queryCondition.setQuery(queryRwjbxxInfoExtend);
		return rwjbxxInfoService.selectDisplayByCondition(queryCondition);
	}
	@ResponseBody
	@RequestMapping(value="selectTb",method=RequestMethod.POST)
	@AuthIsXqfAnnotation
	public DataResult<Integer> selectTb(String tbid) throws Exception{
		return rwjbxxInfoService.selectTb(tbid, this.createCustomOperateLog());
	}
}
