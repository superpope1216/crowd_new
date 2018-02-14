package com.wisedu.crowd.common.code;

public enum PtjyZtEnum {
	/**
	 * 待处理
	 */
	DCL("1", "待处理"),
	/**
	 * 处理中
	 */
	CLZ("2", "处理中"),
	/**
	 * 已处理
	 */
	YCL("3","已处理"),
	/**
	 * 不处理
	 */
	BCL("4","不处理");
	private String code;

	private String name;

	PtjyZtEnum(String code, String name) {
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
