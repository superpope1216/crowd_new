package com.wisedu.crowd.service.data;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.data.DataDelayInfo;
import com.wisedu.crowd.entity.data.extend.DataDelayInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;

public interface DataDelayInfoService {
	  /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<Integer> insertSelective(DataDelayInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<DataDelayInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-08
    */
   DataResult<Integer> updateByPrimaryKeySelective(DataDelayInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> deleteByCondition(QueryCondition<DataDelayInfoExtend> condition,CustomOperateLog log) throws ServiceException;
	
   DataResult<List<DataDelayInfoExtend>>  selectDisplayByCondition(QueryCondition<DataDelayInfoExtend> condition,CustomOperateLog log) throws ServiceException;
   
   
   DataResult<List<DataDelayInfoExtend>>  selectByCondition(QueryCondition<DataDelayInfoExtend> condition,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<Map<String,Object>>> selectCustomByCondition(QueryCondition<DataDelayInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
