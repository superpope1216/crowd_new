package com.wisedu.crowd.entity.statics;

import java.io.Serializable;
import java.math.BigDecimal;

public class KfzzfInfo implements Serializable{
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
     * 开发者ID
     */
    private String kfzid;

    /**
     * 开发者姓名
     */
    private String kfzxm;

    /**
     * 业务线
     */
    private String ywx;

    /**
     * 个人照片
     */
    private String grzp;

    /**
     * 中标得分
     */
    private BigDecimal zbdf;

    /**
     * 验收得分
     */
    private BigDecimal ysdf;

    /**
     * 延期得分
     */
    private BigDecimal yqdf;

    /**
     * BUG得分
     */
    private BigDecimal bugdf;

    /**
     * 评价得分
     */
    private BigDecimal pjdf;

    /**
     * 日报得分
     */
    private BigDecimal rbdf;

    /**
     * 工作量得分
     */
    private BigDecimal gzldf;

    /**
     * 总分
     */
    private BigDecimal score;

    /**
     * 月份
     */
    private String month;

    /**
     * 完工项目数
     */
    private Long wgxms;

    /**
     * 金额
     */
    private BigDecimal je;

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
     * 开发者ID
     * @return KFZID 开发者ID
     */
    public String getKfzid() {
        return kfzid;
    }

    /**
     * 开发者ID
     * @param kfzid 开发者ID
     */
    public void setKfzid(String kfzid) {
        this.kfzid = kfzid == null ? null : kfzid.trim();
    }

    /**
     * 开发者姓名
     * @return KFZXM 开发者姓名
     */
    public String getKfzxm() {
        return kfzxm;
    }

    /**
     * 开发者姓名
     * @param kfzxm 开发者姓名
     */
    public void setKfzxm(String kfzxm) {
        this.kfzxm = kfzxm == null ? null : kfzxm.trim();
    }

    /**
     * 业务线
     * @return YWX 业务线
     */
    public String getYwx() {
        return ywx;
    }

    /**
     * 业务线
     * @param ywx 业务线
     */
    public void setYwx(String ywx) {
        this.ywx = ywx == null ? null : ywx.trim();
    }

    /**
     * 个人照片
     * @return GRZP 个人照片
     */
    public String getGrzp() {
        return grzp;
    }

    /**
     * 个人照片
     * @param grzp 个人照片
     */
    public void setGrzp(String grzp) {
        this.grzp = grzp == null ? null : grzp.trim();
    }

    /**
     * 中标得分
     * @return ZBDF 中标得分
     */
    public BigDecimal getZbdf() {
        return zbdf;
    }

    /**
     * 中标得分
     * @param zbdf 中标得分
     */
    public void setZbdf(BigDecimal zbdf) {
        this.zbdf = zbdf;
    }

    /**
     * 验收得分
     * @return YSDF 验收得分
     */
    public BigDecimal getYsdf() {
        return ysdf;
    }

    /**
     * 验收得分
     * @param ysdf 验收得分
     */
    public void setYsdf(BigDecimal ysdf) {
        this.ysdf = ysdf;
    }

    /**
     * 延期得分
     * @return YQDF 延期得分
     */
    public BigDecimal getYqdf() {
        return yqdf;
    }

    /**
     * 延期得分
     * @param yqdf 延期得分
     */
    public void setYqdf(BigDecimal yqdf) {
        this.yqdf = yqdf;
    }

    /**
     * BUG得分
     * @return BUGDF BUG得分
     */
    public BigDecimal getBugdf() {
        return bugdf;
    }

    /**
     * BUG得分
     * @param bugdf BUG得分
     */
    public void setBugdf(BigDecimal bugdf) {
        this.bugdf = bugdf;
    }

    /**
     * 评价得分
     * @return PJDF 评价得分
     */
    public BigDecimal getPjdf() {
        return pjdf;
    }

    /**
     * 评价得分
     * @param pjdf 评价得分
     */
    public void setPjdf(BigDecimal pjdf) {
        this.pjdf = pjdf;
    }

    /**
     * 日报得分
     * @return RBDF 日报得分
     */
    public BigDecimal getRbdf() {
        return rbdf;
    }

    /**
     * 日报得分
     * @param rbdf 日报得分
     */
    public void setRbdf(BigDecimal rbdf) {
        this.rbdf = rbdf;
    }

    /**
     * 工作量得分
     * @return GZLDF 工作量得分
     */
    public BigDecimal getGzldf() {
        return gzldf;
    }

    /**
     * 工作量得分
     * @param gzldf 工作量得分
     */
    public void setGzldf(BigDecimal gzldf) {
        this.gzldf = gzldf;
    }

    /**
     * 总分
     * @return SCORE 总分
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * 总分
     * @param score 总分
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     * 月份
     * @return MONTH 月份
     */
    public String getMonth() {
        return month;
    }

    /**
     * 月份
     * @param month 月份
     */
    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    /**
     * 完工项目数
     * @return WGXMS 完工项目数
     */
    public Long getWgxms() {
        return wgxms;
    }

    /**
     * 完工项目数
     * @param wgxms 完工项目数
     */
    public void setWgxms(Long wgxms) {
        this.wgxms = wgxms;
    }

    /**
     * 金额
     * @return JE 金额
     */
    public BigDecimal getJe() {
        return je;
    }

    /**
     * 金额
     * @param je 金额
     */
    public void setJe(BigDecimal je) {
        this.je = je;
    }

    /**
     *
     * @mbggenerated 2018-01-18
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", kfzid=").append(kfzid);
        sb.append(", kfzxm=").append(kfzxm);
        sb.append(", ywx=").append(ywx);
        sb.append(", grzp=").append(grzp);
        sb.append(", zbdf=").append(zbdf);
        sb.append(", ysdf=").append(ysdf);
        sb.append(", yqdf=").append(yqdf);
        sb.append(", bugdf=").append(bugdf);
        sb.append(", pjdf=").append(pjdf);
        sb.append(", rbdf=").append(rbdf);
        sb.append(", gzldf=").append(gzldf);
        sb.append(", score=").append(score);
        sb.append(", month=").append(month);
        sb.append(", wgxms=").append(wgxms);
        sb.append(", je=").append(je);
        sb.append("]");
        return sb.toString();
    }
}