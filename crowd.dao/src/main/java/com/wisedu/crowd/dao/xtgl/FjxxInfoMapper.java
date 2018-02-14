package com.wisedu.crowd.dao.xtgl;

import com.wisedu.crowd.entity.xtgl.FjxxInfo;

public interface FjxxInfoMapper {
    /**
     *
     * @mbggenerated 2017-11-22
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-22
     */
    int insert(FjxxInfo record);

    /**
     *
     * @mbggenerated 2017-11-22
     */
    int insertSelective(FjxxInfo record);

    /**
     *
     * @mbggenerated 2017-11-22
     */
    FjxxInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-22
     */
    int updateByPrimaryKeySelective(FjxxInfo record);

    /**
     *
     * @mbggenerated 2017-11-22
     */
    int updateByPrimaryKey(FjxxInfo record);
}