package com.wisedu.crowd.service.gzzx.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.gzzx.PtjyInfoMapper;
import com.wisedu.crowd.dao.gzzx.PxjyInfoMapper;
import com.wisedu.crowd.dao.gzzx.extend.PtjyInfoExtendMapper;
import com.wisedu.crowd.dao.gzzx.extend.PxjyInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.gzzx.PtjyInfo;
import com.wisedu.crowd.entity.gzzx.PxjyInfo;
import com.wisedu.crowd.entity.gzzx.extend.PtjyInfoExtend;
import com.wisedu.crowd.entity.gzzx.extend.PxjyInfoExtend;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.gzzx.PtjyInfoService;
import com.wisedu.crowd.service.gzzx.PxjyInfoService;

@Service("pxjyInfoService")
public class PxjyInfoServiceImpl implements PxjyInfoService {

	@Autowired
	private PxjyInfoMapper pxjyInfoMapper;
	
	@Autowired
	private PxjyInfoExtendMapper pxjyInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws Exception {
		return DataResult.success(pxjyInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(PxjyInfo record, CustomOperateLog log) throws Exception {
		return DataResult.success(pxjyInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<PxjyInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws Exception {
		return DataResult.success(pxjyInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(PxjyInfo record, CustomOperateLog log) throws Exception {
		return DataResult.success(pxjyInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<PxjyInfoExtend>> selectDisplayByCondition(QueryCondition<PxjyInfoExtend> condition,
			CustomOperateLog log) throws Exception {
		if (condition.getPageInfo() != null) {
			Page<PxjyInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<PxjyInfoExtend> datas = pxjyInfoExtendMapper.selectDisplayByCondition(condition);

			DataResult<List<PxjyInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(pxjyInfoExtendMapper.selectDisplayByCondition(condition));

		}
	}

}
