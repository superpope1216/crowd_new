package com.wisedu.crowd.entity.statics.extend;

import java.io.Serializable;

import com.wisedu.crowd.entity.statics.KfzAreaDataInfo;

public class KfzAreaDataInfoExtend extends KfzAreaDataInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String areaDisplay;

	public String getAreaDisplay() {
		return areaDisplay;
	}

	public void setAreaDisplay(String areaDisplay) {
		this.areaDisplay = areaDisplay;
	}

}
