package com.wisedu.crowd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.BaseInfoMapper;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.BaseInfoService;
import com.wisedu.crowd.service.dto.DataResult;

@Service("baseInfoService")
public class BaseInfoServiceImpl implements BaseInfoService{
	@Autowired
	private BaseInfoMapper baseInfoMapper; 
	@Override
	public DataResult<Integer> checkExistTable(String tableName, CustomOperateLog log) throws ServiceException {
		return DataResult.success(baseInfoMapper.checkExistTable(tableName));
	}

	@Override
	public DataResult<Integer> deleteTable(String tableName, CustomOperateLog log) throws ServiceException {
		return DataResult.success(baseInfoMapper.deleteTable(tableName));
	}

	@Override
	public DataResult<Integer> createNewTable(String tableName, String oldTableName, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(baseInfoMapper.createNewTable(tableName, oldTableName));
	}

	@Override
	public DataResult<Integer> delete(String tableName, CustomOperateLog log) throws ServiceException {
		return DataResult.success(baseInfoMapper.delete(tableName));
	}

	@Override
	public DataResult<Integer> insert(String tableName, String oldTableName) {
		return DataResult.success(baseInfoMapper.insert(tableName, oldTableName));
	}

}
