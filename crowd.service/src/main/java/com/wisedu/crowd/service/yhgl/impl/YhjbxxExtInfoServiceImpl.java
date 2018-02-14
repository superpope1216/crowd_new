package com.wisedu.crowd.service.yhgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.dao.yhgl.YhjbxxExtInfoMapper;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.YhjbxxExtInfo;
import com.wisedu.crowd.entity.yhgl.extend.YhjbxxExtInfoExtend;
import com.wisedu.crowd.service.yhgl.YhjbxxExtInfoService;
import com.wisedu.crowd.dao.yhgl.extend.YhjbxxExtInfoExtendMapper;
@Service("yhjbxxExtInfoService")
@Transactional
public class YhjbxxExtInfoServiceImpl implements YhjbxxExtInfoService{

	@Autowired
	private  YhjbxxExtInfoMapper yhjbxxExtInfoMapper;
	
	@Autowired
	private YhjbxxExtInfoExtendMapper YhjbxxExtInfoExtendMapper; 
	@Override
	public int deleteByPrimaryKey(String wid) {
		return  yhjbxxExtInfoMapper.deleteByPrimaryKey(wid);
	}



	@Override
	public YhjbxxExtInfo selectByPrimaryKey(String wid) {
		return yhjbxxExtInfoMapper.selectByPrimaryKey(wid);
	}

	

	@Override
	public List<YhjbxxExtInfoExtend> selectByCondition(YhjbxxExtInfoExtend record) {
		return YhjbxxExtInfoExtendMapper.selectByCondition(record);
	}



	@Override
	public YhjbxxExtInfo saveYhjbxxExtInfo(YhjbxxExtInfo record,CustomOperateLog log) throws ServiceException {
		if(StringUtil.isEmpty(record.getWid())){
			record.setWid(StringUtil.getUuId());
			record.setCzsj(DateUtil.getCurrentDateTimeStr());
			record.setCzzip(log.getCustomIp());
			yhjbxxExtInfoMapper.insertSelective(record);
		}else{
			yhjbxxExtInfoMapper.updateByPrimaryKeySelective(record);
		}
		return record;
	}
}
