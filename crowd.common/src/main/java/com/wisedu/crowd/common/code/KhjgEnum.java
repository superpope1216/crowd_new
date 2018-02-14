/**
 * Project Name:crowd.common
 * File Name:KhjgEnum.java
 * Package Name:com.wisedu.crowd.common.code
 * Date:2018年1月9日上午9:46:45
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.common.code;
/**
 * 考核结果
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public enum KhjgEnum {

    /**
     * 通过
     */
    TG(1, "通过"),
    
    /**
     * 不通过
     */
    BTG(2, "不通过"),
    
    /**
     * 缺考
     */
    QK(3, "缺考");
    
    private int code;
    
    private String name;
    
    KhjgEnum(int code, String name){
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

