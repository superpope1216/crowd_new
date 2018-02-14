package com.wisedu.crowd.entity.statics;

import java.io.Serializable;
import java.math.BigDecimal;

public class KfzxxData implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * wid
     */
    private String wid;

    /**
     * 开发者ID
     */
    private String kfzid;

    /**
     * 参与项目数
     */
    private BigDecimal cyxm;

    /**
     * 平台认证技能类别
     */
    private String ptrzjn;

    /**
     * 平台认证技能等级
     */
    private String ptrzdj;

    /**
     * 总收入
     */
    private BigDecimal zsr;

    /**
     * 总得分
     */
    private BigDecimal zdf;

    /**
     * 投标数
     */
    private BigDecimal tbs;

   

    /**
     * null
     * @return WID null
     */
    public String getWid() {
        return wid;
    }

    /**
     * null
     * @param wid null
     */
    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    /**
     * null
     * @return KFZID null
     */
    public String getKfzid() {
        return kfzid;
    }

    /**
     * null
     * @param kfzid null
     */
    public void setKfzid(String kfzid) {
        this.kfzid = kfzid == null ? null : kfzid.trim();
    }

    /**
     * null
     * @return CYXM null
     */
    public BigDecimal getCyxm() {
        return cyxm;
    }

    /**
     * null
     * @param cyxm null
     */
    public void setCyxm(BigDecimal cyxm) {
        this.cyxm = cyxm;
    }

    /**
     * null
     * @return PTRZJN null
     */
    public String getPtrzjn() {
        return ptrzjn;
    }

    /**
     * null
     * @param ptrzjn null
     */
    public void setPtrzjn(String ptrzjn) {
        this.ptrzjn = ptrzjn == null ? null : ptrzjn.trim();
    }

    /**
     * null
     * @return PTRZDJ null
     */
    public String getPtrzdj() {
        return ptrzdj;
    }

    /**
     * null
     * @param ptrzdj null
     */
    public void setPtrzdj(String ptrzdj) {
        this.ptrzdj = ptrzdj == null ? null : ptrzdj.trim();
    }

    /**
     * null
     * @return ZSR null
     */
    public BigDecimal getZsr() {
        return zsr;
    }

    /**
     * null
     * @param zsr null
     */
    public void setZsr(BigDecimal zsr) {
        this.zsr = zsr;
    }

    /**
     * null
     * @return ZDF null
     */
    public BigDecimal getZdf() {
        return zdf;
    }

    /**
     * null
     * @param zdf null
     */
    public void setZdf(BigDecimal zdf) {
        this.zdf = zdf;
    }

    /**
     * null
     * @return TBS null
     */
    public BigDecimal getTbs() {
        return tbs;
    }

    /**
     * null
     * @param tbs null
     */
    public void setTbs(BigDecimal tbs) {
        this.tbs = tbs;
    }

   
    /**
     *
     * @mbggenerated 2018-01-24
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", kfzid=").append(kfzid);
        sb.append(", cyxm=").append(cyxm);
        sb.append(", ptrzjn=").append(ptrzjn);
        sb.append(", ptrzdj=").append(ptrzdj);
        sb.append(", zsr=").append(zsr);
        sb.append(", zdf=").append(zdf);
        sb.append(", tbs=").append(tbs);
        sb.append("]");
        return sb.toString();
    }
}