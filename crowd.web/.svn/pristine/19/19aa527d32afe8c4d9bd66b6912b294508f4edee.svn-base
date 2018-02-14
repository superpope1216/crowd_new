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
					<%@include file="/jsp/xyxx/left_menu.jsp"%>

				</div>

				<div class="col-lg-9 shop-profile">
					<div class="card">
						<div class="card-header bg-blue-600 text-xs-center p-30 p-b-15">
							<a class="avatar avatar-100  bg-white" target="_blank"
								href="javascript:void(0);" title='mycluster'>
								<c:if test="${empty xyxx.pxxyzpid }">
								    <img src="<%=request.getContextPath()%>/statics/images/card/kfz.png"
								     alt="mycluster" class="headImg">
								</c:if>
								<c:if test="${not empty xyxx.pxxyzpid }">
								    <img src="<%=request.getContextPath()%>/image/preView?wid=${xyxx.pxxyzpid}"
								     alt="mycluster" class="headImg">
								</c:if>
								 <%-- <img
								src="<%=request.getContextPath()%>/image/preView?wid=${xyxx.pxxyzpid}"
								alt="mycluster" class="headImg"> --%>
							</a>
							
							<div class="font-size-20 white">${xyxx.xm}</div>
<!-- 							<div class="grey-300 font-size-14 m-b-20">信誉分：100分</div> -->
						</div>

						<div class="card-content">
							<div class="row p-y-20 text-xs-center">
								<div class='col-xs-4 col-sm-5 offset-xs-2 offset-sm-1'>
									<div class="counter">
										<span class="counter-number cyan-600"><a id="aTotal"
											href="javascript:void(0);" class="font-color-333">0</a></span>
										<div class="counter-label font-color-999">总培训数</div>
									</div>
								</div>
								<div class='col-xs-4 col-sm-5'>
									<div class="counter">
										<span class="counter-number cyan-600"><a
											href="javascript:void(0);" class="font-color-333"
											id="aPass">0</a></span>
										<div class="counter-label font-color-999">通过培训数</div>
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
											style="font-size: 38px;"></i><span>我的待办</span>
									</h3>

								</div>
							</div>
							<div class="card-content">
								<div class="row p-y-20 text-xs-center">
									<div class='col-xs-6 col-sm-4 '>
										<div class="counter">
											<span class="counter-number cyan-600"><a
												href="javascript:void(0);" class="font-color-333"><span
													id="spanDbm">0</span></a></span>
											<div class="counter-label font-color-999">待完成报名</div>
										</div>
									</div>
									<div class='col-xs-6 col-sm-4'>
										<div class="counter">
											<span class="counter-number cyan-600"><a
												href="javascript:void(0);" class="font-color-333"><span
													id="spanDyy">0</span></a></span>
											<div class="counter-label font-color-999">待预约考核</div>
										</div>
									</div>
									<div class='col-xs-6 col-sm-4'>
										<div class="counter">
											<span class="counter-number cyan-600"><a
												href="javascript:void(0);" class="font-color-333"><span
													id="spanDkh">0</span></a></span>
											<div class="counter-label font-color-999">待考核</div>
										</div>
									</div>
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
		var jsonurl = '';
		var page_type = 'xyxx';
	</script>
	<%@ include file="/jsp/bottom.jsp"%>

</body>
</html>
