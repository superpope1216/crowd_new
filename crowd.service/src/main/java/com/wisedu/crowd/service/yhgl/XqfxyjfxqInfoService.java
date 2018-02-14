/**
 * Project Name:crowd.service
 * File Name:XqfxyjfxqInfoService.java
 * Package Name:com.wisedu.crowd.service.yhgl
 * Date:2018年1月24日下午1:53:16
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.yhgl;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.XqfxyjfxqInfo;
import com.wisedu.crowd.service.dto.DataResult;

/**
 * ClassName:XqfxyjfxqInfoService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月24日 下午1:53:16 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface XqfxyjfxqInfoService {

	  /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> insertSelective(XqfxyjfxqInfo record, CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<XqfxyjfxqInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> updateByPrimaryKeySelective(XqfxyjfxqInfo record, CustomOperateLog log) throws ServiceException;
}

