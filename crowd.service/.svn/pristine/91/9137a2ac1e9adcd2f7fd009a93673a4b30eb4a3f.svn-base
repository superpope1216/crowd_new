package com.wisedu.crowd.service.data.delay.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.data.delay.DataDelayKfzYearInfoMapper;
import com.wisedu.crowd.dao.data.delay.extend.DataDelayKfzYearInfoExtendMapper;
import com.wisedu.crowd.entity.data.delay.DataDelayKfzYearInfo;
import com.wisedu.crowd.entity.data.delay.extend.DataDelayKfzYearInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.data.delay.DataDelayKfzMonthInfoService;
import com.wisedu.crowd.service.data.delay.DataDelayKfzYearInfoService;
import com.wisedu.crowd.service.dto.DataResult;

@Service("dataDelayKfzYearInfoService")
public class DataDelayKfzYearInfoServiceImpl implements DataDelayKfzYearInfoService{
	@Autowired
	private DataDelayKfzYearInfoMapper dataDelayKfzYearInfoMapper;
	
	@Autowired
	private DataDelayKfzYearInfoExtendMapper dataDelayKfzYearInfoExendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(dataDelayKfzYearInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(DataDelayKfzYearInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(dataDelayKfzYearInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<DataDelayKfzYearInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(dataDelayKfzYearInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(DataDelayKfzYearInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(dataDelayKfzYearInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<Integer> deleteByCondition(QueryCondition<DataDelayKfzYearInfoExtend> condition, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(dataDelayKfzYearInfoExendMapper.deleteByCondition(condition));
	}

	@Override
	public DataResult<List<DataDelayKfzYearInfoExtend>> selectDisplayByCondition(QueryCondition<DataDelayKfzYearInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<DataDelayKfzYearInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<DataDelayKfzYearInfoExtend> datas = dataDelayKfzYearInfoExendMapper.selectDisplayByCondition(condition);

            DataResult<List<DataDelayKfzYearInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(dataDelayKfzYearInfoExendMapper.selectDisplayByCondition(condition));
        }
	}

	@Override
	public DataResult<List<DataDelayKfzYearInfoExtend>> selectByCondition(QueryCondition<DataDelayKfzYearInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<DataDelayKfzYearInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<DataDelayKfzYearInfoExtend> datas = dataDelayKfzYearInfoExendMapper.selectByCondition(condition);

            DataResult<List<DataDelayKfzYearInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(dataDelayKfzYearInfoExendMapper.selectByCondition(condition));
        }
	}

	@Override
	public DataResult<List<Map<String, Object>>> selectCustomByCondition(QueryCondition<DataDelayKfzYearInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<Map<String, Object>> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<Map<String, Object>> datas = dataDelayKfzYearInfoExendMapper.selectCustomByCondition(condition);

            DataResult<List<Map<String, Object>>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(dataDelayKfzYearInfoExendMapper.selectCustomByCondition(condition));
        }
	}
}
