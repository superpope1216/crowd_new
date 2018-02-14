package com.wisedu.crowd.service.data.delay;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.data.delay.DataDelayKfzMonthInfo;
import com.wisedu.crowd.entity.data.delay.extend.DataDelayKfzMonthInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;

public interface DataDelayKfzMonthInfoService {
	  /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<Integer> insertSelective(DataDelayKfzMonthInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<DataDelayKfzMonthInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<Integer> updateByPrimaryKeySelective(DataDelayKfzMonthInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> deleteByCondition(QueryCondition<DataDelayKfzMonthInfoExtend> condition,CustomOperateLog log) throws ServiceException;
	
   DataResult<List<DataDelayKfzMonthInfoExtend>>  selectDisplayByCondition(QueryCondition<DataDelayKfzMonthInfoExtend> condition,CustomOperateLog log) throws ServiceException;
   
   
   DataResult<List<DataDelayKfzMonthInfoExtend>>  selectByCondition(QueryCondition<DataDelayKfzMonthInfoExtend> condition,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<Map<String,Object>>> selectCustomByCondition(QueryCondition<DataDelayKfzMonthInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
