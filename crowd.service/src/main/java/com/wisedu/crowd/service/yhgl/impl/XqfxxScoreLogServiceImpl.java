package com.wisedu.crowd.service.yhgl.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.yhgl.XqfxxScoreLogMapper;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.yhgl.XqfxxScoreLog;
import com.wisedu.crowd.service.yhgl.XqfxxScoreLogService;

@Service("xqfxxScoreLogService")
public class XqfxxScoreLogServiceImpl implements XqfxxScoreLogService{

	@Autowired
	private XqfxxScoreLogMapper xqfxxScoreLogMapper;
	@Override
	public  DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException {
		return DataResult.success(xqfxxScoreLogMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public  DataResult<Integer> insertSelective(XqfxxScoreLog record) throws ServiceException {
		return DataResult.success(xqfxxScoreLogMapper.insertSelective(record));
	}

	@Override
	public DataResult<XqfxxScoreLog> selectByPrimaryKey(String wid) throws ServiceException {
		return DataResult.success(xqfxxScoreLogMapper.selectByPrimaryKey(wid));
				
	}

	@Override
	public  DataResult<Integer> updateByPrimaryKeySelective(XqfxxScoreLog record) throws ServiceException {
		return DataResult.success(xqfxxScoreLogMapper.insertSelective(record));
	}

	
}
