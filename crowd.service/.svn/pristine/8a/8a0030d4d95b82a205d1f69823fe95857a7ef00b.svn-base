package com.wisedu.crowd.service.train;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.train.TrainEnrolInfo;
import com.wisedu.crowd.entity.train.extend.TrainEnrolInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface TrainEnrolInfoService {
	/**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;
   /**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<Integer> insertSelective(TrainEnrolInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<TrainEnrolInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<Integer> updateByPrimaryKeySelective(TrainEnrolInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<Integer> updateByPrimaryKeyWithBLOBs(TrainEnrolInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<TrainEnrolInfoExtend>> selectByCondition(QueryCondition<TrainEnrolInfoExtend> condition,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> selectCountByCondition(QueryCondition<TrainEnrolInfoExtend> condition, CustomOperateLog log) throws ServiceException;
   
   DataResult<List<TrainEnrolInfoExtend>> selectEnrolByCondition(QueryCondition<TrainEnrolInfoExtend> condition, CustomOperateLog log) throws ServiceException;
   
   DataResult<List<TrainEnrolInfoExtend>> selectDisplayByCondition(QueryCondition<TrainEnrolInfoExtend> condition, CustomOperateLog log) throws ServiceException;
}
