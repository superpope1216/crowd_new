package com.wisedu.crowd.service.yhgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.dao.yhgl.extend.YhjbxxViewInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.role.extend.GroupInfoExtend;
import com.wisedu.crowd.entity.yhgl.YhjbxxViewInfo;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.yhgl.YhjbxxViewInfoService;

@Service("yhjbxxViewInfoService")
public class YhjbxxViewInfoServiceImpl implements YhjbxxViewInfoService{
	@Autowired
	private YhjbxxViewInfoExtendMapper yhjbxxViewInfoExtendMapper;
	@Override
	public DataResult<List<YhjbxxViewInfo>> selectDisplayByCondition(QueryCondition<YhjbxxViewInfo> condition,
			CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
			Page<YhjbxxViewInfo> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<YhjbxxViewInfo> datas = yhjbxxViewInfoExtendMapper.selectDisplayByCondition(condition);

			DataResult<List<YhjbxxViewInfo>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(yhjbxxViewInfoExtendMapper.selectDisplayByCondition(condition));

		}
	}

}
