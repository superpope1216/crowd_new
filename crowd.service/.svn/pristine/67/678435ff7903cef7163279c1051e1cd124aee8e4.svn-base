package com.wisedu.crowd.service.statics;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.extend.YwxyqInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface YwxyqInfoService {
	/**
	 * 统计业务线月度延期数据
	 * @param ywxyqInfo
	 * @return
	 */
	DataResult<List<YwxyqInfoExtend>> selectStaticsMonthYwxyqInfo(QueryCondition<YwxyqInfoExtend> condition,CustomOperateLog log) throws ServiceException;
	
	/**
	 * 
	 * selectStaticsYwxyqInfo:(统计当月各业务线延期率). <br/>
	 * TODO(这里描述这个方法适用条件 – 可选).<br/>
	 * TODO(这里描述这个方法的执行流程 – 可选).<br/>
	 * TODO(这里描述这个方法的使用方法 – 可选).<br/>
	 * TODO(这里描述这个方法的注意事项 – 可选).<br/>
	 *
	 * @author dell
	 * @param ywxyqInfoExtend
	 * @return
	 * @since JDK 1.6
	 */
	DataResult<List<YwxyqInfoExtend>> selectStaticsYwxyqInfo(QueryCondition<YwxyqInfoExtend> condition,CustomOperateLog log) throws ServiceException;
	
	DataResult<List<YwxyqInfoExtend>> selectStaticsMonthDelayInfo(QueryCondition<YwxyqInfoExtend> condition,CustomOperateLog log) throws ServiceException;
	
	DataResult<Map<String, Object>> getYwxYqtjxx(QueryCondition<YwxyqInfoExtend> condition,CustomOperateLog log) throws ServiceException;
}
