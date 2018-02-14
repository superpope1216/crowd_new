package com.wisedu.crowd.service.xtgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.xtgl.extend.YwxShryInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.xtgl.extend.YwxShryInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.xtgl.YwxShryInfoService;

@Service("ywxShryInfoService")
public class YwxShryInfoServiceImpl implements YwxShryInfoService{

	@Autowired
	private YwxShryInfoExtendMapper ywxShryInfoExtendMapper;
	@Override
	public DataResult<List<YwxShryInfoExtend>> selectDisplayByCondition(QueryCondition<YwxShryInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		return DataResult.success(ywxShryInfoExtendMapper.selectDisplayByCondition(condition));
	}

}
