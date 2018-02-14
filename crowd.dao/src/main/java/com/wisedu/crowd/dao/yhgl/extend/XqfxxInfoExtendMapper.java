package com.wisedu.crowd.dao.yhgl.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.yhgl.XqfxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.XqfxxInfoExtend;

public interface XqfxxInfoExtendMapper {
	List<XqfxxInfoExtend> selectByCondition(QueryCondition<XqfxxInfoExtend> record);
	
	Integer updateByVersion(XqfxxInfo record);
	
	Integer selectCountByCondition(QueryCondition<XqfxxInfoExtend> record);
}