/**
 * Project Name:crowd.service
 * File Name:XqfxyjfInfoService.java
 * Package Name:com.wisedu.crowd.service.yhgl
 * Date:2018年1月24日下午1:52:30
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.yhgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.XqfxyjfInfo;
import com.wisedu.crowd.entity.yhgl.extend.XqfxyjfInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

/**
 * ClassName:XqfxyjfInfoService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月24日 下午1:52:30 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface XqfxyjfInfoService {

  /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> insertSelective(XqfxyjfInfo record, CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<XqfxyjfInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> updateByPrimaryKeySelective(XqfxyjfInfo record, CustomOperateLog log) throws ServiceException;
   
   DataResult<List<XqfxyjfInfoExtend>> selectByCondition(QueryCondition<XqfxyjfInfoExtend> condition, CustomOperateLog log) throws ServiceException;

}
