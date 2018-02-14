package com.wisedu.crowd.entity.zygl;

import java.io.Serializable;

public class SjkInfo implements Serializable{
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
     * 数据库地址
     */
    private String sjkdz;

    /**
     * 数据库实例
     */
    private String sjksl;

    /**
     * 用户名
     */
    private String yhm;

    /**
     * 密码
     */
    private String mm;

    /**
     * 使用状态
     */
    private Integer syzt;

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
     * 数据库地址
     * @return SJKDZ 数据库地址
     */
    public String getSjkdz() {
        return sjkdz;
    }

    /**
     * 数据库地址
     * @param sjkdz 数据库地址
     */
    public void setSjkdz(String sjkdz) {
        this.sjkdz = sjkdz == null ? null : sjkdz.trim();
    }

    /**
     * 数据库实例
     * @return SJKSL 数据库实例
     */
    public String getSjksl() {
        return sjksl;
    }

    /**
     * 数据库实例
     * @param sjksl 数据库实例
     */
    public void setSjksl(String sjksl) {
        this.sjksl = sjksl == null ? null : sjksl.trim();
    }

    /**
     * 用户名
     * @return YHM 用户名
     */
    public String getYhm() {
        return yhm;
    }

    /**
     * 用户名
     * @param yhm 用户名
     */
    public void setYhm(String yhm) {
        this.yhm = yhm == null ? null : yhm.trim();
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
     * 使用状态
     * @return SYZT 使用状态
     */
    public Integer getSyzt() {
        return syzt;
    }

    /**
     * 使用状态
     * @param syzt 使用状态
     */
    public void setSyzt(Integer syzt) {
        this.syzt = syzt;
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
        sb.append(", sjkdz=").append(sjkdz);
        sb.append(", sjksl=").append(sjksl);
        sb.append(", yhm=").append(yhm);
        sb.append(", mm=").append(mm);
        sb.append(", syzt=").append(syzt);
        sb.append(", sqjlid=").append(sqjlid);
        sb.append("]");
        return sb.toString();
    }
}