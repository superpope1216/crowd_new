package com.wisedu.crowd.service.role;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.role.GroupMenuAuthInfo;
import com.wisedu.crowd.entity.role.extend.GroupMenuAuthInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface GroupMenuAuthInfoService {
	 /**
    *
    * @mbggenerated 2018-02-06
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;


   /**
    *
    * @mbggenerated 2018-02-06
    */
   DataResult<Integer> insertSelective(GroupMenuAuthInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-06
    */
   DataResult<GroupMenuAuthInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-06
    */
   DataResult<Integer> updateByPrimaryKeySelective(GroupMenuAuthInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<GroupMenuAuthInfoExtend>> selectDisplayByCondition(QueryCondition<GroupMenuAuthInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}