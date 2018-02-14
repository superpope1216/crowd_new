package com.wisedu.crowd.service.yhgl;

import java.util.List;
import java.util.Map;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.KfzxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.KfzxxInfoExtend;
import com.wisedu.crowd.entity.yhgl.extend.XqfxxInfoExtend;

public interface KfzxxInfoService {

	DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

	DataResult<Integer> insertSelective(KfzxxInfo record, CustomOperateLog log) throws ServiceException;

	DataResult<Integer> updateByPrimaryKeySelective(KfzxxInfo record, CustomOperateLog log) throws ServiceException;
   

	DataResult<KfzxxInfoExtend> saveKfzxxBasicInfo(KfzxxInfoExtend record, CustomOperateLog log) throws ServiceException;

	DataResult<KfzxxInfoExtend> saveKfzxxResumeInfo(KfzxxInfoExtend record, CustomOperateLog log) throws ServiceException;

	DataResult<KfzxxInfoExtend> saveKfzxxCardInfo(KfzxxInfoExtend record, CustomOperateLog log) throws ServiceException;
    
	DataResult<KfzxxInfoExtend> insertFirstKfzxxInfo(KfzxxInfoExtend record, CustomOperateLog log) throws ServiceException;

	DataResult<KfzxxInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

	DataResult<List<KfzxxInfoExtend>> selectByCondition(QueryCondition<KfzxxInfoExtend> record, CustomOperateLog log)
			throws ServiceException;

	DataResult<Integer> updateByVersion(KfzxxInfo record, CustomOperateLog log) throws ServiceException;
	
	

	DataResult<Integer> selectCountByCondition(QueryCondition<KfzxxInfoExtend> record,CustomOperateLog log) throws ServiceException;
	
	//检测邮箱是否重复
    boolean checkKfzEmail(KfzxxInfoExtend record, CustomOperateLog log)throws ServiceException;
    /**
	 * 根据区域统计开发者数量
	 * @return
	 */
    DataResult<List<Map<String,Object>>> selectCountByArea(String areaBm);
	
}
