package com.wisedu.crowd.task.rwxx;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.wisedu.crowd.common.code.RwztStateEnum;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.rwgl.RwjbxxInfo;
import com.wisedu.crowd.entity.rwgl.RwztbglsInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwztbglsInfoExtend;
import com.wisedu.crowd.entity.yhgl.KfzpjxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.XqfbpjgInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;
import com.wisedu.crowd.service.rwgl.RwztbglsInfoService;
import com.wisedu.crowd.service.yhgl.KfzpjxxInfoService;
import com.wisedu.crowd.service.yhgl.KfzxxInfoService;
import com.wisedu.crowd.service.yhgl.XqfbpjgInfoService;
import com.wisedu.crowd.service.yhgl.XqfxxInfoService;

/**
 * 结束待评价的任务
 * @author de
 *
 */
@Component
@Transactional
public class AutoCloseDpjTask {

	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;
	@Autowired
	private KfzxxInfoService kfzxxInfoService;
	@Autowired
	private XqfxxInfoService xqfxxInfoService;
	@Autowired
	private RwztbglsInfoService rwztbglsInfoService;
	@Autowired
	private XqfbpjgInfoService xqfbpjgInfoService;
	@Autowired
	private KfzpjxxInfoService kfzpjxxInfoService;
	//@Scheduled(cron = "0 0/1 *  * * ? ")
	public void run() throws Exception {
		RwjbxxInfoExtend queryRwjbxxInfoExtend = new RwjbxxInfoExtend();
		queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.DPJ.getCode());
		int pageNum = 1;
		int pageSize = 500;
		boolean needQuery = true;
		while (needQuery) {
			List<RwjbxxInfoExtend> datas = rwjbxxInfoService.selectDisplayByCondition(ConditionUtil.createCondition(queryRwjbxxInfoExtend, new PageInfo(pageSize, pageNum))).getDatas();
			pageNum++;
			
			if (CommonUtil.isNotEmptyList(datas)) {
				for(RwjbxxInfoExtend rwjbxxInfo:datas){
					RwztbglsInfoExtend queryRwztbglsInfoExtend=new RwztbglsInfoExtend();
					queryRwztbglsInfoExtend.setXmid(rwjbxxInfo.getWid());
					queryRwjbxxInfoExtend.setXmzt(RwztStateEnum.DPJ.getCode());
					List<RwztbglsInfoExtend> rwztDatas=rwztbglsInfoService.selectByCondition(ConditionUtil.createCondition(queryRwztbglsInfoExtend), null).getDatas();
					if(CommonUtil.isNotEmptyList(rwztDatas)){
						RwztbglsInfoExtend rwztbglsInfoExtend=rwztDatas.get(0);
						Date cjsj=rwztbglsInfoExtend.getCzsj();
						long days=DateUtil.getDaysBetween(DateUtil.formatDate(cjsj),DateUtil.getCurrentDateStr());
						if(days>7){
							RwjbxxInfo saveRwjbxxInfo=new RwjbxxInfo();
							saveRwjbxxInfo.setWid(rwjbxxInfo.getWid());
							saveRwjbxxInfo.setXmzt(RwztStateEnum.YJX.getCode());
							rwjbxxInfoService.updateByPrimaryKeySelective(saveRwjbxxInfo);
							RwztbglsInfo saveRwztbglsInfo=new RwztbglsInfo();
							saveRwztbglsInfo.setCzrip("127.0.0.1");
							saveRwztbglsInfo.setCzrxm("系统管理员");
							saveRwztbglsInfo.setCzsj(DateUtil.getCurrentDate());
							saveRwztbglsInfo.setKfzid(rwjbxxInfo.getKfzid());
							saveRwztbglsInfo.setShyy("系统自动结束需求");
							saveRwztbglsInfo.setWid(StringUtil.getUuId());
							saveRwztbglsInfo.setXmid(rwjbxxInfo.getWid());
							saveRwztbglsInfo.setXqfid(rwjbxxInfo.getXqfid());
							saveRwztbglsInfo.setZt(StringUtil.toShort(RwztStateEnum.YJX.getCode()));
							rwztbglsInfoService.insertSelective(saveRwztbglsInfo, null);
							//获取开发者对需求方的评价信息
							XqfbpjgInfoExtend queryXqfbpjgInfoExtend = new XqfbpjgInfoExtend();
							queryXqfbpjgInfoExtend.setSsxmid(rwjbxxInfo.getWid());
							DataResult<List<XqfbpjgInfoExtend>> xqfbpLst = xqfbpjgInfoService.selectByCondition(ConditionUtil.createCondition(queryXqfbpjgInfoExtend), null);
							if(CommonUtil.isNotEmptyList(xqfbpLst.getDatas())){
								int pjjg = StringUtil.toInt(xqfbpLst.getDatas().get(0).getPjjg());
								rwjbxxInfoService.saveXqfxyjfxx(rwjbxxInfo, "2", pjjg, false, null);
							}
							//获取需求方对开发者的评价信息
							KfzpjxxInfo queryKfzpjxxInfo = new KfzpjxxInfo();
							queryKfzpjxxInfo.setSsxmid(rwjbxxInfo.getWid());
							DataResult<List<KfzpjxxInfo>> kfzpjLst = kfzpjxxInfoService.selectByCondition(ConditionUtil.createCondition(queryKfzpjxxInfo), null);
							if(CommonUtil.isNotEmptyList(kfzpjLst.getDatas())){
								String pjjg = kfzpjLst.getDatas().get(0).getPjjg();
								rwjbxxInfoService.saveKfzxyjfxx(rwjbxxInfo, 0, "4", pjjg, null);
							}
						}
					}
					
				}
			}else{
				needQuery=false;
			}
		}
	}
}
