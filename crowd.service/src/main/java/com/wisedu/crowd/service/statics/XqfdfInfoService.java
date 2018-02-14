/**
 * Project Name:crowd.service
 * File Name:XqfdfInfoService.java
 * Package Name:com.wisedu.crowd.service.statics
 * Date:2018年1月18日下午3:21:55
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.statics;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.XqfdfInfo;
import com.wisedu.crowd.service.dto.DataResult;

/**
 * ClassName:XqfdfInfoService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月18日 下午3:21:55 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface XqfdfInfoService {

	/**
	 *
	 * @mbggenerated 2018-01-11
	 */
	DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2018-01-11
	 */
	DataResult<Integer> insertSelective(XqfdfInfo record, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2018-01-11
	 */
	DataResult<XqfdfInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2018-01-11
	 */
	DataResult<Integer> updateByPrimaryKeySelective(XqfdfInfo record, CustomOperateLog log) throws ServiceException;

}

