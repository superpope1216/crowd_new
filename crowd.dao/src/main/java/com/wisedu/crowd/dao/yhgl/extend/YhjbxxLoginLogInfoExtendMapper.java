package com.wisedu.crowd.dao.yhgl.extend;

import java.util.List;

import com.wisedu.crowd.entity.yhgl.extend.YhjbxxLoginLogInfoExtend;

public interface YhjbxxLoginLogInfoExtendMapper {
	List<YhjbxxLoginLogInfoExtend>  selectByCondition(YhjbxxLoginLogInfoExtend record);
}