package com.wisedu.crowd.dao.yhgl;

import com.wisedu.crowd.entity.yhgl.XqfxxExtInfo;

public interface XqfxxExtInfoMapper {
    /**
     *
     * @mbggenerated 2017-11-23
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-23
     */
    int insert(XqfxxExtInfo record);

    /**
     *
     * @mbggenerated 2017-11-23
     */
    int insertSelective(XqfxxExtInfo record);

    /**
     *
     * @mbggenerated 2017-11-23
     */
    XqfxxExtInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-23
     */
    int updateByPrimaryKeySelective(XqfxxExtInfo record);

    /**
     *
     * @mbggenerated 2017-11-23
     */
    int updateByPrimaryKey(XqfxxExtInfo record);
}