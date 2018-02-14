package com.wisedu.crowd.service.cwgl.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.cwgl.YyfzhszmxInfoMapper;
import com.wisedu.crowd.entity.cwgl.YyfzhszmxInfo;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.cwgl.YyfzhszmxInfoService;
import com.wisedu.crowd.service.dto.DataResult;

@Service("yyfzhszmxInfoService")
public class YyfzhszmxInfoServiceImpl implements YyfzhszmxInfoService{

	@Autowired
	private YyfzhszmxInfoMapper yyfzhszmxInfoMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(yyfzhszmxInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(YyfzhszmxInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(yyfzhszmxInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<YyfzhszmxInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(yyfzhszmxInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(YyfzhszmxInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(yyfzhszmxInfoMapper.updateByPrimaryKeySelective(record));
	}

	
}
