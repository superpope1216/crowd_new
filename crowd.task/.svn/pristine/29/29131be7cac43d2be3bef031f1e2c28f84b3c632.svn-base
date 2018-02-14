package com.wisedu.crowd.task.course;

import java.text.SimpleDateFormat;

import java.util.HashMap;

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

import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.HttpMoocUtil;
import com.wisedu.crowd.common.util.MoocRestUtil;
import com.wisedu.crowd.common.util.StringUtil;
import com.wisedu.crowd.entity.kcgl.SelectCourses;
import com.wisedu.crowd.entity.log.CustomOperateLog;
import com.wisedu.crowd.service.kcgl.SelectCoursesService;

/**
 * 用户选课数据同步
 * 
 * @author 11651
 *
 */
@Component
@Transactional
public class AutoSelectCourseTask {

	private static Logger LOG = LoggerFactory.getLogger(AutoSelectCourseTask.class);

	@Autowired
	private SelectCoursesService selectCoursesService;

	private static String cmd = MoocRestUtil.select_courses_cmd;

	private static String client = MoocRestUtil.api_key;

	private static int index = 1;

	private static int size = 500;

	private static String begintime = Date2TimeStamp("1970-01-01", "yyyy-MM-dd");

	private static String endtime = Date2TimeStamp(DateUtil.getCurrentDateStr(), "yyyy-MM-dd");

	private static int turn = 1;// 统计轮次

	private static int count;// 接口数据总数量

	private static Map<String, Object> params = new HashMap<String, Object>();

	private static CustomOperateLog log = new CustomOperateLog();

	static {
		// 传给mooc那边数据
		params.put("cmd", cmd);
		params.put("client", client);
		params.put("begintime", begintime);
		params.put("endtime", endtime);
		params.put("index", index + "");
		params.put("size", size + "");
		String sign = cmd + client + begintime + endtime + index + size + MoocRestUtil.secure_key;
		params.put("sign", DigestUtils.md5Hex(sign));
	}

	//@Scheduled(cron = "0/10 * *  * * ? ")
	//@Scheduled(cron="0 45 23 * * ?")
	public void run() {
		try {
			LOG.info("**************************开始统计用户选课数据********************************");

			selectCoursesService.deleteAllSelectCourses(log);
			turn = 1;
			index = 1;
			this.requestMoocRest();
			while (count > (turn - 1) * size) {
				this.requestMoocRest();
			}
			LOG.info("**************************结束统计用户选课数据********************************");
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
		String sign = cmd + client + begintime + endtime + index + size + MoocRestUtil.secure_key;
		params.put("sign", DigestUtils.md5Hex(sign));
		JSONObject obj = HttpMoocUtil.httpPost(MoocRestUtil.restUrl, params);
		String rest_count = obj.getJSONObject("result").getString("count");
		LOG.info("用户选课统计轮次" + turn + " count " + rest_count + "-----用户选课请求接口数据---" + obj);
		String usercourse = obj.getJSONObject("result").getString("usercourse");
		JSONArray array = JSONObject.parseArray(usercourse);

		for (int i = 0; i < array.size(); i++) {
			// LOG.info("总数量"+(i+(turn-1)*size+1)+" city "+id);
			JSONObject json = (JSONObject) array.get(i);
			SelectCourses courses = new SelectCourses();
			courses.setWid(StringUtil.getUuId());
			courses.setId(StringUtil.toStr(json.get("id")));
			courses.setCount(rest_count);
			courses.setUserid(StringUtil.toStr(json.get("userid")));
			courses.setUsername(StringUtil.toStr(json.get("username")));
			courses.setCourseid(StringUtil.toStr(json.get("courseid")));
			courses.setCoursename(StringUtil.toStr(json.get("coursename")));
			courses.setCourseopenid(StringUtil.toStr(json.get("courseopenid")));
			courses.setOpencoursename(StringUtil.toStr(json.get("opencoursename")));
			courses.setProvince(StringUtil.toStr(json.get("province")));
			courses.setCity(StringUtil.toStr(json.get("city")));
			courses.setSelecttimedate(StringUtil.toStr(json.get("selecttimedate")));
			courses.setSelectdate(StringUtil.toStr(json.get("selectdate")));
			courses.setIpaddress(StringUtil.toStr(json.get("ipaddress")));
			selectCoursesService.insertSelective(courses, log);
		}
		count = Integer.parseInt(rest_count);
		turn++;
		index++;
	}

}
