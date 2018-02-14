package com.wisedu.crowd.service.xtgl;


import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.xtgl.FjxxInfo;

public interface FjxxInfoService {

	   DataResult<FjxxInfo> selectByPrimaryKey(String wid,CustomOperateLog log)throws ServiceException;
	   
	   DataResult<FjxxInfo> insertSelective(FjxxInfo record,CustomOperateLog log)throws ServiceException;
       
	   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log)throws ServiceException;

	   

}
