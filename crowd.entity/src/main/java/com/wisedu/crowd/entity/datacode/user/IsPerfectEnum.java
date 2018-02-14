package com.wisedu.crowd.entity.datacode.user;

public enum IsPerfectEnum {

	NOPERFECT("0","未完善"),
	ALREADYPERFECT("1","已完善");

	private String code;
	private String name;
	IsPerfectEnum(String code,String name){
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
