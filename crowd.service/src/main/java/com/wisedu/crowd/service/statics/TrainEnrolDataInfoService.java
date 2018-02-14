package com.wisedu.crowd.service.statics;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.TrainEnrolDataInfo;
import com.wisedu.crowd.entity.statics.extend.TrainEnrolDataInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface TrainEnrolDataInfoService {
	/**
	 *
	 * @mbggenerated 2018-01-26
	 */
	DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2018-01-26
	 */
	DataResult<Integer> insertSelective(TrainEnrolDataInfo record, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2018-01-26
	 */
	DataResult<TrainEnrolDataInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2018-01-26
	 */
	DataResult<Integer> updateByPrimaryKeySelective(TrainEnrolDataInfo record, CustomOperateLog log)
			throws ServiceException;

	DataResult<Integer> deleteByCondition(QueryCondition<TrainEnrolDataInfoExtend> condition, CustomOperateLog log)
			throws ServiceException;

	DataResult<List<TrainEnrolDataInfoExtend>> selectDisplayByCondition(
			QueryCondition<TrainEnrolDataInfoExtend> condition, CustomOperateLog log) throws ServiceException;
}
