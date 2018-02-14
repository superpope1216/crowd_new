package com.wisedu.crowd.service.role;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.role.GroupUserInfo;
import com.wisedu.crowd.entity.role.extend.GroupUserInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface GroupUserInfoService {
	 /**
    *
    * @mbggenerated 2018-02-06
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;


   /**
    *
    * @mbggenerated 2018-02-06
    */
   DataResult<Integer> insertSelective(GroupUserInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-06
    */
   DataResult<GroupUserInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-06
    */
   DataResult<Integer> updateByPrimaryKeySelective(GroupUserInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<GroupUserInfoExtend>> selectDisplayByCondition(QueryCondition<GroupUserInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
