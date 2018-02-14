package com.wisedu.crowd.service.statics.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.statics.extend.YwxyqInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.extend.YwxyqInfoExtend;
import com.wisedu.crowd.entity.statics.extend.YwxyqInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.YwxyqInfoService;
@Service("ywxyqInfoService")
public class YwxyqInfoServiceImpl implements YwxyqInfoService {

	@Autowired
	private YwxyqInfoExtendMapper ywxyqInfoExtendMapper;
	@Override
	public DataResult<List<YwxyqInfoExtend>> selectStaticsMonthYwxyqInfo(QueryCondition<YwxyqInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<YwxyqInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<YwxyqInfoExtend> datas = ywxyqInfoExtendMapper.selectStaticsMonthYwxyqInfo(condition);

            DataResult<List<YwxyqInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(ywxyqInfoExtendMapper.selectStaticsMonthYwxyqInfo(condition));
        }
	}

	@Override
	public DataResult<List<YwxyqInfoExtend>> selectStaticsYwxyqInfo(QueryCondition<YwxyqInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<YwxyqInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<YwxyqInfoExtend> datas = ywxyqInfoExtendMapper.selectStaticsYwxyqInfo(condition);

            DataResult<List<YwxyqInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(ywxyqInfoExtendMapper.selectStaticsYwxyqInfo(condition));
        }
	}

	@Override
	public DataResult<List<YwxyqInfoExtend>> selectStaticsMonthDelayInfo(QueryCondition<YwxyqInfoExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<YwxyqInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<YwxyqInfoExtend> datas = ywxyqInfoExtendMapper.selectStaticsMonthDelayInfo(condition);

            DataResult<List<YwxyqInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(ywxyqInfoExtendMapper.selectStaticsMonthDelayInfo(condition));
        }
	}

	@Override
	public DataResult<Map<String, Object>> getYwxYqtjxx(QueryCondition<YwxyqInfoExtend> condition, CustomOperateLog log)
			throws ServiceException {
		 return DataResult.success(ywxyqInfoExtendMapper.getYwxYqtjxx(condition));
	}

}
