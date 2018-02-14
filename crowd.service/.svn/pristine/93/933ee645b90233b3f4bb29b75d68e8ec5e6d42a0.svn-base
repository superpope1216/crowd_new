package com.wisedu.crowd.service.xtgl;

import org.apache.ibatis.annotations.Param;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;

public interface SequenceInfoService {
	DataResult<Integer> createNewSequence(String yearMonth,CustomOperateLog log) throws ServiceException;
	
	DataResult<String> selectNewSepuence(String yearMonth ,CustomOperateLog log) throws ServiceException;
	
	DataResult<String> selectNewRwbh(String yearMonth,CustomOperateLog log) throws ServiceException;
}
