package com.wisedu.crowd.service.yhgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.YhjbxxViewInfo;
import com.wisedu.crowd.service.dto.DataResult;

public interface YhjbxxViewInfoService {

	DataResult<List<YhjbxxViewInfo>> selectDisplayByCondition(QueryCondition<YhjbxxViewInfo> condition,CustomOperateLog log) throws ServiceException;
}
