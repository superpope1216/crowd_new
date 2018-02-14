<%@page import="com.wisedu.crowd.common.util.StringUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String menuFlag = request.getParameter("flag");
%>
<%!public String setActive(String _menuFlag, String flag) {

		if (flag.equals(_menuFlag)) {
			return " active ";
		}
		if (StringUtil.isEmpty(_menuFlag) && "xyxx".equals(flag)) {
			return " active ";
		}
		return "";
	}%>
<div class="dropdown m-b-15 hidden-lg-up shop-user-nav">
	<button type="button" class="btn btn-primary btn-block dropdown-toggle"
		data-toggle="dropdown">学员中心</button>
	<div class="dropdown-menu animate w-full" role="menu">
		<a class="dropdown-item <%=setActive(menuFlag, "xyxx")%>"
			href="<%=request.getContextPath()%>/xyxx/index?flag=xyxx">个人中心</a>
		<a class="dropdown-item <%=setActive(menuFlag, "xyBasicInfo")%>"
			href="<%=request.getContextPath()%>/xyBasicInfo/index?flag=xyBasicInfo">基本信息</a>
		<a class="dropdown-item <%=setActive(menuFlag, "train")%>"
			href="<%=request.getContextPath()%>/xyTrain/index?flag=train">我的培训</a>
		<a class="dropdown-item <%=setActive(menuFlag, "qualify")%>"
			href="<%=request.getContextPath()%>/develoeprQualify/index?flag=qualify">技能认证</a>
	</div>
</div>
<div class="panel row m-b-0 m-r-15 hidden-md-down" boxmh-h>
	<div class="panel-body">
		<h2 class="m-l-30 font-size-18 font-weight-unset">学员中心</h2>
		<ul class="list-group m-l-15 met-sidebar-nav">
			<li class="list-group-item <%=setActive(menuFlag, "xyxx")%>"><a
				href="<%=request.getContextPath()%>/xyxx/index?flag=xyxx">个人中心</a></li>
			<li class="list-group-item <%=setActive(menuFlag, "xyBasicInfo")%>"><a
				href="<%=request.getContextPath()%>/xyBasicInfo/index?flag=xyBasicInfo">基本信息</a>
			<li class="list-group-item <%=setActive(menuFlag, "train")%>"><a
				href="<%=request.getContextPath()%>/xyTrain/index?flag=train">我的培训</a></li>
			<li class="list-group-item <%=setActive(menuFlag, "qualify")%>"><a
				href="<%=request.getContextPath()%>/developerQualify/index?flag=qualify">技能认证</a></li>	
		</ul>
	</div>
</div>