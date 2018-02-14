/**
 * Project Name:crowd.service
 * File Name:KfzzfInfoService.java
 * Package Name:com.wisedu.crowd.service.statics
 * Date:2018年1月18日下午3:21:42
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.statics;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.KfzzfInfo;
import com.wisedu.crowd.entity.statics.extend.KfzzfInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

/**
 * ClassName:KfzzfInfoService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月18日 下午3:21:42 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface KfzzfInfoService {

	/**
	 *
	 * @mbggenerated 2018-01-11
	 */
	DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2018-01-11
	 */
	DataResult<Integer> insertSelective(KfzzfInfo record, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2018-01-11
	 */
	DataResult<KfzzfInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2018-01-11
	 */
	DataResult<Integer> updateByPrimaryKeySelective(KfzzfInfo record, CustomOperateLog log) throws ServiceException;

	DataResult<List<KfzzfInfoExtend>> selectByCondition(QueryCondition<KfzzfInfoExtend> condition, CustomOperateLog log)
			throws ServiceException;
}

