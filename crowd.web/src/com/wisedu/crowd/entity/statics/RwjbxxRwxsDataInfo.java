package com.wisedu.crowd.entity.statics;

import java.math.BigDecimal;

public class RwjbxxRwxsDataInfo {
    /**
     * null
     */
    private String wid;

    /**
     * null
     */
    private String kfxs;

    /**
     * null
     */
    private BigDecimal fbrws;

    /**
     * null
     */
    private BigDecimal fbrwje;

    /**
     * null
     */
    private BigDecimal wgrws;

    /**
     * null
     */
    private BigDecimal wgrwje;

    /**
     * null
     */
    private String year;

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
     * @return KFXS null
     */
    public String getKfxs() {
        return kfxs;
    }

    /**
     * null
     * @param kfxs null
     */
    public void setKfxs(String kfxs) {
        this.kfxs = kfxs == null ? null : kfxs.trim();
    }

    /**
     * null
     * @return FBRWS null
     */
    public BigDecimal getFbrws() {
        return fbrws;
    }

    /**
     * null
     * @param fbrws null
     */
    public void setFbrws(BigDecimal fbrws) {
        this.fbrws = fbrws;
    }

    /**
     * null
     * @return FBRWJE null
     */
    public BigDecimal getFbrwje() {
        return fbrwje;
    }

    /**
     * null
     * @param fbrwje null
     */
    public void setFbrwje(BigDecimal fbrwje) {
        this.fbrwje = fbrwje;
    }

    /**
     * null
     * @return WGRWS null
     */
    public BigDecimal getWgrws() {
        return wgrws;
    }

    /**
     * null
     * @param wgrws null
     */
    public void setWgrws(BigDecimal wgrws) {
        this.wgrws = wgrws;
    }

    /**
     * null
     * @return WGRWJE null
     */
    public BigDecimal getWgrwje() {
        return wgrwje;
    }

    /**
     * null
     * @param wgrwje null
     */
    public void setWgrwje(BigDecimal wgrwje) {
        this.wgrwje = wgrwje;
    }

    /**
     * null
     * @return YEAR null
     */
    public String getYear() {
        return year;
    }

    /**
     * null
     * @param year null
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
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
        sb.append(", kfxs=").append(kfxs);
        sb.append(", fbrws=").append(fbrws);
        sb.append(", fbrwje=").append(fbrwje);
        sb.append(", wgrws=").append(wgrws);
        sb.append(", wgrwje=").append(wgrwje);
        sb.append(", year=").append(year);
        sb.append("]");
        return sb.toString();
    }
}