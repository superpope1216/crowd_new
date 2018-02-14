package com.wisedu.crowd.common.code;

/**
 * 任务状态变更类型
 * @author wisedu
 *
 */
public enum RwztblTypeEnum {
	HAND("1", "手动验收/售后"),

	AUTO("2", "自动验收/售后"),
	
	REBACK("3","需求方收回需求"),
	DELETE("4","需求方删除需求");
	private String code;

	private String name;

	RwztblTypeEnum(String code, String name) {
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
