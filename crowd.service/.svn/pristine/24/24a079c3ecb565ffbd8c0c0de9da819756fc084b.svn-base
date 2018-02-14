package com.wisedu.crowd.service.role.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.role.GroupUserInfoMapper;
import com.wisedu.crowd.dao.role.extend.GroupUserInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.role.GroupUserInfo;
import com.wisedu.crowd.entity.role.extend.GroupUserInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.role.GroupUserInfoService;

@Service("groupUserInfoService")
public class GroupUserInfoServiceImpl implements GroupUserInfoService{

	@Autowired
	private GroupUserInfoMapper GroupUserInfoMapper;
	@Autowired
	private GroupUserInfoExtendMapper GroupUserInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(GroupUserInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(GroupUserInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(GroupUserInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<GroupUserInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(GroupUserInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(GroupUserInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(GroupUserInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<GroupUserInfoExtend>> selectDisplayByCondition(
			QueryCondition<GroupUserInfoExtend> condition, CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
			Page<GroupUserInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<GroupUserInfoExtend> datas = GroupUserInfoExtendMapper.selectDisplayByCondition(condition);

			DataResult<List<GroupUserInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(GroupUserInfoExtendMapper.selectDisplayByCondition(condition));

		}
		
	}

}
