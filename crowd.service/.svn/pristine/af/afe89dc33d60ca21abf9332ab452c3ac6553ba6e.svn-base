package com.wisedu.crowd.service.statics.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.statics.KfzAreaDataInfoMapper;
import com.wisedu.crowd.dao.statics.extend.KfzAreaDataInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.KfzAreaDataInfo;
import com.wisedu.crowd.entity.statics.extend.KfzAreaDataInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.KfzAreaDataInfoService;

@Service("kfzAreaDataInfoService")
public class KfzAreaDataInfoServiceImpl implements KfzAreaDataInfoService {

	@Autowired
	private KfzAreaDataInfoMapper kfzAreaDataInfoMapper;
	@Autowired
	private KfzAreaDataInfoExtendMapper kfzAreaDataInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzAreaDataInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(KfzAreaDataInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzAreaDataInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<KfzAreaDataInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzAreaDataInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(KfzAreaDataInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(kfzAreaDataInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<Integer> deleteByCondition(KfzAreaDataInfo condition, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(kfzAreaDataInfoExtendMapper.deleteByCondition(condition));
	}

	@Override
	public DataResult<List<KfzAreaDataInfoExtend>> selectDisplayByCondition(
			QueryCondition<KfzAreaDataInfoExtend> condition, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzAreaDataInfoExtendMapper.selectDisplayByCondition(condition));
	}

	
}
