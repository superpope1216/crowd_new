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

					<%@include file="/jsp/gzzx/left_menu.jsp"%>
				</div>

				<div class="col-lg-9 ">
					<div class="panel m-b-0 bg-blue-600" boxmh-mh>
						<div class="panel-body bg-blue-600 shop-order">
							<div class=" text-xs-center"
								style="font-size: 2rem; color: #FFF;">规则中心</div>
						</div>
					</div>
					<div class="panel m-b-0" boxmh-mh>
						<div class="panel-body  shop-order">
							<div class="row">
								<div class="col-xs-12 gzzx-header">平台流程</div>
								<div class="col-xs-12 gzzx-subheader">第一条 概述</div>
								<div class="col-xs-12 gzxx-content">
									<p>1、主要关于智慧校园云工场平台需求众包完整的生命周期概述。众包生命周期主要包括草稿、发布需求、审核需求、需求招标、需求选标、需求检测、需求验收、需求售后、需求评价、需求完成等几个阶段组成</p>
									<p>2、平台的需求主要分类为：开发、实施、测试、UI设计等，各种类型的生命周期不一样，除了开发有审核、售后生命周期外，其他类型的需求不具备审核、售后阶段。</p>
								</div>
								
								<div class="col-xs-12 gzzx-subheader">第二条 草稿</div>
								<div class="col-xs-12 gzxx-content">
									<p>需求可暂存为草稿，草稿状态的需求无法进行招投标流程。</p>
								</div>
								<div class="col-xs-12 gzzx-subheader">第三条 发布需求</div>
								<div class="col-xs-12 gzxx-content">
									<p>1、只有发布的需求才可进入审核或者招投标流程。</p>
									<p>2、只有开发类型的需求平台会支持价格审核、招投标周期把控等。</p>
									<p>3、具体规则请参考《发包须知》。</p>
								</div>
								<div class="col-xs-12 gzzx-subheader">第四条 平台审核</div>
								<div class="col-xs-12 gzxx-content">
									<div>
										<p>1、只有开发需求，平台负责需求、价格、周期的合理性审核，针对审核不通过的需求，请参考平台得分规则。
										</p>
										<p>2、BUG类型的需求不需要投标和选标，由平台审核后直接指定修改责任人，同时费用由平台支付。
										</p>
										<p>3、预算费用在1200元以内的需求审核周期不超过2个工作日。
										</p>
										<p>4、预算费用在1200元及以上的需求审核周期不超过5个工作日。
										</p>
										<p>5、审核通过的需求，会进入投标环节并显示在平台大厅，审核不通过的需求，则需求方需求重新修改发布。
									</div>
								</div>
								<div class="col-xs-12 gzzx-subheader">第五条 招标</div>
								<div class="col-xs-12 gzxx-content">
									<div>
										<p>审核通过的需求，进入招标环节，供开发者投标竞标
										</p>
									</div>
								</div>
								<div class="col-xs-12 gzzx-subheader">第六条 选标</div>
								<div class="col-xs-12 gzxx-content">
									<div>
										<p>1、针对有开发者投标的需求，请需求方及时对比开发者，并选择适合的开发者参与投标
										</p>
										<p>2、超期未确定中选开发者：若在选择招标截止日期内有人参与接包竞争，但需求方未选出中选接包者，则系统将关闭订单</p>
										<p>3、参与接包竞争期限（即：招标截止日期）结束后，一直没有投标者，则需求会自动关闭，如需重新投标，则在需求方需求管理中心重新发布该需求</p>
									</div>
								</div>
								<div class="col-xs-12 gzzx-subheader">第七条 检测（可选）</div>
								<div class="col-xs-12 gzxx-content">
									<div>
										<p>1、检测主要由测试人员对需求的安全、性能、功能进行整体性测试确认，有开发方发起检测申请，平台检测部门负责检测。
										</p>
										<p>2、只有部分全新的应用有检测环节，是否需要检测环节由平台管理员审核确认。。
										</p>
										<p>3、检测通过的需求，则进入验收流程，检测不通过的需求则开发者需求重新修改并申请检测。
										</p>
									</div>
								</div>
								<div class="col-xs-12 gzzx-subheader">第七条 验收</div>
								<div class="col-xs-12 gzxx-content">
									
									<p>1、开发者提请需求验收后，需求方须在规定期限天内作出处理（需求金额1000（包括1000）以下的3天验收周期，1000以上2000（包括2000）以下的4天验收周期，2000以上4000以下（包括4000）5天验收周期，
									，4000以上7000以下（包括7000）6天验收周期，7000以上10000以下（包括10000）7天验收周期，10000以上20000以下（包括20000）10天验收周期,20000以上15天验收周期：注：周期不包括国家国定节假日和周六周日），若需求方未拒绝验收、也没有进行退回，则系统自动视为验收通过，并扣除5分的需求方信誉积分，同时支付平台规定的验收期金额</p>
									<p>2、开发者提请BUG验收后，需求方须在规定期限天内作出处理（需求金额1000（包括1000）以下的3天验收周期，1000以上2000（包括2000）以下的4天验收周期，2000以上4000以下（包括4000）5天验收周期，
									，4000以上7000以下（包括7000）6天验收周期，7000以上10000以下（包括10000）7天验收周期，10000以上20000以下（包括20000）10天验收周期,20000以上15天验收周期：注：周期不包括国家国定节假日和周六周日），若需求方未拒绝验收、也没有进行退回，则系统自动视为验收通过，并扣除5分的需求方信誉积分。</p>
									<p>3、若发生验收不通过的现象，则自动验收周期从再次申请验收的时间重新计算。</p>
									<p>4、若开发者恶意验收不通过，平台有权终止该用户的发包权限，</p>
								    <p>5、针对验收通过的<span style="color:red">开发性质</span>需求,验收通过后会有售后环节（500以内包括500元没有售后周期），</p>
								    <p>6、<span style="color:red">针对发布的BUG，经平台确认是该开发人员造成的BUG，开发者将会获取不到对应的BUG金额，BUG将由开发者义务维护。</span>
								</div>
								<div class="col-xs-12 gzzx-subheader">第八条 售后</div>

								<div class="col-xs-12 gzxx-content">
									<p>1、平台仅有部分开发需求默认有售后期限，售后期间为90天，</p>
									<p>2、在售后期间中，若需求方确认有问题，并拒绝售后结束，则开发者有义务在规定时间内响应需求问题（仅针对问题）的整改，每次售后部通过，则售后期限自动延长10天，</p>
									<p>3、若开发者恶意发起问题，并拒绝售后结束，平台有权终止该用户的发包权限，</p>
									<p>4、<span style="color:red">在售后期内，如果发生问题，需求方请在该需求中追加问题，针对追加的问题未解决，平台会冻结开发者的售后金额，如果需求方不从对于需求中追加问题，则该需求发生问题，平台不予金额保护。</span>
								</div>
								<div class="col-xs-12 gzzx-subheader">第九条 评价规则</div>
								<div class="col-xs-12 gzxx-content">
									<p>1、需求方在验收需要的时候，必须对开发者作出严格、认证、负责的评价。</p>
									<p>2、需求方在验收的时候，作出的评价不会参与到开发者的信誉评价中，售后结束后，可再次确认评价并修改，本次的评价纳入开发者的评价体系中。</p>
									<p>3、需求方发布的评价，不会对开发者展示，仅供平台筛选优秀开发者和开发者评价体系使用。</p>
									<p>4、需求方发布的评价，最终会在30日后纳入开发者的评价体系中。</p>
									<p>5、为了提高平台的开发质量，请做出严格、认证、负责的评价。</p>
								</div>
								<div class="col-xs-12 gzzx-subheader">第十条 本规则自发布之日起实行</div>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="/jsp/bottom.jsp"%>
</body>
</html>