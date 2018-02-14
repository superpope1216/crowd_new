package com.wisedu.crowd.dao.yhgl;

import com.wisedu.crowd.entity.yhgl.XqfxxInfo;

public interface XqfxxInfoMapper {
    /**
     *
     * @mbggenerated 2017-11-24
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-24
     */
    int insert(XqfxxInfo record);

    /**
     *
     * @mbggenerated 2017-11-24
     */
    int insertSelective(XqfxxInfo record);

    /**
     *
     * @mbggenerated 2017-11-24
     */
    XqfxxInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-24
     */
    int updateByPrimaryKeySelective(XqfxxInfo record);

    /**
     *
     * @mbggenerated 2017-11-24
     */
    int updateByPrimaryKey(XqfxxInfo record);
}