package com.wisedu.crowd.dao.xtgl;

import com.wisedu.crowd.entity.xtgl.XtcsbInfo;

public interface XtcsbInfoMapper {
    /**
     *
     * @mbggenerated 2017-11-22
     */
    int deleteByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-22
     */
    int insert(XtcsbInfo record);

    /**
     *
     * @mbggenerated 2017-11-22
     */
    int insertSelective(XtcsbInfo record);

    /**
     *
     * @mbggenerated 2017-11-22
     */
    XtcsbInfo selectByPrimaryKey(String wid);

    /**
     *
     * @mbggenerated 2017-11-22
     */
    int updateByPrimaryKeySelective(XtcsbInfo record);

    /**
     *
     * @mbggenerated 2017-11-22
     */
    int updateByPrimaryKey(XtcsbInfo record);
}