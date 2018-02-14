package com.wisedu.crowd.service.yhgl;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.yhgl.XqfxxScoreLog;

public interface XqfxxScoreLogService {

	
   DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException;
   /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<Integer> insertSelective(XqfxxScoreLog record) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<XqfxxScoreLog> selectByPrimaryKey(String wid) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-23
    */
   DataResult<Integer> updateByPrimaryKeySelective(XqfxxScoreLog record) throws ServiceException;

}
