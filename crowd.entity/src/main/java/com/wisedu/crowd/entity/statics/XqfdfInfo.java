package com.wisedu.crowd.entity.statics;

import java.io.Serializable;
import java.math.BigDecimal;

public class XqfdfInfo implements Serializable{
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
     * 任务ID
     */
    private String rwid;

    /**
     * 得分类别
     */
    private String flag;

    /**
     * 得分
     */
    private BigDecimal sroce;

    /**
     * 说明
     */
    private String comment1;

    /**
     * 创建时间
     */
    private String sjsj;

    /**
     * 需求方ID
     */
    private String xqfid;

    /**
     * 发生时间
     */
    private String fssj;

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
     * 任务ID
     * @return RWID 任务ID
     */
    public String getRwid() {
        return rwid;
    }

    /**
     * 任务ID
     * @param rwid 任务ID
     */
    public void setRwid(String rwid) {
        this.rwid = rwid == null ? null : rwid.trim();
    }

    /**
     * 得分类别
     * @return FLAG 得分类别
     */
    public String getFlag() {
        return flag;
    }

    /**
     * 得分类别
     * @param flag 得分类别
     */
    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    /**
     * 得分
     * @return SROCE 得分
     */
    public BigDecimal getSroce() {
        return sroce;
    }

    /**
     * 得分
     * @param sroce 得分
     */
    public void setSroce(BigDecimal sroce) {
        this.sroce = sroce;
    }

    /**
     * 说明
     * @return COMMENT1 说明
     */
    public String getComment1() {
        return comment1;
    }

    /**
     * 说明
     * @param comment1 说明
     */
    public void setComment1(String comment1) {
        this.comment1 = comment1 == null ? null : comment1.trim();
    }

    /**
     * 创建时间
     * @return SJSJ 创建时间
     */
    public String getSjsj() {
        return sjsj;
    }

    /**
     * 创建时间
     * @param sjsj 创建时间
     */
    public void setSjsj(String sjsj) {
        this.sjsj = sjsj == null ? null : sjsj.trim();
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
     * 发生时间
     * @return FSSJ 发生时间
     */
    public String getFssj() {
        return fssj;
    }

    /**
     * 发生时间
     * @param fssj 发生时间
     */
    public void setFssj(String fssj) {
        this.fssj = fssj == null ? null : fssj.trim();
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
        sb.append(", rwid=").append(rwid);
        sb.append(", flag=").append(flag);
        sb.append(", sroce=").append(sroce);
        sb.append(", comment1=").append(comment1);
        sb.append(", sjsj=").append(sjsj);
        sb.append(", xqfid=").append(xqfid);
        sb.append(", fssj=").append(fssj);
        sb.append("]");
        return sb.toString();
    }
}