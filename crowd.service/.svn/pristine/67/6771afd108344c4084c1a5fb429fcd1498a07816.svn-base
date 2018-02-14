/**
 * Project Name:crowd.service
 * File Name:ZysqjlInfoServiceImpl.java
 * Package Name:com.wisedu.crowd.service.zygl.impl
 * Date:2018年1月12日下午1:31:51
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.service.zygl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.code.ZyshjgEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.dao.zygl.ZysqjlInfoMapper;
import com.wisedu.crowd.dao.zygl.extend.ZysqjlInfoExtendMapper;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.entity.zygl.ZysqjlInfo;
import com.wisedu.crowd.entity.zygl.extend.ZysqjlInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.zygl.ZysqjlInfoService;

/**
 * ClassName:ZysqjlInfoServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年1月12日 下午1:31:51 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service("zysqjlInfoService")
@Transactional
public class ZysqjlInfoServiceImpl implements ZysqjlInfoService{

    @Autowired
    private ZysqjlInfoMapper zysqjlInfoMapper;
    @Autowired
    private ZysqjlInfoExtendMapper zysqjlInfoExtendMapper;
    
    @Override
    public DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException {
        return DataResult.success(zysqjlInfoMapper.deleteByPrimaryKey(wid));
    }
    @Override
    public DataResult<Integer> insertSelective(ZysqjlInfo record) throws ServiceException {
        return DataResult.success(zysqjlInfoMapper.insertSelective(record));
    }
    @Override
    public DataResult<ZysqjlInfo> selectByPrimaryKey(String wid) throws ServiceException {
        return DataResult.success(zysqjlInfoMapper.selectByPrimaryKey(wid));
    }
    @Override
    public DataResult<Integer> updateByPrimaryKeySelective(ZysqjlInfo record) throws ServiceException {
        return DataResult.success(zysqjlInfoMapper.updateByPrimaryKeySelective(record));
    }
    @Override
    public DataResult<List<ZysqjlInfoExtend>> selectYzmDisplayByCondition(QueryCondition<ZysqjlInfoExtend> record,
            CustomOperateLog log) throws ServiceException {
        if (record.getPageInfo() != null) {
            Page<RwjbxxInfoExtend> page = PageHelper.startPage(record.getPageInfo().getPageNum(),
                    record.getPageInfo().getPageSize());
            List<ZysqjlInfoExtend> datas = zysqjlInfoExtendMapper.selectYzmDisplayByCondition(record);

            DataResult<List<ZysqjlInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(zysqjlInfoExtendMapper.selectYzmDisplayByCondition(record));
        }
    }
    @Override
    public DataResult<List<ZysqjlInfoExtend>> selectSjkDisplayByCondition(QueryCondition<ZysqjlInfoExtend> record,
            CustomOperateLog log) throws ServiceException {
        if (record.getPageInfo() != null) {
            Page<RwjbxxInfoExtend> page = PageHelper.startPage(record.getPageInfo().getPageNum(),
                    record.getPageInfo().getPageSize());
            List<ZysqjlInfoExtend> datas = zysqjlInfoExtendMapper.selectSjkDisplayByCondition(record);

            DataResult<List<ZysqjlInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(zysqjlInfoExtendMapper.selectSjkDisplayByCondition(record));
        }
    }
    @Override
    public DataResult<List<ZysqjlInfoExtend>> selectSvnDisplayByCondition(QueryCondition<ZysqjlInfoExtend> record,
            CustomOperateLog log) throws ServiceException {
        if (record.getPageInfo() != null) {
            Page<RwjbxxInfoExtend> page = PageHelper.startPage(record.getPageInfo().getPageNum(),
                    record.getPageInfo().getPageSize());
            List<ZysqjlInfoExtend> datas = zysqjlInfoExtendMapper.selectSvnDisplayByCondition(record);

            DataResult<List<ZysqjlInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(zysqjlInfoExtendMapper.selectSvnDisplayByCondition(record));
        }
    }
    @Override
    public DataResult<List<ZysqjlInfoExtend>> selectVpnDisplayByCondition(QueryCondition<ZysqjlInfoExtend> record,
            CustomOperateLog log) throws ServiceException {
        if (record.getPageInfo() != null) {
            Page<RwjbxxInfoExtend> page = PageHelper.startPage(record.getPageInfo().getPageNum(),
                    record.getPageInfo().getPageSize());
            List<ZysqjlInfoExtend> datas = zysqjlInfoExtendMapper.selectVpnDisplayByCondition(record);

            DataResult<List<ZysqjlInfoExtend>> dataResult = DataResult.success(datas);
            dataResult.setPageInfo(PageUtil.changePageInfo(page));
            return dataResult;
        } else {
            return DataResult.success(zysqjlInfoExtendMapper.selectVpnDisplayByCondition(record));
        }
    }
	@Override
	public DataResult<Integer> applyDeskstop(ZysqjlInfo record, CustomOperateLog log) throws ServiceException {
		record.setShjg(ZyshjgEnum.DSH.getCode());
		record.setSqsj(DateUtil.getCurrentDateStr());
		record.setWid(StringUtil.getUuId());
		return DataResult.success(zysqjlInfoMapper.insert(record));
	}
}

