/**
 * Project Name:crowd.service
 * File Name:KfzxyjfxqInfoService.java
 * Package Name:com.wisedu.crowd.service.yhgl
 * Date:2018年1月24日下午1:51:49
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.yhgl;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.RwjbxxInfo;
import com.wisedu.crowd.entity.yhgl.KfzxyjfxqInfo;
import com.wisedu.crowd.service.dto.DataResult;

/**
 * ClassName:KfzxyjfxqInfoService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月24日 下午1:51:49 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface KfzxyjfxqInfoService {

	  /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> insertSelective(KfzxyjfxqInfo record, CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<KfzxyjfxqInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> updateByPrimaryKeySelective(KfzxyjfxqInfo record, CustomOperateLog log) throws ServiceException;

}

