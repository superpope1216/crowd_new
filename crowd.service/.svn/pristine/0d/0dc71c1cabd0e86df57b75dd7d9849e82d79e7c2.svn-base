package com.wisedu.crowd.service.xtgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.xtgl.extend.YwxdzbInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.xtgl.extend.YwxdzbInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.xtgl.YwxdzbInfoService;

@Service("ywxdzbInfoService")
public class YwxdzbInfoServiceImpl implements YwxdzbInfoService{
	@Autowired
	private YwxdzbInfoExtendMapper ywxdzbInfoExtendMapper;
	@Override
	public DataResult<List<YwxdzbInfoExtend>> selectByCondition(QueryCondition<YwxdzbInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		return DataResult.success(ywxdzbInfoExtendMapper.selectByCondition(condition));
	}

}
