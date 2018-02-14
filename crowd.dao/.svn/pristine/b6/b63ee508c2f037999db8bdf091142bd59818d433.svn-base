package com.wisedu.crowd.dao.dictionary.extend;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.wisedu.crowd.entity.dictionary.DictionaryInfo;

public interface DictionaryInfoExtendMapper {
	public List<DictionaryInfo> selectAllByTable(@Param("tableName")String tableName);
	
	public List<DictionaryInfo> selectByCondtion(@Param("tableName")String tableName,@Param("dictionary")DictionaryInfo dictionary);
	
	/**
	 * 查询产品线信息
	 * @param dictionary
	 * @return
	 */
	public List<DictionaryInfo> selectBmByCondition(@Param("tableName")String tableName,@Param("dictionary") DictionaryInfo dictionary);
	
	
	List<DictionaryInfo> selectFbxxByCondition(@Param("xmbh") String xmbh);
	
	Map<String,Object> selectRwxsByBm(@Param("bm") String bm);
	

}