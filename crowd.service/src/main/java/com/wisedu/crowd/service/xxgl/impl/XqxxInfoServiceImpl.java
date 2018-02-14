/**
 * Project Name:crowd.service
 * File Name:XqxxInfoServiceImpl.java
 * Package Name:com.wisedu.crowd.service.xxgl.impl
 * Date:2017年12月7日下午6:28:35
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.xxgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.xxgl.XqxxInfoMapper;
import com.wisedu.crowd.dao.xxgl.extend.XqxxInfoExtendMapper;
import com.wisedu.crowd.entity.cwgl.extend.XqfzhmxInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.xxgl.XqxxInfo;
import com.wisedu.crowd.entity.xxgl.extend.XqxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.xxgl.XqxxInfoService;

/**
 * ClassName:XqxxInfoServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年12月7日 下午6:28:35 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("xqxxInfoService")
public class XqxxInfoServiceImpl implements XqxxInfoService{
    
    @Autowired
    private XqxxInfoMapper xqxxInfoMapper;
    @Autowired
    private XqxxInfoExtendMapper  xqxxExtInfoExtendMapper;

    @Override
    public DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException {
        return  DataResult.success(xqxxInfoMapper.deleteByPrimaryKey(wid));
    }

    @Override
    public DataResult<Integer> insertSelective(XqxxInfo record) throws ServiceException {
        return  DataResult.success(xqxxInfoMapper.insertSelective(record));
    }

    @Override
    public DataResult<XqxxInfo> selectByPrimaryKey(String wid) throws ServiceException {
        return  DataResult.success(xqxxInfoMapper.selectByPrimaryKey(wid));
    }

    @Override
    public DataResult<Integer> updateByPrimaryKeySelective(XqxxInfo record) throws ServiceException {
        return  DataResult.success(xqxxInfoMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public DataResult<List<XqxxInfoExtend>> selectDisplayByCondition(QueryCondition<XqxxInfoExtend> record)
            throws ServiceException {
    	if (record.getPageInfo() != null) {
			Page<XqfzhmxInfoExtend> page = PageHelper.startPage(record.getPageInfo().getPageNum(),
					record.getPageInfo().getPageSize());
			List<XqxxInfoExtend> datas = xqxxExtInfoExtendMapper.selectByCondition(record);

			DataResult<List<XqxxInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(xqxxExtInfoExtendMapper.selectByCondition(record));
		}
    }

    @Override
    public DataResult<Integer> markXqxxInfo(String[] wids, String sfyd) throws ServiceException {
        return DataResult.success(xqxxExtInfoExtendMapper.markXqxxInfo(wids, sfyd));
    }

	@Override
	public DataResult<Integer> selectCountByCondition(QueryCondition<XqxxInfoExtend> condition, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(xqxxExtInfoExtendMapper.selectCountByCondition(condition));
	}

    
}

