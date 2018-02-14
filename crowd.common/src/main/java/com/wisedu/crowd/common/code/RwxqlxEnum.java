package com.wisedu.crowd.common.code;

/**
 * 任务是需求还是BUG类型
 * @author wisedu
 *
 */
public enum RwxqlxEnum {
	XQ("1", "需求"),

	BUG("2", "BUG");
	private String code;

	private String name;

	RwxqlxEnum(String code, String name) {
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
