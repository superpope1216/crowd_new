package com.wisedu.crowd.common.code;
/**
 * 收支类别
 * @author wisedu
 *
 */
public enum SzlbEnum {
	/**
	 * 充值
	 */
	CZ("0", "充值"),
	/**
	 * 提现
	 */
	TX("1", "提现"),
	/**
	 * 平台托管
	 */
	PTTG("2","平台托管"),
	/**
	 * 项目收入
	 */
	XMSR("3","项目收入"),
	/**
	 * 项目支付
	 */
	XMZF("4","项目支付");
	private String code;

	private String name;

	SzlbEnum(String code, String name) {
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
