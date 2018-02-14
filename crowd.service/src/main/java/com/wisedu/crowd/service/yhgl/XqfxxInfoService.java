package com.wisedu.crowd.service.yhgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.KfzxxInfo;
import com.wisedu.crowd.entity.yhgl.XqfxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.KfzxxInfoExtend;
import com.wisedu.crowd.entity.yhgl.extend.XqfxxInfoExtend;

public interface XqfxxInfoService {

	  /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<Integer> insertSelective(XqfxxInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<XqfxxInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<Integer> updateByPrimaryKeySelective(XqfxxInfo record,CustomOperateLog log) throws ServiceException;
   
   
   DataResult<List<XqfxxInfoExtend>> selectByCondition(QueryCondition<XqfxxInfoExtend> record,CustomOperateLog log) throws ServiceException;
   
   
   DataResult<Integer> updateByVersion(XqfxxInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> selectCountByCondition(QueryCondition<XqfxxInfoExtend> record,CustomOperateLog log) throws ServiceException;
   
   boolean checkXqfEmail(XqfxxInfoExtend record, CustomOperateLog log)throws ServiceException;
   
   
    DataResult<XqfxxInfoExtend> saveXqfxxBasicInfo(XqfxxInfoExtend record, CustomOperateLog log) throws ServiceException;


	DataResult<XqfxxInfoExtend> saveXqfxxCardInfo(XqfxxInfoExtend record, CustomOperateLog log) throws ServiceException;
   
	
	DataResult<XqfxxInfoExtend> insertFirstXqfxxInfo(XqfxxInfo record, CustomOperateLog log) throws ServiceException;

   
}
