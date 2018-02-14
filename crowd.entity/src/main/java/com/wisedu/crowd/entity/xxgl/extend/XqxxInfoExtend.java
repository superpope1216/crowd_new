/**
 * Project Name:crowd.entity
 * File Name:XqfxxInfoExtend.java
 * Package Name:com.wisedu.crowd.entity.xxgl.extend
 * Date:2017年12月7日下午5:20:22
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.entity.xxgl.extend;

import java.io.Serializable;

import com.wisedu.crowd.entity.xxgl.XqxxInfo;

/**
 * ClassName:XqfxxInfoExtend <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年12月7日 下午5:20:22 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class XqxxInfoExtend extends XqxxInfo implements Serializable{
    /**
    * 
    */
   private static final long serialVersionUID = 1L;
   
   private String rwbh;

    public String getRwbh() {
        return rwbh;
    }

    public void setRwbh(String rwbh) {
        this.rwbh = rwbh;
    }
   
}

