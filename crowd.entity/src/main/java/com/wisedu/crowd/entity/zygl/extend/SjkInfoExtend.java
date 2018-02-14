/**
 * Project Name:crowd.entity
 * File Name:SjkInfoExtend.java
 * Package Name:com.wisedu.crowd.entity.zygl.extend
 * Date:2018年1月12日上午10:25:38
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.entity.zygl.extend;

import java.io.Serializable;

import com.wisedu.crowd.entity.zygl.SjkInfo;

/**
 * ClassName:SjkInfoExtend <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月12日 上午10:25:38 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class SjkInfoExtend extends SjkInfo implements Serializable{

    /**
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).
     * @since JDK 1.6
     */
    private static final long serialVersionUID = 1L;
    
    private String syztDisplay;

    public String getSyztDisplay() {
        return syztDisplay;
    }

    public void setSyztDisplay(String syztDisplay) {
        this.syztDisplay = syztDisplay;
    }
}

