package com.wisedu.crowd.service.statics.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.statics.ManpowerInfoMapper;
import com.wisedu.crowd.dao.statics.extend.ManpowerInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.ManpowerInfo;
import com.wisedu.crowd.entity.statics.ManpowerInfo;
import com.wisedu.crowd.entity.statics.extend.KfzzfInfoExtend;
import com.wisedu.crowd.entity.statics.extend.ManpowerInfoExtend;
import com.wisedu.crowd.entity.statics.extend.ManpowerInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.ManpowerInfoService;

@Service("manpowerInfoService")
public class ManpowerInfoServiceImpl implements ManpowerInfoService{

	@Autowired
	private ManpowerInfoMapper manpowerInfoMapper;
	@Autowired
	private ManpowerInfoExtendMapper manpowerInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(manpowerInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(ManpowerInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(manpowerInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<ManpowerInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(manpowerInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(ManpowerInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(manpowerInfoMapper.updateByPrimaryKeySelective(record));
	}


	@Override
	public DataResult<List<ManpowerInfoExtend>> selectByCondition(QueryCondition<ManpowerInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<ManpowerInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<ManpowerInfoExtend> datas = manpowerInfoExtendMapper.selectDisplayByCondition(condition);

            DataResult<List<ManpowerInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(manpowerInfoExtendMapper.selectDisplayByCondition(condition));
        }
	}

}
