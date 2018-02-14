package com.wisedu.crowd.service.rel.impl;

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
import com.wisedu.crowd.dao.rel.KfzScjsdmRelMapper;
import com.wisedu.crowd.dao.rel.extend.KfzScjsdmRelExtendMapper;
import com.wisedu.crowd.entity.rel.KfzScjsdmRel;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rel.KfzScjsdmRelService;
/**
 *  
 * @author 11651
 *  开发者和善长的技术中间表
 *  t_crowd_rel_kfzid_scjsdm
 */
@Service("kfzScjsdmRelService")
@Transactional
public class KfzScjsdmRelServiceImpl implements KfzScjsdmRelService {
 
	@Autowired
	private KfzScjsdmRelExtendMapper kfzScjsdmRelExtendMapper;
	
	@Autowired
	private KfzScjsdmRelMapper kfzScjsdmRelMapper;

	@Override
	public DataResult<Integer> delKfzScjsdmRel(String kfzid) {
		kfzScjsdmRelExtendMapper.delKfzScjsdmRel(kfzid);
		return DataResult.success(new Integer(1));
	}

	@Override
	public DataResult<Integer> addKfzScjsdmRel(String kfzid,String yhid,String lbdm) {
		
		if(StringUtils.isEmpty(kfzid)||StringUtils.isEmpty(yhid)){
			throw new ServiceException(HttpCodeEnum.USER_INVALID.getCode(),HttpCodeEnum.USER_INVALID.getName());
        }
		if(StringUtils.isEmpty(lbdm)){
			throw new ServiceException("参数值为空");
		}
		List<KfzScjsdmRel> list=new ArrayList<KfzScjsdmRel>();
		String[] tempStr=lbdm.split(",");
		for(String str:tempStr){
			KfzScjsdmRel  kfzScjsdmRel=new KfzScjsdmRel();
			kfzScjsdmRel.setWid(StringUtil.getUuId());
			kfzScjsdmRel.setKfzid(kfzid);
			kfzScjsdmRel.setYhid(yhid);
			kfzScjsdmRel.setLbdm(str);
		//	list.add(KfzScjsdmRel);
			int i=kfzScjsdmRelMapper.insertSelective(kfzScjsdmRel);
		}
		if(CommonUtil.isNotEmptyList(list)){
		//	kfzScjsdmRelExtendMapper.addKfzScjsdmRel(list);
		}
		return DataResult.success(new Integer(1));
	}
	

}
