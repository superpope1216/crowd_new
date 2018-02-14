package com.wisedu.crowd.dao.gzzx.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.gzzx.extend.PtjyInfoExtend;

public interface PtjyInfoExtendMapper {
    List<PtjyInfoExtend> selectDisplayByCondition(QueryCondition<PtjyInfoExtend> condition);
}