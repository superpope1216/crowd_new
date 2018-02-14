/**
 * Project Name:crowd.service
 * File Name:KfzzfInfoServiceImpl.java
 * Package Name:com.wisedu.crowd.service.statics.impl
 * Date:2018年1月18日下午3:31:10
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
import com.wisedu.crowd.dao.statics.KfzzfInfoMapper;
import com.wisedu.crowd.dao.statics.extend.KfzzfInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.KfzzfInfo;
import com.wisedu.crowd.entity.statics.extend.KfzzfInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.KfzzfInfoService;

/**
 * ClassName:KfzzfInfoServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月18日 下午3:31:10 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("kfzzfInfoServcie")
@Transactional
public class KfzzfInfoServiceImpl implements KfzzfInfoService{

	@Autowired
	private KfzzfInfoMapper kfzzfInfoMapper;
	@Autowired
	private KfzzfInfoExtendMapper kfzzfInfoExtendMapper;
	
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzzfInfoMapper.deleteByPrimaryKey(wid));
	}
	@Override
	public DataResult<Integer> insertSelective(KfzzfInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzzfInfoMapper.insertSelective(record));
	}
	@Override
	public DataResult<KfzzfInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzzfInfoMapper.selectByPrimaryKey(wid));
	}
	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(KfzzfInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(kfzzfInfoMapper.updateByPrimaryKeySelective(record));
	}
	@Override
	public DataResult<List<KfzzfInfoExtend>> selectByCondition(QueryCondition<KfzzfInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<KfzzfInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<KfzzfInfoExtend> datas = kfzzfInfoExtendMapper.selectByCondition(condition);

            DataResult<List<KfzzfInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(kfzzfInfoExtendMapper.selectByCondition(condition));
        }
	}
	
}

