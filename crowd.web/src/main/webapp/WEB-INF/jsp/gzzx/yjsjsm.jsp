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

				<div class="col-lg-3">

					<%@include file="/jsp/gzzx/left_menu_yjsj.jsp"%>
				</div>

				<div class="col-lg-9 ">
					<div class="panel m-b-0 bg-blue-600" boxmh-mh>
						<div class="panel-body bg-blue-600 shop-order">
							<div class=" text-xs-center"
								style="font-size: 2rem; color: #FFF;">建议与反馈</div>
						</div>
					</div>
					<div class="panel m-b-0" boxmh-mh>
						<div class="panel-body  shop-order">
							<div class="row">
								<div class="col-xs-12 gzzx-header">机制说明</div>
								<div class="col-xs-12 gzxx-content">
									<p>您可以针对平台流程，使用，平台开发技能、文档以及培训认证方式等提出建议，平台将会在3个非工作日内针对您的问题给出响应。</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="/jsp/footer/footer2.jsp"%>
	<button type="button"
		class="btn btn-icon btn-primary btn-squared met-scroll-top" hidden>
		<i class="icon wb-chevron-up" aria-hidden="true"></i>
	</button>
	<script>
		var page_type = "kfzxxConfirm";
	</script>
	<%@ include file="/jsp/bottom.jsp"%>
</body>
</html>
