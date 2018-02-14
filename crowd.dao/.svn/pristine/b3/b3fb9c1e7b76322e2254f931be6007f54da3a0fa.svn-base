package com.wisedu.crowd.dao.statics.extend;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.statics.extend.YwxyqInfoExtend;

public interface YwxyqInfoExtendMapper {
   
	/**
	 * 统计业务线月度延期数据
	 * @param ywxyqInfo
	 * @return
	 */
	List<YwxyqInfoExtend> selectStaticsMonthYwxyqInfo(QueryCondition<YwxyqInfoExtend> condition);
	
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
	List<YwxyqInfoExtend> selectStaticsYwxyqInfo(QueryCondition<YwxyqInfoExtend> condition);
	
	List<YwxyqInfoExtend> selectStaticsMonthDelayInfo(QueryCondition<YwxyqInfoExtend> condition);
	
	Map<String, Object> getYwxYqtjxx(QueryCondition<YwxyqInfoExtend> condition);
}