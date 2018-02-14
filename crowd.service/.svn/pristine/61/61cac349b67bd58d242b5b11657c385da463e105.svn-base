package com.wisedu.crowd.service.data.delay;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.data.delay.DataDelayRwxsYearInfo;
import com.wisedu.crowd.entity.data.delay.extend.DataDelayRwxsYearInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;

public interface DataDelayRwxsYearInfoService {
	  /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<Integer> insertSelective(DataDelayRwxsYearInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<DataDelayRwxsYearInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<Integer> updateByPrimaryKeySelective(DataDelayRwxsYearInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> deleteByCondition(QueryCondition<DataDelayRwxsYearInfoExtend> condition,CustomOperateLog log) throws ServiceException;
	
   DataResult<List<DataDelayRwxsYearInfoExtend>>  selectDisplayByCondition(QueryCondition<DataDelayRwxsYearInfoExtend> condition,CustomOperateLog log) throws ServiceException;
   
   
   DataResult<List<DataDelayRwxsYearInfoExtend>>  selectByCondition(QueryCondition<DataDelayRwxsYearInfoExtend> condition,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<Map<String,Object>>> selectCustomByCondition(QueryCondition<DataDelayRwxsYearInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
