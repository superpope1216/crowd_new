package com.wisedu.crowd.dao.statics.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.statics.extend.RwjbxxRwxsDataInfoExtend;

public interface RwjbxxRwxsDataInfoExtendMapper {
	
	Integer deleteByCondition(RwjbxxRwxsDataInfoExtend condition);

	List<RwjbxxRwxsDataInfoExtend> selectByCondition(QueryCondition<RwjbxxRwxsDataInfoExtend> condition);
}
