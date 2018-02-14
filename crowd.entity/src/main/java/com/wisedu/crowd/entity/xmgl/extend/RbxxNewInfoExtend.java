package com.wisedu.crowd.entity.xmgl.extend;

import java.io.Serializable;

import com.wisedu.crowd.entity.xmgl.RbxxNewInfo;


public class RbxxNewInfoExtend extends RbxxNewInfo implements Serializable{
	
	  private static final long serialVersionUID = 1L;
	  
	  private String sjdDisplay;

	public String getSjdDisplay() {
		return sjdDisplay;
	}

	public void setSjdDisplay(String sjdDisplay) {
		this.sjdDisplay = sjdDisplay;
	}
	  
	  

}
