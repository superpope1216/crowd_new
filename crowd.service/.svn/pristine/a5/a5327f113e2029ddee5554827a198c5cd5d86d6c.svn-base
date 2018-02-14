/**
 * Project Name:crowd-service
 * File Name:sms.java
 * Package Name:com.wisedu.crowd.message.email
 * Date:2017年8月23日上午11:40:25
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.kcgl.impl;



import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.dao.kcgl.SelectCoursesMapper;
import com.wisedu.crowd.dao.kcgl.extend.SelectCoursesExtendMapper;
import com.wisedu.crowd.entity.kcgl.SelectCourses;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.kcgl.SelectCoursesService;
import com.wisedu.crowd.service.messages.EmailSendMessage;


/**
 * ClassName:sms <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年8月23日 上午11:40:25 <br/>
 * @author   de
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

@Service("selectCoursesService")
@Transactional
public class SelectCoursesServiceImpl implements SelectCoursesService{
    
	@Autowired
	private SelectCoursesMapper selectCoursesMapper;
	
	
	@Autowired
	private SelectCoursesExtendMapper selectCoursesExtendMapper;
	
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		
		return DataResult.success(selectCoursesMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(SelectCourses record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(selectCoursesMapper.insertSelective(record));

	}

	@Override
	public DataResult<SelectCourses> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		
		return DataResult.success(selectCoursesMapper.selectByPrimaryKey(wid));
		
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(SelectCourses record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(selectCoursesMapper.updateByPrimaryKeySelective(record));

	}

	@Override
	public DataResult<Integer> deleteAllSelectCourses(CustomOperateLog log) {
		
		return DataResult.success(selectCoursesExtendMapper.deleteAllSelectCourses());
		
	}

    
    
}

