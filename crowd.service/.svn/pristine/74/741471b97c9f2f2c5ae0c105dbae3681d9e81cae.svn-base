/**
 * Project Name:service
 * File Name:ManpowerInfoService.java
 * Package Name:com.wisedu.crowd.service.statics
 * Date:2017年11月6日上午10:40:51
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.statics;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.statics.extend.ManpowerInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.ManpowerInfo;
import com.wisedu.crowd.entity.statics.extend.ManpowerInfoExtend;
import com.wisedu.crowd.entity.statics.extend.ManpowerInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

/**
 * ClassName:ManpowerInfoService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年11月6日 上午10:40:51 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

public interface ManpowerInfoService {
	/**
    *
    * @mbggenerated 2018-01-24
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-24
    */
   DataResult<Integer> insertSelective(ManpowerInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-24
    */
   DataResult<ManpowerInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2018-01-24
    */
   DataResult<Integer> updateByPrimaryKeySelective(ManpowerInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<ManpowerInfoExtend>> selectByCondition(QueryCondition<ManpowerInfoExtend> condition,CustomOperateLog log) throws ServiceException;
   
}

