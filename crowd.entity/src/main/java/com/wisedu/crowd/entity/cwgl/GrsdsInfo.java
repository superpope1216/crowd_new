package com.wisedu.crowd.entity.cwgl;

import java.io.Serializable;

public class GrsdsInfo implements Serializable{
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
    private Integer jexx;

    /**
     * 
     */
    private Integer jesx;

    /**
     * 
     */
    private Integer sl;

    /**
     * 
     */
    private Integer sskcf;

    /**
     * 
     */
    private Integer qzd;

    /**
     * 
     */
    private Integer sfsy;

    /**
     * 
     */
    private Integer px;

    /**
     * 
     * @return wid 
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
     * @return jexx 
     */
    public Integer getJexx() {
        return jexx;
    }

    /**
     * 
     * @param jexx 
     */
    public void setJexx(Integer jexx) {
        this.jexx = jexx;
    }

    /**
     * 
     * @return jesx 
     */
    public Integer getJesx() {
        return jesx;
    }

    /**
     * 
     * @param jesx 
     */
    public void setJesx(Integer jesx) {
        this.jesx = jesx;
    }

    /**
     * 
     * @return sl 
     */
    public Integer getSl() {
        return sl;
    }

    /**
     * 
     * @param sl 
     */
    public void setSl(Integer sl) {
        this.sl = sl;
    }

    /**
     * 
     * @return sskcf 
     */
    public Integer getSskcf() {
        return sskcf;
    }

    /**
     * 
     * @param sskcf 
     */
    public void setSskcf(Integer sskcf) {
        this.sskcf = sskcf;
    }

    /**
     * 
     * @return qzd 
     */
    public Integer getQzd() {
        return qzd;
    }

    /**
     * 
     * @param qzd 
     */
    public void setQzd(Integer qzd) {
        this.qzd = qzd;
    }

    /**
     * 
     * @return sfsy 
     */
    public Integer getSfsy() {
        return sfsy;
    }

    /**
     * 
     * @param sfsy 
     */
    public void setSfsy(Integer sfsy) {
        this.sfsy = sfsy;
    }

    /**
     * 
     * @return px 
     */
    public Integer getPx() {
        return px;
    }

    /**
     * 
     * @param px 
     */
    public void setPx(Integer px) {
        this.px = px;
    }

    /**
     *
     * @mbggenerated 2017-12-18
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", jexx=").append(jexx);
        sb.append(", jesx=").append(jesx);
        sb.append(", sl=").append(sl);
        sb.append(", sskcf=").append(sskcf);
        sb.append(", qzd=").append(qzd);
        sb.append(", sfsy=").append(sfsy);
        sb.append(", px=").append(px);
        sb.append("]");
        return sb.toString();
    }
}