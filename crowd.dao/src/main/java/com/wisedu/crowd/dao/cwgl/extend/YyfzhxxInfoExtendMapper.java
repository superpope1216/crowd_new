package com.wisedu.crowd.dao.cwgl.extend;

import java.util.List;

import com.wisedu.crowd.entity.cwgl.YyfzhxxInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;

public interface YyfzhxxInfoExtendMapper {
	
	List<YyfzhxxInfo> selectByCondition(QueryCondition<YyfzhxxInfo> record);
}