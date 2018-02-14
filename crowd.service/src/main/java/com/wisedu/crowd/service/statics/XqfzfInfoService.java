/**
 * Project Name:crowd.service
 * File Name:XqfzfInfoService.java
 * Package Name:com.wisedu.crowd.service.statics
 * Date:2018年1月18日下午3:22:07
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.statics;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.XqfzfInfo;
import com.wisedu.crowd.entity.statics.extend.XqfzfInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

/**
 * ClassName:XqfzfInfoService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月18日 下午3:22:07 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface XqfzfInfoService {

	/**
	 *
	 * @mbggenerated 2018-01-11
	 */
	DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2018-01-11
	 */
	DataResult<Integer> insertSelective(XqfzfInfo record, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2018-01-11
	 */
	DataResult<XqfzfInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2018-01-11
	 */
	DataResult<Integer> updateByPrimaryKeySelective(XqfzfInfo record, CustomOperateLog log) throws ServiceException;

	DataResult<List<XqfzfInfoExtend>> selectByCondition(QueryCondition<XqfzfInfoExtend> condition, CustomOperateLog log)
			throws ServiceException;
}

