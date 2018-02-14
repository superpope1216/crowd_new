package com.wisedu.crowd.entity.data.delay.extend;

import java.io.Serializable;

import com.wisedu.crowd.entity.data.delay.DataDelayKfzMonthInfo;

public class DataDelayKfzMonthInfoExtend extends DataDelayKfzMonthInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String minMonth;
	
	private String maxMonth;

	public String getMinMonth() {
		return minMonth;
	}

	public void setMinMonth(String minMonth) {
		this.minMonth = minMonth;
	}

	public String getMaxMonth() {
		return maxMonth;
	}

	public void setMaxMonth(String maxMonth) {
		this.maxMonth = maxMonth;
	}

}
