/**
 * Project Name:crowd.entity
 * File Name:KfzxyjfxqInfoExtend.java
 * Package Name:com.wisedu.crowd.entity.yhgl.extend
 * Date:2018年1月25日上午9:28:05
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.entity.yhgl.extend;

import java.io.Serializable;
import java.util.List;

import com.wisedu.crowd.entity.yhgl.KfzxyjfxqInfo;

/**
 * ClassName:KfzxyjfxqInfoExtend <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月25日 上午9:28:05 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class KfzxyjfxqInfoExtend extends KfzxyjfxqInfo implements Serializable{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> scoreClassifys;

	public List<String> getScoreClassifys() {
		return scoreClassifys;
	}

	public void setScoreClassifys(List<String> scoreClassifys) {
		this.scoreClassifys = scoreClassifys;
	}

}

