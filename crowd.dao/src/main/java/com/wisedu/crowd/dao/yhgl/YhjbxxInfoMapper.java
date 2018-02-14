package com.wisedu.crowd.dao.yhgl;

import com.wisedu.crowd.entity.yhgl.YhjbxxInfo;

public interface YhjbxxInfoMapper {
    /**
     *
     * @mbggenerated 2017-11-02
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-02
     */
    int insert(YhjbxxInfo record);

    /**
     *
     * @mbggenerated 2017-11-02
     */
    int insertSelective(YhjbxxInfo record);

    /**
     *
     * @mbggenerated 2017-11-02
     */
    YhjbxxInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-02
     */
    int updateByPrimaryKeySelective(YhjbxxInfo record);

    /**
     *
     * @mbggenerated 2017-11-02
     */
    int updateByPrimaryKey(YhjbxxInfo record);
}