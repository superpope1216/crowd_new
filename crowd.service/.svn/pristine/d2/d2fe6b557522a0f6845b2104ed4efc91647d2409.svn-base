package com.wisedu.crowd.service.yhgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.yhgl.XqfxxExtInfoMapper;
import com.wisedu.crowd.dao.yhgl.extend.XqfxxExtInfoExtendMapper;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.yhgl.XqfxxExtInfo;
import com.wisedu.crowd.entity.yhgl.extend.XqfxxExtInfoExtend;
import com.wisedu.crowd.service.yhgl.XqfxxExtInfoService;

@Service("xqfxxExtInfoService")
public class XqfxxExtInfoServiceImpl implements XqfxxExtInfoService{
	@Autowired
	private XqfxxExtInfoMapper xqfxxExtInfoMapper;
	@Autowired
	private XqfxxExtInfoExtendMapper xqfxxExtInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog logs) throws ServiceException {
		return DataResult.success(xqfxxExtInfoMapper.deleteByPrimaryKey(wid));
				
	}

	@Override
	public DataResult<Integer> insertSelective(XqfxxExtInfo record,CustomOperateLog logs) throws ServiceException {
		return DataResult.success(xqfxxExtInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<XqfxxExtInfo> selectByPrimaryKey(String wid,CustomOperateLog logs) throws ServiceException {
		return DataResult.success(xqfxxExtInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(XqfxxExtInfo record,CustomOperateLog logs) throws ServiceException {
		return DataResult.success(xqfxxExtInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<XqfxxExtInfoExtend>> selectByCondition(QueryCondition<XqfxxExtInfoExtend> record,
			CustomOperateLog log) throws ServiceException {
		
		if (record.getPageInfo() != null) {
			Page<XqfxxExtInfoExtend> page = PageHelper.startPage(record.getPageInfo().getPageNum(),
					record.getPageInfo().getPageSize());
			DataResult<List<XqfxxExtInfoExtend>> dataResult = DataResult.success(xqfxxExtInfoExtendMapper.selectByCondition(record));
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(xqfxxExtInfoExtendMapper.selectByCondition(record));
		}
			
	}

}
