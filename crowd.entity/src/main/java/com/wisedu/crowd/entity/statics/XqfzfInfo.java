package com.wisedu.crowd.entity.statics;

import java.io.Serializable;
import java.math.BigDecimal;

public class XqfzfInfo implements Serializable{
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
     * 需求方ID
     */
    private String xqfid;

    /**
     * 需求方姓名
     */
    private String xqfxm;

    /**
     * 月份
     */
    private String month;

    /**
     * 审核得分
     */
    private BigDecimal shdf;

    /**
     * 验收得分
     */
    private BigDecimal ysdf;

    /**
     * 评价得分
     */
    private BigDecimal pjdf;

    /**
     * 追加BUG得分
     */
    private BigDecimal zjbugdf;

    /**
     * 追加需求得分
     */
    private BigDecimal zjxqdf;

    /**
     * 自动关闭得分
     */
    private BigDecimal zdgbdf;

    /**
     * 需求期限得分
     */
    private BigDecimal qxdf;

    /**
     * 总分
     */
    private BigDecimal score;

    /**
     * 发布任务数
     */
    private Long fbrws;

    /**
     * 金额
     */
    private Long je;

    /**
     * 一级部门
     */
    private String yjbm;

    /**
     * 二级部门
     */
    private String ejbm;

    /**
     * 所属部门
     */
    private String ssbm;

    /**
     * 工号
     */
    private String gh;

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
     * 需求方ID
     * @return XQFID 需求方ID
     */
    public String getXqfid() {
        return xqfid;
    }

    /**
     * 需求方ID
     * @param xqfid 需求方ID
     */
    public void setXqfid(String xqfid) {
        this.xqfid = xqfid == null ? null : xqfid.trim();
    }

    /**
     * 需求方姓名
     * @return XQFXM 需求方姓名
     */
    public String getXqfxm() {
        return xqfxm;
    }

    /**
     * 需求方姓名
     * @param xqfxm 需求方姓名
     */
    public void setXqfxm(String xqfxm) {
        this.xqfxm = xqfxm == null ? null : xqfxm.trim();
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
     * 审核得分
     * @return SHDF 审核得分
     */
    public BigDecimal getShdf() {
        return shdf;
    }

    /**
     * 审核得分
     * @param shdf 审核得分
     */
    public void setShdf(BigDecimal shdf) {
        this.shdf = shdf;
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
     * 追加BUG得分
     * @return ZJBUGDF 追加BUG得分
     */
    public BigDecimal getZjbugdf() {
        return zjbugdf;
    }

    /**
     * 追加BUG得分
     * @param zjbugdf 追加BUG得分
     */
    public void setZjbugdf(BigDecimal zjbugdf) {
        this.zjbugdf = zjbugdf;
    }

    /**
     * 追加需求得分
     * @return ZJXQDF 追加需求得分
     */
    public BigDecimal getZjxqdf() {
        return zjxqdf;
    }

    /**
     * 追加需求得分
     * @param zjxqdf 追加需求得分
     */
    public void setZjxqdf(BigDecimal zjxqdf) {
        this.zjxqdf = zjxqdf;
    }

    /**
     * 自动关闭得分
     * @return ZDGBDF 自动关闭得分
     */
    public BigDecimal getZdgbdf() {
        return zdgbdf;
    }

    /**
     * 自动关闭得分
     * @param zdgbdf 自动关闭得分
     */
    public void setZdgbdf(BigDecimal zdgbdf) {
        this.zdgbdf = zdgbdf;
    }

    /**
     * 需求期限得分
     * @return QXDF 需求期限得分
     */
    public BigDecimal getQxdf() {
        return qxdf;
    }

    /**
     * 需求期限得分
     * @param qxdf 需求期限得分
     */
    public void setQxdf(BigDecimal qxdf) {
        this.qxdf = qxdf;
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
     * 发布任务数
     * @return FBRWS 发布任务数
     */
    public Long getFbrws() {
        return fbrws;
    }

    /**
     * 发布任务数
     * @param fbrws 发布任务数
     */
    public void setFbrws(Long fbrws) {
        this.fbrws = fbrws;
    }

    /**
     * 金额
     * @return JE 金额
     */
    public Long getJe() {
        return je;
    }

    /**
     * 金额
     * @param je 金额
     */
    public void setJe(Long je) {
        this.je = je;
    }

    /**
     * 一级部门
     * @return YJBM 一级部门
     */
    public String getYjbm() {
        return yjbm;
    }

    /**
     * 一级部门
     * @param yjbm 一级部门
     */
    public void setYjbm(String yjbm) {
        this.yjbm = yjbm == null ? null : yjbm.trim();
    }

    /**
     * 二级部门
     * @return EJBM 二级部门
     */
    public String getEjbm() {
        return ejbm;
    }

    /**
     * 二级部门
     * @param ejbm 二级部门
     */
    public void setEjbm(String ejbm) {
        this.ejbm = ejbm == null ? null : ejbm.trim();
    }

    /**
     * 所属部门
     * @return SSBM 所属部门
     */
    public String getSsbm() {
        return ssbm;
    }

    /**
     * 所属部门
     * @param ssbm 所属部门
     */
    public void setSsbm(String ssbm) {
        this.ssbm = ssbm == null ? null : ssbm.trim();
    }

    /**
     * 工号
     * @return GH 工号
     */
    public String getGh() {
        return gh;
    }

    /**
     * 工号
     * @param gh 工号
     */
    public void setGh(String gh) {
        this.gh = gh == null ? null : gh.trim();
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
        sb.append(", xqfid=").append(xqfid);
        sb.append(", xqfxm=").append(xqfxm);
        sb.append(", month=").append(month);
        sb.append(", shdf=").append(shdf);
        sb.append(", ysdf=").append(ysdf);
        sb.append(", pjdf=").append(pjdf);
        sb.append(", zjbugdf=").append(zjbugdf);
        sb.append(", zjxqdf=").append(zjxqdf);
        sb.append(", zdgbdf=").append(zdgbdf);
        sb.append(", qxdf=").append(qxdf);
        sb.append(", score=").append(score);
        sb.append(", fbrws=").append(fbrws);
        sb.append(", je=").append(je);
        sb.append(", yjbm=").append(yjbm);
        sb.append(", ejbm=").append(ejbm);
        sb.append(", ssbm=").append(ssbm);
        sb.append(", gh=").append(gh);
        sb.append("]");
        return sb.toString();
    }
}