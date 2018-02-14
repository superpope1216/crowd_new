/**
 * Project Name:crowd.service
 * File Name:GrxxszInfoServiceImpl.java
 * Package Name:com.wisedu.crowd.service.xxgl.impl
 * Date:2017年12月11日下午2:05:44
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.xxgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.dao.xxgl.GrxxszInfoMapper;
import com.wisedu.crowd.dao.xxgl.extend.GrxxszInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.xxgl.GrxxszInfo;
import com.wisedu.crowd.entity.xxgl.extend.GrxxszInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.xxgl.GrxxszInfoService;

/**
 * ClassName:GrxxszInfoServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年12月11日 下午2:05:44 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("grxxszInfoService")
public class GrxxszInfoServiceImpl implements GrxxszInfoService{
    
    @Autowired
    private GrxxszInfoMapper grxxszInfoMapper;
    @Autowired
    private GrxxszInfoExtendMapper grxxszInfoExtendMapper;

    @Override
    public DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException {
        return DataResult.success(grxxszInfoMapper.deleteByPrimaryKey(wid));
    }

    @Override
    public DataResult<Integer> insertSelective(GrxxszInfo record) throws ServiceException {
        return DataResult.success(grxxszInfoMapper.insertSelective(record));
    }

    @Override
    public DataResult<GrxxszInfo> selectByPrimaryKey(String wid) throws ServiceException {
        return DataResult.success(grxxszInfoMapper.selectByPrimaryKey(wid));
    }

    @Override
    public DataResult<Integer> updateByPrimaryKeySelective(GrxxszInfo record) throws ServiceException {
        return DataResult.success(grxxszInfoMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public DataResult<List<GrxxszInfoExtend>> selectDisplayByCondition(QueryCondition<GrxxszInfoExtend> record)
            throws ServiceException {
        List<GrxxszInfoExtend> resLst = grxxszInfoExtendMapper.selectByCondition(record);
        if(CommonUtil.isNotEmptyList(resLst)){
            for (GrxxszInfoExtend grxxszInfoExtend : resLst) {
                String jsxxlx = StringUtil.toStr(grxxszInfoExtend.getJsxxlx());
                String[] xxlx = jsxxlx.split(",");
                
            }
        }
        return DataResult.success(grxxszInfoExtendMapper.selectByCondition(record));
    }

    
}

