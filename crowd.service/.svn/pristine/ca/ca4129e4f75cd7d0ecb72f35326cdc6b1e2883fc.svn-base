package com.wisedu.crowd.service.train.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.train.TrainEnrolInfoMapper;
import com.wisedu.crowd.dao.train.extend.TrainEnrolInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.train.TrainEnrolInfo;
import com.wisedu.crowd.entity.train.extend.TrainEnrolInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.train.TrainEnrolInfoService;

@Service("trainEnrolInfoService")
@Transactional
public class TrainEnrolInfoServiceImpl implements TrainEnrolInfoService {

	@Autowired
	private TrainEnrolInfoMapper trainEnrolInfoMapper;
	
	@Autowired
	private TrainEnrolInfoExtendMapper trainEnrolInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(trainEnrolInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(TrainEnrolInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(trainEnrolInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<TrainEnrolInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(trainEnrolInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(TrainEnrolInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(trainEnrolInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeyWithBLOBs(TrainEnrolInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(trainEnrolInfoMapper.updateByPrimaryKeyWithBLOBs(record));
	}

	@Override
	public DataResult<List<TrainEnrolInfoExtend>> selectByCondition(QueryCondition<TrainEnrolInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
			Page<TrainEnrolInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<TrainEnrolInfoExtend> datas = trainEnrolInfoExtendMapper.selectByCondition(condition);

			DataResult<List<TrainEnrolInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(trainEnrolInfoExtendMapper.selectByCondition(condition));

		}
	}

    @Override
    public DataResult<Integer> selectCountByCondition(QueryCondition<TrainEnrolInfoExtend> condition, CustomOperateLog log)
            throws ServiceException {
        return DataResult.success(trainEnrolInfoExtendMapper.selectCountByCondition(condition));
    }

    @Override
    public DataResult<List<TrainEnrolInfoExtend>> selectDisplayByCondition(QueryCondition<TrainEnrolInfoExtend> condition,
            CustomOperateLog log) throws ServiceException{
        if (condition.getPageInfo() != null) {
            Page<TrainEnrolInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
                    condition.getPageInfo().getPageSize());
            List<TrainEnrolInfoExtend> datas = trainEnrolInfoExtendMapper.selectDisplayByCondition(condition);

            DataResult<List<TrainEnrolInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(trainEnrolInfoExtendMapper.selectDisplayByCondition(condition));
        }
    }

    @Override
    public DataResult<List<TrainEnrolInfoExtend>> selectEnrolByCondition(QueryCondition<TrainEnrolInfoExtend> condition,
            CustomOperateLog log) throws ServiceException {
        if (condition.getPageInfo() != null) {
            Page<TrainEnrolInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
                    condition.getPageInfo().getPageSize());
            List<TrainEnrolInfoExtend> datas = trainEnrolInfoExtendMapper.selectEnrolByCondition(condition);

            DataResult<List<TrainEnrolInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(trainEnrolInfoExtendMapper.selectEnrolByCondition(condition));
        }
    }

}
