package com.wisedu.crowd.service.rwgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.dao.rwgl.RwjbxxExtInfoMapper;
import com.wisedu.crowd.dao.rwgl.extend.RwjbxxExtInfoExtendMapper;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.RwjbxxExtInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxExtInfoExtend;
import com.wisedu.crowd.service.rwgl.RwjbxxExtInfoService;

@Service("rwjbxxExtInfoService")
public class RwjbxxExtInfoServiceImpl implements RwjbxxExtInfoService {

	@Autowired
	private RwjbxxExtInfoMapper rwjbxxExtInfoMapper;
	@Autowired
	private RwjbxxExtInfoExtendMapper  rwjbxxExtInfoExtendMapper;
	@Override
	public DataResult<List<RwjbxxExtInfoExtend>> selectByCondition(QueryCondition<RwjbxxExtInfoExtend> record,CustomOperateLog log) throws ServiceException {
		return DataResult.success(rwjbxxExtInfoExtendMapper.selectByCondition(record));
	}

	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException{
		return DataResult.success(rwjbxxExtInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(RwjbxxExtInfo record,CustomOperateLog log) throws ServiceException{
		checkRwjbxxExtInfo(record);
		return DataResult.success(rwjbxxExtInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<RwjbxxExtInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException {
		return DataResult.success(rwjbxxExtInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(RwjbxxExtInfo record,CustomOperateLog log) throws ServiceException{
		checkRwjbxxExtInfo(record);
		return DataResult.success(rwjbxxExtInfoMapper.updateByPrimaryKeySelective(record));
	}
	private void checkRwjbxxExtInfo(RwjbxxExtInfo rwjbxxExtInfo) throws ServiceException{
		if(StringUtil.isEmpty(rwjbxxExtInfo.getRwid())){
			throw new ServiceException("需求WID不能为空，请重新确认！");
		}
		if(StringUtil.isEmpty(rwjbxxExtInfo.getXmbh())){
			throw new ServiceException("项目编号不能为空，请重新确认！");
		}
		if(StringUtil.isEmpty(rwjbxxExtInfo.getYwxbm())){
			throw new ServiceException("业务线不能为空，请重新确认！");
		}
		if(StringUtil.isEmpty(rwjbxxExtInfo.getMkbh())){
			throw new ServiceException("模块不能为空，请重新确认！");
		}
	}

	@Override
	public DataResult<List<RwjbxxExtInfoExtend>> selectDisplayByCondition(QueryCondition<RwjbxxExtInfoExtend> record,CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(rwjbxxExtInfoExtendMapper.selectDisplayByCondition(record));
	}

}
