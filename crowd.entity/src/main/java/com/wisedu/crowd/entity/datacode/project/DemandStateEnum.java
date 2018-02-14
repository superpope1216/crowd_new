package com.wisedu.crowd.entity.datacode.project;

public enum DemandStateEnum {

	CG(0,"草稿"),
	DSH(1,"待审核"),
	SHBTG(2,"审核不通过"),
	ZBZ(3,"招标中"),
	KFZ(4,"开发中"),
	JCZ(5,"检测中"),
	JCBTG(6,"检测不通过"),
	JCTG(7,"检测通过"),
	YSZ(8,"验收中"),
	YSBTG(9,"验收不通过"),
	SHZ(10,"售后中"),
	SHJSDQR(11,"售后结束待确认"),
	SHJSBTG(12,"售后结束不通过"),
	DPJ(13,"待评价"),
	YJX(14,"已结项"),
	YZZ(15,"已终止"),
	YGB(16,"已关闭");
	private int code;
	
	private String name;
	DemandStateEnum(int code,String name){
		this.code=code;
		this.name=name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

