package com.wisedu.crowd.dao.statics.extend;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.statics.extend.KfzjlMonthExtend;

public interface KfzjlMonthExtendMapper {
  /**
   * 查询开发经理  统计信息(完工量,延期率,BUG率等)
   * @param kfzOverViewExtend
   * @return
   */
	List<Map<String,Object>> selectStaticsKfzjlMonth(QueryCondition<KfzjlMonthExtend> condition);
	
	List<KfzjlMonthExtend> selectStaticsKfzjlTotal(QueryCondition<KfzjlMonthExtend> condition);
	
	Map<String, Object> selectKfjljbxx(QueryCondition<KfzjlMonthExtend> condition);
}