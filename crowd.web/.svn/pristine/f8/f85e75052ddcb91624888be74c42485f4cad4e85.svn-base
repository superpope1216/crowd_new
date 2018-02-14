package com.wisedu.crowd.controller.gzzx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wisedu.crowd.common.code.PtjyZtEnum;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.controller.BaseController;
import com.wisedu.crowd.entity.dto.PageInfo;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.gzzx.PtjyInfo;
import com.wisedu.crowd.entity.gzzx.extend.PtjyInfoExtend;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.gzzx.PtjyInfoService;

@Controller
@RequestMapping("yjsjptjy")
public class YjsjptjyController extends BaseController {
	@Autowired
	private PtjyInfoService ptjyInfoService;

	@RequestMapping("index")
	public String index() {
		return "gzzx/yjsjptjy";
	}

	@RequestMapping("query")
	@ResponseBody
	public DataResult<List<PtjyInfoExtend>> query(String content, String zt, Integer pageNum, Integer pageSize)
			throws Exception {
		PageInfo pageInfo = new PageInfo();
		if (pageNum != null) {
			pageInfo.setPageNum(pageNum);
		}
		if (pageSize != null) {
			pageInfo.setPageSize(pageSize);
		}
		PtjyInfoExtend queryPtjyInfoExtend = new PtjyInfoExtend();
		if (!StringUtil.isEmpty(content)) {
			queryPtjyInfoExtend.setContent(content);
		}
		if (!StringUtil.isEmpty(zt)) {
			queryPtjyInfoExtend.setZt(zt);
		}
		QueryCondition<PtjyInfoExtend> condition = new QueryCondition<PtjyInfoExtend>();
		condition.setPageInfo(pageInfo);
		condition.setQuery(queryPtjyInfoExtend);
		return ptjyInfoService.selectDisplayByCondition(condition, this.createCustomOperateLog());

	}

	@RequestMapping("publish")
	@ResponseBody
	public DataResult<Integer> publish(String content) throws Exception {
		PtjyInfo savePtjyInfo = new PtjyInfo();
		savePtjyInfo.setWid(StringUtil.getUuId());
		savePtjyInfo.setContent(content);
		savePtjyInfo.setFbsj(DateUtil.getCurrentDateTimeStr());
		savePtjyInfo.setFbr(this.getYhId());
		savePtjyInfo.setZt(PtjyZtEnum.DCL.getCode());
		return ptjyInfoService.insertSelective(savePtjyInfo, this.createCustomOperateLog());
	}
}
