package com.wisedu.crowd.service.rwgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.RwcfxxInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwcfxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface RwcfxxInfoService {
	 /**
    *
    * @mbggenerated 2017-12-08
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

  

   /**
    *
    * @mbggenerated 2017-12-08
    */
   DataResult<Integer> insertSelective(RwcfxxInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-08
    */
   DataResult<RwcfxxInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-08
    */
   DataResult<Integer> updateByPrimaryKeySelective(RwcfxxInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<RwcfxxInfoExtend>> selectByCondition(QueryCondition<RwcfxxInfoExtend> record ,CustomOperateLog log) throws ServiceException;
   
   
   DataResult<Integer> selectCountByCondition(QueryCondition<RwcfxxInfoExtend> record ,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> saveRwcfxxInfo(RwcfxxInfo rwxfxxInfo,CustomOperateLog log) throws ServiceException;
   
   DataResult<String> deleteCfrw(String cfrwid,CustomOperateLog log) throws ServiceException;
   /**
    * 拆分需求确认
    * @param wid
    * @param sfjs
    * @param log
    * @return
    * @throws ServiceException
    */
   DataResult<Integer> accept(String wid,String sfjs,CustomOperateLog log) throws ServiceException;

   /**
    * 申请验收
    * @param wid
    * @param sfjs
    * @param log
    * @return
    * @throws ServiceException
    */
   DataResult<Integer> applyAccept(String wid,CustomOperateLog log) throws ServiceException;
   /**
    * 验收确认
    * @param wid
    * @param sftg
    * @param log
    * @return
    * @throws ServiceException
    */
   DataResult<Integer> supply(String wid,String sftg,CustomOperateLog log) throws ServiceException;

}
