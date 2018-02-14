<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<%@ include file="/jsp/top/top.jsp"%>
<%@ include file="/jsp/top/other.jsp"%>
<%@ include file="/jsp/param.jsp"%>
<link rel='stylesheet'
	href='<%=request.getContextPath()%>/statics/css/order.css'>
	<link rel='stylesheet'
	href='<%=request.getContextPath()%>/statics/css/xxgl/message.css'>
<body>
	<%@include file="/jsp/header.jsp"%>

	<div class="page bg-pagebg1">
		<div class="container">
			<div class="page-content row">

				<div class="col-lg-3">

					<%@include file="/jsp/message/left_menu.jsp"%>
				</div>

				<div class="col-lg-9">
					<div class="panel m-b-0 bg-blue-600" boxmh-mh>
						<div class="panel-body bg-blue-600 shop-order">
							<div class=" text-xs-center"
								style="font-size: 2rem; color: #FFF;">需求消息</div>
						</div>
					</div>
					<div class="panel m-b-0" boxmh-mh>
						<div class="panel-body shop-order">
							<div>
<!-- 								<button type="button"
									class="btn btn-success addr-btn btn-squared" id="btnAddRbxx">新建</button> -->
							
								<div class="mesnav">
									<span style="vertical-align: middle"><input
										type="checkbox" onclick="checkAllXqxx()" id="checkAll"
										name="checkAll" style="margin-right: 2px;">&nbsp;全部</span> <span
										style="margin-left: 20px;">
										<button onclick="batchDeleteXqxx(this);" type="button"
											class="kbtn kbtn_default kbtn26" id="deleteBtn">删除</button>
										<button onclick="markXqxxReaded(this);" type="button"
											class="kbtn kbtn_default kbtn26" id="editBtn">标记为已读</button>
										<button onclick="markXqxxUnread(this);" type="button"
											class="kbtn kbtn_default kbtn26" id="editBtn">标记为未读</button>
										<button onclick="refreshXqxxTable(1,true);" type="button"
											class="kbtn kbtn_default kbtn26" id="editBtn">刷新</button>
										<button onclick="xqxxSet(this);" type="button"
											class="kbtn kbtn_default kbtn26" id="editBtn">设置</button>
									</span>
								</div>
								<div class="cart-list animation-fade" data-scale="1" style="min-height:200px;">
									<div class="table-responsive">
										<table class="table table-hover table-striped">
											<tbody>
											</tbody>
										</table>
										<footer class="bg-white">
											<div  class="mypaging2 clearfix"></div>
										</footer>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="modal fade modal-primary" id="xqxx-set-modal" 
		aria-hidden="true" aria-labelledby="xqxx-modal-title" role="dialog"
		tabindex="-1">
		<div class="modal-dialog modal-center modal-md">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title" id="xqxx-modal-title">设置</h4>
				</div>
				<form id="formXqxxgl"
					class="addr-edit-form met-form-validation" >
					<div class="modal-body">
						<div class="form-group m-b-0 col-md-12">
						<label class="col-sm-3 control-label" style="font-size: 14px;">接收消息类型</label>
						 <div class="col-sm-9" id="jsxxlx">
							
						  </div>
						</div>
					</div>
					<div class="modal-footer text-xs-left">
						<button type="button" class="btn btn-primary btn-squared" id="btnSaveXqxxSet">保存</button>
						<button type="button" class="btn btn-default btn-squared"
							data-dismiss="modal">取消</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- End Modal -->
	
	<%@include file="/jsp/footer/footer2.jsp" %>
		<script type="text/javascript">
			var page_type = "demandMessage";
		</script>
	<%@ include file="/jsp/bottom.jsp"%>
</body>
</html>