package com.wisedu.crowd.service.statics;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.extend.YwxbugInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface YwxbugInfoService {
	
	DataResult<List<YwxbugInfoExtend>> selectStaticsMonthYwxbugInfo(QueryCondition<YwxbugInfoExtend> condition,CustomOperateLog log) throws SecurityException;
	
	DataResult<List<YwxbugInfoExtend>> selectStaticsYwxbugInfo(QueryCondition<YwxbugInfoExtend> condition,CustomOperateLog log) throws SecurityException;
	
	DataResult<List<YwxbugInfoExtend>> selectStaticsMonthBugInfo(QueryCondition<YwxbugInfoExtend> condition,CustomOperateLog log) throws SecurityException;
	
	DataResult<Map<String, Object>> getYwxBugtjxx(QueryCondition<YwxbugInfoExtend> condition,CustomOperateLog log) throws SecurityException;
}
