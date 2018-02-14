package com.wisedu.crowd.dao.statics;

import com.wisedu.crowd.entity.statics.KfzzfInfo;

public interface KfzzfInfoMapper {
    /**
     *
     * @mbggenerated 2018-01-18
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-18
     */
    int insert(KfzzfInfo record);

    /**
     *
     * @mbggenerated 2018-01-18
     */
    int insertSelective(KfzzfInfo record);

    /**
     *
     * @mbggenerated 2018-01-18
     */
    KfzzfInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-18
     */
    int updateByPrimaryKeySelective(KfzzfInfo record);

    /**
     *
     * @mbggenerated 2018-01-18
     */
    int updateByPrimaryKey(KfzzfInfo record);
}