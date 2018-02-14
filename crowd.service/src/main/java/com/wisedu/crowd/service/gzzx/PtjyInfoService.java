package com.wisedu.crowd.service.gzzx;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.gzzx.PtjyInfo;
import com.wisedu.crowd.entity.gzzx.extend.PtjyInfoExtend;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;

public interface PtjyInfoService {

	/**
	 *
	 * @mbggenerated 2017-12-26
	 */
	DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws Exception;

	/**
	 *
	 * @mbggenerated 2017-12-26
	 */
	DataResult<Integer> insertSelective(PtjyInfo record, CustomOperateLog log) throws Exception;

	/**
	 *
	 * @mbggenerated 2017-12-26
	 */
	DataResult<PtjyInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws Exception;

	/**
	 *
	 * @mbggenerated 2017-12-26
	 */
	DataResult<Integer> updateByPrimaryKeySelective(PtjyInfo record, CustomOperateLog log) throws Exception;

	DataResult<List<PtjyInfoExtend>> selectDisplayByCondition(QueryCondition<PtjyInfoExtend> condition,
			CustomOperateLog log) throws Exception;
}
