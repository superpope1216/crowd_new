package com.wisedu.crowd.service.role.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.role.GroupInfoMapper;
import com.wisedu.crowd.dao.role.extend.GroupInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.role.GroupInfo;
import com.wisedu.crowd.entity.role.extend.GroupInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.role.GroupInfoService;

@Service("groupInfoService")
public class GroupInfoServiceImpl implements GroupInfoService{

	@Autowired
	private GroupInfoMapper GroupInfoMapper;
	@Autowired
	private GroupInfoExtendMapper GroupInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(GroupInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(GroupInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(GroupInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<GroupInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(GroupInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(GroupInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(GroupInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<GroupInfoExtend>> selectDisplayByCondition(
			QueryCondition<GroupInfoExtend> condition, CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
			Page<GroupInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<GroupInfoExtend> datas = GroupInfoExtendMapper.selectDisplayByCondition(condition);

			DataResult<List<GroupInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(GroupInfoExtendMapper.selectDisplayByCondition(condition));

		}
		
	}

}