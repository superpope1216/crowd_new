package com.wisedu.crowd.dao.data.delay;

import com.wisedu.crowd.entity.data.delay.DataDelayKfzMonthInfo;

public interface DataDelayKfzMonthInfoMapper {
    /**
     *
     * @mbggenerated 2018-02-11
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-02-11
     */
    int insert(DataDelayKfzMonthInfo record);

    /**
     *
     * @mbggenerated 2018-02-11
     */
    int insertSelective(DataDelayKfzMonthInfo record);

    /**
     *
     * @mbggenerated 2018-02-11
     */
    DataDelayKfzMonthInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-02-11
     */
    int updateByPrimaryKeySelective(DataDelayKfzMonthInfo record);

    /**
     *
     * @mbggenerated 2018-02-11
     */
    int updateByPrimaryKey(DataDelayKfzMonthInfo record);
}