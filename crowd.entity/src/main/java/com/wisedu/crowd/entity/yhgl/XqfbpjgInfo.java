package com.wisedu.crowd.entity.yhgl;

import java.io.Serializable;
import java.util.Date;

public class XqfbpjgInfo implements Serializable{
    /**
	 * 
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
     * 评价结果
     */
    private String pjjg;

    /**
     * 评价内容
     */
    private String pjnr;

    /**
     * 所属项目ID
     */
    private String ssxmid;

    /**
     * 开发者ID
     */
    private String kfzid;

    /**
     * 参评时间
     */
    private Date cpsj;

    /**
     * 参评者IP
     */
    private String cpzip;

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
     * 评价结果
     * @return PJJG 评价结果
     */
    public String getPjjg() {
        return pjjg;
    }

    /**
     * 评价结果
     * @param pjjg 评价结果
     */
    public void setPjjg(String pjjg) {
        this.pjjg = pjjg == null ? null : pjjg.trim();
    }

    /**
     * 评价内容
     * @return PJNR 评价内容
     */
    public String getPjnr() {
        return pjnr;
    }

    /**
     * 评价内容
     * @param pjnr 评价内容
     */
    public void setPjnr(String pjnr) {
        this.pjnr = pjnr == null ? null : pjnr.trim();
    }

    /**
     * 所属项目ID
     * @return SSXMID 所属项目ID
     */
    public String getSsxmid() {
        return ssxmid;
    }

    /**
     * 所属项目ID
     * @param ssxmid 所属项目ID
     */
    public void setSsxmid(String ssxmid) {
        this.ssxmid = ssxmid == null ? null : ssxmid.trim();
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
     * 参评时间
     * @return CPSJ 参评时间
     */
    public Date getCpsj() {
        return cpsj;
    }

    /**
     * 参评时间
     * @param cpsj 参评时间
     */
    public void setCpsj(Date cpsj) {
        this.cpsj = cpsj;
    }

    /**
     * 参评者IP
     * @return CPZIP 参评者IP
     */
    public String getCpzip() {
        return cpzip;
    }

    /**
     * 参评者IP
     * @param cpzip 参评者IP
     */
    public void setCpzip(String cpzip) {
        this.cpzip = cpzip == null ? null : cpzip.trim();
    }

    /**
     *
     * @mbggenerated 2018-01-10
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", xqfid=").append(xqfid);
        sb.append(", pjjg=").append(pjjg);
        sb.append(", pjnr=").append(pjnr);
        sb.append(", ssxmid=").append(ssxmid);
        sb.append(", kfzid=").append(kfzid);
        sb.append(", cpsj=").append(cpsj);
        sb.append(", cpzip=").append(cpzip);
        sb.append("]");
        return sb.toString();
    }
}