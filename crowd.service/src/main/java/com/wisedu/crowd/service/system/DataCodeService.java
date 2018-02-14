package com.wisedu.crowd.service.system;

import java.util.List;

import com.wisedu.crowd.entity.system.DataCode;

public interface DataCodeService {

	List<DataCode> selectAllByTable(String tableName);
}
