package com.wisedu.crowd.service.yhgl;

import java.util.List;

import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.entity.yhgl.KfzxxInfo;
import com.wisedu.crowd.entity.yhgl.XqfxxInfo;
import com.wisedu.crowd.entity.yhgl.YhjbxxInfo;
import com.wisedu.crowd.entity.yhgl.extend.YhjbxxInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;

public interface YhjbxxInfoService {
	 /**
//    *
//    * @mbggenerated 2017-11-02
//    */
   int deleteByPrimaryKey(String wid) throws ServiceException;
   
   YhjbxxInfo saveYhjbxxInfo(YhjbxxInfo record,CustomOperateLog log) throws ServiceException;

  

   /**
    *
    * @mbggenerated 2017-11-02
    */
   YhjbxxInfo selectByPrimaryKey(String wid) throws ServiceException;

//   
   List<YhjbxxInfoExtend> selectByCondition(YhjbxxInfoExtend condition) throws ServiceException;
   /**
    * 用户注册
    * @param yhjbxxInfo
    * @param confirmPassword
    * @throws ServiceException
    */
   YhjbxxInfoExtend register(YhjbxxInfoExtend yhjbxxInfo,String confirmPassword,CustomOperateLog log) throws ServiceException;
   
   DataResult<YhjbxxInfoExtend> login(String userName,String password,CustomOperateLog log) throws ServiceException;
   /**
    * 管理端等路
    * @param userName
    * @param password
    * @param log
    * @return
    * @throws ServiceException
    */
   DataResult<YhjbxxInfoExtend> loginAdmin(String userName,String password,CustomOperateLog log) throws ServiceException;
   
   /**
    * 需求方 注册
    * @param yhjbxxInfo
    * @param confirmPassword
    * @param log
    * @return
    * @throws ServiceException
    */
  YhjbxxInfoExtend demandRegister(YhjbxxInfoExtend yhjbxxInfo,String confirmPassword,XqfxxInfo record,CustomOperateLog log) throws ServiceException;

  /**
   * 开发方注册
   * @param yhjbxxInfo
   * @param confirmPassword
   * @param record
   * @param log
   * @return
   * @throws ServiceException
   */
  YhjbxxInfoExtend developerRegister(YhjbxxInfoExtend yhjbxxInfo,String confirmPassword,KfzxxInfo record,CustomOperateLog log) throws ServiceException;
  
  
  /**
   * 修改用户密码
   * @param yhjbxxInfo
   * @param confirmPassword
   * @param log
   * @return
   * @throws ServiceException
   */
  YhjbxxInfo fixYhjbxxPassword(YhjbxxInfo yhjbxxInfo,String newPassword,String confirmPassword,CustomOperateLog log) throws ServiceException;
   
  /**
   * 检查手机号是否重复
   * @param yhjbxxInfo
   * @param log
   * @return
   * @throws ServiceException
   */
  boolean checkYhjbxxSjh(YhjbxxInfo yhjbxxInfo,CustomOperateLog log) throws ServiceException;

   
    void  resetPwd(String phone,String newPassword,String confirmPassword); 
    
    DataResult<Integer> selectCountByCondition(YhjbxxInfoExtend condition,CustomOperateLog log) throws ServiceException;
}