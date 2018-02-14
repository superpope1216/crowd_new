<%@page import="com.wisedu.crowd.common.code.DictionaryEnum"%>
<%@page import="com.wisedu.crowd.entity.dictionary.DictionaryInfo"%>
<%@page import="com.wisedu.crowd.service.dictionary.DictionaryService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html class="  ">
<%@ include file="/jsp/top/top.jsp"%>
<%@ include file="/jsp/param.jsp"%>
<%
	WebApplicationContext wac2 = WebApplicationContextUtils
			.getRequiredWebApplicationContext(getServletContext());
	DictionaryService dictionaryService = (DictionaryService) wac2.getBean("dictionaryService");//如是注解的Service取注解
	List<DictionaryInfo> rwxsList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_RWKFKJ,
			null);
	List<DictionaryInfo> ywxList = dictionaryService.selectByCondtion(DictionaryEnum.T_CROWD_SJZD_YWXLB, null);
	request.setAttribute("rwxs", rwxsList);
	request.setAttribute("ywx", ywxList);
%>
<style>
.popover-title {
	text-align: center;
}

.popover-content {
	padding: 0;
}

.headImg {
	width: 97px;
	height: 97px;
	position: relative;
	top: 8px;
	border-radius: 52px;
}

.star-card {
	background: #fff;
	padding: 25px 10px;
}

.star-card-see {
	bottom: 0px;
	right: 0px;
	float: right;
	cursor: pointer;
}

.star-card-see2 {
	bottom: 0px;
	cursor: pointer;
	font-size: 12px;
	color: #b0b0b0;
	margin: 15px 15px;
}

.star-card-name {
	/* 	text-align: center;
	line-height: 100px; */
	margin: 15px 15px;
	font-size: 24px;
	color: red;
}

.score-detail {
	float: left;
	margin: 5px 10px;
}

.product-class ul li i {
	/* font-size: 24px; */
	height: 40px;
	line-height: 40px;
	position: absolute;
	/* right: 0; */
	padding: 0 20px 0 10px;
	top: 50%;
	margin-top: -20px;
	color: #ccc;
	/* opacity: .6; */
}

.services-bottom {
	/**background: #0099e5;*/
	/**background:#62a8ea;*/
	padding: 1em 0;
}

.counter-agile {
	/**border: 4px solid #fff;*/
	padding: 2em 1em;
	position: relative;
}

.counter-subw3l p {
	position: absolute;
	top: -12%;
	left: 2.5%;
	color: #fff;
	font-size: 1.5em;
	background: #0099e5;
	padding: 0.4em 0em;
	width: 19%;
	text-align: center;
	text-transform: uppercase;
	letter-spacing: 4px;
	font-weight: 700;
}

.agileits_w3layouts_about_counter_left p {
	font-size: 3em;
	font-weight: bold;
	color: #fff;
	margin: 0.5em 0 0.5em;
	/**background: #066a9c;*/
	text-align: center;
	line-height: 1.9;
}

.agileits_w3layouts_about_counter_left {
	text-align: center;
}

.agileits_w3layouts_about_counter_left h3 {
	color: #fff;
	font-size: 1.3em;
	margin: .5em 0 0;
	text-transform: uppercase;
}


.card {
  border-radius: 6px;
  /**box-shadow: 0 1px 4px rgba(0, 0, 0, 0.23);*/
  background-color: #FFFFFF;
  margin-bottom: 20px;
  position: relative;
  /**max-width: 320px;*/
  width:100%;
  margin-left: auto;
  margin-right: auto;
  float:left;
}
.card .title,
.card .stats,
.card .category,
.card .description,
.card .social-line,
.card .actions,
.card .content,
.card .footer,
.card small,
.card a {
  position: relative;
  z-index: 3;
}
.card a {
  color: #444444;
}
.card a:hover, .card a:focus {
  color: #333333;
}
.card[data-radius="none"] {
  border-radius: 0px;
}
.card[data-radius="none"] .header {
  border-radius: 0px 0px 0 0;
}
.card[data-radius="none"] .header img {
  border-radius: 0px 0px 0 0;
}
.card.card-plain {
  box-shadow: none;
}
.card .btn {
  text-shadow: none;
  font-weight: bold;
}
.card .title-uppercase {
  text-transform: uppercase;
}
.card .header {
  position: relative;
  border-radius: 6px 6px 0 0;
  height: 120px;
  z-index: 3;
}
.card .header img {
  /**opacity: 0;**/
  filter: alpha(opacity=0);
  /**display: none;*/
}
.card .header .category {
  padding: 15px;
}
.card .header .social-line {
  position: absolute;
  bottom: 0;
  width: 100%;
  opacity: 0;
  filter: alpha(opacity=0);
  display: block;
  transition: all 0.4s;
  -webkit-transition: all 0.4s;
}
.card .header .social-line .btn,
.card .header .social-line a {
  font-weight: 400;
}
.card .header .social-line.social-line-visible {
  opacity: 1;
  filter: alpha(opacity=100);
}
.card .content .price {
  border: 2px solid rgba(255, 255, 255, 0.7);
  color: white;
  border-radius: 50%;
  width: 152px;
  height: 152px;
  margin: 50px auto;
  text-align: center;
  vertical-align: middle;
  line-height: 200px;
}
.card .content .price h4 {
  margin: 5px 0 0;
  font-size: 36px;
}
.card .content .price h6 {
  margin-top: 45px;
  font-size: 16px;
}
.card .content .price .currency {
  font-size: 22px;
  font-weight: normal;
}
.card .actions {
  padding: 10px 15px;
}
.card .social-line .btn {
  float: left;
  display: block;
  transition: all 0.2s;
  -webkit-transition: all 0.2s;
}
.card .social-line .btn-social {
  border: 1px solid #EEEEEE;
  border-radius: 0;
  border-left: 0;
  background-color: #FFFFFF;
  padding: 12px 4px;
}
.card .social-line .btn-social:last-child {
  border-right: 0;
}
.card .social-line[data-buttons="5"] .btn {
  width: 20%;
}
.card .social-line[data-buttons="4"] .btn {
  width: 25%;
}
.card .social-line[data-buttons="3"] .btn {
  width: 33.3333333%;
}
.card .social-line[data-buttons="2"] .btn {
  width: 50%;
}
.card .social-line:after {
  clear: both;
  display: table;
  content: " ";
}
.card .filter,
.card .header .actions {
  position: absolute;
  z-index: 2;
  background-color: rgba(0, 0, 0, 0.76);
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  text-align: center;
  opacity: 0;
  filter: alpha(opacity=0);
}
.card .header .actions {
  background-color: transparent;
  z-index: 3;
}
.card .header .actions .btn {
  position: relative;
  top: 50%;
  -webkit-transform: translateY(-50%);
  -ms-transform: translateY(-50%);
  transform: translateY(-50%);
}
.card:hover .filter {
  opacity: 0.7;
  filter: alpha(opacity=70);
}
.card:hover .header .social-line,
.card:hover .header .actions {
  opacity: 1;
  filter: alpha(opacity=100);
}
.card .category,
.card .label {
  font-size: 14px;
  margin-bottom: 0px;
}
.card .category i,
.card .label i {
  font-size: 16px;
}
.card .category {
  color: #9A9A9A;
}
.card .label {
  text-shadow: none;
}
.card .title {
  color: #333333;
}
.card > .title {
  margin: 0;
  padding: 30px 0 0;
}
.card .content {
  padding: 15px 15px 5px 15px;
}
.card .content .title {
  margin: 10px 0 20px 0;
}
.card .content .category ~ .title {
  margin-top: 0px;
}
.card .content .description ~ .title {
  margin-top: -10px;
}
.card .description {
  font-size: 16px;
  color: #9A9A9A;
}
.card h6 {
  font-size: 12px;
  margin: 0;
}
.card .footer {
  padding: 0 15px 15px;
}
.card .footer .social-line .btn:first-child {
  border-radius: 0 0 0 6px;
}
.card .footer .social-line .btn:last-child {
  border-radius: 0 0 6px 0;
}
.card.card-separator:after {
  height: 100%;
  right: -15px;
  top: 0;
  width: 1px;
  background-color: #DDDDDD;
  content: "";
  position: absolute;
}
.card .icon {
  display: block;
  margin: 0 auto;
  top: 50%;
  position: relative;
  transform: translateY(-50%);
  -webkit-transform: translateY(-50%);
  text-align: center;
}
.card .icon i {
  font-size: 60px;
  border: 2px solid rgba(0, 0, 0, 0.3);
  padding: 18px;
  border-radius: 50%;
}
.col-lg-4 .card .icon i {
  font-size: 80px;
  padding: 22px;
}
.card.card-with-border .content {
  padding: 15px 15px 25px 15px;
}
.card.card-with-border .footer {
  padding-bottom: 25px;
}
.card.card-with-border:after {
  position: absolute;
  display: block;
  width: calc(100% - 10px);
  height: calc(100% - 10px);
  content: "";
  top: 5px;
  left: 5px;
  border: 1px solid rgba(0, 0, 0, 0.15);
  z-index: 1;
  border-radius: 5px;
}
.card.card-just-text .content {
  padding: 50px 65px;
  text-align: center;
}
.card[data-background="image"] .image, .card[data-background="color"] .image {
  border-radius: 6px;
}
.card[data-background="image"] .title, .card[data-background="color"] .title {
  font-weight: bold;
}
.card[data-background="image"] .filter, .card[data-background="color"] .filter {
  border-radius: 6px;
}
.card[data-background="image"] .title,
.card[data-background="image"] .stats,
.card[data-background="image"] .category,
.card[data-background="image"] .description,
.card[data-background="image"] .content,
.card[data-background="image"] .footer,
.card[data-background="image"] small,
.card[data-background="image"] a, .card[data-background="color"] .title,
.card[data-background="color"] .stats,
.card[data-background="color"] .category,
.card[data-background="color"] .description,
.card[data-background="color"] .content,
.card[data-background="color"] .footer,
.card[data-background="color"] small,
.card[data-background="color"] a {
  color: #FFFFFF;
}
.card[data-background="image"] a:hover,
.card[data-background="image"] a:focus, .card[data-background="color"] a:hover,
.card[data-background="color"] a:focus {
  color: #FFFFFF;
}
.card[data-background="image"] .icon i, .card[data-background="color"] .icon i {
  color: #FFFFFF;
  border: 2px solid rgba(255, 255, 255, 0.6);
}
.card[data-background="image"].card-with-border:after, .card[data-background="color"].card-with-border:after {
  border: 1px solid rgba(255, 255, 255, 0.45);
}
.card[data-background="image"] {
  text-shadow: 0 1px 10px rgba(0, 0, 0, 0.5);
}
.card[data-background="image"] .filter {
  opacity: 0.55;
  filter: alpha(opacity=55.0);
}
.card[data-background="image"]:hover .filter {
  opacity: 0.75;
  filter: alpha(opacity=75);
}
.card[data-color="blue"] {
  background: #4087ea;
  background: -moz-radial-gradient(center, ellipse cover, #533ce1 0%, #4087ea 100%);
  /* FF3.6+ */
  background: -webkit-gradient(radial, center center, 0px, center center, 100%, color-stop(0%, #533ce1), color-stop(100%, #4087ea));
  /* Chrome,Safari4+ */
  background: -webkit-radial-gradient(center, ellipse cover, #533ce1 0%, #4087ea 100%);
  /* Chrome10+,Safari5.1+ */
  background: -o-radial-gradient(center, ellipse cover, #533ce1 0%, #4087ea 100%);
  /* Opera 12+ */
  background: -ms-radial-gradient(center, ellipse cover, #533ce1 0%, #4087ea 100%);
  /* IE10+ */
  background: radial-gradient(ellipse at center, #533ce1 0%, #4087ea 100%);
  /* W3C */
  background-size: 250% 250%;
}
.card[data-color="azure"] {
  background: #45c0fd;
  background: -moz-radial-gradient(center, ellipse cover, #4091ff 0%, #45c0fd 100%);
  /* FF3.6+ */
  background: -webkit-gradient(radial, center center, 0px, center center, 100%, color-stop(0%, #4091ff), color-stop(100%, #45c0fd));
  /* Chrome,Safari4+ */
  background: -webkit-radial-gradient(center, ellipse cover, #4091ff 0%, #45c0fd 100%);
  /* Chrome10+,Safari5.1+ */
  background: -o-radial-gradient(center, ellipse cover, #4091ff 0%, #45c0fd 100%);
  /* Opera 12+ */
  background: -ms-radial-gradient(center, ellipse cover, #4091ff 0%, #45c0fd 100%);
  /* IE10+ */
  background: radial-gradient(ellipse at center, #4091ff 0%, #45c0fd 100%);
  /* W3C */
  background-size: 250% 250%;
}
.card[data-color="green"] {
  background: #a1eb3a;
  background: -moz-radial-gradient(center, ellipse cover, #53A319 0%, #a1eb3a 100%);
  /* FF3.6+ */
  background: -webkit-gradient(radial, center center, 0px, center center, 100%, color-stop(0%, #53A319), color-stop(100%, #a1eb3a));
  /* Chrome,Safari4+ */
  background: -webkit-radial-gradient(center, ellipse cover, #53A319 0%, #a1eb3a 100%);
  /* Chrome10+,Safari5.1+ */
  background: -o-radial-gradient(center, ellipse cover, #53A319 0%, #a1eb3a 100%);
  /* Opera 12+ */
  background: -ms-radial-gradient(center, ellipse cover, #53A319 0%, #a1eb3a 100%);
  /* IE10+ */
  background: radial-gradient(ellipse at center, #53A319 0%, #a1eb3a 100%);
  /* W3C */
  background-size: 250% 250%;
}
.card[data-color="orange"] {
  background: #ffb33b;
  background: -moz-radial-gradient(center, ellipse cover, #ff5221 0%, #ffb33b 100%);
  /* FF3.6+ */
  background: -webkit-gradient(radial, center center, 0px, center center, 100%, color-stop(0%, #ff5221), color-stop(100%, #ffb33b));
  /* Chrome,Safari4+ */
  background: -webkit-radial-gradient(center, ellipse cover, #ff5221 0%, #ffb33b 100%);
  /* Chrome10+,Safari5.1+ */
  background: -o-radial-gradient(center, ellipse cover, #ff5221 0%, #ffb33b 100%);
  /* Opera 12+ */
  background: -ms-radial-gradient(center, ellipse cover, #ff5221 0%, #ffb33b 100%);
  /* IE10+ */
  background: radial-gradient(ellipse at center, #ff5221 0%, #ffb33b 100%);
  /* W3C */
  background-size: 250% 250%;
}
.card[data-color="red"] {
  background: #ff3b30;
  background: -moz-radial-gradient(center, ellipse cover, #bb0502 0%, #ff3b30 100%);
  /* FF3.6+ */
  background: -webkit-gradient(radial, center center, 0px, center center, 100%, color-stop(0%, #bb0502), color-stop(100%, #ff3b30));
  /* Chrome,Safari4+ */
  background: -webkit-radial-gradient(center, ellipse cover, #bb0502 0%, #ff3b30 100%);
  /* Chrome10+,Safari5.1+ */
  background: -o-radial-gradient(center, ellipse cover, #bb0502 0%, #ff3b30 100%);
  /* Opera 12+ */
  background: -ms-radial-gradient(center, ellipse cover, #bb0502 0%, #ff3b30 100%);
  /* IE10+ */
  background: radial-gradient(ellipse at center, #bb0502 0%, #ff3b30 100%);
  /* W3C */
  background-size: 250% 250%;
}
.card[data-color="black"] {
  background: #787878;
  background: -moz-radial-gradient(center, ellipse cover, #343434 0%, #787878 100%);
  /* FF3.6+ */
  background: -webkit-gradient(radial, center center, 0px, center center, 100%, color-stop(0%, #343434), color-stop(100%, #787878));
  /* Chrome,Safari4+ */
  background: -webkit-radial-gradient(center, ellipse cover, #343434 0%, #787878 100%);
  /* Chrome10+,Safari5.1+ */
  background: -o-radial-gradient(center, ellipse cover, #343434 0%, #787878 100%);
  /* Opera 12+ */
  background: -ms-radial-gradient(center, ellipse cover, #343434 0%, #787878 100%);
  /* IE10+ */
  background: radial-gradient(ellipse at center, #343434 0%, #787878 100%);
  /* W3C */
  background-size: 250% 250%;
}
.card h1, .card .h1, .card h2, .card .h2, .card h3, .card .h3, .card h4, .card .h4, .card h5, .card .h5, .card h6, .card .h6, .card p, .card .navbar, .card .brand, .card .btn, .card a, .card .td-name, .card td {
  -moz-osx-font-smoothing: grayscale;
  -webkit-font-smoothing: antialiased;
}
.card h1, .card .h1, .card h2, .card .h2, .card h3, .card .h3, .card h4, .card .h4 {
  font-weight: 400;
  margin: 30px 0 15px;
}
.card h1, .card .h1 {
  font-size: 52px;
}
.card h2, .card .h2 {
  font-size: 36px;
}
.card h3, .card .h3 {
  font-size: 28px;
  margin: 20px 0 10px;
}
.card h4, .card .h4 {
  font-size: 20px;
  line-height: 30px;
}
.card h5, .card .h5 {
  font-size: 18px;
  margin-bottom: 15px;
}
.card h6, .card .h6 {
  font-size: 14px;
  font-weight: 600;
  text-transform: uppercase;
}
.card p {
  font-size: 14px;
  line-height: 1.3;
}
.card .category,
.card .label,
.card .title-modern,
.card .btn-modern,
.card .price h4 {
  font-family: "Raleway","Helvetica","Arial", sans-serif;
}
.card h1 small, .card h2 small, .card h3 small, .card h4 small, .card h5 small, .card h6 small, .card .h1 small, .card .h2 small, .card .h3 small, .card .h4 small, .card .h5 small, .card .h6 small, .card h1 .small, .card h2 .small, .card h3 .small, .card h4 .small, .card h5 .small, .card h6 .small, .card .h1 .small, .card .h2 .small, .card .h3 .small, .card .h4 .small, .card .h5 .small, .card .h6 .small {
  color: #9A9A9A;
  font-weight: 300;
  line-height: 1.3;
}
.card h1 small, .card h2 small, .card h3 small, .card h1 .small, .card h2 .small, .card h3 .small {
  font-size: 60%;
}
.card .text-primary, .card .text-primary:hover {
  color: #1D62F0 !important;
}
.card .text-info, .card .text-info:hover {
  color: #109CFF !important;
}
.card .text-success, .card .text-success:hover {
  color: #0C9C14 !important;
}
.card .text-warning, .card .text-warning:hover {
  color: #ED8D00 !important;
}
.card .text-danger, .card .text-danger:hover {
  color: #EE2D20 !important;
}
</style>
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
		<div class="container mobile-not-padding">
			<div class="product-cut auto">
				<div class="product-class has-banner index">
					<div class="col-xs-12">
						<span><i class="fa fa-mars" aria-hidden="true"
							style="color: #fff;"></i><a href="javascript:void(0);"
							title="开发专区" style="color: #fff; margin-left: 5px;">软件定制开发</a></span>
					</div>
					<div class="col-xs-12">

						<c:forEach items="${rwxs}" var="data">
							<div class="col-xs-4">
								<a
									href="<%=request.getContextPath() %>/center/index?kfkj=${data.lbdm}"
									title="${data.lbmc}" style="color: #fff; font-size: 12px;"
									target="_blank">${data.lbmc}</a>
							</div>
						</c:forEach>
					</div>
					<div class="col-xs-12">
						<span><i class="fa fa-mars" aria-hidden="true"
							style="color: #fff;"></i><a href="javascript:void(0);"
							title="开发专区" style="color: #fff; margin-left: 5px;">业务定制开发</a></span>
					</div>
					<div class="col-xs-12">
						<c:forEach items="${ywx}" var="data">
							<div class="col-xs-4">
								<a
									href="<%=request.getContextPath() %>/center/index?ywx=${data.lbdm}"
									title="${data.lbmc}" style="color: #fff; font-size: 12px;"
									target="_blank">${data.lbmc}</a>
							</div>
						</c:forEach>
					</div>
				</div>

				<div class="met-banner banner-ny-h index" data-height='' style=''>
					<div class="slick-slide">
						<img class="cover-image"
							src="<%=request.getContextPath()%>/statics/images/header/b1.png"
							alt="">

					</div>

					<div class="slick-slide">
						<img class="cover-image"
							src="<%=request.getContextPath()%>/statics/images/header/b2.png"
							alt="">

					</div>

					<div class="slick-slide">
						<img class="cover-image"
							data-lazy="<%=request.getContextPath()%>/statics/images/header/b3.png"
							alt="">

					</div>


				</div>

			</div>
		</div>
	</header>

	<div class="acromion-box">
		<div class="container position-relative">
			<div class="column-box">
				<ul>

					<li><a href="<%=request.getContextPath()%>/help/about"
						title="关于我们" target='_blank'> <i class="fa fa-institution"></i>
							<b>关于我们</b>
					</a></li>

					<li><a
						href="<%=request.getContextPath()%>/developerQualify/index?flag=qualify"
						title="技能认证" target='_blank'> <i class="fa fa-puzzle-piece"></i>
							<b>技能认证</b>
					</a></li>

					<li><a
						href="<%=request.getContextPath()%>/yjsjsm/index?flag=yjsjsm"
						title="意见与反馈" target='_blank'> <i class="fa fa-pencil-square"></i>
							<b>建议与反馈</b>
					</a></li>

					<li><a
						href="<%=request.getContextPath()%>/ptlc/index?flag=ptlc"
						title="需求流程" target='_blank'> <i class="fa fa-phone-square"></i>
							<b>需求流程</b>
					</a></li>

					<li><a
						href="<%=request.getContextPath()%>/ptxz/index?flag=ptxz"
						title="平台规约" target='_blank'> <i class="fa fa-user-plus"></i>
							<b>平台规约</b>
					</a></li>

					<li><a href="<%=request.getContextPath()%>/concact/index"
						title="联系我们" target='_blank'> <i class="fa fa-pie-chart"></i>
							<b>联系我们</b>
					</a></li>

				</ul>
			</div>
			<div class="active-box">
				<ul class="active-box-wraper">

					<li class="active-box-slide"><a href="javascript:void(0);"
						title="云工场介绍" target='_self'> <img
							data-original='<%=request.getContextPath()%>/statics/images/mv/crowd.png'
							alt="云工场介绍">
					</a></li>

					<li class="active-box-slide"><a href="javascript:void(0);"
						title="EMAP平台介绍" target='_self'> <img
							data-original='<%=request.getContextPath()%>/statics/images/mv/emap.png'
							alt="EMAP平台介绍">
					</a></li>

					<li class="active-box-slide"><a href="javascript:void(0);"
						title="前端框架与组件介绍" target='_self'> <img
							data-original='<%=request.getContextPath()%>/statics/images/mv/qiandu.png'
							alt="前端框架与组件介绍">
					</a></li>

					<li class="active-box-slide"><a href="javascript:void(0);"
						title="开放服务介绍" target='_self'> <img
							data-original='<%=request.getContextPath()%>/statics/images/mv/kf.png'
							alt="开放服务介绍">
					</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div class="groom-box">
		<div class="container">
			<div class="title-box">
				<div class="title-name">
					<h3>最新需求</h3>
				</div>

				<div class="title-move">
					<i class="fa fa-chevron-left"></i> <i class="fa fa-chevron-right"></i>
				</div>
			</div>
			<div class="groom-cut">
				<ul class="groom-cut-wraper" id="ulNewRwjbxx">
				</ul>
			</div>
		</div>
	</div>

	<div class="grey-box">
		<div class="info-box">
			<div class="container">
				<div class="title-box">
					<div class="title-name">
						<h3>TA的收入</h3>
					</div>

					<div class="title-move">
						<i class="fa fa-chevron-left"></i> <i class="fa fa-chevron-right"></i>
					</div>
					<div class="title-nav" style="margin-left: 20px; float: left;">
						<ul id="ulMoneyTab">
							<li class="active" data-option="person"><a
								href="javascript:void(0);" title="个人">个人</a></li>

							<li><a href="javascript:void(0);" data-option="company"
								title="企业">企业</a></li>
						</ul>
					</div>
				</div>
				<div class="info-cut index">
					<ul class="info-cut-wraper" id="ulPserson" style="margin-top:15px;">
						
					</ul>
					<ul class="info-cut-wraper" id="ulCompany" style="margin-top:15px;display: none;">
					</ul>
				</div>
			</div>
		</div>
		
<div class="info-box">
			<div class="container">
				<div class="title-box">
					<div class="title-name">
						<h3>月度之星</h3>
					</div>
					<div class="title-move">
						<i class="fa fa-chevron-left"></i> <i class="fa fa-chevron-right"></i>
					</div>
					<!-- 						<div class="title-nav" style="margin-left: 20px; float: left;">
							<ul id="ulStarTab">
								<li class="active" data-option="develoepr"><a
									href="javascript:void(0);" title="开发者">开发者</a></li>

								<li><a href="javascript:void(0);" data-option="demander"
									title="需求方">需求方</a></li>
							</ul>
						</div> -->
				</div>
				<div class="info-cut index" id="star-card">
					<ul class="info-cut-wraper" id="ulDeveloper">
					</ul>
					<ul class="info-cut-wraper" id="ulDemander" style="margin-top:15px;display: none;">
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="services-bottom"
		style="background-image: url(statics/images/footer.png)">
		<div class="container">
			<div class="counter-agile">
				<div class="col-md-3 agileits_w3layouts_about_counter_left c1">
					<p class="counter animateNum" data-animatetarget="0"
						id="pTotalMoney">0</p>
					<h3>已发布项目（元）</h3>
				</div>
				<div class="col-md-3 agileits_w3layouts_about_counter_left c2">
					<p class="counter animateNum" data-animatetarget="0"
						id="pTotalCount">0</p>
					<h3>已发布项目（个）</h3>
				</div>
				<div class="col-md-3 agileits_w3layouts_about_counter_left c3">
					<p class="counter animateNum" data-animatetarget="0" id="pTotalXqf">0</p>
					<h3>注册需求方</h3>
				</div>
				<div class="col-md-3 agileits_w3layouts_about_counter_left c4">
					<p class="counter animateNum" data-animatetarget="0" id="pTotalKfz">0</p>
					<h3>注册开发者</h3>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<%@ include file="/jsp/footer/footer.jsp"%>
	<button type="button"
		class="btn btn-icon btn-primary btn-squared met-scroll-top hide">
		<i class="icon wb-chevron-up" aria-hidden="true"></i>
	</button>
	<script>
		var jsonurl = '', totalurl = '', delurl = '', lang_emptycart = '购物车中还没有商品，赶紧选购吧！';
	</script>
	<%@ include file="/jsp/bottom.jsp"%>
	<script
		src="<%=request.getContextPath()%>/statics/pagejs/hall/index.js"></script>
	<script src="<%=request.getContextPath()%>/statics/pagejs/index.js"></script>
</body>
</html>