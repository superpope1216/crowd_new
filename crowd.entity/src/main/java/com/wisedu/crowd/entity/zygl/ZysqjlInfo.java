package com.wisedu.crowd.entity.zygl;

import java.io.Serializable;

public class ZysqjlInfo implements Serializable{
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
     * 申请人
     */
    private String sqr;

    /**
     * 申请时间
     */
    private String sqsj;

    /**
     * 申请理由
     */
    private String sqly;

    /**
     * 开始使用时间
     */
    private String kssysj;

    /**
     * 结束使用时间
     */
    private String jssysj;

    /**
     * 审核结果
     */
    private Integer shjg;

    /**
     * 审核人
     */
    private String shr;

    /**
     * 审核时间
     */
    private String shsj;

    /**
     * 审核意见
     */
    private String shyj;

    /**
     * 申请资源类别
     */
    private Integer sqzylb;

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
     * 申请人
     * @return SQR 申请人
     */
    public String getSqr() {
        return sqr;
    }

    /**
     * 申请人
     * @param sqr 申请人
     */
    public void setSqr(String sqr) {
        this.sqr = sqr == null ? null : sqr.trim();
    }

    /**
     * 申请时间
     * @return SQSJ 申请时间
     */
    public String getSqsj() {
        return sqsj;
    }

    /**
     * 申请时间
     * @param sqsj 申请时间
     */
    public void setSqsj(String sqsj) {
        this.sqsj = sqsj == null ? null : sqsj.trim();
    }

    /**
     * 申请理由
     * @return SQLY 申请理由
     */
    public String getSqly() {
        return sqly;
    }

    /**
     * 申请理由
     * @param sqly 申请理由
     */
    public void setSqly(String sqly) {
        this.sqly = sqly == null ? null : sqly.trim();
    }

    /**
     * 开始使用时间
     * @return KSSYSJ 开始使用时间
     */
    public String getKssysj() {
        return kssysj;
    }

    /**
     * 开始使用时间
     * @param kssysj 开始使用时间
     */
    public void setKssysj(String kssysj) {
        this.kssysj = kssysj == null ? null : kssysj.trim();
    }

    /**
     * 结束使用时间
     * @return JSSYSJ 结束使用时间
     */
    public String getJssysj() {
        return jssysj;
    }

    /**
     * 结束使用时间
     * @param jssysj 结束使用时间
     */
    public void setJssysj(String jssysj) {
        this.jssysj = jssysj == null ? null : jssysj.trim();
    }

    /**
     * 审核结果
     * @return SHJG 审核结果
     */
    public Integer getShjg() {
        return shjg;
    }

    /**
     * 审核结果
     * @param shjg 审核结果
     */
    public void setShjg(Integer shjg) {
        this.shjg = shjg;
    }

    /**
     * 审核人
     * @return SHR 审核人
     */
    public String getShr() {
        return shr;
    }

    /**
     * 审核人
     * @param shr 审核人
     */
    public void setShr(String shr) {
        this.shr = shr == null ? null : shr.trim();
    }

    /**
     * 审核时间
     * @return SHSJ 审核时间
     */
    public String getShsj() {
        return shsj;
    }

    /**
     * 审核时间
     * @param shsj 审核时间
     */
    public void setShsj(String shsj) {
        this.shsj = shsj == null ? null : shsj.trim();
    }

    /**
     * 审核意见
     * @return SHYJ 审核意见
     */
    public String getShyj() {
        return shyj;
    }

    /**
     * 审核意见
     * @param shyj 审核意见
     */
    public void setShyj(String shyj) {
        this.shyj = shyj == null ? null : shyj.trim();
    }

    /**
     * 申请资源类别
     * @return SQZYLB 申请资源类别
     */
    public Integer getSqzylb() {
        return sqzylb;
    }

    /**
     * 申请资源类别
     * @param sqzylb 申请资源类别
     */
    public void setSqzylb(Integer sqzylb) {
        this.sqzylb = sqzylb;
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
        sb.append(", sqr=").append(sqr);
        sb.append(", sqsj=").append(sqsj);
        sb.append(", sqly=").append(sqly);
        sb.append(", kssysj=").append(kssysj);
        sb.append(", jssysj=").append(jssysj);
        sb.append(", shjg=").append(shjg);
        sb.append(", shr=").append(shr);
        sb.append(", shsj=").append(shsj);
        sb.append(", shyj=").append(shyj);
        sb.append(", sqzylb=").append(sqzylb);
        sb.append("]");
        return sb.toString();
    }
}