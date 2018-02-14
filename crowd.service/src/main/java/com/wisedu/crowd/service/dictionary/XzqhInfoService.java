package com.wisedu.crowd.service.dictionary;

import java.util.List;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.entity.dictionary.XzqhInfo;

public interface XzqhInfoService {

	public  List<XzqhInfo> selectByCondition(XzqhInfo xzqhInfo)throws ServiceException;

	
}
