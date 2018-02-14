/**
 * Project Name:crowd.service
 * File Name:KfzxyjfInfoServiceImpl.java
 * Package Name:com.wisedu.crowd.service.yhgl.impl
 * Date:2018年1月24日下午1:53:59
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
import com.wisedu.crowd.dao.yhgl.KfzxyjfInfoMapper;
import com.wisedu.crowd.dao.yhgl.extend.KfzxyjfInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.KfzxyjfInfo;
import com.wisedu.crowd.entity.yhgl.extend.KfzxyjfInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.yhgl.KfzxyjfInfoService;

/**
 * ClassName:KfzxyjfInfoServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月24日 下午1:53:59 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("kfzxyjfInfoService")
@Transactional
public class KfzxyjfInfoServiceImpl implements KfzxyjfInfoService{

	@Autowired
	private KfzxyjfInfoMapper kfzxyjfInfoMapper;
	@Autowired
	private KfzxyjfInfoExtendMapper kfzxyjfInfoExtendMapper;

	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzxyjfInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(KfzxyjfInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzxyjfInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<KfzxyjfInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzxyjfInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(KfzxyjfInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzxyjfInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<KfzxyjfInfoExtend>> selectByCondition(QueryCondition<KfzxyjfInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if(condition.getPageInfo() != null){
			Page<KfzxyjfInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<KfzxyjfInfoExtend> datas = kfzxyjfInfoExtendMapper.selectByCondition(condition);
			DataResult<List<KfzxyjfInfoExtend>> resultData = DataResult.success(datas);
			resultData.setPageInfo(PageUtil.changePageInfo(page));
			return resultData;
		}else{
			return DataResult.success(kfzxyjfInfoExtendMapper.selectByCondition(condition));
		}
	}
}

