package com.wisedu.crowd.service.cwgl.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.cwgl.XqfzhmxInfoMapper;
import com.wisedu.crowd.dao.cwgl.extend.XqfzhmxInfoExtendMapper;
import com.wisedu.crowd.entity.cwgl.XqfzhmxInfo;
import com.wisedu.crowd.entity.cwgl.extend.XqfzhmxInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.service.cwgl.XqfzhmxInfoService;
import com.wisedu.crowd.service.dto.DataResult;

@Service("xqfzhmxInfoService")
public class XqfzhmxInfoServicemImpl implements XqfzhmxInfoService{

	@Autowired
	private XqfzhmxInfoMapper xqfzhmxInfoMapper;
	@Autowired
	private XqfzhmxInfoExtendMapper xqfzhmxInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String id, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfzhmxInfoMapper.deleteByPrimaryKey(id));
	}

	@Override
	public DataResult<Integer> insertSelective(XqfzhmxInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfzhmxInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<XqfzhmxInfo> selectByPrimaryKey(String id, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfzhmxInfoMapper.selectByPrimaryKey(id));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(XqfzhmxInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(xqfzhmxInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<Double> selectTotalMoney(QueryCondition<XqfzhmxInfoExtend> condition, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(xqfzhmxInfoExtendMapper.selectTotalMoney(condition));
	}

	@Override
	public DataResult<List<Map<String, Object>>> selectTotalMoneyByMonth(QueryCondition<XqfzhmxInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfzhmxInfoExtendMapper.selectTotalMoneyByMonth(condition));
	}

	@Override
	public DataResult<List<XqfzhmxInfoExtend>> selectDisplayByCondition(QueryCondition<XqfzhmxInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
			Page<XqfzhmxInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<XqfzhmxInfoExtend> datas = xqfzhmxInfoExtendMapper.selectDisplayByCondition(condition);

			DataResult<List<XqfzhmxInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(xqfzhmxInfoExtendMapper.selectDisplayByCondition(condition));

		}
	}

}
