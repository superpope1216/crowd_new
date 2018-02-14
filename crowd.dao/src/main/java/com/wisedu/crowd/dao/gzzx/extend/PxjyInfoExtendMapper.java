package com.wisedu.crowd.dao.gzzx.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.gzzx.extend.PtjyInfoExtend;
import com.wisedu.crowd.entity.gzzx.extend.PxjyInfoExtend;

public interface PxjyInfoExtendMapper {
    List<PxjyInfoExtend> selectDisplayByCondition(QueryCondition<PxjyInfoExtend> condition);
}