package com.wisedu.crowd.service.xmgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.xmgl.YwxWorkTimeMapper;
import com.wisedu.crowd.dao.xmgl.extend.YwxWorkTimeExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.xmgl.YwxWorkTimeService;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.xmgl.YwxWorkTime;
import com.wisedu.crowd.entity.xmgl.extend.YwxWorkTimeExtend;

@Service("ywxWorkTimeService")
@Transactional
public class YwxWorkTimeServiceImpl implements YwxWorkTimeService{

	@Autowired
	private  YwxWorkTimeMapper ywxWorkTimeMapper;
	
	@Autowired
	private YwxWorkTimeExtendMapper ywxWorkTimeExtendMapper;

	@Override
	public DataResult<YwxWorkTime> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException {
		return DataResult.success(ywxWorkTimeMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(ywxWorkTimeMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(YwxWorkTime record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(ywxWorkTimeMapper.insertSelective(record));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(YwxWorkTime record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(ywxWorkTimeMapper.updateByPrimaryKeySelective(record));
	} 
    
	@Override
	public DataResult<List<YwxWorkTimeExtend>> selectByCondition(QueryCondition<YwxWorkTimeExtend> record,
			CustomOperateLog log) throws ServiceException {
		
		if (record.getPageInfo() != null) {
			Page<RwjbxxInfoExtend> page = PageHelper.startPage(record.getPageInfo().getPageNum(),
					record.getPageInfo().getPageSize());
			List<YwxWorkTimeExtend> datas = ywxWorkTimeExtendMapper.selectByCondition(record);

			DataResult<List<YwxWorkTimeExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(ywxWorkTimeExtendMapper.selectByCondition(record));

		}
	}
}
