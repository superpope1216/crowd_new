package com.wisedu.crowd.dao.statics.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.statics.extend.RwjbxxDataInfoExtend;

public interface RwjbxxDataInfoExtendMapper {
	Integer deleteByCondition(RwjbxxDataInfoExtend condition);

	RwjbxxDataInfoExtend selectByCondition(QueryCondition<RwjbxxDataInfoExtend> condition);
}
