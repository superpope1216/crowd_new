/**
 * Project Name:crowd.common
 * File Name:YykhztEnum.java
 * Package Name:com.wisedu.crowd.common.code
 * Date:2018年1月9日下午2:17:51
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.common.code;
/**
 * 预约考核状态
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public enum YykhztEnum {

    /**
     * 未预约
     */
    WYY(1, "未预约"),
    /**
     * 预约待安排
     */
    YYDAP(2, "预约待安排"),
    /**
     * 安排待考核
     */
    APDKH(3, "安排待考核"),
    /**
     * 已考核
     */
    YKH(4, "已考核"),
    /**
     * 取消预约
     */
    QXYY(5, "取消预约");
    
    private int code;
    
    private String name;
    
    YykhztEnum(int code, String name){
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

