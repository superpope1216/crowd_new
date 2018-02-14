package com.wisedu.crowd.task.backup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.BaseInfoService;
@Component
public class BaseBackupTask {
	@Autowired
	private BaseInfoService baseInfoService;
	public void run(String oldTableName,String tableName) throws Exception{
		CustomOperateLog log=new CustomOperateLog();
		
		tableName=tableName+DateUtil.format(DateUtil.getCurrentDate(),"yyyyMM");
		log.setAdmin(true);
		int tableCount=baseInfoService.checkExistTable(tableName, log).getDatas();
		if(tableCount>0){
			baseInfoService.delete(tableName, log);
			
		}else{
			baseInfoService.createNewTable(tableName, oldTableName, log);
		}
		baseInfoService.insert(tableName, oldTableName);
	}
}
