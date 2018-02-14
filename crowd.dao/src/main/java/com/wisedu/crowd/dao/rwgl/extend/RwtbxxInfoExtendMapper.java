package com.wisedu.crowd.dao.rwgl.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.rwgl.RwtbxxInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwtbxxInfoExtend;

public interface RwtbxxInfoExtendMapper {
	
	List<RwtbxxInfoExtend> selectDisplayByCondition(QueryCondition<RwtbxxInfoExtend> record);
	
	Integer selectCountByCondition(QueryCondition<RwtbxxInfoExtend> record);

	
	List<RwtbxxInfoExtend> selectByCondition(QueryCondition<RwtbxxInfoExtend> record);
	
	Integer updateByCondition(RwtbxxInfo record);
	
	Integer deleteByCondition(RwtbxxInfo record);
}