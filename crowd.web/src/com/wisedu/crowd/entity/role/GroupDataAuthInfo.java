package com.wisedu.crowd.entity.role;

public class GroupDataAuthInfo {
    /**
     * null
     */
    private String wid;

    /**
     * null
     */
    private String bm;

    /**
     * null
     */
    private String content;

    /**
     * null
     */
    private Short sfsy;

    /**
     * null
     */
    private Short px;

    /**
     * null
     */
    private String mc;

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
     * @return CONTENT null
     */
    public String getContent() {
        return content;
    }

    /**
     * null
     * @param content null
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * null
     * @return SFSY null
     */
    public Short getSfsy() {
        return sfsy;
    }

    /**
     * null
     * @param sfsy null
     */
    public void setSfsy(Short sfsy) {
        this.sfsy = sfsy;
    }

    /**
     * null
     * @return PX null
     */
    public Short getPx() {
        return px;
    }

    /**
     * null
     * @param px null
     */
    public void setPx(Short px) {
        this.px = px;
    }

    /**
     * null
     * @return MC null
     */
    public String getMc() {
        return mc;
    }

    /**
     * null
     * @param mc null
     */
    public void setMc(String mc) {
        this.mc = mc == null ? null : mc.trim();
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
        sb.append(", bm=").append(bm);
        sb.append(", content=").append(content);
        sb.append(", sfsy=").append(sfsy);
        sb.append(", px=").append(px);
        sb.append(", mc=").append(mc);
        sb.append("]");
        return sb.toString();
    }
}