package com.wisedu.crowd.service.statics.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.statics.JjrInfoMapper;
import com.wisedu.crowd.dao.statics.extend.JjrInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.JjrInfo;
import com.wisedu.crowd.entity.statics.extend.JjrInfoExtend;
import com.wisedu.crowd.entity.train.extend.TrainEnrolInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.JjrInfoService;

@Service("jjrInfoService")
public class JjrInfoServiceImpl implements JjrInfoService{

	@Autowired
	private JjrInfoMapper jjrInfoMapper;
	@Autowired
	private JjrInfoExtendMapper jjrInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(jjrInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(JjrInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(jjrInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<JjrInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(jjrInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(JjrInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(jjrInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<JjrInfoExtend>> selectByCondition(QueryCondition<JjrInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		return DataResult.success(jjrInfoExtendMapper.selectByCondition(condition));
	}

}
