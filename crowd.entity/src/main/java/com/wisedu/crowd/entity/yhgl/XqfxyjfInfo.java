package com.wisedu.crowd.entity.yhgl;

import java.io.Serializable;
import java.math.BigDecimal;

public class XqfxyjfInfo implements Serializable{
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = 1L;

	/**
     * null
     */
    private String wid;

    /**
     * null
     */
    private String xqfid;

    /**
     * null
     */
    private BigDecimal score;

    /**
     * null
     */
    private BigDecimal version;

    /**
     * null
     */
    private String cjsj;

    /**
     * null
     */
    private BigDecimal integral;

    /**
     * null
     * @return WID null
     */
    public String getWid() {
        return wid;
    }

    /**
     * null
     * @param wid null
     */
    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    /**
     * null
     * @return XQFID null
     */
    public String getXqfid() {
        return xqfid;
    }

    /**
     * null
     * @param xqfid null
     */
    public void setXqfid(String xqfid) {
        this.xqfid = xqfid == null ? null : xqfid.trim();
    }

    /**
     * null
     * @return SCORE null
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * null
     * @param score null
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     * null
     * @return VERSION null
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * null
     * @param version null
     */
    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    /**
     * null
     * @return CJSJ null
     */
    public String getCjsj() {
        return cjsj;
    }

    /**
     * null
     * @param cjsj null
     */
    public void setCjsj(String cjsj) {
        this.cjsj = cjsj == null ? null : cjsj.trim();
    }

    /**
     * null
     * @return INTEGRAL null
     */
    public BigDecimal getIntegral() {
        return integral;
    }

    /**
     * null
     * @param integral null
     */
    public void setIntegral(BigDecimal integral) {
        this.integral = integral;
    }

    /**
     *
     * @mbggenerated 2018-01-24
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", xqfid=").append(xqfid);
        sb.append(", score=").append(score);
        sb.append(", version=").append(version);
        sb.append(", cjsj=").append(cjsj);
        sb.append(", integral=").append(integral);
        sb.append("]");
        return sb.toString();
    }
}