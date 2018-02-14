package com.wisedu.crowd.service.xtgl.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.xtgl.SequenceInfoMapper;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.xtgl.SequenceInfoService;

@Service("sequenceInfoService")
public class SequenceInfoServiceImpl implements SequenceInfoService{

	@Autowired
	private SequenceInfoMapper sequenceInfoMapper;
	@Override
	public DataResult<Integer> createNewSequence(String yearMonth, CustomOperateLog log) throws ServiceException {
		return DataResult.success(sequenceInfoMapper.createNewSequence(yearMonth));
	}

	@Override
	public DataResult<String> selectNewSepuence(String yearMonth, CustomOperateLog log) throws ServiceException {
		return DataResult.success(sequenceInfoMapper.selectNewSepuence(yearMonth));
	}

	@Override
	public DataResult<String> selectNewRwbh(String yearMonth, CustomOperateLog log) throws ServiceException {
		try{
			return DataResult.success(yearMonth+this.selectNewSepuence(yearMonth, log).getDatas());
		}catch(Exception e){
			this.createNewSequence(yearMonth, log);
			return DataResult.success(yearMonth+this.selectNewSepuence(yearMonth, log).getDatas());
		}
	}

}
