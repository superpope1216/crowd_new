/**
 * Project Name:crowd.service
 * File Name:TrainStudentInfoServiceImpl.java
 * Package Name:com.wisedu.crowd.service.train.impl
 * Date:2018年1月8日上午9:05:44
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.train.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wisedu.crowd.common.code.HttpCodeEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.dao.train.TrainStudentInfoMapper;
import com.wisedu.crowd.dao.train.extend.TrainStudentInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.train.TrainStudentInfo;
import com.wisedu.crowd.entity.train.extend.TrainStudentInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.train.TrainStudentInfoService;

/**
 * ClassName:TrainStudentInfoServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月8日 上午9:05:44 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("trainStudentInfoService")
@Transactional
public class TrainStudentInfoServiceImpl implements TrainStudentInfoService{
    
    @Autowired
    private TrainStudentInfoMapper trainStudentInfoMapper;
    @Autowired
    private TrainStudentInfoExtendMapper trainStudentInfoExtendMapper;

    @Override
    public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
        return DataResult.success(trainStudentInfoMapper.deleteByPrimaryKey(wid));
    }

    @Override
    public DataResult<Integer> insertSelective(TrainStudentInfo record, CustomOperateLog log) throws ServiceException {
        return DataResult.success(trainStudentInfoMapper.insertSelective(record));
    }

    @Override
    public DataResult<TrainStudentInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
        return DataResult.success(trainStudentInfoMapper.selectByPrimaryKey(wid));
    }

    @Override
    public DataResult<Integer> updateByPrimaryKeySelective(TrainStudentInfo record, CustomOperateLog log)
            throws ServiceException {
        return DataResult.success(trainStudentInfoMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public DataResult<List<TrainStudentInfoExtend>> selectByCondition(QueryCondition<TrainStudentInfoExtend> condition,
            CustomOperateLog log) throws ServiceException {
        return DataResult.success(trainStudentInfoExtendMapper.selectByCondition(condition));
    }

    @Override
    public DataResult<TrainStudentInfo> firstSave(TrainStudentInfo record, CustomOperateLog log) throws ServiceException {
        if(StringUtil.isEmpty(record.getYhid())){
            throw new ServiceException(HttpCodeEnum.USER_INVALID.getCode(),HttpCodeEnum.USER_INVALID.getName());
        }
        if(!checkXysjh(null,record.getSj())){
            throw new ServiceException(HttpCodeEnum.EXIST_PHONE.getCode(),HttpCodeEnum.EXIST_PHONE.getName());
         }
        TrainStudentInfo trainStudentInfo = new TrainStudentInfo();
        trainStudentInfo.setWid(StringUtil.getUuId());
        trainStudentInfo.setYhid(record.getYhid());
        trainStudentInfo.setXm(record.getXm());
        trainStudentInfo.setSj(record.getSj());
        trainStudentInfo.setQq(record.getQq());
        trainStudentInfo.setCynf(record.getCynf());
        trainStudentInfo.setFwxx(record.getFwxx());
        trainStudentInfo.setScjs(record.getScjs());
        trainStudentInfo.setPxxyzpid(record.getPxxyzpid());
        trainStudentInfoMapper.insertSelective(trainStudentInfo);
        return DataResult.success(trainStudentInfo);
    }
    
    //检测手机号是否重复
    public boolean checkXysjh(String xyid,String sj){
        if(StringUtils.isEmpty(sj)){
            return false;
        }
        TrainStudentInfoExtend trainStudentInfoExtend = new TrainStudentInfoExtend();
        trainStudentInfoExtend.setSj(sj);
        QueryCondition<TrainStudentInfoExtend> condition = new QueryCondition<TrainStudentInfoExtend>();
        condition.setPageInfo(null);
        condition.setQuery(trainStudentInfoExtend);
        List<TrainStudentInfoExtend> list = trainStudentInfoExtendMapper.selectByCondition(condition);
        if(StringUtil.isEmpty(xyid)){
            if(CommonUtil.isEmptyList(list)){
                return true;
            }
            return false;
        }else{
            if(CommonUtil.isEmptyList(list)){
                return true;
            }
            if(list.size()==1){
                if(xyid.equals(list.get(0).getWid())){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public DataResult<TrainStudentInfo> updateTrainStudentInfo(TrainStudentInfo record, CustomOperateLog log)
            throws ServiceException {
        if(StringUtil.isEmpty(record.getYhid())){
            throw new ServiceException(HttpCodeEnum.USER_INVALID.getCode(),HttpCodeEnum.USER_INVALID.getName());
        }
        if(!checkXysjh(record.getWid(), record.getSj())){
            throw new ServiceException(HttpCodeEnum.EXIST_PHONE.getCode(),HttpCodeEnum.EXIST_PHONE.getName());
         }
        trainStudentInfoMapper.updateByPrimaryKeySelective(record);
        return DataResult.success(record);
    }

}

