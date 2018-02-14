package com.wisedu.crowd.task.rwxx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.wisedu.crowd.common.code.RwztStateEnum;
import com.wisedu.crowd.common.code.YesNoEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwztbglsInfoExtend;
import com.wisedu.crowd.entity.statics.extend.JjrInfoExtend;
import com.wisedu.crowd.entity.yhgl.XqfxxInfo;
import com.wisedu.crowd.entity.yhgl.YhjbxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.XqfxxInfoExtend;
import com.wisedu.crowd.service.mq.message.AutoYsNotPsssMessages;
import com.wisedu.crowd.service.mq.message.AutoYsPsssMessages;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.rwgl.RwztbglsInfoService;
import com.wisedu.crowd.service.statics.JjrInfoService;
import com.wisedu.crowd.service.yhgl.XqfxxInfoService;
import com.wisedu.crowd.service.yhgl.YhjbxxInfoService;

/**
 * 自动验收
 * 
 * @author de
 *
 */
@Component
public class AutoAcceptTask {

	/**
	 * 自动验收规则 500-1000为3天的自动验收 1000-2000为4天的自动验收 2000-4000为5天 4000-7000为6天
	 * 7000-10000为7天 10000-20000为10天 20000以上为15天
	 * 排除节假日（如果该需求下有任何一个自身的关联问题未解决，则不予自动验收）
	 */
	private Logger LOG = LoggerFactory.getLogger(AutoAcceptTask.class);

	private final static int DAY_3 = 3;
	private final static int DAY_4 = 4;
	private final static int DAY_5 = 5;
	private final static int DAY_6 = 6;
	private final static int DAY_7 = 7;
	private final static int DAY_10 = 10;
	private final static int DAY_15 = 15;

	private final static long MONEY_1000 = 1000L;
	private final static long MONEY_2000 = 2000L;
	private final static long MONEY_4000 = 4000L;
	private final static long MONEY_7000 = 7000L;
	private final static long MONEY_10000 = 10000L;
	private final static long MONEY_20000 = 20000L;
	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	@Autowired
	private RwztbglsInfoService rwztbglsInfoService;
	@Autowired
	private JjrInfoService jjrInfoService;
	@Autowired
	private XqfxxInfoService xqfxxInfoService;
	@Autowired
	private YhjbxxInfoService yhjbxxInfoService;
	@Autowired
	private AutoYsNotPsssMessages autoYsNotPsssMessages;
	@Autowired
	private AutoYsPsssMessages autoYsPsssMessages;

	//@Scheduled(cron = "0/1 * *  * * ? ")
	public void run() {
		try {
			JjrInfoExtend queryJjrInfoExtend = new JjrInfoExtend();
			queryJjrInfoExtend.setMinDay(DateUtil.getCurrentDateStr());
			String maxDate = DateUtil.addDate(DateUtil.getCurrentDateStr(), 100);
			queryJjrInfoExtend.setMaxDay(maxDate);

			List<JjrInfoExtend> jjrDatas = jjrInfoService
					.selectByCondition(ConditionUtil.createCondition(queryJjrInfoExtend), null).getDatas();
			List<String> days = new ArrayList<String>();
			if (CommonUtil.isNotEmptyList(jjrDatas)) {
				for (JjrInfoExtend jjrInfo : jjrDatas) {
					days.add(jjrInfo.getDays());
				}
			}
			RwjbxxInfoExtend queryRwjbxxInfoExtend = new RwjbxxInfoExtend();
			queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.YSZ.getCode());
			int pageNum = 1;
			int pageSize = 500;
			boolean needQuery = true;
			while (needQuery) {
				List<RwjbxxInfoExtend> datas = rwjbxxInfoService
						.selectDisplayByCondition(
								ConditionUtil.createCondition(queryRwjbxxInfoExtend, new PageInfo(pageSize, pageNum)))
						.getDatas();
				pageNum++;
				if (CommonUtil.isNotEmptyList(datas)) {
					for (RwjbxxInfoExtend rwjbxxInfo : datas) {
						RwztbglsInfoExtend queryRwztbglsInfoExtend = new RwztbglsInfoExtend();
						queryRwztbglsInfoExtend.setXmid(rwjbxxInfo.getWid());
						queryRwztbglsInfoExtend.setZt(StringUtil.toShort(RwztStateEnum.YSZ.getCode()));
						List<RwztbglsInfoExtend> rwztDatas = rwztbglsInfoService
								.selectByCondition(ConditionUtil.createCondition(queryRwztbglsInfoExtend), null)
								.getDatas();
						if (CommonUtil.isNotEmptyList(rwztDatas)) {
							RwztbglsInfoExtend rwztbglsInfoExtend = rwztDatas.get(0);
							Date sqyssj = rwztbglsInfoExtend.getCzsj();
							int maxDayCount = 0;
							if (rwjbxxInfo.getZbje() <= MONEY_1000) {
								maxDayCount = DAY_3;
							} else if (rwjbxxInfo.getZbje() <= MONEY_2000) {
								maxDayCount = DAY_4;
							} else if (rwjbxxInfo.getZbje() <= MONEY_4000) {
								maxDayCount = DAY_5;
							} else if (rwjbxxInfo.getZbje() <= MONEY_7000) {
								maxDayCount = DAY_6;
							} else if (rwjbxxInfo.getZbje() <= MONEY_10000) {
								maxDayCount = DAY_7;
							} else if (rwjbxxInfo.getZbje() <= MONEY_20000) {
								maxDayCount = DAY_10;
							} else if (rwjbxxInfo.getZbje() > MONEY_20000) {
								maxDayCount = DAY_15;
							}
							int lastMaxDayCount = maxDayCount;
							for (int i = 0; i < maxDayCount; i++) {
								String now = DateUtil.addDate(sqyssj, i);
								if (days.contains(now)) {
									lastMaxDayCount++;
								}
							}
							String autoYsDay = DateUtil.addDate(sqyssj, lastMaxDayCount);
							CustomOperateLog customOperateLog = new CustomOperateLog();
							customOperateLog.setAdmin(true);
							customOperateLog.setCustomIp("127.0.0.1");
							customOperateLog.setDateTime(DateUtil.getCurrentDateTimeStr());
							XqfxxInfoExtend queryXqfxxInfoExtend = new XqfxxInfoExtend();
							queryXqfxxInfoExtend.setWid(rwjbxxInfo.getWid());
							XqfxxInfoExtend xqfxxInfoExtend = xqfxxInfoService
									.selectByCondition(ConditionUtil.createCondition(queryXqfxxInfoExtend), null)
									.getDatas().get(0);
							customOperateLog.setXqfxxInfo(xqfxxInfoExtend);
							customOperateLog.setXqfId(rwjbxxInfo.getXqfid());
							customOperateLog.setXm(xqfxxInfoExtend.getXm());
							customOperateLog.setRegisterId(xqfxxInfoExtend.getYhid());
							YhjbxxInfo yhjbxxInfo = yhjbxxInfoService.selectByPrimaryKey(xqfxxInfoExtend.getYhid());
							customOperateLog.setSjh(yhjbxxInfo.getSjh());
							if (DateUtil.getCurrentDateStr().equals(autoYsDay)) {
								boolean canYs=rwjbxxInfoService.checkAccept(rwjbxxInfo.getWid(), customOperateLog).getDatas();
								if(canYs==true){
									rwjbxxInfoService.accept(rwjbxxInfo.getWid(), YesNoEnum.YES.getCode(), "系统自动验收通过",ConstantsUtil.DEFAULT_SCORE, ConstantsUtil.DEFAULT_SCORE,ConstantsUtil.DEFAULT_SCORE, customOperateLog);
									try{
										autoYsPsssMessages.sendMsg(rwjbxxInfo.getWid());
									}catch(Exception ee){
										LOG.error(ee.getMessage());
									}
								}else{
									try{
										autoYsNotPsssMessages.sendMsg(rwjbxxInfo.getWid());
									}catch(Exception ee){
										LOG.error(ee.getMessage());
									}
								}
								
								
								
							}

						}

					}
				} else {
					needQuery = false;
				}
			}

		} catch (Exception e) {
			LOG.error(e.getMessage());
		}

	}

}
