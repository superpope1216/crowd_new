package com.wisedu.crowd.dao.yhgl;

import com.wisedu.crowd.entity.yhgl.KfzxyjfxqInfo;

public interface KfzxyjfxqInfoMapper {
    /**
     *
     * @mbggenerated 2018-01-24
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int insert(KfzxyjfxqInfo record);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int insertSelective(KfzxyjfxqInfo record);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    KfzxyjfxqInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int updateByPrimaryKeySelective(KfzxyjfxqInfo record);

    /**
     *
     * @mbggenerated 2018-01-24
     */
    int updateByPrimaryKey(KfzxyjfxqInfo record);
}