package com.wisedu.crowd.entity.datacode;

public enum OperateTypeEnum {

	ADD("1","添加"),
	UPDATE("2","更新"),
	DELETE("3","删除");

	private String code;
	private String name;
	OperateTypeEnum(String code,String name){
		this.code=code;
		this.name=name;
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
