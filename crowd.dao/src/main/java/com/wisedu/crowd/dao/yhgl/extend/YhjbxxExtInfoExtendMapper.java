package com.wisedu.crowd.dao.yhgl.extend;

import java.util.List;

import com.wisedu.crowd.entity.yhgl.extend.YhjbxxExtInfoExtend;

public interface YhjbxxExtInfoExtendMapper {
   
	List<YhjbxxExtInfoExtend>  selectByCondition(YhjbxxExtInfoExtend record);
}