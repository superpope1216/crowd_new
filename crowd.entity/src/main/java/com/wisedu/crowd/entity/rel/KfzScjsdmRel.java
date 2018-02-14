package com.wisedu.crowd.entity.rel;

import java.io.Serializable;

public class KfzScjsdmRel implements Serializable {
	
	private static final long serialVersionUID = 1L;
    /**
     * wid
     */
    private String wid;

    /**
     *开发者ID
     */
    private String kfzid;

    /**
     * 用户ID
     */
    private String yhid;

    /**
     * 
     */
    private String lbdm;

    /**
     * wid
     * @return WID wid
     */
    public String getWid() {
        return wid;
    }

    /**
     * wid
     * @param wid wid
     */
    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

 
    public String getKfzid() {
        return kfzid;
    }


    public void setKfzid(String kfzid) {
        this.kfzid = kfzid == null ? null : kfzid.trim();
    }

   
    public String getYhid() {
        return yhid;
    }

    
    public void setYhid(String yhid) {
        this.yhid = yhid == null ? null : yhid.trim();
    }

  
    public String getLbdm() {
        return lbdm;
    }

    
    public void setLbdm(String lbdm) {
        this.lbdm = lbdm == null ? null : lbdm.trim();
    }

    /**
     *
     * @mbggenerated 2017-12-26
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", kfzid=").append(kfzid);
        sb.append(", yhid=").append(yhid);
        sb.append(", lbdm=").append(lbdm);
        sb.append("]");
        return sb.toString();
    }
}