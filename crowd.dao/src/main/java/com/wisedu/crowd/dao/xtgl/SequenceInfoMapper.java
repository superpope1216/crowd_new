package com.wisedu.crowd.dao.xtgl;

import org.apache.ibatis.annotations.Param;

public interface SequenceInfoMapper {

	Integer createNewSequence(@Param("yearMonth") String yearMonth);
	
	String selectNewSepuence(@Param("yearMonth") String yearMonth);
	
}
