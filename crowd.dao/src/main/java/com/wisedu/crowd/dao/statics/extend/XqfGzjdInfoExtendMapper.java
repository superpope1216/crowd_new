/**
 * Project Name:dao
 * File Name:XqfGzjdInfoExtendMapper.java
 * Package Name:com.wisedu.crowd.dao.statics.extend
 * Date:2017年12月29日上午11:22:19
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.dao.statics.extend;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.statics.extend.XqfGzjdInfoExtend;

/**
 * ClassName:XqfGzjdInfoExtendMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年12月29日 上午11:22:19 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface XqfGzjdInfoExtendMapper {

    /**
     * 根据条件获取获取需求方工作进度
     * @author dell
     * @param xqfGzjdInfoExtend
     * @return
     * @since JDK 1.6
     */
    List<Map<String, Object>> selectXqfGzjdInfoByCondition(QueryCondition<XqfGzjdInfoExtend> record);
    
}

