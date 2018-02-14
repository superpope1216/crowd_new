package com.wisedu.crowd.dao.data;

import com.wisedu.crowd.entity.data.DataDelayInfo;

public interface DataDelayInfoMapper {
    /**
     *
     * @mbggenerated 2018-02-08
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-02-08
     */
    int insert(DataDelayInfo record);

    /**
     *
     * @mbggenerated 2018-02-08
     */
    int insertSelective(DataDelayInfo record);

    /**
     *
     * @mbggenerated 2018-02-08
     */
    DataDelayInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-02-08
     */
    int updateByPrimaryKeySelective(DataDelayInfo record);

    /**
     *
     * @mbggenerated 2018-02-08
     */
    int updateByPrimaryKey(DataDelayInfo record);
}