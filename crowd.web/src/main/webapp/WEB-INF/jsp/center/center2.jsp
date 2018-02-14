<%@page import="com.wisedu.crowd.common.code.CenterTypeEnum"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html class="  ">
<%@ include file="/jsp/top/top.jsp"%>
<%@ include file="/jsp/param.jsp"%>
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
	padding-bottom: 20px;
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
	opacity: 0;
	-moz-opacity: 0;
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
</head>
<body>
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
                    <div class="container">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header">
                            <button type="button" class="btn-block btn-drop navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                                <strong>MENU</strong>
                            </button>
                        </div>
                    
                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse navbar-ex1-collapse">
                            <ul class="nav navbar-nav">
                                <li>
                                    <a href="index.html">
                                        <div class="text-center">
                                            <i class="fa fa-dashboard fa-3x" data-original-title="" title=""></i><br>
                                            Dashboard
                                        </div>
                                    </a>
                                </li>
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                        <div class="text-center">
                                            <i class="fa fa-laptop fa-3x" data-original-title="" title=""></i><br>
                                            UI Element <span class="caret"></span>
                                        </div>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="button.html"><i class="fa fa-lemon-o" data-original-title="" title=""></i> Button</a></li>
                                        <li><a href="icon.html"><i class="fa fa-puzzle-piece" data-original-title="" title=""></i> Icon</a></li>
                                        <li><a href="panel-well.html"><i class="fa fa-file" data-original-title="" title=""></i> Panel &amp; Well</a></li>
                                        <li class="divider"></li>
                                        <li><a href="grid.html"><i class="fa fa-th" data-original-title="" title=""></i> Grid</a></li>
                                        <li><a href="breadcrumb-pagination.html"><i class="fa fa-send" data-original-title="" title=""></i> Breadcrumb &amp; Pagination</a></li>
                                        <li><a href="jumbotron-thumbnail.html"><i class="fa fa-flag" data-original-title="" title=""></i> Jumbotron &amp; Thumbnail</a></li>
                                        <li class="divider"></li>
                                        <li><a href="collapse.html"><i class="fa fa-archive" data-original-title="" title=""></i> Collapse</a></li>
                                        <li><a href="typography.html"><i class="fa fa-font" data-original-title="" title=""></i> Typography</a></li>
                                        <li><a href="alert-progress-bar.html"><i class="fa fa-coffee" data-original-title="" title=""></i> Alert &amp; Progress Bar</a></li>
                                        <li class="divider"></li>
                                        <li><a href="list-media.html"><i class="fa fa-paw" data-original-title="" title=""></i> List Media</a></li>
                                        <li><a href="slider.html"><i class="fa fa-legal" data-original-title="" title=""></i> Slider</a></li>
                                        <li><a href="popup-notip.html"><i class="fa fa-bullhorn" data-original-title="" title=""></i>Popup &amp; Notifications</a></li>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                        <div class="text-center">
                                             <i class="fa fa-list fa-3x" data-original-title="" title=""></i><br>
                                            Form Element <span class="caret"></span>
                                        </div>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="form-component.html"><i class="fa fa-list-alt" data-original-title="" title=""></i> Form Component</a></li>
                                        <li><a href="advanced-component.html"><i class="fa fa-list-ul" data-original-title="" title=""></i> Advanced Component</a></li>
                                        <li><a href="form-wizard.html"><i class="fa fa-columns" data-original-title="" title=""></i> Form Wizard</a></li>
                                        <li class="divider"></li>
                                        <li><a href="form-validation.html"><i class="fa fa-check-square" data-original-title="" title=""></i> Form-Validation</a></li>
                                        <li><a href="dropzone-file-upload.html"><i class="fa fa-send" data-original-title="" title=""></i> Dropzone File Upload</a></li>
                                        <li><a href="multiple-file-upload.html"><i class="fa fa-file-o" data-original-title="" title=""></i> Multiple File Upload</a></li>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                        <div class="text-center">
                                            <i class="fa fa-folder-open fa-3x" data-original-title="" title=""></i><br>
                                            Data Tables <span class="caret"></span>
                                        </div>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="basic-table.html"><i class="fa fa-table" data-original-title="" title=""></i> Basic Table</a></li>
                                        <li><a href="responsive-table.html"><i class="fa fa-table" data-original-title="" title=""></i> Responsive Table</a></li>
                                        <li><a href="dynamic-table.html"><i class="fa fa-table" data-original-title="" title=""></i> Dynamic Table</a></li>
                                        <li><a href="editable-table.html"><i class="fa fa-table" data-original-title="" title=""></i> Editable Table</a></li>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                        <div class="text-center">
                                            <i class="fa fa-bar-chart-o fa-3x" data-original-title="" title=""></i><br>
                                            charts <span class="caret"></span>
                                        </div>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="moris.html"><i class="fa fa-bar-chart-o" data-original-title="" title=""></i> Moris</a></li>
                                        <li><a href="chartjs.html"><i class="fa fa-bar-chart-o" data-original-title="" title=""></i> Chartjs</a></li>
                                        <li><a href="xcharts.html"><i class="fa fa-bar-chart-o" data-original-title="" title=""></i> xCharts</a></li>
                                    </ul>
                                </li>
                                <li>
                                    <a href="google-maps.html">
                                        <div class="text-center">
                                            <i class="fa fa-location-arrow fa-3x" data-original-title="" title=""></i><br>
                                            Google Maps
                                        </div>
                                    </a>
                                </li>
                                <li class="dropdown active">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                        <div class="text-center">
                                            <i class="fa fa-home fa-3x" data-original-title="" title=""></i><br>
                                            Real Estates <span class="caret"></span>
                                        </div>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="property.html"><i class="fa fa-institution" data-original-title="" title=""></i> Property List</a></li>
                                        <li><a href="property-column.html"><i class="fa fa-th-large" data-original-title="" title=""></i> Property Column</a></li>
                                        <li><a href="property-detail.html"><i class="fa fa-th-list" data-original-title="" title=""></i> Property Detail</a></li>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                        <div class="text-center">
                                            <i class="fa fa-shopping-cart fa-3x" data-original-title="" title=""></i><br>
                                            Stores <span class="caret"></span>
                                        </div>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="store.html"><i class="fa fa-gift" data-original-title="" title=""></i> Store List</a></li>
                                        <li><a href="store-detail.html"><i class="fa fa-gift" data-original-title="" title=""></i> Store Detail</a></li>
                                        <li><a href="shopping-cart.html"><i class="fa fa-gift" data-original-title="" title=""></i> Shopping Cart</a></li>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                        <div class="text-center">
                                            <i class="fa fa-plus-square fa-3x" data-original-title="" title=""></i><br>
                                            Extras Pages <span class="caret"></span>
                                        </div>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="login.html"><i class="fa fa-unlock-alt" data-original-title="" title=""></i> Login</a></li>
                                        <li><a href="page-blank.html"><i class="fa fa-square-o" data-original-title="" title=""></i> Blank Page</a></li>
                                        <li class="divider"></li>
                                        <li><a href="invoice.html"><i class="fa fa-thumbs-o-up" data-original-title="" title=""></i> Invoice</a></li>
                                        <li><a href="princing-table.html"><i class="fa fa-gavel" data-original-title="" title=""></i> Princing Table</a></li>
                                        <li><a href="faq.html"><i class="fa fa-sun-o" data-original-title="" title=""></i> FAQ</a></li>
                                        <li class="divider"></li>
                                        <li><a href="register.html"><i class="fa fa-plus" data-original-title="" title=""></i> Register</a></li>
                                        <li><a href="404.html"><i class="fa fa-warning" data-original-title="" title=""></i> 404 Error</a></li>
                                        <li><a href="500.html"><i class="fa fa-warning" data-original-title="" title=""></i> 500 Error</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div><!-- /.navbar-collapse -->
                    </div>
                </nav>
            </div>
        </div>
	</header>
	<div class="column-side ">
		<div class="container mobile-not-padding">
			<div class="column-nav">
				<ol class="column-ul" style="padding-left: 7px;">
					<li class="column-li  navs hidden-lg-up"><a href="#paralist"
						data-toggle="collapse" class="link" title="更多筛选"
						aria-expanded="false"><i class="icon wb-chevron-down"
							aria-hidden="true"></i></a></li>
					<c:forEach items="${rwxs}" var="data" varStatus="xh">

						<c:choose>
							<c:when test="${empty  param.classify }">
								<c:choose>
									<c:when test="${xh.index ==0}">
										<li class="column-li active">
									</c:when>
									<c:otherwise>
										<li class="column-li">
									</c:otherwise>
								</c:choose>
							</c:when>
							<c:when
								test="${(param.classify eq '0') && (param.lbdm eq data.lbdm)}">
								<li class="column-li active">
							</c:when>
							<c:otherwise>
								<li class="column-li">
							</c:otherwise>
						</c:choose>

						<a
							href="<%=request.getContextPath() %>/center/index?classify=<%=CenterTypeEnum.NORMAL.getCode() %>&lbdm=${data.lbdm}"
							title="${data.lbmc}">${data.lbmc}</a>
						</li>
					</c:forEach>

					<c:choose>
						<c:when test="${empty  param.classify }">
							<li class="column-li  navs">
						</c:when>
						<c:when test="${(param.classify eq '1')}">
							<li class="column-li  navs active">
						</c:when>
						<c:otherwise>
							<li class="column-li  navs">
						</c:otherwise>
					</c:choose>
					<a
						href="<%=request.getContextPath()%>/center/index?classify=<%=CenterTypeEnum.NEW.getCode()%>&lbdm=1"
						title="新手专区">新手专区</a>
					</li>
					<c:choose>
						<c:when test="${empty  param.classify }">
							<li class="column-li  navs">
						</c:when>
						<c:when test="${(param.classify eq '2')}">
							<li class="column-li  navs active">
						</c:when>
						<c:otherwise>
							<li class="column-li  navs">
						</c:otherwise>
					</c:choose>
					<a
						href="<%=request.getContextPath()%>/center/index?classify=<%=CenterTypeEnum.OLD.getCode()%>&lbdm=2"
						title="老友记">老友记</a>
					</li>
					<li class="column-li  navs"><a href="#paralist"
						data-toggle="collapse" class="link" title="更多筛选"
						aria-expanded="false"><i class="icon wb-chevron-down"
							aria-hidden="true"></i></a></li>
				</ol>
			</div>
			<div class="met-muban-paralist collapse" id="paralist"
				aria-expanded="false" style="">
				<div style="padding-left: 7px;">
					<div class="met-muban-paralist-body bg-white">
						<div class="container padding-bottom-10">
							<div class="hidden-lg-up">
								<form class="form-register met-form form-horizontal"
									method="post" action="" role="form" id="queryForm">
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">按业务域</label>
										<div class="col-sm-10 col-md-10">
											<select class="form-control " name="queryForm.ywx" required
												data-fv-notempty-message="此项不能为空">
												<option value="">全部</option>
												<c:forEach items="${ywx}" var="data">
													<option value="${data.lbdm}">${data.lbmc}</option>
												</c:forEach>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">按开发框架</label>
										<div class="col-sm-10 col-md-10">
											<select class="form-control " name="queryForm.kfkj" required
												data-fv-notempty-message="此项不能为空">
												<option value="">全部</option>
												<c:forEach items="${kfkj}" var="data">
													<option value="${data.lbdm}">${data.lbmc}</option>
												</c:forEach>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">按需求状态</label>
										<div class="col-sm-10 col-md-10">
											<select class="form-control " name="queryForm.xqzt" required
												data-fv-notempty-message="此项不能为空">
												<option value="">全部</option>
												<c:forEach items="${rwjd}" var="data">
													<option value="${data.lbdm}">${data.lbmc}</option>
												</c:forEach>
											</select>
										</div>
									</div>
								</form>
							</div>

							<div class="hidden-md-down">
								<dl>
									<dt>按业务域</dt>
									<dd>
										<a class="btn queryActive link" href="javascript:void(0);"
											title="全部" data-key="" data-option="ywx">全部</a>
										<c:forEach items="${ywx}" var="data">
											<a class="btn link" href="javascript:void(0);"
												data-option="ywx" title="${data.lbmc}"
												data-key="${data.lbdm}">${data.lbmc}</a>
										</c:forEach>


									</dd>
								</dl>
								<dl>
									<dt>按开发框架</dt>
									<dd>

										<a class="btn queryActive link" href="javascript:void(0);"
											title="全部" data-key="" data-option="kfkj">全部</a>
										<c:forEach items="${kfkj}" var="data">
											<a class="btn link" href="javascript:void(0);"
												data-key="${data.lbdm}" data-option="kfkj"
												title="${data.lbmc}">${data.lbmc} </a>
										</c:forEach>

									</dd>
								</dl>
								<dl>
									<dt>按需求状态</dt>
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
							</div>
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
	<div class="grey-box">
		<div class="container">
		<!-- 
			<div class="host-list active">
				<ul
					class="offers-section blocks-2 blocks-sm-3 blocks-md-4 blocks-xlg-5  met-page-ajax met-grid"
					id="crowd-grid" data-scale="1">


				</ul>
			</div>
			-->
			<div class="row my-cart" style="margin-left:20px;margin-right:20px;">
					<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
						<div class="panel my-cart-panel">
                            <div class="panel-body my-cart-panel-body">
                                <div class="row">
                                    <div class="col-sm-5">
                                        <a href="#"><img src="<%=request.getContextPath() %>/statics/images/home/emap.png" class="img-responsive"></a>
                                    </div>
                                    <div class="col-sm-7">
                                        <h4 class="title-real-estates">
                                            <strong><a href="#">Omah Lodong</a></strong> <span class="pull-right">$12,990</span>
                                        </h4>
                                        <hr>
                                        <p>Iki kie mung omah lodong dadiine rodo murah tur yo ra awet wong karang mung murah, nek pingin awet yo tuku omah-omahan wae sing ra iso rusak.</p>
                                        <p><span class="label label-danger">1,292 SqFt</span> | <span class="label label-danger">3 Beds</span> | <span class="label label-danger">4 Baths</span></p>
                                    </div>
                                </div>
                            </div>
                        </div>
					</div>
					<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
						<div class="panel my-cart-panel">
                            <div class="panel-body my-cart-panel-body">
                                <div class="row">
                                    <div class="col-sm-5">
                                        <a href="#"><img src="<%=request.getContextPath() %>/statics/images/home/emap.png" class="img-responsive"></a>
                                    </div>
                                    <div class="col-sm-7">
                                        <h4 class="title-real-estates">
                                            <strong><a href="#">Omah Lodong</a></strong> <span class="pull-right">$12,990</span>
                                        </h4>
                                        <hr>
                                        <p>Iki kie mung omah lodong dadiine rodo murah tur yo ra awet wong karang mung murah, nek pingin awet yo tuku omah-omahan wae sing ra iso rusak.</p>
                                        <p><span class="label label-danger">1,292 SqFt</span> | <span class="label label-danger">3 Beds</span> | <span class="label label-danger">4 Baths</span></p>
                                    </div>
                                </div>
                            </div>
                        </div>
					</div>
					<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
						<div class="panel my-cart-panel">
                            <div class="panel-body my-cart-panel-body">
                                <div class="row">
                                    <div class="col-sm-5">
                                        <a href="#"><img src="<%=request.getContextPath() %>/statics/images/home/emap.png" class="img-responsive"></a>
                                    </div>
                                    <div class="col-sm-7">
                                        <h4 class="title-real-estates">
                                            <strong><a href="#">Omah Lodong</a></strong> <span class="pull-right">$12,990</span>
                                        </h4>
                                        <hr>
                                        <p>Iki kie mung omah lodong dadiine rodo murah tur yo ra awet wong karang mung murah, nek pingin awet yo tuku omah-omahan wae sing ra iso rusak.</p>
                                        <p><span class="label label-danger">1,292 SqFt</span> | <span class="label label-danger">3 Beds</span> | <span class="label label-danger">4 Baths</span></p>
                                    </div>
                                </div>
                            </div>
                        </div>
					</div>
					<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
						<div class="panel my-cart-panel">
                            <div class="panel-body my-cart-panel-body">
                                <div class="row">
                                    <div class="col-sm-5">
                                        <a href="#"><img src="<%=request.getContextPath() %>/statics/images/home/emap.png" class="img-responsive"></a>
                                    </div>
                                    <div class="col-sm-7">
                                        <h4 class="title-real-estates">
                                            <strong><a href="#">Omah Lodong</a></strong> <span class="pull-right">$12,990</span>
                                        </h4>
                                        <hr>
                                        <p>Iki kie mung omah lodong dadiine rodo murah tur yo ra awet wong karang mung murah, nek pingin awet yo tuku omah-omahan wae sing ra iso rusak.</p>
                                        <p><span class="label label-danger">1,292 SqFt</span> | <span class="label label-danger">3 Beds</span> | <span class="label label-danger">4 Baths</span></p>
                                    </div>
                                </div>
                            </div>
                        </div>
					</div>
					<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
						<div class="panel my-cart-panel">
                            <div class="panel-body my-cart-panel-body">
                                <div class="row">
                                    <div class="col-sm-5">
                                        <a href="#"><img src="<%=request.getContextPath() %>/statics/images/home/emap.png" class="img-responsive"></a>
                                    </div>
                                    <div class="col-sm-7">
                                        <h4 class="title-real-estates">
                                            <strong><a href="#">Omah Lodong</a></strong> <span class="pull-right">$12,990</span>
                                        </h4>
                                        <hr>
                                        <p>Iki kie mung omah lodong dadiine rodo murah tur yo ra awet wong karang mung murah, nek pingin awet yo tuku omah-omahan wae sing ra iso rusak.</p>
                                        <p><span class="label label-danger">1,292 SqFt</span> | <span class="label label-danger">3 Beds</span> | <span class="label label-danger">4 Baths</span></p>
                                    </div>
                                </div>
                            </div>
                        </div>
					</div>
					<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
						<div class="panel my-cart-panel">
                            <div class="panel-body my-cart-panel-body">
                                <div class="row">
                                    <div class="col-sm-5">
                                        <a href="#"><img src="<%=request.getContextPath() %>/statics/images/home/emap.png" class="img-responsive"></a>
                                    </div>
                                    <div class="col-sm-7">
                                        <h4 class="title-real-estates">
                                            <strong><a href="#">Omah Lodong</a></strong> <span class="pull-right">$12,990</span>
                                        </h4>
                                        <hr>
                                        <p>Iki kie mung omah lodong dadiine rodo murah tur yo ra awet wong karang mung murah, nek pingin awet yo tuku omah-omahan wae sing ra iso rusak.</p>
                                        <p><span class="label label-danger">1,292 SqFt</span> | <span class="label label-danger">3 Beds</span> | <span class="label label-danger">4 Baths</span></p>
                                    </div>
                                </div>
                            </div>
                        </div>
					</div>
				
			</div>
		</div>
		</div>
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
	<%@ include file="/jsp/footer/footer.jsp"%>
	<button type="button"
		class="btn btn-icon btn-primary btn-squared met-scroll-top hide">
		<i class="icon wb-chevron-up" aria-hidden="true"></i>
	</button>
	<script>
		var jsonurl = "";
		var classify = "${param.classify}";
		var lbdm = "${param.lbdm}";
	</script>

	<%@ include file="/jsp/bottom.jsp"%>


	<script
		src="<%=request.getContextPath()%>/statics/pagejs/hall/index.js"></script>
	<script
		src="<%=request.getContextPath()%>/statics/pagejs/center/center.js"></script>
</body>
</html>
