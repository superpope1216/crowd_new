package com.wisedu.crowd.entity.yhgl;

import java.io.Serializable;

public class YhjbxxLoginLogInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 
     */
    private String wid;

    /**
     * 
     */
    private String yhid;

    /**
     * 手机号
     */
    private String sjh;

    /**
     * 姓名
     */
    private String xm;

    /**
     * 昵称
     */
    private String nc;

    /**
     * 登录时间
     */
    private String loginTime;

    /**
     * 登录IP
     */
    private String loginIp;

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
     * 
     * @return YHID 
     */
    public String getYhid() {
        return yhid;
    }

    /**
     * 
     * @param yhid 
     */
    public void setYhid(String yhid) {
        this.yhid = yhid == null ? null : yhid.trim();
    }

    /**
     * 手机号
     * @return SJH 手机号
     */
    public String getSjh() {
        return sjh;
    }

    /**
     * 手机号
     * @param sjh 手机号
     */
    public void setSjh(String sjh) {
        this.sjh = sjh == null ? null : sjh.trim();
    }

    /**
     * 姓名
     * @return XM 姓名
     */
    public String getXm() {
        return xm;
    }

    /**
     * 姓名
     * @param xm 姓名
     */
    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    /**
     * 昵称
     * @return NC 昵称
     */
    public String getNc() {
        return nc;
    }

    /**
     * 昵称
     * @param nc 昵称
     */
    public void setNc(String nc) {
        this.nc = nc == null ? null : nc.trim();
    }

    /**
     * 登录时间
     * @return LOGIN_TIME 登录时间
     */
    public String getLoginTime() {
        return loginTime;
    }

    /**
     * 登录时间
     * @param loginTime 登录时间
     */
    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime == null ? null : loginTime.trim();
    }

    /**
     * 登录IP
     * @return LOGIN_IP 登录IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 登录IP
     * @param loginIp 登录IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
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
        sb.append(", yhid=").append(yhid);
        sb.append(", sjh=").append(sjh);
        sb.append(", xm=").append(xm);
        sb.append(", nc=").append(nc);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", loginIp=").append(loginIp);
        sb.append("]");
        return sb.toString();
    }
}