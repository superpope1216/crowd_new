package com.wisedu.crowd.service.data.delay.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.data.delay.DataDelayRwxsYearInfoMapper;
import com.wisedu.crowd.dao.data.delay.extend.DataDelayRwxsYearInfoExtendMapper;
import com.wisedu.crowd.entity.data.delay.DataDelayRwxsYearInfo;
import com.wisedu.crowd.entity.data.delay.extend.DataDelayRwxsYearInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.data.delay.DataDelayRwxsYearInfoService;
import com.wisedu.crowd.service.dto.DataResult;
@Service("dataDelayRwxsYearInfoService")
public class DataDelayRwxsYearInfoServiceImpl implements DataDelayRwxsYearInfoService{
	@Autowired
	private DataDelayRwxsYearInfoMapper dataDelayRwxsYearInfoMapper;
	
	@Autowired
	private DataDelayRwxsYearInfoExtendMapper dataDelayRwxsYearInfoExendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(dataDelayRwxsYearInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(DataDelayRwxsYearInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(dataDelayRwxsYearInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<DataDelayRwxsYearInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(dataDelayRwxsYearInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(DataDelayRwxsYearInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(dataDelayRwxsYearInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<Integer> deleteByCondition(QueryCondition<DataDelayRwxsYearInfoExtend> condition, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(dataDelayRwxsYearInfoExendMapper.deleteByCondition(condition));
	}

	@Override
	public DataResult<List<DataDelayRwxsYearInfoExtend>> selectDisplayByCondition(QueryCondition<DataDelayRwxsYearInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<DataDelayRwxsYearInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<DataDelayRwxsYearInfoExtend> datas = dataDelayRwxsYearInfoExendMapper.selectDisplayByCondition(condition);

            DataResult<List<DataDelayRwxsYearInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(dataDelayRwxsYearInfoExendMapper.selectDisplayByCondition(condition));
        }
	}

	@Override
	public DataResult<List<DataDelayRwxsYearInfoExtend>> selectByCondition(QueryCondition<DataDelayRwxsYearInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<DataDelayRwxsYearInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<DataDelayRwxsYearInfoExtend> datas = dataDelayRwxsYearInfoExendMapper.selectByCondition(condition);

            DataResult<List<DataDelayRwxsYearInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(dataDelayRwxsYearInfoExendMapper.selectByCondition(condition));
        }
	}

	@Override
	public DataResult<List<Map<String, Object>>> selectCustomByCondition(QueryCondition<DataDelayRwxsYearInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<Map<String, Object>> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<Map<String, Object>> datas = dataDelayRwxsYearInfoExendMapper.selectCustomByCondition(condition);

            DataResult<List<Map<String, Object>>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(dataDelayRwxsYearInfoExendMapper.selectCustomByCondition(condition));
        }
	}
}
