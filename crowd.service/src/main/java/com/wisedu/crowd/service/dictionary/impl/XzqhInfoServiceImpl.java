package com.wisedu.crowd.service.dictionary.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.code.DictionaryEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.dictionary.XzqhInfoMapper;
import com.wisedu.crowd.dao.dictionary.extend.DictionaryInfoExtendMapper;
import com.wisedu.crowd.entity.dictionary.DictionaryInfo;
import com.wisedu.crowd.entity.dictionary.XzqhInfo;
import com.wisedu.crowd.service.dictionary.DictionaryService;
import com.wisedu.crowd.service.dictionary.XzqhInfoService;

@Service("xzqhInfoService")
public class XzqhInfoServiceImpl implements  XzqhInfoService {
   
	@Autowired
	private XzqhInfoMapper  xzqhInfoMapper;
	@Override
	public List<XzqhInfo> selectByCondition(XzqhInfo xzqhInfo) throws ServiceException {
		return xzqhInfoMapper.selectByCondition(xzqhInfo);
	}

	

}
