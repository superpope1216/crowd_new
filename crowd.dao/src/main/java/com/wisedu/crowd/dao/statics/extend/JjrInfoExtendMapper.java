package com.wisedu.crowd.dao.statics.extend;

import java.util.List;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.statics.extend.JjrInfoExtend;

public interface JjrInfoExtendMapper {

	List<JjrInfoExtend> selectByCondition(QueryCondition<JjrInfoExtend> condition);
}
