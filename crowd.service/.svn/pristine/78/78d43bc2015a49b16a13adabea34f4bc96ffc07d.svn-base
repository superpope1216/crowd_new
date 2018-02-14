package com.wisedu.crowd.service.cwgl;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.cwgl.XqfzhmxInfo;
import com.wisedu.crowd.entity.cwgl.extend.XqfzhmxInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;

public interface XqfzhmxInfoService {
	/**
	 *
	 * @mbggenerated 2017-12-04
	 */
	DataResult<Integer> deleteByPrimaryKey(String id, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2017-12-04
	 */
	DataResult<Integer> insertSelective(XqfzhmxInfo record, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2017-12-04
	 */
	DataResult<XqfzhmxInfo> selectByPrimaryKey(String id, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2017-12-04
	 */
	DataResult<Integer> updateByPrimaryKeySelective(XqfzhmxInfo record, CustomOperateLog log) throws ServiceException;

	DataResult<Double> selectTotalMoney(QueryCondition<XqfzhmxInfoExtend> condition, CustomOperateLog log)
			throws ServiceException;

	DataResult<List<Map<String, Object>>> selectTotalMoneyByMonth(QueryCondition<XqfzhmxInfoExtend> condition,
			CustomOperateLog log) throws ServiceException;
	
	DataResult<List<XqfzhmxInfoExtend>> selectDisplayByCondition(QueryCondition<XqfzhmxInfoExtend> condition,CustomOperateLog log) throws ServiceException;

}
