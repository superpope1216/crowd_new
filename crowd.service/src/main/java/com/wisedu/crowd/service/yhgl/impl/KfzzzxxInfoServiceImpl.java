/**
 * Project Name:crowd.service
 * File Name:KfzzzxxInfoServiceImpl.java
 * Package Name:com.wisedu.crowd.service.yhgl.impl
 * Date:2018年1月17日上午11:03:52
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.yhgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.yhgl.KfzzzxxInfoMapper;
import com.wisedu.crowd.dao.yhgl.extend.KfzzzxxInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.KfzzzxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.KfzzzxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.yhgl.KfzzzxxInfoService;

/**
 * ClassName:KfzzzxxInfoServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月17日 上午11:03:52 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("KfzzzxxInfoService")
@Transactional
public class KfzzzxxInfoServiceImpl implements KfzzzxxInfoService{

	@Autowired
	private KfzzzxxInfoMapper kfzzzxxInfoMapper;
	@Autowired
	private KfzzzxxInfoExtendMapper kfzzzxxInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException {
		return DataResult.success(kfzzzxxInfoMapper.deleteByPrimaryKey(wid));
	}
	@Override
	public DataResult<Integer> insertSelective(KfzzzxxInfo record) throws ServiceException {
		return DataResult.success(kfzzzxxInfoMapper.insertSelective(record));
	}
	@Override
	public DataResult<KfzzzxxInfo> selectByPrimaryKey(String wid) throws ServiceException {
		return DataResult.success(kfzzzxxInfoMapper.selectByPrimaryKey(wid));
	}
	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(KfzzzxxInfo record) throws ServiceException {
		return DataResult.success(kfzzzxxInfoMapper.updateByPrimaryKeySelective(record));
	}
	@Override
	public DataResult<List<KfzzzxxInfoExtend>> selectByCondition(QueryCondition<KfzzzxxInfoExtend> record,
			CustomOperateLog log) throws ServiceException {
		if (record.getPageInfo() != null) {
			Page<KfzzzxxInfoExtend> page = PageHelper.startPage(record.getPageInfo().getPageNum(),
					record.getPageInfo().getPageSize());
			List<KfzzzxxInfoExtend> datas = kfzzzxxInfoExtendMapper.selectByCondition(record);

			DataResult<List<KfzzzxxInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(kfzzzxxInfoExtendMapper.selectByCondition(record));
		}
	}
}

