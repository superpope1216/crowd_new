


package com.wisedu.crowd.service.yhgl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisedu.crowd.common.code.HttpCodeEnum;
import com.wisedu.crowd.common.code.YhxxShztEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.dao.yhgl.XqfxxInfoMapper;
import com.wisedu.crowd.dao.yhgl.extend.XqfxxInfoExtendMapper;
import com.wisedu.crowd.entity.datacode.user.EnterpriseQualificateTypeEnum;
import com.wisedu.crowd.entity.datacode.user.UserRangeEnum;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.XqfxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.XqfxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.yhgl.XqfxxInfoService;

@Service("xqfxxInfoService")
public class XqfxxInfoServiceImpl implements XqfxxInfoService{

	@Autowired
	private XqfxxInfoMapper xqfxxInfoMapper;
	@Autowired
	private XqfxxInfoExtendMapper xqfxxInfoExtendMapper;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfxxInfoMapper.deleteByPrimaryKey(wid));
	}

	
	//检测昵称是否重复
    public boolean checkXqfNc(String xqfid,String nc){
    	if(StringUtil.isEmpty(nc)){
    		return false;
    	}
    	XqfxxInfoExtend  xqfxxInfoExtend=new XqfxxInfoExtend();
    	xqfxxInfoExtend.setNc(nc);
		QueryCondition<XqfxxInfoExtend> condition=new QueryCondition<XqfxxInfoExtend>();
		condition.setPageInfo(null);
		condition.setQuery(xqfxxInfoExtend);
		List<XqfxxInfoExtend> list=xqfxxInfoExtendMapper.selectByCondition(condition);
    	if(StringUtil.isEmpty(xqfid)){
    		if(CommonUtil.isEmptyList(list)){
    			return true;
    		}
    		return false;
    	}else{
    		if(CommonUtil.isEmptyList(list)){
    			return true;
    		}
    		if(list.size()==1){
    			if(xqfid.equals(list.get(0).getWid())){
    				return true;
    			}
    		}
    	}
    	return false;
    }
    
   //检测身份号是否重复
    public boolean checkXqfSfzjh(String xqfid,String sfzjh){
    	if(StringUtil.isEmpty(sfzjh)){
    		return false;
    	}
    	XqfxxInfoExtend  xqfxxInfoExtend=new XqfxxInfoExtend();
    	xqfxxInfoExtend.setSfzjh(sfzjh);
		QueryCondition<XqfxxInfoExtend> condition=new QueryCondition<XqfxxInfoExtend>();
		condition.setPageInfo(null);
		condition.setQuery(xqfxxInfoExtend);
		List<XqfxxInfoExtend> list=xqfxxInfoExtendMapper.selectByCondition(condition);
    	if(StringUtil.isEmpty(xqfid)){
    		if(CommonUtil.isEmptyList(list)){
    			return true;
    		}
    		return false;
    	}else{
    		if(CommonUtil.isEmptyList(list)){
    			return true;
    		}
    		if(list.size()==1){
    			if(xqfid.equals(list.get(0).getWid())){
    				return true;
    			}
    		}
    	}
    	return false;
    }
	
	
	
	@Override
	public DataResult<Integer> insertSelective(XqfxxInfo record,CustomOperateLog log) throws ServiceException {
		
		record.setWid(StringUtil.getUuId());
		record.setCzsj(DateUtil.getCurrentDate());
		record.setCzzip(log.getCustomIp());
		record.setShzt(YhxxShztEnum.DSH.getCode());
		record.setVersion(0);
		return DataResult.success(xqfxxInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<XqfxxInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfxxInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(XqfxxInfo record,CustomOperateLog log) throws ServiceException {
		
		return DataResult.success(xqfxxInfoMapper.updateByPrimaryKeySelective(record));
	}
   
	
	
	@Override
	public DataResult<List<XqfxxInfoExtend>> selectByCondition(QueryCondition<XqfxxInfoExtend> record,CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(xqfxxInfoExtendMapper.selectByCondition(record));
	}

	@Override
	public DataResult<Integer> updateByVersion(XqfxxInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(xqfxxInfoExtendMapper.updateByVersion(record));
	}


	@Override
	public DataResult<Integer> selectCountByCondition(QueryCondition<XqfxxInfoExtend> record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(xqfxxInfoExtendMapper.selectCountByCondition(record));
	}


	@Override
	public boolean checkXqfEmail(XqfxxInfoExtend record, CustomOperateLog log) throws ServiceException {
		if(StringUtil.isEmpty(record)||StringUtil.isEmpty(record.getLxydzyx())){
    		return false;
    	}
		XqfxxInfoExtend  xqfxxInfoExtend=new XqfxxInfoExtend();
		xqfxxInfoExtend.setLxydzyx(record.getLxydzyx());
		QueryCondition<XqfxxInfoExtend> condition=new QueryCondition<XqfxxInfoExtend>();
		condition.setPageInfo(null);
		condition.setQuery(xqfxxInfoExtend);
		List<XqfxxInfoExtend> list=xqfxxInfoExtendMapper.selectByCondition(condition);
    	if(StringUtil.isEmpty(record.getYhid())){
    		if(CommonUtil.isEmptyList(list)){
    			return true;
    		}
    		return false;
    	}else{
    		if(CommonUtil.isEmptyList(list)){
    			return true;
    		}
    		if(list.size()==1){
    			if(record.getYhid().equals(list.get(0).getYhid())){
    				return true;
    			}
    		}
    	}
    	return false;
	}


	@Override
	public DataResult<XqfxxInfoExtend> saveXqfxxBasicInfo(XqfxxInfoExtend record, CustomOperateLog log)
			throws ServiceException {
		if(StringUtil.isEmpty(record.getYhid())){
			throw new ServiceException(HttpCodeEnum.USER_INVALID.getCode(),HttpCodeEnum.USER_INVALID.getName());
		}
		if(!checkXqfNc(record.getWid(),record.getNc())){
			throw new ServiceException(HttpCodeEnum.EXIST_NICK_NAME.getCode(),HttpCodeEnum.EXIST_NICK_NAME.getName());
         }
		if(StringUtil.isEmpty(record.getXqfdwmc())){
			throw new ServiceException("需求方单位不能为空");
		}
		XqfxxInfoExtend  xqfxxInfo=new XqfxxInfoExtend();
		xqfxxInfo.setYhid(record.getYhid());
		xqfxxInfo.setCzsj(DateUtil.getCurrentDate());
		xqfxxInfo.setCzzip(log.getCustomIp());
		
		xqfxxInfo.setZpfjid(record.getZpfjid());
		xqfxxInfo.setXqfdwmc(record.getXqfdwmc());
		xqfxxInfo.setNc(record.getNc());
		xqfxxInfo.setPerProvince(record.getPerProvince());
		xqfxxInfo.setPerCity(record.getPerCity());
		xqfxxInfo.setPerArea(record.getPerArea());
		xqfxxInfo.setQqh(record.getQqh());
		xqfxxInfo.setWxh(record.getWxh());
		xqfxxInfo.setZfbzh(record.getZfbzh());
		xqfxxInfo.setLxydzyx(record.getLxydzyx());
		
		if(StringUtil.isEmpty(record.getWid())){
			xqfxxInfo.setShzt(YhxxShztEnum.CG.getCode());
			xqfxxInfo.setVersion(0);
			xqfxxInfo.setWid(StringUtil.getUuId());
			xqfxxInfoMapper.insertSelective(xqfxxInfo);
		}else{
			xqfxxInfo.setWid(record.getWid());
			xqfxxInfoMapper.updateByPrimaryKeySelective(xqfxxInfo);
		}
		return DataResult.success(xqfxxInfo);
	}



	@Override
	public DataResult<XqfxxInfoExtend> saveXqfxxCardInfo(XqfxxInfoExtend record, CustomOperateLog log) throws ServiceException {
		if(StringUtil.isEmpty(record.getYhid())){
			throw new ServiceException(HttpCodeEnum.USER_INVALID.getCode(),HttpCodeEnum.USER_INVALID.getName());
		}
		if(!checkXqfSfzjh(record.getWid(),record.getSfzjh())){
			throw new ServiceException(HttpCodeEnum.EXIST_SFZ.getCode(),HttpCodeEnum.EXIST_SFZ.getName());
         }
		if(StringUtil.isEmpty(record.getXm())){
			throw new ServiceException("真实姓名不能为空");
		}
		XqfxxInfoExtend  xqfxxInfo=new XqfxxInfoExtend();
		xqfxxInfo.setYhid(record.getYhid());
		xqfxxInfo.setCzsj(DateUtil.getCurrentDate());
		xqfxxInfo.setCzzip(log.getCustomIp());
		
		xqfxxInfo.setXm(record.getXm());
		xqfxxInfo.setSfzjh(record.getSfzjh());
		xqfxxInfo.setSfzzmztjid(record.getSfzzmztjid());
		xqfxxInfo.setSfzfmztjid(record.getSfzfmztjid());
		xqfxxInfo.setUserRange(record.getUserRange());
		//个人认证
		if(!StringUtil.isEmpty(record.getUserRange())&&UserRangeEnum.PERSONAL.getCode().equals(record.getUserRange())){
			xqfxxInfo.setCompanyMc("");
			xqfxxInfo.setBusinessLicenceScanner("");
			xqfxxInfo.setBusinessLicenceNo("");
			xqfxxInfo.setOrganizateCodeScanner("");
			xqfxxInfo.setOrganizateCodeNo("");
			xqfxxInfo.setTaxRegistrationScanner("");
			xqfxxInfo.setTaxRegistrationNo("");
			xqfxxInfo.setSocialCreditCode("");
			xqfxxInfo.setEnterpriseQualificateType("");
		}else{
			//企业认证
			xqfxxInfo.setCompanyMc(record.getCompanyMc());
			xqfxxInfo.setBusinessLicenceScanner(record.getBusinessLicenceScanner());
			xqfxxInfo.setEnterpriseQualificateType(record.getEnterpriseQualificateType());
			if(EnterpriseQualificateTypeEnum.THREE.getCode().equals(record.getEnterpriseQualificateType())){
				//三证
				xqfxxInfo.setSocialCreditCode("");
				
				xqfxxInfo.setBusinessLicenceNo(record.getBusinessLicenceNo());
				xqfxxInfo.setOrganizateCodeScanner(record.getOrganizateCodeScanner());
				xqfxxInfo.setOrganizateCodeNo(record.getOrganizateCodeNo());
				xqfxxInfo.setTaxRegistrationScanner(record.getTaxRegistrationScanner());
				xqfxxInfo.setTaxRegistrationNo(record.getTaxRegistrationNo());
			}else{
				//三证合一
				xqfxxInfo.setBusinessLicenceNo("");
				xqfxxInfo.setOrganizateCodeScanner("");
				xqfxxInfo.setOrganizateCodeNo("");
				xqfxxInfo.setTaxRegistrationScanner("");
				xqfxxInfo.setTaxRegistrationNo("");
				
				xqfxxInfo.setSocialCreditCode(record.getSocialCreditCode());
			}
		}
		
		if(StringUtil.isEmpty(record.getWid())){
			xqfxxInfo.setShzt(YhxxShztEnum.CG.getCode());
			xqfxxInfo.setVersion(0);
			xqfxxInfo.setWid(StringUtil.getUuId());
		    xqfxxInfoMapper.insertSelective(xqfxxInfo);
		}else{
			XqfxxInfoExtend  xqfxxInfoExtend=new XqfxxInfoExtend();
			xqfxxInfoExtend.setWid(record.getWid());
			xqfxxInfoExtend.setYhid(record.getYhid());
			QueryCondition<XqfxxInfoExtend> condition=new QueryCondition<XqfxxInfoExtend>();
			condition.setPageInfo(null);
			condition.setQuery(xqfxxInfoExtend);
			List<XqfxxInfoExtend> list=xqfxxInfoExtendMapper.selectByCondition(condition);
			if(CommonUtil.isNotEmptyList(list)){
				XqfxxInfoExtend tempXqfxxInfoExtend=list.get(0);
				if(!StringUtil.isEmpty(tempXqfxxInfoExtend.getNc())){
					xqfxxInfo.setShzt(YhxxShztEnum.DSH.getCode());
				}
			}
			xqfxxInfo.setWid(record.getWid());
			xqfxxInfoMapper.updateByPrimaryKeySelective(xqfxxInfo);
		}
		return DataResult.success(xqfxxInfo);
	}


	@Override
	public DataResult<XqfxxInfoExtend> insertFirstXqfxxInfo(XqfxxInfo record, CustomOperateLog log) throws ServiceException {
		//session失效
		if(StringUtil.isEmpty(record.getYhid())){
			throw new ServiceException(HttpCodeEnum.USER_INVALID.getCode(),HttpCodeEnum.USER_INVALID.getName());
		}
		if(!checkXqfNc(record.getWid(),record.getNc())){
			throw new ServiceException(HttpCodeEnum.EXIST_NICK_NAME.getCode(),HttpCodeEnum.EXIST_NICK_NAME.getName());
         }
		if(!checkXqfSfzjh(record.getWid(),record.getSfzjh())){
			throw new ServiceException(HttpCodeEnum.EXIST_SFZ.getCode(),HttpCodeEnum.EXIST_SFZ.getName());
         }
		
		if(StringUtil.isEmpty(record.getXqfdwmc())||StringUtil.isEmpty(record.getXm())){
			throw new ServiceException("需求方单位和真实姓名不能为空");
		}
		//基本信息
		XqfxxInfoExtend  xqfxxInfo=new XqfxxInfoExtend();
		xqfxxInfo.setYhid(record.getYhid());
		xqfxxInfo.setCzsj(DateUtil.getCurrentDate());
		xqfxxInfo.setCzzip(log.getCustomIp());
		
		xqfxxInfo.setZpfjid(record.getZpfjid());
		xqfxxInfo.setXqfdwmc(record.getXqfdwmc());
		xqfxxInfo.setNc(record.getNc());
		xqfxxInfo.setPerProvince(record.getPerProvince());
		xqfxxInfo.setPerCity(record.getPerCity());
		xqfxxInfo.setPerArea(record.getPerArea());
		xqfxxInfo.setQqh(record.getQqh());
		xqfxxInfo.setWxh(record.getWxh());
		xqfxxInfo.setZfbzh(record.getZfbzh());
		xqfxxInfo.setLxydzyx(record.getLxydzyx());
		
		
		
		//认证信息
		xqfxxInfo.setXm(record.getXm());
		xqfxxInfo.setSfzjh(record.getSfzjh());
		xqfxxInfo.setSfzzmztjid(record.getSfzzmztjid());
		xqfxxInfo.setSfzfmztjid(record.getSfzfmztjid());
		xqfxxInfo.setUserRange(record.getUserRange());
		//个人认证
		if(!StringUtil.isEmpty(record.getUserRange())&&UserRangeEnum.PERSONAL.getCode().equals(record.getUserRange())){
			xqfxxInfo.setCompanyMc("");
			xqfxxInfo.setBusinessLicenceScanner("");
			xqfxxInfo.setBusinessLicenceNo("");
			xqfxxInfo.setOrganizateCodeScanner("");
			xqfxxInfo.setOrganizateCodeNo("");
			xqfxxInfo.setTaxRegistrationScanner("");
			xqfxxInfo.setTaxRegistrationNo("");
			xqfxxInfo.setSocialCreditCode("");
			xqfxxInfo.setEnterpriseQualificateType("");
		}else{
			//企业认证
			xqfxxInfo.setCompanyMc(record.getCompanyMc());
			xqfxxInfo.setBusinessLicenceScanner(record.getBusinessLicenceScanner());
			xqfxxInfo.setEnterpriseQualificateType(record.getEnterpriseQualificateType());
			if(EnterpriseQualificateTypeEnum.THREE.getCode().equals(record.getEnterpriseQualificateType())){
				//三证
				xqfxxInfo.setSocialCreditCode("");
				
				xqfxxInfo.setBusinessLicenceNo(record.getBusinessLicenceNo());
				xqfxxInfo.setOrganizateCodeScanner(record.getOrganizateCodeScanner());
				xqfxxInfo.setOrganizateCodeNo(record.getOrganizateCodeNo());
				xqfxxInfo.setTaxRegistrationScanner(record.getTaxRegistrationScanner());
				xqfxxInfo.setTaxRegistrationNo(record.getTaxRegistrationNo());
			}else{
				//三证合一
				xqfxxInfo.setBusinessLicenceNo("");
				xqfxxInfo.setOrganizateCodeScanner("");
				xqfxxInfo.setOrganizateCodeNo("");
				xqfxxInfo.setTaxRegistrationScanner("");
				xqfxxInfo.setTaxRegistrationNo("");
				
				xqfxxInfo.setSocialCreditCode(record.getSocialCreditCode());
			}
		}
		
		xqfxxInfo.setShzt(YhxxShztEnum.DSH.getCode());
		if(StringUtil.isEmpty(record.getWid())){
			xqfxxInfo.setVersion(0);
			xqfxxInfo.setWid(StringUtil.getUuId());
			xqfxxInfoMapper.insertSelective(xqfxxInfo);
		}else{
			xqfxxInfo.setWid(record.getWid());
			xqfxxInfoMapper.updateByPrimaryKeySelective(xqfxxInfo);
		}
		return DataResult.success(xqfxxInfo);
	}



}
