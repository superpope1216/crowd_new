package com.wisedu.crowd.service.role;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.role.GroupInfo;
import com.wisedu.crowd.entity.role.extend.GroupInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface GroupInfoService {
	 /**
    *
    * @mbggenerated 2018-02-06
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;


   /**
    *
    * @mbggenerated 2018-02-06
    */
   DataResult<Integer> insertSelective(GroupInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-06
    */
   DataResult<GroupInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-02-06
    */
   DataResult<Integer> updateByPrimaryKeySelective(GroupInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<GroupInfoExtend>> selectDisplayByCondition(QueryCondition<GroupInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
