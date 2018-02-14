package com.wisedu.crowd.dao.cwgl.extend;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.entity.cwgl.extend.KfzzhmxInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;

public interface KfzzhmxInfoExtendMapper {
	Double selectTotalMoney(QueryCondition<KfzzhmxInfoExtend> condition);

	List<Map<String, Object>> selectTotalMoneyByMonth(QueryCondition<KfzzhmxInfoExtend> condition);

	List<KfzzhmxInfoExtend> selectDisplayByCondition(QueryCondition<KfzzhmxInfoExtend> condition);
	
	List<Map<String,Object>>  selectDisplayTotalMoney(QueryCondition<KfzzhmxInfoExtend> condition);
	
	List<Map<String,Object>> selectCustomByCondition(QueryCondition<KfzzhmxInfoExtend> condition);
}