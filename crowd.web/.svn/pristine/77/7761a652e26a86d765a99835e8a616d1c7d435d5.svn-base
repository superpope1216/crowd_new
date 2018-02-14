package com.wisedu.crowd.controller.kfzzx;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.StringUtil;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.DecimalUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.statics.RwjbxxDataInfo;
import com.wisedu.crowd.entity.statics.TrainEnrolDataInfo;
import com.wisedu.crowd.entity.statics.extend.KfzAreaDataInfoExtend;
import com.wisedu.crowd.entity.statics.extend.KfzxxDataExtend;
import com.wisedu.crowd.entity.statics.extend.RwjbxxDataInfoExtend;
import com.wisedu.crowd.entity.statics.extend.TrainEnrolDataInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.KfzAreaDataInfoService;
import com.wisedu.crowd.service.statics.KfzxxDataService;
import com.wisedu.crowd.service.statics.RwjbxxDataInfoService;
import com.wisedu.crowd.service.statics.TrainEnrolDataInfoService;

@Controller
@RequestMapping("kfzzx")
public class KfzzxController extends BaseController{

	@Autowired
	private  KfzxxDataService kfzxxDataService;
	
	@Autowired
	private RwjbxxDataInfoService rwjbxxDataInfoService;
	@Autowired
	private KfzAreaDataInfoService kfzAreaDataInfoService;
	
	@Autowired
	private TrainEnrolDataInfoService trainEnrolDataInfoService;
	@RequestMapping("index")
	public ModelAndView index() throws Exception{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("kfzzx/index");
		return mv;
	}
	@RequestMapping("statics")
	@ResponseBody
	public DataResult<Map<String,Object>> statics() throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		RwjbxxDataInfoExtend datas=rwjbxxDataInfoService.selectByCondition(ConditionUtil.createCondition(new RwjbxxDataInfoExtend()), this.createCustomOperateLog()).getDatas();
		if(datas!=null){
			map.put("xmjj",DecimalUtil.round( DecimalUtil.div(datas.getFbxqje(), datas.getFbxqs()),2));
			BigDecimal pjhs= DecimalUtil.round(DecimalUtil.div(datas.getHssj(),DecimalUtil.toDecimal("24")), 2);
			if(DecimalUtil.ZERO.compareTo(pjhs)==0){
				map.put("pjhs", 1);
			}else{
				map.put("pjhs",pjhs);
			}
			
		}
		KfzxxDataExtend queryKfzxxDataExtend=new KfzxxDataExtend();
		queryKfzxxDataExtend.setNeedKfzxx(true);
		List<String> orders=new ArrayList<String>();
		orders.add("T_CROWD_STATIC_KFZXX_DATA.ZSR DESC ");
		List<KfzxxDataExtend> kfzxxs=kfzxxDataService.selectDisplayByCondition(ConditionUtil.createCondition(queryKfzxxDataExtend, new PageInfo(1,1), orders), this.createCustomOperateLog()).getDatas();
		if(CommonUtil.isNotEmptyList(kfzxxs)){
			map.put("zsr", DecimalUtil.round(DecimalUtil.div(kfzxxs.get(0).getZsr(),DecimalUtil.toDecimal("10000")),2));
		}
		return DataResult.success(map);
	}
	/**
	 * 
	 * @param pageNum
	 * @param flag1 表示收入排行榜 2表示得分排行榜 3表示投标排行榜
	 * @param yhlx 1表示企业 2表示个人
	 * @return
	 */
	@RequestMapping("sort")
	@ResponseBody
	public DataResult<List<KfzxxDataExtend>> querySort(Integer pageNum,Integer pageSize,String flag,String yhlx) throws Exception{
		KfzxxDataExtend queryKfzxxDataExtend=new KfzxxDataExtend();
		queryKfzxxDataExtend.setNeedKfzxx(true);
		List<String> orders=new ArrayList<String>();
		if("1".equals(flag)){
			orders.add("T_CROWD_STATIC_KFZXX_DATA.ZSR DESC ");
			orders.add("T_CROWD_STATIC_KFZXX_DATA.ZDF DESC ");
			orders.add("T_CROWD_STATIC_KFZXX_DATA.TBS DESC ");
		}else if("2".equals(flag)){
			orders.add("T_CROWD_STATIC_KFZXX_DATA.ZDF DESC ");
			orders.add("T_CROWD_STATIC_KFZXX_DATA.ZSR DESC ");
			orders.add("T_CROWD_STATIC_KFZXX_DATA.TBS DESC ");
		}else if("3".equals(flag)){
			orders.add("T_CROWD_STATIC_KFZXX_DATA.TBS DESC ");
			orders.add("T_CROWD_STATIC_KFZXX_DATA.ZDF DESC ");
			orders.add("T_CROWD_STATIC_KFZXX_DATA.ZSR DESC ");
		}
		if(StringUtil.isNotEmpty(yhlx)){
			queryKfzxxDataExtend.setSfytd(yhlx);
		}
		if(pageSize==null || pageSize==0){
			pageSize=10;
		}
		
		return kfzxxDataService.selectDisplayByCondition(ConditionUtil.createCondition(queryKfzxxDataExtend, new PageInfo(pageSize,pageNum), orders), this.createCustomOperateLog());
	}
	
	@RequestMapping("devArea")
	@ResponseBody
	public DataResult<List<KfzAreaDataInfoExtend>> queryDevArea() throws Exception{
		KfzAreaDataInfoExtend queryKfzAreaDataInfoExtend=new KfzAreaDataInfoExtend();
		return kfzAreaDataInfoService.selectDisplayByCondition(ConditionUtil.createCondition(queryKfzAreaDataInfoExtend), this.createCustomOperateLog());
	}
	@RequestMapping("trainData")
	@ResponseBody
	public DataResult<List<TrainEnrolDataInfoExtend>> queryTrainData() throws Exception{
		TrainEnrolDataInfoExtend queryTrainEnrolDataInfoExtend=new TrainEnrolDataInfoExtend();
		String curMonth=DateUtil.getCurrentMonthStr();
		String begMonth=DateUtil.addMonth(curMonth, -12);
		queryTrainEnrolDataInfoExtend.setMaxKhyf(curMonth+"-31");
		queryTrainEnrolDataInfoExtend.setMinKhyf(begMonth+"-01");
		List<TrainEnrolDataInfoExtend> datas=trainEnrolDataInfoService.selectDisplayByCondition(ConditionUtil.createCondition(queryTrainEnrolDataInfoExtend), this.createCustomOperateLog()).getDatas();
		List<TrainEnrolDataInfoExtend> retuDatas=new ArrayList<TrainEnrolDataInfoExtend>();
		for(int i=0;i<12;i++){
			String month=DateUtil.addMonth(begMonth, i);
			boolean find=false;
			for(TrainEnrolDataInfoExtend trainEnrolDataInfoExtend:datas){
				if(trainEnrolDataInfoExtend.getKhyf().equals(month)){
					find=true;
					retuDatas.add(trainEnrolDataInfoExtend);
					break;
				}
			}
			if(!find){
				TrainEnrolDataInfoExtend oneTrainEnrolDataInfoExtend=new TrainEnrolDataInfoExtend();
				oneTrainEnrolDataInfoExtend.setKhyf(month);
				retuDatas.add(oneTrainEnrolDataInfoExtend);
			}
		}
		return DataResult.success(retuDatas);
	}
}
