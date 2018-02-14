package com.wisedu.crowd.service.yhgl;

import java.util.List;

import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.YhjbxxLoginLogInfo;
import com.wisedu.crowd.entity.yhgl.extend.YhjbxxLoginLogInfoExtend;

public interface YhjbxxLoginLogInfoService {
	/**
	 *
	 * @mbggenerated 2017-11-03
	 */
	int deleteByPrimaryKey(String wid,CustomOperateLog log);

	/**
	 *
	 * @mbggenerated 2017-11-03
	 */
	int insertSelective(YhjbxxLoginLogInfo record,CustomOperateLog log);

	/**
	 *
	 * @mbggenerated 2017-11-03
	 */
	YhjbxxLoginLogInfo selectByPrimaryKey(String wid,CustomOperateLog log);

	/**
	 *
	 * @mbggenerated 2017-11-03
	 */
	int updateByPrimaryKeySelective(YhjbxxLoginLogInfo record,CustomOperateLog log);
	
	List<YhjbxxLoginLogInfoExtend>  selectByCondition(YhjbxxLoginLogInfoExtend record,CustomOperateLog log);

}
