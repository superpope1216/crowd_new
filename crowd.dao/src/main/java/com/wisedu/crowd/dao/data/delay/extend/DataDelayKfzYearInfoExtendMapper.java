package com.wisedu.crowd.dao.data.delay.extend;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.entity.data.delay.DataDelayKfzYearInfo;
import com.wisedu.crowd.entity.data.delay.extend.DataDelayKfzYearInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;

public interface DataDelayKfzYearInfoExtendMapper {
	Integer deleteByCondition(QueryCondition<DataDelayKfzYearInfoExtend> condition);

	List<DataDelayKfzYearInfoExtend> selectDisplayByCondition(QueryCondition<DataDelayKfzYearInfoExtend> condition);

	List<DataDelayKfzYearInfoExtend> selectByCondition(QueryCondition<DataDelayKfzYearInfoExtend> condition);

	List<Map<String, Object>> selectCustomByCondition(QueryCondition<DataDelayKfzYearInfoExtend> condition);
}