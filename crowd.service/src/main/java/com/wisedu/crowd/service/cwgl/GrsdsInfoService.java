package com.wisedu.crowd.service.cwgl;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.cwgl.GrsdsInfo;
import com.wisedu.crowd.entity.cwgl.extend.GrsdsInfoExtend;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;

public interface GrsdsInfoService {

	 /**
    *
    * @mbggenerated 2017-12-18
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;


   /**
    *
    * @mbggenerated 2017-12-18
    */
   DataResult<Integer> insertSelective(GrsdsInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-18
    */
   DataResult<GrsdsInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-18
    */
   DataResult<Integer> updateByPrimaryKeySelective(GrsdsInfo record,CustomOperateLog log) throws ServiceException;
   
   
   DataResult< List<GrsdsInfoExtend>> selectByMoney(BigDecimal money,CustomOperateLog log) throws ServiceException;

  
}
