package com.wisedu.crowd.entity.statics;

import java.io.Serializable;
import java.math.BigDecimal;

public class KfzjlMonth implements Serializable {
	  private static final long serialVersionUID = 1L;
    /**
     * WID
     */
    private String wid;

    /**
     * 开发者经理ID
     */
    private String kfzid;

    /**
     * 月份
     */
    private String month;

    /**
     * 延期率
     */
    private BigDecimal yql;

    /**
     * 完工量
     */
    private BigDecimal wgl;

    /**
     * BUG指定率
     */
    private BigDecimal bugzdl;

    /**
     * 工作量
     */
    private BigDecimal gzl;

    /**
     * 日报率
     */
    private BigDecimal rbl;

    /**
     * 审核及时率
     */
    private BigDecimal shjsl;

    /**
     * BUG率
     */
    private BigDecimal bugl;

    /**
     * 业务线
     */
    private String ywx;

    /**
     * 标准完工量
     */
    private String bzwgl;

    /**
     * 标准工作量
     */
    private String bzgzl;

    /**
     * 延期率权重得分
     */
    private BigDecimal yqlScore;

    /**
     * 完工量权重得分
     */
    private BigDecimal wglScore;

    /**
     * BUG指定率权重得分
     */
    private BigDecimal bugzdlScore;

    /**
     * 工作量权重得分
     */
    private BigDecimal gzlScore;

    /**
     * 日报率权重得分
     */
    private BigDecimal jblScore;

    /**
     * 审核及时率权重得分
     */
    private BigDecimal shjslScore;

    /**
     * BUG率权重得分
     */
    private BigDecimal buglScore;

    /**
     * 完工量率
     */
    private BigDecimal wgll;

    /**
     * 工作量率
     */
    private BigDecimal gzll;
    
    private BigDecimal scoreSj;
    
    private String ywxmc;

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
     * 开发者经理ID
     * @return KFZID 开发者经理ID
     */
    public String getKfzid() {
        return kfzid;
    }

    /**
     * 开发者经理ID
     * @param kfzid 开发者经理ID
     */
    public void setKfzid(String kfzid) {
        this.kfzid = kfzid == null ? null : kfzid.trim();
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
     * 延期率
     * @return YQL 延期率
     */
    public BigDecimal getYql() {
        return yql;
    }

    /**
     * 延期率
     * @param yql 延期率
     */
    public void setYql(BigDecimal yql) {
        this.yql = yql;
    }

    /**
     * 完工量
     * @return WGL 完工量
     */
    public BigDecimal getWgl() {
        return wgl;
    }

    /**
     * 完工量
     * @param wgl 完工量
     */
    public void setWgl(BigDecimal wgl) {
        this.wgl = wgl;
    }

    /**
     * BUG指定率
     * @return BUGZDL BUG指定率
     */
    public BigDecimal getBugzdl() {
        return bugzdl;
    }

    /**
     * BUG指定率
     * @param bugzdl BUG指定率
     */
    public void setBugzdl(BigDecimal bugzdl) {
        this.bugzdl = bugzdl;
    }

    /**
     * 工作量
     * @return GZL 工作量
     */
    public BigDecimal getGzl() {
        return gzl;
    }

    /**
     * 工作量
     * @param gzl 工作量
     */
    public void setGzl(BigDecimal gzl) {
        this.gzl = gzl;
    }

    /**
     * 日报率
     * @return RBL 日报率
     */
    public BigDecimal getRbl() {
        return rbl;
    }

    /**
     * 日报率
     * @param rbl 日报率
     */
    public void setRbl(BigDecimal rbl) {
        this.rbl = rbl;
    }

    /**
     * 审核及时率
     * @return SHJSL 审核及时率
     */
    public BigDecimal getShjsl() {
        return shjsl;
    }

    /**
     * 审核及时率
     * @param shjsl 审核及时率
     */
    public void setShjsl(BigDecimal shjsl) {
        this.shjsl = shjsl;
    }

    /**
     * BUG率
     * @return BUGL BUG率
     */
    public BigDecimal getBugl() {
        return bugl;
    }

    /**
     * BUG率
     * @param bugl BUG率
     */
    public void setBugl(BigDecimal bugl) {
        this.bugl = bugl;
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
     * 标准完工量
     * @return BZWGL 标准完工量
     */
    public String getBzwgl() {
        return bzwgl;
    }

    /**
     * 标准完工量
     * @param bzwgl 标准完工量
     */
    public void setBzwgl(String bzwgl) {
        this.bzwgl = bzwgl == null ? null : bzwgl.trim();
    }

    /**
     * 标准工作量
     * @return BZGZL 标准工作量
     */
    public String getBzgzl() {
        return bzgzl;
    }

    /**
     * 标准工作量
     * @param bzgzl 标准工作量
     */
    public void setBzgzl(String bzgzl) {
        this.bzgzl = bzgzl == null ? null : bzgzl.trim();
    }

    /**
     * 延期率权重得分
     * @return YQL_SCORE 延期率权重得分
     */
    public BigDecimal getYqlScore() {
        return yqlScore;
    }

    /**
     * 延期率权重得分
     * @param yqlScore 延期率权重得分
     */
    public void setYqlScore(BigDecimal yqlScore) {
        this.yqlScore = yqlScore;
    }

    /**
     * 完工量权重得分
     * @return WGL_SCORE 完工量权重得分
     */
    public BigDecimal getWglScore() {
        return wglScore;
    }

    /**
     * 完工量权重得分
     * @param wglScore 完工量权重得分
     */
    public void setWglScore(BigDecimal wglScore) {
        this.wglScore = wglScore;
    }

    /**
     * BUG指定率权重得分
     * @return BUGZDL_SCORE BUG指定率权重得分
     */
    public BigDecimal getBugzdlScore() {
        return bugzdlScore;
    }

    /**
     * BUG指定率权重得分
     * @param bugzdlScore BUG指定率权重得分
     */
    public void setBugzdlScore(BigDecimal bugzdlScore) {
        this.bugzdlScore = bugzdlScore;
    }

    /**
     * 工作量权重得分
     * @return GZL_SCORE 工作量权重得分
     */
    public BigDecimal getGzlScore() {
        return gzlScore;
    }

    /**
     * 工作量权重得分
     * @param gzlScore 工作量权重得分
     */
    public void setGzlScore(BigDecimal gzlScore) {
        this.gzlScore = gzlScore;
    }

    /**
     * 日报率权重得分
     * @return JBL_SCORE 日报率权重得分
     */
    public BigDecimal getJblScore() {
        return jblScore;
    }

    /**
     * 日报率权重得分
     * @param jblScore 日报率权重得分
     */
    public void setJblScore(BigDecimal jblScore) {
        this.jblScore = jblScore;
    }

    /**
     * 审核及时率权重得分
     * @return SHJSL_SCORE 审核及时率权重得分
     */
    public BigDecimal getShjslScore() {
        return shjslScore;
    }

    /**
     * 审核及时率权重得分
     * @param shjslScore 审核及时率权重得分
     */
    public void setShjslScore(BigDecimal shjslScore) {
        this.shjslScore = shjslScore;
    }

    /**
     * BUG率权重得分
     * @return BUGL_SCORE BUG率权重得分
     */
    public BigDecimal getBuglScore() {
        return buglScore;
    }

    /**
     * BUG率权重得分
     * @param buglScore BUG率权重得分
     */
    public void setBuglScore(BigDecimal buglScore) {
        this.buglScore = buglScore;
    }

    /**
     * 完工量率
     * @return WGLL 完工量率
     */
    public BigDecimal getWgll() {
        return wgll;
    }

    /**
     * 完工量率
     * @param wgll 完工量率
     */
    public void setWgll(BigDecimal wgll) {
        this.wgll = wgll;
    }

    /**
     * 工作量率
     * @return GZLL 工作量率
     */
    public BigDecimal getGzll() {
        return gzll;
    }

    /**
     * 工作量率
     * @param gzll 工作量率
     */
    public void setGzll(BigDecimal gzll) {
        this.gzll = gzll;
    }
    
    /**
     * 完工量率
     * @return WGLL 完工量率
     */
    public BigDecimal getScoreSj() {
        return scoreSj;
    }

    /**
     * 完工量率
     * @param wgll 完工量率
     */
    public void setScoreSj(BigDecimal scoreSj) {
        this.scoreSj = scoreSj;
    }

    /**
     * 工作量率
     * @return GZLL 工作量率
     */
    public String getYwxmc() {
        return ywxmc;
    }

    /**
     * 工作量率
     * @param gzll 工作量率
     */
    public void setYwxmc(String ywxmc) {
        this.ywxmc = ywxmc;
    }

    /**
     *
     * @mbggenerated 2017-11-03
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", kfzid=").append(kfzid);
        sb.append(", month=").append(month);
        sb.append(", yql=").append(yql);
        sb.append(", wgl=").append(wgl);
        sb.append(", bugzdl=").append(bugzdl);
        sb.append(", gzl=").append(gzl);
        sb.append(", rbl=").append(rbl);
        sb.append(", shjsl=").append(shjsl);
        sb.append(", bugl=").append(bugl);
        sb.append(", ywx=").append(ywx);
        sb.append(", bzwgl=").append(bzwgl);
        sb.append(", bzgzl=").append(bzgzl);
        sb.append(", yqlScore=").append(yqlScore);
        sb.append(", wglScore=").append(wglScore);
        sb.append(", bugzdlScore=").append(bugzdlScore);
        sb.append(", gzlScore=").append(gzlScore);
        sb.append(", jblScore=").append(jblScore);
        sb.append(", shjslScore=").append(shjslScore);
        sb.append(", buglScore=").append(buglScore);
        sb.append(", wgll=").append(wgll);
        sb.append(", gzll=").append(gzll);
        sb.append("]");
        return sb.toString();
    }
}