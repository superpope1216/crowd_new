<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<%@ include file="/jsp/top/top.jsp"%>
<%@ include file="/jsp/top/other.jsp"%>
<%@ include file="/jsp/param.jsp"%>
<!--[if lte IE 8]>
<div class="text-xs-center m-b-0 bg-blue-grey-100 alert">
    <button type="button" class="close" aria-label="Close" data-dismiss="alert">
        <span aria-hidden="true">×</span>
    </button>
    你正在使用一个 <strong>过时</strong> 的浏览器。请 <a href="http://browsehappy.com/" target="_blank">升级您的浏览器</a>，以提高您的体验。
</div>
<![endif]-->
<style>
.headImg {
	height: 99px !important;
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

				<div class="col-lg-9 shop-profile">
					<div class="card">
						<div class="card-header bg-blue-600 text-xs-center p-30 p-b-15">
							<a class="avatar avatar-100  bg-white" target="_blank"
								href="javascript:void(0);" title='mycluster'> 
								<c:if test="${empty kfzxx.grzpfjid }">
								    <img src="<%=request.getContextPath()%>/statics/images/card/kfz.png"
								     alt="mycluster" class="headImg">
								</c:if>
								<c:if test="${not empty kfzxx.grzpfjid }">
								    <img src="<%=request.getContextPath()%>/image/preView?wid=${kfzxx.grzpfjid}"
								     alt="mycluster" class="headImg">
								</c:if>
								<%-- <img
								src="<%=request.getContextPath()%>/image/preView?wid=${kfzxx.grzpfjid}"
								alt="mycluster" class="headImg"> --%>
								
							</a>
							<div class="font-size-20 white">${kfzxx.nc}(${(kfzxx.sfytd eq '1')?'个人':'企业'}开发者)</div>
							<div class="grey-300 font-size-14 m-b-20">信誉分：${kfzxx.score}分</div>
						</div>

						<div class="card-content">
							<div class="row p-y-20 text-xs-center">
								<c:choose>
									<c:when test="${kfzxx.kfzlb eq '2' }">
										<div class='col-xs-4 col-sm-4 offset-xs-2 offset-sm-1'>
											<div class="counter">
												<span class="counter-number cyan-600"><a id="aZzc"
													href="javascript:void(0);" class="font-color-333">0</a></span>
												<div class="counter-label font-color-999">总收入</div>
											</div>
										</div>
										<div class='col-xs-4 col-sm-2'>
											<div class="counter">
												<span class="counter-number cyan-600"><a
													href="javascript:void(0);" class="font-color-333" id="aMonthTotal">0</a></span>
												<div class="counter-label font-color-999">本月收入</div>
											</div>
										</div>

										<div class='col-xs-12 col-sm-4'>
											<div class="counter">
												<span class="counter-number cyan-600"><a
													href="<%=request.getContextPath()%>/kfzMoney/index?flag=money"
													class="font-color-333" id="aMonthMoney">0</a></span>
												<div class="counter-label font-color-999">本月工资</div>
											</div>
										</div>
									</c:when>
									<c:otherwise>
										<div class='col-xs-4 col-sm-4 offset-xs-2 offset-sm-1'>
											<div class="counter">
												<span class="counter-number cyan-600"><a id="aZzc"
													href="javascript:void(0);" class="font-color-333">0</a></span>
												<div class="counter-label font-color-999">总收入</div>
											</div>
										</div>
										<div class='col-xs-4 col-sm-2'>
											<div class="counter">
												<span class="counter-number cyan-600"><a
													href="javascript:void(0);" class="font-color-333" id="aDzf">0</a></span>
												<div class="counter-label font-color-999">待支付</div>
											</div>
										</div>

										<div class='col-xs-12 col-sm-4'>
											<div class="counter">
												<span class="counter-number cyan-600"><a
													href="<%=request.getContextPath()%>/kfzMoney/index?flag=money"
													class="font-color-333">￥${kfzxx.zhye}元</a></span>
												<div class="counter-label font-color-999">账户余额</div>
											</div>
										</div>
									</c:otherwise>
								</c:choose>
							</div>
						</div>
					</div>
					<div class="panel" boxmh-mh>
						<div class="panel-body shop-order-check">
							<div class="row order-state-1">
								<div class="col-md-6 col-xs-12 shop-order-type">
									<h3 class="state_txt font-size-20">
										<i class="icon wb-payment orange-600" aria-hidden="true"
											style="font-size: 38px;"></i><span>我的待办</span>
									</h3>

								</div>
							</div>
							<div class="card-content">
								<div class="row p-y-20 text-xs-center">
									<div class='col-xs-6 col-sm-3 '>
										<div class="counter">
											<span class="counter-number cyan-600"><a
												href="javascript:void(0);" class="font-color-333"><span
													id="spanKfz">0</span></a></span>
											<div class="counter-label font-color-999">开发中</div>
										</div>
									</div>
									<div class='col-xs-6 col-sm-3'>
										<div class="counter">
											<span class="counter-number cyan-600"><a
												href="javascript:void(0);" class="font-color-333"><span
													id="spanSqjc">0</span></a></span>
											<div class="counter-label font-color-999">待申请检测</div>
										</div>
									</div>
									<div class='col-xs-6 col-sm-3'>
										<div class="counter">
											<span class="counter-number cyan-600"><a
												href="javascript:void(0);" class="font-color-333"><span
													id="spanSqys">0</span></a></span>
											<div class="counter-label font-color-999">待申请验收</div>
										</div>
									</div>
									<div class='col-xs-6 col-sm-3'>
										<div class="counter">
											<span class="counter-number cyan-600"><a
												href="javascript:void(0);" class="font-color-333"><span
													id="spanSqsh">0</span></a></span>
											<div class="counter-label font-color-999">待申请售后</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="panel" boxmh-mh>
						<div class="panel-body shop-order-check">
							<div class="row order-state-1">
								<div class="col-md-6 col-xs-12 shop-order-type">
									<h3 class="state_txt font-size-20">
										<i class="icon wb-payment orange-600" aria-hidden="true"
											style="font-size: 38px;"></i><span>我的收入</span>
									</h3>

								</div>
							</div>
							<div class="card-content">
								<div id="main" style="height: 300px"></div>
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
		var jsonurl = '';
		var page_type = 'kfzxx';
	</script>
	<%@ include file="/jsp/bottom.jsp"%>

</body>
</html>
