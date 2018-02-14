package com.wisedu.crowd.service.statics;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.extend.KfzjlMonthExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface KfzjlMonthInfoService {
	/**
	   * 查询开发经理  统计信息(完工量,延期率,BUG率等)
	   * @param kfzOverViewExtend
	   * @return
	   */
		DataResult<List<Map<String,Object>>> selectStaticsKfzjlMonth(QueryCondition<KfzjlMonthExtend> condition,CustomOperateLog log) throws ServiceException;
		
		DataResult<List<KfzjlMonthExtend>> selectStaticsKfzjlTotal(QueryCondition<KfzjlMonthExtend> condition,CustomOperateLog log) throws ServiceException;
		
		DataResult<Map<String, Object>> selectKfjljbxx(QueryCondition<KfzjlMonthExtend> condition,CustomOperateLog log) throws ServiceException;
}
