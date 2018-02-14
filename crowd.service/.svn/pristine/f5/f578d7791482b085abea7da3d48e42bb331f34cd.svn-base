package com.wisedu.crowd.service.dictionary;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.wisedu.crowd.common.code.DictionaryEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dictionary.DictionaryInfo;
import com.wisedu.crowd.service.dto.DataResult;

public interface DictionaryService {

	List<DictionaryInfo> selectAllByTable(DictionaryEnum dictionaryEnum)  throws ServiceException;
	
	List<DictionaryInfo> selectByCondtion(DictionaryEnum dictionaryEnum, DictionaryInfo dictionary) throws ServiceException;
	
	DataResult<List<DictionaryInfo>> selectFbxxByCondition(String xmbh) throws ServiceException;
	
	Map<String,Object> selectRwxsByBm(String bm) throws ServiceException;
	
}
