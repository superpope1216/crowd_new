package com.wisedu.crowd.service.train.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.train.TrainPlanInfoMapper;
import com.wisedu.crowd.dao.train.extend.TrainPlanInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.train.TrainPlanInfo;
import com.wisedu.crowd.entity.train.extend.TrainPlanInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.train.TrainPlanInfoService;

@Service("trainPlanInfoService")
@Transactional
public class TrainPlanInfoServiceImpl implements TrainPlanInfoService{

	@Autowired
	private TrainPlanInfoMapper trainPlanInfoMapper;
	@Autowired
	private TrainPlanInfoExtendMapper trainPlanInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(trainPlanInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(TrainPlanInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(trainPlanInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<TrainPlanInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(trainPlanInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(TrainPlanInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(trainPlanInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeyWithBLOBs(TrainPlanInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(trainPlanInfoMapper.updateByPrimaryKeyWithBLOBs(record));
	}

	@Override
	public DataResult<List<TrainPlanInfoExtend>> selectByCondition(QueryCondition<TrainPlanInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
			Page<TrainPlanInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<TrainPlanInfoExtend> datas = trainPlanInfoExtendMapper.selectByCondition(condition);

			DataResult<List<TrainPlanInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(trainPlanInfoExtendMapper.selectByCondition(condition));

		}
	}

}
