/**
 * Project Name:crowd.service
 * File Name:KfzxyjfInfoService.java
 * Package Name:com.wisedu.crowd.service.yhgl
 * Date:2018年1月24日上午11:44:14
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.yhgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.KfzxyjfInfo;
import com.wisedu.crowd.entity.yhgl.extend.KfzxyjfInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

/**
 * ClassName:KfzxyjfInfoService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月24日 上午11:44:14 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface KfzxyjfInfoService {

	  /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> insertSelective(KfzxyjfInfo record, CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<KfzxyjfInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> updateByPrimaryKeySelective(KfzxyjfInfo record, CustomOperateLog log) throws ServiceException;
   
   DataResult<List<KfzxyjfInfoExtend>> selectByCondition(QueryCondition<KfzxyjfInfoExtend> condition, CustomOperateLog log) throws ServiceException;
}

