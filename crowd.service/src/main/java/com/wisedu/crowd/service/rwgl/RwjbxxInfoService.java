package com.wisedu.crowd.service.rwgl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.rwgl.RwjbxxExtInfo;
import com.wisedu.crowd.entity.rwgl.RwjbxxInfo;
import com.wisedu.crowd.entity.rwgl.RwtbxxInfo;
import com.wisedu.crowd.entity.rwgl.extend.RwjbxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface RwjbxxInfoService {

	  /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> deleteByPrimaryKey(String wid) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> insertSelective(RwjbxxInfo record) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<RwjbxxInfo> selectByPrimaryKey(String wid) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-11-13
    */
   DataResult<Integer> updateByPrimaryKeySelective(RwjbxxInfo record) throws ServiceException;
   
   /**
    * 发布任务基本信息
    * @param rwjbxxInfo
    * @param rwjbxxExtInfo
    * @return
    * @throws ServiceException
    */
   DataResult<Integer> publishing(RwjbxxInfo rwjbxxInfo,RwjbxxExtInfo rwjbxxExtInfo,String flag,CustomOperateLog log) throws ServiceException;
   
   /**
	 * 大厅众包专用
	 * @param record
	 * @return
	 */
   DataResult<List<RwjbxxInfoExtend>> selectForCenter(QueryCondition<RwjbxxInfoExtend> record) throws ServiceException;
   
   DataResult<List<RwjbxxInfoExtend>> selectDisplayByCondition(QueryCondition<RwjbxxInfoExtend> record) throws ServiceException;
   
   DataResult<List<RwjbxxInfoExtend>> selectByCondition(QueryCondition<RwjbxxInfoExtend> record,CustomOperateLog log) throws ServiceException;
   
   DataResult<List<RwjbxxInfoExtend>> selectDisplayByLikeCondition(QueryCondition<RwjbxxInfoExtend> record) throws ServiceException;

   
   DataResult<Integer> selectCountByCondition(QueryCondition<RwjbxxInfoExtend> record,CustomOperateLog log) throws ServiceException;
   /**
    * 收回需求
    * @param rwid
    * @param log
    * @return
    * @throws ServiceException
    */
   DataResult<Integer> reback(String rwid,String shly,CustomOperateLog log) throws ServiceException;
   /**
    * 
    * @param rwid
    * @param xmysje
    * @param jfrq
    * @param log
    * @return
    * @throws ServiceException
    */
   DataResult<Integer> modifyDate(String rwid,String zbjzrq,String jfrq,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> delete(String rwid,CustomOperateLog log) throws ServiceException; 
   
   DataResult<Integer> doTb(String rwid,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> toTb(RwtbxxInfo rwtbxxInfo,CustomOperateLog log) throws ServiceException;
   /**
    * 选标
    * @param tbid
    * @param kfzid
    * @param log
    * @return
    * @throws ServiceException
    */
   DataResult<Integer> selectTb(String tbid,CustomOperateLog log) throws ServiceException;
   /**
    * 申请验收
    * @param rwid
    * @param log
    * @return
    * @throws ServiceException
    */
   DataResult<Integer> applyAccept(String rwid,Integer score,String content,CustomOperateLog log) throws ServiceException;
   
   /**
    * 申请售后结束
    * @param rwid
    * @param log
    * @return
    * @throws ServiceException
    */
   DataResult<Integer> applyEndSale(String rwid,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> accept(String rwid,String pjjg,String bz,Float kfzl,Float fwzl,Float xysd,CustomOperateLog log) throws ServiceException;
   /**
    * 售后
    * @param rwid
    * @param pjjg
    * @param bz
    * @param kfzl
    * @param fwzl
    * @param xysd
    * @param log
    * @return
    * @throws ServiceException
    */
   DataResult<Integer> saleEnd(String rwid,String pjjg,String bz,Float kfzl,Float fwzl,Float xysd,CustomOperateLog log) throws ServiceException;
   
   DataResult<Map<String,BigDecimal>> selectSumMoney(QueryCondition<RwjbxxInfoExtend> record,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> publishingQuestion(String rwid,String rwmc,String xmgs,String jfrq,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> selectCountHasTb(String xqfid, Integer xmzt,CustomOperateLog log) throws ServiceException;
   
   
   DataResult<List<Map<String,Object>>> selectNewZbxx(PageInfo pageInfo,CustomOperateLog log) throws ServiceException;
   
   DataResult<BigDecimal> selectSumZbjeByKfzid(String kfzid,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> xqfDoPj(String rwid,String bz,Float kfzl,Float fwzl,Float xysd,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> kfzDoPj(String rwid,Integer score,String content,CustomOperateLog log) throws ServiceException;
   /**
    * 退出投标
    * @param rwid
    * @param log
    * @return
    * @throws ServiceException
    */
   DataResult<Integer> outTb(String rwid,CustomOperateLog log) throws ServiceException;
   
   /**
    * 检测是否需要售后
    * @param rwjbxxInfo
    * @return
    */
   boolean checkNeedSh(RwjbxxInfo rwjbxxInfo); 
   /**
    * 检测是否可结束验收/售后
    * @param wid
    * @return
    */
   DataResult<Boolean> checkAccept(String wid,CustomOperateLog log) throws ServiceException;

   /**
    * 保存开发者信誉积分信息
    * @author dell
    * @param rwjbxxInfo  任务基本信息
    * @param xmzt        项目操作
    * @param flag        标志  1--任务操作积分；2--延期得分；3--投诉得分；4--评价得分
    * @param pjjg        评价结果
    * @return
    * @throws ServiceException
    * @since JDK 1.6
    */
   DataResult<Integer> saveKfzxyjfxx(RwjbxxInfo rwjbxxInfo, int xmzt, String flag, String pjjg, CustomOperateLog log) throws ServiceException;
   
   /**
    * 保存需求方得分信息
    * @author dell
    * @param rwjbxxInfo   任务基本信息
    * @param flag         标志1--验收得分；2--评价得分；3--投诉得分
    * @param pjScore      评价得分
    * @param autoYs       是否自动验收
    * @param log
    * @return
    * @throws ServiceException
    * @since JDK 1.6
    */
   DataResult<Integer> saveXqfxyjfxx(RwjbxxInfo rwjbxxInfo, String flag, int pjScore, boolean autoYs, CustomOperateLog log) throws ServiceException;
   
}
