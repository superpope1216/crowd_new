package com.wisedu.crowd.service.statics;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.RwjbxxDataInfo;
import com.wisedu.crowd.entity.statics.extend.RwjbxxDataInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface RwjbxxDataInfoService {
	/**
    *
    * @mbggenerated 2018-01-24
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-24
    */
   DataResult<Integer> insertSelective(RwjbxxDataInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-24
    */
   DataResult<RwjbxxDataInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-24
    */
   DataResult<Integer> updateByPrimaryKeySelective(RwjbxxDataInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> deleteByCondition(RwjbxxDataInfoExtend condition,CustomOperateLog log) throws ServiceException;

   DataResult<RwjbxxDataInfoExtend> selectByCondition(QueryCondition<RwjbxxDataInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
