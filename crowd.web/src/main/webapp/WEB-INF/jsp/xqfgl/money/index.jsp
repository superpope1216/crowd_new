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

 @media (max-width:500px) {
     #queryTime label{
       margin-left: 0%!important;
       margin-right: 0%!important;
     }
}
</style>



<body>
	<%@include file="/jsp/header.jsp"%>

	<div class="page bg-pagebg1">
		<div class="container">
			<div class="page-content row">

				<div class="col-lg-3">

					<%@include file="/jsp/xqfxx/left_menu.jsp"%>
				</div>

				<div class="col-lg-9">
					<div class="panel m-b-0" boxmh-mh>
						<div class="panel-body shop-order-check">
							<div class="row order-state-1">
								<div class="col-md-6 col-xs-12 shop-order-type">
									<h3 class="state_txt font-size-20">
										<i class="icon wb-payment orange-600" aria-hidden="true"
											style="font-size: 38px;"></i><span>收支统计</span> <small
											style="bottom: 7px; position: relative; font-size: 12px;">仅显示最近12个月的收支统计</small>
									</h3>

								</div>
								<div class="col-md-6 col-xs-12 text-right shop-order-type"
									style="line-height: 35px;">
									总支出：<span id="spanTotal">0</span> 当前冻结：<span id="spanDqdj">0</span>余额：<span
										id="spanYe">0</span>
								</div>
							</div>
							<div class="col-md-12">
								<div id="main" style="height: 300px"></div>
							</div>
							<div class="row order-state-1">
								<div class="col-md-6 col-xs-6 shop-order-type">
									<h3 class="state_txt font-size-20">
										<i class="icon wb-payment orange-600" aria-hidden="true"
											style="font-size: 38px;"></i><span>收支明细</span>
									</h3>
								</div>
								<div class="col-xs-6 text-right">
									<button type="button" class="btn btn-link" id="advancedSearch">高级搜索</button>
								</div>
								      <div  id="searchLike" data-flag="0" style="display:none;">
										<div class="form-group col-md-12"  id="queryTime">
											<label class="col-md-2 control-label" style="font-size: 14px;line-height:30px;margin-right:-3%;">开始发生时间</label>
												<div class="col-md-4">
											<input class="form-control datepicker" type="text"  name="beginDate"
												placeholder="请选择开始发生时间" >
											</div>
											<label class="col-md-2 control-label" style="font-size: 14px;line-height:30px;margin-right:-3%;margin-left:5%;">结束发生时间</label> 
											<div class="col-md-4">
											<input class="form-control datepicker" type="text"  name="endDate"
												placeholder="请选择结束发生时间" >
											</div>
										</div>
	                                   
						           <div class="col-md-12">
										<div class="panel m-b-0 met-muban-paralist" boxmh-mh>
									      <dl id="paralist">
										   <dd>
												<a class="btn queryActive link"
													href="javascript:void(0);" title="全部" data-key=""
													data-option="ywx">全部</a>
													<c:forEach items="${zhszlbList}" var="data">
														<a
															class="btn link "
															href="javascript:void(0);" data-option="ywx"
															title="${data.lbmc}" data-key="${data.lbdm}">${data.lbmc}</a>
													</c:forEach>
												</dd>
											 </dl>
										</div>
									 </div>
									 
								</div>
		                             
		                             
								</div>
								<div class="col-md-12">
									<div class="table-responsive text-xs-center">
									<table class="table table-striped m-b-0">
										<thead>
											<tr>
												<th class="text-xs-center">状态</th>
												<th class="text-xs-center">发生时间</th>
												<th class="text-xs-center">类别</th>
												<th class="text-xs-center">需求编号</th>
												<th class="text-xs-center">金额</th>
												<th class="text-xs-center">费用说明</th>
											</tr>
										</thead>
										<tbody id="mainTable">
											
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


	<script>
		var page_type = "xqfMoney";
	</script>

	<%@include file="/jsp/footer/footer2.jsp"%>
	<button type="button"
		class="btn btn-icon btn-primary btn-squared met-scroll-top" hidden>
		<i class="icon wb-chevron-up" aria-hidden="true"></i>
	</button>
	<%@ include file="/jsp/bottom.jsp"%>

</body>
</html>
