package com.wisedu.crowd.dao.yhgl;

import com.wisedu.crowd.entity.yhgl.XqfxyjfInfo;

public interface XqfxyjfInfoMapper {
    /**
     *
     * @mbggenerated 2018-01-24
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int insert(XqfxyjfInfo record);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int insertSelective(XqfxyjfInfo record);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    XqfxyjfInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int updateByPrimaryKeySelective(XqfxyjfInfo record);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int updateByPrimaryKey(XqfxyjfInfo record);
}