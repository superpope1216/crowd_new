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
import com.wisedu.crowd.dao.kcgl.StudyCoursesMapper;
import com.wisedu.crowd.dao.kcgl.extend.StudyCoursesExtendMapper;
import com.wisedu.crowd.entity.kcgl.StudyCourses;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.kcgl.StudyCoursesService;
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

@Service("studyCoursesService")
@Transactional
public class StudyCoursesServiceImpl implements StudyCoursesService{
    
	@Autowired
	private StudyCoursesMapper studyCoursesMapper;
	
	
	@Autowired
	private StudyCoursesExtendMapper studyCoursesExtendMapper;
	
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		
		return DataResult.success(studyCoursesMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(StudyCourses record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(studyCoursesMapper.insertSelective(record));

	}

	@Override
	public DataResult<StudyCourses> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		
		return DataResult.success(studyCoursesMapper.selectByPrimaryKey(wid));
		
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(StudyCourses record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(studyCoursesMapper.updateByPrimaryKeySelective(record));

	}

	@Override
	public DataResult<Integer> deleteAllStudyCourses(CustomOperateLog log) {
		
		return DataResult.success(studyCoursesExtendMapper.deleteAllStudyCourses());
		
	}

    
    
}

