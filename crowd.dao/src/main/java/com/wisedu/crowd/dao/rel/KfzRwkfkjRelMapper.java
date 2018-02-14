package com.wisedu.crowd.dao.rel;

import com.wisedu.crowd.entity.rel.KfzRwkfkjRel;

public interface KfzRwkfkjRelMapper {
    /**
     *
     * @mbggenerated 2017-12-25
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-12-25
     */
    int insert(KfzRwkfkjRel record);

    /**
     *
     * @mbggenerated 2017-12-25
     */
    int insertSelective(KfzRwkfkjRel record);

    /**
     *
     * @mbggenerated 2017-12-25
     */
    KfzRwkfkjRel selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-12-25
     */
    int updateByPrimaryKeySelective(KfzRwkfkjRel record);

    /**
     *
     * @mbggenerated 2017-12-25
     */
    int updateByPrimaryKey(KfzRwkfkjRel record);
}