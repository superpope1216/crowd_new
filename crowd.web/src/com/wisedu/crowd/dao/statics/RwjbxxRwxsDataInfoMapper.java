package com.wisedu.crowd.dao.statics;

import com.wisedu.crowd.entity.statics.RwjbxxRwxsDataInfo;

public interface RwjbxxRwxsDataInfoMapper {
    /**
     *
     * @mbggenerated 2018-02-08
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-02-08
     */
    int insert(RwjbxxRwxsDataInfo record);

    /**
     *
     * @mbggenerated 2018-02-08
     */
    int insertSelective(RwjbxxRwxsDataInfo record);

    /**
     *
     * @mbggenerated 2018-02-08
     */
    RwjbxxRwxsDataInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-02-08
     */
    int updateByPrimaryKeySelective(RwjbxxRwxsDataInfo record);

    /**
     *
     * @mbggenerated 2018-02-08
     */
    int updateByPrimaryKey(RwjbxxRwxsDataInfo record);
}