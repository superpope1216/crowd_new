package com.wisedu.crowd.dao.zygl;

import com.wisedu.crowd.entity.zygl.VpnInfo;

public interface VpnInfoMapper {
    /**
     *
     * @mbggenerated 2018-01-12
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-12
     */
    int insert(VpnInfo record);

    /**
     *
     * @mbggenerated 2018-01-12
     */
    int insertSelective(VpnInfo record);

    /**
     *
     * @mbggenerated 2018-01-12
     */
    VpnInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2018-01-12
     */
    int updateByPrimaryKeySelective(VpnInfo record);

    /**
     *
     * @mbggenerated 2018-01-12
     */
    int updateByPrimaryKey(VpnInfo record);
}