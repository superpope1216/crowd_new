/**
 * Project Name:crowd.service
 * File Name:SjkInfoService.java
 * Package Name:com.wisedu.crowd.service.zygl
 * Date:2018年1月12日上午11:49:10
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.zygl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.zygl.SjkInfo;
import com.wisedu.crowd.entity.zygl.extend.SjkInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

/**
 * ClassName:SjkInfoService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月12日 上午11:49:10 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface SjkInfoService {
    /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> insertSelective(SjkInfo record) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<SjkInfo> selectByPrimaryKey(String wid) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> updateByPrimaryKeySelective(SjkInfo record) throws ServiceException;
   
   DataResult<List<SjkInfoExtend>> selectDisplayByCondition(QueryCondition<SjkInfoExtend> record, CustomOperateLog log) throws ServiceException;
}

