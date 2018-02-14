package com.wisedu.crowd.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisedu.crowd.common.code.RwlbEnum;
import com.wisedu.crowd.common.code.RwztStateEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.DecimalUtil;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.statics.extend.RwjbxxDataInfoExtend;
import com.wisedu.crowd.entity.yhgl.extend.KfzxxInfoExtend;
import com.wisedu.crowd.entity.yhgl.extend.XqfxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.statics.RwjbxxDataInfoService;
import com.wisedu.crowd.service.yhgl.KfzxxInfoService;
import com.wisedu.crowd.service.yhgl.XqfxxInfoService;

@Controller
@RequestMapping("first")
public class FirstController extends BaseController{

	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	@Autowired
	private KfzxxInfoService kfzxxInfoService;
	@Autowired
	private XqfxxInfoService xqfxxInfoService;
	
	@Autowired
	private RwjbxxDataInfoService rwjbxxDataInfoService;
	
	
	@RequestMapping("queryList")
	@ResponseBody
	public DataResult<List<RwjbxxInfoExtend>> queryNewRwjbxx() throws Exception{
		
		QueryCondition<RwjbxxInfoExtend> condition = new QueryCondition<>();
		PageInfo page = PageUtil.cratePageInfo(1,10);
		condition.setPageInfo(page);
		RwjbxxInfoExtend queryRwjbxxInfoExtend = new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.ZBZ.getCode());
		queryRwjbxxInfoExtend.setMinJe(1000L);
		condition.setQuery(queryRwjbxxInfoExtend);
		List<String> orderBy = new ArrayList<String>();
		orderBy.add("t.shtgsj desc ");
		

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
	@ResponseBody
	@RequestMapping("getStaticsData")
	public DataResult<RwjbxxDataInfoExtend> getStaticsData() throws Exception{
		RwjbxxDataInfoExtend queryRwjbxxDataInfoExtend=new RwjbxxDataInfoExtend();
		DataResult<RwjbxxDataInfoExtend> datas= rwjbxxDataInfoService.selectByCondition(ConditionUtil.createCondition(queryRwjbxxDataInfoExtend), this.createCustomOperateLog());
		if(datas.getDatas()!=null){
			datas.getDatas().setFbxqzje(DecimalUtil.round(DecimalUtil.mul(DecimalUtil.div(DecimalUtil.div(datas.getDatas().getFbxqzje(), ConstantsUtil.HOUR_MONEY),ConstantsUtil.MONTH_WORK),ConstantsUtil.MONTH_MONEY),0));
		}
		return datas;
	}
	
	@RequestMapping("getTotalMoney")
	@ResponseBody
	public DataResult<BigDecimal> getTotalMoney() throws Exception{
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.ZBZ.getCode());
		queryRwjbxxInfoExtend.setMaxXmzt(RwztStateEnum.YZZ.getCode());
		
		Map<String,BigDecimal> datas=rwjbxxInfoService.selectSumMoney(ConditionUtil.createCondition(queryRwjbxxInfoExtend),this.createCustomOperateLog()).getDatas();
		if(CommonUtil.isNotEmptyMap(datas)){
			BigDecimal money=DecimalUtil.add(DecimalUtil.changeNull(datas.get("XMJE")), DecimalUtil.changeNull(datas.get("PTBZJE")));
			//把平台流水数据转换为公司结算数据
			return DataResult.success();
		}
		return DataResult.success(DecimalUtil.ZERO);
	}
	@RequestMapping("getTotalCount")
	@ResponseBody
	public DataResult<Integer> getTotalCount() throws Exception{
		RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setMaxXmzt(RwztStateEnum.YZZ.getCode());
		queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.ZBZ.getCode());
		return rwjbxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend), this.createCustomOperateLog());
	}
	@RequestMapping("getKfzCount")
	@ResponseBody
	public DataResult<Integer> getKfzCount() throws Exception{
		
		return kfzxxInfoService.selectCountByCondition(ConditionUtil.createCondition(new KfzxxInfoExtend()), this.createCustomOperateLog());
	}
	@RequestMapping("getXqfCount")
	@ResponseBody
	public DataResult<Integer> getXqfCount() throws Exception{
		return xqfxxInfoService.selectCountByCondition(ConditionUtil.createCondition(new XqfxxInfoExtend()), this.createCustomOperateLog());
	}
	
	
}
