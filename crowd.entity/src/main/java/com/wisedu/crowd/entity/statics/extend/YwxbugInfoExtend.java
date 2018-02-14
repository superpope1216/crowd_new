package com.wisedu.crowd.entity.statics.extend;

import java.io.Serializable;
import java.math.BigDecimal;

import com.wisedu.crowd.entity.statics.YwxbugInfo;

/**
 * 业务线BUG信息
 * @author de
 *
 */
public class YwxbugInfoExtend extends YwxbugInfo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private String beginMonth;
	
	private String endMonth;
	
	/**
	 * bug率
	 */
	private String bugl;

	public String getBugl() {
		return bugl;
	}

	public void setBugl(String bugl) {
		this.bugl = bugl;
	}

	public String getBeginMonth() {
		return beginMonth;
	}

	public void setBeginMonth(String beginMonth) {
		this.beginMonth = beginMonth;
	}

	public String getEndMonth() {
		return endMonth;
	}

	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}
}