package com.wisedu.crowd.entity.data;

import java.math.BigDecimal;

public class DataDelayInfo {
    /**
     * null
     */
    private String wid;

    /**
     * null
     */
    private String rwid;

    /**
     * null
     */
    private String kfzid;

    /**
     * null
     */
    private String xqfid;

    /**
     * null
     */
    private String month;

    /**
     * null
     */
    private BigDecimal delayDay;

    /**
     * null
     */
    private String jfrq;

    /**
     * null
     */
    private String sqyssj;

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
     * @return RWID null
     */
    public String getRwid() {
        return rwid;
    }

    /**
     * null
     * @param rwid null
     */
    public void setRwid(String rwid) {
        this.rwid = rwid == null ? null : rwid.trim();
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
     * @return XQFID null
     */
    public String getXqfid() {
        return xqfid;
    }

    /**
     * null
     * @param xqfid null
     */
    public void setXqfid(String xqfid) {
        this.xqfid = xqfid == null ? null : xqfid.trim();
    }

    /**
     * null
     * @return MONTH null
     */
    public String getMonth() {
        return month;
    }

    /**
     * null
     * @param month null
     */
    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    /**
     * null
     * @return DELAY_DAY null
     */
    public BigDecimal getDelayDay() {
        return delayDay;
    }

    /**
     * null
     * @param delayDay null
     */
    public void setDelayDay(BigDecimal delayDay) {
        this.delayDay = delayDay;
    }

    /**
     * null
     * @return JFRQ null
     */
    public String getJfrq() {
        return jfrq;
    }

    /**
     * null
     * @param jfrq null
     */
    public void setJfrq(String jfrq) {
        this.jfrq = jfrq == null ? null : jfrq.trim();
    }

    /**
     * null
     * @return SQYSSJ null
     */
    public String getSqyssj() {
        return sqyssj;
    }

    /**
     * null
     * @param sqyssj null
     */
    public void setSqyssj(String sqyssj) {
        this.sqyssj = sqyssj == null ? null : sqyssj.trim();
    }

    /**
     *
     * @mbggenerated 2018-02-08
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", rwid=").append(rwid);
        sb.append(", kfzid=").append(kfzid);
        sb.append(", xqfid=").append(xqfid);
        sb.append(", month=").append(month);
        sb.append(", delayDay=").append(delayDay);
        sb.append(", jfrq=").append(jfrq);
        sb.append(", sqyssj=").append(sqyssj);
        sb.append("]");
        return sb.toString();
    }
}