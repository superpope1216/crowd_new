package com.wisedu.crowd.dao.statics;

import com.wisedu.crowd.entity.statics.KfzjlMonth;

public interface KfzjlMonthMapper {
    /**
     *
     * @mbggenerated 2017-11-03
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-03
     */
    int insert(KfzjlMonth record);

    /**
     *
     * @mbggenerated 2017-11-03
     */
    int insertSelective(KfzjlMonth record);

    /**
     *
     * @mbggenerated 2017-11-03
     */
    KfzjlMonth selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-03
     */
    int updateByPrimaryKeySelective(KfzjlMonth record);

    /**
     *
     * @mbggenerated 2017-11-03
     */
    int updateByPrimaryKey(KfzjlMonth record);
}