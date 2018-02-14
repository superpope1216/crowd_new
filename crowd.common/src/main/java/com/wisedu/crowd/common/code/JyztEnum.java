package com.wisedu.crowd.common.code;
/**
 * 交易状态
 * @author wisedu
 *
 */
public enum JyztEnum {
	/**
	 * 待处理
	 */
	DCL("0", "待处理"),
	/**
	 * 交易成功
	 */
	YZB("1", "交易成功"),
	/**
	 * 交易失败
	 */
	WZB("2","交易失败")	;
	private String code;

	private String name;

	JyztEnum(String code, String name) {
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
