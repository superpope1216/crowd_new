/**
 * Project Name:entity
 * File Name:DateStateEnum.java
 * Package Name:com.wisedu.crowd.state
 * Date:2017年8月9日下午4:57:36
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.entity.datacode;
/**
 * ClassName:DateStateEnum <br/>
 * Function: TODO 记录有效、无效记录<br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年8月9日 下午4:57:36 <br/>
 * @author   de
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public enum DataStateEnum {

    /**
     * 有效
     */
    VALID("1","有效"),
    /**
     * 无效
     */
    INVALID("0","无效");
    public String code;
    private String name;
    DataStateEnum(String code,String name){
        this.code=code;
        this.name=name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}

