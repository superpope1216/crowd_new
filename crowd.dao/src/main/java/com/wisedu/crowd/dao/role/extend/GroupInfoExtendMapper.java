package com.wisedu.crowd.dao.role.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.role.extend.GroupInfoExtend;

public interface GroupInfoExtendMapper {
	List<GroupInfoExtend> selectDisplayByCondition(QueryCondition<GroupInfoExtend> condition);
}
