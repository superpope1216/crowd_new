package com.wisedu.crowd.service.xmgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.xmgl.YwxWorkTime;
import com.wisedu.crowd.entity.xmgl.extend.YwxWorkTimeExtend;

public interface YwxWorkTimeService {

	DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

	DataResult<Integer> insertSelective(YwxWorkTime record,CustomOperateLog log) throws ServiceException;

	DataResult<Integer> updateByPrimaryKeySelective(YwxWorkTime record,CustomOperateLog log) throws ServiceException;

	DataResult<YwxWorkTime> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

	DataResult<List<YwxWorkTimeExtend>> selectByCondition(QueryCondition<YwxWorkTimeExtend> record,
			CustomOperateLog log) throws ServiceException;


}
