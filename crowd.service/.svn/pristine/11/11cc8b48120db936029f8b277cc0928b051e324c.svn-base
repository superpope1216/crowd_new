package com.wisedu.crowd.service;


import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;

public interface BaseInfoService {
	DataResult<Integer> checkExistTable( String tableName,CustomOperateLog log) throws ServiceException;
	
	DataResult<Integer> deleteTable( String tableName,CustomOperateLog log) throws ServiceException;
	
	DataResult<Integer> createNewTable(String tableName, String oldTableName,CustomOperateLog log) throws ServiceException;
	
	DataResult<Integer> delete(String tableName,CustomOperateLog log) throws ServiceException;
	
	DataResult<Integer> insert(String tableName,String oldTableName);
}
