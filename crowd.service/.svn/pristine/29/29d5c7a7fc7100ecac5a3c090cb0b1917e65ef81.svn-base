/**
 * Project Name:crowd.service
 * File Name:XqfdfInfoServcieImpl.java
 * Package Name:com.wisedu.crowd.service.statics.impl
 * Date:2018年1月18日下午3:28:04
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.statics.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.statics.XqfdfInfoMapper;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.XqfdfInfo;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.XqfdfInfoService;

/**
 * ClassName:XqfdfInfoServcieImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月18日 下午3:28:04 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("xqfdfInfoService")
@Transactional
public class XqfdfInfoServcieImpl implements XqfdfInfoService{

	@Autowired
	private XqfdfInfoMapper xqfdfInfoMapper;

	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfdfInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(XqfdfInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfdfInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<XqfdfInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfdfInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(XqfdfInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(xqfdfInfoMapper.updateByPrimaryKeySelective(record));
	}
}

