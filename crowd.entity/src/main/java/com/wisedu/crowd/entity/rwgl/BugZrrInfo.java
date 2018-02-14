package com.wisedu.crowd.entity.rwgl;

import java.io.Serializable;

public class BugZrrInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * WID
     */
    private String wid;

    /**
     * BUG责任人
     */
    private String kfzid;

    /**
     * 任务ID
     */
    private String rwid;

    /**
     * 审核人
     */
    private String shr;

    /**
     * 审核时间
     */
    private String shsj;

    /**
     * 确认理由
     */
    private String qrly;

    /**
     * BUG修改人
     */
    private String bgxgr;

    /**
     * BUG责任人工号
     */
    private String bgzrrgh;

    /**
     * BUG责任人姓名
     */
    private String bgzrrxm;

    /**
     * 结算归属部门
     */
    private String jsgsbm;

    /**
     * 结算状态
     */
    private Short jszt;

    /**
     * 结算日期
     */
    private String jsrq;

    /**
     * 是否需要特批
     */
    private Short sfxytp;

    /**
     * 特批状态
     */
    private Short tpzt;

    /**
     * 最终审核责任人
     */
    private String zzshzrr;

    /**
     * 审核不通过原因
     */
    private String shbtgyy;

    /**
     * BUG分类
     */
    private Integer bugfl;

    /**
     * 是否明确责任人
     */
    private Integer sfmqzrr;

    /**
     * 是否明确是BUG
     */
    private Integer sfmqsbug;

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
     * BUG责任人
     * @return KFZID BUG责任人
     */
    public String getKfzid() {
        return kfzid;
    }

    /**
     * BUG责任人
     * @param kfzid BUG责任人
     */
    public void setKfzid(String kfzid) {
        this.kfzid = kfzid == null ? null : kfzid.trim();
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
     * 确认理由
     * @return QRLY 确认理由
     */
    public String getQrly() {
        return qrly;
    }

    /**
     * 确认理由
     * @param qrly 确认理由
     */
    public void setQrly(String qrly) {
        this.qrly = qrly == null ? null : qrly.trim();
    }

    /**
     * BUG修改人
     * @return BGXGR BUG修改人
     */
    public String getBgxgr() {
        return bgxgr;
    }

    /**
     * BUG修改人
     * @param bgxgr BUG修改人
     */
    public void setBgxgr(String bgxgr) {
        this.bgxgr = bgxgr == null ? null : bgxgr.trim();
    }

    /**
     * BUG责任人工号
     * @return BGZRRGH BUG责任人工号
     */
    public String getBgzrrgh() {
        return bgzrrgh;
    }

    /**
     * BUG责任人工号
     * @param bgzrrgh BUG责任人工号
     */
    public void setBgzrrgh(String bgzrrgh) {
        this.bgzrrgh = bgzrrgh == null ? null : bgzrrgh.trim();
    }

    /**
     * BUG责任人姓名
     * @return BGZRRXM BUG责任人姓名
     */
    public String getBgzrrxm() {
        return bgzrrxm;
    }

    /**
     * BUG责任人姓名
     * @param bgzrrxm BUG责任人姓名
     */
    public void setBgzrrxm(String bgzrrxm) {
        this.bgzrrxm = bgzrrxm == null ? null : bgzrrxm.trim();
    }

    /**
     * 结算归属部门
     * @return JSGSBM 结算归属部门
     */
    public String getJsgsbm() {
        return jsgsbm;
    }

    /**
     * 结算归属部门
     * @param jsgsbm 结算归属部门
     */
    public void setJsgsbm(String jsgsbm) {
        this.jsgsbm = jsgsbm == null ? null : jsgsbm.trim();
    }

    /**
     * 结算状态
     * @return JSZT 结算状态
     */
    public Short getJszt() {
        return jszt;
    }

    /**
     * 结算状态
     * @param jszt 结算状态
     */
    public void setJszt(Short jszt) {
        this.jszt = jszt;
    }

    /**
     * 结算日期
     * @return JSRQ 结算日期
     */
    public String getJsrq() {
        return jsrq;
    }

    /**
     * 结算日期
     * @param jsrq 结算日期
     */
    public void setJsrq(String jsrq) {
        this.jsrq = jsrq == null ? null : jsrq.trim();
    }

    /**
     * 是否需要特批
     * @return SFXYTP 是否需要特批
     */
    public Short getSfxytp() {
        return sfxytp;
    }

    /**
     * 是否需要特批
     * @param sfxytp 是否需要特批
     */
    public void setSfxytp(Short sfxytp) {
        this.sfxytp = sfxytp;
    }

    /**
     * 特批状态
     * @return TPZT 特批状态
     */
    public Short getTpzt() {
        return tpzt;
    }

    /**
     * 特批状态
     * @param tpzt 特批状态
     */
    public void setTpzt(Short tpzt) {
        this.tpzt = tpzt;
    }

    /**
     * 最终审核责任人
     * @return ZZSHZRR 最终审核责任人
     */
    public String getZzshzrr() {
        return zzshzrr;
    }

    /**
     * 最终审核责任人
     * @param zzshzrr 最终审核责任人
     */
    public void setZzshzrr(String zzshzrr) {
        this.zzshzrr = zzshzrr == null ? null : zzshzrr.trim();
    }

    /**
     * 审核不通过原因
     * @return SHBTGYY 审核不通过原因
     */
    public String getShbtgyy() {
        return shbtgyy;
    }

    /**
     * 审核不通过原因
     * @param shbtgyy 审核不通过原因
     */
    public void setShbtgyy(String shbtgyy) {
        this.shbtgyy = shbtgyy == null ? null : shbtgyy.trim();
    }

    /**
     * BUG分类
     * @return BUGFL BUG分类
     */
    public Integer getBugfl() {
        return bugfl;
    }

    /**
     * BUG分类
     * @param bugfl BUG分类
     */
    public void setBugfl(Integer bugfl) {
        this.bugfl = bugfl;
    }

    /**
     * 是否明确责任人
     * @return SFMQZRR 是否明确责任人
     */
    public Integer getSfmqzrr() {
        return sfmqzrr;
    }

    /**
     * 是否明确责任人
     * @param sfmqzrr 是否明确责任人
     */
    public void setSfmqzrr(Integer sfmqzrr) {
        this.sfmqzrr = sfmqzrr;
    }

    /**
     * 是否明确是BUG
     * @return SFMQSBUG 是否明确是BUG
     */
    public Integer getSfmqsbug() {
        return sfmqsbug;
    }

    /**
     * 是否明确是BUG
     * @param sfmqsbug 是否明确是BUG
     */
    public void setSfmqsbug(Integer sfmqsbug) {
        this.sfmqsbug = sfmqsbug;
    }

    /**
     *
     * @mbggenerated 2017-12-08
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", kfzid=").append(kfzid);
        sb.append(", rwid=").append(rwid);
        sb.append(", shr=").append(shr);
        sb.append(", shsj=").append(shsj);
        sb.append(", qrly=").append(qrly);
        sb.append(", bgxgr=").append(bgxgr);
        sb.append(", bgzrrgh=").append(bgzrrgh);
        sb.append(", bgzrrxm=").append(bgzrrxm);
        sb.append(", jsgsbm=").append(jsgsbm);
        sb.append(", jszt=").append(jszt);
        sb.append(", jsrq=").append(jsrq);
        sb.append(", sfxytp=").append(sfxytp);
        sb.append(", tpzt=").append(tpzt);
        sb.append(", zzshzrr=").append(zzshzrr);
        sb.append(", shbtgyy=").append(shbtgyy);
        sb.append(", bugfl=").append(bugfl);
        sb.append(", sfmqzrr=").append(sfmqzrr);
        sb.append(", sfmqsbug=").append(sfmqsbug);
        sb.append("]");
        return sb.toString();
    }
}