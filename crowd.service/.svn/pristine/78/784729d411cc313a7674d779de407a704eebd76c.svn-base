/**
 * Project Name:crowd.service
 * File Name:TrainStudentInfoService.java
 * Package Name:com.wisedu.crowd.service.train
 * Date:2018年1月8日上午9:05:15
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.train;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.train.TrainStudentInfo;
import com.wisedu.crowd.entity.train.extend.TrainStudentInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

/**
 * ClassName:TrainStudentInfoService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月8日 上午9:05:15 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface TrainStudentInfoService {
    
    /**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;


   /**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<Integer> insertSelective(TrainStudentInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<TrainStudentInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-29
    */
   DataResult<Integer> updateByPrimaryKeySelective(TrainStudentInfo record,CustomOperateLog log) throws ServiceException;

   
   DataResult<List<TrainStudentInfoExtend>> selectByCondition(QueryCondition<TrainStudentInfoExtend> condition,CustomOperateLog log) throws ServiceException;
   
   DataResult<TrainStudentInfo> firstSave(TrainStudentInfo record, CustomOperateLog log) throws ServiceException;
   
   DataResult<TrainStudentInfo> updateTrainStudentInfo(TrainStudentInfo record, CustomOperateLog log) throws ServiceException;

}

