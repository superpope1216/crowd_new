package com.wisedu.crowd.service.data.delay.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.data.delay.DataDelayKfzMonthInfoMapper;
import com.wisedu.crowd.dao.data.delay.extend.DataDelayKfzMonthInfoExtendMapper;
import com.wisedu.crowd.entity.data.delay.DataDelayKfzMonthInfo;
import com.wisedu.crowd.entity.data.delay.extend.DataDelayKfzMonthInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.data.delay.DataDelayKfzMonthInfoService;
import com.wisedu.crowd.service.dto.DataResult;
@Service("dataDelayKfzMonthInfoService")
public class DataDelayKfzMonthInfoServiceImpl implements DataDelayKfzMonthInfoService{
	@Autowired
	private DataDelayKfzMonthInfoMapper dataDelayKfzMonthInfoMapper;
	
	@Autowired
	private DataDelayKfzMonthInfoExtendMapper dataDelayKfzMonthInfoExendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(dataDelayKfzMonthInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(DataDelayKfzMonthInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(dataDelayKfzMonthInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<DataDelayKfzMonthInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(dataDelayKfzMonthInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(DataDelayKfzMonthInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(dataDelayKfzMonthInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<Integer> deleteByCondition(QueryCondition<DataDelayKfzMonthInfoExtend> condition, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(dataDelayKfzMonthInfoExendMapper.deleteByCondition(condition));
	}

	@Override
	public DataResult<List<DataDelayKfzMonthInfoExtend>> selectDisplayByCondition(QueryCondition<DataDelayKfzMonthInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<DataDelayKfzMonthInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<DataDelayKfzMonthInfoExtend> datas = dataDelayKfzMonthInfoExendMapper.selectDisplayByCondition(condition);

            DataResult<List<DataDelayKfzMonthInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(dataDelayKfzMonthInfoExendMapper.selectDisplayByCondition(condition));
        }
	}

	@Override
	public DataResult<List<DataDelayKfzMonthInfoExtend>> selectByCondition(QueryCondition<DataDelayKfzMonthInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<DataDelayKfzMonthInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<DataDelayKfzMonthInfoExtend> datas = dataDelayKfzMonthInfoExendMapper.selectByCondition(condition);

            DataResult<List<DataDelayKfzMonthInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(dataDelayKfzMonthInfoExendMapper.selectByCondition(condition));
        }
	}

	@Override
	public DataResult<List<Map<String, Object>>> selectCustomByCondition(QueryCondition<DataDelayKfzMonthInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<Map<String, Object>> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<Map<String, Object>> datas = dataDelayKfzMonthInfoExendMapper.selectCustomByCondition(condition);

            DataResult<List<Map<String, Object>>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(dataDelayKfzMonthInfoExendMapper.selectCustomByCondition(condition));
        }
	}
}
