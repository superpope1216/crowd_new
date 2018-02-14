package com.wisedu.crowd.entity.kcgl;

import java.io.Serializable;

public class SelectCourses implements Serializable{
	
	 private static final long serialVersionUID = 1L;
    /**
     * 
     */
    private String wid;

    /**
     * 用户选课唯一标识(接口返回的）
     */
    private String id;

    /**
     * 总数量
     */
    private String count;

    /**
     * 用户编号
     */
    private String userid;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 课程名称
     */
    private String coursename;

    /**
     * 开课编号
     */
    private String courseopenid;

    /**
     * 开课名称
     */
    private String opencoursename;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 选课时间戳
     */
    private String selecttimedate;

    /**
     * 选课时间
     */
    private String selectdate;

    /**
     * 选课时IP地址
     */
    private String ipaddress;
    
    
    private String courseid;
    

	public String getCourseid() {
		return courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	/**
     * 
     * @return WID 
     */
    public String getWid() {
        return wid;
    }

    /**
     * 
     * @param wid 
     */
    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    /**
     * 用户选课唯一标识(接口返回的）
     * @return ID 用户选课唯一标识(接口返回的）
     */
    public String getId() {
        return id;
    }

    /**
     * 用户选课唯一标识(接口返回的）
     * @param id 用户选课唯一标识(接口返回的）
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 总数量
     * @return COUNT 总数量
     */
    public String getCount() {
        return count;
    }

    /**
     * 总数量
     * @param count 总数量
     */
    public void setCount(String count) {
        this.count = count == null ? null : count.trim();
    }

    /**
     * 用户编号
     * @return USERID 用户编号
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 用户编号
     * @param userid 用户编号
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * 用户名称
     * @return USERNAME 用户名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名称
     * @param username 用户名称
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 课程名称
     * @return COURSENAME 课程名称
     */
    public String getCoursename() {
        return coursename;
    }

    /**
     * 课程名称
     * @param coursename 课程名称
     */
    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    /**
     * 开课编号
     * @return COURSEOPENID 开课编号
     */
    public String getCourseopenid() {
        return courseopenid;
    }

    /**
     * 开课编号
     * @param courseopenid 开课编号
     */
    public void setCourseopenid(String courseopenid) {
        this.courseopenid = courseopenid == null ? null : courseopenid.trim();
    }

    /**
     * 开课名称
     * @return OPENCOURSENAME 开课名称
     */
    public String getOpencoursename() {
        return opencoursename;
    }

    /**
     * 开课名称
     * @param opencoursename 开课名称
     */
    public void setOpencoursename(String opencoursename) {
        this.opencoursename = opencoursename == null ? null : opencoursename.trim();
    }

    /**
     * 省
     * @return PROVINCE 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 市
     * @return CITY 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 市
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 选课时间戳
     * @return SELECTTIMEDATE 选课时间戳
     */
    public String getSelecttimedate() {
        return selecttimedate;
    }

    /**
     * 选课时间戳
     * @param selecttimedate 选课时间戳
     */
    public void setSelecttimedate(String selecttimedate) {
        this.selecttimedate = selecttimedate == null ? null : selecttimedate.trim();
    }

    /**
     * 选课时间
     * @return SELECTDATE 选课时间
     */
    public String getSelectdate() {
        return selectdate;
    }

    /**
     * 选课时间
     * @param selectdate 选课时间
     */
    public void setSelectdate(String selectdate) {
        this.selectdate = selectdate == null ? null : selectdate.trim();
    }

    /**
     * 选课时IP地址
     * @return IPADDRESS 选课时IP地址
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * 选课时IP地址
     * @param ipaddress 选课时IP地址
     */
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    /**
     *
     * @mbggenerated 2018-02-01
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", id=").append(id);
        sb.append(", count=").append(count);
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", coursename=").append(coursename);
        sb.append(", courseopenid=").append(courseopenid);
        sb.append(", opencoursename=").append(opencoursename);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", selecttimedate=").append(selecttimedate);
        sb.append(", selectdate=").append(selectdate);
        sb.append(", ipaddress=").append(ipaddress);
        sb.append("]");
        return sb.toString();
    }
}