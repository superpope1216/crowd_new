package com.wisedu.crowd.dao.yhgl.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.yhgl.YhjbxxViewInfo;

public interface YhjbxxViewInfoExtendMapper {

	List<YhjbxxViewInfo> selectDisplayByCondition(QueryCondition<YhjbxxViewInfo> condition);
}
