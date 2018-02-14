<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<%@ include file="/jsp/top/top.jsp"%>
<%@ include file="/jsp/top/other.jsp"%>
<%@ include file="/jsp/param.jsp"%>
<link rel='stylesheet'
	href='<%=request.getContextPath()%>/statics/css/order.css'>
<!--[if lte IE 8]>
<div class="text-xs-center m-b-0 bg-blue-grey-100 alert">
    <button type="button" class="close" aria-label="Close" data-dismiss="alert">
        <span aria-hidden="true">×</span>
    </button>
    你正在使用一个 <strong>过时</strong> 的浏览器。请 <a href="http://browsehappy.com/" target="_blank">升级您的浏览器</a>，以提高您的体验。
</div>
<![endif]-->

<body>
	<%@include file="/jsp/header.jsp"%>

	<div class="page bg-pagebg1">
		<div class="container">
			<div class="page-content row">

				<div class="col-lg-12 ">
					<div class="panel m-b-0 bg-blue-600" boxmh-mh>
						<div class="panel-body bg-blue-600 shop-order">
							<div class=" text-xs-center"
								style="font-size: 2rem; color: #FFF;">关于我们</div>
						</div>
					</div>
					<div class="panel m-b-0" boxmh-mh>
						<div class="panel-body  shop-order">
							<div class="row">
								<div class="col-xs-12 gzzx-header">智慧校园云工场众包平台</div>
								<div class="col-xs-12 gzzx-subheader">第一条 概述</div>
								<div class="col-xs-12 gzxx-content">
									<p>智慧校园云工场众包平台所有权归属于“金智教育信息股份有限公司”，平台于2016年5月上线使用。智慧校园云工场众包平台，面向IT服务领域的互联网平台，基于社会化协作、共享的原理,解决公司内部需求的短平快开发，解放开发者的工作地点限制，让更多的开发者有机会参与到项目的开发中</p>
								</div>
								<div class="col-xs-12 gzzx-subheader">第二条 服务范围</div>
								<div class="col-xs-12 gzxx-content">
									<p>1、需求方主要面向金智教育公司内部项目经理、实施工程师等人员</p>
									<p>2、开发者主要面向金智教育公司内部研发人员、二开定制人员、实施工程师等以及社会开发工程师、学生、企业等群体。</p>
								
								</div>
								<div class="col-xs-12 gzzx-subheader">第三条 服务内容</div>
								<div class="col-xs-12 gzxx-content">
									
									<p>1、针对需求方，平台主要提供发布需求的场所。</p>
									<p>2、针对开发者，平台主要提供开发工具、技能培训、需求投标的场所</p>
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="/jsp/footer/footer2.jsp"%>
	<%@ include file="/jsp/bottom.jsp"%>
</body>
</html>