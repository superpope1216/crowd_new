package com.wisedu.crowd.dao;

import org.apache.ibatis.annotations.Param;

public interface BaseInfoMapper {
	
	int delete (@Param("tableName") String tableName);
	
	int checkExistTable(@Param("tableName") String tableName);
	
	int deleteTable(@Param("tableName") String tableName);
	
	int insert(@Param("tableName") String tableName,@Param("oldTableName") String oldTableName);
	
	int createNewTable(@Param("tableName") String tableName,@Param("oldTableName") String oldTableName);
}
