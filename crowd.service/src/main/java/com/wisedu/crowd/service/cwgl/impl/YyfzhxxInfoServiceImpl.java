package com.wisedu.crowd.service.cwgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.cwgl.YyfzhxxInfoMapper;
import com.wisedu.crowd.dao.cwgl.extend.YyfzhxxInfoExtendMapper;
import com.wisedu.crowd.entity.cwgl.YyfzhxxInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.cwgl.YyfzhxxInfoService;
import com.wisedu.crowd.service.dto.DataResult;

@Service("yyfzhxxInfoService")
public class YyfzhxxInfoServiceImpl implements YyfzhxxInfoService{

	@Autowired
	private YyfzhxxInfoMapper yyfzhxxInfoMapper;
	
	@Autowired
	private YyfzhxxInfoExtendMapper yyfzhxxInfoExtendMapper;

	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(yyfzhxxInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(YyfzhxxInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(yyfzhxxInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<YyfzhxxInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(yyfzhxxInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(YyfzhxxInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(yyfzhxxInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<YyfzhxxInfo>> selectByCondition(QueryCondition<YyfzhxxInfo> record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(yyfzhxxInfoExtendMapper.selectByCondition(record));
	} 
}
