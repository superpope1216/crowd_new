package com.wisedu.crowd.dao.xmgl;

import com.wisedu.crowd.entity.xmgl.YwxWorkTime;

public interface YwxWorkTimeMapper {
    /**
     *
     * @mbggenerated 2018-01-17
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-17
     */
    int insert(YwxWorkTime record);

    /**
     *
     * @mbggenerated 2018-01-17
     */
    int insertSelective(YwxWorkTime record);

    /**
     *
     * @mbggenerated 2018-01-17
     */
    YwxWorkTime selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-17
     */
    int updateByPrimaryKeySelective(YwxWorkTime record);

    /**
     *
     * @mbggenerated 2018-01-17
     */
    int updateByPrimaryKey(YwxWorkTime record);
}