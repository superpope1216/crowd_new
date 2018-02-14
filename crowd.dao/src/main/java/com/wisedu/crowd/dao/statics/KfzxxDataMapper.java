package com.wisedu.crowd.dao.statics;

import com.wisedu.crowd.entity.statics.KfzxxData;

public interface KfzxxDataMapper {
    /**
     *
     * @mbggenerated 2018-01-24
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int insert(KfzxxData record);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int insertSelective(KfzxxData record);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    KfzxxData selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int updateByPrimaryKeySelective(KfzxxData record);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int updateByPrimaryKey(KfzxxData record);
}