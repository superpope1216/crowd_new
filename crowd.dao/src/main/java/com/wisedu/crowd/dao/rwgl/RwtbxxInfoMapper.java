package com.wisedu.crowd.dao.rwgl;

import com.wisedu.crowd.entity.rwgl.RwtbxxInfo;

public interface RwtbxxInfoMapper {
    /**
     *
     * @mbggenerated 2017-11-23
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-23
     */
    int insert(RwtbxxInfo record);

    /**
     *
     * @mbggenerated 2017-11-23
     */
    int insertSelective(RwtbxxInfo record);

    /**
     *
     * @mbggenerated 2017-11-23
     */
    RwtbxxInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-23
     */
    int updateByPrimaryKeySelective(RwtbxxInfo record);

    /**
     *
     * @mbggenerated 2017-11-23
     */
    int updateByPrimaryKey(RwtbxxInfo record);
}