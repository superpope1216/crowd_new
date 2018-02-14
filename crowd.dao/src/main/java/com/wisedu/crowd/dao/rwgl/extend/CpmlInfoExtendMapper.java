package com.wisedu.crowd.dao.rwgl.extend;

import java.util.List;

import com.wisedu.crowd.entity.rwgl.extend.CpmlInfoExtend;

public interface CpmlInfoExtendMapper {
	List<CpmlInfoExtend>  selectByCondition(CpmlInfoExtend record);
}