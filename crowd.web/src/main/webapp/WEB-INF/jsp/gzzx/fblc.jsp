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
	width: 100%;
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
								<div class="col-xs-12 gzzx-header">需求方发布流程</div>
								<div class="col-xs-12 gzzx-subheader">第一步 发布需求入口</div>
								<div class="col-xs-12 gzxx-content">
									<p>在系统主页面共有两个发布需求的入口，一是点击下图所示按钮1处直接进入发布需求界面；二是点击下图所示按钮2处直接进入众包大厅。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/fbxqrk.png">
									<p>进入众包大厅后，需求方可以通过点击下图中的按钮1进入发布需求界面，如果对我们平台的规则和流程不太了解，可以点击按钮2进行查看。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/fbxqrk2.png">
								</div>
								<div class="col-xs-12 gzzx-subheader">第二步 发布需求操作</div>
								<div class="col-xs-12 gzxx-content">
									<p>1.进入发布需求界面后，如果需求方对发布需求的模板不了解的话，可以选择下图的按钮1，在弹出窗口的区域2中选择相关类型需求的模板查看。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/fbxqckmb.png">
									<p>2.发布需求时，需求方可在下图的页面区域1中选择发布的任务形式，不同的任务形式有不同的任务流程，请仔细确认后再选择。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/xqrwxs.png">
									<p>3.系统对需求的招标日期和交付时间都有要求，如有不了解的地方，可以点击按钮进行查看。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/xqrqyq.png">
									<p>4.选择项目信息时，如果存在没有对应数据时请及时联系系统管理员。</p>
									<p>5.需求填写完成后，系统提供两个操作工需求方选择，一是保存草稿，需求方可以在需求方个人中心的需求列表中查找到该需求，并且可对任务再次进行维护，二是发布需求，则提交任务到管理端，然后会有对应的审核人员进行评估和审核，如果审核不通过，也可在需求方个人中心需求列表中查看审核意见，然后重新修改后再次提交审核。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/fbxq.png">
									<p>6.如果需求方对需求的预算价格不清晰的话，可以参考系统的估价标准，查看入口如下图所示。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/gjrk.png">
								</div>
								<div class="col-xs-12 gzzx-subheader">第三步 进行选标</div>
								<div class="col-xs-12 gzxx-content">
									<p>1.需求审核通过后，将会被展示在众包大厅，开发者会根据情况对需求进行竞标。</p>
									<p>2.需求方可以在首页的右上角选择需求方角色，进入到需求方个人中心，进入后通过左侧菜单栏选择我的需求，即可查看所有历史发布的需求，并可对需求进行操作。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/jrxqfzx.png">
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/xqfdxq.png">
									<p>3.需求方可以通过“需求变更”的下拉菜单的操作对需求进行维护。对于招标中的需求，系统提供两种需求变更操作，一是修改日期，即在该需求还未有人进行投标之前可以修改需求的招标截止日期和交付日期；二是发布相似需求，即系统会生成一个和该需求相似的需求，需求方只需对新的需求进行部分修改就能发布。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/xqbg.png">
									<p>4.需求方在需求列表中通过搜索找到相应的需求，点击需求的编号和名称即可查看需求详情。如果该需求是招标中的需求，需求方则可以看到所有投标人的信息，需求方可以综合各方因素，从所有竞标开发者中选择合适的开发者进行开发。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/ckxqrk.png">
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/xqfxb.png">
								</div>
								<div class="col-xs-12 gzzx-subheader">第四步 开发中发布问题</div>
								<div class="col-xs-12 gzxx-content">
									<p>1.需求进入开发后，如果该需求产生了其他问题，需求方可以在个人需求列表中对该需求发布问题，填写问题的相关信息并提交。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/fbwtrk.png">
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/fbwt.png">
									<p>2.问题提交之后，系统将会生成一条待审核的BUG信息，该BUG会由相应的审核人员审核并指定开发者进行修改，该BUG产生的费用将会由系统运营方进行支付。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/fbwtzh.png">
									<p>3.需求方还可以在主需求上查看所有针对该需求发布的历史问题。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/cklswt.png">
								</div>
								<div class="col-xs-12 gzzx-subheader">第五步 验收确认</div>
								<div class="col-xs-12 gzxx-content">
									<p>1.开发者在完成需求中全部内容并通过测试后会申请验收，此时需求方可以通过需求操作进行验收确认。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/xqfxqczrk.png">
									<p>2.需求方须仔细确认开发者的完成情况，并且亲自验证之后才可进行验收确认操作，点击需求操作右上方的验收确认按钮。若验收通过，需求方须填写对开发者的评价；若验收不通过，则需填写验收不通过理由。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/xqfystg.png">
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/xqfysbtg.png">
									<p>3.若需求方未能及时进行验收确认，系统将会根据需求金额进行自动验收操作，自动验收规则如下：500-1000为3天，1000-2000为4天，2000-4000为5天，4000-7000为6天，7000-10000为7天，10000-20000为10天，20000以上为15天，其中排除节假日（如果该需求下有任何一个自身的关联问题未解决，则不予自动验收）</p>
								</div>
								<div class="col-xs-12 gzzx-subheader">第六步 售后结束确认</div>
								<div class="col-xs-12 gzxx-content">
									<p>1.需求在验收通过之后会根据任务形式执行不同的流程，其中开发任务会自动进入售后流程，需求方可以在需求操作界面进行确认操作。</p>
									<p>2.和验收操作相似，售后通过时，需求方须完成对开发者的评价；若售后不通过，则需要填写不通过的原因和理由。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/shtg.png">
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/shbtg.png">
									<p>3.系统将会在验收通过3个月时进行自动结束售后操作，需求方也可提前进行售后确认。</p>
								</div>
								<div class="col-xs-12 gzzx-subheader">第七条 任务评价及结项</div>
								<div class="col-xs-12 gzxx-content">
									<p>1.系统会在需求进入待评价后的第7天对任务进行自动结项，在此之前需求方都可以在需求操作页面修改对开发者的评价。</p>
									<img src="<%=request.getContextPath()%>/statics/images/operation/rwgl/xqfpjkfz.png">
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

