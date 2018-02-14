package com.wisedu.crowd.dao.rel.extend;

import java.util.List;

import com.wisedu.crowd.entity.rel.KfzGzlbdmRel;

public interface KfzGzlbdmRelExtendMapper {
	/**
	 * 批量删除
	 * @param record
	 */
	public void delKfzGzlbdmRel(String kfzid);
	
	/**
	 * 批量新增
	 * @param record
	 */
	public void addKfzGzlbdmRel(List<KfzGzlbdmRel> list);
	
}