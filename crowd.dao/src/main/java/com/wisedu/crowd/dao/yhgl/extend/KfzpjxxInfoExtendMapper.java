package com.wisedu.crowd.dao.yhgl.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.yhgl.KfzpjxxInfo;

public interface KfzpjxxInfoExtendMapper {
	 
   List<KfzpjxxInfo> selectByCondition(QueryCondition<KfzpjxxInfo> record);

}