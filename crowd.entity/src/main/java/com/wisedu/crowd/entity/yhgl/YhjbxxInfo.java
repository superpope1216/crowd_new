package com.wisedu.crowd.entity.yhgl;

import java.io.Serializable;
import java.util.Date;

public class YhjbxxInfo implements Serializable{
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
    private String sjh;

    /**
     * 
     */
    private String yhmm;

    /**
     * 
     */
    private Integer sfkfz;

    /**
     * 
     */
    private Integer sfxqf;

    /**
     * 
     */
    private Date zcsj;

    /**
     * 
     */
    private String zczip;
    /**
     * 是否运营管理人员
     */
    private String sfyyglry;

    public String getSfyyglry() {
		return sfyyglry;
	}

	public void setSfyyglry(String sfyyglry) {
		this.sfyyglry = sfyyglry;
	}

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
     * @return SJH 
     */
    public String getSjh() {
        return sjh;
    }

    /**
     * 
     * @param sjh 
     */
    public void setSjh(String sjh) {
        this.sjh = sjh == null ? null : sjh.trim();
    }

    /**
     * 
     * @return YHMM 
     */
    public String getYhmm() {
        return yhmm;
    }

    /**
     * 
     * @param yhmm 
     */
    public void setYhmm(String yhmm) {
        this.yhmm = yhmm == null ? null : yhmm.trim();
    }

    /**
     * 
     * @return SFKFZ 
     */
    public Integer getSfkfz() {
        return sfkfz;
    }

    /**
     * 
     * @param sfkfz 
     */
    public void setSfkfz(Integer sfkfz) {
        this.sfkfz = sfkfz;
    }

    /**
     * 
     * @return SFXQF 
     */
    public Integer getSfxqf() {
        return sfxqf;
    }

    /**
     * 
     * @param sfxqf 
     */
    public void setSfxqf(Integer sfxqf) {
        this.sfxqf = sfxqf;
    }

    /**
     * 
     * @return ZCSJ 
     */
    public Date getZcsj() {
        return zcsj;
    }

    /**
     * 
     * @param zcsj 
     */
    public void setZcsj(Date zcsj) {
        this.zcsj = zcsj;
    }

    /**
     * 
     * @return ZCZIP 
     */
    public String getZczip() {
        return zczip;
    }

    /**
     * 
     * @param zczip 
     */
    public void setZczip(String zczip) {
        this.zczip = zczip == null ? null : zczip.trim();
    }

    /**
     *
     * @mbggenerated 2017-11-02
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", sjh=").append(sjh);
        sb.append(", yhmm=").append(yhmm);
        sb.append(", sfkfz=").append(sfkfz);
        sb.append(", sfxqf=").append(sfxqf);
        sb.append(", zcsj=").append(zcsj);
        sb.append(", zczip=").append(zczip);
        sb.append("]");
        return sb.toString();
    }
}