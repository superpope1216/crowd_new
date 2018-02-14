package com.wisedu.crowd.service.train;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.train.TrainBasicInfo;
import com.wisedu.crowd.entity.train.extend.TrainBasicInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface TrainBasicInfoService {

	   /**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<Integer> insertSelective(TrainBasicInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<TrainBasicInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<Integer> updateByPrimaryKeySelective(TrainBasicInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> appply(TrainBasicInfo trainBasicInfo,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<TrainBasicInfoExtend>> selectDisplayByCondition(QueryCondition<TrainBasicInfoExtend> condition,CustomOperateLog log) throws ServiceException;
   DataResult<List<TrainBasicInfoExtend>> selectPlanDisplayByCondition(QueryCondition<TrainBasicInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
