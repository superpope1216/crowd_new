package com.wisedu.crowd.dao.statics;

import com.wisedu.crowd.entity.statics.TrainEnrolDataInfo;

public interface TrainEnrolDataInfoMapper {
    /**
     *
     * @mbggenerated 2018-01-26
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-26
     */
    int insert(TrainEnrolDataInfo record);

    /**
     *
     * @mbggenerated 2018-01-26
     */
    int insertSelective(TrainEnrolDataInfo record);

    /**
     *
     * @mbggenerated 2018-01-26
     */
    TrainEnrolDataInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-26
     */
    int updateByPrimaryKeySelective(TrainEnrolDataInfo record);

    /**
     *
     * @mbggenerated 2018-01-26
     */
    int updateByPrimaryKey(TrainEnrolDataInfo record);
}