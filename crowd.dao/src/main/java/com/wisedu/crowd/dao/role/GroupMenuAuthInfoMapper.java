package com.wisedu.crowd.dao.role;

import com.wisedu.crowd.entity.role.GroupMenuAuthInfo;

public interface GroupMenuAuthInfoMapper {
    /**
     *
     * @mbggenerated 2018-02-06
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-02-06
     */
    int insert(GroupMenuAuthInfo record);

    /**
     *
     * @mbggenerated 2018-02-06
     */
    int insertSelective(GroupMenuAuthInfo record);

    /**
     *
     * @mbggenerated 2018-02-06
     */
    GroupMenuAuthInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-02-06
     */
    int updateByPrimaryKeySelective(GroupMenuAuthInfo record);

    /**
     *
     * @mbggenerated 2018-02-06
     */
    int updateByPrimaryKey(GroupMenuAuthInfo record);
}