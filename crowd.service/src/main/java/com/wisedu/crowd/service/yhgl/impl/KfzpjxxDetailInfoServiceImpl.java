package com.wisedu.crowd.service.yhgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.yhgl.KfzpjxxDetailInfoMapper;
import com.wisedu.crowd.dao.yhgl.extend.KfzpjxxDetailInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.KfzpjxxDetailInfo;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.yhgl.KfzpjxxDetailInfoService;

@Service("kfzpjxxDetailInfoService")
public class KfzpjxxDetailInfoServiceImpl implements KfzpjxxDetailInfoService{

	@Autowired
	private KfzpjxxDetailInfoMapper kfzpjxxDetailInfoMapper;
	
	@Autowired
	private KfzpjxxDetailInfoExtendMapper kfzpjxxDetailInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzpjxxDetailInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(KfzpjxxDetailInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzpjxxDetailInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<KfzpjxxDetailInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzpjxxDetailInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(KfzpjxxDetailInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(kfzpjxxDetailInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<KfzpjxxDetailInfo>> selectByCondition(QueryCondition<KfzpjxxDetailInfo> record,
			CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzpjxxDetailInfoExtendMapper.selectByCondition(record));
	}


}
