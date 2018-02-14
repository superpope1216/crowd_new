package com.wisedu.crowd.entity.rwgl.extend;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.wisedu.crowd.entity.rwgl.RwjbxxInfo;

public class RwjbxxInfoExtend extends RwjbxxInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 任务进度
	 */
	private String rwjd;

	private List<String> xmzts;

	private Integer minXmzt;

	private Integer maxXmzt;
	
	private Date maxZbjzrq;

	

	private Long minJe;
	//需求创建时间查询最小年度
	private String minCjsjYear;
	//需求创建时间查询最大年度
	private String maxCjsjYear;

	public String getMinCjsjYear() {
		return minCjsjYear;
	}

	public void setMinCjsjYear(String minCjsjYear) {
		this.minCjsjYear = minCjsjYear;
	}

	public String getMaxCjsjYear() {
		return maxCjsjYear;
	}

	public void setMaxCjsjYear(String maxCjsjYear) {
		this.maxCjsjYear = maxCjsjYear;
	}

	public Long getMinJe() {
		return minJe;
	}

	public void setMinJe(Long minJe) {
		this.minJe = minJe;
	}

	public Integer getMinXmzt() {
		return minXmzt;
	}

	public void setMinXmzt(Integer minXmzt) {
		this.minXmzt = minXmzt;
	}

	public Integer getMaxXmzt() {
		return maxXmzt;
	}

	public void setMaxXmzt(Integer maxXmzt) {
		this.maxXmzt = maxXmzt;
	}

	/**
	 * 项目组业务线
	 */
	private String xmzywx;
	/**
	 * 项目组业务线名称
	 */
	private String xmzywxDisplay;

	private String rwjdDisplay;

	private String kfkjDisplay;

	private String xmztDisplay;

	private String rwxsDisplay;

	private String rwlxDisplay;

	private String rwnydDisplay;

	private String dzjbDisplay;

	private String ywxlbDisplay;

	/**
	 * 是否需要查询需求方信息
	 */
	private Boolean needXqfxx = false;
	/**
	 * 需求方昵称
	 */
	private String xqfnc;
	
	/**
	 * 需求方姓名
	 */
	
	private String xqfxm;
	

	/**
	 * 是否需要查询开发者信息
	 */
	private Boolean needKfzxx;
	
	private Boolean needSumRbxx;
	public Boolean getNeedSumRbxx() {
		return needSumRbxx;
	}

	public void setNeedSumRbxx(Boolean needSumRbxx) {
		this.needSumRbxx = needSumRbxx;
	}
	private String  rbgzl;
	
	private String ywcbl;

	public String getYwcbl() {
		return ywcbl;
	}

	public void setYwcbl(String ywcbl) {
		this.ywcbl = ywcbl;
	}

	public String getRbgzl() {
		return rbgzl;
	}

	public void setRbgzl(String rbgzl) {
		this.rbgzl = rbgzl;
	}

	private Boolean needChild;

	private Boolean needChildByKfz;

	private Integer childCount;
	/**
	 * 投标人数
	 */
	private Integer childKfzCount;

	private String fbsj;

	private Date shtgsj;
	
	private String condition;
	
	/**
	 * 延期任务统计标准
	 */
	private Boolean needDelaySum;
	
	/**
	 * 延期任务统计月份
	 */
	private String delaySumMonth;

	public String getDelaySumMonth() {
		return delaySumMonth;
	}

	public void setDelaySumMonth(String delaySumMonth) {
		this.delaySumMonth = delaySumMonth;
	}

	public Boolean getNeedDelaySum() {
		return needDelaySum;
	}

	public void setNeedDelaySum(Boolean needDelaySum) {
		this.needDelaySum = needDelaySum;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Date getShtgsj() {
		return shtgsj;
	}

	public void setShtgsj(Date shtgsj) {
		this.shtgsj = shtgsj;
	}
	public Date getMaxZbjzrq() {
		return maxZbjzrq;
	}

	public void setMaxZbjzrq(Date maxZbjzrq) {
		this.maxZbjzrq = maxZbjzrq;
	}

	public String getFbsj() {
		return fbsj;
	}

	public void setFbsj(String fbsj) {
		this.fbsj = fbsj;
	}

	public Integer getChildKfzCount() {
		return childKfzCount;
	}

	public void setChildKfzCount(Integer childKfzCount) {
		this.childKfzCount = childKfzCount;
	}

	private Boolean needRwcf;

	private Integer rwcfCount;
	
	/**
	 * 是否需要统计投标新
	 */
	private Boolean needTbSum;
	
	private Integer tbSum;
	/**
	 * 是否需要统计BUG的责任人信息
	 */
	private Boolean needBugZrr;
	public Boolean getNeedBugZrr() {
		return needBugZrr;
	}

	public void setNeedBugZrr(Boolean needBugZrr) {
		this.needBugZrr = needBugZrr;
	}

	/**
	 * BUG责任人ID
	 */
	private String bugZrr;
	

	public String getBugZrr() {
		return bugZrr;
	}

	public void setBugZrr(String bugZrr) {
		this.bugZrr = bugZrr;
	}

	public Integer getTbSum() {
		return tbSum;
	}

	public void setTbSum(Integer tbSum) {
		this.tbSum = rwcfCount;
	}

	public Boolean getNeedTbSum() {
		return needTbSum;
	}

	public void setNeedTbSum(Boolean needTbSum) {
		this.needTbSum = needTbSum;
	}

	public Integer getRwcfCount() {
		return rwcfCount;
	}

	public void setRwcfCount(Integer rwcfCount) {
		this.rwcfCount = rwcfCount;
	}

	public Boolean getNeedRwcf() {
		return needRwcf;
	}

	public void setNeedRwcf(Boolean needRwcf) {
		this.needRwcf = needRwcf;
	}

	public Integer getChildCount() {
		return childCount;
	}

	public void setChildCount(Integer childCount) {
		this.childCount = childCount;
	}

	private RwtbxxInfoExtend rwtbxxInfoExtend;

	private RwcfxxInfoExtend rwcfxxInfoExtend;

	public RwcfxxInfoExtend getRwcfxxInfoExtend() {
		return rwcfxxInfoExtend;
	}

	public void setRwcfxxInfoExtend(RwcfxxInfoExtend rwcfxxInfoExtend) {
		this.rwcfxxInfoExtend = rwcfxxInfoExtend;
	}

	public RwtbxxInfoExtend getRwtbxxInfoExtend() {
		return rwtbxxInfoExtend;
	}

	public void setRwtbxxInfoExtend(RwtbxxInfoExtend rwtbxxInfoExtend) {
		this.rwtbxxInfoExtend = rwtbxxInfoExtend;
	}

	public Boolean getNeedChild() {
		return needChild;
	}

	public void setNeedChild(Boolean needChild) {
		this.needChild = needChild;
	}

	public Boolean getNeedChildByKfz() {
		return needChildByKfz;
	}

	public void setNeedChildByKfz(Boolean needChildByKfz) {
		this.needChildByKfz = needChildByKfz;
	}

	public Boolean getNeedXqfxx() {
		return needXqfxx;
	}

	public Boolean getNeedKfzxx() {
		return needKfzxx;
	}

	/**
	 * 开发者昵称
	 */
	private String kfznc;
	
	private String kfzxm;

	public String getXqfxm() {
		return xqfxm;
	}

	public void setXqfxm(String xqfxm) {
		this.xqfxm = xqfxm;
	}

	public String getKfzxm() {
		return kfzxm;
	}

	public void setKfzxm(String kfzxm) {
		this.kfzxm = kfzxm;
	}

	public String getXmzywx() {
		return xmzywx;
	}

	public void setXmzywx(String xmzywx) {
		this.xmzywx = xmzywx;
	}

	public String getXmzywxDisplay() {
		return xmzywxDisplay;
	}

	public void setXmzywxDisplay(String xmzywxDisplay) {
		this.xmzywxDisplay = xmzywxDisplay;
	}

	public void setNeedXqfxx(Boolean needXqfxx) {
		this.needXqfxx = needXqfxx;
	}

	public String getXqfnc() {
		return xqfnc;
	}

	public void setXqfnc(String xqfnc) {
		this.xqfnc = xqfnc;
	}

	public void setNeedKfzxx(Boolean needKfzxx) {
		this.needKfzxx = needKfzxx;
	}

	public String getKfznc() {
		return kfznc;
	}

	public void setKfznc(String kfznc) {
		this.kfznc = kfznc;
	}

	public List<String> getXmzts() {
		return xmzts;
	}

	public void setXmzts(List<String> xmzts) {
		this.xmzts = xmzts;
	}

	public String getYwxlbDisplay() {
		return ywxlbDisplay;
	}

	public void setYwxlbDisplay(String ywxlbDisplay) {
		this.ywxlbDisplay = ywxlbDisplay;
	}

	public String getDzjbDisplay() {
		return dzjbDisplay;
	}

	public void setDzjbDisplay(String dzjbDisplay) {
		this.dzjbDisplay = dzjbDisplay;
	}

	public String getRwxsDisplay() {
		return rwxsDisplay;
	}

	public void setRwxsDisplay(String rwxsDisplay) {
		this.rwxsDisplay = rwxsDisplay;
	}

	public String getRwlxDisplay() {
		return rwlxDisplay;
	}

	public void setRwlxDisplay(String rwlxDisplay) {
		this.rwlxDisplay = rwlxDisplay;
	}

	public String getRwnydDisplay() {
		return rwnydDisplay;
	}

	public void setRwnydDisplay(String rwnydDisplay) {
		this.rwnydDisplay = rwnydDisplay;
	}

	public String getRwjd() {
		return rwjd;
	}

	public void setRwjd(String rwjd) {
		this.rwjd = rwjd;
	}

	public String getRwjdDisplay() {
		return rwjdDisplay;
	}

	public void setRwjdDisplay(String rwjdDisplay) {
		this.rwjdDisplay = rwjdDisplay;
	}

	public String getKfkjDisplay() {
		return kfkjDisplay;
	}

	public void setKfkjDisplay(String kfkjDisplay) {
		this.kfkjDisplay = kfkjDisplay;
	}

	public String getXmztDisplay() {
		return xmztDisplay;
	}

	public void setXmztDisplay(String xmztDisplay) {
		this.xmztDisplay = xmztDisplay;
	}

}
