/**
 * Project Name:crowd.common
 * File Name:SqzylbEnum.java
 * Package Name:com.wisedu.crowd.common.code
 * Date:2018年1月12日上午11:20:28
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.common.code;
/**
 * ClassName:SqzylbEnum <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月12日 上午11:20:28 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public enum SqzylbEnum {

    /**
     * 云桌面
     */
    YZM(1, "云桌面"),
    /**
     * SVN
     */
    SVN(2, "SVN"),
    /**
     * 数据库
     */
    SJK(3, "数据库"),
    /**
     * VPN
     */
    VPN(4, "VPN");
    
    private int code;
    
    private String name;
    
    SqzylbEnum(int code, String name){
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

