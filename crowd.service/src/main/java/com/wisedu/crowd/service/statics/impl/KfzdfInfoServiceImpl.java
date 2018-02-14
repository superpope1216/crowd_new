/**
 * Project Name:crowd.service
 * File Name:KfzdfInfoServiceImpl.java
 * Package Name:com.wisedu.crowd.service.statics.impl
 * Date:2018年1月18日下午3:25:20
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.statics.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.statics.KfzdfInfoMapper;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.KfzdfInfo;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.KfzdfInfoService;

/**
 * ClassName:KfzdfInfoServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月18日 下午3:25:20 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("kfzdfInfoService")
@Transactional
public class KfzdfInfoServiceImpl implements KfzdfInfoService{

	@Autowired
	private KfzdfInfoMapper kfzdfInfoMapper;

	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzdfInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(KfzdfInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzdfInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<KfzdfInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzdfInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(KfzdfInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(kfzdfInfoMapper.updateByPrimaryKeySelective(record));
	}
	
	
}

