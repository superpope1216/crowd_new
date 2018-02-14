/**
 * Project Name:crowd.service
 * File Name:GrxxszInfoService.java
 * Package Name:com.wisedu.crowd.service.xxgl
 * Date:2017年12月11日下午2:05:22
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.xxgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.xxgl.GrxxszInfo;
import com.wisedu.crowd.entity.xxgl.extend.GrxxszInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

/**
 * ClassName:GrxxszInfoService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年12月11日 下午2:05:22 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface GrxxszInfoService {


    /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> insertSelective(GrxxszInfo record) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<GrxxszInfo> selectByPrimaryKey(String wid) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> updateByPrimaryKeySelective(GrxxszInfo record) throws ServiceException;
   
   DataResult<List<GrxxszInfoExtend>> selectDisplayByCondition(QueryCondition<GrxxszInfoExtend> record) throws ServiceException;
}

