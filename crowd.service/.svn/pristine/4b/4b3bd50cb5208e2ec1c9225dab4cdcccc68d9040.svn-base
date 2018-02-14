package com.wisedu.crowd.service.data.delay;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.data.delay.DataDelayRwxsMonthInfo;
import com.wisedu.crowd.entity.data.delay.extend.DataDelayRwxsMonthInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;

public interface DataDelayRwxsMonthInfoService {
	  /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<Integer> insertSelective(DataDelayRwxsMonthInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<DataDelayRwxsMonthInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<Integer> updateByPrimaryKeySelective(DataDelayRwxsMonthInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> deleteByCondition(QueryCondition<DataDelayRwxsMonthInfoExtend> condition,CustomOperateLog log) throws ServiceException;
	
   DataResult<List<DataDelayRwxsMonthInfoExtend>>  selectDisplayByCondition(QueryCondition<DataDelayRwxsMonthInfoExtend> condition,CustomOperateLog log) throws ServiceException;
   
   
   DataResult<List<DataDelayRwxsMonthInfoExtend>>  selectByCondition(QueryCondition<DataDelayRwxsMonthInfoExtend> condition,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<Map<String,Object>>> selectCustomByCondition(QueryCondition<DataDelayRwxsMonthInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
