package com.wisedu.crowd.entity.train;

import java.io.Serializable;

public class TrainEnrolInfo implements Serializable{
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
     * 学员ID
     */
    private String xyid;

    /**
     * 基础技能检测
     */
    private Integer jcjnjc;

    /**
     * 课程进展
     */
    private Integer kcjz;

    /**
     * 出勤率
     */
    private Integer cql;

    /**
     * 考核时间
     */
    private String khsj;

    /**
     * 考核结果
     */
    private Integer khjg;

    /**
     * 能力评估
     */
    private Integer nlpg;

    /**
     * 证书编号
     */
    private String zsbh;

    /**
     * 附件
     */
    private String fj;

    /**
     * 预约考核时间
     */
    private String yykhsj;

    /**
     * 报名状态
     */
    private Integer bmzt;

    /**
     * 预约考核状态
     */
    private Integer yykhzt;

    /**
     * 电子证书
     */
    private String dzzs;

    /**
     * 情况描述
     */
    private String qkms;

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
     * 学员ID
     * @return XYID 学员ID
     */
    public String getXyid() {
        return xyid;
    }

    /**
     * 学员ID
     * @param xyid 学员ID
     */
    public void setXyid(String xyid) {
        this.xyid = xyid == null ? null : xyid.trim();
    }

    /**
     * 基础技能检测
     * @return JCJNJC 基础技能检测
     */
    public Integer getJcjnjc() {
        return jcjnjc;
    }

    /**
     * 基础技能检测
     * @param jcjnjc 基础技能检测
     */
    public void setJcjnjc(Integer jcjnjc) {
        this.jcjnjc = jcjnjc;
    }

    /**
     * 课程进展
     * @return KCJZ 课程进展
     */
    public Integer getKcjz() {
        return kcjz;
    }

    /**
     * 课程进展
     * @param kcjz 课程进展
     */
    public void setKcjz(Integer kcjz) {
        this.kcjz = kcjz;
    }

    /**
     * 出勤率
     * @return CQL 出勤率
     */
    public Integer getCql() {
        return cql;
    }

    /**
     * 出勤率
     * @param cql 出勤率
     */
    public void setCql(Integer cql) {
        this.cql = cql;
    }

    /**
     * 考核时间
     * @return KHSJ 考核时间
     */
    public String getKhsj() {
        return khsj;
    }

    /**
     * 考核时间
     * @param khsj 考核时间
     */
    public void setKhsj(String khsj) {
        this.khsj = khsj == null ? null : khsj.trim();
    }

    /**
     * 考核结果
     * @return KHJG 考核结果
     */
    public Integer getKhjg() {
        return khjg;
    }

    /**
     * 考核结果
     * @param khjg 考核结果
     */
    public void setKhjg(Integer khjg) {
        this.khjg = khjg;
    }

    /**
     * 能力评估
     * @return NLPG 能力评估
     */
    public Integer getNlpg() {
        return nlpg;
    }

    /**
     * 能力评估
     * @param nlpg 能力评估
     */
    public void setNlpg(Integer nlpg) {
        this.nlpg = nlpg;
    }

    /**
     * 证书编号
     * @return ZSBH 证书编号
     */
    public String getZsbh() {
        return zsbh;
    }

    /**
     * 证书编号
     * @param zsbh 证书编号
     */
    public void setZsbh(String zsbh) {
        this.zsbh = zsbh == null ? null : zsbh.trim();
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
     * 预约考核时间
     * @return YYKHSJ 预约考核时间
     */
    public String getYykhsj() {
        return yykhsj;
    }

    /**
     * 预约考核时间
     * @param yykhsj 预约考核时间
     */
    public void setYykhsj(String yykhsj) {
        this.yykhsj = yykhsj == null ? null : yykhsj.trim();
    }

    /**
     * 报名状态
     * @return BMZT 报名状态
     */
    public Integer getBmzt() {
        return bmzt;
    }

    /**
     * 报名状态
     * @param bmzt 报名状态
     */
    public void setBmzt(Integer bmzt) {
        this.bmzt = bmzt;
    }

    /**
     * 预约考核状态
     * @return YYKHZT 预约考核状态
     */
    public Integer getYykhzt() {
        return yykhzt;
    }

    /**
     * 预约考核状态
     * @param yykhzt 预约考核状态
     */
    public void setYykhzt(Integer yykhzt) {
        this.yykhzt = yykhzt;
    }

    /**
     * 电子证书
     * @return DZZS 电子证书
     */
    public String getDzzs() {
        return dzzs;
    }

    /**
     * 电子证书
     * @param dzzs 电子证书
     */
    public void setDzzs(String dzzs) {
        this.dzzs = dzzs == null ? null : dzzs.trim();
    }

    /**
     * 情况描述
     * @return QKMS 情况描述
     */
    public String getQkms() {
        return qkms;
    }

    /**
     * 情况描述
     * @param qkms 情况描述
     */
    public void setQkms(String qkms) {
        this.qkms = qkms == null ? null : qkms.trim();
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
        sb.append(", xyid=").append(xyid);
        sb.append(", jcjnjc=").append(jcjnjc);
        sb.append(", kcjz=").append(kcjz);
        sb.append(", cql=").append(cql);
        sb.append(", khsj=").append(khsj);
        sb.append(", khjg=").append(khjg);
        sb.append(", nlpg=").append(nlpg);
        sb.append(", zsbh=").append(zsbh);
        sb.append(", fj=").append(fj);
        sb.append(", yykhsj=").append(yykhsj);
        sb.append(", bmzt=").append(bmzt);
        sb.append(", yykhzt=").append(yykhzt);
        sb.append(", dzzs=").append(dzzs);
        sb.append(", qkms=").append(qkms);
        sb.append("]");
        return sb.toString();
    }
}