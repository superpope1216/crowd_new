package com.wisedu.crowd.dao.statics;

import com.wisedu.crowd.entity.statics.YwxyqInfo;

public interface YwxyqInfoMapper {
    /**
     *
     * @mbggenerated 2017-10-19
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-10-19
     */
    int insert(YwxyqInfo record);

    /**
     *
     * @mbggenerated 2017-10-19
     */
    int insertSelective(YwxyqInfo record);

    /**
     *
     * @mbggenerated 2017-10-19
     */
    YwxyqInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-10-19
     */
    int updateByPrimaryKeySelective(YwxyqInfo record);

    /**
     *
     * @mbggenerated 2017-10-19
     */
    int updateByPrimaryKey(YwxyqInfo record);
}