package com.wisedu.crowd.dao.role.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.role.extend.GroupInfoExtend;
import com.wisedu.crowd.entity.role.extend.GroupMenuAuthInfoExtend;

public interface GroupMenuAuthInfoExtendMapper {
	List<GroupMenuAuthInfoExtend> selectDisplayByCondition(QueryCondition<GroupMenuAuthInfoExtend> condition);
}
