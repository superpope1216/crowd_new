package com.wisedu.crowd.service.statics.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.statics.RwjbxxRwxsDataInfoMapper;
import com.wisedu.crowd.dao.statics.extend.RwjbxxRwxsDataInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.RwjbxxRwxsDataInfo;
import com.wisedu.crowd.entity.statics.extend.RwjbxxRwxsDataInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.RwjbxxRwxsDataInfoService;

@Service("RwjbxxRwxsDataInfoService")
public class RwjbxxRwxsDataInfoServiceImpl implements RwjbxxRwxsDataInfoService{
	@Autowired
	private RwjbxxRwxsDataInfoMapper rwjbxxRwxsDataInfoMapper;
	@Autowired
	private RwjbxxRwxsDataInfoExtendMapper rwjbxxRwxsDataInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(rwjbxxRwxsDataInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(RwjbxxRwxsDataInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(rwjbxxRwxsDataInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<RwjbxxRwxsDataInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(rwjbxxRwxsDataInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(RwjbxxRwxsDataInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(rwjbxxRwxsDataInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<Integer> deleteByCondition(RwjbxxRwxsDataInfoExtend condition, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(rwjbxxRwxsDataInfoExtendMapper.deleteByCondition(condition));
	}

	@Override
	public DataResult<List<RwjbxxRwxsDataInfoExtend>> selectByCondition(QueryCondition<RwjbxxRwxsDataInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		return DataResult.success(rwjbxxRwxsDataInfoExtendMapper.selectByCondition(condition));
	}
}
