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
<style>
 .select2-drop {
        z-index: 10050 !important;
    }
 
    .select2-search-choice-close {
        margin-top: 0 !important;
        right: 2px !important;
        min-height: 10px;
    }
 
        .select2-search-choice-close:before {
            color: black !important;
        }
    /*防止select2不会自动失去焦点*/
    .select2-container {
        z-index: 16000 !important;
    }
 
    .select2-drop-mask {
        z-index: 15990 !important;
    }
 
    .select2-drop-active {
        z-index: 15995 !important;
    }
</style>
<body>
	<%@include file="/jsp/header.jsp"%>

	<div class="page bg-pagebg1">
		<div class="container">
			<div class="page-content row">

				<div class="col-lg-3">

					<%@include file="/jsp/kfzxx/left_menu.jsp"%>
				</div>

				<div class="col-lg-9">
					<div class="panel m-b-0" boxmh-mh>
						<div class="panel-body shop-order">
						<button type="button" class="my-btn" id="btnAddDeskstop" >资源申请</button>
							<div>
								<ul class="nav nav-tabs nav-tabs-line m-b-0 shop-order-state">
									<li class='nav-item active'><a class="nav-link" data-toggle="tab"
										href="#state1" data-state="1">云桌面</a></li>
									<li class='nav-item'><a class="nav-link" data-toggle="tab"
										href="#state0" data-state="2">数据库</a></li>
									<li class='nav-item'><a class="nav-link" data-toggle="tab"
										href="#state0" data-state="3">SVN</a></li>
									<li class='nav-item'><a class="nav-link" data-toggle="tab"
										href="#state0" data-state="4">VPN</a></li>
								</ul>
							</div>
<!-- 							<div class="shop-order-keyword m-y-20">
								<div class="form-group">
									<div class="input-search">
										<button type="submit" class="input-search-btn">
											<i class="icon wb-search" aria-hidden="true"></i>
										</button>
										<input type="text" class="form-control" name="keyword"
											data-table-search="true" placeholder="需求编号、需求名称、项目编号、项目名称、学校名称">
									</div>
								</div>
							</div> -->
							<div class="cart-list animation-fade" data-scale="1">
									<div class="table-responsive">
										<table class="table table-hover table-striped">
											<thead>
												<tr id="trans">
													
												</tr>
											</thead>
											<tbody id="zyTable">
											</tbody>
										</table>
									</div>
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
	
	
	<div class="modal fade modal-primary trans" id="rbxx-edit-modal" 
		aria-hidden="true" aria-labelledby="rbxx-modal-title" role="dialog"
		tabindex="-1">
		<div class="modal-dialog modal-center modal-md">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title" id="rbxx-modal-title">资源申请</h4>
				</div>
				<form id="formRbxxgl"
					class="addr-edit-form met-form-validation" >
					<div class="modal-body">
						<div class="form-group col-md-12">
							<label class="col-sm-3 control-label" style="font-size: 14px;">申请资源类别</label>
							<div class="col-sm-9">
								<select class="form-control myinput" id="sqzylb" name="sqzylb" multiple="multiple">
									<c:forEach items="${zylbList}" var="list">
										<option value="${list.lbdm}">${list.lbmc}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group col-md-12">
							<label class="col-sm-3 control-label" style="font-size: 14px;">开始使用时间</label>
							<div class="col-sm-9">
							<input type="text" class="form-control datepicker" name="kssysj"
								placeholder="请输入日期"  data-bv-date="true" 
									data-bv-date-format="YYYY-MM-DD"
									data-bv-date-message="请输入正确的日期格式" value="${date}"
									data-bv-notempty="true"  
			                       	data-bv-notempty-message="此项不能为空">
							</div>
						</div>
						
						<div class="form-group col-md-12">
							<label class="col-sm-3 control-label" style="font-size: 14px;">结束使用时间</label>
							<div class="col-sm-9">
							<input type="text" class="form-control datepicker" name="jssysj"
								placeholder="请输入日期"  data-bv-date="true" 
									data-bv-date-format="YYYY-MM-DD"
									data-bv-date-message="请输入正确的日期格式" value="${date}"
									data-bv-notempty="true"  
			                       	data-bv-notempty-message="此项不能为空">
							</div>
						</div>
						
						<div class="form-group col-md-12">
						<label class="col-sm-3 control-label" style="font-size: 14px;">申请理由</label>
						    <div class="col-sm-9">
							<textarea class="form-control" rows="3" name="sqly"
								placeholder="请输入申请理由" 
								data-bv-notempty="true"  
			                	data-bv-notempty-message="此项不能为空"></textarea>
								</div>
						</div>
					</div>
					<div class="modal-footer text-xs-left">
						<button type="button" class="my-btn" id="btnSave">保存</button>
						<button type="button" class="my-btn-default"
							data-dismiss="modal">取消</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- End Modal -->
	
	
	<script>
	var page_type="deskstop";
	var date="${date}";
	</script>

	<%@include file="/jsp/footer/footer2.jsp" %>
	<button type="button"
		class="btn btn-icon btn-primary btn-squared met-scroll-top" hidden>
		<i class="icon wb-chevron-up" aria-hidden="true"></i>
	</button>
	<%@ include file="/jsp/bottom.jsp"%>
</body>
</html>
