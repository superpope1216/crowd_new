package com.wisedu.crowd.common.util;

import java.math.BigDecimal;

public class ConstantsUtil {

	/**
	 * 用户基本信息
	 */
	
	public final static String SESSION_YHJBXX_ID="SESSION_YHJBXX_ID";
	public final static String SESSION_YHJBXX="SESSION_YHJBXX";
	public final static String SESSION_GROUP_YHZ="SESSION_GROUP_YHZ";
	public final static String SESSION_GROUP_CURRENT_YHZ="SESSION_GROUP_CURRENT_YHZ";
	public final static String SESSION_KFZXX="SESSION_KFZXX";
	
	public final static String SESSION_XQFXX="SESSION_XQFXX";
	
	public final static String SESSION_XYXX="SESSION_XYXX";
	
	public final static String IS_KFZ="SESSION_IS_KFZ";
	
	public final static String IS_XQF="SESSION_IS_XQF";
	
	public final static String IS_XY="SESSION_IS_XY";
	
	public final static String EMAIL_NAME="@wisedu.com";
	
	public final static String TOKEN="token";
	
	public final static Float DEFAULT_SCORE=3F;
	/**
	 * 最大得分
	 */
	public final static int MAX_SCORE=5;
	
	public final static BigDecimal xsrwje=DecimalUtil.toDecimal("5000");
	/**
	 * 每小时工作量价格
	 */
	public final static BigDecimal HOUR_MONEY=DecimalUtil.toDecimal("50");
	/**
	 * 每月工作量
	 */
	public final static BigDecimal MONTH_WORK=DecimalUtil.toDecimal("176");
	/**
	 * 没有工作量价格
	 */
	public final static BigDecimal MONTH_MONEY=DecimalUtil.toDecimal("18000");
    
    /**
     * 手机验证码 标识
     */
    public static final String PHONE_VERIFICATION="PHONEVERIFICATION";
    
    /**
     * 邮箱验证码 标识
     */
    public static final String EMAIL_VERIFICATION="EMAIL_VERIFICATION";

    
    public static final String XMJBXX_TS_BH="-999999999";
    
    /**
     * 系统附件路径
     */
    public static String SYSATTACHMENTFILEPATH="";
    
    
    /**
	 * 开始月份
	 */
	public static final String BEGIN_MONTH="04";
	/**
	 * 结束月份
	 */
	public static final String END_MONTH="03";
}
