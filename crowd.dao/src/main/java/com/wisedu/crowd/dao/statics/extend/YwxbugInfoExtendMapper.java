package com.wisedu.crowd.dao.statics.extend;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.statics.extend.YwxbugInfoExtend;

public interface YwxbugInfoExtendMapper {
	/**
	 * 统计业务线月度延期数据
	 * @param ywxyqInfo
	 * @return
	 */
	List<YwxbugInfoExtend> selectStaticsMonthYwxbugInfo(QueryCondition<YwxbugInfoExtend> condition);
	
	List<YwxbugInfoExtend> selectStaticsYwxbugInfo(QueryCondition<YwxbugInfoExtend> condition);
	
	List<YwxbugInfoExtend> selectStaticsMonthBugInfo(QueryCondition<YwxbugInfoExtend> condition);
	
	Map<String, Object> getYwxBugtjxx(QueryCondition<YwxbugInfoExtend> condition);
}