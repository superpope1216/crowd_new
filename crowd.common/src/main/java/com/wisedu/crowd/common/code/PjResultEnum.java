package com.wisedu.crowd.common.code;

public enum PjResultEnum {
	/**
	 * 优秀
	 */
	YX("0", "优秀"),
	/**
	 * 良好
	 */
	LH("1", "良好"),
	/**
	 * 差
	 */
	CHA("2","差")	;
	private String code;

	private String name;

	PjResultEnum(String code, String name) {
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
