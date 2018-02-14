/**
 * Project Name:crowd.service
 * File Name:ZysqjlInfoService.java
 * Package Name:com.wisedu.crowd.service.zygl
 * Date:2018年1月12日上午11:52:45
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.zygl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.zygl.ZysqjlInfo;
import com.wisedu.crowd.entity.zygl.extend.ZysqjlInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

/**
 * ClassName:ZysqjlInfoService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月12日 上午11:52:45 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface ZysqjlInfoService {
    /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> insertSelective(ZysqjlInfo record) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<ZysqjlInfo> selectByPrimaryKey(String wid) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> updateByPrimaryKeySelective(ZysqjlInfo record) throws ServiceException;
   
   DataResult<List<ZysqjlInfoExtend>> selectYzmDisplayByCondition(QueryCondition<ZysqjlInfoExtend> record, CustomOperateLog log) throws ServiceException;
   
   DataResult<List<ZysqjlInfoExtend>> selectSjkDisplayByCondition(QueryCondition<ZysqjlInfoExtend> record, CustomOperateLog log) throws ServiceException;
   
   DataResult<List<ZysqjlInfoExtend>> selectSvnDisplayByCondition(QueryCondition<ZysqjlInfoExtend> record, CustomOperateLog log) throws ServiceException;
   
   DataResult<List<ZysqjlInfoExtend>> selectVpnDisplayByCondition(QueryCondition<ZysqjlInfoExtend> record, CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> applyDeskstop(ZysqjlInfo record, CustomOperateLog log) throws ServiceException;
}

