package com.wisedu.crowd.entity.rwgl.extend;

import java.io.Serializable;

import com.wisedu.crowd.entity.rwgl.RwtbxxInfo;

public class RwtbxxInfoExtend extends RwtbxxInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String zbztDisplay;
	
	private String kfzXm;
	
	private String kfzNc;
	
	/**
	 * 开发者类别
	 */
	private String kfzlb;
	/**
	 * 是否有团队
	 */
	private String sfytd;
	/**
	 * 保密时间
	 */
	private String bmsj;
	
	private String sjh;
	
	private String qq;
	
	private String grzpfjid;
	
	private int score;
	

	public String getKfzlb() {
		return kfzlb;
	}

	public void setKfzlb(String kfzlb) {
		this.kfzlb = kfzlb;
	}

	public String getSfytd() {
		return sfytd;
	}

	public void setSfytd(String sfytd) {
		this.sfytd = sfytd;
	}

	public String getBmsj() {
		return bmsj;
	}

	public void setBmsj(String bmsj) {
		this.bmsj = bmsj;
	}

	public String getSjh() {
		return sjh;
	}

	public void setSjh(String sjh) {
		this.sjh = sjh;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getKfzXm() {
		return kfzXm;
	}

	public void setKfzXm(String kfzXm) {
		this.kfzXm = kfzXm;
	}

	public String getKfzNc() {
		return kfzNc;
	}

	public void setKfzNc(String kfzNc) {
		this.kfzNc = kfzNc;
	}

	public String getZbztDisplay() {
		return zbztDisplay;
	}

	public void setZbztDisplay(String zbztDisplay) {
		this.zbztDisplay = zbztDisplay;
	}

	public String getGrzpfjid() {
		return grzpfjid;
	}

	public void setGrzpfjid(String grzpfjid) {
		this.grzpfjid = grzpfjid;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	

}
