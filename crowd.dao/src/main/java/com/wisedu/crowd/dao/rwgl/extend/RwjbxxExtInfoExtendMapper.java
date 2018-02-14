package com.wisedu.crowd.dao.rwgl.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxExtInfoExtend;

public interface RwjbxxExtInfoExtendMapper {
   List<RwjbxxExtInfoExtend> selectByCondition(QueryCondition<RwjbxxExtInfoExtend> record);
   
   List<RwjbxxExtInfoExtend> selectDisplayByCondition(QueryCondition<RwjbxxExtInfoExtend> record);
}