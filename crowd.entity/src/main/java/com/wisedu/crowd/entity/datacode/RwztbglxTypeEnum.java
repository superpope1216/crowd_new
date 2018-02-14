package com.wisedu.crowd.entity.datacode;

/**
 * 任务状态变更类型
 * 
 * @author wisedu
 *
 */
public enum RwztbglxTypeEnum {
	HAND("0", "手动"), AUTO("1", "自动");
	private String code;

	private String name;

	RwztbglxTypeEnum(String code, String name) {
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
