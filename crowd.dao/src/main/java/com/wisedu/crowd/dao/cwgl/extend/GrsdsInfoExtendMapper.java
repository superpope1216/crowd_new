package com.wisedu.crowd.dao.cwgl.extend;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wisedu.crowd.entity.cwgl.GrsdsInfo;
import com.wisedu.crowd.entity.cwgl.extend.GrsdsInfoExtend;

public interface GrsdsInfoExtendMapper {
    
	List<GrsdsInfoExtend> selectByMoney(@Param("money") BigDecimal money);
}