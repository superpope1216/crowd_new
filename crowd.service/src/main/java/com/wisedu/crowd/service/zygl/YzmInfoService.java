/**
 * Project Name:crowd.service
 * File Name:YzmInfoService.java
 * Package Name:com.wisedu.crowd.service.zygl
 * Date:2018年1月12日上午11:47:00
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.zygl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.zygl.YzmInfo;
import com.wisedu.crowd.entity.zygl.extend.YzmInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

/**
 * ClassName:YzmInfoService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月12日 上午11:47:00 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface YzmInfoService {

    /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> insertSelective(YzmInfo record) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<YzmInfo> selectByPrimaryKey(String wid) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> updateByPrimaryKeySelective(YzmInfo record) throws ServiceException;
   
   DataResult<List<YzmInfoExtend>> selectDisplayByCondition(QueryCondition<YzmInfoExtend> record, CustomOperateLog log) throws ServiceException;
}

