/**
 * Project Name:crowd-entity
 * File Name:CloudStateEnum.java
 * Package Name:com.wisedu.crowd.entity.datacode
 * Date:2017年8月30日上午10:49:41
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.entity.datacode;
/**
 * ClassName:CloudStateEnum <br/>
 * Function: TODO 云桌面状态（空闲、使用） <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年8月30日 上午10:49:41 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public enum CloudStateEnum {

    /**
     * 空闲
     */
    FREE("1","空闲"),
    /**
     * 使用中
     */
    USE("2","使用中");
    public String code;
    private String name;
    CloudStateEnum(String code,String name){
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

