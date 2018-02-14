package com.wisedu.crowd.dao.xtgl.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.xtgl.extend.YwxdzbInfoExtend;

public interface YwxdzbInfoExtendMapper {
    List<YwxdzbInfoExtend> selectByCondition(QueryCondition<YwxdzbInfoExtend> condition);
}