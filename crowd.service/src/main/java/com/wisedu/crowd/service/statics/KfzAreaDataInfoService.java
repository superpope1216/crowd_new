package com.wisedu.crowd.service.statics;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.KfzAreaDataInfo;
import com.wisedu.crowd.entity.statics.extend.KfzAreaDataInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface KfzAreaDataInfoService {
	   /**
    *
    * @mbggenerated 2018-01-25
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-25
    */
   DataResult<Integer> insertSelective(KfzAreaDataInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-25
    */
   DataResult<KfzAreaDataInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-25
    */
   DataResult<Integer> updateByPrimaryKeySelective(KfzAreaDataInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> deleteByCondition(KfzAreaDataInfo condition,CustomOperateLog log) throws ServiceException;
	
	DataResult<List<KfzAreaDataInfoExtend>> selectDisplayByCondition(QueryCondition<KfzAreaDataInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
