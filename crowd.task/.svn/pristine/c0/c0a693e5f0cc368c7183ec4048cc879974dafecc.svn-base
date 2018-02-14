/**
 * Project Name:crowd.task
 * File Name:AutoDelayTask.java
 * Package Name:com.wisedu.crowd.task.rwxx
 * Date:2018年1月26日上午10:13:40
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.task.rwxx;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.wisedu.crowd.common.code.RwztStateEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwztbglsInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.rwgl.RwztbglsInfoService;

/**
 * ClassName:AutoDelayTask <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月26日 上午10:13:40 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Component
public class AutoDelayTask {

	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	@Autowired
	private RwztbglsInfoService rwztbglsInfoService;
	
//	@Scheduled(cron = "0 0/1 * * * ? ")
	public void run(){
		RwjbxxInfoExtend queryRwjbxxInfoExtend = new RwjbxxInfoExtend();
		List<String> xmzts = new ArrayList<String>();
		xmzts.add(StringUtil.toStr(RwztStateEnum.KFZ.getCode()));
		xmzts.add(StringUtil.toStr(RwztStateEnum.YSBTG.getCode()));
		queryRwjbxxInfoExtend.setXmzts(xmzts);
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
					String rwid = rwjbxxInfo.getWid();
					String jfrq = rwjbxxInfo.getJfrq();
					int xmzt = rwjbxxInfo.getXmzt();
					if(RwztStateEnum.YSBTG.getCode() == xmzt){
						long zbje = rwjbxxInfo.getZbje();
						RwztbglsInfoExtend queryRwztbglsInfoExtend = new RwztbglsInfoExtend();
						queryRwztbglsInfoExtend.setXmid(rwid);
						queryRwztbglsInfoExtend.setZt(StringUtil.toShort(RwztStateEnum.YSBTG.getCode()));
						DataResult<List<RwztbglsInfoExtend>> ztbgLst = rwztbglsInfoService.selectByCondition(
								ConditionUtil.createCondition(queryRwztbglsInfoExtend), null);
						String czsj = DateUtil.formatDate(ztbgLst.getDatas().get(0).getCzsj());
						jfrq = getNewJfrq(czsj, zbje);
					}
					if(DateUtil.getDaysBetween(DateUtil.getCurrentDateStr(), jfrq) < 0){//交付日期小于当前日期
						rwjbxxInfoService.saveKfzxyjfxx(rwjbxxInfo, 0, "2", null, null);
					}
				}
			} else {
				needQuery = false;
			}
		}
	}
	
	protected String getNewJfrq(String czsj, long zbje){
		long days = 0;
		if(zbje<1000){
			days = 1;
		}else if(zbje < 3000){
			days = 2;
		}else if(zbje < 5000){
			days = 3;
		}
		return DateUtil.addDate(czsj, StringUtil.toInt(days, 0));
	}
}

