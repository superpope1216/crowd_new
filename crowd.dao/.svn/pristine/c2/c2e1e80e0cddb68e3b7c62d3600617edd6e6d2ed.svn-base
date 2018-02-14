package com.wisedu.crowd.dao.yhgl.extend;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.yhgl.KfzxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.KfzxxInfoExtend;

public interface KfzxxInfoExtendMapper {
   
	List<KfzxxInfoExtend>  selectByCondition(QueryCondition<KfzxxInfoExtend> record);

	Integer updateByVersion(KfzxxInfo record);
	
	Integer selectCountByCondition(QueryCondition<KfzxxInfoExtend> record);
	/**
	 * 根据区域统计开发者数量
	 * @return
	 */
	List<Map<String,Object>> selectCountByArea(@Param("areaBm") String areaBm);
}