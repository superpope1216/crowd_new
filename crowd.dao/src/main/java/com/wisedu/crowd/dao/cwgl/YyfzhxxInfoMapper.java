package com.wisedu.crowd.dao.cwgl;

import com.wisedu.crowd.entity.cwgl.YyfzhxxInfo;

public interface YyfzhxxInfoMapper {
    /**
     *
     * @mbggenerated 2017-12-04
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-12-04
     */
    int insert(YyfzhxxInfo record);

    /**
     *
     * @mbggenerated 2017-12-04
     */
    int insertSelective(YyfzhxxInfo record);

    /**
     *
     * @mbggenerated 2017-12-04
     */
    YyfzhxxInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-12-04
     */
    int updateByPrimaryKeySelective(YyfzhxxInfo record);

    /**
     *
     * @mbggenerated 2017-12-04
     */
    int updateByPrimaryKey(YyfzhxxInfo record);
}