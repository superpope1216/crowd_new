package com.wisedu.crowd.dao.zygl;

import com.wisedu.crowd.entity.zygl.SjkInfo;

public interface SjkInfoMapper {
    /**
     *
     * @mbggenerated 2018-01-12
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-12
     */
    int insert(SjkInfo record);

    /**
     *
     * @mbggenerated 2018-01-12
     */
    int insertSelective(SjkInfo record);

    /**
     *
     * @mbggenerated 2018-01-12
     */
    SjkInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-12
     */
    int updateByPrimaryKeySelective(SjkInfo record);

    /**
     *
     * @mbggenerated 2018-01-12
     */
    int updateByPrimaryKey(SjkInfo record);
}