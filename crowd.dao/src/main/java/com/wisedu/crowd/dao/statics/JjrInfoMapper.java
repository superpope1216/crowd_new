package com.wisedu.crowd.dao.statics;

import com.wisedu.crowd.entity.statics.JjrInfo;

public interface JjrInfoMapper {
    /**
     *
     * @mbggenerated 2018-01-11
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-11
     */
    int insert(JjrInfo record);

    /**
     *
     * @mbggenerated 2018-01-11
     */
    int insertSelective(JjrInfo record);

    /**
     *
     * @mbggenerated 2018-01-11
     */
    JjrInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-11
     */
    int updateByPrimaryKeySelective(JjrInfo record);

    /**
     *
     * @mbggenerated 2018-01-11
     */
    int updateByPrimaryKey(JjrInfo record);
}