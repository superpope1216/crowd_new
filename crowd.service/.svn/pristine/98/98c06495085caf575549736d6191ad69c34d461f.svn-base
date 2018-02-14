package com.wisedu.crowd.service.statics.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.statics.extend.KfzjlWglInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.extend.KfzjlWglInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.KfzjlWglInfoService;

@Service("kfzjlWglInfoService")
public class KfzjlWglInfoServiceImpl implements KfzjlWglInfoService {

	@Autowired
	private KfzjlWglInfoExtendMapper kfzjlWglInfoExtendMapper;
	@Override
	public DataResult<List<KfzjlWglInfoExtend>> selectStaticsKfzjlWglInfo(QueryCondition<KfzjlWglInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
			Page<KfzjlWglInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<KfzjlWglInfoExtend> datas = kfzjlWglInfoExtendMapper.selectStaticsKfzjlWglInfo(condition);

			DataResult<List<KfzjlWglInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(kfzjlWglInfoExtendMapper.selectStaticsKfzjlWglInfo(condition));

		}
	}

	@Override
	public DataResult<List<Map<String, Object>>> selectStaticsKfzjlWglMonthInfo(
			QueryCondition<KfzjlWglInfoExtend> condition, CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
			Page<Map<String, Object>> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<Map<String, Object>> datas = kfzjlWglInfoExtendMapper.selectStaticsKfzjlWglMonthInfo(condition);

			DataResult<List<Map<String, Object>>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(kfzjlWglInfoExtendMapper.selectStaticsKfzjlWglMonthInfo(condition));

		}
	}

	@Override
	public DataResult<List<KfzjlWglInfoExtend>> selectStaticsYwxwglInfo(QueryCondition<KfzjlWglInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
			Page<KfzjlWglInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<KfzjlWglInfoExtend> datas = kfzjlWglInfoExtendMapper.selectStaticsYwxwglInfo(condition);

			DataResult<List<KfzjlWglInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(kfzjlWglInfoExtendMapper.selectStaticsYwxwglInfo(condition));

		}
	}

}
