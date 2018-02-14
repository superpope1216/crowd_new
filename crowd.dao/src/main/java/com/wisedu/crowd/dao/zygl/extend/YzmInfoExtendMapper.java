/**
 * Project Name:crowd.dao
 * File Name:YzmInfoExtendMapper.java
 * Package Name:com.wisedu.crowd.dao.zygl.extend
 * Date:2018年1月12日上午10:30:48
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.dao.zygl.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.zygl.extend.YzmInfoExtend;

/**
 * ClassName:YzmInfoExtendMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月12日 上午10:30:48 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface YzmInfoExtendMapper {

    List<YzmInfoExtend> selectDisplayByCondition(QueryCondition<YzmInfoExtend> condition);
}

