package com.wisedu.crowd.dao.xxgl;

import com.wisedu.crowd.entity.xxgl.GrxxszInfo;

public interface GrxxszInfoMapper {
    /**
     *
     * @mbggenerated 2017-12-11
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-12-11
     */
    int insert(GrxxszInfo record);

    /**
     *
     * @mbggenerated 2017-12-11
     */
    int insertSelective(GrxxszInfo record);

    /**
     *
     * @mbggenerated 2017-12-11
     */
    GrxxszInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-12-11
     */
    int updateByPrimaryKeySelective(GrxxszInfo record);

    /**
     *
     * @mbggenerated 2017-12-11
     */
    int updateByPrimaryKey(GrxxszInfo record);
}