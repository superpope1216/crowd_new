/**
 * Project Name:crowd.service
 * File Name:XqfzfInfoServiceImpl.java
 * Package Name:com.wisedu.crowd.service.statics.impl
 * Date:2018年1月18日下午3:35:57
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.statics.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.statics.XqfzfInfoMapper;
import com.wisedu.crowd.dao.statics.extend.XqfzfInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.XqfzfInfo;
import com.wisedu.crowd.entity.statics.extend.XqfzfInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.XqfzfInfoService;

/**
 * ClassName:XqfzfInfoServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月18日 下午3:35:57 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("xqfzfInfoService")
@Transactional
public class XqfzfInfoServiceImpl implements XqfzfInfoService{
	
	@Autowired
	private XqfzfInfoMapper xqfzfInfoMapper;
	@Autowired
	private XqfzfInfoExtendMapper xqfzfInfoExtendMapper;
	
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfzfInfoMapper.deleteByPrimaryKey(wid));
	}
	@Override
	public DataResult<Integer> insertSelective(XqfzfInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfzfInfoMapper.insertSelective(record));
	}
	@Override
	public DataResult<XqfzfInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfzfInfoMapper.selectByPrimaryKey(wid));
	}
	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(XqfzfInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(xqfzfInfoMapper.updateByPrimaryKeySelective(record));
	}
	@Override
	public DataResult<List<XqfzfInfoExtend>> selectByCondition(QueryCondition<XqfzfInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if(condition.getPageInfo() != null){
			Page<XqfzfInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(), 
					condition.getPageInfo().getPageSize());
			List<XqfzfInfoExtend> datas = xqfzfInfoExtendMapper.selectByCondition(condition);
			DataResult<List<XqfzfInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		}else{
			return DataResult.success(xqfzfInfoExtendMapper.selectByCondition(condition));
		}
	}

}

