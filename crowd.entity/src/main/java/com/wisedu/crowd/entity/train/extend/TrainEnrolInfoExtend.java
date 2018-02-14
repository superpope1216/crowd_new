package com.wisedu.crowd.entity.train.extend;

import java.io.Serializable;
import java.util.List;

import com.wisedu.crowd.entity.train.TrainEnrolInfo;

public class TrainEnrolInfoExtend extends TrainEnrolInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * 学员姓名
	 */
	private List<Integer> bmzts;
	
	private List<Integer> yykhzts;
	
	private List<Integer> khjgs;
	
	private String pxrwbh;
	
	private String pxdd;
	
	private String pxkcDisplay;
	
	private String pxkssj;
	
	private String pxjssj;
	
	private String bmztDisplay;
	
	private String yykhztDisplay;
	
	private String khjgDisplay;
	
	private String jcnljcdz;
	
	private String nlpgDisplay;
	
	private String xm;
	
	private String sj;
	
	private String qq;
	
	private String minKhyf;
	
	private String maxKhyf;

    public String getMinKhyf() {
		return minKhyf;
	}

	public void setMinKhyf(String minKhyf) {
		this.minKhyf = minKhyf;
	}

	public String getMaxKhyf() {
		return maxKhyf;
	}

	public void setMaxKhyf(String maxKhyf) {
		this.maxKhyf = maxKhyf;
	}

	public List<Integer> getBmzts() {
        return bmzts;
    }

    public void setBmzts(List<Integer> bmzts) {
        this.bmzts = bmzts;
    }

    public List<Integer> getYykhzts() {
        return yykhzts;
    }

    public void setYykhzts(List<Integer> yykhzts) {
        this.yykhzts = yykhzts;
    }

    public List<Integer> getKhjgs() {
        return khjgs;
    }

    public void setKhjgs(List<Integer> khjgs) {
        this.khjgs = khjgs;
    }

    public String getPxrwbh() {
        return pxrwbh;
    }

    public void setPxrwbh(String pxrwbh) {
        this.pxrwbh = pxrwbh;
    }

    public String getPxdd() {
        return pxdd;
    }

    public void setPxdd(String pxdd) {
        this.pxdd = pxdd;
    }

    public String getPxkcDisplay() {
        return pxkcDisplay;
    }

    public void setPxkcDisplay(String pxkcDisplay) {
        this.pxkcDisplay = pxkcDisplay;
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

    public String getBmztDisplay() {
        return bmztDisplay;
    }

    public void setBmztDisplay(String bmztDisplay) {
        this.bmztDisplay = bmztDisplay;
    }

    public String getYykhztDisplay() {
        return yykhztDisplay;
    }

    public void setYykhztDisplay(String yykhztDisplay) {
        this.yykhztDisplay = yykhztDisplay;
    }

    public String getKhjgDisplay() {
        return khjgDisplay;
    }

    public void setKhjgDisplay(String khjgDisplay) {
        this.khjgDisplay = khjgDisplay;
    }

    public String getJcnljcdz() {
        return jcnljcdz;
    }

    public void setJcnljcdz(String jcnljcdz) {
        this.jcnljcdz = jcnljcdz;
    }

    public String getNlpgDisplay() {
        return nlpgDisplay;
    }

    public void setNlpgDisplay(String nlpgDisplay) {
        this.nlpgDisplay = nlpgDisplay;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getSj() {
        return sj;
    }

    public void setSj(String sj) {
        this.sj = sj;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
	
}