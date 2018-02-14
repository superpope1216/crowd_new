package com.wisedu.crowd.entity.statics;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 业务线BUG信息
 * @author de
 *
 */
public class YwxbugInfo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * WID
     */
    private String wid;

    /**
     * 业务线代码
     */
    private String ywxdm;

    /**
     * 业务线名称
     */
    private String ywxmc;

    /**
     * 结算BUG金额
     */
    private BigDecimal jsbugje;

    /**
     * 结算总金额
     */
    private BigDecimal jszje;

    /**
     * 追加BUG数
     */
    private Integer zjbug;

    /**
     * 月份
     */
    private String month;

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
     * 业务线代码
     * @return YWXDM 业务线代码
     */
    public String getYwxdm() {
        return ywxdm;
    }

    /**
     * 业务线代码
     * @param ywxdm 业务线代码
     */
    public void setYwxdm(String ywxdm) {
        this.ywxdm = ywxdm == null ? null : ywxdm.trim();
    }

    /**
     * 业务线名称
     * @return YWXMC 业务线名称
     */
    public String getYwxmc() {
        return ywxmc;
    }

    /**
     * 业务线名称
     * @param ywxmc 业务线名称
     */
    public void setYwxmc(String ywxmc) {
        this.ywxmc = ywxmc == null ? null : ywxmc.trim();
    }

    /**
     * 结算BUG金额
     * @return JSBUGJE 结算BUG金额
     */
    public BigDecimal getJsbugje() {
        return jsbugje;
    }

    /**
     * 结算BUG金额
     * @param jsbugje 结算BUG金额
     */
    public void setJsbugje(BigDecimal jsbugje) {
        this.jsbugje = jsbugje;
    }

    /**
     * 结算总金额
     * @return JSZJE 结算总金额
     */
    public BigDecimal getJszje() {
        return jszje;
    }

    /**
     * 结算总金额
     * @param jszje 结算总金额
     */
    public void setJszje(BigDecimal jszje) {
        this.jszje = jszje;
    }

    /**
     * 追加BUG数
     * @return ZJBUG 追加BUG数
     */
    public Integer getZjbug() {
        return zjbug;
    }

    /**
     * 追加BUG数
     * @param zjbug 追加BUG数
     */
    public void setZjbug(Integer zjbug) {
        this.zjbug = zjbug;
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
     *
     * @mbggenerated 2017-10-19
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", ywxdm=").append(ywxdm);
        sb.append(", ywxmc=").append(ywxmc);
        sb.append(", jsbugje=").append(jsbugje);
        sb.append(", jszje=").append(jszje);
        sb.append(", zjbug=").append(zjbug);
        sb.append(", month=").append(month);
        sb.append("]");
        return sb.toString();
    }
}