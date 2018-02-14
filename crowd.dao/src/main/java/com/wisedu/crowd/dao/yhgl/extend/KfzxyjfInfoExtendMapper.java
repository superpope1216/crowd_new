/**
 * Project Name:crowd.dao
 * File Name:KfzxyjfInfoExtendMapper.java
 * Package Name:com.wisedu.crowd.dao.yhgl.extend
 * Date:2018年1月25日上午9:30:12
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.dao.yhgl.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.yhgl.extend.KfzxyjfInfoExtend;

/**
 * ClassName:KfzxyjfInfoExtendMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月25日 上午9:30:12 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface KfzxyjfInfoExtendMapper {

	List<KfzxyjfInfoExtend> selectByCondition(QueryCondition<KfzxyjfInfoExtend> condition);
}

