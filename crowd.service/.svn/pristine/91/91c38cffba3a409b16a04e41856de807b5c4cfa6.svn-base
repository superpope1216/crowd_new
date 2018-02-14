package com.wisedu.crowd.service.statics;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.JjrInfo;
import com.wisedu.crowd.entity.statics.extend.JjrInfoExtend;
import com.wisedu.crowd.entity.train.extend.TrainEnrolInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface JjrInfoService {
	   /**
    *
    * @mbggenerated 2018-01-11
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-11
    */
   DataResult<Integer> insertSelective(JjrInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-11
    */
   DataResult<JjrInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-11
    */
   DataResult<Integer> updateByPrimaryKeySelective(JjrInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<JjrInfoExtend>> selectByCondition(QueryCondition<JjrInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
