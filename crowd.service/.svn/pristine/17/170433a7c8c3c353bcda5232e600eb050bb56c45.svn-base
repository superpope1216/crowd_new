/**
 * Project Name:service
 * File Name:XqfGzjdInfoService.java
 * Package Name:com.wisedu.crowd.service.statics
 * Date:2017年12月29日上午11:28:12
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.statics.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.statics.extend.XqfGzjdInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.statics.extend.XqfGzjdInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.XqfGzjdInfoService;

/**
 * ClassName:XqfGzjdInfoService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年12月29日 上午11:28:12 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service
public class XqfGzjdInfoServiceImpl implements XqfGzjdInfoService {

    @Autowired
    private XqfGzjdInfoExtendMapper xqfGzjdInfoExtendMapper;

	@Override
	public DataResult<List<Map<String, Object>>> selectXqfGzjdInfoByCondition(
			QueryCondition<XqfGzjdInfoExtend> record) {
		   if (record.getPageInfo() != null) {
	            Page<XqfGzjdInfoExtend> page = PageHelper.startPage(record.getPageInfo().getPageNum(),
	                    record.getPageInfo().getPageSize());
	            List<Map<String, Object>> datas = xqfGzjdInfoExtendMapper.selectXqfGzjdInfoByCondition(record);

	            DataResult<List<Map<String, Object>>> dataResult = DataResult.success(datas);
	            dataResult.setPageInfo(PageUtil.changePageInfo(page));
	            return dataResult;
	        } else {
	            return DataResult.success(xqfGzjdInfoExtendMapper.selectXqfGzjdInfoByCondition(record));

	        }
	}
    
  
}

