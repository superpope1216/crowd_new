package com.wisedu.crowd.entity.train;

import java.io.Serializable;

public class TrainPlanInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * WID
     */
    private String wid;

    /**
     * 培训ID
     */
    private String pxid;

    /**
     * 培训开始时间
     */
    private String pxkssj;

    /**
     * 培训结束时间
     */
    private String pxjssj;

    /**
     * 报名开始时间
     */
    private String bmkssj;

    /**
     * 报名结束时间
     */
    private String bmjssj;

    /**
     * 附件
     */
    private String fj;

    /**
     * 基础能力检测地址
     */
    private String jcnljcdz;

    /**
     * 操作人
     */
    private String czr;

    /**
     * 操作时间
     */
    private String czsj;

    /**
     * 培训安排
     */
    private String pxap;

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
     * 培训ID
     * @return PXID 培训ID
     */
    public String getPxid() {
        return pxid;
    }

    /**
     * 培训ID
     * @param pxid 培训ID
     */
    public void setPxid(String pxid) {
        this.pxid = pxid == null ? null : pxid.trim();
    }

    /**
     * 培训开始时间
     * @return PXKSSJ 培训开始时间
     */
    public String getPxkssj() {
        return pxkssj;
    }

    /**
     * 培训开始时间
     * @param pxkssj 培训开始时间
     */
    public void setPxkssj(String pxkssj) {
        this.pxkssj = pxkssj == null ? null : pxkssj.trim();
    }

    /**
     * 培训结束时间
     * @return PXJSSJ 培训结束时间
     */
    public String getPxjssj() {
        return pxjssj;
    }

    /**
     * 培训结束时间
     * @param pxjssj 培训结束时间
     */
    public void setPxjssj(String pxjssj) {
        this.pxjssj = pxjssj == null ? null : pxjssj.trim();
    }

    /**
     * 报名开始时间
     * @return BMKSSJ 报名开始时间
     */
    public String getBmkssj() {
        return bmkssj;
    }

    /**
     * 报名开始时间
     * @param bmkssj 报名开始时间
     */
    public void setBmkssj(String bmkssj) {
        this.bmkssj = bmkssj == null ? null : bmkssj.trim();
    }

    /**
     * 报名结束时间
     * @return BMJSSJ 报名结束时间
     */
    public String getBmjssj() {
        return bmjssj;
    }

    /**
     * 报名结束时间
     * @param bmjssj 报名结束时间
     */
    public void setBmjssj(String bmjssj) {
        this.bmjssj = bmjssj == null ? null : bmjssj.trim();
    }

    /**
     * 附件
     * @return FJ 附件
     */
    public String getFj() {
        return fj;
    }

    /**
     * 附件
     * @param fj 附件
     */
    public void setFj(String fj) {
        this.fj = fj == null ? null : fj.trim();
    }

    /**
     * 基础能力检测地址
     * @return JCNLJCDZ 基础能力检测地址
     */
    public String getJcnljcdz() {
        return jcnljcdz;
    }

    /**
     * 基础能力检测地址
     * @param jcnljcdz 基础能力检测地址
     */
    public void setJcnljcdz(String jcnljcdz) {
        this.jcnljcdz = jcnljcdz == null ? null : jcnljcdz.trim();
    }

    /**
     * 操作人
     * @return CZR 操作人
     */
    public String getCzr() {
        return czr;
    }

    /**
     * 操作人
     * @param czr 操作人
     */
    public void setCzr(String czr) {
        this.czr = czr == null ? null : czr.trim();
    }

    /**
     * 操作时间
     * @return CZSJ 操作时间
     */
    public String getCzsj() {
        return czsj;
    }

    /**
     * 操作时间
     * @param czsj 操作时间
     */
    public void setCzsj(String czsj) {
        this.czsj = czsj == null ? null : czsj.trim();
    }

    /**
     * 培训安排
     * @return PXAP 培训安排
     */
    public String getPxap() {
        return pxap;
    }

    /**
     * 培训安排
     * @param pxap 培训安排
     */
    public void setPxap(String pxap) {
        this.pxap = pxap == null ? null : pxap.trim();
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
        sb.append(", pxid=").append(pxid);
        sb.append(", pxkssj=").append(pxkssj);
        sb.append(", pxjssj=").append(pxjssj);
        sb.append(", bmkssj=").append(bmkssj);
        sb.append(", bmjssj=").append(bmjssj);
        sb.append(", fj=").append(fj);
        sb.append(", jcnljcdz=").append(jcnljcdz);
        sb.append(", czr=").append(czr);
        sb.append(", czsj=").append(czsj);
        sb.append(", pxap=").append(pxap);
        sb.append("]");
        return sb.toString();
    }
}