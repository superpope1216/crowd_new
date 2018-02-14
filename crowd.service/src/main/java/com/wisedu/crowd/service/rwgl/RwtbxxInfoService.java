package com.wisedu.crowd.service.rwgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.RwtbxxInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwtbxxInfoExtend;

public interface RwtbxxInfoService {

	 /**
    *
    * @mbggenerated 2017-11-23
    */
	DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException;


   /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<Integer> insertSelective(RwtbxxInfo record) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<RwtbxxInfo> selectByPrimaryKey(String wid) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<Integer> updateByPrimaryKeySelective(RwtbxxInfo record) throws ServiceException;

	
	DataResult<List<RwtbxxInfoExtend>> selectDisplayByCondition(QueryCondition<RwtbxxInfoExtend> record) throws ServiceException;

	DataResult<Integer> selectCountByCondition(QueryCondition<RwtbxxInfoExtend> record) throws ServiceException;

	DataResult<List<RwtbxxInfoExtend>> selectByCondition(QueryCondition<RwtbxxInfoExtend> record) throws ServiceException;
	
	DataResult<Integer> updateByCondition(RwtbxxInfo record,CustomOperateLog log) throws ServiceException;
	
	DataResult<Integer>  deleteByCondition(RwtbxxInfo record,CustomOperateLog log) throws ServiceException;
}
