package com.wisedu.crowd.controller.xqfxx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wisedu.crowd.common.code.NwbEnum;
import com.wisedu.crowd.common.code.PjClassifyEnum;
import com.wisedu.crowd.common.code.RwxqlxEnum;
import com.wisedu.crowd.common.code.RwztStateEnum;
import com.wisedu.crowd.common.code.XtcsEnum;
import com.wisedu.crowd.common.code.YesNoEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.rwgl.RwjbxxInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwztbglsInfoExtend;
import com.wisedu.crowd.entity.xtgl.extend.XtcsbInfoExtend;
import com.wisedu.crowd.entity.yhgl.KfzpjxxDetailInfo;
import com.wisedu.crowd.entity.yhgl.KfzpjxxInfo;
import com.wisedu.crowd.entity.yhgl.KfzxxInfo;
import com.wisedu.crowd.interceptor.AuthIsXqfAnnotation;
import com.wisedu.crowd.interceptor.AuthXqfAnnotation;
import com.wisedu.crowd.service.dictionary.DictionaryService;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.rwgl.RwztbglsInfoService;
import com.wisedu.crowd.service.xtgl.XtcsbInfoService;
import com.wisedu.crowd.service.yhgl.KfzpjxxDetailInfoService;
import com.wisedu.crowd.service.yhgl.KfzpjxxInfoService;
import com.wisedu.crowd.service.yhgl.KfzxxInfoService;

@Controller
@RequestMapping("xqfOrderAction")
public class XqfOrderActionController extends BaseController {

	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	@Autowired
	private XtcsbInfoService xtcsbInfoService;
	
	@Autowired
	private KfzxxInfoService kfzxxInfoService;
	
	@Autowired
	private DictionaryService dictionaryService;
	@Autowired
	private RwztbglsInfoService rwztbglsInfoService;
	
	@Autowired
	private KfzpjxxInfoService kfzpjxxInfoService;
	@Autowired
	private KfzpjxxDetailInfoService kfzpjxxDetailInfoService;
	@RequestMapping("index")
	@AuthXqfAnnotation
	public ModelAndView index(String rwid,HttpServletRequest request) throws Exception{
		ModelAndView mv=new ModelAndView();
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setWid(rwid);
		queryRwjbxxInfoExtend.setNeedKfzxx(true);
		queryRwjbxxInfoExtend.setNeedXqfxx(true);
		DataResult<List<RwjbxxInfoExtend>> rwjbxxDatas=rwjbxxInfoService.selectDisplayByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend));
		if(CommonUtil.isNotEmptyList(rwjbxxDatas.getDatas())){
			RwjbxxInfoExtend rwjbxxInfo=rwjbxxDatas.getDatas().get(0);
			mv.addObject("rwjbxx", rwjbxxInfo);
			if(!StringUtil.isEmpty(rwjbxxInfo.getKfzid())){
				DataResult<KfzxxInfo> kfzxxInfoDatas=kfzxxInfoService.selectByPrimaryKey(rwjbxxInfo.getKfzid(), this.createCustomOperateLog());
				if(kfzxxInfoDatas.getDatas()!=null){
					XtcsbInfoExtend queryXtcsbInfoExtend1=new XtcsbInfoExtend();
					XtcsbInfoExtend queryXtcsbInfoExtend2=new XtcsbInfoExtend();
					if(NwbEnum.NB.getCode().equals(kfzxxInfoDatas.getDatas().getKfzlb())){//内部开发者
						queryXtcsbInfoExtend1.setCsmc(XtcsEnum.NBKFZ_XMGL_XMYSJDFKBL.getCode());
						queryXtcsbInfoExtend2.setCsmc(XtcsEnum.NBKFZ_XMGL_YYPTYJSQBL.getCode());
					}else{
						queryXtcsbInfoExtend1.setCsmc(XtcsEnum.WBKFZ_XMGL_XMYSJDFKBL.getCode());
						queryXtcsbInfoExtend2.setCsmc(XtcsEnum.WBKFZ_XMGL_YYPTYJSQBL.getCode());
					}
					DataResult<List<XtcsbInfoExtend>> xmyssqblDatas=xtcsbInfoService.selectByCondition(queryXtcsbInfoExtend1);
					DataResult<List<XtcsbInfoExtend>> yyptsqblDatas=xtcsbInfoService.selectByCondition(queryXtcsbInfoExtend2);
					mv.addObject("xmyssqbl", xmyssqblDatas.getDatas().get(0).getCsz());
					mv.addObject("yyptsqblDatas", yyptsqblDatas.getDatas().get(0).getCsz());
				}
			}
			Map<String,Object> rwxsMap=dictionaryService.selectRwxsByBm(rwjbxxInfo.getRwxs());
			boolean needSh=false;
			if(StringUtil.toStr(rwxsMap.get("SFXQRWLX")).equals(YesNoEnum.YES.getCode())){
				needSh=true;
			}
			if(needSh){
				if(RwxqlxEnum.BUG.getCode().equals(StringUtil.toStr(rwjbxxInfo.getRwlx()))){//BUG类不需要售后
					needSh=false;
				}
			}
			if(needSh){
				XtcsbInfoExtend queryXtcsbInfoExtend=new XtcsbInfoExtend();
				queryXtcsbInfoExtend.setCsmc(XtcsEnum.NOT_NEED_SH.getCode());
				DataResult<List<XtcsbInfoExtend>> notNeedShDatas=xtcsbInfoService.selectByCondition(queryXtcsbInfoExtend);
				if(CommonUtil.isNotEmptyList(notNeedShDatas.getDatas())){
					if(rwjbxxInfo.getXmysje()<=StringUtil.toLong(notNeedShDatas.getDatas().get(0).getCsz())){
						needSh=false;
					}
				}
			}
			mv.addObject("sfxysh",needSh);
		}
		long token=DateUtil.getCurrentFormatDate().getTime();
		mv.addObject("token",token);
		request.getSession().setAttribute(ConstantsUtil.TOKEN, token);
		
		RwztbglsInfoExtend queryRwztbglsInfoExtend=new RwztbglsInfoExtend();
		queryRwztbglsInfoExtend.setXmid(rwid);
		queryRwztbglsInfoExtend.setZt(StringUtil.toShort(RwztStateEnum.YSZ.getCode()));
		mv.addObject("ysz", rwztbglsInfoService.selectByCondition(ConditionUtil.createCondition(queryRwztbglsInfoExtend, new PageInfo(1,1), Arrays.asList("t_crowd_xmgl_rwztbgls.CZSJ DESC")), this.createCustomOperateLog()).getDatas());
		
		queryRwztbglsInfoExtend.setZt(StringUtil.toShort(RwztStateEnum.SHZ.getCode()));
		mv.addObject("ystg", rwztbglsInfoService.selectByCondition(ConditionUtil.createCondition(queryRwztbglsInfoExtend, new PageInfo(1,1), Arrays.asList("t_crowd_xmgl_rwztbgls.CZSJ DESC")), this.createCustomOperateLog()).getDatas());
		queryRwztbglsInfoExtend.setZt(null);
		List<Short> zts=new ArrayList<Short>();
		zts.add(StringUtil.toShort(RwztStateEnum.SHZ.getCode()));
		zts.add(StringUtil.toShort(RwztStateEnum.SHJSDQR.getCode()));
		mv.addObject("sqshjs", rwztbglsInfoService.selectByCondition(ConditionUtil.createCondition(queryRwztbglsInfoExtend, new PageInfo(1,1), Arrays.asList("t_crowd_xmgl_rwztbgls.CZSJ DESC")), this.createCustomOperateLog()).getDatas());
		queryRwztbglsInfoExtend.setZts(null);
		queryRwztbglsInfoExtend.setZt(StringUtil.toShort(RwztStateEnum.DPJ.getCode()));
		mv.addObject("shjs", rwztbglsInfoService.selectByCondition(ConditionUtil.createCondition(queryRwztbglsInfoExtend, new PageInfo(1,1), Arrays.asList("t_crowd_xmgl_rwztbgls.CZSJ DESC")), this.createCustomOperateLog()).getDatas());
		
		KfzpjxxDetailInfo queryKfzpjxxDetailInfo=new KfzpjxxDetailInfo();
		queryKfzpjxxDetailInfo.setSsxmid(rwid);
		DataResult<List<KfzpjxxDetailInfo>>  kfzpjxxDetailInfoDatas=kfzpjxxDetailInfoService.selectByCondition(ConditionUtil.createCondition(queryKfzpjxxDetailInfo), this.createCustomOperateLog());
		if(CommonUtil.isNotEmptyList(kfzpjxxDetailInfoDatas.getDatas())){
			for(KfzpjxxDetailInfo kfzpjxxDetailInfo:kfzpjxxDetailInfoDatas.getDatas()){
				if(PjClassifyEnum.KFZL.getCode().equals(kfzpjxxDetailInfo.getZbid())){
					mv.addObject("kfzl", kfzpjxxDetailInfo.getDf());
				}else if(PjClassifyEnum.FWZL.getCode().equals(kfzpjxxDetailInfo.getZbid())){
					mv.addObject("fwzl", kfzpjxxDetailInfo.getDf());
				}else if(PjClassifyEnum.XYSU.getCode().equals(kfzpjxxDetailInfo.getZbid())){
					mv.addObject("xysd", kfzpjxxDetailInfo.getDf());
				} 
			}
		}
		//获取需求方对开发者的评价结果
		KfzpjxxInfo queryKfzpjxxInfo=new KfzpjxxInfo();
		queryKfzpjxxInfo.setSsxmid(rwid);
		DataResult<List<KfzpjxxInfo>> kfzpjxxInfoDatas= kfzpjxxInfoService.selectByCondition(ConditionUtil.createCondition(queryKfzpjxxInfo), this.createCustomOperateLog());
		if(CommonUtil.isNotEmptyList(kfzpjxxInfoDatas.getDatas())){
			mv.addObject("pjnr", kfzpjxxInfoDatas.getDatas().get(0).getPjnr());
		}
		mv.setViewName("xqfgl/rwgl/orderAction");
		return mv;
	}
	
	@RequestMapping("checkAccept")
	@ResponseBody
	public DataResult<Boolean> checkAccept(String rwid) throws Exception{
		return rwjbxxInfoService.checkAccept(rwid, this.createCustomOperateLog());
	}
	
	/**
	 * 验收
	 * @param rwid
	 * @param pjjg
	 * @param bz
	 * @param kfzl
	 * @param fwzl
	 * @param xysd
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("accept")
	@ResponseBody
	@AuthIsXqfAnnotation
	public DataResult<Integer> accept(String rwid,String pjjg,String bz,Float kfzl,Float fwzl,Float xysd,String token,HttpServletRequest request) throws Exception{
		if(StringUtil.isEmpty(token)){
			throw new ServiceException("token不能为空！");
		}
		
		String sessionToken=StringUtil.toStr(request.getSession().getAttribute(ConstantsUtil.TOKEN));
		if(token.equals(sessionToken)){
			DataResult<Integer> datas=rwjbxxInfoService.accept(rwid, pjjg, bz, kfzl, fwzl, xysd, this.createCustomOperateLog());
			request.getSession().setAttribute(ConstantsUtil.TOKEN, "");
			return datas;
		}
		return DataResult.success(1);
	}
	/**
	 * 售后结束
	 * @param rwid
	 * @param pjjg
	 * @param bz
	 * @param kfzl
	 * @param fwzl
	 * @param xysd
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("saleEnd")
	@ResponseBody
	@AuthIsXqfAnnotation
	public DataResult<Integer> saleEnd(String rwid,String pjjg,String bz,Float kfzl,Float fwzl,Float xysd,String token,HttpServletRequest request) throws Exception{
		if(StringUtil.isEmpty(token)){
			throw new ServiceException("token不能为空！");
		}
		String sessionToken=StringUtil.toStr(request.getSession().getAttribute(ConstantsUtil.TOKEN));
		if(token.equals(sessionToken)){
			DataResult<Integer> datas= rwjbxxInfoService.saleEnd(rwid, pjjg, bz, kfzl, fwzl, xysd, this.createCustomOperateLog());
			request.getSession().setAttribute(ConstantsUtil.TOKEN, "");
			return datas;
		}
		return DataResult.success(1);
	}
	@RequestMapping("pj")
	@ResponseBody
	@AuthIsXqfAnnotation
	public DataResult<Integer> pj(String rwid,String bz,Float kfzl,Float fwzl,Float xysd,String token,HttpServletRequest request ) throws Exception{
		if(StringUtil.isEmpty(token)){
			throw new ServiceException("token不能为空！");
		}
		String sessionToken=StringUtil.toStr(request.getSession().getAttribute(ConstantsUtil.TOKEN));
		if(token.equals(sessionToken)){
			DataResult<Integer> datas=rwjbxxInfoService.xqfDoPj(rwid, bz, kfzl, fwzl, xysd, this.createCustomOperateLog());
			request.getSession().setAttribute(ConstantsUtil.TOKEN, "");
			return datas;
		}
		return DataResult.success(1);
				
	}
}
