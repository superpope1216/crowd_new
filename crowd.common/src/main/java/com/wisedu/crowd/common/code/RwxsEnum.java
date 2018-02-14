package com.wisedu.crowd.common.code;

/**
 * 任务形式
 * @author wisedu
 *
 */
public enum RwxsEnum {
	KF("1", "开发"),

	SS("2", "实施"),
	YWSJ("3","页面设计");
	
	private String code;

	private String name;

	RwxsEnum(String code, String name) {
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
