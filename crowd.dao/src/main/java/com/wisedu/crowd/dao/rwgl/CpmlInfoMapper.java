package com.wisedu.crowd.dao.rwgl;

import com.wisedu.crowd.entity.rwgl.CpmlInfo;

public interface CpmlInfoMapper {
    /**
     *
     * @mbggenerated 2017-11-20
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int insert(CpmlInfo record);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int insertSelective(CpmlInfo record);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    CpmlInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int updateByPrimaryKeySelective(CpmlInfo record);

    /**
     *
     * @mbggenerated 2017-11-20
     */
    int updateByPrimaryKey(CpmlInfo record);
}