package com.wisedu.crowd.entity.train;

import java.io.Serializable;

public class TrainStudentInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * WID
     */
    private String wid;

    /**
     * 用户ID
     */
    private String yhid;

    /**
     * 姓名
     */
    private String xm;

    /**
     * 手机
     */
    private String sj;

    /**
     * QQ
     */
    private String qq;

    /**
     * 从业年份
     */
    private String cynf;

    /**
     * 服务学校
     */
    private String fwxx;

    /**
     * 擅长技术
     */
    private String scjs;

    /**
     * 培训学员照片ID
     */
    private String pxxyzpid;

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
     * 用户ID
     * @return YHID 用户ID
     */
    public String getYhid() {
        return yhid;
    }

    /**
     * 用户ID
     * @param yhid 用户ID
     */
    public void setYhid(String yhid) {
        this.yhid = yhid == null ? null : yhid.trim();
    }

    /**
     * 姓名
     * @return XM 姓名
     */
    public String getXm() {
        return xm;
    }

    /**
     * 姓名
     * @param xm 姓名
     */
    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    /**
     * 手机
     * @return SJ 手机
     */
    public String getSj() {
        return sj;
    }

    /**
     * 手机
     * @param sj 手机
     */
    public void setSj(String sj) {
        this.sj = sj == null ? null : sj.trim();
    }

    /**
     * QQ
     * @return QQ QQ
     */
    public String getQq() {
        return qq;
    }

    /**
     * QQ
     * @param qq QQ
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * 从业年份
     * @return CYNF 从业年份
     */
    public String getCynf() {
        return cynf;
    }

    /**
     * 从业年份
     * @param cynf 从业年份
     */
    public void setCynf(String cynf) {
        this.cynf = cynf == null ? null : cynf.trim();
    }

    /**
     * 服务学校
     * @return FWXX 服务学校
     */
    public String getFwxx() {
        return fwxx;
    }

    /**
     * 服务学校
     * @param fwxx 服务学校
     */
    public void setFwxx(String fwxx) {
        this.fwxx = fwxx == null ? null : fwxx.trim();
    }

    /**
     * 擅长技术
     * @return SCJS 擅长技术
     */
    public String getScjs() {
        return scjs;
    }

    /**
     * 擅长技术
     * @param scjs 擅长技术
     */
    public void setScjs(String scjs) {
        this.scjs = scjs == null ? null : scjs.trim();
    }

    /**
     * 培训学员照片ID
     * @return PXXYZPID 培训学员照片ID
     */
    public String getPxxyzpid() {
        return pxxyzpid;
    }

    /**
     * 培训学员照片ID
     * @param pxxyzpid 培训学员照片ID
     */
    public void setPxxyzpid(String pxxyzpid) {
        this.pxxyzpid = pxxyzpid == null ? null : pxxyzpid.trim();
    }

    /**
     *
     * @mbggenerated 2017-12-29
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", yhid=").append(yhid);
        sb.append(", xm=").append(xm);
        sb.append(", sj=").append(sj);
        sb.append(", qq=").append(qq);
        sb.append(", cynf=").append(cynf);
        sb.append(", fwxx=").append(fwxx);
        sb.append(", scjs=").append(scjs);
        sb.append(", pxxyzpid=").append(pxxyzpid);
        sb.append("]");
        return sb.toString();
    }
}