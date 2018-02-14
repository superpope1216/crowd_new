/**
 * Project Name:crowd.service
 * File Name:KfzxyjfxqIndoServiceImpl.java
 * Package Name:com.wisedu.crowd.service.yhgl.impl
 * Date:2018年1月24日下午1:58:04
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.yhgl.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.yhgl.KfzxyjfxqInfoMapper;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.KfzxyjfxqInfo;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.yhgl.KfzxyjfxqInfoService;

/**
 * ClassName:KfzxyjfxqIndoServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月24日 下午1:58:04 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("kfzxyjfxqInfoService")
@Transactional
public class KfzxyjfxqInfoServiceImpl implements KfzxyjfxqInfoService{

	@Autowired
	private KfzxyjfxqInfoMapper kfzxyjfxqInfoMapper;

	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzxyjfxqInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(KfzxyjfxqInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzxyjfxqInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<KfzxyjfxqInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzxyjfxqInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(KfzxyjfxqInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzxyjfxqInfoMapper.updateByPrimaryKeySelective(record));
	}
}

