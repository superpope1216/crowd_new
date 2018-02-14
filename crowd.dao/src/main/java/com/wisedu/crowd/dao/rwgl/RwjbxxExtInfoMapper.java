package com.wisedu.crowd.dao.rwgl;

import com.wisedu.crowd.entity.rwgl.RwjbxxExtInfo;

public interface RwjbxxExtInfoMapper {
    /**
     *
     * @mbggenerated 2017-11-20
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int insert(RwjbxxExtInfo record);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int insertSelective(RwjbxxExtInfo record);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    RwjbxxExtInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int updateByPrimaryKeySelective(RwjbxxExtInfo record);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int updateByPrimaryKey(RwjbxxExtInfo record);
}