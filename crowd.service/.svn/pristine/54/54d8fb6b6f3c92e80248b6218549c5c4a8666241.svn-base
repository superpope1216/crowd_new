package com.wisedu.crowd.service.statics.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.statics.TrainEnrolDataInfoMapper;
import com.wisedu.crowd.dao.statics.extend.TrainEnrolDataInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.TrainEnrolDataInfo;
import com.wisedu.crowd.entity.statics.extend.TrainEnrolDataInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.TrainEnrolDataInfoService;

@Service("trainEnrolDataInfoService")
public class TrainEnrolDataInfoServiceImpl implements TrainEnrolDataInfoService{

	@Autowired
	private TrainEnrolDataInfoMapper trainEnrolDataInfoMapper;
	@Autowired
	private TrainEnrolDataInfoExtendMapper trainEnrolDataInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(trainEnrolDataInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(TrainEnrolDataInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(trainEnrolDataInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<TrainEnrolDataInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(trainEnrolDataInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(TrainEnrolDataInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(trainEnrolDataInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<Integer> deleteByCondition(QueryCondition<TrainEnrolDataInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		return DataResult.success(trainEnrolDataInfoExtendMapper.deleteByCondition(condition));
	}

	@Override
	public DataResult<List<TrainEnrolDataInfoExtend>> selectDisplayByCondition(
			QueryCondition<TrainEnrolDataInfoExtend> condition, CustomOperateLog log) throws ServiceException {
		return DataResult.success(trainEnrolDataInfoExtendMapper.selectDisplayByCondition(condition));
	}

}
