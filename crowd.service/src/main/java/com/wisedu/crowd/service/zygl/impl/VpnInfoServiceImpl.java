/**
 * Project Name:crowd.service
 * File Name:VpnInfoServiceImpl.java
 * Package Name:com.wisedu.crowd.service.zygl.impl
 * Date:2018年1月12日下午1:29:12
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.zygl.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.zygl.VpnInfoMapper;
import com.wisedu.crowd.entity.zygl.VpnInfo;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.zygl.VpnInfoService;

/**
 * ClassName:VpnInfoServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月12日 下午1:29:12 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("vpnInfoService")
@Transactional
public class VpnInfoServiceImpl implements VpnInfoService{

    @Autowired
    private VpnInfoMapper vpnInfoMapper;

    @Override
    public DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException {
        return DataResult.success(vpnInfoMapper.deleteByPrimaryKey(wid));
    }

    @Override
    public DataResult<Integer> insertSelective(VpnInfo record) throws ServiceException {
        return DataResult.success(vpnInfoMapper.insertSelective(record));
    }

    @Override
    public DataResult<VpnInfo> selectByPrimaryKey(String wid) throws ServiceException {
        return DataResult.success(vpnInfoMapper.selectByPrimaryKey(wid));
    }

    @Override
    public DataResult<Integer> updateByPrimaryKeySelective(VpnInfo record) throws ServiceException {
        return DataResult.success(vpnInfoMapper.updateByPrimaryKeySelective(record));
    }
}

