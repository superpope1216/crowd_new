package com.wisedu.crowd.service.rwgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.RwztbglsInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwztbglsInfoExtend;

public interface RwztbglsInfoService {
	 /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<Integer> insertSelective(RwztbglsInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<RwztbglsInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<Integer> updateByPrimaryKeySelective(RwztbglsInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<RwztbglsInfoExtend>> selectByCondition(QueryCondition<RwztbglsInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
