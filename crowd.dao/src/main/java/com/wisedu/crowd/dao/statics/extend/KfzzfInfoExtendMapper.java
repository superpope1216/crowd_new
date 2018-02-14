/**
 * Project Name:crowd.dao
 * File Name:KfzzfInfoExtendMapper.java
 * Package Name:com.wisedu.crowd.dao.statics.extend
 * Date:2018年1月18日下午3:07:12
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.dao.statics.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.statics.extend.KfzzfInfoExtend;

/**
 * ClassName:KfzzfInfoExtendMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月18日 下午3:07:12 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface KfzzfInfoExtendMapper {

	List<KfzzfInfoExtend> selectByCondition(QueryCondition<KfzzfInfoExtend> condition);
}

