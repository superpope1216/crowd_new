package com.wisedu.crowd.service.statics;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.extend.KfzjlWglInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

/**
 * 需求完工量统计
 * @author wisedu
 *
 */
public interface KfzjlWglInfoService {
	DataResult<List<KfzjlWglInfoExtend>> selectStaticsKfzjlWglInfo(QueryCondition<KfzjlWglInfoExtend> condition,CustomOperateLog log) throws ServiceException;
	
	DataResult<List<Map<String, Object>>> selectStaticsKfzjlWglMonthInfo(QueryCondition<KfzjlWglInfoExtend> condition,CustomOperateLog log) throws ServiceException;
	
	DataResult<List<KfzjlWglInfoExtend>> selectStaticsYwxwglInfo(QueryCondition<KfzjlWglInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
