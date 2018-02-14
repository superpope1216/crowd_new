package com.wisedu.crowd.common.code;

public enum RwlbEnum {
	/**
	 * 待评标
	 */
	ALL("1", "全部"),
	/**
	 * 已中标
	 */
	NB("2", "仅金智教育员工可投标"),
	/**
	 * 未评标
	 */
	WB("3","仅外部员工可投标");
	private String code;

	private String name;

	RwlbEnum(String code, String name) {
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
