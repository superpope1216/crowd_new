package com.wisedu.crowd.dao.rel.extend;

import java.util.List;

import com.wisedu.crowd.entity.rel.KfzScjsdmRel;

public interface KfzScjsdmRelExtendMapper {
	/**
	 * 批量删除
	 * @param record
	 */
	public void delKfzScjsdmRel(String kfzid);
	
	/**
	 * 批量新增
	 * @param record
	 */
	public void addKfzScjsdmRel(List<KfzScjsdmRel> list);
	
}