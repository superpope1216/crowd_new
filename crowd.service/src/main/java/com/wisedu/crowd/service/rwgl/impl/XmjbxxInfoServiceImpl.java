package com.wisedu.crowd.service.rwgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.dao.rwgl.extend.XmjbxxInfoExtendMapper;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.XmjbxxInfo;
import com.wisedu.crowd.entity.rwgl.extend.XmjbxxInfoExtend;
import com.wisedu.crowd.service.rwgl.XmjbxxInfoService;

@Service("xmjbxxInfoService")
public class XmjbxxInfoServiceImpl implements XmjbxxInfoService {

	@Autowired
	private XmjbxxInfoExtendMapper xmjbxxInfoExtendMapper;
	@Override
	public DataResult<List<XmjbxxInfo>> selectByCondition(QueryCondition<XmjbxxInfoExtend> condition,CustomOperateLog log) throws ServiceException {
		return DataResult.success(xmjbxxInfoExtendMapper.selectByCondition(condition));
	}

}
