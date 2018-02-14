package com.wisedu.crowd.dao.cwgl;

import com.wisedu.crowd.entity.cwgl.YyfzhszmxInfo;

public interface YyfzhszmxInfoMapper {
    /**
     *
     * @mbggenerated 2017-12-04
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-12-04
     */
    int insert(YyfzhszmxInfo record);

    /**
     *
     * @mbggenerated 2017-12-04
     */
    int insertSelective(YyfzhszmxInfo record);

    /**
     *
     * @mbggenerated 2017-12-04
     */
    YyfzhszmxInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-12-04
     */
    int updateByPrimaryKeySelective(YyfzhszmxInfo record);

    /**
     *
     * @mbggenerated 2017-12-04
     */
    int updateByPrimaryKey(YyfzhszmxInfo record);
}