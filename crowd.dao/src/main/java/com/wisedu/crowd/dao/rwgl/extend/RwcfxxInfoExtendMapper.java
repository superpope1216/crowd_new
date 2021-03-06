package com.wisedu.crowd.dao.rwgl.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.rwgl.extend.RwcfxxInfoExtend;

public interface RwcfxxInfoExtendMapper {

	List<RwcfxxInfoExtend> selectByCondition(QueryCondition<RwcfxxInfoExtend> record);
	
	Integer selectCountByCondition(QueryCondition<RwcfxxInfoExtend> record);
}
