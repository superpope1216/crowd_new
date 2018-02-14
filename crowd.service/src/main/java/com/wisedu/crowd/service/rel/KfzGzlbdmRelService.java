package com.wisedu.crowd.service.rel;


/**
 * 开发者  和工作类别 中间表   Service
 * 表(t_crowd_rel_kfzid_gzlbdm)
 */
import com.wisedu.crowd.service.dto.DataResult;

public interface KfzGzlbdmRelService {
   
    DataResult<Integer> delKfzGzlbdmRel(String kfzid);
	
	/**
	 * 批量新增
	 * @param record
	 */
    DataResult<Integer> addKfzGzlbdmRel(String kfzid,String yhid,String lbdm);
	
	
}
