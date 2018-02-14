/**
 * Project Name:crowd.service
 * File Name:StudyCoursesService.java
 * Package Name:com.wisedu.crowd.service.yhgl
 * Date:2018年1月24日下午1:52:30
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.kcgl;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.kcgl.StudyCourses;
import com.wisedu.crowd.entity.kcgl.StudyCourses;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;


public interface StudyCoursesService {

 
   DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

 
   DataResult<Integer> insertSelective(StudyCourses record, CustomOperateLog log) throws ServiceException;

   DataResult<StudyCourses> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

   
   DataResult<Integer> updateByPrimaryKeySelective(StudyCourses record, CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer>deleteAllStudyCourses(CustomOperateLog log);

}

