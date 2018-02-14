package com.wisedu.crowd.dao.data.delay.extend;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.entity.data.delay.extend.DataDelayKfzMonthInfoExtend;
import com.wisedu.crowd.entity.data.extend.DataDelayInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;

public interface DataDelayKfzMonthInfoExtendMapper {
	Integer deleteByCondition(QueryCondition<DataDelayKfzMonthInfoExtend> condition);

	List<DataDelayKfzMonthInfoExtend> selectDisplayByCondition(QueryCondition<DataDelayKfzMonthInfoExtend> condition);

	List<DataDelayKfzMonthInfoExtend> selectByCondition(QueryCondition<DataDelayKfzMonthInfoExtend> condition);

	List<Map<String, Object>> selectCustomByCondition(QueryCondition<DataDelayKfzMonthInfoExtend> condition);
}
