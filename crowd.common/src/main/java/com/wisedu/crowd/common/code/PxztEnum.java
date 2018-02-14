package com.wisedu.crowd.common.code;

public enum PxztEnum {
	/**
	 * 待确认
	 */
	WTJ("0", "未提交"),
	/**
	 * 开发中
	 */
	DSL("1", "待受理"),
	/**
	 * 待验收
	 */
	YSL("2","已受理"),
	/**
	 * 已完成
	 */
	YJJ("3","已拒绝");
	private String code;

	private String name;

	PxztEnum(String code, String name) {
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
