package com.wisedu.crowd.service.data.delay.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.data.delay.DataDelayRwxsMonthInfoMapper;
import com.wisedu.crowd.dao.data.delay.extend.DataDelayRwxsMonthInfoExtendMapper;
import com.wisedu.crowd.entity.data.delay.DataDelayRwxsMonthInfo;
import com.wisedu.crowd.entity.data.delay.extend.DataDelayRwxsMonthInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.data.delay.DataDelayRwxsMonthInfoService;
import com.wisedu.crowd.service.dto.DataResult;

@Service("dataDelayRwxsMonthInfoService")
public class DataDelayRwxsMonthInfoServiceImpl implements DataDelayRwxsMonthInfoService{
	@Autowired
	private DataDelayRwxsMonthInfoMapper dataDelayRwxsMonthInfoMapper;
	
	@Autowired
	private DataDelayRwxsMonthInfoExtendMapper dataDelayRwxsMonthInfoExendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(dataDelayRwxsMonthInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(DataDelayRwxsMonthInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(dataDelayRwxsMonthInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<DataDelayRwxsMonthInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(dataDelayRwxsMonthInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(DataDelayRwxsMonthInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(dataDelayRwxsMonthInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<Integer> deleteByCondition(QueryCondition<DataDelayRwxsMonthInfoExtend> condition, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(dataDelayRwxsMonthInfoExendMapper.deleteByCondition(condition));
	}

	@Override
	public DataResult<List<DataDelayRwxsMonthInfoExtend>> selectDisplayByCondition(QueryCondition<DataDelayRwxsMonthInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<DataDelayRwxsMonthInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<DataDelayRwxsMonthInfoExtend> datas = dataDelayRwxsMonthInfoExendMapper.selectDisplayByCondition(condition);

            DataResult<List<DataDelayRwxsMonthInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(dataDelayRwxsMonthInfoExendMapper.selectDisplayByCondition(condition));
        }
	}

	@Override
	public DataResult<List<DataDelayRwxsMonthInfoExtend>> selectByCondition(QueryCondition<DataDelayRwxsMonthInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<DataDelayRwxsMonthInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<DataDelayRwxsMonthInfoExtend> datas = dataDelayRwxsMonthInfoExendMapper.selectByCondition(condition);

            DataResult<List<DataDelayRwxsMonthInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(dataDelayRwxsMonthInfoExendMapper.selectByCondition(condition));
        }
	}

	@Override
	public DataResult<List<Map<String, Object>>> selectCustomByCondition(QueryCondition<DataDelayRwxsMonthInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<Map<String, Object>> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<Map<String, Object>> datas = dataDelayRwxsMonthInfoExendMapper.selectCustomByCondition(condition);

            DataResult<List<Map<String, Object>>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(dataDelayRwxsMonthInfoExendMapper.selectCustomByCondition(condition));
        }
	}
}
