package com.wisedu.crowd.service.gzzx.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.gzzx.PtjyInfoMapper;
import com.wisedu.crowd.dao.gzzx.extend.PtjyInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.gzzx.PtjyInfo;
import com.wisedu.crowd.entity.gzzx.extend.PtjyInfoExtend;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.gzzx.PtjyInfoService;

@Service("ptjyInfoService")
public class PtjyInfoServiceImpl implements PtjyInfoService {

	@Autowired
	private PtjyInfoMapper ptjyInfoMapper;
	
	@Autowired
	private PtjyInfoExtendMapper ptjyInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws Exception {
		return DataResult.success(ptjyInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(PtjyInfo record, CustomOperateLog log) throws Exception {
		return DataResult.success(ptjyInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<PtjyInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws Exception {
		return DataResult.success(ptjyInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(PtjyInfo record, CustomOperateLog log) throws Exception {
		return DataResult.success(ptjyInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<PtjyInfoExtend>> selectDisplayByCondition(QueryCondition<PtjyInfoExtend> condition,
			CustomOperateLog log) throws Exception {
		if (condition.getPageInfo() != null) {
			Page<PtjyInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<PtjyInfoExtend> datas = ptjyInfoExtendMapper.selectDisplayByCondition(condition);

			DataResult<List<PtjyInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(ptjyInfoExtendMapper.selectDisplayByCondition(condition));

		}
	}

}
