package com.wisedu.crowd.service.role;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.role.GroupDataAuthInfo;
import com.wisedu.crowd.entity.role.extend.GroupDataAuthInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface GroupDataAuthInfoService {

	 /**
    *
    * @mbggenerated 2018-02-06
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;


   /**
    *
    * @mbggenerated 2018-02-06
    */
   DataResult<Integer> insertSelective(GroupDataAuthInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-06
    */
   DataResult<GroupDataAuthInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-06
    */
   DataResult<Integer> updateByPrimaryKeySelective(GroupDataAuthInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<GroupDataAuthInfoExtend>> selectDisplayByCondition(QueryCondition<GroupDataAuthInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
