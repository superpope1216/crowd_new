package com.wisedu.crowd.service.role.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.role.GroupDataAuthInfoMapper;
import com.wisedu.crowd.dao.role.extend.GroupDataAuthInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.role.GroupDataAuthInfo;
import com.wisedu.crowd.entity.role.extend.GroupDataAuthInfoExtend;
import com.wisedu.crowd.entity.statics.extend.KfzxxDataExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.role.GroupDataAuthInfoService;

@Service("groupDataAuthInfoService")
public class GroupDataAuthInfoServiceImpl implements GroupDataAuthInfoService{

	@Autowired
	private GroupDataAuthInfoMapper groupDataAuthInfoMapper;
	@Autowired
	private GroupDataAuthInfoExtendMapper groupDataAuthInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(groupDataAuthInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(GroupDataAuthInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(groupDataAuthInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<GroupDataAuthInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(groupDataAuthInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(GroupDataAuthInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(groupDataAuthInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<GroupDataAuthInfoExtend>> selectDisplayByCondition(
			QueryCondition<GroupDataAuthInfoExtend> condition, CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
			Page<GroupDataAuthInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<GroupDataAuthInfoExtend> datas = groupDataAuthInfoExtendMapper.selectDisplayByCondition(condition);

			DataResult<List<GroupDataAuthInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(groupDataAuthInfoExtendMapper.selectDisplayByCondition(condition));

		}
		
	}

}
