package com.wisedu.crowd.service.train.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.code.PxbmztEnum;
import com.wisedu.crowd.common.code.PxztEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.dao.train.TrainBasicInfoMapper;
import com.wisedu.crowd.dao.train.extend.TrainBasicInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.train.TrainBasicInfo;
import com.wisedu.crowd.entity.train.extend.TrainBasicInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.train.TrainBasicInfoService;
import com.wisedu.crowd.service.xtgl.SequenceInfoService;

@Service("trainBasicInfoService")
@Transactional
public class TrainBasicInfoServiceImpl implements TrainBasicInfoService {

	@Autowired
	private TrainBasicInfoMapper trainBasicInfoMapper;
	@Autowired
	private TrainBasicInfoExtendMapper trainBasicInfoExtendMapper;
	@Autowired
	private SequenceInfoService sequenceInfoService;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(trainBasicInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(TrainBasicInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(trainBasicInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<TrainBasicInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(trainBasicInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(TrainBasicInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(trainBasicInfoMapper.updateByPrimaryKeySelective(record));
	}
	@Override
	public DataResult<Integer> appply(TrainBasicInfo trainBasicInfo,CustomOperateLog log) throws ServiceException{
		if(StringUtil.isEmpty(trainBasicInfo.getXmbh())){
			throw new ServiceException("项目编号不能为空，请重新确认！");
		}
		if(StringUtil.isEmpty(trainBasicInfo.getPxkc())){
			throw new ServiceException("培训课程不能为空，请重新确认！");
		}
		if(StringUtil.isEmpty(trainBasicInfo.getPxlx())){
			throw new ServiceException("培训类型不能为空，请重新确认！");
		}
		if(StringUtil.isEmpty(trainBasicInfo.getPxrs())){
			throw new ServiceException("培训规模不能为空，请重新确认！");
		}
		if(trainBasicInfo.getSfwxspx()==null){
			throw new ServiceException("培训方式不能为空，请重新确认！");
		}
		if(StringUtil.isEmpty(trainBasicInfo.getPxdd())){
			throw new ServiceException("培训地点不能为空，请重新确认！");
		}
		if(trainBasicInfo.getJgys()==null){
			throw new ServiceException("培训预算不能为空，请重新确认！");
		}
		if(StringUtil.isEmpty(trainBasicInfo.getPxyq())){
			throw new ServiceException("培训要求不能为空，请重新确认！");
		}
		if(StringUtil.isEmpty(trainBasicInfo.getWid())){
			trainBasicInfo.setWid(StringUtil.getUuId());
//			trainBasicInfo.setPxrwbh("123123123");
			String rwbh=sequenceInfoService.selectNewRwbh(DateUtil.format(DateUtil.getCurrentDate(), "yyyyMM"), log).getDatas();
			trainBasicInfo.setPxrwbh(rwbh);
			trainBasicInfo.setPxzt(StringUtil.toShort(PxztEnum.DSL.getCode()));
			trainBasicInfo.setSqr(log.getXqfId());
			trainBasicInfo.setBmzt(PxbmztEnum.DKQ.getCode());
			trainBasicInfo.setSqsj(DateUtil.getCurrentDateTimeStr());
			this.insertSelective(trainBasicInfo, log);
		}else{
			this.updateByPrimaryKeySelective(trainBasicInfo, log);
		}
		return DataResult.success(1);
		
	}

	@Override
	public DataResult<List<TrainBasicInfoExtend>> selectPlanDisplayByCondition(
			QueryCondition<TrainBasicInfoExtend> condition, CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
			Page<TrainBasicInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<TrainBasicInfoExtend> datas = trainBasicInfoExtendMapper.selectPlanDisplayByCondition(condition);

			DataResult<List<TrainBasicInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(trainBasicInfoExtendMapper.selectPlanDisplayByCondition(condition));

		}
	}

	@Override
	public DataResult<List<TrainBasicInfoExtend>> selectDisplayByCondition(
			QueryCondition<TrainBasicInfoExtend> condition, CustomOperateLog log) throws ServiceException {
		if (condition.getPageInfo() != null) {
			Page<TrainBasicInfoExtend> page = PageHelper.startPage(condition.getPageInfo().getPageNum(),
					condition.getPageInfo().getPageSize());
			List<TrainBasicInfoExtend> datas = trainBasicInfoExtendMapper.selectDisplayByCondition(condition);

			DataResult<List<TrainBasicInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(trainBasicInfoExtendMapper.selectDisplayByCondition(condition));

		}
	}

}
