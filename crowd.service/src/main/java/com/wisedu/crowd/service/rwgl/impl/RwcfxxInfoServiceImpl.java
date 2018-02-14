package com.wisedu.crowd.service.rwgl.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.code.RwcfxxZtEnum;
import com.wisedu.crowd.common.code.YesNoEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.DecimalUtil;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.dao.rwgl.RwcfxxInfoMapper;
import com.wisedu.crowd.dao.rwgl.extend.RwcfxxInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.RwcfxxInfo;
import com.wisedu.crowd.entity.rwgl.RwjbxxInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwcfxxInfoExtend;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rwgl.RwcfxxInfoService;
import com.wisedu.crowd.service.rwgl.RwjbxxInfoService;

@Service("rwcfxxInfoService")
@Transactional
public class RwcfxxInfoServiceImpl implements RwcfxxInfoService {

	@Autowired
	private RwcfxxInfoMapper rwcfxxInfoMapper;

	@Autowired
	private RwcfxxInfoExtendMapper rwcfxxInfoExtendMapper;

	@Autowired
	private RwjbxxInfoService rwjbxxInfoService;

	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(rwcfxxInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(RwcfxxInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(rwcfxxInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<RwcfxxInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(rwcfxxInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(RwcfxxInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(rwcfxxInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Override
	public DataResult<List<RwcfxxInfoExtend>> selectByCondition(QueryCondition<RwcfxxInfoExtend> record,
			CustomOperateLog log) throws ServiceException {
		if (record.getPageInfo() != null) {
			Page<RwcfxxInfoExtend> page = PageHelper.startPage(record.getPageInfo().getPageNum(),
					record.getPageInfo().getPageSize());
			List<RwcfxxInfoExtend> datas = rwcfxxInfoExtendMapper.selectByCondition(record);

			DataResult<List<RwcfxxInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(rwcfxxInfoExtendMapper.selectByCondition(record));
		}
		
	}

	@Override
	public DataResult<Integer> saveRwcfxxInfo(RwcfxxInfo rwcfxxInfo, CustomOperateLog log) throws ServiceException {
		if (StringUtil.isEmpty(rwcfxxInfo.getKfzid())) {
			throw new ServiceException("合作人还没有选择，请重新确认！");
		}
		if (DecimalUtil.changeNull(rwcfxxInfo.getRwjg()).compareTo(DecimalUtil.toDecimal("0")) < 0) {
			throw new ServiceException("拆分金额不能小于0，请重新确认！");
		}
		RwjbxxInfo rwjbxxInfo = rwjbxxInfoService.selectByPrimaryKey(rwcfxxInfo.getRwid()).getDatas();
		if (!rwjbxxInfo.getKfzid().equals(log.getKfzId())) {
			throw new ServiceException("该需求不是您投标的需求，请重新确认！");
		}

		RwcfxxInfoExtend queryRwcfxxInfo = new RwcfxxInfoExtend();
		queryRwcfxxInfo.setRwid(rwcfxxInfo.getRwid());
		List<RwcfxxInfoExtend> rwcfxxInfoDatas = this
				.selectByCondition(ConditionUtil.createCondition(queryRwcfxxInfo), log).getDatas();
		BigDecimal ycfje = DecimalUtil.toDecimal("0");
		if (CommonUtil.isNotEmptyList(rwcfxxInfoDatas)) {
			for (RwcfxxInfoExtend rwcfxxInfoExtend : rwcfxxInfoDatas) {
				if(!rwcfxxInfo.getWid().equals(rwcfxxInfoExtend.getWid())){
					ycfje = DecimalUtil.add(rwcfxxInfoExtend.getRwjg(), ycfje);
				}
			}
		}

		ycfje = DecimalUtil.add(rwcfxxInfo.getRwjg(), ycfje);
		BigDecimal xmje = DecimalUtil.add(DecimalUtil.toDecimal(StringUtil.toStr(rwjbxxInfo.getZbje())),
				DecimalUtil.toDecimal(StringUtil.toStr(rwjbxxInfo.getPtbzje())));
		if (ycfje.compareTo(xmje) > 0) {
			throw new ServiceException("拆分金额已超过该需求的总金额，请重新确认！");
		}
		RwcfxxInfo saveRwcfxxInfo = new RwcfxxInfo();
		saveRwcfxxInfo.setKfzid(rwcfxxInfo.getKfzid());
		saveRwcfxxInfo.setCjsj(DateUtil.getCurrentDateTimeStr());
		saveRwcfxxInfo.setRwid(rwcfxxInfo.getRwid());
		saveRwcfxxInfo.setRwjg(rwcfxxInfo.getRwjg());
		saveRwcfxxInfo.setRwnr(rwcfxxInfo.getRwnr());
		saveRwcfxxInfo.setRwzt(StringUtil.toShort(RwcfxxZtEnum.DQE.getCode()));

		saveRwcfxxInfo.setSfsqfy(rwcfxxInfo.getSfsqfy());
		if (StringUtil.isEmpty(rwcfxxInfo.getWid())) {
			saveRwcfxxInfo.setWid(StringUtil.getUuId());
			this.insertSelective(saveRwcfxxInfo, log);
		} else {
			saveRwcfxxInfo.setWid(rwcfxxInfo.getWid());
			this.updateByPrimaryKeySelective(saveRwcfxxInfo, log);
		}
		return DataResult.success(1);
	}

	@Override
	public DataResult<String> deleteCfrw(String cfrwid, CustomOperateLog log) throws ServiceException {
		RwcfxxInfo rwcfxxInfo = this.selectByPrimaryKey(cfrwid, log).getDatas();
		RwjbxxInfo rwjbxxInfo = rwjbxxInfoService.selectByPrimaryKey(rwcfxxInfo.getRwid()).getDatas();
		if (!rwjbxxInfo.getKfzid().equals(log.getKfzId())) {
			throw new ServiceException("该需求不是您投标的需求，请重新确认！");
		}
		if (!RwcfxxZtEnum.DQE.getCode().equals(StringUtil.toStr(rwcfxxInfo.getRwzt()))) {
			throw new ServiceException("该拆分任务不是待确认状态，您无法删除，请重新确认！");
		}
		this.deleteByPrimaryKey(cfrwid, log);
		return DataResult.success(rwcfxxInfo.getRwid());
	}

	@Override
	public DataResult<Integer> selectCountByCondition(QueryCondition<RwcfxxInfoExtend> record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(rwcfxxInfoExtendMapper.selectCountByCondition(record));
	}

	@Override
	public DataResult<Integer> accept(String wid, String sfjs, CustomOperateLog log) throws ServiceException {
		RwcfxxInfo rwcfxxInfo=this.selectByPrimaryKey(wid, log).getDatas();
		if(!RwcfxxZtEnum.DQE.getCode().equals(StringUtil.toStr(rwcfxxInfo.getRwzt()))){
			throw new ServiceException("该需求不是待确认状态，请重新确认！");
		}
		if(!rwcfxxInfo.getKfzid().equals(log.getKfzId())){
			throw new ServiceException("该需求不是您的需求，请重新确认！");	
		}
		RwcfxxInfo saveRwcfxxInfo=new RwcfxxInfo();
		saveRwcfxxInfo.setWid(wid);
		if(YesNoEnum.YES.getCode().equals(sfjs)){
			saveRwcfxxInfo.setRwzt(StringUtil.toShort(RwcfxxZtEnum.KFZ.getCode()));
		}else{
			saveRwcfxxInfo.setRwzt(StringUtil.toShort(RwcfxxZtEnum.YJJ.getCode()));
		}
		this.updateByPrimaryKeySelective(saveRwcfxxInfo, log);
		return DataResult.success(1);
		
	}
	  /**
	    * 申请验收
	    * @param wid
	    * @param sfjs
	    * @param log
	    * @return
	    * @throws ServiceException
	    */
	@Override
	public DataResult<Integer> applyAccept(String wid, CustomOperateLog log) throws ServiceException {
		RwcfxxInfo rwcfxxInfo=this.selectByPrimaryKey(wid, log).getDatas();
		if(!RwcfxxZtEnum.KFZ.getCode().equals(StringUtil.toStr(rwcfxxInfo.getRwzt()))
				&& !RwcfxxZtEnum.YSBTG.getCode().equals(StringUtil.toStr(rwcfxxInfo.getRwzt()))){
			throw new ServiceException("该需求状态不满足验收条件，请重新确认！");
		}
		if(!rwcfxxInfo.getKfzid().equals(log.getKfzId())){
			throw new ServiceException("该需求不是您的需求，请重新确认！");	
		}
		RwcfxxInfo saveRwcfxxInfo=new RwcfxxInfo();
		saveRwcfxxInfo.setWid(wid);
		saveRwcfxxInfo.setRwzt(StringUtil.toShort(RwcfxxZtEnum.DYS.getCode()));
		this.updateByPrimaryKeySelective(saveRwcfxxInfo, log);
		return DataResult.success(1);
	}

	@Override
	public DataResult<Integer> supply(String wid, String sftg, CustomOperateLog log) throws ServiceException {
		RwcfxxInfo rwcfxxInfo=this.selectByPrimaryKey(wid, log).getDatas();
		RwjbxxInfo rwjbxxInfo=rwjbxxInfoService.selectByPrimaryKey(rwcfxxInfo.getRwid()).getDatas();
		if(!rwjbxxInfo.getKfzid().equals(log.getKfzId())){
			throw new ServiceException("该需求不是您的需求，请重新确认！");
		}
		RwcfxxInfo saveRwcfxxInfo=new RwcfxxInfo();
		saveRwcfxxInfo.setWid(wid);
		if(YesNoEnum.YES.getCode().equals(sftg)){
			saveRwcfxxInfo.setRwzt(StringUtil.toShort(RwcfxxZtEnum.YWC.getCode()));
		}else{
			saveRwcfxxInfo.setRwzt(StringUtil.toShort(RwcfxxZtEnum.YSBTG.getCode()));
		}
		this.updateByPrimaryKeySelective(saveRwcfxxInfo, log);
		return DataResult.success(1);
		
	}

}
