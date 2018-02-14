package com.wisedu.crowd.task.backup;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class RwjbxxBackupTask extends BaseBackupTask{

	private static final String TABLE_NAME="T_CROWD_DATA_RWJBXX";
	
	private static final String OLD_TABLE_NAME="T_CROWD_XMGL_RWJBXX";
	@Scheduled(cron="0 0/5 * * * ?")
	public void run() throws Exception{
		this.run(OLD_TABLE_NAME, TABLE_NAME);
		
	}
}
