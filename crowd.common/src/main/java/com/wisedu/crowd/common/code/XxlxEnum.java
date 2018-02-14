/**
 * Project Name:crowd.common
 * File Name:XxlxEnum.java
 * Package Name:com.wisedu.crowd.common.code
 * Date:2017年12月11日上午11:00:42
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.common.code;
/**
 * 消息类型
 * Date:     2017年12月11日 上午11:00:42 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public enum XxlxEnum {
    
    /**
     * 系统消息
     */
    XTXX(0, "系统消息"),
    /**
     * 需求审核消息
     */
    XQSH(1, "需求审核消息"),
    /**
     * 投标提醒
     */
    TBTX(2, "投标提醒"),
    /**
     * 自动关闭提醒
     */
    ZDGBTX(3, "自动关闭提醒"),
    /**
     * 中标提醒
     */
    ZBTX(4, "中标提醒"),
    /**
     * 延期提醒
     */
    YQTX(5, "延期提醒"),
    /**
     * 验收提醒
     */
    YSTX(6, "验收提醒"),
    /**
     * 自动验收提醒
     */
    ZDYSTX(7, "自动验收提醒"),
    /**
     * 验收结果
     */
    YSJG(8, "验收结果"),
    /**
     * 售后结束提醒
     */
    SHJSTX(9, "售后结束提醒"),
    /**
     * 自动结束售后提醒
     */
    ZDJSSHTX(10, "自动结束售后提醒"),
    /**
     * 售后结束结果
     */
    SHJSJG(11, "售后结束结果");
    
    
    
    private int code;
    private String name;
    
    XxlxEnum(int code, String name){
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

