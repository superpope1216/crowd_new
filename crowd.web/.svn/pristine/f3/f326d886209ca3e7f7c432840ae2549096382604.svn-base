<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<%@ include file="/jsp/top/top.jsp"%>
<%@ include file="/jsp/top/other.jsp"%>
<%@ include file="/jsp/param.jsp"%>

<style>
	.myinput{
	margin-bottom:5px;
	}
</style>
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
							<div>
							  <ul class="nav nav-tabs nav-tabs-line m-b-0 shop-order-state">
									<li class='nav-item' ><a id="aBasic" class="nav-link active"
										data-toggle="tab" href data-state="all">基本信息</a></li>
									
								</ul>
							</div>
							
						  <ul
								class="shop-discount-list blocks-100 blocks-sm-2 blocks-xl-3 m-t-20 met-member-index"
								data-scale="1" data-size="&amp;x=400&amp;y=400" id="ulBasicInfo">
								<form class="form-horizontal" role="form" id="formBasicInfo">
									<%@include file="/jsp/xyxx/basic/basicInfo.jsp"%>
									<div class="row" style="border-bottom: none;">
										<div class="col-xs-3 "></div>
										<div class="col-xs-9">
											<button class="btn btn-primary mybtn" type="button" id="saveBasicInfo">保存</button>
										</div>
									</div>
								</form>

							</ul>
							
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="/jsp/footer/footer2.jsp" %>
	<button type="button"
		class="btn btn-icon btn-primary btn-squared met-scroll-top" hidden>
		<i class="icon wb-chevron-up" aria-hidden="true"></i>
	</button>
	<script>
	var page_type = "xyBasicInfo";
	</script>
	<%@ include file="/jsp/bottom.jsp"%>
</body>
</html>