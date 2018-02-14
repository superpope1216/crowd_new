package com.wisedu.crowd.entity.yhgl;

import java.io.Serializable;

import javax.validation.constraints.Max;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class YhjbxxExtInfo implements Serializable{
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
    @NotEmpty
    private String yhid;

    /**
     * 
     */
    @NotEmpty
    @Length(max=20)
    private String szdq;

    /**
     * 
     */
    @NotEmpty
    @Length(max=60)
    private String nc;

    /**
     * 
     */
    @Length(max=20)
    private String czsj;

    /**
     * 
     */
    @Length(max=20)
    private String czzip;

    /**
     * 微信号
     */
    @Length(max=40)
    private String wxh;

    /**
     * QQ号
     */
    @NotEmpty
    @Length(max=20)
    private String qq;

    /**
     * 出生日期
     */
    @NotEmpty
    @Length(max=20)
    private String csrq;

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
     * @return YHID 
     */
    public String getYhid() {
        return yhid;
    }

    /**
     * 
     * @param yhid 
     */
    public void setYhid(String yhid) {
        this.yhid = yhid == null ? null : yhid.trim();
    }

    /**
     * 
     * @return SZDQ 
     */
    public String getSzdq() {
        return szdq;
    }

    /**
     * 
     * @param szdq 
     */
    public void setSzdq(String szdq) {
        this.szdq = szdq == null ? null : szdq.trim();
    }

    /**
     * 
     * @return NC 
     */
    public String getNc() {
        return nc;
    }

    /**
     * 
     * @param nc 
     */
    public void setNc(String nc) {
        this.nc = nc == null ? null : nc.trim();
    }

    /**
     * 
     * @return CZSJ 
     */
    public String getCzsj() {
        return czsj;
    }

    /**
     * 
     * @param czsj 
     */
    public void setCzsj(String czsj) {
        this.czsj = czsj == null ? null : czsj.trim();
    }

    /**
     * 
     * @return CZZIP 
     */
    public String getCzzip() {
        return czzip;
    }

    /**
     * 
     * @param czzip 
     */
    public void setCzzip(String czzip) {
        this.czzip = czzip == null ? null : czzip.trim();
    }

    /**
     * 微信号
     * @return WXH 微信号
     */
    public String getWxh() {
        return wxh;
    }

    /**
     * 微信号
     * @param wxh 微信号
     */
    public void setWxh(String wxh) {
        this.wxh = wxh == null ? null : wxh.trim();
    }

    /**
     * QQ号
     * @return QQ QQ号
     */
    public String getQq() {
        return qq;
    }

    /**
     * QQ号
     * @param qq QQ号
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * 出生日期
     * @return CSRQ 出生日期
     */
    public String getCsrq() {
        return csrq;
    }

    /**
     * 出生日期
     * @param csrq 出生日期
     */
    public void setCsrq(String csrq) {
        this.csrq = csrq == null ? null : csrq.trim();
    }

    /**
     *
     * @mbggenerated 2017-11-04
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", yhid=").append(yhid);
        sb.append(", szdq=").append(szdq);
        sb.append(", nc=").append(nc);
        sb.append(", czsj=").append(czsj);
        sb.append(", czzip=").append(czzip);
        sb.append(", wxh=").append(wxh);
        sb.append(", qq=").append(qq);
        sb.append(", csrq=").append(csrq);
        sb.append("]");
        return sb.toString();
    }
}