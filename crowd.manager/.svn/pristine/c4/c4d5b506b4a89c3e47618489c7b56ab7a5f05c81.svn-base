package com.wisedu.crowd.controller.login;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisedu.crowd.common.code.YesNoEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.common.util.DecimalUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.role.GroupUserInfo;
import com.wisedu.crowd.entity.role.extend.GroupInfoExtend;
import com.wisedu.crowd.entity.role.extend.GroupUserInfoExtend;
import com.wisedu.crowd.entity.yhgl.YhjbxxViewInfo;
import com.wisedu.crowd.entity.yhgl.extend.YhjbxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.role.GroupInfoService;
import com.wisedu.crowd.service.role.GroupUserInfoService;
import com.wisedu.crowd.service.yhgl.YhjbxxInfoService;
import com.wisedu.crowd.service.yhgl.YhjbxxViewInfoService;

@Controller
@RequestMapping("login")
public class LoginController extends BaseController{

	@Autowired
	private YhjbxxInfoService yhjbxxInfoService;
	@Autowired
	private GroupUserInfoService groupUserInfoService;
	@Autowired
	private GroupInfoService groupInfoService;
	@Autowired
	private YhjbxxViewInfoService yhjbxxViewInfoService;
	
	@RequestMapping("login")
	@ResponseBody
	public DataResult<Integer> login(@RequestParam String username,@RequestParam String password,HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataResult<YhjbxxInfoExtend> yhjbxxInfoExtend=yhjbxxInfoService.loginAdmin(username, password, this.createCustomOperateLog());
		request.getSession(true).invalidate();
		request.getSession().setAttribute(ConstantsUtil.SESSION_YHJBXX, yhjbxxInfoExtend.getDatas());
		
		YhjbxxViewInfo queryYhjbxxViewInfo=new YhjbxxViewInfo();
		queryYhjbxxViewInfo.setYhid(yhjbxxInfoExtend.getDatas().getWid());
		List<YhjbxxViewInfo> lstYhjbxxView=yhjbxxViewInfoService.selectDisplayByCondition(ConditionUtil.createCondition(queryYhjbxxViewInfo), this.createCustomOperateLog()).getDatas();
		if(CommonUtil.isNotEmptyList(lstYhjbxxView)){
			GroupUserInfoExtend queryGroupUserInfoExtend=new GroupUserInfoExtend();
			queryGroupUserInfoExtend.setYhid(lstYhjbxxView.get(0).getWid());
			List<GroupUserInfoExtend> lstGroupUser=groupUserInfoService.selectDisplayByCondition(ConditionUtil.createCondition(queryGroupUserInfoExtend), this.createCustomOperateLog()).getDatas();
			//request.getSession().setAttribute(ConstantsUtil.SESSION_GROUP_YHZ, lstGroupUser);
			if(CommonUtil.isNotEmptyList(lstGroupUser)){
				List<String> lstYhz=new ArrayList<String>();
				for(GroupUserInfoExtend groupUserInfoExtend:lstGroupUser){
					lstYhz.add(groupUserInfoExtend.getYhzid());
				}
				GroupInfoExtend queryGroupInfoExtend=new GroupInfoExtend();
				queryGroupInfoExtend.setWids(lstYhz);
				queryGroupInfoExtend.setSfsy(DecimalUtil.toDecimal(YesNoEnum.YES.getCode()));
				List<GroupInfoExtend> lstGroupInfo=groupInfoService.selectDisplayByCondition(ConditionUtil.createCondition(queryGroupInfoExtend), this.createCustomOperateLog()).getDatas();
				if(CommonUtil.isNotEmptyList(lstGroupInfo)){
					request.getSession().setAttribute(ConstantsUtil.SESSION_GROUP_YHZ, lstGroupInfo);
					request.getSession().setAttribute(ConstantsUtil.SESSION_GROUP_CURRENT_YHZ, lstGroupInfo.get(0));
				}
			}
		}
		return DataResult.success(1);
	}
}
