/**
 * Project Name:entity
 * File Name:ManpowerInfoExtend.java
 * Package Name:com.wisedu.crowd.entity.statics.extend
 * Date:2017年11月6日上午10:21:37
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.entity.statics.extend;

import java.io.Serializable;

import com.wisedu.crowd.entity.statics.ManpowerInfo;

/**
 * ClassName:ManpowerInfoExtend <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年11月6日 上午10:21:37 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class ManpowerInfoExtend extends ManpowerInfo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private String ywxlbDisplay;

	public String getYwxlbDisplay() {
		return ywxlbDisplay;
	}

	public void setYwxlbDisplay(String ywxlbDisplay) {
		this.ywxlbDisplay = ywxlbDisplay;
	}

}

