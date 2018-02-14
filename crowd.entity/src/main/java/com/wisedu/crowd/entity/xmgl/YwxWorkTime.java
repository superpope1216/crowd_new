package com.wisedu.crowd.entity.xmgl;

import java.io.Serializable;

public class YwxWorkTime implements Serializable{
	
	private static final long serialVersionUID = 1L;
    /**
     * 
     */
    private String wid;

    /**
     * 业务线
     */
    private String ywx;

    /**
     * 版本号
     */
    private String version;

    /**
     * 选项
     */
    private String optionName;

    /**
     * 标准工时
     */
    private String standardWork;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 
     */
    private String price;

    /**
     * 
     * @return WID 
     */
    public String getWid() {
        return wid;
    }

    /**
     * 
     * @param wid 
     */
    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
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
     * 版本号
     * @return VERSION 版本号
     */
    public String getVersion() {
        return version;
    }

    /**
     * 版本号
     * @param version 版本号
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * 选项
     * @return OPTION_NAME 选项
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * 选项
     * @param optionName 选项
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    /**
     * 标准工时
     * @return STANDARD_WORK 标准工时
     */
    public String getStandardWork() {
        return standardWork;
    }

    /**
     * 标准工时
     * @param standardWork 标准工时
     */
    public void setStandardWork(String standardWork) {
        this.standardWork = standardWork == null ? null : standardWork.trim();
    }

    /**
     * 备注
     * @return REMARKS 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 备注
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * 
     * @return PRICE 
     */
    public String getPrice() {
        return price;
    }

    /**
     * 
     * @param price 
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
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
        sb.append(", ywx=").append(ywx);
        sb.append(", version=").append(version);
        sb.append(", optionName=").append(optionName);
        sb.append(", standardWork=").append(standardWork);
        sb.append(", remarks=").append(remarks);
        sb.append(", price=").append(price);
        sb.append("]");
        return sb.toString();
    }
}