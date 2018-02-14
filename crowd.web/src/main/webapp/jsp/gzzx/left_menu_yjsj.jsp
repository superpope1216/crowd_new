<%@page import="com.wisedu.crowd.common.util.StringUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String menuFlag = request.getParameter("flag");
%>
<%!public String setActive(String _menuFlag, String flag) {

		if (flag.equals(_menuFlag)) {
			return " active ";
		}
		if (StringUtil.isEmpty(_menuFlag) && "yjsjsm".equals(flag)) {
			return " active ";
		}
		return "";
	}%>
<div class="dropdown m-b-15 hidden-lg-up shop-user-nav">
	<button type="button" class="btn btn-primary btn-block dropdown-toggle"
		data-toggle="dropdown">建议与反馈</button>
	<div class="dropdown-menu animate w-full" role="menu">
		<a class="dropdown-item <%=setActive(menuFlag, "yjsjsm")%>"
			href="<%=request.getContextPath()%>/yjsjsm/index?flag=yjsjsm">机制说明</a>
		<a class="dropdown-item <%=setActive(menuFlag, "yjsjptjy")%>"
			href="<%=request.getContextPath()%>/yjsjptjy/index?flag=yjsjptjy">平台建议</a>
		<a class="dropdown-item <%=setActive(menuFlag, "yjsjjnjy")%>"
			href="<%=request.getContextPath()%>/yjsjjnjy/index?flag=yjsjjnjy">技能建议</a>
		<a class="dropdown-item <%=setActive(menuFlag, "yjsjpxjy")%>"
			href="<%=request.getContextPath()%>/yjsjpxjy/index?flag=yjsjpxjy">培训建议</a>
	</div>
</div>
<div class="panel row m-b-0 m-r-15 hidden-md-down" boxmh-h>
	<div class="panel-body">
		<h2 class="m-l-30 font-size-18 font-weight-unset">建议与反馈</h2>
		<ul class="list-group m-l-15 met-sidebar-nav">
			<li class="list-group-item <%=setActive(menuFlag, "yjsjsm")%>"><a
				href="<%=request.getContextPath()%>/yjsjsm/index?flag=yjsjsm">机制说明</a></li>
			<li class="list-group-item <%=setActive(menuFlag, "yjsjptjy")%>"><a
				href="<%=request.getContextPath()%>/yjsjptjy/index?flag=yjsjptjy">平台建议</a></li>
			<li class="list-group-item <%=setActive(menuFlag, "yjsjjnjy")%>"><a
				href="<%=request.getContextPath()%>/yjsjjnjy/index?flag=yjsjjnjy">技能建议</a></li>
			<li class="list-group-item <%=setActive(menuFlag, "yjsjpxjy")%>"><a
				href="<%=request.getContextPath()%>/yjsjpxjy/index?flag=yjsjpxjy">培训建议</a></li>
			
		</ul>
	</div>
</div>