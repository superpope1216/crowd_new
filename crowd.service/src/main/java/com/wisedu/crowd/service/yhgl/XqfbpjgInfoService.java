package com.wisedu.crowd.service.yhgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.KfzpjxxInfo;
import com.wisedu.crowd.entity.yhgl.XqfbpjgInfo;
import com.wisedu.crowd.entity.yhgl.extend.XqfbpjgInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface XqfbpjgInfoService {
	 /**
    *
    * @mbggenerated 2017-12-04
    */
	 DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;


   /**
    *
    * @mbggenerated 2017-12-04
    */
	 DataResult<Integer> insertSelective(XqfbpjgInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-04
    */
	 DataResult<XqfbpjgInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-04
    */
   DataResult<Integer> updateByPrimaryKeySelective(XqfbpjgInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<XqfbpjgInfoExtend>> selectByCondition(QueryCondition<XqfbpjgInfoExtend> record,CustomOperateLog log) throws ServiceException;
}
