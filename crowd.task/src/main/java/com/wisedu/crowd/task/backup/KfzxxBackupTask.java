package com.wisedu.crowd.task.backup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.BaseInfoService;

@Component
@Transactional
public class KfzxxBackupTask extends BaseBackupTask{
	
	private static final String TABLE_NAME="T_CROWD_DATA_KFZXX";
	
	private static final String OLD_TABLE_NAME="T_CROWD_YHGL_KFZXX";
	
	@Scheduled(cron="0 0/5 * * * ?")
	public void run() throws Exception{
		this.run(OLD_TABLE_NAME, TABLE_NAME);
		
	}
}
