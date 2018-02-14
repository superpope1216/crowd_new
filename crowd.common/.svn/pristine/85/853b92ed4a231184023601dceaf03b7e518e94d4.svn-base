package com.wisedu.crowd.common.util;

import java.math.BigDecimal;

public class PersonalTaxUtil {

	/**
	 * 计算扣除的个税
	 * @param money
	 * @param minMoney
	 * @param sl
	 * @param sskcf
	 * @return
	 */
	public static BigDecimal calculation(BigDecimal money,Integer minMoney,Integer sl,Integer sskcf){
		if(!isNeedSubTax(money, minMoney)){
			return DecimalUtil.toDecimal("0");
		}
		BigDecimal calMoney=DecimalUtil.sub(money, DecimalUtil.toDecimal(minMoney));
		return DecimalUtil.sub(DecimalUtil.div(DecimalUtil.mul(calMoney, DecimalUtil.toDecimal(sl)),DecimalUtil.ONE_HUNDRED),DecimalUtil.toDecimal(sskcf));
		
	}
	
	/**
	 * 判断是否需要扣除个税
	 * @param money 金额
	 * @param minMoney 个税最低标准
	 * @return
	 */
	public static boolean isNeedSubTax(BigDecimal money,Integer minMoney){
		BigDecimal decMinMoney=DecimalUtil.toDecimal(minMoney);
		if(money.compareTo(decMinMoney)>0){
			return true;
		}
		return false;
	}
}
