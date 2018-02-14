package com.wisedu.crowd.task.statics;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.wisedu.crowd.common.code.DictionaryEnum;
import com.wisedu.crowd.common.code.RwxsEnum;
import com.wisedu.crowd.common.code.RwztStateEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.DecimalUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.entity.dictionary.DictionaryInfo;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.statics.RwjbxxRwxsDataInfo;
import com.wisedu.crowd.entity.statics.extend.RwjbxxDataInfoExtend;
import com.wisedu.crowd.entity.statics.extend.RwjbxxRwxsDataInfoExtend;
import com.wisedu.crowd.service.dictionary.DictionaryService;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.statics.RwjbxxRwxsDataInfoService;
@Component
@Transactional
public class RwjbxxRwxsDataStatics {

	@Autowired
	private RwjbxxRwxsDataInfoService rwjbxxRwxsDataInfoService;
	
	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	@Autowired
	private DictionaryService dictionaryService;
	
	//@Scheduled(cron = "0 0/1 *  * * ? ")
	public void run() throws Exception {
		CustomOperateLog log = new CustomOperateLog();
		log.setAdmin(true);
		String year=DateUtil.getFiscalYear();
		RwjbxxRwxsDataInfoExtend delRwjbxxRwxsDataInfoExtend = new RwjbxxRwxsDataInfoExtend();
		delRwjbxxRwxsDataInfoExtend.setYear(year);
		rwjbxxRwxsDataInfoService.deleteByCondition(delRwjbxxRwxsDataInfoExtend, log);
		RwjbxxInfoExtend queryRwjbxxInfoExtend = new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setMinCjsjYear(year);
		queryRwjbxxInfoExtend.setMaxCjsjYear(year);
		List<DictionaryInfo> rwxsDatas=dictionaryService.selectAllByTable(DictionaryEnum.T_CROWD_SJZD_RWXS);
		for(DictionaryInfo rwxs:rwxsDatas){
			RwjbxxRwxsDataInfo saveRwjbxxRwxsDataInfo=new RwjbxxRwxsDataInfo();
			saveRwjbxxRwxsDataInfo.setYear(year);
			saveRwjbxxRwxsDataInfo.setWid(StringUtil.getUuId());
			saveRwjbxxRwxsDataInfo.setKfxs(rwxs.getLbdm());
			// 获取发布任务的总金额
			queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.ZBZ.getCode());
			queryRwjbxxInfoExtend.setMaxXmzt(RwztStateEnum.YJX.getCode());
			
			//获取发布的需求总金额
			queryRwjbxxInfoExtend.setRwxs(rwxs.getLbdm());
			BigDecimal totalMoney = DecimalUtil.ZERO;
			Map<String, BigDecimal> datas = rwjbxxInfoService
					.selectSumMoney(ConditionUtil.createCondition(queryRwjbxxInfoExtend), log).getDatas();
			if (CommonUtil.isNotEmptyMap(datas)) {
				totalMoney = DecimalUtil.add(DecimalUtil.add(DecimalUtil.changeNull(datas.get("XMJE")),
						DecimalUtil.changeNull(datas.get("PTBZJE"))),DecimalUtil.changeNull(datas.get("JJBZJE")));

			}
			saveRwjbxxRwxsDataInfo.setFbrwje(totalMoney);
			// 获取发布任务的总个数
			Integer totalCount = rwjbxxInfoService
					.selectCountByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend), log).getDatas();
			
			if (totalCount != null && totalCount != 0) {
				saveRwjbxxRwxsDataInfo.setFbrws(DecimalUtil.toDecimal(totalCount));
			}
			//获取完工需求金额
			queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.SHZ.getCode());
			
			BigDecimal totalWgMoney = DecimalUtil.ZERO;
			Map<String, BigDecimal> datasWg = rwjbxxInfoService
					.selectSumMoney(ConditionUtil.createCondition(queryRwjbxxInfoExtend), log).getDatas();
			if (CommonUtil.isNotEmptyMap(datas)) {
				totalWgMoney = DecimalUtil.add(DecimalUtil.add(DecimalUtil.changeNull(datasWg.get("XMJE")),
						DecimalUtil.changeNull(datasWg.get("PTBZJE"))),DecimalUtil.changeNull(datasWg.get("JJBZJE")));

			}
			saveRwjbxxRwxsDataInfo.setWgrwje(totalWgMoney);
			// 获取发布任务的总个数
			Integer totalWgCount = rwjbxxInfoService
					.selectCountByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend), log).getDatas();
			
			if (totalWgCount != null && totalWgCount != 0) {
				saveRwjbxxRwxsDataInfo.setWgrws(DecimalUtil.toDecimal(totalCount));
			}
			rwjbxxRwxsDataInfoService.insertSelective(saveRwjbxxRwxsDataInfo, log);
		}
		
		
	}
}
