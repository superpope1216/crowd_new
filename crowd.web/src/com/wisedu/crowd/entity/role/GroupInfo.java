package com.wisedu.crowd.entity.role;

import java.math.BigDecimal;

public class GroupInfo {
    /**
     * null
     */
    private String wid;

    /**
     * null
     */
    private String name;

    /**
     * null
     */
    private String bm;

    /**
     * null
     */
    private Short sfdtyhz;

    /**
     * null
     */
    private BigDecimal sfsy;

    /**
     * null
     */
    private BigDecimal px;

    /**
     * null
     */
    private String ms;

    /**
     * null
     */
    private String dtsql;

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
     * @return NAME null
     */
    public String getName() {
        return name;
    }

    /**
     * null
     * @param name null
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * null
     * @return BM null
     */
    public String getBm() {
        return bm;
    }

    /**
     * null
     * @param bm null
     */
    public void setBm(String bm) {
        this.bm = bm == null ? null : bm.trim();
    }

    /**
     * null
     * @return SFDTYHZ null
     */
    public Short getSfdtyhz() {
        return sfdtyhz;
    }

    /**
     * null
     * @param sfdtyhz null
     */
    public void setSfdtyhz(Short sfdtyhz) {
        this.sfdtyhz = sfdtyhz;
    }

    /**
     * null
     * @return SFSY null
     */
    public BigDecimal getSfsy() {
        return sfsy;
    }

    /**
     * null
     * @param sfsy null
     */
    public void setSfsy(BigDecimal sfsy) {
        this.sfsy = sfsy;
    }

    /**
     * null
     * @return PX null
     */
    public BigDecimal getPx() {
        return px;
    }

    /**
     * null
     * @param px null
     */
    public void setPx(BigDecimal px) {
        this.px = px;
    }

    /**
     * null
     * @return MS null
     */
    public String getMs() {
        return ms;
    }

    /**
     * null
     * @param ms null
     */
    public void setMs(String ms) {
        this.ms = ms == null ? null : ms.trim();
    }

    /**
     * null
     * @return DTSQL null
     */
    public String getDtsql() {
        return dtsql;
    }

    /**
     * null
     * @param dtsql null
     */
    public void setDtsql(String dtsql) {
        this.dtsql = dtsql == null ? null : dtsql.trim();
    }

    /**
     *
     * @mbggenerated 2018-02-06
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", name=").append(name);
        sb.append(", bm=").append(bm);
        sb.append(", sfdtyhz=").append(sfdtyhz);
        sb.append(", sfsy=").append(sfsy);
        sb.append(", px=").append(px);
        sb.append(", ms=").append(ms);
        sb.append(", dtsql=").append(dtsql);
        sb.append("]");
        return sb.toString();
    }
}