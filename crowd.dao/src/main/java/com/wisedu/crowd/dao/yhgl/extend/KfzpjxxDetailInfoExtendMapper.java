package com.wisedu.crowd.dao.yhgl.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.yhgl.KfzpjxxDetailInfo;

public interface KfzpjxxDetailInfoExtendMapper {
    /**
     *
     * @mbggenerated 2017-12-04
     */
    List<KfzpjxxDetailInfo> selectByCondition(QueryCondition<KfzpjxxDetailInfo> record);

    
}