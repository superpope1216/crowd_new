package com.wisedu.crowd.dao.kcgl.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.kcgl.extend.FinishCoursesExtend;

public interface FinishCoursesExtendMapper {
  
    int deleteAllFinishCourses();
    
    List<FinishCoursesExtend> selectByDisplayCondition(QueryCondition<FinishCoursesExtend> condition);
    
}