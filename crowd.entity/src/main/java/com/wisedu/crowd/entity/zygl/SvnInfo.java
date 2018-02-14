package com.wisedu.crowd.entity.zygl;

import java.io.Serializable;

public class SvnInfo implements Serializable{
    /**
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).
     * @since JDK 1.6
     */
    private static final long serialVersionUID = 1L;

    /**
     * WID
     */
    private String wid;

    /**
     * 账号
     */
    private String zh;

    /**
     * 密码
     */
    private String mm;

    /**
     * 授权地址
     */
    private String scdz;

    /**
     * 申请记录ID
     */
    private String sqjlid;

    /**
     * WID
     * @return WID WID
     */
    public String getWid() {
        return wid;
    }

    /**
     * WID
     * @param wid WID
     */
    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    /**
     * 账号
     * @return ZH 账号
     */
    public String getZh() {
        return zh;
    }

    /**
     * 账号
     * @param zh 账号
     */
    public void setZh(String zh) {
        this.zh = zh == null ? null : zh.trim();
    }

    /**
     * 密码
     * @return MM 密码
     */
    public String getMm() {
        return mm;
    }

    /**
     * 密码
     * @param mm 密码
     */
    public void setMm(String mm) {
        this.mm = mm == null ? null : mm.trim();
    }

    /**
     * 授权地址
     * @return SCDZ 授权地址
     */
    public String getScdz() {
        return scdz;
    }

    /**
     * 授权地址
     * @param scdz 授权地址
     */
    public void setScdz(String scdz) {
        this.scdz = scdz == null ? null : scdz.trim();
    }

    /**
     * 申请记录ID
     * @return SQJLID 申请记录ID
     */
    public String getSqjlid() {
        return sqjlid;
    }

    /**
     * 申请记录ID
     * @param sqjlid 申请记录ID
     */
    public void setSqjlid(String sqjlid) {
        this.sqjlid = sqjlid == null ? null : sqjlid.trim();
    }

    /**
     *
     * @mbggenerated 2018-01-12
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", zh=").append(zh);
        sb.append(", mm=").append(mm);
        sb.append(", scdz=").append(scdz);
        sb.append(", sqjlid=").append(sqjlid);
        sb.append("]");
        return sb.toString();
    }
}