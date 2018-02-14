package com.wisedu.crowd.task.statics;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.wisedu.crowd.common.code.KhjgEnum;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.DecimalUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.TrainEnrolDataInfo;
import com.wisedu.crowd.entity.statics.extend.TrainEnrolDataInfoExtend;
import com.wisedu.crowd.entity.train.extend.TrainEnrolInfoExtend;
import com.wisedu.crowd.service.statics.TrainEnrolDataInfoService;
import com.wisedu.crowd.service.train.TrainEnrolInfoService;

@Component
@Transactional
public class TrainEnrolDataStatics {
	
	private static final Logger LOG=LoggerFactory.getLogger(TrainEnrolDataStatics.class);
	@Autowired
	private TrainEnrolDataInfoService trainEnrolDataInfoService;
	@Autowired
	private TrainEnrolInfoService trainEnrolInfoService;
	//@Scheduled(cron = "0 0/1 *  * * ? ")
	public void run() throws Exception {
		try{

			CustomOperateLog log=new CustomOperateLog();
			log.setAdmin(true);
			String curDate=DateUtil.getCurrentMonthStr();
			TrainEnrolDataInfoExtend delTrainEnrolDataInfoExtend=new TrainEnrolDataInfoExtend();
			delTrainEnrolDataInfoExtend.setKhyf(curDate);
			trainEnrolDataInfoService.deleteByCondition(ConditionUtil.createCondition(delTrainEnrolDataInfoExtend), log);
			
			String minKhsj=curDate+"-01",maxKhsj=curDate+"-31";
			
			TrainEnrolInfoExtend queryTrainEnrolInfoExtend=new TrainEnrolInfoExtend();
			queryTrainEnrolInfoExtend.setMinKhyf(minKhsj);
			queryTrainEnrolInfoExtend.setMaxKhyf(maxKhsj);
			//报名的全部人数
			Integer allNum= trainEnrolInfoService.selectCountByCondition(ConditionUtil.createCondition(queryTrainEnrolInfoExtend), log).getDatas();
			
			
			//考核通过人数
			queryTrainEnrolInfoExtend.setKhjg(KhjgEnum.TG.getCode());
			Integer tgNum= trainEnrolInfoService.selectCountByCondition(ConditionUtil.createCondition(queryTrainEnrolInfoExtend), log).getDatas();
			//考核不通过人数
			queryTrainEnrolInfoExtend.setKhjg(KhjgEnum.BTG.getCode());
			Integer btgNum= trainEnrolInfoService.selectCountByCondition(ConditionUtil.createCondition(queryTrainEnrolInfoExtend), log).getDatas();
			
			TrainEnrolDataInfo trainEnrolDataInfo=new TrainEnrolDataInfo();
			trainEnrolDataInfo.setWid(StringUtil.getUuId());
			trainEnrolDataInfo.setBtgrs(DecimalUtil.toDecimal(btgNum));
			trainEnrolDataInfo.setKhyf(curDate);
			trainEnrolDataInfo.setTgrs(DecimalUtil.toDecimal(tgNum));
			trainEnrolDataInfo.setZrs(DecimalUtil.toDecimal(allNum));
			trainEnrolDataInfoService.insertSelective(trainEnrolDataInfo, log);
		}catch(Exception e){
			LOG.error("====TrainEnrolDataStatics",e);
			
		}
	}
}
