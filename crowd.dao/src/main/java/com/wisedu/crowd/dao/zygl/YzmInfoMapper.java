package com.wisedu.crowd.dao.zygl;

import com.wisedu.crowd.entity.zygl.YzmInfo;

public interface YzmInfoMapper {
    /**
     *
     * @mbggenerated 2018-01-12
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-12
     */
    int insert(YzmInfo record);

    /**
     *
     * @mbggenerated 2018-01-12
     */
    int insertSelective(YzmInfo record);

    /**
     *
     * @mbggenerated 2018-01-12
     */
    YzmInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-12
     */
    int updateByPrimaryKeySelective(YzmInfo record);

    /**
     *
     * @mbggenerated 2018-01-12
     */
    int updateByPrimaryKey(YzmInfo record);
}