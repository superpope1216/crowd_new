package com.wisedu.crowd.service.xmgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.dao.xmgl.RbxxNewInfoMapper;
import com.wisedu.crowd.dao.xmgl.extend.RbxxNewInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.xmgl.RbxxNewInfoService;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.xmgl.RbxxNewInfo;
import com.wisedu.crowd.entity.xmgl.extend.RbxxNewInfoExtend;
import com.wisedu.crowd.entity.xmgl.extend.YwxWorkTimeExtend;

@Service("rbxxNewInfoService")
@Transactional
public class RbxxNewInfoServiceImpl implements RbxxNewInfoService{

	@Autowired
	private  RbxxNewInfoMapper rbxxNewInfoMapper;
	
	@Autowired
	private RbxxNewInfoExtendMapper rbxxNewInfoExtendMapper;

	@Override
	public DataResult<RbxxNewInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException {
		return DataResult.success(rbxxNewInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(rbxxNewInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(RbxxNewInfo record, CustomOperateLog log) throws ServiceException {
		record.setWid(StringUtil.getUuId());
		record.setTjsj(DateUtil.getCurrentDateTimeStr());
		record.setTjzip(log.getCustomIp());
		return DataResult.success(rbxxNewInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(RbxxNewInfo record, CustomOperateLog log)
			throws ServiceException {
		RbxxNewInfo rbxxNewInfo=new RbxxNewInfo();
		rbxxNewInfo.setWid(record.getWid());
		rbxxNewInfo.setRwbh(record.getRwbh());
		rbxxNewInfo.setRwmc(record.getRwmc());
		rbxxNewInfo.setSjd(record.getSjd());
		rbxxNewInfo.setSjgzl(record.getSjgzl());
		rbxxNewInfo.setGznrsm(record.getGznrsm());
		rbxxNewInfo.setBz(record.getBz());
		return DataResult.success(rbxxNewInfoMapper.updateByPrimaryKeySelective(rbxxNewInfo));
	} 
    
	@Override
	public DataResult<List<RbxxNewInfoExtend>> selectByCondition(QueryCondition<RbxxNewInfoExtend> record,
			CustomOperateLog log) throws ServiceException {
		if (record.getPageInfo() != null) {
			Page<RbxxNewInfoExtend> page = PageHelper.startPage(record.getPageInfo().getPageNum(),
					record.getPageInfo().getPageSize());
			List<RbxxNewInfoExtend> datas = rbxxNewInfoExtendMapper.selectByCondition(record);

			DataResult<List<RbxxNewInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(rbxxNewInfoExtendMapper.selectByCondition(record));

		}
	}
}
