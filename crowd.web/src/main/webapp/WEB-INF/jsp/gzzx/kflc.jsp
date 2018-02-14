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
img {
	width:100%;
}
</style>
<body>
	<%@include file="/jsp/header.jsp"%>

	<div class="page bg-pagebg1">
		<div class="container">
			<div class="page-content row">

				<div class="col-lg-3">

					<%@include file="/jsp/gzzx/left_menu_czsc.jsp"%>
				</div>

				<div class="col-lg-9 ">
					<div class="panel m-b-0 bg-blue-600" boxmh-mh>
						<div class="panel-body bg-blue-600 shop-order">
							<div class=" text-xs-center"
								style="font-size: 2rem; color: #FFF;">操作手册</div>
						</div>
					</div>
					<div class="panel m-b-0" boxmh-mh>
						<div class="panel-body  shop-order">
							<div class="row">
								<div class="col-xs-12 gzzx-header">开发者开发流程</div>
								<div class="col-xs-12 gzzx-subheader">第一步 寻找合适任务</div>
								<div class="col-xs-12 gzxx-content">
									<p>1.众包大厅入口一共有四个，如下图所示，开发者可以通过1、2号入口直接进入众包大厅，也可以在3、4位置区域根据条件进入众包大厅并查询需求信息</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/zbdtrk.png">
									<p>2.进入众包大厅后，开发者可以通过条件搜索相关的需求，开发者可以在1所示的输入框输入需求的编号及名称查询需求，也可在2区域根据任务的类型来查询需求，同时可以通过3区域的条件来更好的过滤需求，找到合适自己的需求</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/xqlb.png">
								</div>
								<div class="col-xs-12 gzzx-subheader">第二步 参加竞标</div>
								<div class="col-xs-12 gzxx-content">
									<p>1.开发者在需求列表中选择需求点击查看详情，如果开发者觉得该需求适合自己则可以进行竞标。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/kfztb.png">
									<p>2.如果某个需求开发者已经投标，若之后因某些原因不能进行开发，则可以在需求方选标之前退出投标。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/kfztctb.png">
								</div>
								<div class="col-xs-12 gzzx-subheader">第三步 进入开发及订单合作</div>
								<div class="col-xs-12 gzxx-content">
									<p>1.经过需求方的慎重考虑之后会选择一位开发者确认合作，需求也进入开发状态。</p>
									<p>2.对于内部开发者而言，如果某个需求自己无法全部完成，可以选择和其他内部开发者进行合作开发。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/ddcfrk.png">
									<p>3.在填写拆分订单是需要注意拆分金额不能大于需求的总金额，其中有选项是是否收取20%费用，若为是，则拆分人获得拆分金额的20%，被拆分人获取拆分金额的80%。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/ddcf.png">
									<p>4.被拆分人在收到合作订单时需要进行订单确认，如果觉得合适则可以接受合作订单，若觉得不合适也可拒绝合作。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/cfqr.png">
									<p>5.被拆分人在确认合作开发之后，则可以进入需求开发中，在完成拆分订单任务之后，需要在合作订单中提请验收，待拆分人确认完成后才算完成该合作订单。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/cfsqys.png">
									<p>6.拆分人在收到验收申请后，可以在合作订单中对该订单进行确认。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/cfysqr1.png">
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/cfysqr2.png">
								</div>
								<div class="col-xs-12 gzzx-subheader">第四步 需求验收</div>
								<div class="col-xs-12 gzxx-content">
									<p>1.开发者在确认需求内容已经全部完成，并且通过测试之后，则可以通过需求操作按钮进入需求操作界面。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/xqczrk.png">
									<p>2.开发者可以在需求操作界面的右上角点击申请验收按钮，在弹窗中填写对需求方的评价并提交验收申请。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/kfzsqys.png">
									<p>3.若需求方验收不通过，切莫着急，请及时和需求方沟通确认，再将需求方提出的问题修改完成后可以再次申请验收。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/ysbtgsqys.png">
									<p>4.若需求方未能及时进行验收确认，系统将会根据需求金额进行自动验收操作，自动验收规则如下：500-1000为3天，1000-2000为4天，2000-4000为5天，4000-7000为6天，7000-10000为7天，10000-20000为10天，20000以上为15天，其中排除节假日（如果该需求下有任何一个自身的关联问题未解决，则不予自动验收）</p>
								</div>
								<div class="col-xs-12 gzzx-subheader">第五步 需求售后售后</div>
								<div class="col-xs-12 gzxx-content">
									<p>1.需求被需求方验收通过后会根据不通任务形式进入不同流程，其中开发任务则会进入售后流程，在此期间，开发者需无偿未需求方修改问题</p>
									<p>2.系统会在需求验收通过的3个月后自动结束售后，需求方也可提前结束售后，若期间需求方提请售后不通过，开发者切莫着急，可与需求方进行交流沟通之后，再次申请售后结束。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/sqshjs.png">
								</div>
								<div class="col-xs-12 gzzx-subheader">第六步 评价及关闭</div>
								<div class="col-xs-12 gzxx-content">
									<p>1.系统会在需求进入待评价后的第7天对任务进行自动结项，在此之前开发者都可以在需求操作页面修改对需求方的评价。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/kfzpjxqf.png">
									<p>2.至此，一个需求在CROWD系统中从发布需求到结项的流程已全部结束，若您还有不清楚的地方可以及时与运营人员沟通，我们会给您更加详尽的解释。</p>
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

