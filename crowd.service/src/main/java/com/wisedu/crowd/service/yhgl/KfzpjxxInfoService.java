package com.wisedu.crowd.service.yhgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.KfzpjxxDetailInfo;
import com.wisedu.crowd.entity.yhgl.KfzpjxxInfo;
import com.wisedu.crowd.service.dto.DataResult;

public interface KfzpjxxInfoService {
	 /**
    *
    * @mbggenerated 2017-12-04
    */
	 DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;


   /**
    *
    * @mbggenerated 2017-12-04
    */
	 DataResult<Integer> insertSelective(KfzpjxxInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-04
    */
	 DataResult<KfzpjxxInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-04
    */
   DataResult<Integer> updateByPrimaryKeySelective(KfzpjxxInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<KfzpjxxInfo>> selectByCondition(QueryCondition<KfzpjxxInfo> record,CustomOperateLog log) throws ServiceException;

}
