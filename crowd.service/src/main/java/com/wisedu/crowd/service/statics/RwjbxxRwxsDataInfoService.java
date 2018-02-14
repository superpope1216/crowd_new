package com.wisedu.crowd.service.statics;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.RwjbxxRwxsDataInfo;
import com.wisedu.crowd.entity.statics.extend.RwjbxxRwxsDataInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface RwjbxxRwxsDataInfoService {
	/**
    *
    * @mbggenerated 2018-01-24
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-24
    */
   DataResult<Integer> insertSelective(RwjbxxRwxsDataInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-24
    */
   DataResult<RwjbxxRwxsDataInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-24
    */
   DataResult<Integer> updateByPrimaryKeySelective(RwjbxxRwxsDataInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> deleteByCondition(RwjbxxRwxsDataInfoExtend condition,CustomOperateLog log) throws ServiceException;

   DataResult<List<RwjbxxRwxsDataInfoExtend>> selectByCondition(QueryCondition<RwjbxxRwxsDataInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
