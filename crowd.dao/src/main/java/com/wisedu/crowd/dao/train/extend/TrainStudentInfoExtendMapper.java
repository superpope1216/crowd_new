/**
 * Project Name:crowd.dao
 * File Name:TrainStudentInfoExtendMapper.java
 * Package Name:com.wisedu.crowd.dao.train.extend
 * Date:2018年1月4日下午3:43:25
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.dao.train.extend;

import java.util.List;

import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.train.extend.TrainStudentInfoExtend;

/**
 * ClassName:TrainStudentInfoExtendMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月4日 下午3:43:25 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface TrainStudentInfoExtendMapper {

    List<TrainStudentInfoExtend> selectByCondition(QueryCondition<TrainStudentInfoExtend> condition);
    
}

