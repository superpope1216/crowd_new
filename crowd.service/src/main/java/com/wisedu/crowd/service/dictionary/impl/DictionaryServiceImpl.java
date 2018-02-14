package com.wisedu.crowd.service.dictionary.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.code.DictionaryEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.dictionary.extend.DictionaryInfoExtendMapper;
import com.wisedu.crowd.entity.dictionary.DictionaryInfo;
import com.wisedu.crowd.service.dictionary.DictionaryService;
import com.wisedu.crowd.service.dto.DataResult;

@Service("dictionaryService")
public class DictionaryServiceImpl implements DictionaryService {

	@Autowired
	private DictionaryInfoExtendMapper dictionaryInfoExtendMapper;
	@Override
	public List<DictionaryInfo> selectAllByTable(DictionaryEnum dictionaryEnum) throws ServiceException {
		return dictionaryInfoExtendMapper.selectAllByTable(dictionaryEnum.getCode());
	}

	@Override
	public List<DictionaryInfo> selectByCondtion(DictionaryEnum dictionaryEnum, DictionaryInfo dictionary) throws ServiceException {
	
		if(dictionaryEnum.getCode().equals(DictionaryEnum.T_CROWD_XMGL_YWX.getCode())){
			return dictionaryInfoExtendMapper.selectBmByCondition(dictionaryEnum.getCode(), dictionary);
		}
		return dictionaryInfoExtendMapper.selectByCondtion(dictionaryEnum.getCode(), dictionary);
	}

	@Override
	public DataResult<List<DictionaryInfo>> selectFbxxByCondition(String xmbh) throws ServiceException {
		return DataResult.success(dictionaryInfoExtendMapper.selectFbxxByCondition(xmbh));
	}

	@Override
	public Map<String, Object> selectRwxsByBm(String bm) throws ServiceException {
		return dictionaryInfoExtendMapper.selectRwxsByBm(bm);
	}

}
