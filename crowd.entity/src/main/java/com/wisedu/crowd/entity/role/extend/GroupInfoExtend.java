package com.wisedu.crowd.entity.role.extend;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.wisedu.crowd.entity.role.GroupInfo;

public class GroupInfoExtend extends GroupInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> wids;

	public List<String> getWids() {
		return wids;
	}

	public void setWids(List<String> wids) {
		this.wids = wids;
	}
   
}