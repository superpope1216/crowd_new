package com.wisedu.crowd.service.data.delay;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.data.delay.DataDelayKfzYearInfo;
import com.wisedu.crowd.entity.data.delay.extend.DataDelayKfzYearInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;

public interface DataDelayKfzYearInfoService {
	  /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<Integer> insertSelective(DataDelayKfzYearInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<DataDelayKfzYearInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<Integer> updateByPrimaryKeySelective(DataDelayKfzYearInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> deleteByCondition(QueryCondition<DataDelayKfzYearInfoExtend> condition,CustomOperateLog log) throws ServiceException;
	
   DataResult<List<DataDelayKfzYearInfoExtend>>  selectDisplayByCondition(QueryCondition<DataDelayKfzYearInfoExtend> condition,CustomOperateLog log) throws ServiceException;
   
   
   DataResult<List<DataDelayKfzYearInfoExtend>>  selectByCondition(QueryCondition<DataDelayKfzYearInfoExtend> condition,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<Map<String,Object>>> selectCustomByCondition(QueryCondition<DataDelayKfzYearInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
