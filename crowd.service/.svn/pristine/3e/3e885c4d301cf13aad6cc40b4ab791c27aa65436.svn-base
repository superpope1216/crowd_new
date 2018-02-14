package com.wisedu.crowd.service.rwgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.rwgl.RwztbglsInfoMapper;
import com.wisedu.crowd.dao.rwgl.extend.RwztbglsInfoExtendMapper;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.RwztbglsInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwztbglsInfoExtend;
import com.wisedu.crowd.service.rwgl.RwztbglsInfoService;

@Service("rwztbglsInfoService")
public class RwztbglsInfoServiceImpl implements RwztbglsInfoService {

	@Autowired
	private RwztbglsInfoMapper rwztbglsInfoMapper;
	
	@Autowired
	private RwztbglsInfoExtendMapper rwztbglsInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(rwztbglsInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(RwztbglsInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(rwztbglsInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<RwztbglsInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(rwztbglsInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(RwztbglsInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(rwztbglsInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<RwztbglsInfoExtend>> selectByCondition(QueryCondition<RwztbglsInfoExtend> record,
			CustomOperateLog log) throws ServiceException {
		if (record.getPageInfo() != null) {
			Page<RwztbglsInfoExtend> page = PageHelper.startPage(record.getPageInfo().getPageNum(),
					record.getPageInfo().getPageSize());
			List<RwztbglsInfoExtend> datas = rwztbglsInfoExtendMapper.selectByCondition(record);

			DataResult<List<RwztbglsInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(rwztbglsInfoExtendMapper.selectByCondition(record));
			
		}
	}

}
