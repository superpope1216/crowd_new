package com.wisedu.crowd.service.xtgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.xtgl.extend.YwxdzbInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface YwxdzbInfoService {
	DataResult<List<YwxdzbInfoExtend>> selectByCondition(QueryCondition<YwxdzbInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
