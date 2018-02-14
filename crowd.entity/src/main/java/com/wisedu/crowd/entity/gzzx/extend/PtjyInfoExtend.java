package com.wisedu.crowd.entity.gzzx.extend;

import java.io.Serializable;

import com.wisedu.crowd.entity.gzzx.PtjyInfo;

public class PtjyInfoExtend extends PtjyInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String ztDisplay;

	public String getZtDisplay() {
		return ztDisplay;
	}

	public void setZtDisplay(String ztDisplay) {
		this.ztDisplay = ztDisplay;
	}

}
