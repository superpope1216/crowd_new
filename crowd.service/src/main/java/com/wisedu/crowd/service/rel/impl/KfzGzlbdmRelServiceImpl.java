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
import com.wisedu.crowd.dao.rel.KfzGzlbdmRelMapper;
import com.wisedu.crowd.dao.rel.extend.KfzGzlbdmRelExtendMapper;
import com.wisedu.crowd.entity.rel.KfzGzlbdmRel;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.rel.KfzGzlbdmRelService;
 
/**
 * 
 *   @author 11651
 *   开发者  和工作类别 中间表   Service
 *   表(t_crowd_rel_kfzid_gzlbdm)
 */
@Service("kfzGzlbdmRelService")
@Transactional
public class KfzGzlbdmRelServiceImpl implements KfzGzlbdmRelService {
 
	@Autowired
	private KfzGzlbdmRelExtendMapper kfzGzlbdmRelExtendMapper;
	
	@Autowired
	private KfzGzlbdmRelMapper kfzGzlbdmRelMapper;

	@Override
	public DataResult<Integer> delKfzGzlbdmRel(String kfzid) {
		kfzGzlbdmRelExtendMapper.delKfzGzlbdmRel(kfzid);
		return DataResult.success(new Integer(1));
	}

	@Override
	public DataResult<Integer> addKfzGzlbdmRel(String kfzid,String yhid,String lbdm) {
		
		if(StringUtils.isEmpty(kfzid)||StringUtils.isEmpty(yhid)){
			throw new ServiceException(HttpCodeEnum.USER_INVALID.getCode(),HttpCodeEnum.USER_INVALID.getName());
        }
		if(StringUtils.isEmpty(lbdm)){
			throw new ServiceException("参数值为空");
		}
		List<KfzGzlbdmRel> list=new ArrayList<KfzGzlbdmRel>();
		String[] tempStr=lbdm.split(",");
		for(String str:tempStr){
			KfzGzlbdmRel  KfzGzlbdmRel=new KfzGzlbdmRel();
			KfzGzlbdmRel.setWid(StringUtil.getUuId());
			KfzGzlbdmRel.setKfzid(kfzid);
			KfzGzlbdmRel.setYhid(yhid);
			KfzGzlbdmRel.setLbdm(str);
			//list.add(KfzGzlbdmRel);
			kfzGzlbdmRelMapper.insertSelective(KfzGzlbdmRel);
		}
		if(CommonUtil.isNotEmptyList(list)){
			//kfzGzlbdmRelExtendMapper.addKfzGzlbdmRel(list);
		}
		return DataResult.success(new Integer(1));
	}
	

}
