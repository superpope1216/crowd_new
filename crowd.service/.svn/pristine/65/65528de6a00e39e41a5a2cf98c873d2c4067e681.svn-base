package com.wisedu.crowd.service.statics;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.KfzxxData;
import com.wisedu.crowd.entity.statics.extend.KfzxxDataExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface KfzxxDataService {
	/**
    *
    * @mbggenerated 2018-01-24
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-24
    */
   DataResult<Integer> insertSelective(KfzxxData record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-24
    */
   DataResult<KfzxxData> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-24
    */
   DataResult<Integer> updateByPrimaryKeySelective(KfzxxData record,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> deleteByCondition(KfzxxDataExtend kfzxxDataExtend,CustomOperateLog log) throws ServiceException;
   
   
   DataResult<List<KfzxxDataExtend>> selectDisplayByCondition(QueryCondition<KfzxxDataExtend> condition,CustomOperateLog log) throws ServiceException;
}
