package com.wisedu.crowd.service.statics.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.statics.KfzxxDataMapper;
import com.wisedu.crowd.dao.statics.extend.KfzxxDataExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.statics.KfzxxData;
import com.wisedu.crowd.entity.statics.extend.KfzxxDataExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.KfzxxDataService;

@Service("kfzxxDataService")
@Transactional
public class KfzxxDataServiceImpl implements KfzxxDataService{

	@Autowired
	private KfzxxDataMapper kfzxxDataMapper;
	
	@Autowired
	private KfzxxDataExtendMapper kfzxxDataExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzxxDataMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(KfzxxData record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzxxDataMapper.insertSelective(record));
	}

	@Override
	public DataResult<KfzxxData> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzxxDataMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(KfzxxData record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(kfzxxDataMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<Integer> deleteByCondition(KfzxxDataExtend kfzxxDataExtend, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(kfzxxDataExtendMapper.deleteByCondition(kfzxxDataExtend));
	}

	@Override
	public DataResult<List<KfzxxDataExtend>> selectDisplayByCondition(QueryCondition<KfzxxDataExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
			Page<KfzxxDataExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<KfzxxDataExtend> datas = kfzxxDataExtendMapper.selectDisplayByCondition(condition);

			DataResult<List<KfzxxDataExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(kfzxxDataExtendMapper.selectDisplayByCondition(condition));

		}
	}

}
