package com.wisedu.crowd.service.yhgl.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wisedu.crowd.common.code.HttpCodeEnum;
import com.wisedu.crowd.common.code.RwxsEnum;
import com.wisedu.crowd.common.code.YhxxShztEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.PageUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.dao.rel.KfzRwkfkjRelMapper;
import com.wisedu.crowd.dao.rel.extend.KfzRwkfkjRelExtendMapper;
import com.wisedu.crowd.dao.yhgl.KfzxxInfoMapper;
import com.wisedu.crowd.dao.yhgl.extend.KfzxxInfoExtendMapper;
import com.wisedu.crowd.entity.datacode.user.EnterpriseQualificateTypeEnum;
import com.wisedu.crowd.entity.datacode.user.UserRangeEnum;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rel.KfzRwkfkjRel;
import com.wisedu.crowd.entity.yhgl.KfzxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.KfzxxInfoExtend;
import com.wisedu.crowd.service.yhgl.KfzxxInfoService;
@Service("kfzxxInfoService")
@Transactional
public class KfzxxInfoServiceImpl implements KfzxxInfoService{

	@Autowired
	private  KfzxxInfoMapper kfzxxInfoMapper;
	
	@Autowired
	private KfzxxInfoExtendMapper kfzxxInfoExtendMapper;
	
	

	@Override
	public DataResult<KfzxxInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzxxInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(kfzxxInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(KfzxxInfo record, CustomOperateLog log) throws ServiceException {
	
		return DataResult.success(kfzxxInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(KfzxxInfo record, CustomOperateLog log)
			throws ServiceException {
		
		return DataResult.success(kfzxxInfoMapper.updateByPrimaryKeySelective(record));
	} 
    
	

	
	
	@Override
	public DataResult<List<KfzxxInfoExtend>> selectByCondition(QueryCondition<KfzxxInfoExtend> record,
			CustomOperateLog log) throws ServiceException {
		if (record.getPageInfo() != null) {
			Page<KfzxxInfoExtend> page = PageHelper.startPage(record.getPageInfo().getPageNum(),
					record.getPageInfo().getPageSize());
			List<KfzxxInfoExtend> datas = kfzxxInfoExtendMapper.selectByCondition(record);

			DataResult<List<KfzxxInfoExtend>> dataResult = DataResult.success(datas);
			dataResult.setPageInfo(PageUtil.changePageInfo(page));
			return dataResult;
		} else {
			return DataResult.success(kfzxxInfoExtendMapper.selectByCondition(record));
		}
		

	}

	@Override
	public DataResult<Integer> updateByVersion(KfzxxInfo record, CustomOperateLog log) throws ServiceException {
		
		return DataResult.success(kfzxxInfoExtendMapper.updateByVersion(record));
	}
   
	//检测昵称是否重复
    public boolean checkKfzNc(String kfzid,String nc){
    	if(StringUtil.isEmpty(nc)){
    		return false;
    	}
    	KfzxxInfoExtend  kfzxxInfoExtend=new KfzxxInfoExtend();
		kfzxxInfoExtend.setNc(nc);
		QueryCondition<KfzxxInfoExtend> condition=new QueryCondition<KfzxxInfoExtend>();
		condition.setPageInfo(null);
		condition.setQuery(kfzxxInfoExtend);
		List<KfzxxInfoExtend> list=kfzxxInfoExtendMapper.selectByCondition(condition);
    	if(StringUtil.isEmpty(kfzid)){
    		if(CommonUtil.isEmptyList(list)){
    			return true;
    		}
    		return false;
    	}else{
    		if(CommonUtil.isEmptyList(list)){
    			return true;
    		}
    		if(list.size()==1){
    			if(kfzid.equals(list.get(0).getWid())){
    				return true;
    			}
    		}
    	}
    	return false;
    }
    
   //检测身份号是否重复
    public boolean checkKfzSfzjh(String kfzid,String sfzjh){
    	if(StringUtil.isEmpty(sfzjh)){
    		return false;
    	}
    	KfzxxInfoExtend  kfzxxInfoExtend=new KfzxxInfoExtend();
		kfzxxInfoExtend.setSfzjh(sfzjh);
		QueryCondition<KfzxxInfoExtend> condition=new QueryCondition<KfzxxInfoExtend>();
		condition.setPageInfo(null);
		condition.setQuery(kfzxxInfoExtend);
		List<KfzxxInfoExtend> list=kfzxxInfoExtendMapper.selectByCondition(condition);
    	if(StringUtil.isEmpty(kfzid)){
    		if(CommonUtil.isEmptyList(list)){
    			return true;
    		}
    		return false;
    	}else{
    		if(CommonUtil.isEmptyList(list)){
    			return true;
    		}
    		if(list.size()==1){
    			if(kfzid.equals(list.get(0).getWid())){
    				return true;
    			}
    		}
    	}
    	return false;
    }
	
	

	@Override
	public DataResult<Integer> selectCountByCondition(QueryCondition<KfzxxInfoExtend> record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(kfzxxInfoExtendMapper.selectCountByCondition(record));
	}

	@Override
	public boolean checkKfzEmail(KfzxxInfoExtend record, CustomOperateLog log) {
		if(StringUtil.isEmpty(record)||StringUtil.isEmpty(record.getDzyx())){
    		return false;
    	}
    	KfzxxInfoExtend  kfzxxInfoExtend=new KfzxxInfoExtend();
		kfzxxInfoExtend.setDzyx(record.getDzyx());
		QueryCondition<KfzxxInfoExtend> condition=new QueryCondition<KfzxxInfoExtend>();
		condition.setPageInfo(null);
		condition.setQuery(kfzxxInfoExtend);
		List<KfzxxInfoExtend> list=kfzxxInfoExtendMapper.selectByCondition(condition);
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
	
       /**
        * 保存开发者基本信息
        */
	@Override
	public DataResult<KfzxxInfoExtend> saveKfzxxBasicInfo(KfzxxInfoExtend record, CustomOperateLog log)
			throws ServiceException {
		if(StringUtil.isEmpty(record.getYhid())){
			throw new ServiceException(HttpCodeEnum.USER_INVALID.getCode(),HttpCodeEnum.USER_INVALID.getName());
		}
		if(!checkKfzNc(record.getWid(),record.getNc())){
			throw new ServiceException(HttpCodeEnum.EXIST_NICK_NAME.getCode(),HttpCodeEnum.EXIST_NICK_NAME.getName());
         }
		KfzxxInfoExtend  kfzxxInfo=new KfzxxInfoExtend();
		kfzxxInfo.setYhid(record.getYhid());
		kfzxxInfo.setCzsj(DateUtil.getCurrentDate());
		kfzxxInfo.setCzzip(log.getCustomIp());
		
		kfzxxInfo.setGrzpfjid(record.getGrzpfjid());
		kfzxxInfo.setNc(record.getNc());
		kfzxxInfo.setPerProvince(record.getPerProvince());
		kfzxxInfo.setPerCity(record.getPerCity());
		kfzxxInfo.setPerArea(record.getPerArea());
		kfzxxInfo.setCsrq(record.getCsrq());
		kfzxxInfo.setQq(record.getQq());
		kfzxxInfo.setWxh(record.getWxh());
		kfzxxInfo.setZfbzh(record.getZfbzh());
		kfzxxInfo.setDzyx(record.getDzyx());
		kfzxxInfo.setSfjstj(record.getSfjstj());
		kfzxxInfo.setRwkfkj("");
		kfzxxInfo.setRwxs("");
		if(!StringUtil.isEmpty(record.getSfjstj())&&record.getSfjstj()!=0){
			kfzxxInfo.setRwxs(record.getRwxs());
			if(!StringUtil.isEmpty(record.getRwxs())&&RwxsEnum.KF.getCode().equals(record.getRwxs())){//任务形式为开发  添加技能平台
				kfzxxInfo.setRwkfkj(record.getRwkfkj());
			}
		}
		
		if(StringUtil.isEmpty(record.getWid())){
			kfzxxInfo.setShzt(YhxxShztEnum.CG.getCode());
			kfzxxInfo.setVersion(0);
			kfzxxInfo.setWid(StringUtil.getUuId());
			kfzxxInfoMapper.insertSelective(kfzxxInfo);
		}else{
			kfzxxInfo.setWid(record.getWid());
			kfzxxInfoMapper.updateByPrimaryKeySelective(kfzxxInfo);
		}
		return DataResult.success(kfzxxInfo);
	}
    /**
     * 保存开发者 简历信息
     */
	@Override
	public DataResult<KfzxxInfoExtend> saveKfzxxResumeInfo(KfzxxInfoExtend record, CustomOperateLog log)
			throws ServiceException {
		if(StringUtil.isEmpty(record.getYhid())){
			throw new ServiceException(HttpCodeEnum.USER_INVALID.getCode(),HttpCodeEnum.USER_INVALID.getName());
		}
		KfzxxInfoExtend  kfzxxInfo=new KfzxxInfoExtend();
		kfzxxInfo.setYhid(record.getYhid());
		kfzxxInfo.setCzsj(DateUtil.getCurrentDate());
		kfzxxInfo.setCzzip(log.getCustomIp());
		
		kfzxxInfo.setKfzlb(record.getKfzlb());
		kfzxxInfo.setScjsdm(record.getScjsdm());
		kfzxxInfo.setGzlbdm(record.getGzlbdm());
		kfzxxInfo.setQtjn(record.getQtjn());
		kfzxxInfo.setGznx(record.getGznx());
		kfzxxInfo.setJygznx(record.getJygznx());
		kfzxxInfo.setGzjl(record.getGzjl());
		kfzxxInfo.setXmjy(record.getXmjy());
		kfzxxInfo.setZslj(record.getZslj());
		kfzxxInfo.setGzxz(record.getGzxz());
		kfzxxInfo.setKxsjid(record.getKxsjid());
		
		if(StringUtil.isEmpty(record.getWid())){
			kfzxxInfo.setShzt(YhxxShztEnum.CG.getCode());
			kfzxxInfo.setVersion(0);
			kfzxxInfo.setWid(StringUtil.getUuId());
			kfzxxInfoMapper.insertSelective(kfzxxInfo);
		}else{
			kfzxxInfo.setWid(record.getWid());
			kfzxxInfoMapper.updateByPrimaryKeySelective(kfzxxInfo);
		}
		return DataResult.success(kfzxxInfo);
	}
   
	/**
	 * 保存开发者   身份认证信息
	 */
	@Override
	public DataResult<KfzxxInfoExtend> saveKfzxxCardInfo(KfzxxInfoExtend record, CustomOperateLog log) throws ServiceException {
		if(StringUtil.isEmpty(record.getYhid())){
			throw new ServiceException(HttpCodeEnum.USER_INVALID.getCode(),HttpCodeEnum.USER_INVALID.getName());
		}
		if(!checkKfzSfzjh(record.getWid(),record.getSfzjh())){
			throw new ServiceException(HttpCodeEnum.EXIST_SFZ.getCode(),HttpCodeEnum.EXIST_SFZ.getName());
         }
		KfzxxInfoExtend  kfzxxInfo=new KfzxxInfoExtend();
		kfzxxInfo.setYhid(record.getYhid());
		kfzxxInfo.setCzsj(DateUtil.getCurrentDate());
		kfzxxInfo.setCzzip(log.getCustomIp());
		
		kfzxxInfo.setXm(record.getXm());
		kfzxxInfo.setSfzjh(record.getSfzjh());
		kfzxxInfo.setSfzzmztjid(record.getSfzzmztjid());
		kfzxxInfo.setSfzfmztjid(record.getSfzfmztjid());
		kfzxxInfo.setSfytd(record.getSfytd());
		//个人认证
		if(!StringUtil.isEmpty(record.getSfytd())&&1==record.getSfytd()){
			kfzxxInfo.setCompanyMc("");
			kfzxxInfo.setBusinessLicenceScanner("");
			kfzxxInfo.setBusinessLicenceNo("");
			kfzxxInfo.setOrganizateCodeScanner("");
			kfzxxInfo.setOrganizateCodeNo("");
			kfzxxInfo.setTaxRegistrationScanner("");
			kfzxxInfo.setTaxRegistrationNo("");
			kfzxxInfo.setSocialCreditCode("");
			kfzxxInfo.setEnterpriseQualificateType("");
		}else{
			//企业认证
			kfzxxInfo.setCompanyMc(record.getCompanyMc());
			kfzxxInfo.setBusinessLicenceScanner(record.getBusinessLicenceScanner());
			kfzxxInfo.setEnterpriseQualificateType(record.getEnterpriseQualificateType());
			if(EnterpriseQualificateTypeEnum.THREE.getCode().equals(record.getEnterpriseQualificateType())){
				//三证
				kfzxxInfo.setSocialCreditCode("");
				
				kfzxxInfo.setBusinessLicenceNo(record.getBusinessLicenceNo());
				kfzxxInfo.setOrganizateCodeScanner(record.getOrganizateCodeScanner());
				kfzxxInfo.setOrganizateCodeNo(record.getOrganizateCodeNo());
				kfzxxInfo.setTaxRegistrationScanner(record.getTaxRegistrationScanner());
				kfzxxInfo.setTaxRegistrationNo(record.getTaxRegistrationNo());
			}else{
				//三证合一
				kfzxxInfo.setBusinessLicenceNo("");
				kfzxxInfo.setOrganizateCodeScanner("");
				kfzxxInfo.setOrganizateCodeNo("");
				kfzxxInfo.setTaxRegistrationScanner("");
				kfzxxInfo.setTaxRegistrationNo("");
				
				kfzxxInfo.setSocialCreditCode(record.getSocialCreditCode());
			}
		}
		
		if(StringUtil.isEmpty(record.getWid())){
			kfzxxInfo.setShzt(YhxxShztEnum.CG.getCode());
			kfzxxInfo.setVersion(0);
			kfzxxInfo.setWid(StringUtil.getUuId());
		    kfzxxInfoMapper.insertSelective(kfzxxInfo);
		}else{
			
			KfzxxInfoExtend  kfzxxInfoExtend=new KfzxxInfoExtend();
			kfzxxInfoExtend.setWid(record.getWid());
			kfzxxInfoExtend.setYhid(record.getYhid());
			QueryCondition<KfzxxInfoExtend> condition=new QueryCondition<KfzxxInfoExtend>();
			condition.setPageInfo(null);
			condition.setQuery(kfzxxInfoExtend);
			List<KfzxxInfoExtend> list=kfzxxInfoExtendMapper.selectByCondition(condition);
			if(CommonUtil.isNotEmptyList(list)){
				KfzxxInfoExtend tempKfzxxInfoExtend=list.get(0);
				if(!StringUtil.isEmpty(tempKfzxxInfoExtend.getNc())&&!StringUtil.isEmpty(tempKfzxxInfoExtend.getGznx())){
					kfzxxInfo.setShzt(YhxxShztEnum.DSH.getCode());
				}
			}
			kfzxxInfo.setWid(record.getWid());
			kfzxxInfoMapper.updateByPrimaryKeySelective(kfzxxInfo);
		}
		return DataResult.success(kfzxxInfo);

		
	}
   
	/**
	 * 保存开发者全部信息     完善信息用
	 * @param record
	 * @param log
	 * @return
	 * @throws ServiceException
	 */
	
	@Override
	public DataResult<KfzxxInfoExtend> insertFirstKfzxxInfo(KfzxxInfoExtend record, CustomOperateLog log) throws ServiceException {
		
		//session失效
		if(StringUtil.isEmpty(record.getYhid())){
			throw new ServiceException(HttpCodeEnum.USER_INVALID.getCode(),HttpCodeEnum.USER_INVALID.getName());
		}
		if(!checkKfzNc(record.getWid(),record.getNc())){
			throw new ServiceException(HttpCodeEnum.EXIST_NICK_NAME.getCode(),HttpCodeEnum.EXIST_NICK_NAME.getName());
         }
		if(!checkKfzSfzjh(record.getWid(),record.getSfzjh())){
			throw new ServiceException(HttpCodeEnum.EXIST_SFZ.getCode(),HttpCodeEnum.EXIST_SFZ.getName());
         }
		
		//基本信息
		KfzxxInfoExtend  kfzxxInfo=new KfzxxInfoExtend();
		kfzxxInfo.setYhid(record.getYhid());
		kfzxxInfo.setCzsj(DateUtil.getCurrentDate());
		kfzxxInfo.setCzzip(log.getCustomIp());
		
		kfzxxInfo.setGrzpfjid(record.getGrzpfjid());
		kfzxxInfo.setNc(record.getNc());
		kfzxxInfo.setPerProvince(record.getPerProvince());
		kfzxxInfo.setPerCity(record.getPerCity());
		kfzxxInfo.setPerArea(record.getPerArea());
		kfzxxInfo.setCsrq(record.getCsrq());
		kfzxxInfo.setQq(record.getQq());
		kfzxxInfo.setWxh(record.getWxh());
		kfzxxInfo.setZfbzh(record.getZfbzh());
		kfzxxInfo.setDzyx(record.getDzyx());
		kfzxxInfo.setSfjstj(record.getSfjstj());
		kfzxxInfo.setRwkfkj("");
		kfzxxInfo.setRwxs("");
		if(!StringUtil.isEmpty(record.getSfjstj())&&!record.getSfjstj().equals("0")){
			kfzxxInfo.setRwxs(record.getRwxs());
			if(!StringUtil.isEmpty(record.getRwxs())&&RwxsEnum.KF.getCode().equals(record.getRwxs())){//任务形式为开发  添加技能平台
				kfzxxInfo.setRwkfkj(record.getRwkfkj());
			}
		}
		
		
		//简历信息
		kfzxxInfo.setKfzlb(record.getKfzlb());
		kfzxxInfo.setScjsdm(record.getScjsdm());
		kfzxxInfo.setGzlbdm(record.getGzlbdm());
		kfzxxInfo.setQtjn(record.getQtjn());
		kfzxxInfo.setGznx(record.getGznx());
		kfzxxInfo.setJygznx(record.getJygznx());
		kfzxxInfo.setGzjl(record.getGzjl());
		kfzxxInfo.setXmjy(record.getXmjy());
		kfzxxInfo.setZslj(record.getZslj());
		kfzxxInfo.setGzxz(record.getGzxz());
		kfzxxInfo.setKxsjid(record.getKxsjid());
		
		//认证信息
		kfzxxInfo.setXm(record.getXm());
		kfzxxInfo.setSfzjh(record.getSfzjh());
		kfzxxInfo.setSfzzmztjid(record.getSfzzmztjid());
		kfzxxInfo.setSfzfmztjid(record.getSfzfmztjid());
		kfzxxInfo.setSfytd(record.getSfytd());
		//个人认证
		if(!StringUtil.isEmpty(record.getSfytd())&&1==(record.getSfytd())){
			kfzxxInfo.setCompanyMc("");
			kfzxxInfo.setBusinessLicenceScanner("");
			kfzxxInfo.setBusinessLicenceNo("");
			kfzxxInfo.setOrganizateCodeScanner("");
			kfzxxInfo.setOrganizateCodeNo("");
			kfzxxInfo.setTaxRegistrationScanner("");
			kfzxxInfo.setTaxRegistrationNo("");
			kfzxxInfo.setSocialCreditCode("");
			kfzxxInfo.setEnterpriseQualificateType("");
		}else{
			//企业认证
			kfzxxInfo.setCompanyMc(record.getCompanyMc());
			kfzxxInfo.setBusinessLicenceScanner(record.getBusinessLicenceScanner());
			kfzxxInfo.setEnterpriseQualificateType(record.getEnterpriseQualificateType());
			if(EnterpriseQualificateTypeEnum.THREE.getCode().equals(record.getEnterpriseQualificateType())){
				//三证
				kfzxxInfo.setSocialCreditCode("");
				
				kfzxxInfo.setBusinessLicenceNo(record.getBusinessLicenceNo());
				kfzxxInfo.setOrganizateCodeScanner(record.getOrganizateCodeScanner());
				kfzxxInfo.setOrganizateCodeNo(record.getOrganizateCodeNo());
				kfzxxInfo.setTaxRegistrationScanner(record.getTaxRegistrationScanner());
				kfzxxInfo.setTaxRegistrationNo(record.getTaxRegistrationNo());
			}else{
				//三证合一
				kfzxxInfo.setBusinessLicenceNo("");
				kfzxxInfo.setOrganizateCodeScanner("");
				kfzxxInfo.setOrganizateCodeNo("");
				kfzxxInfo.setTaxRegistrationScanner("");
				kfzxxInfo.setTaxRegistrationNo("");
				
				kfzxxInfo.setSocialCreditCode(record.getSocialCreditCode());
			}
		}
		
		kfzxxInfo.setShzt(YhxxShztEnum.DSH.getCode());
		if(StringUtil.isEmpty(record.getWid())){
			kfzxxInfo.setVersion(0);
			kfzxxInfo.setWid(StringUtil.getUuId());
			kfzxxInfoMapper.insertSelective(kfzxxInfo);
		}else{
			kfzxxInfo.setWid(record.getWid());
			kfzxxInfoMapper.updateByPrimaryKeySelective(kfzxxInfo);
		}
		return DataResult.success(kfzxxInfo);
	}

	@Override
	public DataResult<List<Map<String, Object>>> selectCountByArea(String areaBm) {
		return DataResult.success(kfzxxInfoExtendMapper.selectCountByArea(areaBm));
	}

	
}
