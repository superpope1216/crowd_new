package com.wisedu.crowd.entity.gzzx.extend;

import java.io.Serializable;

import com.wisedu.crowd.entity.gzzx.JnjyInfo;

public class JnjyInfoExtend extends JnjyInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
     * 技能类型
     */
    private String jnlxDisplay;
    private String ztDisplay;
	public String getJnlxDisplay() {
		return jnlxDisplay;
	}
	public void setJnlxDisplay(String jnlxDisplay) {
		this.jnlxDisplay = jnlxDisplay;
	}
	public String getZtDisplay() {
		return ztDisplay;
	}
	public void setZtDisplay(String ztDisplay) {
		this.ztDisplay = ztDisplay;
	}
}
