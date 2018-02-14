package com.wisedu.crowd.common.code;
/**
 * 任务中标状态
 * @author wisedu
 *
 */
public enum RwtbztEnum {
	/**
	 * 待评标
	 */
	DPB("0", "待评标"),
	/**
	 * 已中标
	 */
	YZB("1", "已中标"),
	/**
	 * 未评标
	 */
	WZB("2","未评标")	;
	private String code;

	private String name;

	RwtbztEnum(String code, String name) {
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
