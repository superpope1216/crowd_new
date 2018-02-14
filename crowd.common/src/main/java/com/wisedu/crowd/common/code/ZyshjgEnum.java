/**
 * Project Name:crowd.common
 * File Name:ZyshjgEnum.java
 * Package Name:com.wisedu.crowd.common.code
 * Date:2018年1月16日上午11:46:05
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.common.code;
/**
 * ClassName:ZyshjgEnum <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月16日 上午11:46:05 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public enum ZyshjgEnum {

	/**
	 * 待审核
	 */
	DSH(1, "待审核"),
	/**
	 * 通过
	 */
	TG(2, "通过"),
	/**
	 * 不通过
	 */
	BTG(3, "不通过");
	
	private int code;
	private String name;
	
	ZyshjgEnum(int code, String name){
		this.code = code;
		this.name= name;
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

