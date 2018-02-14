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
					<div class="panel" boxmh-mh>
						<div class="panel-body  shop-order">
							<div class="row">
								<div class="col-xs-12 gzzx-header">
									<div class="pull-left col-xs-6" style="margin-bottom: 0px;">技能建议</div>
									<div class="pull-right col-xs-6 text-right"
										style="margin-bottom: 0px;">
										<button type="button" class="btn btn-link" id="btnFbjyModal">发布建议</button>
									</div>
								</div>
								<div class="col-xs-12 gzxx-content">
									<p>您可以针对EMAP、前端组件等，流程发布您的建议。</p>
								</div>
							</div>

						</div>
					</div>
					<div class="panel m-b-0" boxmh-mh>
						<div class="panel-body  shop-order">
							<div class="row">
								<div class="col-xs-12 gzxx-content">
									<div class="pull-right col-md-4 col-xs-12 text-right">
										<div class="input-group">
											<input type="text" class="form-control" id="txtContent"> <span
												class="input-group-btn">
												<button class="btn btn-primary" type="button" id="btnQuery">查询</button>
											</span>
										</div>
									</div>
									<div class="row">
										<div class="pull-left col-md-12 col-xs-12">
											<ul class="nav nav-tabs nav-tabs-line m-b-0 shop-order-state">
												<li class='nav-item active'><a class="nav-link "
													data-toggle="tab" href="#" data-state="1">待处理</a></li>
												<li class='nav-item'><a class="nav-link"
													data-toggle="tab" href="#" data-state="2">处理中</a></li>
												<li class='nav-item'><a class="nav-link"
													data-toggle="tab" href="#" data-state="3">已处理</a></li>
												<li class='nav-item'><a class="nav-link"
													data-toggle="tab" href="#" data-state="4">不处理</a></li>
											</ul>
										</div>
									</div>
									<div id="divDcl">
										<div class="table-responsive text-xs-center">

											<table class="table table-striped m-b-0 mytable">
												<thead>
													<tr>
														<th class="text-xs-center" style="width: 100px;">序号</th>
														<th class="text-xs-center">建议内容</th>
														<th class="text-xs-center" style="width: 250px;">发布时间</th>
													</tr>
												</thead>
												<tbody id="tblDcl">
												</tbody>
											</table>
										</div>
									</div>
								</div>

								<div id="divClz" style="display: none;">
									<div class="table-responsive text-xs-center">

										<table class="table table-striped m-b-0 mytable">
											<thead>
												<tr>
													<th class="text-xs-center" style="width: 100px;">序号</th>
													<th class="text-xs-center">建议内容</th>
													<th class="text-xs-center" style="width: 250px;">发布时间</th>
												</tr>
											</thead>
											<tbody id="tblClz">
											</tbody>
										</table>
									</div>
								</div>
							</div>
							<div id="divYcl" style="display: none;">
								<div class="table-responsive text-xs-center">

									<table class="table table-striped m-b-0 mytable">
										<thead>
											<tr>
												<th class="text-xs-center" style="width: 100px;">序号</th>
												<th class="text-xs-center">建议内容</th>
												<th class="text-xs-center" style="width: 250px;">发布时间</th>
												<th class="text-xs-center">处理反馈</th>
												<th class="text-xs-center" style="width: 250px;">处理时间</th>
											</tr>
										</thead>
										<tbody id="tblYcl">
										</tbody>
									</table>
								</div>
							</div>
							<div id="divBcl" style="display: none;">
								<div class="table-responsive text-xs-center">

									<table class="table table-striped m-b-0 mytable">
										<thead>
											<tr>
												<th class="text-xs-center" style="width: 100px;">序号</th>
												<th class="text-xs-center">建议内容</th>
												<th class="text-xs-center" style="width: 150px;">发布时间</th>
												<th class="text-xs-center" style="width: 150px;">处理反馈</th>
												<th class="text-xs-center" style="width: 150px;">处理时间</th>
											</tr>
										</thead>
										<tbody id="tblBcl">
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="modal fade modal-primary in" id="fbjyModal"
		aria-labelledby="questionModal" role="dialog" tabindex="-1">
		<div class="modal-dialog modal-center">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title">发布建议</h4>
				</div>
				<form action="" id="formPtjy">
					<div class="modal-body">
						<div class="form-group">
								<textarea class="form-control"  required
									data-fv-notempty-message="此项不能为空" name="content"></textarea>
						</div>
					</div>
					<div class="modal-footer text-xs-left">
						<button type="button" class="btn btn-primary btn-squared"
							id="btnSaveJy">发布</button>
						<button type="button" class="btn btn-default btn-squared"
							data-dismiss="modal">取消</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<%@include file="/jsp/footer/footer2.jsp"%>
	<button type="button"
		class="btn btn-icon btn-primary btn-squared met-scroll-top" hidden>
		<i class="icon wb-chevron-up" aria-hidden="true"></i>
	</button>
	<script>
		var page_type = "yjsjjnjy";
	</script>
	<%@ include file="/jsp/bottom.jsp"%>
</body>
</html>
