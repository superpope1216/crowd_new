/**
 * Project Name:crowd-entity
 * File Name:UserExamineStateEnum.java
 * Package Name:com.wisedu.crowd.entity.datacode.user
 * Date:2017年8月29日下午2:25:45
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.entity.datacode.user;

/**
 * 用户 申请状态 ClassName: UserApplyStateEnum <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年8月29日 下午7:34:14 <br/>
 *
 * @author 11651
 * @version
 * @since JDK 1.6
 */
public enum UserApplyStateEnum {

	/**
	 * 草稿
	 */
	CG("1", "草稿"),
	/**
	 * 待审核
	 */
	DSH("2", "待审核"),
	/**
	 * 审核通过
	 */
	SHTG("3", "审核通过"),
	/**
	 * 审核不通过
	 */
	SHBTG("4", "审核不通过");

	private String	code;

	private String	name;

	UserApplyStateEnum(String code, String name) {
		this.code = code;
		this.name = name;
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
