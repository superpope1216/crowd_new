package com.wisedu.crowd.dao.yhgl;

import com.wisedu.crowd.entity.yhgl.YhjbxxLoginLogInfo;

public interface YhjbxxLoginLogInfoMapper {
    /**
     *
     * @mbggenerated 2017-11-03
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-03
     */
    int insert(YhjbxxLoginLogInfo record);

    /**
     *
     * @mbggenerated 2017-11-03
     */
    int insertSelective(YhjbxxLoginLogInfo record);

    /**
     *
     * @mbggenerated 2017-11-03
     */
    YhjbxxLoginLogInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-03
     */
    int updateByPrimaryKeySelective(YhjbxxLoginLogInfo record);

    /**
     *
     * @mbggenerated 2017-11-03
     */
    int updateByPrimaryKey(YhjbxxLoginLogInfo record);
}