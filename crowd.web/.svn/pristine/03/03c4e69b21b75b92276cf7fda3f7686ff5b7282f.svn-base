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
		if (StringUtil.isEmpty(_menuFlag) && "zckfz".equals(flag)) {
			return " active ";
		}
		return "";
	}%>
<div class="dropdown m-b-15 hidden-lg-up shop-user-nav">
	<button type="button" class="btn btn-primary btn-block dropdown-toggle"
		data-toggle="dropdown">操作手册</button>
	<div class="dropdown-menu animate w-full" role="menu">
		<a class="dropdown-item <%=setActive(menuFlag, "zckfz")%>"
			href="<%=request.getContextPath()%>/zckfz/index?flag=zckfz">如何注册开发者</a>
		<a class="dropdown-item <%=setActive(menuFlag, "zcxqf")%>"
			href="<%=request.getContextPath()%>/zcxqf/index?flag=zcxqf">如何注册需求方</a>
		<a class="dropdown-item <%=setActive(menuFlag, "kflc")%>"
			href="<%=request.getContextPath()%>/kflc/index?flag=kflc">开发者开发流程</a>
		<a class="dropdown-item <%=setActive(menuFlag, "yjsjpxjy")%>"
			href="<%=request.getContextPath()%>/fblc/index?flag=fblc">需求方发布流程</a>
	</div>
</div>
<div class="panel row m-b-0 m-r-15 hidden-md-down" boxmh-h>
	<div class="panel-body">
		<h2 class="m-l-30 font-size-18 font-weight-unset">操作手册</h2>
		<ul class="list-group m-l-15 met-sidebar-nav">
			<li class="list-group-item <%=setActive(menuFlag, "zckfz")%>"><a
				href="<%=request.getContextPath()%>/zckfz/index?flag=zckfz">如何注册开发者</a></li>
			<li class="list-group-item <%=setActive(menuFlag, "zcxqf")%>"><a
				href="<%=request.getContextPath()%>/zcxqf/index?flag=zcxqf">如何注册需求方</a></li>
			<li class="list-group-item <%=setActive(menuFlag, "kflc")%>"><a
				href="<%=request.getContextPath()%>/kflc/index?flag=kflc">开发者开发流程</a></li>
			<li class="list-group-item <%=setActive(menuFlag, "fblc")%>"><a
				href="<%=request.getContextPath()%>/fblc/index?flag=fblc">需求方发布流程</a></li>
			
		</ul>
	</div>
</div>