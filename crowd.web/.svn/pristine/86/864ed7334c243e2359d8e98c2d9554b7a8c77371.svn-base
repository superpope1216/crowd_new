package com.wisedu.crowd.controller.kfzxx;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisedu.crowd.common.code.DictionaryEnum;
import com.wisedu.crowd.common.code.RwxsEnum;
import com.wisedu.crowd.common.code.YhxxShztEnum;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dictionary.DictionaryInfo;
import com.wisedu.crowd.entity.dictionary.XzqhInfo;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.yhgl.KfzxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.KfzxxInfoExtend;
import com.wisedu.crowd.interceptor.AuthKfzAnnotation;
import com.wisedu.crowd.interceptor.AuthLoginAnnotation;
import com.wisedu.crowd.service.dictionary.DictionaryService;
import com.wisedu.crowd.service.dictionary.XzqhInfoService;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rel.KfzGzlbdmRelService;
import com.wisedu.crowd.service.rel.KfzRwkfkjRelService;
import com.wisedu.crowd.service.rel.KfzScjsdmRelService;
import com.wisedu.crowd.service.yhgl.KfzxxInfoService;

@Controller
@RequestMapping("kfzConfrim")
public class KfzConfirmController extends BaseController{
	

	
	@Autowired
	private DictionaryService  dictionaryService;
	
	@Autowired
	private XzqhInfoService   xzqhInfoService;
	
	@Autowired
	private KfzxxInfoService kfzxxInfoService;
	
	
	@Autowired
	private KfzRwkfkjRelService kfzRwkfkjRelService;
	
	@Autowired
	private KfzGzlbdmRelService kfzGzlbdmRelService;
	
	@Autowired
	private KfzScjsdmRelService kfzScjsdmRelService;

	@RequestMapping("index")
	@AuthKfzAnnotation
	public String index(Model model){
		
		if(StringUtil.isEmpty(this.getKfzxx().getXm())||StringUtil.isEmpty(this.getKfzxx().getNc())||StringUtil.isEmpty(this.getKfzxx().getGznx())){
			return "redirect:../kfzSupply/index";
		}
		List<DictionaryInfo> booleanList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_BOOLEAN);
		model.addAttribute("booleanList", booleanList);
		List<DictionaryInfo> gzxzList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_GZXZ);
		model.addAttribute("gzxzList", gzxzList);
		List<DictionaryInfo> gzlxList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_KFZGZLX);
		model.addAttribute("gzlxList", gzlxList);
		List<DictionaryInfo> scjsList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_KFZSCJS);
		model.addAttribute("scjsList", scjsList);
		List<DictionaryInfo> gznxList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_KFZGZNX);
		model.addAttribute("gznxList", gznxList);
		List<DictionaryInfo> rangeList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_USER_RANGE);
		model.addAttribute("rangeList", rangeList);
		List<DictionaryInfo> kxsjList=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_KFZKXSJ);
		model.addAttribute("kxsjList", kxsjList);
		List<DictionaryInfo> rwxs=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_RWXS);
		model.addAttribute("rwxsList", rwxs);
		List<DictionaryInfo> rwkfkj=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_RWKFKJ);
		model.addAttribute("rwkfkjList",rwkfkj);
		
		XzqhInfo  xzqhInfo=new XzqhInfo();
		xzqhInfo.setCc("1");
		List<XzqhInfo>  provinceList=xzqhInfoService.selectByCondition(xzqhInfo);
		model.addAttribute("provinceList", provinceList);
		xzqhInfo.setCc("2");
		List<XzqhInfo>  cityList=xzqhInfoService.selectByCondition(xzqhInfo);
		model.addAttribute("cityList", cityList);
		xzqhInfo.setCc("3");
		List<XzqhInfo>  areaList=xzqhInfoService.selectByCondition(xzqhInfo);
		model.addAttribute("areaList", areaList);
		return "kfzgl/kfzxx/confirm";
	}
	
	/**
	 *  确认页面或者注册页面     用户更新基本信息   
	 * @param kfzxxInfo
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("saveKfzxxBasicInfo")
	@AuthLoginAnnotation
	public DataResult<Integer> saveKfzxxBasicInfo(KfzxxInfoExtend kfzxxInfo) throws Exception{
		kfzxxInfo.setYhid(this.getYhId());
		if(!StringUtil.isEmpty(this.getKfzxx())&&!StringUtil.isEmpty(this.getKfzxx().getWid())){
			kfzxxInfo.setWid(this.getKfzxx().getWid());
		}
		DataResult<KfzxxInfoExtend> result=kfzxxInfoService.saveKfzxxBasicInfo(kfzxxInfo, this.createCustomOperateLog());
		kfzxxInfo=result.getDatas();
		if(!StringUtil.isEmpty(kfzxxInfo.getRwkfkj())&&RwxsEnum.KF.getCode().equals(kfzxxInfo.getRwxs())&&1==kfzxxInfo.getSfjstj()){
			kfzRwkfkjRelService.delKfzRwkfkjRel(kfzxxInfo.getWid());
			kfzRwkfkjRelService.addKfzRwkfkjRel(kfzxxInfo.getWid(), kfzxxInfo.getYhid(), kfzxxInfo.getRwkfkj());
		}else{
			kfzRwkfkjRelService.delKfzRwkfkjRel(kfzxxInfo.getWid());
		}
		
		return  DataResult.success(1);
	}
	

	/**
	 * 确认页面或者注册页面     用户更新简历信息
	 * @param kfzxxInfo
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("saveKfzxxResumeInfo")
	@AuthLoginAnnotation
	public DataResult<Integer> saveKfzxxResumeInfo(KfzxxInfoExtend kfzxxInfo) throws Exception{
		kfzxxInfo.setYhid(this.getYhId());
		if(!StringUtil.isEmpty(this.getKfzxx())&&!StringUtil.isEmpty(this.getKfzxx().getWid())){
			kfzxxInfo.setWid(this.getKfzxx().getWid());
		}
		kfzxxInfoService.saveKfzxxResumeInfo(kfzxxInfo, this.createCustomOperateLog());
		
		//更新中间表
		if(!StringUtil.isEmpty(kfzxxInfo.getScjsdm())){
			kfzScjsdmRelService.delKfzScjsdmRel(kfzxxInfo.getWid());
			kfzScjsdmRelService.addKfzScjsdmRel(kfzxxInfo.getWid(), kfzxxInfo.getYhid(), kfzxxInfo.getScjsdm());
		}else{
			kfzScjsdmRelService.delKfzScjsdmRel(kfzxxInfo.getWid());
		}
		if(!StringUtil.isEmpty(kfzxxInfo.getGzlbdm())){
			kfzGzlbdmRelService.delKfzGzlbdmRel(kfzxxInfo.getWid());
			kfzGzlbdmRelService.addKfzGzlbdmRel(kfzxxInfo.getWid(), kfzxxInfo.getYhid(), kfzxxInfo.getGzlbdm());
		}else{
			kfzGzlbdmRelService.delKfzGzlbdmRel(kfzxxInfo.getWid());
		}
		return  DataResult.success(1);
	}
	
	/**
	 * 确认页面   用户更新认证信息
	 * @param kfzxxInfo
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("saveKfzxxCardInfo")
	@AuthLoginAnnotation
	public DataResult<Integer> saveKfzxxCardInfo(KfzxxInfoExtend kfzxxInfo) throws Exception{
		kfzxxInfo.setYhid(this.getYhId());
		if(!StringUtil.isEmpty(this.getKfzxx())&&!StringUtil.isEmpty(this.getKfzxx().getWid())){
			kfzxxInfo.setWid(this.getKfzxx().getWid());
		}
		kfzxxInfoService.saveKfzxxCardInfo(kfzxxInfo, this.createCustomOperateLog());
		return  DataResult.success(1);
	}
	
	
	
	/**
	 * 注册页面 更新开发者 认证信息
	 * @param kfzxxInfo
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("saveRegisterKfzxxCardInfo")
	@AuthLoginAnnotation
	public DataResult<Integer> saveRegisterKfzxxCardInfo(KfzxxInfoExtend kfzxxInfo) throws Exception{
		kfzxxInfo.setYhid(this.getYhId());
		if(!StringUtil.isEmpty(this.getKfzxx())&&!StringUtil.isEmpty(this.getKfzxx().getWid())){
			kfzxxInfo.setWid(this.getKfzxx().getWid());
		}
		kfzxxInfoService.saveKfzxxCardInfo(kfzxxInfo, this.createCustomOperateLog());
	     
		KfzxxInfoExtend  kfzxxInfoExtend=new KfzxxInfoExtend();
		kfzxxInfoExtend.setYhid(this.getYhId());
		QueryCondition<KfzxxInfoExtend> condition=new QueryCondition<>();
		PageInfo page=PageUtil.cratePageInfo(null, null);
		condition.setPageInfo(page);
		condition.setQuery(kfzxxInfoExtend);
		DataResult<List<KfzxxInfoExtend>> result= kfzxxInfoService.selectByCondition(condition,createCustomOperateLog());
		//更新session
	    request.getSession().setAttribute(ConstantsUtil.SESSION_KFZXX, result.getDatas().get(0));
	    return  DataResult.success(1);
	}
	
	
	
	
	
	
	
}
