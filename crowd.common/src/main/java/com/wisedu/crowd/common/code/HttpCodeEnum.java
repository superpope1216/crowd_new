/**
 * Project Name:service
 * File Name:HttpCodeEnum.java
 * Package Name:com.wisedu.crowd.state
 * Date:2017年8月10日下午5:23:39
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.common.code;

/**
 * ClassName:HttpCodeEnum <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年8月10日 下午5:23:39 <br/>
 * 
 * @author de
 * @version
 * @since JDK 1.6
 * @see
 */
public enum HttpCodeEnum {

	/**
	 * 有效
	 */
	SUCCESS(0, "服务查询成功"),
	/**
	 * 无效
	 */
	FAIL(-1, "服务查询失败"),
	/**
	 * 登录失败
	 */
	LOGIN_FAIL(-2, "用户名/密码错误"),
	/**
	 * 用户注册失败
	 */
	REGISTER_FAIL(-3, "用户注册失败"),
	/**
	 * 手机号码已存在
	 */
	EXIST_PHONE(-4, "手机号码已存在，请重新输入!"),
	/**
	 * 昵称已存在
	 */
	EXIST_NICK_NAME(-5, "昵称已存在，请重新输入!"),
	/**
	 * 用户失效
	 */
	USER_INVALID(-6, "用户失效,请重新登录"),

	IS_NOT_XQF(-7, "不是需求方"),

	XQF_SFRZ_NOT_SUBMIT(-18, "需求方身份认证信息还未提交"),

	XQF_SFRZ_PASSING(-8, "需求方身份认证信息正在审核中"),

	XQF_SFRZ_NOT_PASS(-9, "需求方身份认证信息审核未通过"),

	NOT_LOGIN(-10, "未登录"), IS_NOT_KFZ(-11, "不是开发者"), KFZ_SFRZ_PASSING(-12, "开发者身份认证信息正在审核中"),

	KFZ_SFRZ_NOT_PASS(-13, "开发者身份认证信息审核未通过"),KFZ_SFRZ_NOT_SUBMIT(-14, "开发者身份认证信息还未提交"),
	
    EXIST_SFZ(-15, "身份证号码已存在,请重新输入!"),
    
    NULL_CAPTCHACODE(-16, "验证码不能为空，请重新输入!"),
	
	ERROR_CAPTCHACODE(-17, "验证码错误，请重新输入!"),
	
	EXIST_EMAIL(-18, "邮箱已存在，请重新输入!"),
	
	SAME_PHONE(-19, "手机号相同  不用修改!"),
	
	SAME_EMAIL(-20, "邮箱相同  不用修改!"),
	
	NOT_EXIST_PHONE(-21, "手机号码不存在,请重新输入!");

	
	public int code;
	private String name;

	HttpCodeEnum(int code, String name) {
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
