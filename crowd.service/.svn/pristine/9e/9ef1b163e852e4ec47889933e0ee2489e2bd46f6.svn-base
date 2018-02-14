package com.wisedu.crowd.service.statics.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.statics.extend.KfzjlMonthExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.statics.extend.KfzjlMonthExtend;
import com.wisedu.crowd.entity.statics.extend.ManpowerInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.statics.KfzjlMonthInfoService;

@Service("kfzjlMonthInfoService")
public class KfzjlMonthInfoServiceImpl implements KfzjlMonthInfoService {

	@Autowired
	private KfzjlMonthExtendMapper kfzjlMonthExtendMapper;
	@Override
	public DataResult<List<Map<String, Object>>> selectStaticsKfzjlMonth(QueryCondition<KfzjlMonthExtend> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
            Page<Map<String, Object>> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<Map<String, Object>> datas = kfzjlMonthExtendMapper.selectStaticsKfzjlMonth(condition);

            DataResult<List<Map<String, Object>>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(kfzjlMonthExtendMapper.selectStaticsKfzjlMonth(condition));
        }
	}

	@Override
	public DataResult<List<KfzjlMonthExtend>> selectStaticsKfzjlTotal(QueryCondition<KfzjlMonthExtend> condition,
			CustomOperateLog log) throws ServiceException {
		// TODO Auto-generated method stub
		if (condition.getPageInfo() != null) {
            Page<KfzjlMonthExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
            		condition.getPageInfo().getPageSize());
            List<KfzjlMonthExtend> datas = kfzjlMonthExtendMapper.selectStaticsKfzjlTotal(condition);

            DataResult<List<KfzjlMonthExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(kfzjlMonthExtendMapper.selectStaticsKfzjlTotal(condition));
        }
	}

	@Override
	public DataResult<Map<String, Object>> selectKfjljbxx(QueryCondition<KfzjlMonthExtend> condition,
			CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzjlMonthExtendMapper.selectKfjljbxx(condition));
	}
	
}
