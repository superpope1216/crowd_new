package com.wisedu.crowd.service.role.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.role.GroupMenuAuthInfoMapper;
import com.wisedu.crowd.dao.role.extend.GroupMenuAuthInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.role.GroupMenuAuthInfo;
import com.wisedu.crowd.entity.role.extend.GroupMenuAuthInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.role.GroupMenuAuthInfoService;
import com.wisedu.crowd.service.role.GroupMenuAuthInfoService;

@Service("groupMenuAuthInfoService")
public class GroupMenuAuthInfoServiceImpl implements GroupMenuAuthInfoService{

	@Autowired
	private GroupMenuAuthInfoMapper GroupMenuAuthInfoMapper;
	@Autowired
	private GroupMenuAuthInfoExtendMapper GroupMenuAuthInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(GroupMenuAuthInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(GroupMenuAuthInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(GroupMenuAuthInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<GroupMenuAuthInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(GroupMenuAuthInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(GroupMenuAuthInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(GroupMenuAuthInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<GroupMenuAuthInfoExtend>> selectDisplayByCondition(
			QueryCondition<GroupMenuAuthInfoExtend> condition, CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
			Page<GroupMenuAuthInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<GroupMenuAuthInfoExtend> datas = GroupMenuAuthInfoExtendMapper.selectDisplayByCondition(condition);

			DataResult<List<GroupMenuAuthInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(GroupMenuAuthInfoExtendMapper.selectDisplayByCondition(condition));

		}
		
	}

}
