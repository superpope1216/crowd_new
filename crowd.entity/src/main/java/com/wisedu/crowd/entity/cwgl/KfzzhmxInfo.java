package com.wisedu.crowd.entity.cwgl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class KfzzhmxInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 
     */
    private String wid;

    /**
     * 
     */
    private String kfzid;

    /**
     * 
     */
    private String szlbid;

    /**
     * 
     */
    private String lyxmid;

    /**
     * 
     */
    private String fysm;

    /**
     * 
     */
    private BigDecimal je;

    /**
     * 
     */
    private BigDecimal zhye;

    /**
     * 
     */
    private BigDecimal djzje;

    /**
     * 
     */
    private String zfbzh;

    /**
     * 
     */
    private Date szsj;

    /**
     * 
     */
    private String zdid;

    /**
     * 
     */
    private String zdip;

    /**
     * 
     */
    private Short jyzt;

    /**
     * 
     */
    private String zzczrid;

    /**
     * 
     */
    private Date zzczsj;

    /**
     * 
     */
    private Short jszt;

    /**
     * 
     */
    private String xmzt;

    /**
     * 
     */
    private String jsry;

    /**
     * 
     */
    private String jssj;
    
    private BigDecimal ykgs;

    public BigDecimal getYkgs() {
		return ykgs;
	}

	public void setYkgs(BigDecimal ykgs) {
		this.ykgs = ykgs;
	}

	/**
     * 
     * @return WID 
     */
    public String getWid() {
        return wid;
    }

    /**
     * 
     * @param wid 
     */
    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    /**
     * 
     * @return KFZID 
     */
    public String getKfzid() {
        return kfzid;
    }

    /**
     * 
     * @param kfzid 
     */
    public void setKfzid(String kfzid) {
        this.kfzid = kfzid == null ? null : kfzid.trim();
    }

    /**
     * 
     * @return SZLBID 
     */
    public String getSzlbid() {
        return szlbid;
    }

    /**
     * 
     * @param szlbid 
     */
    public void setSzlbid(String szlbid) {
        this.szlbid = szlbid == null ? null : szlbid.trim();
    }

    /**
     * 
     * @return LYXMID 
     */
    public String getLyxmid() {
        return lyxmid;
    }

    /**
     * 
     * @param lyxmid 
     */
    public void setLyxmid(String lyxmid) {
        this.lyxmid = lyxmid == null ? null : lyxmid.trim();
    }

    /**
     * 
     * @return FYSM 
     */
    public String getFysm() {
        return fysm;
    }

    /**
     * 
     * @param fysm 
     */
    public void setFysm(String fysm) {
        this.fysm = fysm == null ? null : fysm.trim();
    }

    /**
     * 
     * @return JE 
     */
    public BigDecimal getJe() {
        return je;
    }

    /**
     * 
     * @param je 
     */
    public void setJe(BigDecimal je) {
        this.je = je;
    }

    /**
     * 
     * @return ZHYE 
     */
    public BigDecimal getZhye() {
        return zhye;
    }

    /**
     * 
     * @param zhye 
     */
    public void setZhye(BigDecimal zhye) {
        this.zhye = zhye;
    }

    /**
     * 
     * @return DJZJE 
     */
    public BigDecimal getDjzje() {
        return djzje;
    }

    /**
     * 
     * @param djzje 
     */
    public void setDjzje(BigDecimal djzje) {
        this.djzje = djzje;
    }

    /**
     * 
     * @return ZFBZH 
     */
    public String getZfbzh() {
        return zfbzh;
    }

    /**
     * 
     * @param zfbzh 
     */
    public void setZfbzh(String zfbzh) {
        this.zfbzh = zfbzh == null ? null : zfbzh.trim();
    }

    /**
     * 
     * @return SZSJ 
     */
    public Date getSzsj() {
        return szsj;
    }

    /**
     * 
     * @param szsj 
     */
    public void setSzsj(Date szsj) {
        this.szsj = szsj;
    }

    /**
     * 
     * @return ZDID 
     */
    public String getZdid() {
        return zdid;
    }

    /**
     * 
     * @param zdid 
     */
    public void setZdid(String zdid) {
        this.zdid = zdid == null ? null : zdid.trim();
    }

    /**
     * 
     * @return ZDIP 
     */
    public String getZdip() {
        return zdip;
    }

    /**
     * 
     * @param zdip 
     */
    public void setZdip(String zdip) {
        this.zdip = zdip == null ? null : zdip.trim();
    }

    /**
     * 
     * @return JYZT 
     */
    public Short getJyzt() {
        return jyzt;
    }

    /**
     * 
     * @param jyzt 
     */
    public void setJyzt(Short jyzt) {
        this.jyzt = jyzt;
    }

    /**
     * 
     * @return ZZCZRID 
     */
    public String getZzczrid() {
        return zzczrid;
    }

    /**
     * 
     * @param zzczrid 
     */
    public void setZzczrid(String zzczrid) {
        this.zzczrid = zzczrid == null ? null : zzczrid.trim();
    }

    /**
     * 
     * @return ZZCZSJ 
     */
    public Date getZzczsj() {
        return zzczsj;
    }

    /**
     * 
     * @param zzczsj 
     */
    public void setZzczsj(Date zzczsj) {
        this.zzczsj = zzczsj;
    }

    /**
     * 
     * @return JSZT 
     */
    public Short getJszt() {
        return jszt;
    }

    /**
     * 
     * @param jszt 
     */
    public void setJszt(Short jszt) {
        this.jszt = jszt;
    }

    /**
     * 
     * @return XMZT 
     */
    public String getXmzt() {
        return xmzt;
    }

    /**
     * 
     * @param xmzt 
     */
    public void setXmzt(String xmzt) {
        this.xmzt = xmzt == null ? null : xmzt.trim();
    }

    /**
     * 
     * @return JSRY 
     */
    public String getJsry() {
        return jsry;
    }

    /**
     * 
     * @param jsry 
     */
    public void setJsry(String jsry) {
        this.jsry = jsry == null ? null : jsry.trim();
    }

    /**
     * 
     * @return JSSJ 
     */
    public String getJssj() {
        return jssj;
    }

    /**
     * 
     * @param jssj 
     */
    public void setJssj(String jssj) {
        this.jssj = jssj == null ? null : jssj.trim();
    }

    /**
     *
     * @mbggenerated 2017-12-04
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", kfzid=").append(kfzid);
        sb.append(", szlbid=").append(szlbid);
        sb.append(", lyxmid=").append(lyxmid);
        sb.append(", fysm=").append(fysm);
        sb.append(", je=").append(je);
        sb.append(", zhye=").append(zhye);
        sb.append(", djzje=").append(djzje);
        sb.append(", zfbzh=").append(zfbzh);
        sb.append(", szsj=").append(szsj);
        sb.append(", zdid=").append(zdid);
        sb.append(", zdip=").append(zdip);
        sb.append(", jyzt=").append(jyzt);
        sb.append(", zzczrid=").append(zzczrid);
        sb.append(", zzczsj=").append(zzczsj);
        sb.append(", jszt=").append(jszt);
        sb.append(", xmzt=").append(xmzt);
        sb.append(", jsry=").append(jsry);
        sb.append(", jssj=").append(jssj);
        sb.append("]");
        return sb.toString();
    }
}