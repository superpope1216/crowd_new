package com.wisedu.crowd.service.yhgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.dao.yhgl.YhjbxxLoginLogInfoMapper;
import com.wisedu.crowd.dao.yhgl.extend.YhjbxxLoginLogInfoExtendMapper;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.YhjbxxLoginLogInfo;
import com.wisedu.crowd.entity.yhgl.extend.YhjbxxLoginLogInfoExtend;
import com.wisedu.crowd.service.yhgl.YhjbxxLoginLogInfoService;

@Service("yhjbxxLoginLogInfoService")
public class YhjbxxLoginLogInfoServiceImpl implements YhjbxxLoginLogInfoService{

	@Autowired
	private   YhjbxxLoginLogInfoMapper yhjbxxLoginLogInfoMapper;
	@Autowired
	private YhjbxxLoginLogInfoExtendMapper yhjbxxLoginLogInfoExtendMapper;
	@Override
	public int deleteByPrimaryKey(String wid,CustomOperateLog log) {
		return yhjbxxLoginLogInfoMapper.deleteByPrimaryKey(wid);
	}

	@Override
	public int insertSelective(YhjbxxLoginLogInfo record,CustomOperateLog log) {
		return yhjbxxLoginLogInfoMapper.insertSelective(record);
	}

	@Override
	public YhjbxxLoginLogInfo selectByPrimaryKey(String wid,CustomOperateLog log) {
		return yhjbxxLoginLogInfoMapper.selectByPrimaryKey(wid);
	}

	@Override
	public int updateByPrimaryKeySelective(YhjbxxLoginLogInfo record,CustomOperateLog log) {
		return yhjbxxLoginLogInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<YhjbxxLoginLogInfoExtend> selectByCondition(YhjbxxLoginLogInfoExtend record,CustomOperateLog log) {
		return yhjbxxLoginLogInfoExtendMapper.selectByCondition(record);
	}

}
