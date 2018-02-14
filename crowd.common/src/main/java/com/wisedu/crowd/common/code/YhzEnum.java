/**
 * Project Name:common
 * File Name:YhzEnum.java
 * Package Name:com.wisedu.crowd.common.code
 * Date:2017年11月15日上午9:42:37
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.common.code;
/**
 * ClassName:YhzEnum <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年11月15日 上午9:42:37 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public enum YhzEnum {

    GLY("GLY", "管理员"),
    KFFZR("KFFZR", "开发负责人"),
    SSJKR("SSJKR", "实施接口人"),
    DQFZR("DQFZR", "大区负责人"),
    WBRY("WBRY", "外部人员"),
    CSRY("CSRY", "测试组"),
    GSZSRY("GSZSRY", "公司展示人员");
    
private String code;
    
    private String name;
    
    YhzEnum(String code,String name){
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

