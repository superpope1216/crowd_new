package com.wisedu.crowd.service.xmgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.xmgl.RbxxNewInfo;
import com.wisedu.crowd.entity.xmgl.extend.RbxxNewInfoExtend;

public interface RbxxNewInfoService {

	DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

	DataResult<Integer> insertSelective(RbxxNewInfo record,CustomOperateLog log) throws ServiceException;

	DataResult<Integer> updateByPrimaryKeySelective(RbxxNewInfo record,CustomOperateLog log) throws ServiceException;

	DataResult<RbxxNewInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

	DataResult<List<RbxxNewInfoExtend>> selectByCondition(QueryCondition<RbxxNewInfoExtend> record,
			CustomOperateLog log) throws ServiceException;


}
