package com.wisedu.crowd.task.statics;

import java.util.ArrayList;
import java.util.List;

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
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwtbxxInfoExtend;
import com.wisedu.crowd.entity.statics.KfzxxData;
import com.wisedu.crowd.entity.statics.extend.KfzxxDataExtend;
import com.wisedu.crowd.entity.yhgl.extend.KfzxxInfoExtend;
import com.wisedu.crowd.entity.yhgl.extend.KfzzzxxInfoExtend;
import com.wisedu.crowd.service.cwgl.KfzzhmxInfoService;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.rwgl.RwtbxxInfoService;
import com.wisedu.crowd.service.statics.KfzxxDataService;
import com.wisedu.crowd.service.yhgl.KfzxxInfoService;
import com.wisedu.crowd.service.yhgl.KfzzzxxInfoService;

/**
 * 开发者在平台参与项目、投标情况，最终得分、收入、证书等计算自动任务
 * @author wisedu
 *
 */
@Component
@Transactional
public class KfzxxDataStatics {
	
	@Autowired
	private KfzxxInfoService kfzxxInfoService;
	
	@Autowired
	private KfzzzxxInfoService kfzzzxxInfoService;
	
	@Autowired
	private RwtbxxInfoService rwtbxxInfoService;
	
	@Autowired
	private KfzxxDataService kfzxxDataService;
	
	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	
	@Autowired
	private KfzzhmxInfoService kfzzhmxInfoService;
	//@Scheduled(cron = "0 0 0/1  * * ? ")
	public void run() throws Exception {
		KfzxxInfoExtend queryKfzxxInfoExtend = new KfzxxInfoExtend();
		int pageNum = 1;
		int pageSize = 500;
		boolean needQuery = true;
		CustomOperateLog log=new CustomOperateLog();
		log.setAdmin(true);
		KfzxxDataExtend delKfzxxDataExtend=new KfzxxDataExtend();
		kfzxxDataService.deleteByCondition(delKfzxxDataExtend, log);
		while (needQuery) {
			List<KfzxxInfoExtend> kfzxxs=kfzxxInfoService.selectByCondition(ConditionUtil.createCondition(queryKfzxxInfoExtend, new PageInfo(pageSize,pageNum)), log).getDatas();
			pageNum++;
			if(CommonUtil.isNotEmptyList(kfzxxs)){
				for(KfzxxInfoExtend kfzxxInfo:kfzxxs){
					KfzxxData saveKfzxxData=new KfzxxData();
					saveKfzxxData.setKfzid(kfzxxInfo.getWid());
					saveKfzxxData.setWid(StringUtil.getUuId());
					//统计中标数字
					RwjbxxInfoExtend queryRwjbxxInfoExtend=new RwjbxxInfoExtend();
					queryRwjbxxInfoExtend.setKfzid(kfzxxInfo.getWid());
					queryRwjbxxInfoExtend.setMaxXmzt(RwztStateEnum.YJX.getCode());
					int cyxm=rwjbxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend), log).getDatas();
					saveKfzxxData.setCyxm(DecimalUtil.toDecimal(cyxm));
					//获取最高的平台技能
					
					KfzzzxxInfoExtend queryKfzzzxxInfoExtend=new KfzzzxxInfoExtend();
					queryKfzzzxxInfoExtend.setKfzid(kfzxxInfo.getWid());
					List<String> orders=new ArrayList<String>();
					orders.add("t_crowd_yhgl_kfzzzxx.zzdjid desc ");
					List<KfzzzxxInfoExtend> zzxxDatas=kfzzzxxInfoService.selectByCondition(ConditionUtil.createCondition(queryKfzzzxxInfoExtend, new PageInfo(1,1),orders), log).getDatas();
					String ptrzjn="",ptrzdj="";
					if(CommonUtil.isNotEmptyList(zzxxDatas)){
						ptrzjn=zzxxDatas.get(0).getZzlbid();
						ptrzdj=zzxxDatas.get(0).getZzdjid();
						saveKfzxxData.setPtrzjn(ptrzjn);
						saveKfzxxData.setPtrzdj(ptrzdj);
					}
					//投标数据
					RwtbxxInfoExtend queryRwtbxxInfoExtend=new RwtbxxInfoExtend();
					queryRwtbxxInfoExtend.setKfzid(kfzxxInfo.getWid());
				    
					Integer tbs= rwtbxxInfoService.selectCountByCondition(ConditionUtil.createCondition(queryRwtbxxInfoExtend)).getDatas();
					saveKfzxxData.setTbs(DecimalUtil.toDecimal(tbs));
					
					//开发者收入
					KfzzhmxInfoExtend queryKfzzhmxInfoExtend=new KfzzhmxInfoExtend();
					queryKfzzhmxInfoExtend.setKfzid(kfzxxInfo.getWid());
					queryKfzzhmxInfoExtend.setSzlbid(SzlbEnum.XMSR.getCode());
					
					Double money=kfzzhmxInfoService.selectTotalMoney(ConditionUtil.createCondition(queryKfzzhmxInfoExtend), log).getDatas();
					saveKfzxxData.setZsr(DecimalUtil.toDecimal(money));
					
					//开发者信誉得分
					
					kfzxxDataService.insertSelective(saveKfzxxData, log);
				}
			}else{
				needQuery=false;
			}
			
		}
	}
}
