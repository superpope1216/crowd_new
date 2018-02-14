package com.wisedu.crowd.service.yhgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.yhgl.KfzpjxxInfoMapper;
import com.wisedu.crowd.dao.yhgl.extend.KfzpjxxInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.KfzpjxxInfo;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.yhgl.KfzpjxxInfoService;

@Service("kfzpjxxInfoService")
public class KfzpjxxInfoServiceImpl implements KfzpjxxInfoService{
	@Autowired
	private  KfzpjxxInfoMapper kfzpjxxInfoMapper;
	
	@Autowired
	private  KfzpjxxInfoExtendMapper kfzpjxxInfoExtendMapper; 

	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzpjxxInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(KfzpjxxInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzpjxxInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<KfzpjxxInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzpjxxInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(KfzpjxxInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(kfzpjxxInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<KfzpjxxInfo>> selectByCondition(QueryCondition<KfzpjxxInfo> record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(kfzpjxxInfoExtendMapper.selectByCondition(record));
	}

}
