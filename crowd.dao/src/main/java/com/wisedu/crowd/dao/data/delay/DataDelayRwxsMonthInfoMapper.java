package com.wisedu.crowd.dao.data.delay;

import com.wisedu.crowd.entity.data.delay.DataDelayRwxsMonthInfo;

public interface DataDelayRwxsMonthInfoMapper {
    /**
     *
     * @mbggenerated 2018-02-11
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-02-11
     */
    int insert(DataDelayRwxsMonthInfo record);

    /**
     *
     * @mbggenerated 2018-02-11
     */
    int insertSelective(DataDelayRwxsMonthInfo record);

    /**
     *
     * @mbggenerated 2018-02-11
     */
    DataDelayRwxsMonthInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-02-11
     */
    int updateByPrimaryKeySelective(DataDelayRwxsMonthInfo record);

    /**
     *
     * @mbggenerated 2018-02-11
     */
    int updateByPrimaryKey(DataDelayRwxsMonthInfo record);
}