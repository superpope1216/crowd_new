package com.wisedu.crowd.task.rwxx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.wisedu.crowd.common.code.RwztStateEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.rwgl.RwjbxxInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwtbxxInfoExtend;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.rwgl.RwtbxxInfoService;

/**
 * 过期任务自动关闭
 * 
 * @author de
 *
 */
@Component
public class AutoCloseTask {

	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;

	@Autowired
	private RwtbxxInfoService rwtbxxInfoService;

	//@Scheduled(cron = "0 0/1 *  * * ? ")
	public void run() throws Exception {
		RwjbxxInfoExtend queryRwjbxxInfoExtend = new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.ZBZ.getCode());
		queryRwjbxxInfoExtend.setMaxZbjzrq(DateUtil.parseDate(DateUtil.addDate(DateUtil.getCurrentDate(), -1)));
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
					RwtbxxInfoExtend queryRwtbxxInfoExtend = new RwtbxxInfoExtend();
					queryRwtbxxInfoExtend.setRwid(rwjbxxInfo.getWid());
					// 如果已有投标，则关闭
					Integer tbCount = rwtbxxInfoService
							.selectCountByCondition(ConditionUtil.createCondition(queryRwtbxxInfoExtend)).getDatas();
					if (tbCount != null && tbCount > 0) {
						RwjbxxInfo saveRwjbxxInfo = new RwjbxxInfo();
						saveRwjbxxInfo.setWid(rwjbxxInfo.getWid());
						saveRwjbxxInfo.setXmzt(RwztStateEnum.YGB.getCode());
						rwjbxxInfoService.updateByPrimaryKeySelective(saveRwjbxxInfo);
					} else {// 如果没有投标，则判断其是否已超过7天，如果超过7天则关闭
						long days = DateUtil.getDaysBetween(DateUtil.formatDate(rwjbxxInfo.getZbjzrq()),
								DateUtil.getCurrentDateStr());
						if (days >= 7) {
							RwjbxxInfo saveRwjbxxInfo = new RwjbxxInfo();
							saveRwjbxxInfo.setWid(rwjbxxInfo.getWid());
							saveRwjbxxInfo.setXmzt(RwztStateEnum.YGB.getCode());
							rwjbxxInfoService.updateByPrimaryKeySelective(saveRwjbxxInfo);
						}
					}
				}

			} else {
				needQuery = false;
			}

		}
	}
}
