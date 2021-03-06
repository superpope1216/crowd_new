package com.wisedu.crowd.service.rel.impl;

/**
 * 开发者  和技能平台 中间表   Service
 *  表(t_crowd_rel_kfzid_rwkfkj)
 *    
 */
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wisedu.crowd.common.code.HttpCodeEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.dao.rel.KfzRwkfkjRelMapper;
import com.wisedu.crowd.dao.rel.extend.KfzRwkfkjRelExtendMapper;
import com.wisedu.crowd.entity.rel.KfzRwkfkjRel;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rel.KfzRwkfkjRelService;

@Service("kfzRwkfkjRelService")
@Transactional
public class KfzRwkfkjRelServiceImpl implements KfzRwkfkjRelService {
     
	@Autowired
	private KfzRwkfkjRelMapper kfzRwkfkjRelMapper;
	
	@Autowired
	private KfzRwkfkjRelExtendMapper kfzRwkfkjRelExtendMapper;

	@Override
	public DataResult<Integer> delKfzRwkfkjRel(String kfzid) {
		kfzRwkfkjRelExtendMapper.delKfzRwkfkjRel(kfzid);
		return DataResult.success(new Integer(1));
	}

	@Override
	public DataResult<Integer> addKfzRwkfkjRel(String kfzid,String yhid,String lbdm) {
		
		if(StringUtils.isEmpty(kfzid)||StringUtils.isEmpty(yhid)){
			throw new ServiceException(HttpCodeEnum.USER_INVALID.getCode(),HttpCodeEnum.USER_INVALID.getName());
        }
		if(StringUtils.isEmpty(lbdm)){
			throw new ServiceException("参数值为空");
		}
		List<KfzRwkfkjRel> list=new ArrayList<KfzRwkfkjRel>();
		String[] tempStr=lbdm.split(",");
		for(String str:tempStr){
			KfzRwkfkjRel  kfzRwkfkjRel=new KfzRwkfkjRel();
			kfzRwkfkjRel.setWid(StringUtil.getUuId());
			kfzRwkfkjRel.setKfzid(kfzid);
			kfzRwkfkjRel.setYhid(yhid);
			kfzRwkfkjRel.setLbdm(str);
			//list.add(kfzRwkfkjRel);
			kfzRwkfkjRelMapper.insertSelective(kfzRwkfkjRel);
		}
		if(CommonUtil.isNotEmptyList(list)){
			//kfzRwkfkjRelExtendMapper.addKfzRwkfkjRel(list);
		}
		return DataResult.success(new Integer(1));
	}
	

}
