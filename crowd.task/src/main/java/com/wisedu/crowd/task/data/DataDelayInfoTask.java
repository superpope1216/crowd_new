package com.wisedu.crowd.task.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.wisedu.crowd.common.code.RwztStateEnum;
import com.wisedu.crowd.common.code.SzlbEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.DecimalUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.entity.cwgl.extend.KfzzhmxInfoExtend;
import com.wisedu.crowd.entity.data.DataDelayInfo;
import com.wisedu.crowd.entity.data.delay.DataDelayKfzMonthInfo;
import com.wisedu.crowd.entity.data.delay.DataDelayKfzYearInfo;
import com.wisedu.crowd.entity.data.delay.DataDelayRwxsMonthInfo;
import com.wisedu.crowd.entity.data.delay.DataDelayRwxsYearInfo;
import com.wisedu.crowd.entity.data.delay.extend.DataDelayKfzMonthInfoExtend;
import com.wisedu.crowd.entity.data.delay.extend.DataDelayKfzYearInfoExtend;
import com.wisedu.crowd.entity.data.delay.extend.DataDelayRwxsMonthInfoExtend;
import com.wisedu.crowd.entity.data.extend.DataDelayInfoExtend;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.XmjbxxInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxExtInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwztbglsInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.XmjbxxInfoExtend;
import com.wisedu.crowd.entity.yhgl.XqfxxInfo;
import com.wisedu.crowd.service.cwgl.KfzzhmxInfoService;
import com.wisedu.crowd.service.data.DataDelayInfoService;
import com.wisedu.crowd.service.data.delay.DataDelayKfzMonthInfoService;
import com.wisedu.crowd.service.data.delay.DataDelayKfzYearInfoService;
import com.wisedu.crowd.service.data.delay.DataDelayRwxsMonthInfoService;
import com.wisedu.crowd.service.data.delay.DataDelayRwxsYearInfoService;
import com.wisedu.crowd.service.rwgl.RwjbxxExtInfoService;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.rwgl.RwztbglsInfoService;
import com.wisedu.crowd.service.rwgl.XmjbxxInfoService;
import com.wisedu.crowd.service.yhgl.XqfxxInfoService;

/**
 * 延期任务统计
 * @author wisedu
 *
 */
@Component
@Transactional
public class DataDelayInfoTask {
	/**
	 * 没延期一天扣除2分
	 */
	private final static int DELAY_SCORE=2;
	private Logger LOG=LoggerFactory.getLogger(DataDelayInfoTask.class);
	
	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	@Autowired
	private RwztbglsInfoService rwztbglsInfoService;
	@Autowired
	private KfzzhmxInfoService kfzzhmxInfoService;
	
	@Autowired
	private DataDelayInfoService dataDelayInfoService;
	
	@Autowired
	private DataDelayKfzMonthInfoService dataDelayKfzMonthInfoService;
	
	@Autowired
	private DataDelayKfzYearInfoService dataDelayKfzYearInfoService;
	@Autowired
	private DataDelayRwxsMonthInfoService dataDelayRwxsMonthInfoService;
	@Autowired
	private DataDelayRwxsYearInfoService dataDelayRwxsYearInfoService;
	@Autowired
	private XmjbxxInfoService xmjbxxInfoService;
	@Autowired
	private RwjbxxExtInfoService rwjbxxExtInfoService;
	@Autowired
	private XqfxxInfoService xqfxxInfoService;
	@Scheduled(cron = "0 0/10 *  * * ? ")
	public void run() {
		String begMonth="2016-01";
		String endMonth="2018-02";
		CustomOperateLog log=new CustomOperateLog();
		int dd=DateUtil.getMonthsBetween( begMonth,endMonth);
		for(int i=0;i<dd;i++){
			String begMonth2=DateUtil.addMonth(begMonth, i);
			try{
				run(begMonth2,log);
				
				runKfzMonth(begMonth2,log);
				
				runKfzYear(begMonth2,log);
				
				runRwxsMonth(begMonth2,log);
				
				runRwxsYear(begMonth2,log);
				
			}
			catch(Exception e){
				LOG.error("====延期任务详情自动任务异常===", e);
			}
		}
	}
	
	public void run(String month,CustomOperateLog log) throws Exception{
		
		RwjbxxInfoExtend queryRwjbxxInfoExtend = new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setNeedDelaySum(true);
		queryRwjbxxInfoExtend.setDelaySumMonth(month);
		//queryRwjbxxInfoExtend.setWid("2e8145b00d8d41c881167d6a981b1643");
		int pageNum = 1;
		int pageSize = 500;
		boolean needQuery = true;
		String cDate=DateUtil.addDate(DateUtil.getCurrentDateStr(), -1);//计算的日期
		while (needQuery) {
			List<RwjbxxInfoExtend> datas = rwjbxxInfoService.selectDisplayByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend, new PageInfo(pageSize, pageNum))).getDatas();
			pageNum++;
			if(CommonUtil.isNotEmptyList(datas)){
				for(RwjbxxInfoExtend rwjbxxInfoExtend:datas){
					if(StringUtil.isEmpty(rwjbxxInfoExtend.getJfrq())){
						continue;
					}
					long days=0;
					if(RwztStateEnum.KFZ.getCode()==rwjbxxInfoExtend.getXmzt()){
						days=this.getDays(cDate, rwjbxxInfoExtend.getJfrq());
						saveNotSqys(rwjbxxInfoExtend,days,cDate,rwjbxxInfoExtend.getJfrq(),month,log);
					}else{
						RwztbglsInfoExtend queryRwztbglsInfoExtend=new RwztbglsInfoExtend();
						queryRwztbglsInfoExtend.setXmid(rwjbxxInfoExtend.getWid());
						queryRwztbglsInfoExtend.setZt(StringUtil.toShort(RwztStateEnum.YSZ.getCode()));
						List<RwztbglsInfoExtend> rwztbglsDatas=rwztbglsInfoService.selectByCondition(ConditionUtil.createCondition(queryRwztbglsInfoExtend), log).getDatas();
						if(CommonUtil.isNotEmptyList(rwztbglsDatas)){
							saveSqys(rwjbxxInfoExtend,rwztbglsDatas,month,log);
						}else{
							days=this.getDays(DateUtil.getCurrentDateStr(), rwjbxxInfoExtend.getJfrq());
							saveNotSqys(rwjbxxInfoExtend,days,cDate,rwjbxxInfoExtend.getJfrq(),month,log);
						}
					}
					
				}
			}else{
				needQuery=false;
			}
		}
	}
	
	/**
	 * 统计开发者月度延期情况
	 * @param month
	 * @param log
	 */
	private void runKfzMonth(String month,CustomOperateLog log){
		DataDelayInfoExtend queryDataDelayInfoExtend=new DataDelayInfoExtend();
		queryDataDelayInfoExtend.setMonth(month);
		List<String> queryItems=new ArrayList<String>();
		queryItems.add("T_CROWD_DATA_DELAY.KFZID");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY.DELAY_DAY,0)) AS DELAY_DAY");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY.ZBJE,0)) AS ZBJE");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY.YJSJE,0)) AS YJSJE");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY.DELAY_ALL_DAY,0)) AS DELAY_ALL_DAY");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY.DELAY_SCORE,0)) AS DELAY_SCORE");
		List<String> groupBy=new ArrayList<String>();
		groupBy.add("T_CROWD_DATA_DELAY.KFZID");
		QueryCondition<DataDelayInfoExtend> condition=ConditionUtil.createCondition(queryDataDelayInfoExtend);
		condition.setQueryItem(queryItems);
		condition.setGroupBy(groupBy);
		PageInfo pageInfo=new PageInfo();
		
		int pageNum = 1;
		int pageSize = 500;
		boolean needQuery = true;
		pageInfo.setPageSize(pageSize);
		DataDelayKfzMonthInfoExtend deleteDataDelayKfzMonthInfoExtend=new DataDelayKfzMonthInfoExtend();
		deleteDataDelayKfzMonthInfoExtend.setMonth(month);
		
		dataDelayKfzMonthInfoService.deleteByCondition(ConditionUtil.createCondition(deleteDataDelayKfzMonthInfoExtend), log);
		while(needQuery){
			pageInfo.setPageNum(pageNum);
			List<Map<String,Object>> datas=dataDelayInfoService.selectCustomByCondition(condition, log).getDatas();
			if(CommonUtil.isNotEmptyList(datas)){
				for(Map<String,Object> map:datas){
					DataDelayKfzMonthInfo saveDataDelayKfzMonthInfo=new DataDelayKfzMonthInfo();
					saveDataDelayKfzMonthInfo.setWid(StringUtil.getUuId());
					saveDataDelayKfzMonthInfo.setDelayAllDay(DecimalUtil.toDecimal(map.get("DELAY_ALL_DAY")));
					saveDataDelayKfzMonthInfo.setDelayDay(DecimalUtil.toDecimal(map.get("DELAY_DAY")));
					saveDataDelayKfzMonthInfo.setDelayScore(DecimalUtil.toDecimal(map.get("DELAY_SCORE")));
					saveDataDelayKfzMonthInfo.setKfzid(StringUtil.toStr(map.get("KFZID")));
					saveDataDelayKfzMonthInfo.setMonth(month);
					saveDataDelayKfzMonthInfo.setYjsje(DecimalUtil.toDecimal(map.get("YJSJE")));
					saveDataDelayKfzMonthInfo.setZbje(DecimalUtil.toDecimal(map.get("ZBJE")));
					dataDelayKfzMonthInfoService.insertSelective(saveDataDelayKfzMonthInfo, log);
				}
			}else{
				needQuery=false;
			}
			pageNum++;
			
		}
		
	}
	/**
	 * 保存开发者年度延期情况
	 * @param month
	 * @param log
	 * @throws Exception
	 */
	private void runKfzYear(String month,CustomOperateLog log) throws Exception{
		DataDelayKfzMonthInfoExtend queryDataDelayKfzMonthInfoExtend=new DataDelayKfzMonthInfoExtend();
		queryDataDelayKfzMonthInfoExtend.setMinMonth(DateUtil.getBeginMonth(month+"-01"));
		queryDataDelayKfzMonthInfoExtend.setMaxMonth(DateUtil.getEndMonth(month+"-01"));
		QueryCondition<DataDelayKfzMonthInfoExtend> condition=ConditionUtil.createCondition(queryDataDelayKfzMonthInfoExtend);
		List<String> queryItems=new ArrayList<String>();
		queryItems.add("T_CROWD_DATA_DELAY_KFZ_M.KFZID");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY_KFZ_M.DELAY_DAY,0)) AS DELAY_DAY");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY_KFZ_M.ZBJE,0)) AS ZBJE");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY_KFZ_M.YJSJE,0)) AS YJSJE");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY_KFZ_M.DELAY_ALL_DAY,0)) AS DELAY_ALL_DAY");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY_KFZ_M.DELAY_SCORE,0)) AS DELAY_SCORE");
		List<String> groupBy=new ArrayList<String>();
		groupBy.add("T_CROWD_DATA_DELAY_KFZ_M.KFZID");
		condition.setQueryItem(queryItems);
		condition.setGroupBy(groupBy);
		List<Map<String,Object>> datas=dataDelayKfzMonthInfoService.selectCustomByCondition(condition, log).getDatas();
		if(CommonUtil.isNotEmptyList(datas)){
			for(Map<String,Object> map:datas){
				DataDelayKfzYearInfo saveDataDelayKfzYearInfo=new DataDelayKfzYearInfo();
				saveDataDelayKfzYearInfo.setWid(StringUtil.getUuId());
				saveDataDelayKfzYearInfo.setDelayAllDay(DecimalUtil.toDecimal(map.get("DELAY_ALL_DAY")));
				saveDataDelayKfzYearInfo.setDelayDay(DecimalUtil.toDecimal(map.get("DELAY_DAY")));
				saveDataDelayKfzYearInfo.setDelayScore(DecimalUtil.toDecimal(map.get("DELAY_SCORE")));
				saveDataDelayKfzYearInfo.setKfzid(StringUtil.toStr(map.get("KFZID")));
				saveDataDelayKfzYearInfo.setYear(DateUtil.getFiscalYear(month+"-01"));
				saveDataDelayKfzYearInfo.setYjsje(DecimalUtil.toDecimal(map.get("YJSJE")));
				saveDataDelayKfzYearInfo.setZbje(DecimalUtil.toDecimal(map.get("ZBJE")));
				dataDelayKfzYearInfoService.insertSelective(saveDataDelayKfzYearInfo, log);
			}
		}
		
	}
	
	/**
	 * 统计开发者月度延期情况
	 * @param month
	 * @param log
	 */
	private void runRwxsMonth(String month,CustomOperateLog log){
		DataDelayInfoExtend queryDataDelayInfoExtend=new DataDelayInfoExtend();
		queryDataDelayInfoExtend.setMonth(month);
		List<String> queryItems=new ArrayList<String>();
		queryItems.add("T_CROWD_DATA_DELAY.RWXS");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY.DELAY_DAY,0)) AS DELAY_DAY");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY.ZBJE,0)) AS ZBJE");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY.YJSJE,0)) AS YJSJE");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY.DELAY_ALL_DAY,0)) AS DELAY_ALL_DAY");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY.DELAY_SCORE,0)) AS DELAY_SCORE");
		List<String> groupBy=new ArrayList<String>();
		groupBy.add("T_CROWD_DATA_DELAY.RWXS");
		QueryCondition<DataDelayInfoExtend> condition=ConditionUtil.createCondition(queryDataDelayInfoExtend);
		condition.setQueryItem(queryItems);
		condition.setGroupBy(groupBy);
		PageInfo pageInfo=new PageInfo();
		
		int pageNum = 1;
		int pageSize = 500;
		boolean needQuery = true;
		pageInfo.setPageSize(pageSize);
		DataDelayKfzMonthInfoExtend deleteDataDelayKfzMonthInfoExtend=new DataDelayKfzMonthInfoExtend();
		deleteDataDelayKfzMonthInfoExtend.setMonth(month);
		
		dataDelayKfzMonthInfoService.deleteByCondition(ConditionUtil.createCondition(deleteDataDelayKfzMonthInfoExtend), log);
		while(needQuery){
			pageInfo.setPageNum(pageNum);
			List<Map<String,Object>> datas=dataDelayInfoService.selectCustomByCondition(condition, log).getDatas();
			if(CommonUtil.isNotEmptyList(datas)){
				for(Map<String,Object> map:datas){
					DataDelayRwxsMonthInfo saveDataDelayRwxsMonthInfo=new DataDelayRwxsMonthInfo();
					saveDataDelayRwxsMonthInfo.setWid(StringUtil.getUuId());
					saveDataDelayRwxsMonthInfo.setDelayAllDay(DecimalUtil.toDecimal(map.get("DELAY_ALL_DAY")));
					saveDataDelayRwxsMonthInfo.setDelayDay(DecimalUtil.toDecimal(map.get("DELAY_DAY")));
					saveDataDelayRwxsMonthInfo.setDelayScore(DecimalUtil.toDecimal(map.get("DELAY_SCORE")));
					saveDataDelayRwxsMonthInfo.setRwxs(StringUtil.toStr(map.get("RWXS")));
					saveDataDelayRwxsMonthInfo.setMonth(month);
					saveDataDelayRwxsMonthInfo.setYjsje(DecimalUtil.toDecimal(map.get("YJSJE")));
					saveDataDelayRwxsMonthInfo.setZbje(DecimalUtil.toDecimal(map.get("ZBJE")));
					dataDelayRwxsMonthInfoService.insertSelective(saveDataDelayRwxsMonthInfo, log);
				}
			}else{
				needQuery=false;
			}
			pageNum++;
			
		}
		
	}
	/**
	 * 保存开发者年度延期情况
	 * @param month
	 * @param log
	 * @throws Exception
	 */
	private void runRwxsYear(String month,CustomOperateLog log) throws Exception{
		DataDelayRwxsMonthInfoExtend queryDataDelayRwxsMonthInfoExtend=new DataDelayRwxsMonthInfoExtend();
		queryDataDelayRwxsMonthInfoExtend.setMinMonth(DateUtil.getBeginMonth(month+"-01"));
		queryDataDelayRwxsMonthInfoExtend.setMaxMonth(DateUtil.getEndMonth(month+"-01"));
		QueryCondition<DataDelayRwxsMonthInfoExtend> condition=ConditionUtil.createCondition(queryDataDelayRwxsMonthInfoExtend);
		List<String> queryItems=new ArrayList<String>();
		queryItems.add("T_CROWD_DATA_DELAY_RWXS_M.RWXS");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY_RWXS_M.DELAY_DAY,0)) AS DELAY_DAY");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY_RWXS_M.ZBJE,0)) AS ZBJE");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY_RWXS_M.YJSJE,0)) AS YJSJE");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY_RWXS_M.DELAY_ALL_DAY,0)) AS DELAY_ALL_DAY");
		queryItems.add("SUM(NVL(T_CROWD_DATA_DELAY_RWXS_M.DELAY_SCORE,0)) AS DELAY_SCORE");
		List<String> groupBy=new ArrayList<String>();
		groupBy.add("T_CROWD_DATA_DELAY_RWXS_M.RWXS");
		condition.setQueryItem(queryItems);
		condition.setGroupBy(groupBy);
		List<Map<String,Object>> datas=dataDelayRwxsMonthInfoService.selectCustomByCondition(condition, log).getDatas();
		if(CommonUtil.isNotEmptyList(datas)){
			for(Map<String,Object> map:datas){
				DataDelayRwxsYearInfo saveDataDelayRwxsYearInfo=new DataDelayRwxsYearInfo();
				saveDataDelayRwxsYearInfo.setWid(StringUtil.getUuId());
				saveDataDelayRwxsYearInfo.setDelayAllDay(DecimalUtil.toDecimal(map.get("DELAY_ALL_DAY")));
				saveDataDelayRwxsYearInfo.setDelayDay(DecimalUtil.toDecimal(map.get("DELAY_DAY")));
				saveDataDelayRwxsYearInfo.setDelayScore(DecimalUtil.toDecimal(map.get("DELAY_SCORE")));
				saveDataDelayRwxsYearInfo.setYear(DateUtil.getFiscalYear(month+"-01"));
				saveDataDelayRwxsYearInfo.setYear(DateUtil.getFiscalYear());
				saveDataDelayRwxsYearInfo.setYjsje(DecimalUtil.toDecimal(map.get("YJSJE")));
				saveDataDelayRwxsYearInfo.setZbje(DecimalUtil.toDecimal(map.get("ZBJE")));
				dataDelayRwxsYearInfoService.insertSelective(saveDataDelayRwxsYearInfo, log);
			}
		}
		
	}
	/**
	 * 保存申请验收的延期
	 * @param rwjbxxInfoExtend
	 * @param log
	 */
	private void saveSqys(RwjbxxInfoExtend rwjbxxInfoExtend,List<RwztbglsInfoExtend> rwztbglsDatas,String month,CustomOperateLog log) throws Exception{
		String czsj=DateUtil.formatDate(rwztbglsDatas.get(0).getCzsj());
		String ptyqjfrq=rwjbxxInfoExtend.getJfrq();
		if(rwztbglsDatas.size()==1){//1次提交验收
			
		}else{
			ptyqjfrq=getNewJfrq(StringUtil.toDouble(rwjbxxInfoExtend.getZbje()),czsj,rwjbxxInfoExtend.getJfrq());
			
		}
		long days=getDays(czsj,ptyqjfrq);//总延期天数
		
		saveNotSqys(rwjbxxInfoExtend,days,czsj,ptyqjfrq,month,log);
	}
	
	private long getDays(String sqysjs,String jfrq) throws Exception{
		return DateUtil.getDaysBetween(sqysjs, jfrq);
	}
	/**
	 * 保存没有申请验收的延期
	 * @param rwjbxxInfoExtend
	 */
	private void saveNotSqys(RwjbxxInfoExtend rwjbxxInfoExtend,long days,String sqyssj,String ptjfrq,String month,CustomOperateLog log){
		
		if(days<0){//延期了
			int monthDelay=calMonthDelayDay(ptjfrq,sqyssj,month);
			if(monthDelay<=0){
				return;
			}
			DataDelayInfoExtend queryDataDelayInfoExtend=new DataDelayInfoExtend();
			queryDataDelayInfoExtend.setRwid(rwjbxxInfoExtend.getWid());
			queryDataDelayInfoExtend.setMonth(month);
			List<DataDelayInfoExtend> dataDelays=dataDelayInfoService.selectByCondition(ConditionUtil.createCondition(queryDataDelayInfoExtend), log).getDatas();
			DataDelayInfo saveDataDelayInfo=new DataDelayInfo();
			saveDataDelayInfo.setPtgzjfrq(ptjfrq);
			saveDataDelayInfo.setJfrq(rwjbxxInfoExtend.getJfrq());
			saveDataDelayInfo.setSqyssj(sqyssj);
			//设置中标金额
			saveDataDelayInfo.setZbje(DecimalUtil.toDecimal(rwjbxxInfoExtend.getZbje()));
			//获取本月对应开发者的已结算金额
			KfzzhmxInfoExtend queryKfzzhmxInfoExtend=new KfzzhmxInfoExtend();
			queryKfzzhmxInfoExtend.setKfzid(rwjbxxInfoExtend.getKfzid());
			queryKfzzhmxInfoExtend.setLyxmid(rwjbxxInfoExtend.getWid());
			queryKfzzhmxInfoExtend.setSzlbid(SzlbEnum.XMSR.getCode());
			queryKfzzhmxInfoExtend.setMinMonth(month);
			queryKfzzhmxInfoExtend.setMaxMonth(month);
			List<String> queryItem=new ArrayList<>();
			queryItem.add("NVL(SUM(JE),0) AS JE");
			QueryCondition<KfzzhmxInfoExtend> kfzzhmxInfoExtendCondition=ConditionUtil.createCondition(queryKfzzhmxInfoExtend);
			kfzzhmxInfoExtendCondition.setQueryItem(queryItem);
			List<Map<String,Object>> kfzMoneyDatas=kfzzhmxInfoService.selectCustomByCondition(kfzzhmxInfoExtendCondition, log).getDatas();
			if(CommonUtil.isNotEmptyList(kfzMoneyDatas)){
				Map<String,Object> kfzMoneyMap=kfzMoneyDatas.get(0);
				if(CommonUtil.isNotEmptyMap(kfzMoneyMap)){
					saveDataDelayInfo.setYjsje(DecimalUtil.toDecimal(kfzMoneyMap.get("JE")));
				}
			}
			
			//延期总天数
			saveDataDelayInfo.setDelayAllDay(DecimalUtil.toDecimal(Math.abs(days)));
			
			//延期得分
			saveDataDelayInfo.setDelayScore(DecimalUtil.toDecimal(-monthDelay*DELAY_SCORE));
			//获取项目所属区域
			RwjbxxExtInfoExtend queryRwjbxxExtInfoExtend=new RwjbxxExtInfoExtend();
			queryRwjbxxExtInfoExtend.setRwid(rwjbxxInfoExtend.getWid());
			
			List<RwjbxxExtInfoExtend> rwjbxxExtDatas= rwjbxxExtInfoService.selectByCondition(ConditionUtil.createCondition(queryRwjbxxExtInfoExtend), log).getDatas();
			if(CommonUtil.isNotEmptyList(rwjbxxExtDatas)){
				RwjbxxExtInfoExtend rwjbxxExtInfoExtend=rwjbxxExtDatas.get(0);
				saveDataDelayInfo.setSsxx(rwjbxxExtInfoExtend.getSsxx());
				saveDataDelayInfo.setXmbh(rwjbxxExtInfoExtend.getXmbh());
				saveDataDelayInfo.setYwxbh(rwjbxxExtInfoExtend.getYwxbm());
				saveDataDelayInfo.setMkbh(rwjbxxExtInfoExtend.getMkbh());
				if(rwjbxxExtInfoExtend.getXmbh()!=null && rwjbxxExtInfoExtend.getXmbh().trim().startsWith("-")){
					
					XqfxxInfo xqfxxInfo=xqfxxInfoService.selectByPrimaryKey(rwjbxxInfoExtend.getXqfid(), log).getDatas();
					saveDataDelayInfo.setSsqy(xqfxxInfo.getSsgs());
				}else{
					XmjbxxInfoExtend queryXmjbxxInfoExtend=new XmjbxxInfoExtend();
					queryXmjbxxInfoExtend.setXmbh(rwjbxxExtInfoExtend.getXmbh());
					
					List<XmjbxxInfo> xmjbxxInfoDatas=xmjbxxInfoService.selectByCondition(ConditionUtil.createCondition(queryXmjbxxInfoExtend), log).getDatas();
					if(CommonUtil.isNotEmptyList(xmjbxxInfoDatas)){
						saveDataDelayInfo.setSsqy(xmjbxxInfoDatas.get(0).getSzqy());
					}
					
				}
			}
			if(CommonUtil.isNotEmptyList(dataDelays)){
				saveDataDelayInfo.setDelayDay(DecimalUtil.toDecimal(monthDelay));
				
				saveDataDelayInfo.setMonth(month);
				dataDelayInfoService.updateByPrimaryKeySelective(saveDataDelayInfo, log);
			}else{
				saveDataDelayInfo.setWid(StringUtil.getUuId());
				
				saveDataDelayInfo.setKfzid(rwjbxxInfoExtend.getKfzid());
				saveDataDelayInfo.setMonth(month);
				saveDataDelayInfo.setRwid(rwjbxxInfoExtend.getWid());
				
				saveDataDelayInfo.setDelayDay(DecimalUtil.toDecimal(monthDelay));
				saveDataDelayInfo.setXqfid(rwjbxxInfoExtend.getXqfid());
				dataDelayInfoService.insertSelective(saveDataDelayInfo, log);
			}
			
		}
	}
	
	/**
	 * 获取交付日期
	 * @param firstYs
	 * @param zbje
	 * @param jfrq
	 * @return
	 * @throws Exception
	 */
	private String getNewJfrq(double zbje, String sqsj,String jfrq) throws Exception{
		int subDays = 0;
		
			if(zbje < 1000){//1000元以下一天
				subDays = 1;
			}else if(zbje < 5000){//1000元-5000元两天
				subDays = 2;
			}else{//5000元以上三天
				subDays = 3;
			}
		
		long days=DateUtil.getDaysBetween(jfrq, sqsj);
		
		if(days>0){
			return DateUtil.addDate(jfrq, subDays); 
		}else{
			return jfrq;
		}
	}
	
	public  static  int calMonthDelayDay(String jfrq,String currentDate,String currentMonth){
		long days=DateUtil.getDaysBetween(jfrq, currentDate);
		int delayDay=0;
		for(long i=0;i<days;i++){
			String date=DateUtil.addDate(jfrq, StringUtil.toInt(i));
			String cMonth=DateUtil.formatMonth(DateUtil.parseDate(date));
			if(currentMonth.equals(cMonth)){
				delayDay++;
			}
		}
		return delayDay;
	}
	
	
}
