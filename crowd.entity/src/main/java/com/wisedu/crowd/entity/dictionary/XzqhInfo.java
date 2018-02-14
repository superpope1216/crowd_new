package com.wisedu.crowd.entity.dictionary;

import java.io.Serializable;

/**
 * 省市区
 * @author 11651
 *
 */
public class XzqhInfo implements Serializable{
	private static final long serialVersionUID = 1L;
    /**
     * 
     */
    private String wid;

    /**
     * 代码
     */
    private String lbdm;

    /**
     * 名称
     */
    private String lbmc;

    /**
     * 层次
     */
    private String cc;

    /**
     * 隶属
     */
    private String ls;

    /**
     * 是否使用
     */
    private Integer sfsy;

    /**
     * 排序
     */
    private Long px;

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
     * 代码
     * @return LBDM 代码
     */
    public String getLbdm() {
        return lbdm;
    }

    /**
     * 代码
     * @param lbdm 代码
     */
    public void setLbdm(String lbdm) {
        this.lbdm = lbdm == null ? null : lbdm.trim();
    }

    /**
     * 名称
     * @return LBMC 名称
     */
    public String getLbmc() {
        return lbmc;
    }

    /**
     * 名称
     * @param lbmc 名称
     */
    public void setLbmc(String lbmc) {
        this.lbmc = lbmc == null ? null : lbmc.trim();
    }

    /**
     * 层次
     * @return CC 层次
     */
    public String getCc() {
        return cc;
    }

    /**
     * 层次
     * @param cc 层次
     */
    public void setCc(String cc) {
        this.cc = cc == null ? null : cc.trim();
    }

    /**
     * 隶属
     * @return LS 隶属
     */
    public String getLs() {
        return ls;
    }

    /**
     * 隶属
     * @param ls 隶属
     */
    public void setLs(String ls) {
        this.ls = ls == null ? null : ls.trim();
    }

    /**
     * 是否使用
     * @return SFSY 是否使用
     */
    public Integer getSfsy() {
        return sfsy;
    }

    /**
     * 是否使用
     * @param sfsy 是否使用
     */
    public void setSfsy(Integer sfsy) {
        this.sfsy = sfsy;
    }

    /**
     * 排序
     * @return PX 排序
     */
    public Long getPx() {
        return px;
    }

    /**
     * 排序
     * @param px 排序
     */
    public void setPx(Long px) {
        this.px = px;
    }

    /**
     *
     * @mbggenerated 2017-11-23
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", lbdm=").append(lbdm);
        sb.append(", lbmc=").append(lbmc);
        sb.append(", cc=").append(cc);
        sb.append(", ls=").append(ls);
        sb.append(", sfsy=").append(sfsy);
        sb.append(", px=").append(px);
        sb.append("]");
        return sb.toString();
    }
}