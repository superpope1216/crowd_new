package com.wisedu.crowd.dao.train.extend;
import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.train.extend.TrainEnrolInfoExtend;

public interface TrainEnrolInfoExtendMapper {

    List<TrainEnrolInfoExtend> selectByCondition(QueryCondition<TrainEnrolInfoExtend> condition);
    
    Integer selectCountByCondition(QueryCondition<TrainEnrolInfoExtend> condition);
    
    List<TrainEnrolInfoExtend> selectDisplayByCondition(QueryCondition<TrainEnrolInfoExtend> condition);
    
    List<TrainEnrolInfoExtend> selectEnrolByCondition(QueryCondition<TrainEnrolInfoExtend> condition);
}