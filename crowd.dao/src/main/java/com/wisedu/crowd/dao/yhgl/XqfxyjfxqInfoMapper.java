package com.wisedu.crowd.dao.yhgl;

import com.wisedu.crowd.entity.yhgl.XqfxyjfxqInfo;

public interface XqfxyjfxqInfoMapper {
    /**
     *
     * @mbggenerated 2018-01-24
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int insert(XqfxyjfxqInfo record);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int insertSelective(XqfxyjfxqInfo record);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    XqfxyjfxqInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int updateByPrimaryKeySelective(XqfxyjfxqInfo record);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int updateByPrimaryKey(XqfxyjfxqInfo record);
}