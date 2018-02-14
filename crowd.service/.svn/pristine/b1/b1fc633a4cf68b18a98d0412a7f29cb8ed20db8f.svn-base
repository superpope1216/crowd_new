package com.wisedu.crowd.service.statics.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.dao.statics.extend.YwxbugInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.extend.YwxbugInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.YwxbugInfoService;

@Service("ywxbugInfoService")
public class YwxbugInfoServiceImpl implements YwxbugInfoService {

	@Autowired
	private YwxbugInfoExtendMapper ywxbugInfoExtendMapper;
	@Override
	public DataResult<List<YwxbugInfoExtend>> selectStaticsMonthYwxbugInfo(QueryCondition<YwxbugInfoExtend> condition,
			CustomOperateLog log) throws SecurityException {
		return DataResult.success(ywxbugInfoExtendMapper.selectStaticsMonthYwxbugInfo(condition));
	}

	@Override
	public DataResult<List<YwxbugInfoExtend>> selectStaticsYwxbugInfo(QueryCondition<YwxbugInfoExtend> condition,
			CustomOperateLog log) throws SecurityException {
		return DataResult.success(ywxbugInfoExtendMapper.selectStaticsYwxbugInfo(condition));
	}

	@Override
	public DataResult<List<YwxbugInfoExtend>> selectStaticsMonthBugInfo(QueryCondition<YwxbugInfoExtend> condition,
			CustomOperateLog log) throws SecurityException {
		return DataResult.success(ywxbugInfoExtendMapper.selectStaticsMonthBugInfo(condition));
	}

	@Override
	public DataResult<Map<String, Object>> getYwxBugtjxx(QueryCondition<YwxbugInfoExtend> condition,
			CustomOperateLog log) throws SecurityException {
		return DataResult.success(ywxbugInfoExtendMapper.getYwxBugtjxx(condition));
	}

}
