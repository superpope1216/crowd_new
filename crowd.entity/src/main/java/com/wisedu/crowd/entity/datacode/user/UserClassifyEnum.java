package com.wisedu.crowd.entity.datacode.user;

public enum UserClassifyEnum {

	DEVELOPER("1","开发者"),
	DEMAND("2","需求方"),
	ALL("3","全部");
	private String code;
	
	private String name;
	UserClassifyEnum(String code,String name){
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
