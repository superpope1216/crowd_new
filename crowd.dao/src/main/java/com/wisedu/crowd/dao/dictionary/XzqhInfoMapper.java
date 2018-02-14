package com.wisedu.crowd.dao.dictionary;

import java.util.List;

import com.wisedu.crowd.entity.dictionary.XzqhInfo;

public interface XzqhInfoMapper {
   
	public  List<XzqhInfo> selectByCondition(XzqhInfo xzqhInfo);

	
}