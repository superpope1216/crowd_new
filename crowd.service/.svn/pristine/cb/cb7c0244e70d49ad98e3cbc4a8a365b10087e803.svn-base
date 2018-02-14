/**
 * Project Name:crowd.service
 * File Name:FinishCoursesService.java
 * Package Name:com.wisedu.crowd.service.yhgl
 * Date:2018年1月24日下午1:52:30
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.kcgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.kcgl.FinishCourses;
import com.wisedu.crowd.entity.kcgl.extend.FinishCoursesExtend;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;


public interface FinishCoursesService {

 
   DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

 
   DataResult<Integer> insertSelective(FinishCourses record, CustomOperateLog log) throws ServiceException;

   DataResult<FinishCourses> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

   DataResult<Integer> updateByPrimaryKeySelective(FinishCourses record, CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer>deleteAllFinishCourses(CustomOperateLog log);
   
   DataResult<List<FinishCoursesExtend>> selectByDisplayCondition(QueryCondition<FinishCoursesExtend> condition,CustomOperateLog log);

}

