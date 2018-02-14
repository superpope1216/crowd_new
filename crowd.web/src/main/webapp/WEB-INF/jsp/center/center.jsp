<%@page import="com.wisedu.crowd.common.code.CenterTypeEnum"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html class="  ">
<%@ include file="/jsp/top/top.jsp"%>
<%@ include file="/jsp/param.jsp"%>
<link rel='stylesheet'
	href='<%=request.getContextPath()%>/statics/css/card.css'>
<style>
/*模板参数列表*/
.met-muban-paralist.in dl {
	opacity: 1;
	-moz-opacity: 1;
	filter: alpha(opacity = 100);
}

.met-muban-paralist .container {
	padding-right: 14px;
	padding-left: 0px !important;
}

.met-muban-paralist>div {
	padding-bottom: 0px;
}

@media ( max-width : 991px) {
	.met-muban-paralist>div {
		padding-bottom: 10px;
	}
}

@media ( max-width : 767px) {
	.met-muban-paralist>div {
		padding-bottom: 5px;
	}
}

.met-muban-paralist dl {
	overflow: hidden;
	margin-bottom: 0px;
	margin-top: 10px;
	color: #2a333c;
	transition: all 0.5s;
	-moz-transition: all 0.5s;
	-webkit-transition: all 0.5s;
	-o-transition: all 0.5s;
	filter: alpha(opacity = 0);
}

.met-muban-paralist dl dt {
	font-weight: 300;
}

.met-muban-paralist dl dd a.link {
	color: #5e7387;
}

.met-muban-paralist dl dd a.link:hover {
	color: #4e97d9;
}

@media ( min-width : 768px) {
	.met-muban-paralist dl dt {
		width: 100px;
		float: left;
		padding: 7px 0px;
		text-align: left;
	}
	.met-muban-paralist dl dd {
		margin-left: 100px;
	}
}

.met-muban-paralist dl .res-tips {
	top: 5px;
}
</style>
<link rel='stylesheet'
	href='<%=request.getContextPath()%>/statics/css/header.css'>
</head>
<body style="background: #f0f2f5;">
	<!--[if lte IE 8]>
<div class="text-center padding-top-50 padding-bottom-50 bg-blue-grey-100">
  <p class="browserupgrade font-size-18">
	你正在使用一个<strong>过时</strong>的浏览器。请<a href="http://browsehappy.com/" target="_blank">升级您的浏览器</a>，以提高您的体验。
  </p>
</div>
<![endif]-->
	<div class="load-box"></div>
	<header>
		<%@include file="/jsp/header.jsp"%>
		<div id="header">
			<div class="overlay">
				<nav class="navbar" role="navigation">
					<div class="container" id="mycontainer">
						<!-- Brand and toggle get grouped for better mobile display -->

						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse navbar-ex1-collapse">
							<ul class="nav navbar-nav" id="header_navbar">
								<li class="${(empty flag )?'active':''}">
									<a href="<%=request.getContextPath()%>/center/index?flag=">
										<div class="text-center">
											<i class="fa fa-list fa-3x" data-original-title="" title=""></i><br>
											全部需求
										</div>
									</a>
								</li>
								<c:forEach varStatus="status" items="${rwxs}" var="data">
									<c:choose>
										<c:when test="${data.lbdm == 1}">
											<c:set var="icon" value="fa-laptop"></c:set>
											<c:set var="name" value="开发专区"></c:set>
										</c:when>
										<c:when test="${data.lbdm == 2}">
											<c:set var="icon" value="fa-dashboard"></c:set>
											<c:set var="name" value="实施专区"></c:set>
										</c:when>
										<c:when test="${data.lbdm == 3}">
											<c:set var="icon" value="fa-free-code-camp"></c:set>
											<c:set var="name" value="设计专区"></c:set>
										</c:when>
										<c:when test="${data.lbdm == 4}">
											<c:set var="icon" value="fa-bar-chart-o"></c:set>
											<c:set var="name" value="销售专区"></c:set>
										</c:when>
										<c:when test="${data.lbdm == 5}">
											<c:set var="icon" value="fa-user-plus"></c:set>
											<c:set var="name" value="售前专区"></c:set>
										</c:when>
										<c:when test="${data.lbdm == 6}">
											<c:set var="icon" value="fa-book"></c:set>
											<c:set var="name" value="培训专区"></c:set>
										</c:when>
										<c:when test="${data.lbdm == 7}">
											<c:set var="icon" value="fa-database"></c:set>
											<c:set var="name" value="测试专区"></c:set>
										</c:when>
									</c:choose>
									<li class="${(flag eq data.lbdm)?'active':''}">
									<a
										href="<%=request.getContextPath()%>/center/index?flag=${data.lbdm}">
										<div class="text-center">
											<i class="fa ${icon} fa-3x" data-original-title="" title=""></i><br>
											${name}
										</div>
									</a>
									</li>
								</c:forEach>
							</ul>
						</div>
						<!-- /.navbar-collapse -->
					</div>
				</nav>
				<!-- /.navbar-collapse -->
			</div>
		</div>
	</header>
	<div class="container">
		<div class="col-xs-12 col-sm-9">
			<div class="panel" boxmh-mh>
				<div class="panel-body shop-order"
					style="margin-top: 20px; padding-top: 10px; padding-bottom: 10px;">
					<div class="column-side ">
						<div class="container mobile-not-padding">

							<div class="met-muban-paralist " id="paralist"
								aria-expanded="false" style="">
								<div>
									<div class="met-muban-paralist-body">
										<div class="container padding-bottom-10">

											<dl id="paralist">
												<dt>
													<i class="fa fa-list" data-original-title="" title=""
														style="margin-right: 10px" id="btnQueryShow"></i>按业务域
												</dt>
												<dd>

													<a class="btn ${(empty ywxselect)?'queryActive':''} link" href="javascript:void(0);"
														title="全部" data-key="" data-option="ywx">全部</a>
													<c:forEach items="${ywx}" var="data">
														<a class="btn link ${((not empty ywxselect) and (ywxselect eq data.lbdm))?'queryActive':''}" href="javascript:void(0);"
															data-option="ywx" title="${data.lbmc}"
															data-key="${data.lbdm}">${data.lbmc}</a>
													</c:forEach>


												</dd>
											</dl>
											<dl style="display: none;" id="divQueryKfkj">
												<dt>
													<span style="margin-right: 19px">&nbsp;</span>按开发框架
												</dt>
												<dd>

													<a class="btn ${(empty kfkjselect)?'queryActive':''} link" href="javascript:void(0);"
														title="全部" data-key="" data-option="kfkj">全部</a>
													<c:forEach items="${kfkj}" var="data">
														<a class="btn link ${((not empty kfkjselect) and (kfkjselect eq data.lbdm))?'queryActive':''}" href="javascript:void(0);"
															data-key="${data.lbdm}" data-option="kfkj"
															title="${data.lbmc}">${data.lbmc} </a>
													</c:forEach>

												</dd>
											</dl>
											<dl style="display: none;" id="divQueryXqzt">
												<dt>
													<span style="margin-right: 19px">&nbsp;</span>按需求状态
												</dt>
												<dd>

													<a class="btn queryActive link" href="javascript:void(0);"
														title="全部" data-key="" data-option="rwzt">全部</a>
													<c:forEach items="${rwjd}" var="data">
														<a class="btn link" href="javascript:void(0);"
															data-key="${data.lbdm}" title="${data.lbmc}"
															data-option="rwzt">${data.lbmc} </a>
													</c:forEach>

												</dd>
											</dl>
											<dl style="display: none;" id="divQueryRyyq">
												<dt>
													<span style="margin-right: 19px">&nbsp;</span>按人员要求
												</dt>
												<dd>
													<c:forEach items="${rwlb}" var="data" varStatus="status">
														<c:choose>
															<c:when test="${data.lbdm eq '1'}">
																<a class="btn queryActive link" href="javascript:void(0);"
															data-key="${data.lbdm}" title="${data.lbmc}"
															data-option="ryyq">${data.lbmc} </a>		
															</c:when>
															<c:otherwise>
																	<a class="btn link" href="javascript:void(0);"
															data-key="${data.lbdm}" title="${data.lbmc}"
															data-option="ryyq">${data.lbmc} </a>
															</c:otherwise>
														</c:choose>
														
													</c:forEach>

												</dd>
											</dl>
											<dl style="display: none;" id="divQueryXsrw">
												<dt>
													<span style="margin-right: 19px">&nbsp;</span>新手需求
												</dt>
												<dd>
													<a class="btn queryActive link" href="javascript:void(0);"
														title="全部" data-key="" data-option="xsrw">全部</a>
													<a class="btn  link" href="javascript:void(0);"
														title="全部" data-key="1" data-option="xsrw">是</a>
														<a class="btn  link" href="javascript:void(0);"
														title="全部" data-key="0" data-option="xsrw">否</a>
												</dd>
											</dl>
											<dl style="display: none;" id="divQueryPx">
												<dt>
													<span style="margin-right: 19px">&nbsp;</span>排序
												</dt>
												<dd>
													<a class="btn queryActive link" href="javascript:void(0);"
															data-key="" title="默认"
															data-option="px">默认</a>
													<a class="btn link" href="javascript:void(0);"
															data-key="1" title="按价格"
															data-option="px">按价格</a>
													<a class="btn link" href="javascript:void(0);"
															data-key="2" title="按发布时间"
															data-option="px">按发布时间</a>
													
												</dd>
											</dl>
											<!-- <dl>
								<dt>按价格</dt>
								<dd>

									<a class="btn queryActive link" href="https://www.metinfo.cn/product/"
										title="全部">全部</a> <a class="btn link"
										href="index.php?lang=cn&amp;searchlist=199" title="199 元">199
										元</a> <a class="btn link"
										href="index.php?lang=cn&amp;searchlist=299" title="299 元">299
										元</a> <a class="btn link"
										href="index.php?lang=cn&amp;searchlist=399" title="399 元">399
										元</a> <a> <i
										class="icon pe-help1 font-size-20 hidden-xs res-tips"
										aria-hidden="true" data-plugin="webuiPopover"
										data-trigger="hover" data-width="500"
										data-content="<div style='white-space: nowrap;'>199 元：单独的电脑模板或手机模板<br>299 元：第一版响应式，满足企业网站基本的「多终端」展示需求<br>399 元：第二版响应式，性能更强，体验更佳，效果更炫的「多终端」展示</div>"
										data-animation="fade" data-target="webuiPopover1"></i>
									</a>

								</dd>
							</dl>
 -->
										</div>
									</div>
								</div>
							</div>
							<div class="column-hover">

								<ul></ul>
								<ul></ul>
							</div>

						</div>
					</div>
				</div>
			</div>
		

			<div class="panel m-b-0" boxmh-mh>
				<div class="panel-body shop-order" style="padding-top: 10px;">
					<div class="row" style="min-height: 200px;">
						<div class="center-left-body">
							<!-- <header class="center-left-header">
								<span class="span-content"><input class="input-DvJ_0"><span
									class="fa fa-search search"></span></span>
							</header> -->
							<div>
								<span style="display: none;"></span>
								<div id="divContent">
								</div>
							</div>
							<footer class="bg-white">
								<div class="mypaging2 clearfix"></div>
							</footer>
						</div>
					</div>


				</div>
			</div>
		</div>

		<!-- <ul
			class="offers-section blocks-2 blocks-sm-3 blocks-md-4 blocks-xlg-5  met-page-ajax met-grid"
			id="crowd-grid" data-scale="1">
			

		</ul> -->

		<!-- <div class="grey-box">
		<div class="container">
			<div class="host-cut">
				<div class="host-list active">
					<ul class="blocks-2 blocks-sm-3 blocks-md-4 blocks-xlg-5  met-page-ajax met-grid"
						id="crowd-grid" data-scale='1'>

						

						

					</ul>

					<div class="hidden-xs">
						<div class='met_pager'>
							<span class='PreSpan'><</span><a href=../product / class='Ahover'>1</a><a
								href=product.php?lang=cn&class1=118&page=2>2</a><a
								href=product.php?lang=cn&class1=118&page=3>3</a><a
								href=product.php?lang=cn&class1=118&page=2 class='NextA'>></a> <span
								class='PageText'>转至第</span> <input type='text' id='metPageT'
								data-pageurl='product.php?lang=cn&class1=118&page=||3' value='1' />
							<input type='button' id='metPageB' value='页' />
						</div>
					</div>



				</div>
			</div>
		</div>
	</div>
 -->
		<div class="col-xs-12 col-sm-3">
			<div class="panel m-b-0" boxmh-mh style="margin-top: 20px;">
				<div class="panel-body shop-order">
					<div class="center-right-header">
						<!-- react-text: 127 -->
						需求工作指南
						<!-- /react-text -->
						<a class="center-right-header-more" href="<%=request.getContextPath() %>/fbzx/index?flag=fbxz"
							target="_blank">了解更多</a>
					</div>
					<div class="center-right-body">
						<div>
							<ul>
								<li><b><i>1</i></b> <!-- react-text: 358 -->发布需求<!-- /react-text --></li>
								<li><b><i>2</i></b> <!-- react-text: 362 -->招募开发者<!-- /react-text --></li>
								<li><b><i>3</i></b> <!-- react-text: 366 -->选择开发者<!-- /react-text --></li>
								<li><b><i>4</i></b> <!-- react-text: 370 -->冻结项目预算<!-- /react-text --></li>
								<li><b><i>5</i></b> <!-- react-text: 374 -->验收支付<!-- /react-text --></li>
								<li><b><i>6</i></b> <!-- react-text: 374 -->售后支付<!-- /react-text --></li>
							</ul>
							<a href="<%=request.getContextPath() %>/publishing/index"><button
									class="button-3791w publish-2ReEl block-1WyYE primary-32yiR">立即发布需求</button></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@ include file="/jsp/footer/footer.jsp"%>
	<button type="button"
		class="btn btn-icon btn-primary btn-squared met-scroll-top hide">
		<i class="icon wb-chevron-up" aria-hidden="true"></i>
	</button>
	<script>
		var jsonurl = "";
		var classify = "${param.classify}";
		var lbdm = "${flag}";
		var condition="${condition}";
	</script>

	<%@ include file="/jsp/bottom.jsp"%>


	<script
		src="<%=request.getContextPath()%>/statics/pagejs/hall/index.js"></script>
	<script
		src="<%=request.getContextPath()%>/statics/pagejs/center/center.js?123"></script>
</body>
</html>
