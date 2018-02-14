package com.wisedu.crowd.service.yhgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.yhgl.XqfbpjgInfoMapper;
import com.wisedu.crowd.dao.yhgl.extend.XqfbpjgInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.XqfbpjgInfo;
import com.wisedu.crowd.entity.yhgl.extend.XqfbpjgInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.yhgl.XqfbpjgInfoService;

@Service("xqfbpjgInfoService")
public class XqfbpjgInfoServiceImpl implements XqfbpjgInfoService {

	@Autowired
	private XqfbpjgInfoMapper xqfbpjgInfoMapper;
	@Autowired
	private XqfbpjgInfoExtendMapper xqfbpjgInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfbpjgInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(XqfbpjgInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfbpjgInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<XqfbpjgInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfbpjgInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(XqfbpjgInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(xqfbpjgInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<XqfbpjgInfoExtend>> selectByCondition(QueryCondition<XqfbpjgInfoExtend> record,
			CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfbpjgInfoExtendMapper.selectByCondition(record));
	}

}
