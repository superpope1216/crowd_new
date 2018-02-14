package com.wisedu.crowd.service.yhgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.XqfxxExtInfo;
import com.wisedu.crowd.entity.yhgl.extend.XqfxxExtInfoExtend;

public interface XqfxxExtInfoService {
	  /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog logs) throws ServiceException;

  

   /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<Integer> insertSelective(XqfxxExtInfo record,CustomOperateLog logs) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<XqfxxExtInfo> selectByPrimaryKey(String wid,CustomOperateLog logs) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<Integer> updateByPrimaryKeySelective(XqfxxExtInfo record,CustomOperateLog logs) throws ServiceException;

 
   DataResult<List<XqfxxExtInfoExtend>> selectByCondition(QueryCondition<XqfxxExtInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
