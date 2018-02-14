package com.wisedu.crowd.service.system.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wisedu.crowd.dao.system.DataCodeMapper;
import com.wisedu.crowd.entity.system.DataCode;
import com.wisedu.crowd.service.system.DataCodeService;

@Service("dataCodeService")
@Transactional
public class DataCodeServiceImpl implements DataCodeService{
	
	@Autowired
	private  DataCodeMapper dataCodeMapper;
	@Override
	public List<DataCode> selectAllByTable(String tableName) {
		return dataCodeMapper.selectAllByTable(tableName);
	}
    
}
