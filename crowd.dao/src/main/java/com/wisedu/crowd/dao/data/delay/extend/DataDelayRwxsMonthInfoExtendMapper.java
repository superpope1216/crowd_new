package com.wisedu.crowd.dao.data.delay.extend;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.entity.data.delay.DataDelayRwxsMonthInfo;
import com.wisedu.crowd.entity.data.delay.extend.DataDelayRwxsMonthInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;

public interface DataDelayRwxsMonthInfoExtendMapper {
	Integer deleteByCondition(QueryCondition<DataDelayRwxsMonthInfoExtend> condition);

	List<DataDelayRwxsMonthInfoExtend> selectDisplayByCondition(QueryCondition<DataDelayRwxsMonthInfoExtend> condition);

	List<DataDelayRwxsMonthInfoExtend> selectByCondition(QueryCondition<DataDelayRwxsMonthInfoExtend> condition);

	List<Map<String, Object>> selectCustomByCondition(QueryCondition<DataDelayRwxsMonthInfoExtend> condition);
}