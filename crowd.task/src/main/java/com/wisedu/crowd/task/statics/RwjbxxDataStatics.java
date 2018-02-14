package com.wisedu.crowd.task.statics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.wisedu.crowd.common.code.RwxqlxEnum;
import com.wisedu.crowd.common.code.RwztStateEnum;
import com.wisedu.crowd.common.code.YhxxShztEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.ConstantsUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.DecimalUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.RwztbglsInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwztbglsInfoExtend;
import com.wisedu.crowd.entity.statics.RwjbxxDataInfo;
import com.wisedu.crowd.entity.statics.extend.RwjbxxDataInfoExtend;
import com.wisedu.crowd.entity.yhgl.extend.KfzxxInfoExtend;
import com.wisedu.crowd.entity.yhgl.extend.XqfxxInfoExtend;
import com.wisedu.crowd.entity.yhgl.extend.YhjbxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.rwgl.RwztbglsInfoService;
import com.wisedu.crowd.service.statics.RwjbxxDataInfoService;
import com.wisedu.crowd.service.yhgl.KfzxxInfoService;
import com.wisedu.crowd.service.yhgl.XqfxxInfoService;
import com.wisedu.crowd.service.yhgl.YhjbxxInfoService;

@Component
@Transactional
public class RwjbxxDataStatics {
	@Autowired
	private RwjbxxDataInfoService rwjbxxDataInfoService;

	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	@Autowired
	private RwztbglsInfoService rwztbglsInfoService;
	@Autowired
	private YhjbxxInfoService yhjbxxInfoService;

	@Autowired
	private XqfxxInfoService xqfxxInfoService;

	@Autowired
	private KfzxxInfoService kfzxxInfoService;

	//@Scheduled(cron = "0 0/1 *  * * ? ")
	public void run() throws Exception {
		CustomOperateLog log = new CustomOperateLog();
		log.setAdmin(true);
		RwjbxxDataInfoExtend delRwjbxxDataInfo = new RwjbxxDataInfoExtend();
		rwjbxxDataInfoService.deleteByCondition(delRwjbxxDataInfo, log);
		int pageNum = 1;
		int pageSize = 100;
		boolean needQuery = true;
		RwjbxxDataInfo saveRwjbxxDataInfo = new RwjbxxDataInfo();
		saveRwjbxxDataInfo.setWid(StringUtil.getUuId());

		RwjbxxInfoExtend queryRwjbxxInfoExtend = new RwjbxxInfoExtend();

		// 获取发布任务的总金额
		queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.ZBZ.getCode());
		queryRwjbxxInfoExtend.setMaxXmzt(RwztStateEnum.YJX.getCode());
		BigDecimal totalMoney = DecimalUtil.ZERO;
		Map<String, BigDecimal> datas = rwjbxxInfoService
				.selectSumMoney(ConditionUtil.createCondition(queryRwjbxxInfoExtend), log).getDatas();
		if (CommonUtil.isNotEmptyMap(datas)) {
			totalMoney = DecimalUtil.add(DecimalUtil.changeNull(datas.get("XMJE")),
					DecimalUtil.changeNull(datas.get("PTBZJE")));

		}
		saveRwjbxxDataInfo.setFbxqzje(DecimalUtil.round(totalMoney,2));

		// 获取发布任务的总个数
		Integer totalCount = rwjbxxInfoService
				.selectCountByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend), log).getDatas();
		saveRwjbxxDataInfo.setFbxqzs(DecimalUtil.toDecimal(totalCount));
		if (totalCount != null && totalCount != 0) {
			saveRwjbxxDataInfo.setXqjj(DecimalUtil.div(totalMoney, DecimalUtil.toDecimal(totalCount)));
		}
		// 发布需求类型的总金额
		BigDecimal totalXqMoney = DecimalUtil.ZERO;
		queryRwjbxxInfoExtend.setRwlx(StringUtil.toShort(RwxqlxEnum.XQ.getCode()));
		Map<String, BigDecimal> xqMoneyDatas = rwjbxxInfoService
				.selectSumMoney(ConditionUtil.createCondition(queryRwjbxxInfoExtend), log).getDatas();
		if (CommonUtil.isNotEmptyMap(datas)) {
			totalXqMoney = DecimalUtil.add(DecimalUtil.changeNull(xqMoneyDatas.get("XMJE")),
					DecimalUtil.changeNull(xqMoneyDatas.get("PTBZJE")));

		}
		saveRwjbxxDataInfo.setFbxqje(DecimalUtil.round(DecimalUtil.toDecimal(totalXqMoney),2));
		// 发布需求类型的总个数
		Integer totalXqCount = rwjbxxInfoService
				.selectCountByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend), log).getDatas();
		saveRwjbxxDataInfo.setFbxqs(DecimalUtil.toDecimal(totalXqCount));

		// 发布需求类型的总金额
		BigDecimal totalBugMoney = DecimalUtil.ZERO;
		queryRwjbxxInfoExtend.setRwlx(StringUtil.toShort(RwxqlxEnum.BUG.getCode()));
		Map<String, BigDecimal> bugMoneyDatas = rwjbxxInfoService
				.selectSumMoney(ConditionUtil.createCondition(queryRwjbxxInfoExtend), log).getDatas();
		if (CommonUtil.isNotEmptyMap(datas)) {
			totalBugMoney = DecimalUtil.add(DecimalUtil.changeNull(bugMoneyDatas.get("XMJE")),
					DecimalUtil.changeNull(bugMoneyDatas.get("PTBZJE")));

		}
		saveRwjbxxDataInfo.setFbbugje(DecimalUtil.round(DecimalUtil.toDecimal(totalBugMoney),2));
		// 发布需求类型的总个数
		Integer totalBugCount = rwjbxxInfoService
				.selectCountByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend), log).getDatas();
		saveRwjbxxDataInfo.setFbbugs(DecimalUtil.toDecimal(totalBugCount));

		// 获取注册用户数
		Integer zcyhs = yhjbxxInfoService.selectCountByCondition(new YhjbxxInfoExtend(), log).getDatas();
		saveRwjbxxDataInfo.setZcyhs(DecimalUtil.toDecimal(zcyhs));
		// 获取注册需求方
		XqfxxInfoExtend queryXqfxxInfoExtend = new XqfxxInfoExtend();
		Integer zcxqf = xqfxxInfoService
				.selectCountByCondition(ConditionUtil.createCondition(queryXqfxxInfoExtend), log).getDatas();
		saveRwjbxxDataInfo.setZcxqf(DecimalUtil.toDecimal(zcxqf));
		// 获取审核通过需求方
		queryXqfxxInfoExtend.setShzt(YhxxShztEnum.YTG.getCode());
		Integer shxqf = xqfxxInfoService
				.selectCountByCondition(ConditionUtil.createCondition(queryXqfxxInfoExtend), log).getDatas();
		saveRwjbxxDataInfo.setShxqf(DecimalUtil.toDecimal(shxqf));

		// 获取注册开发者
		KfzxxInfoExtend queryKfzxxInfoExtend = new KfzxxInfoExtend();
		Integer zckfz = kfzxxInfoService
				.selectCountByCondition(ConditionUtil.createCondition(queryKfzxxInfoExtend), log).getDatas();
		saveRwjbxxDataInfo.setZckfz(DecimalUtil.toDecimal(zckfz));
		// 获取审核通过开发者
		queryKfzxxInfoExtend.setShzt(YhxxShztEnum.YTG.getCode());
		Integer shkfz = kfzxxInfoService
				.selectCountByCondition(ConditionUtil.createCondition(queryKfzxxInfoExtend), log).getDatas();
		saveRwjbxxDataInfo.setShkfz(DecimalUtil.toDecimal(shkfz));
		RwztbglsInfoExtend queryRwztbglsInfoExtend = new RwztbglsInfoExtend();
		queryRwztbglsInfoExtend.setZt(StringUtil.toShort(RwztStateEnum.DSH.getCode()));

		RwztbglsInfoExtend queryRwztbglsInfoExtend2 = new RwztbglsInfoExtend();
		queryRwztbglsInfoExtend2.setZt(StringUtil.toShort(RwztStateEnum.KFZ.getCode()));
		List<String> orders = new ArrayList<String>();
		orders.add(" t_crowd_xmgl_rwztbgls.czsj asc ");
		queryRwjbxxInfoExtend.setMinXmzt(RwztStateEnum.KFZ.getCode());
		int rwNum = 0;
		long totalHours = 0;
		while (needQuery) {
			List<RwjbxxInfoExtend> rwjbxxDatas = rwjbxxInfoService
					.selectByCondition(
							ConditionUtil.createCondition(queryRwjbxxInfoExtend, new PageInfo(pageSize, pageNum)), log)
					.getDatas();
			pageNum++;
			if (CommonUtil.isNotEmptyList(rwjbxxDatas)) {
				for (RwjbxxInfoExtend rwjbxxInfo : rwjbxxDatas) {
					queryRwztbglsInfoExtend.setXmid(rwjbxxInfo.getWid());
					List<RwztbglsInfoExtend> dshDatas = rwztbglsInfoService.selectByCondition(
							ConditionUtil.createCondition(queryRwztbglsInfoExtend, null, orders), log).getDatas();
					List<RwztbglsInfoExtend> kfzDatas = rwztbglsInfoService.selectByCondition(
							ConditionUtil.createCondition(queryRwztbglsInfoExtend2, null, orders), log).getDatas();
					if (CommonUtil.isNotEmptyList(dshDatas) && CommonUtil.isNotEmptyList(kfzDatas)) {
						Date dshDate = dshDatas.get(0).getCzsj();
						Date kfzDate = kfzDatas.get(0).getCzsj();
						long hours = DateUtil.getHoursBetween(dshDate, kfzDate);
						if(hours>=0){
							rwNum++;
							totalHours += hours;
						}
						
					}
				}
			} else {
				needQuery = false;
			}
		}
		saveRwjbxxDataInfo.setHssj(DecimalUtil.div(DecimalUtil.toDecimal(totalHours), DecimalUtil.toDecimal(rwNum)));
		rwjbxxDataInfoService.insertSelective(saveRwjbxxDataInfo, log);
	}
}
