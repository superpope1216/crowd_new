package com.wisedu.crowd.entity.data;

import java.io.Serializable;
import java.math.BigDecimal;

public class DataDelayInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * null
     */
    private String wid;

    /**
     * null
     */
    private String rwid;

    /**
     * null
     */
    private String kfzid;

    /**
     * null
     */
    private String xqfid;

    /**
     * null
     */
    private String month;

    /**
     * null
     */
    private BigDecimal delayDay;

    /**
     * null
     */
    private String jfrq;

    /**
     * null
     */
    private String sqyssj;
    
    /**
     * 平台规则交付日期
     */
    private String ptgzjfrq;
    
    /**
     * 中标金额
     */
    private BigDecimal zbje;
    
    /**
     * 已计算金额
     */
    private BigDecimal yjsje;
    /**
     * 延期总天数
     */
    private BigDecimal delayAllDay;
    /**
     * 延期得分
     */
    private BigDecimal delayScore;
    /**
     * 所属区域
     */
    private  String ssqy;
    /**
     * 所属学校
     */
    private String ssxx;
    /**
     * 项目编号
     */
    private String xmbh;
    /**
     * 产品编号
     */
    private String ywxbh;
    public String getSsqy() {
		return ssqy;
	}

	public void setSsqy(String ssqy) {
		this.ssqy = ssqy;
	}

	public String getSsxx() {
		return ssxx;
	}

	public void setSsxx(String ssxx) {
		this.ssxx = ssxx;
	}

	public String getXmbh() {
		return xmbh;
	}

	public void setXmbh(String xmbh) {
		this.xmbh = xmbh;
	}

	public String getYwxbh() {
		return ywxbh;
	}

	public void setYwxbh(String ywxbh) {
		this.ywxbh = ywxbh;
	}

	/**
     * 模块编号
     */
    private String mkbh;

    public String getMkbh() {
		return mkbh;
	}

	public void setMkbh(String mkbh) {
		this.mkbh = mkbh;
	}

	public BigDecimal getZbje() {
		return zbje;
	}

	public void setZbje(BigDecimal zbje) {
		this.zbje = zbje;
	}

	public BigDecimal getYjsje() {
		return yjsje;
	}

	public void setYjsje(BigDecimal yjsje) {
		this.yjsje = yjsje;
	}

	public BigDecimal getDelayAllDay() {
		return delayAllDay;
	}

	public void setDelayAllDay(BigDecimal delayAllDay) {
		this.delayAllDay = delayAllDay;
	}

	public BigDecimal getDelayScore() {
		return delayScore;
	}

	public void setDelayScore(BigDecimal delayScore) {
		this.delayScore = delayScore;
	}

	public String getPtgzjfrq() {
		return ptgzjfrq;
	}

	public void setPtgzjfrq(String ptgzjfrq) {
		this.ptgzjfrq = ptgzjfrq;
	}

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
     * @return RWID null
     */
    public String getRwid() {
        return rwid;
    }

    /**
     * null
     * @param rwid null
     */
    public void setRwid(String rwid) {
        this.rwid = rwid == null ? null : rwid.trim();
    }

    /**
     * null
     * @return KFZID null
     */
    public String getKfzid() {
        return kfzid;
    }

    /**
     * null
     * @param kfzid null
     */
    public void setKfzid(String kfzid) {
        this.kfzid = kfzid == null ? null : kfzid.trim();
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
     * @return MONTH null
     */
    public String getMonth() {
        return month;
    }

    /**
     * null
     * @param month null
     */
    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    /**
     * null
     * @return DELAY_DAY null
     */
    public BigDecimal getDelayDay() {
        return delayDay;
    }

    /**
     * null
     * @param delayDay null
     */
    public void setDelayDay(BigDecimal delayDay) {
        this.delayDay = delayDay;
    }

    /**
     * null
     * @return JFRQ null
     */
    public String getJfrq() {
        return jfrq;
    }

    /**
     * null
     * @param jfrq null
     */
    public void setJfrq(String jfrq) {
        this.jfrq = jfrq == null ? null : jfrq.trim();
    }

    /**
     * null
     * @return SQYSSJ null
     */
    public String getSqyssj() {
        return sqyssj;
    }

    /**
     * null
     * @param sqyssj null
     */
    public void setSqyssj(String sqyssj) {
        this.sqyssj = sqyssj == null ? null : sqyssj.trim();
    }

    /**
     *
     * @mbggenerated 2018-02-08
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", rwid=").append(rwid);
        sb.append(", kfzid=").append(kfzid);
        sb.append(", xqfid=").append(xqfid);
        sb.append(", month=").append(month);
        sb.append(", delayDay=").append(delayDay);
        sb.append(", jfrq=").append(jfrq);
        sb.append(", sqyssj=").append(sqyssj);
        sb.append("]");
        return sb.toString();
    }
}