package com.wisedu.crowd.controller.yhgl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wisedu.crowd.common.exception.ResponseCode;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.dto.Result;
import com.wisedu.crowd.entity.yhgl.YhjbxxExtInfo;
import com.wisedu.crowd.entity.yhgl.YhjbxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.YhjbxxExtInfoExtend;
import com.wisedu.crowd.service.yhgl.YhjbxxExtInfoService;
import com.wisedu.crowd.service.yhgl.YhjbxxInfoService;

@Controller
@RequestMapping("yhjbxx")
public class YhjbxxController extends BaseController {

	@Autowired
	private YhjbxxInfoService yhjbxxService;
	@Autowired
	private YhjbxxExtInfoService yhjbxxExtInfoService;
	@RequestMapping("index")
	public String index(){
		ModelAndView mv=new ModelAndView();
		YhjbxxExtInfoExtend queryYhjbxxExtInfoExtend=new YhjbxxExtInfoExtend();
		queryYhjbxxExtInfoExtend.setYhid(this.getYhId());
		List<YhjbxxExtInfoExtend> datas=yhjbxxExtInfoService.selectByCondition(queryYhjbxxExtInfoExtend);
		if(CommonUtil.isNotEmptyList(datas)){
			mv.addObject("yhjbxxExt",datas.get(0));
		}else{
			mv.addObject("yhjbxxExt", new YhjbxxExtInfoExtend());
		}
		
		return "yhgl/yhjbxx";
	}
	
	
	/**
	 * 
	 * @param yhjbxxInfo
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("save")
	public Result save(@Validated() YhjbxxExtInfo yhjbxxExtInfo,BindingResult result) throws Exception{
		if(result.hasErrors()){
			throw new ServiceException(ResponseCode.error.getMsg());
		}
		yhjbxxExtInfo.setYhid(this.getYhId());
		yhjbxxExtInfoService.saveYhjbxxExtInfo(yhjbxxExtInfo, this.createCustomOperateLog());
		return Result.success();
	}
}
