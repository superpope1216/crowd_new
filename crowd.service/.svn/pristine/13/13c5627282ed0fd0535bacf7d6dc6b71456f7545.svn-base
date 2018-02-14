package com.wisedu.crowd.service.statics.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.statics.RwjbxxDataInfoMapper;
import com.wisedu.crowd.dao.statics.extend.RwjbxxDataInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.RwjbxxDataInfo;
import com.wisedu.crowd.entity.statics.extend.RwjbxxDataInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.RwjbxxDataInfoService;

@Service("rwjbxxDataInfoService")
public class RwjbxxDataInfoServiceImpl implements RwjbxxDataInfoService{

	@Autowired
	private RwjbxxDataInfoMapper rwjbxxDataInfoMapper;
	@Autowired
	private RwjbxxDataInfoExtendMapper rwjbxxDataInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(rwjbxxDataInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(RwjbxxDataInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(rwjbxxDataInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<RwjbxxDataInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(rwjbxxDataInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(RwjbxxDataInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(rwjbxxDataInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<Integer> deleteByCondition(RwjbxxDataInfoExtend condition, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(rwjbxxDataInfoExtendMapper.deleteByCondition(condition));
	}

	@Override
	public DataResult<RwjbxxDataInfoExtend> selectByCondition(QueryCondition<RwjbxxDataInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		return DataResult.success(rwjbxxDataInfoExtendMapper.selectByCondition(condition));
	}

}
