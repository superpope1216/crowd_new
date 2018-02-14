package com.wisedu.crowd.service.rwgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.RwjbxxExtInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxExtInfoExtend;

public interface RwjbxxExtInfoService {
	 /**
    *
    * @mbggenerated 2017-11-20
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;


   /**
    *
    * @mbggenerated 2017-11-20
    */
   DataResult<Integer> insertSelective(RwjbxxExtInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-20
    */
   DataResult<RwjbxxExtInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-20
    */
   DataResult<Integer> updateByPrimaryKeySelective(RwjbxxExtInfo record,CustomOperateLog log) throws ServiceException;

   DataResult<List<RwjbxxExtInfoExtend>> selectByCondition(QueryCondition<RwjbxxExtInfoExtend> record,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<RwjbxxExtInfoExtend>> selectDisplayByCondition(QueryCondition<RwjbxxExtInfoExtend> record,CustomOperateLog log) throws ServiceException;
}
