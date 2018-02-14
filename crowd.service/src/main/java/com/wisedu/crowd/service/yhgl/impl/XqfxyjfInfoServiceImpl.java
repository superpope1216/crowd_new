/**
 * Project Name:crowd.service
 * File Name:XqfxyjfInfoServiceImpl.java
 * Package Name:com.wisedu.crowd.service.yhgl.impl
 * Date:2018年1月24日下午2:00:18
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
import com.wisedu.crowd.dao.yhgl.XqfxyjfInfoMapper;
import com.wisedu.crowd.dao.yhgl.extend.XqfxyjfInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.XqfxyjfInfo;
import com.wisedu.crowd.entity.yhgl.extend.XqfxyjfInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.yhgl.XqfxyjfInfoService;

/**
 * ClassName:XqfxyjfInfoServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月24日 下午2:00:18 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("xqfxyjfInfoService")
@Transactional
public class XqfxyjfInfoServiceImpl implements XqfxyjfInfoService{

	@Autowired
	private XqfxyjfInfoMapper xqfxyjfInfoMapper;
	@Autowired
	private XqfxyjfInfoExtendMapper xqfxyjfInfoExtendMapper;

	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfxyjfInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(XqfxyjfInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfxyjfInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<XqfxyjfInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfxyjfInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(XqfxyjfInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfxyjfInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<XqfxyjfInfoExtend>> selectByCondition(QueryCondition<XqfxyjfInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if(condition.getPageInfo() != null){
			Page<XqfxyjfInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(), 
					condition.getPageInfo().getPageSize());
			List<XqfxyjfInfoExtend> datas = xqfxyjfInfoExtendMapper.selectByCondition(condition);
			DataResult<List<XqfxyjfInfoExtend>> resultData = DataResult.success(datas);
			resultData.setPageInfo(PageUtil.changePageInfo(page));
			return resultData;
		}else{
			return DataResult.success(xqfxyjfInfoExtendMapper.selectByCondition(condition));
		}
	}
}

