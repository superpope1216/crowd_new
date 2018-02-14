/**
 * Project Name:crowd.service
 * File Name:SjkInfoServiceImpl.java
 * Package Name:com.wisedu.crowd.service.zygl.impl
 * Date:2018年1月12日下午1:21:47
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.zygl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.zygl.SjkInfoMapper;
import com.wisedu.crowd.dao.zygl.extend.SjkInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.zygl.SjkInfo;
import com.wisedu.crowd.entity.zygl.extend.SjkInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.zygl.SjkInfoService;

/**
 * ClassName:SjkInfoServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月12日 下午1:21:47 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("sjkInfoService")
@Transactional
public class SjkInfoServiceImpl implements SjkInfoService{

    @Autowired
    private SjkInfoMapper sjkInfoMapper;
    @Autowired
    private SjkInfoExtendMapper sjkInfoExtendMapper;
    
    @Override
    public DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException {
        return DataResult.success(sjkInfoMapper.deleteByPrimaryKey(wid));
    }
    @Override
    public DataResult<Integer> insertSelective(SjkInfo record) throws ServiceException {
        return DataResult.success(sjkInfoMapper.insertSelective(record));
    }
    @Override
    public DataResult<SjkInfo> selectByPrimaryKey(String wid) throws ServiceException {
        return DataResult.success(sjkInfoMapper.selectByPrimaryKey(wid));
    }
    @Override
    public DataResult<Integer> updateByPrimaryKeySelective(SjkInfo record) throws ServiceException {
        return DataResult.success(sjkInfoMapper.updateByPrimaryKeySelective(record));
    }
    @Override
    public DataResult<List<SjkInfoExtend>> selectDisplayByCondition(QueryCondition<SjkInfoExtend> record,
            CustomOperateLog log) throws ServiceException {
        if (record.getPageInfo() != null) {
            Page<SjkInfoExtend> page = PageHelper.startPage(record.getPageInfo().getPageNum(),
                    record.getPageInfo().getPageSize());
            List<SjkInfoExtend> datas =sjkInfoExtendMapper.selectDisplayByCondition(record);

            DataResult<List<SjkInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(sjkInfoExtendMapper.selectDisplayByCondition(record));
        }
    }
    
    
}

