package com.wisedu.crowd.dao.statics;

import com.wisedu.crowd.entity.statics.ManpowerInfo;

public interface ManpowerInfoMapper {
    /**
     *
     * @mbggenerated 2017-11-06
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-06
     */
    int insert(ManpowerInfo record);

    /**
     *
     * @mbggenerated 2017-11-06
     */
    int insertSelective(ManpowerInfo record);

    /**
     *
     * @mbggenerated 2017-11-06
     */
    ManpowerInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-06
     */
    int updateByPrimaryKeySelective(ManpowerInfo record);

    /**
     *
     * @mbggenerated 2017-11-06
     */
    int updateByPrimaryKey(ManpowerInfo record);
}