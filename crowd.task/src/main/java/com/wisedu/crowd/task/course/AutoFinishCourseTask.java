package com.wisedu.crowd.task.course;

import java.text.SimpleDateFormat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.HttpMoocUtil;
import com.wisedu.crowd.common.util.MoocRestUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.entity.dto.QueryCondition;
import com.wisedu.crowd.entity.kcgl.extend.FinishCoursesExtend;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.dto.DataResult;
import com.wisedu.crowd.service.kcgl.FinishCoursesService;

/**
 * 用户选课数据同步
 * 
 * @author 11651
 *
 */
@Component
@Transactional
public class AutoFinishCourseTask {

	private static Logger LOG = LoggerFactory.getLogger(AutoFinishCourseTask.class);

	@Autowired
	private FinishCoursesService finishCoursesService;

	private static String cmd = MoocRestUtil.finish_courses_cmd;

	private static String client = MoocRestUtil.api_key;

	private static int index = 1;

	private static int size = 500;

	private static int turn = 1;// 统计轮次

	private static int count;// 接口数据总数量

	private static Map<String, Object> params = new HashMap<String, Object>();

	private static CustomOperateLog log = new CustomOperateLog();

	static {
		// 传给mooc那边数据
		params.put("cmd", cmd);
		params.put("client", client);
		params.put("index", index + "");
		params.put("size", size + "");
		String sign = cmd + client + index + size + MoocRestUtil.secure_key;
		params.put("sign", DigestUtils.md5Hex(sign));
	}

	// @Scheduled(cron = "0/30 * * * * ?")
	 //@Scheduled(cron="0 40 23 * * ?")
	public void run() {
		try {
			LOG.info("**************************开始统计获取用户完成学习课件********************************");

			turn = 1;
			index = 1;
			this.requestMoocRest();
			while (0!=count) {
				this.requestMoocRest();
			}
			LOG.info("**************************结束统计获取用户完成学习课件********************************");
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(e.getMessage());
		}

	}

	public static String Date2TimeStamp(String dateStr, String format) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return String.valueOf(sdf.parse(dateStr).getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	synchronized
	public void requestMoocRest() throws Exception {
		params.put("index", index + "");
		String sign = cmd + client + index + size + MoocRestUtil.secure_key;
		params.put("sign", DigestUtils.md5Hex(sign));
		JSONObject obj = HttpMoocUtil.httpPost(MoocRestUtil.restUrl, params);
		String rest_count = obj.getJSONObject("result").getString("count");
		LOG.info("用户完成学习课件统计轮次" + turn + " count " + rest_count + "-----获取用户完成学习课件接口数据---" + obj);
		String userstudy = obj.getJSONObject("result").getString("userstudy");
		JSONArray array = JSONObject.parseArray(userstudy);
     
		for (int i = 0; i < array.size(); i++) {
			// LOG.info("总数量"+(i+(turn-1)*size+1)+" city "+id);
			JSONObject json = (JSONObject) array.get(i);
			FinishCoursesExtend courses = new FinishCoursesExtend();
			String id=StringUtil.toStr(json.get("id"));
			courses.setId(id);
			courses.setCount(rest_count);
			courses.setUserid(StringUtil.toStr(json.get("userid")));
			courses.setUsername(StringUtil.toStr(json.get("username")));
			courses.setCourseid(StringUtil.toStr(json.get("courseid")));
			courses.setCoursename(StringUtil.toStr(json.get("coursename")));
			courses.setCourseopenid(StringUtil.toStr(json.get("courseopenid")));
			courses.setOpencoursename(StringUtil.toStr(json.get("opencoursename")));
			courses.setItemid(StringUtil.toStr(json.get("itemid")));
			courses.setItemname(StringUtil.toStr(json.get("itemname")));
			courses.setItemtype(StringUtil.toStr(json.get("itemtype")));
			courses.setItemtypename(StringUtil.toStr(json.get("itemtypename")));
			courses.setFirstdate(StringUtil.toStr(json.get("firstdate")));
			courses.setFirsttimedate(StringUtil.toStr(json.get("firsttimedate")));
			courses.setIsover(StringUtil.toStr(json.get("isover")));

			
			QueryCondition<FinishCoursesExtend> condition=new QueryCondition<FinishCoursesExtend>();
			condition.setQuery(courses);
			DataResult<List<FinishCoursesExtend>> result=finishCoursesService.selectByDisplayCondition(condition, log);
			if(CommonUtil.isNotEmptyList(result.getDatas())){
				if(result.getDatas().size()>=2){
					LOG.info("id  不唯一    "+id);
				}else{
					FinishCoursesExtend record=result.getDatas().get(0);
					courses.setWid(record.getWid());
					//LOG.info("更新操作  "+id);;
					finishCoursesService.updateByPrimaryKeySelective(courses, log);
				}
			}else{
				courses.setWid(StringUtil.getUuId());
				//LOG.info("新增操作  "+id);;
				finishCoursesService.insertSelective(courses, log);
			}
			
		}
		count = Integer.parseInt(rest_count);
		turn++;
	//	index++;
	}

}
