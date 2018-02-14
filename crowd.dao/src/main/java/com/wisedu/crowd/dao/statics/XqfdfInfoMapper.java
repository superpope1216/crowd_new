package com.wisedu.crowd.dao.statics;

import com.wisedu.crowd.entity.statics.XqfdfInfo;

public interface XqfdfInfoMapper {
    /**
     *
     * @mbggenerated 2018-01-18
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-18
     */
    int insert(XqfdfInfo record);

    /**
     *
     * @mbggenerated 2018-01-18
     */
    int insertSelective(XqfdfInfo record);

    /**
     *
     * @mbggenerated 2018-01-18
     */
    XqfdfInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-18
     */
    int updateByPrimaryKeySelective(XqfdfInfo record);

    /**
     *
     * @mbggenerated 2018-01-18
     */
    int updateByPrimaryKey(XqfdfInfo record);
}