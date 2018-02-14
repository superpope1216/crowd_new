package com.wisedu.crowd.dao.xxgl;

import com.wisedu.crowd.entity.xxgl.XqxxInfo;

public interface XqxxInfoMapper {
    /**
     *
     * @mbggenerated 2017-12-07
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-12-07
     */
    int insert(XqxxInfo record);

    /**
     *
     * @mbggenerated 2017-12-07
     */
    int insertSelective(XqxxInfo record);

    /**
     *
     * @mbggenerated 2017-12-07
     */
    XqxxInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-12-07
     */
    int updateByPrimaryKeySelective(XqxxInfo record);

    /**
     *
     * @mbggenerated 2017-12-07
     */
    int updateByPrimaryKey(XqxxInfo record);
}