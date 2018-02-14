package com.wisedu.crowd.service.cwgl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.cwgl.KfzzhmxInfo;
import com.wisedu.crowd.entity.cwgl.extend.KfzzhmxInfoExtend;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;

public interface KfzzhmxInfoService {
	/**
	 *
	 * @mbggenerated 2017-12-04
	 */
	DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2017-12-04
	 */
	DataResult<Integer> insertSelective(KfzzhmxInfo record, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2017-12-04
	 */
	DataResult<KfzzhmxInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2017-12-04
	 */
	DataResult<Integer> updateByPrimaryKeySelective(KfzzhmxInfo record, CustomOperateLog log) throws ServiceException;

	DataResult<Double> selectTotalMoney(QueryCondition<KfzzhmxInfoExtend> condition, CustomOperateLog log)
			throws ServiceException;

	DataResult<List<Map<String, Object>>> selectTotalMoneyByMonth(QueryCondition<KfzzhmxInfoExtend> condition,
			CustomOperateLog log) throws ServiceException;

	DataResult<List<KfzzhmxInfoExtend>> selectDisplayByCondition(QueryCondition<KfzzhmxInfoExtend> condition,
			CustomOperateLog log) throws ServiceException;
	
	DataResult<BigDecimal> calcuYkgs(BigDecimal money,CustomOperateLog log) throws ServiceException;
	
   DataResult<Integer> applyTx(BigDecimal txje,String yzm,String zfmzh,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<Map<String,Object>>>  selectDisplayTotalMoney(QueryCondition<KfzzhmxInfoExtend> condition,CustomOperateLog log) throws ServiceException;
   
   
   DataResult<List<Map<String,Object>>> selectCustomByCondition(QueryCondition<KfzzhmxInfoExtend> condition,CustomOperateLog log) throws ServiceException;
   
   
}
