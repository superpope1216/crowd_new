<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<%@ include file="/jsp/top/top.jsp"%>
<%@ include file="/jsp/top/other.jsp"%>
<%@ include file="/jsp/param.jsp"%>
<link rel='stylesheet'
	href='<%=request.getContextPath()%>/statics/css/train/train.css'>
<body>
	<%@include file="/jsp/header.jsp"%>

	<div class="page bg-pagebg1">
		<div class="container">
			<div class="page-content row">

				<div class="col-lg-3">
					<%@include file="/jsp/xyxx/left_menu.jsp"%>
				</div>

				<div class="col-lg-9">
					<div class="panel m-b-0" boxmh-mh>
						<div class="panel-body shop-order">
							<div class="mynav">
								<ul class="nav nav-tabs nav-tabs-line m-b-0 shop-order-state" style="width:3999px;transform: translate3d(0px, 0px, 0px);">
									<li class='nav-item active'><a class="nav-link"
										data-toggle="tab" href data-state="0">全部(${pxzs})</a></li>
									<li class='nav-item '><a class="nav-link"
										data-toggle="tab" href data-state="1">预报名(${ybm})</a></li>
									<li class='nav-item'><a class="nav-link" data-toggle="tab"
										href="#state1" data-state="2">待预约(${dyy})</a></li>
									<li class='nav-item'><a class="nav-link" data-toggle="tab"
										href="#state1" data-state="3">待考核(${dkh})</a></li>
									<li class='nav-item'><a class="nav-link" data-toggle="tab"
										href="#state0" data-state="4">通过(${tg})</a></li>
									<li class='nav-item'><a class="nav-link" data-toggle="tab"
										href="#state0" data-state="5">不通过(${btg})</a></li>
									<li class='nav-item'><a class="nav-link" data-toggle="tab"
										href="#state0" data-state="6">缺考(${qk})</a></li>
								</ul>
							</div>
							<div class="shop-order-keyword m-y-20">
								<div class="form-group">
									<div class="input-search">
										<button type="submit" class="input-search-btn">
											<i class="icon wb-search" aria-hidden="true"></i>
										</button>
										<input type="text" class="form-control" name="keyword"
											data-table-search="true"
											placeholder="培训编号">
									</div>
								</div>
							</div>
							<div class="shop-order-list" data-scale="1" id="ulOrders">

							</div>
							<footer class="bg-white">
								<div  class="mypaging2 clearfix"></div>
							</footer>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="modal fade modal-primary in" id="addr-edit-modal"
		aria-labelledby="addr-edit-modal" role="dialog" tabindex="-1">
		<div class="modal-dialog modal-center modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title">查看证书</h4>
				</div>
				<form action="" id="formView">
					<input name="wid" type="hidden" value="">
					<div class="modal-body">
						<div class="form-group">
							<label for="name" class="required">考核时间&nbsp;:&nbsp;&nbsp;</label> 
							<label for="name" class="required" id="khsj"></label> 
						</div>
						<div class="form-group">
							<label for="name" class="required">证书编号&nbsp;:&nbsp;&nbsp;</label>
							<label for="name" class="required" id="zsbh"></label>
						</div>
						<div class="form-group">
							<label for="name" class="required">电子证书&nbsp;:&nbsp;&nbsp;</label>
							<img src="" id="dzzsImg" style="max-width:275px;" class="headImg" />
						</div>
					</div>
					<div class="modal-footer text-xs-left">
						<button type="button" class="btn btn-default btn-squared"
							data-dismiss="modal">确认</button>
					</div>
				</form>
			</div>
		</div>
	</div>

	<div class="modal fade modal-primary in" id="rebackModal"
		aria-labelledby="rebackModal" role="dialog" tabindex="-1">
		<div class="modal-dialog modal-center modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title">收回需求</h4>
				</div>
				<form action="" id="formReback">
					<input name="rwid" type="hidden" value="">
					<div class="modal-body">
						<div class="form-group">
							<textarea class="form-control" rows="3" name="shly"
								placeholder="请输入收回需求的原因" required=""
								data-fv-notempty-message="此项不能为空" data-fv-field="zone_a"></textarea>
						</div>
					</div>
					<div class="modal-footer text-xs-left">
						<button type="button" class="btn btn-primary btn-squared"
							id="btnSaveReback">保存</button>
						<button type="button" class="btn btn-default btn-squared"
							data-dismiss="modal">取消</button>
					</div>
				</form>
			</div>
		</div>
	</div>

	<div class="modal fade modal-primary in" id="questionModal"
		aria-labelledby="questionModal" role="dialog" tabindex="-1">
		<div class="modal-dialog modal-center">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title">发布问题</h4>
				</div>

				<div class="modal-body">
					<form action="" id="formQuestion">
						<div class="form-group">
							<input type="hidden" name="rwid" value=""> <input
								type="text" class="form-control" name="rwmc"
								placeholder="一个清晰的名字能帮助开发者快速的了解需求" required
								data-fv-notempty-message="此项不能为空"
								value="<c:if test='${!empty rwjbxx}'>${rwjbxx.rwmc}</c:if>">
						</div>
						<div class="form-group">
							<input type="text" class="form-control datepicker" name="jfrq"
								placeholder="请输入预期交付日期日期，中标者将严格按照该日期交付需求相关信息" required
								data-fv-notempty-message="此项不能为空" data-bv-date="true"
								data-bv-date-format="YYYY-MM-DD"
								data-bv-date-message="请输入正确的日期格式"
								value="<c:if test='${!empty rwjbxx}'>${rwjbxx.jfrq}</c:if>">
						</div>
						<div class="form-group">
							<textarea class="form-control" rows="3" name="xmgs"
								placeholder="请输入需求描述" required data-fv-notempty-message="此项不能为空"><c:if
									test='${!empty rwjbxx}'>${rwjbxx.xmgs}</c:if></textarea>
						</div>
					</form>
				</div>
				<div class="modal-footer text-xs-left">
					<button type="button" class="btn btn-primary btn-squared"
						id="btnSaveQuestion">保存</button>
					<button type="button" class="btn btn-default btn-squared"
						data-dismiss="modal">取消</button>
				</div>

			</div>
		</div>
	</div>
	<script>
		var page_type = "myTrain";
	</script>

	<%@include file="/jsp/footer/footer2.jsp"%>
	<button type="button"
		class="btn btn-icon btn-primary btn-squared met-scroll-top" hidden>
		<i class="icon wb-chevron-up" aria-hidden="true"></i>
	</button>
	<%@ include file="/jsp/bottom.jsp"%>

</body>
</html>
