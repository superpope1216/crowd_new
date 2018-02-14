/**
 * Project Name:crowd.service
 * File Name:KfzzzxxInfoService.java
 * Package Name:com.wisedu.crowd.service.yhgl
 * Date:2018年1月17日上午11:01:46
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.yhgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.KfzzzxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.KfzzzxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

/**
 * ClassName:KfzzzxxInfoService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月17日 上午11:01:46 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface KfzzzxxInfoService {

	/**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> insertSelective(KfzzzxxInfo record) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<KfzzzxxInfo> selectByPrimaryKey(String wid) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> updateByPrimaryKeySelective(KfzzzxxInfo record) throws ServiceException;

	DataResult<List<KfzzzxxInfoExtend>> selectByCondition(QueryCondition<KfzzzxxInfoExtend> record, CustomOperateLog log)
			throws ServiceException;
}

