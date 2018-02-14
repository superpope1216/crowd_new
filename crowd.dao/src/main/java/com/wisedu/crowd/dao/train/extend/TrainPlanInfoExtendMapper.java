package com.wisedu.crowd.dao.train.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.train.TrainPlanInfo;
import com.wisedu.crowd.entity.train.extend.TrainPlanInfoExtend;

public interface TrainPlanInfoExtendMapper {
    List<TrainPlanInfoExtend> selectByCondition(QueryCondition<TrainPlanInfoExtend> condition);
}