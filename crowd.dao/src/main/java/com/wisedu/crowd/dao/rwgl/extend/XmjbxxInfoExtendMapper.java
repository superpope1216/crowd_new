package com.wisedu.crowd.dao.rwgl.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.rwgl.XmjbxxInfo;
import com.wisedu.crowd.entity.rwgl.extend.XmjbxxInfoExtend;

public interface XmjbxxInfoExtendMapper {
	List<XmjbxxInfo>  selectByCondition(QueryCondition<XmjbxxInfoExtend> condition);
}