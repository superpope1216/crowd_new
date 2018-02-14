package com.wisedu.crowd.service.gzzx.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.gzzx.JnjyInfoMapper;
import com.wisedu.crowd.dao.gzzx.extend.JnjyInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.gzzx.JnjyInfo;
import com.wisedu.crowd.entity.gzzx.extend.JnjyInfoExtend;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.gzzx.JnjyInfoService;

@Service("jnjyInfoService")
public class JnjyInfoServiceImpl implements JnjyInfoService{
	@Autowired
	private JnjyInfoMapper jnjyInfoMapper;
	
	@Autowired
	private JnjyInfoExtendMapper jnjyInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws Exception {
		return DataResult.success(jnjyInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(JnjyInfo record, CustomOperateLog log) throws Exception {
		return DataResult.success(jnjyInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<JnjyInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws Exception {
		return DataResult.success(jnjyInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(JnjyInfo record, CustomOperateLog log) throws Exception {
		return DataResult.success(jnjyInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<JnjyInfoExtend>> selectDisplayByCondition(QueryCondition<JnjyInfoExtend> condition,
			CustomOperateLog log) throws Exception {
		if (condition.getPageInfo() != null) {
			Page<JnjyInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<JnjyInfoExtend> datas = jnjyInfoExtendMapper.selectDisplayByCondition(condition);

			DataResult<List<JnjyInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(jnjyInfoExtendMapper.selectDisplayByCondition(condition));

		}
	}
}
