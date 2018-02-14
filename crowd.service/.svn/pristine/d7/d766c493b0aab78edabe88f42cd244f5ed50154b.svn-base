package com.wisedu.crowd.service.train;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.train.TrainPlanInfo;
import com.wisedu.crowd.entity.train.extend.TrainPlanInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface TrainPlanInfoService {
	/**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;


   /**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<Integer> insertSelective(TrainPlanInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<TrainPlanInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<Integer> updateByPrimaryKeySelective(TrainPlanInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<Integer> updateByPrimaryKeyWithBLOBs(TrainPlanInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<TrainPlanInfoExtend>> selectByCondition(QueryCondition<TrainPlanInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
