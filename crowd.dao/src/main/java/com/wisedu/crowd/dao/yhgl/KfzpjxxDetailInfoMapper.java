package com.wisedu.crowd.dao.yhgl;

import com.wisedu.crowd.entity.yhgl.KfzpjxxDetailInfo;

public interface KfzpjxxDetailInfoMapper {
    /**
     *
     * @mbggenerated 2017-12-04
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-12-04
     */
    int insert(KfzpjxxDetailInfo record);

    /**
     *
     * @mbggenerated 2017-12-04
     */
    int insertSelective(KfzpjxxDetailInfo record);

    /**
     *
     * @mbggenerated 2017-12-04
     */
    KfzpjxxDetailInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-12-04
     */
    int updateByPrimaryKeySelective(KfzpjxxDetailInfo record);

    /**
     *
     * @mbggenerated 2017-12-04
     */
    int updateByPrimaryKey(KfzpjxxDetailInfo record);
}