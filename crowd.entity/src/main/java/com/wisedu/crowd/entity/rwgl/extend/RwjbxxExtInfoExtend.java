package com.wisedu.crowd.entity.rwgl.extend;

import java.io.Serializable;
import com.wisedu.crowd.entity.rwgl.RwjbxxExtInfo;

public class RwjbxxExtInfoExtend extends RwjbxxExtInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String xmmc;
	
	private String ssxx;
	
	private String ywxbm_display;
	
	private String mkbhDisplay;

	public String getXmmc() {
		return xmmc;
	}

	public void setXmmc(String xmmc) {
		this.xmmc = xmmc;
	}

	public String getSsxx() {
		return ssxx;
	}

	public void setSsxx(String ssxx) {
		this.ssxx = ssxx;
	}

	public String getYwxbm_display() {
		return ywxbm_display;
	}

	public void setYwxbm_display(String ywxbm_display) {
		this.ywxbm_display = ywxbm_display;
	}

	public String getMkbhDisplay() {
		return mkbhDisplay;
	}

	public void setMkbhDisplay(String mkbhDisplay) {
		this.mkbhDisplay = mkbhDisplay;
	}
   
}