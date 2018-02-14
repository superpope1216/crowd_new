package com.wisedu.crowd.service.cwgl.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.cwgl.GrsdsInfoMapper;
import com.wisedu.crowd.dao.cwgl.extend.GrsdsInfoExtendMapper;
import com.wisedu.crowd.entity.cwgl.GrsdsInfo;
import com.wisedu.crowd.entity.cwgl.extend.GrsdsInfoExtend;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.cwgl.GrsdsInfoService;
import com.wisedu.crowd.service.dto.DataResult;

@Service("grsdsInfoService")
public class GrsdsInfoServiceImpl implements GrsdsInfoService{

	@Autowired
	private GrsdsInfoMapper grsdsInfoMapper;
	@Autowired
	private GrsdsInfoExtendMapper grsdsInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(grsdsInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(GrsdsInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(grsdsInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<GrsdsInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(grsdsInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(GrsdsInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(grsdsInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<GrsdsInfoExtend>> selectByMoney(BigDecimal money, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(grsdsInfoExtendMapper.selectByMoney(money));
	}

}
