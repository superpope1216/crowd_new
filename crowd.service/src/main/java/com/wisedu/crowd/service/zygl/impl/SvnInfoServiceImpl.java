/**
 * Project Name:crowd.service
 * File Name:SvnInfoServiceImpl.java
 * Package Name:com.wisedu.crowd.service.zygl.impl
 * Date:2018年1月12日下午1:26:01
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.zygl.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.zygl.SvnInfoMapper;
import com.wisedu.crowd.entity.zygl.SvnInfo;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.zygl.SvnInfoService;

/**
 * ClassName:SvnInfoServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月12日 下午1:26:01 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("svnInfoService")
@Transactional
public class SvnInfoServiceImpl implements SvnInfoService{

    @Autowired
    private SvnInfoMapper svnInfoMapper;

    @Override
    public DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException {
        return DataResult.success(svnInfoMapper.deleteByPrimaryKey(wid));
    }

    @Override
    public DataResult<Integer> insertSelective(SvnInfo record) throws ServiceException {
        return DataResult.success(svnInfoMapper.insertSelective(record));
    }

    @Override
    public DataResult<SvnInfo> selectByPrimaryKey(String wid) throws ServiceException {
        return DataResult.success(svnInfoMapper.selectByPrimaryKey(wid));
    }

    @Override
    public DataResult<Integer> updateByPrimaryKeySelective(SvnInfo record) throws ServiceException {
        return DataResult.success(svnInfoMapper.updateByPrimaryKeySelective(record));
    }
}

