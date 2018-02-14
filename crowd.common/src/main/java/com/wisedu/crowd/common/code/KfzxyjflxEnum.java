/**
 * Project Name:crowd.common
 * File Name:XyjflxEnum.java
 * Package Name:com.wisedu.crowd.common.code
 * Date:2018年1月24日上午11:20:25
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.common.code;
/**
 * 开发者信誉积分类型
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public enum KfzxyjflxEnum {

	/**
	 * BUG得分
	 */
	BUGDF("1", -5, "BUG得分"),
	/**
	 * 延期得分
	 */
	YQDF("2", -3, "延期得分"),
	/**
	 * 第一次验收通过
	 */
	DYCYSTG("3", 1, "第一次验收通过"),
	/**
	 * 第一次验收不通过
	 */
	DYCYSBTG("4", -2, "第一次验收不通过"),
	/**
	 * 多次验收不通过
	 */
	DCYSBTG("5", -5, "多次验收不通过"),
	/**
	 * 第一次售后通过
	 */
	DYCSHTG("6", 1, "第一次售后通过"),
	/**
	 * 第一次售后不通过
	 */
	DYCSHBTG("7", -2, "第一次售后不通过"),
	/**
	 * 多次售后不通过
	 */
	DCSHBTG("8", -5, "多次售后不通过"),
	/**
	 * 好评得分
	 */
	HPDF("9", 2, "好评得分"),
	/**
	 * 中评得分
	 */
	ZPDF("10", 0, "中评得分"),
	/**
	 * 差评得分
	 */
	CPDF("11", -5, "差评得分"),
	/**
	 * 投诉得分
	 */
	TSDF("12", -10, "投诉得分");
	
	private String code;
	
	private int score;
	
	private String name;
	
	KfzxyjflxEnum(String code, int score, String name){
		this.code = code;
		this.score = score;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

