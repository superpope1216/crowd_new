package com.wisedu.crowd.entity.train.extend;

import java.io.Serializable;
import java.math.BigDecimal;

import com.wisedu.crowd.entity.train.TrainBasicInfo;

public class TrainBasicInfoExtend extends TrainBasicInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String sqrDisplay;

	private String pxkcDisplay;

	private String pxrsDisplay;

	private String sfwxspxDisplay;

	private String pxztDisplay;

	private String pxlxDisplay;
	/**
	 * 培训周期
	 */
	private String pxzq;


	private String bmztDisplay;

	/**
	 * 培训开始时间
	 */
	private String pxkssj;

	/**
	 * 培训结束时间
	 */
	private String pxjssj;

	/**
	 * 报名开始时间
	 */
	private String bmkssj;
	
	private Boolean needBmCount;
	
	private Integer bmCount;

	public Boolean getNeedBmCount() {
		return needBmCount;
	}

	public void setNeedBmCount(Boolean needBmCount) {
		this.needBmCount = needBmCount;
	}
	public Integer getBmCount() {
		return bmCount;
	}

	public void setBmCount(Integer bmCount) {
		this.bmCount = bmCount;
	}

	/**
	 * 报名结束时间
	 */
	private String bmjssj;
	public String getBmztDisplay() {
		return bmztDisplay;
	}

	public void setBmztDisplay(String bmztDisplay) {
		this.bmztDisplay = bmztDisplay;
	}

	public String getPxzq() {
		return pxzq;
	}

	public void setPxzq(String pxzq) {
		this.pxzq = pxzq;
	}

	public String getPxkssj() {
		return pxkssj;
	}

	public void setPxkssj(String pxkssj) {
		this.pxkssj = pxkssj;
	}

	public String getPxjssj() {
		return pxjssj;
	}

	public void setPxjssj(String pxjssj) {
		this.pxjssj = pxjssj;
	}

	public String getBmkssj() {
		return bmkssj;
	}

	public void setBmkssj(String bmkssj) {
		this.bmkssj = bmkssj;
	}

	public String getBmjssj() {
		return bmjssj;
	}

	public void setBmjssj(String bmjssj) {
		this.bmjssj = bmjssj;
	}

	public String getPxlxDisplay() {
		return pxlxDisplay;
	}

	public void setPxlxDisplay(String pxlxDisplay) {
		this.pxlxDisplay = pxlxDisplay;
	}

	public String getSqrDisplay() {
		return sqrDisplay;
	}

	public void setSqrDisplay(String sqrDisplay) {
		this.sqrDisplay = sqrDisplay;
	}

	public String getPxkcDisplay() {
		return pxkcDisplay;
	}

	public void setPxkcDisplay(String pxkcDisplay) {
		this.pxkcDisplay = pxkcDisplay;
	}

	public String getPxrsDisplay() {
		return pxrsDisplay;
	}

	public void setPxrsDisplay(String pxrsDisplay) {
		this.pxrsDisplay = pxrsDisplay;
	}

	public String getSfwxspxDisplay() {
		return sfwxspxDisplay;
	}

	public void setSfwxspxDisplay(String sfwxspxDisplay) {
		this.sfwxspxDisplay = sfwxspxDisplay;
	}

	public String getPxztDisplay() {
		return pxztDisplay;
	}

	public void setPxztDisplay(String pxztDisplay) {
		this.pxztDisplay = pxztDisplay;
	}

}