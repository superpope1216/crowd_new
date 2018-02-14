/**
 * Project Name:crowd.service
 * File Name:YzmInfoServiceImpl.java
 * Package Name:com.wisedu.crowd.service.zygl.impl
 * Date:2018年1月12日上午11:54:02
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
import com.wisedu.crowd.dao.zygl.YzmInfoMapper;
import com.wisedu.crowd.dao.zygl.extend.YzmInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.zygl.YzmInfo;
import com.wisedu.crowd.entity.zygl.extend.YzmInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.zygl.YzmInfoService;

/**
 * ClassName:YzmInfoServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月12日 上午11:54:02 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("yzmInfoService")
@Transactional
public class YzmInfoServiceImpl implements YzmInfoService{

    @Autowired
    private YzmInfoMapper yzmInfoMapper;
    @Autowired
    private YzmInfoExtendMapper yzmInfoExtendMapper;
    
    @Override
    public DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException {
        return DataResult.success(yzmInfoMapper.deleteByPrimaryKey(wid));
    }
    @Override    public DataResult<Integer> insertSelective(YzmInfo record) throws ServiceException {
        return DataResult.success(yzmInfoMapper.insertSelective(record));
    }
    @Override
    public DataResult<YzmInfo> selectByPrimaryKey(String wid) throws ServiceException {
        return DataResult.success(yzmInfoMapper.selectByPrimaryKey(wid));
    }
    @Override
    public DataResult<Integer> updateByPrimaryKeySelective(YzmInfo record) throws ServiceException {
        return DataResult.success(yzmInfoMapper.updateByPrimaryKeySelective(record));
    }
    @Override
    public DataResult<List<YzmInfoExtend>> selectDisplayByCondition(QueryCondition<YzmInfoExtend> record,
            CustomOperateLog log) throws ServiceException {
        if (record.getPageInfo() != null) {
            Page<RwjbxxInfoExtend> page = PageHelper.startPage(record.getPageInfo().getPageNum(),
                    record.getPageInfo().getPageSize());
            List<YzmInfoExtend> datas = yzmInfoExtendMapper.selectDisplayByCondition(record);

            DataResult<List<YzmInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(yzmInfoExtendMapper.selectDisplayByCondition(record));
        }
    }
}

