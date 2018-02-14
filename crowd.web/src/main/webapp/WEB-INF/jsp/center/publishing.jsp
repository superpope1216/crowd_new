<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE HTML>
<html>
<%@ include file="/jsp/top/top.jsp"%>
<%@ include file="/jsp/top/other.jsp"%>
<%@ include file="/jsp/param.jsp"%>
<link rel='stylesheet'
	href='<%=request.getContextPath()%>/statics/css/order.css'>
<style>
.blocks-4>li {
	width: 16%;
}

.file-upload-success {
	background-color: transparent;
	color: #60BE29;
	text-decoration: none;
	cursor: pointer;
}

.file-upload {
	background-color: transparent;
	color: #2196F3;
	text-decoration: none;
	cursor: pointer;
	vertical-align: top;
	display: inline-block;
	position: relative;
	overflow: hidden;
}

.file-upload input[type=file] {
	position: absolute;
	cursor: pointer;
	opacity: 0;
	filter: alpha(opacity = 0);
	top: 0;
	right: 0;
}

.file-upload-info {
	font-size: 12px;
	vertical-align: top;
	color: #bbb;
}

.myactive{

}
.myactive>a>div{
	color:#62a8ea;
}
</style>
<!--[if lte IE 8]>
<div class="text-xs-center m-b-0 bg-blue-grey-100 alert">
    <button type="button" class="close" aria-label="Close" data-dismiss="alert">
        <span aria-hidden="true">×</span>
    </button>
    你正在使用一个 <strong>过时</strong> 的浏览器。请 <a href="http://browsehappy.com/" target="_blank">升级您的浏览器</a>，以提高您的体验。
</div>
<![endif]-->

<body>

	<%@ include file="/jsp/header.jsp"%>

	<div class="page bg-pagebg1">
		<div class="container">
			<div class="page-content row">
				<div class="col-lg-9">
					<div class="panel m-b-0" boxmh-mh>
						<div class="panel-body shop-order">


							<div id="rwjbxx">
								<form id="formRbxxgl" class="addr-edit-form met-form-validation">
									<input type="hidden" name="rwjbxxInfo.wid"
										value="<c:if test='${!empty rwjbxx}'>${rwjbxx.wid}</c:if>">
									<input type="hidden" name="token" value="${token}">
									<div class="modal-body">
										<div class="row my-mb-10"
											style="border-bottom: 1px solid #999;">
											<h3>
												<i class="fa fa-edit my-text-color" aria-hidden="true"></i>发布需求
											</h3>
										</div>
										<div class="well well-sm my-padding-8">发布需求流程</div>
										<div class="pearls blocks-4">
											<li class="pearl m-b-0 current">
												<div class="pearl-icon">
													<i class="icon wb-clipboard" aria-hidden="true"></i>
												</div> <span class="pearl-title">发布</span>
											</li>
											<li class="pearl m-b-0 disabled">
												<div class="pearl-icon">
													<i class="icon wb-payment" aria-hidden="true"></i>
												</div> <span class="pearl-title">审核
													<p class="blue-grey-400 hidden-sm-down m-b-0"></p>
											</span>
											</li>
											<li class="pearl m-b-0 disabled">
												<div class="pearl-icon">
													<i class="icon wb-check" aria-hidden="true"></i>
												</div> <span class="pearl-title">选标</span>
											</li>
											<li class="pearl m-b-0 disabled">
												<div class="pearl-icon">
													<i class="icon wb-clipboard" aria-hidden="true"></i>
												</div> <span class="pearl-title">验收</span>
											</li>
											<li class="pearl m-b-0 disabled">
												<div class="pearl-icon">
													<i class="icon wb-clipboard" aria-hidden="true"></i>
												</div> <span class="pearl-title">售后</span>
											</li>
											<li class="pearl m-b-0 disabled">
												<div class="pearl-icon">
													<i class="icon wb-clipboard" aria-hidden="true"></i>
												</div> <span class="pearl-title">结项</span>
											</li>
										</div>
										<div class="well well-sm my-padding-8">请选择所要发布的需求分类</div>
										
										
										<div class="row my-mt-10 ">
											<div class="col-xs-12">
												<ul class="nav navbar-nav" id="ul-rwxs" style="width:100%;">
													<c:set var="rwxs_length" value="${fn:length(rwxs)}"></c:set>
													<c:set var="rwxs_width" value="${100/rwxs_length}"></c:set>
													<c:forEach varStatus="status" items="${rwxs}" var="data" >
														<c:choose>
															<c:when test="${data.lbdm == 1}">
																<c:set var="icon" value="fa-laptop"></c:set>
																<c:set var="name" value="开发专区"></c:set>
															</c:when>
															<c:when test="${data.lbdm == 2}">
																<c:set var="icon" value="fa-dashboard"></c:set>
																<c:set var="name" value="实施专区"></c:set>
															</c:when>
															<c:when test="${data.lbdm == 3}">
																<c:set var="icon" value="fa-free-code-camp"></c:set>
																<c:set var="name" value="设计专区"></c:set>
															</c:when>
															<c:when test="${data.lbdm == 4}">
																<c:set var="icon" value="fa-bar-chart-o"></c:set>
																<c:set var="name" value="销售专区"></c:set>
															</c:when>
															<c:when test="${data.lbdm == 5}">
																<c:set var="icon" value="fa-user-plus"></c:set>
																<c:set var="name" value="售前专区"></c:set>
															</c:when>
															<c:when test="${data.lbdm == 6}">
																<c:set var="icon" value="fa-book"></c:set>
																<c:set var="name" value="培训专区"></c:set>
															</c:when>
															<c:when test="${data.lbdm == 7}">
																<c:set var="icon" value="fa-database"></c:set>
																<c:set var="name" value="测试专区"></c:set>
															</c:when>
														</c:choose>
														<li data-key="${data.lbdm}" class="${((rwjbxx.rwxs eq data.lbdm)?'myactive':((status.index==0)?'myactive':''))} pull-left" style="width:${rwxs_width}%;">
														<a href="javascript:void(0);">
																<div class="text-center">
																	<i class="fa ${icon} fa-3x" data-original-title=""
																		title=""></i><br> ${data.lbmc}
																</div>
														</a></li>
													</c:forEach>
												</ul>

											</div>
										</div>
										<div class="well well-sm my-padding-8">请完善需求的基本信息</div>
										<div class="form-group">
											<input type="text" class="form-control"
												name="rwjbxxInfo.rwmc" placeholder="一个清晰的名字能帮助开发者快速的了解需求"
												required data-fv-notempty-message="此项不能为空"
												value="<c:if test='${!empty rwjbxx}'>${rwjbxx.rwmc}</c:if>">
										</div>

										<div class="form-group select-linkage">
											<select class="form-control prov" name="rwjbxxInfo.rwlx"
												required data-fv-notempty-message="此项不能为空">
												<option value=""
													<c:if test="${(empty rwjbxx) || (rwjbxx.rwlx eq '')}">selected</c:if>>---请选择需求类型---</option>
												<c:forEach items="${rwlx}" var="data">
													<option value="${data.lbdm}"
														<c:if test="${(!empty rwjbxx) && (rwjbxx.rwlx eq data.lbdm)}">selected</c:if>>${data.lbmc}</option>
												</c:forEach>
											</select>
										</div>
										<div class="form-group select-linkage">
											<select class="form-control prov" name="rwjbxxInfo.sfjj"
												required data-fv-notempty-message="此项不能为空">
												<option value=""
													<c:if test="${(empty rwjbxx) || (rwjbxx.sfjj eq '')}">selected</c:if>>---请选择需求紧急类型(紧急会严格按照交付日期执行，但需求额外的费用)---</option>
												<c:forEach items="${jjrw}" var="data">
													<option value="${data.lbdm}"
														<c:if test="${(!empty rwjbxx) && (rwjbxx.sfjj eq data.lbdm)}">selected</c:if>>${data.lbmc}</option>
												</c:forEach>
											</select>

										</div>
										<div class="form-group">
											<input type="text" class="form-control"
												name="rwjbxxInfo.xmysje" placeholder="请输入预算金额(元)" required
												data-fv-notempty-message="此项不能为空" pattern="^\+?[1-9]\d*$"
												data-fv-regexp-message="请输入正确的正整数类型数字"
												data-fv-stringlength="true" data-fv-stringlength-min="1"
												data-fv-stringlength-max="6"
												value="<c:if test='${!empty rwjbxx}'>${rwjbxx.xmysje}</c:if>">
										</div>

										<p class="form-control-static pull-right">
											<button type="button" class="btn btn-link"
												id="btnNeedTemplate">需求模板参考</button>
										</p>
										<div class="form-group">
											<textarea class="form-control" rows="3"
												name="rwjbxxInfo.xmgs" placeholder="请输入需求描述" required
												data-fv-notempty-message="此项不能为空"><c:if
													test='${!empty rwjbxx}'>${rwjbxx.xmgs}</c:if></textarea>
										</div>
                                     
										<input type="hidden" id="xqwdfjid" name="rwjbxxInfo.xqwdfjid"  value="${rwjbxx.xqwdfjid}"/>
										<div class="form-group">
											<div id="xqwdfjidDiv" name="xqwdfjidDiv">
											</div>
										</div>



										<div class="well well-sm my-padding-8">
											<table style="width: 100%">
												<tr>
													<td>请选择需求的招标/交付日期</td>
													<td align="right"><button type="button"
															class="btn btn-link" id="btnNeedDate">日期规则</button></td>
												</tr>
											</table>
										</div>
										<div class="form-group">
											<input class="form-control datepicker" type="text"
												name="rwjbxxInfo.zbjzrq"
												placeholder="请输入需求招标截至日期，到达该日期后，如果没有投标或者选标，需求则会自动关闭"
												required data-fv-notempty-message="此项不能为空"
												data-bv-date="true" data-bv-date-format="YYYY-MM-DD"
												data-bv-date-message="请输入正确的日期格式"
												value="<c:if test='${!empty rwjbxx}'><fmt:formatDate value="${rwjbxx.zbjzrq}" pattern="yyyy-MM-dd" type="both"/></c:if>">
										</div>
										<div class="form-group">
											<input type="text" class="form-control datepicker"
												name="rwjbxxInfo.jfrq"
												placeholder="请输入预期交付日期日期，中标者将严格按照该日期交付需求相关信息" required
												data-fv-notempty-message="此项不能为空" data-bv-date="true"
												data-bv-date-format="YYYY-MM-DD"
												data-bv-date-message="请输入正确的日期格式"
												value="<c:if test='${!empty rwjbxx}'>${rwjbxx.jfrq}</c:if>">
										</div>
										<div class="well well-sm my-padding-8">请选择需求的相关项目信息</div>
										<div class="form-group select-linkage">
											<input type="text" class="form-control"
												name="rwjbxxExtInfo.xmbh" placeholder="请输入项目编号、学校名称,选择项目信息"
												required data-fv-notempty-message="此项不能为空"
												value="<c:if test='${!empty rwjbxxExt}'>${rwjbxxExt.xmbh}</c:if>">
										</div>
										<div class="form-group select-linkage">
											<select class="form-control prov" name="rwjbxxExtInfo.ywxbm"
												required data-fv-notempty-message="此项不能为空">
												<option value=""
													<c:if test='${(empty rwjbxxExt) || (rwjbxxExt.ywxbm eq "")}'>selected</c:if>>---请选择业务线信息---</option>
												<c:forEach items="${ywx}" var="data">
													<option value="${data.lbdm}"
														<c:if test='${(!empty rwjbxxExt) && (rwjbxxExt.ywxbm eq data.lbdm)}'>selected</c:if>>${data.lbmc}</option>
												</c:forEach>
											</select>
										</div>
										<input type="hidden" name="rwjbxxExtInfo.wid"
											value="<c:if test='${!empty rwjbxxExt}'>${rwjbxxExt.wid}</c:if>">
										<input type="hidden" name="rwjbxxExtInfo.rwid"
											value="<c:if test='${!empty rwjbxxExt}'>${rwjbxxExt.rwid}</c:if>">
										<div class="form-group select-linkage">
											<select class="form-control prov" name="rwjbxxExtInfo.mkbh"
												required data-fv-notempty-message="此项不能为空">
												<option value=""
													<c:if test='${(empty rwjbxxExt) || (rwjbxxExt.mkbh eq "")}'>selected</c:if>>---请选择模块信息---</option>
												<c:if test="${!empty cpml}">
													<c:forEach items="${cpml}" var="data">
														<option value="${data.lbdm}"
															<c:if test='${(!empty rwjbxxExt) && (rwjbxxExt.mkbh eq data.lbdm)}'>selected</c:if>>${data.lbmc}</option>
													</c:forEach>
												</c:if>
											</select>
										</div>
										<div class="form-group select-linkage">
											<select class="form-control prov" name="rwjbxxExtInfo.fb">
												<option value="">---请选择分包信息---</option>
											</select>
										</div>
									</div>
									<div class="modal-footer text-xs-left">
										<button type="button" class="btn btn-primary btn-squared"
											id="btnSaveSh">
											<i style="display: none;" class="fa fa-refresh fa-spin fa-fw"
												aria-hidden="true"></i>提交审核
										</button>
										<button type="button" class="btn btn-primary btn-squared"
											id="btnSaveCg">保存草稿</button>
									</div>


								</form>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-3">
					<div class="panel row m-b-15 m-r-15 hidden-md-down" boxmh-h>
						<div class="panel-body">
							<p><a href="javascript:void(0);" id="aOpenTemplate">不会发布需求？来参考下</a></p>
						</div>
					</div>
					<div class="panel row m-b-15 m-r-15 hidden-md-down" boxmh-h>
						<div class="panel-body">
							<h2 class="m-l-30 font-size-18 font-weight-unset">接包明星榜单</h2>
							<ul class="nav nav-tabs nav-tabs-line m-b-0 shop-order-state"
								id="ulPhb">
								<li class='nav-item active'><a class="nav-link "
									data-toggle="tab" href data-state="0">个人</a></li>
								<li class='nav-item'><a class="nav-link" data-toggle="tab"
									href="#state1" data-state="1">企业</a></li>
							</ul>
							<ul class="list-group list-group-bordered my-mt-10 no-padding-ul" id="ulPerson">


							</ul>
							<ul class="list-group list-group-bordered my-mt-10 no-padding-ul"
								id="ulCompany" style="display: none;">


							</ul>

						</div>
					</div>
					<div class="panel row m-b-0 m-r-15 hidden-md-down" boxmh-h>
						<div class="panel-body">
							<h2 class="m-l-30 font-size-18 font-weight-unset">最新中标单</h2>
							<ul class="list-group list-group-bordered my-mt-10 no-padding-ul" id="ulNewTb">


							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
	<div class="modal fade modal-primary in" id="templateModal"
		aria-labelledby="ysqrModal" role="dialog" tabindex="-1">
		<div class="modal-dialog modal-center">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title">需求模板</h4>
				</div>
				<div class="modal-body">
					<div class="well well-sm my-padding-8" style="color: red;">需求必须按照下面的文档格式整理，否则，平台有权审核不通过，审核不通过直接影响发包人的信誉值。</div>
					<div class="collapse navbar-collapse navbar-ex1-collapse">
						<ul class="nav navbar-nav my-mt-30" id="header_navbar">

							<li class="active pull-left" style="margin-right: 20px;"><a
								href="<%=request.getContextPath()%>/template/bbl.pdf"
								target="_blank">
									<div class="text-center">
										<i class="fa fa-dashboard fa-3x" data-original-title=""
											title=""></i><br> 报表类模板
									</div>
							</a></li>
							<li class="pull-left" style="margin-right: 20px;"><a
								href="<%=request.getContextPath()%>/template/dzl.pdf"
								target="_blank">
									<div class="text-center">
										<i class="fa fa-laptop fa-3x" data-original-title="" title=""></i><br>
										定制类需求模板
									</div>
							</a></li>
							<li class="pull-left" style="margin-right: 20px;"><a
								href="<%=request.getContextPath()%>/template/qxapp-pc.pdf"
								target="_blank">
									<div class="text-center">
										<i class="fa fa-list fa-3x" data-original-title="" title=""></i><br>
										全新开发模板-PC端
									</div>
							</a></li>
							<li class="pull-left" style="margin-right: 20px;"><a
								href="<%=request.getContextPath()%>/template/qxapp-mobile.pdf"
								target="_blank">
									<div class="text-center">
										<i class="fa fa-bar-chart-o fa-3x" data-original-title=""
											title=""></i><br>全新开发模板-移动端
									</div>
							</a></li>

						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="modal fade modal-primary in" id="dateModal"
		aria-labelledby="ysqrModal" role="dialog" tabindex="-1">
		<div class="modal-dialog modal-center">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title">日期规则</h4>
				</div>
				<div class="modal-body">
					<div class="row">
						<div class="col-xs-12 gzzx-subheader">第一条 名词解释</div>
						<div class="col-xs-12 gzxx-content">
							<p>1、招标截止日期：表示需求在该日期之前，允许开发者投标，过期自动关闭需求。</p>
							<p>2、交付日期：要求开发者在这之前（包括本日）提交需求验收。</p>

						</div>
						<div class="col-xs-12 gzzx-subheader">第二条 招标截止日期要求</div>
						<div class="col-xs-12 gzxx-content">
							<p>1、针对需求类型，预算费用在1200元以内的需求默认预留2个工作日的审核时间，1200元及以上需求的审核时间不超过5个工作日,预算费用在1200元以内的需求默认预留2个工作日的投标周期，1200元及以上需求的审核时间不超过3个工作日的投标周期。</p>
							<p>2、针对BUG类型，BUG类任务审核周期为1个工作日，审核后BUG责任人应在24小时内解决，遇到复杂问题或工作量大无法在24小时内解决时，责任人需要给出计划解决时间。</p>
						</div>
						<div class="col-xs-12 gzzx-subheader">第三条 交付日期约定</div>
						<div class="col-xs-12 gzxx-content">
							<p>从需求中标日期起，大于需求标准开发人天，小于两倍标准开发人天的日期区间为需求的合理交付日期区间。需求审核人员有权根据开发资源状况在合理交付日期区间内调整交付日期，对于不在合理交付日期区间内的交付时间要求，由需求方与需求审核人进行协商并达成一致，无法达成一致时，需求方可向平台进行申诉。。</p>
						</div>
						<div class="col-xs-12 gzzx-subheader">第四条 约定解释权</div>
						<div class="col-xs-12 gzxx-content">
							<p>1、该解释权归属平台所有，自发布日期开始，立即生效，无需和发包方确认。</p>
							<p>2、若任务确认紧急，请在发布任务的时候，选择紧急任务，平台审核方会和发包方确认，并收取合理的加急费用。</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade modal-primary" id="rbxx-edit-modal"
		aria-hidden="true" aria-labelledby="rbxx-modal-title" role="dialog"
		tabindex="-1">
		<div class="modal-dialog modal-center modal-md">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title" id="rbxx-modal-title">日报编辑</h4>
				</div>

			</div>
		</div>
	</div>
	<!-- End Modal -->
	<footer class="container met-footer">
		<script type="text/javascript">
			var page_type = "publishing";
			var _xmxx = "";
			var date = "${date}";
			var rwxs="${rwjbxx.rwxs}";
		</script>
		<%@ include file="/jsp/bottom.jsp"%>
		<%@ include file="/jsp/footer/footer2.jsp"%>

	</footer>
</body>
</html>