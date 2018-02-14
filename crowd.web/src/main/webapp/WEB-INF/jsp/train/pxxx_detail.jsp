<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html class="  ">
<%@ include file="/jsp/top/top.jsp"%>
<%@ include file="/jsp/param.jsp"%>
<link rel='stylesheet'
	href='<%=request.getContextPath()%>/statics/css/rwgl/rwxxDetail.css'>
<link rel='stylesheet'
	href='<%=request.getContextPath()%>/statics/css/card.css'>
</head>
<body>
	<!--[if lte IE 8]>
<div class="text-center padding-top-50 padding-bottom-50 bg-blue-grey-100">
  <p class="browserupgrade font-size-18">
	你正在使用一个<strong>过时</strong>的浏览器。请<a href="http://browsehappy.com/" target="_blank">升级您的浏览器</a>，以提高您的体验。
  </p>
</div>
<![endif]-->
	<header>
		<%@include file="/jsp/header.jsp"%>
	</header>
<%-- 	<div class="met-position  pattern-show">
		<div class="container">
			<div class="row">
				<ol class="breadcrumb">
					<li><a href="<%=request.getContextPath()%>/center/index"
						title="众包大厅"> <i class="icon wb-home" aria-hidden="true"></i>众包大厅
					</a></li>
					<li class="dropdown"><a href="../product/" title="全部产品栏目"
						class="dropdown-toggle" data-toggle="dropdown"
						aria-expanded="false">开发专区<i class="caret"></i></a>
						<ul class="dropdown-menu ">

							<li><a href="../product/product.php?lang=cn&amp;class2=119"
								title="开发专区">开发专区</a></li>

							<li><a href="../product/product.php?lang=cn&amp;class2=120"
								title="实施专区">实施专区</a></li>
						</ul></li>

					<li><a href="javascript:void(0);" title="人事">人事</a></li>
				</ol>
			</div>
		</div>
	</div> --%>
	<section class="met-shownews animsition">
		<div class="container">
			<div class="col-md-9 met-shownews-body">
				<div class="row">
					<div class="met-shownews-header">
						<div class="col-md-12 info "
							style="padding-bottom: 0px; border-bottom: 0px; margin-bottom: 0px;">
							<div class="col-md-8 color-333">
								<h1>
									<span>NO.${pxxx.pxrwbh}&nbsp;&nbsp;${pxxx.pxkcDisplay}</span> <span
										class="label label-success"
										style="font-size: 13px; vertical-align: middle; color: #fff">${pxxx.bmztDisplay}</span>
								</h1>

								<div class="col-md-12 info2">
									<span>培训规模:${pxxx.pxrsDisplay}</span><span>培训类型:${pxxx.pxlxDisplay}</span>
									<span>培训方式:${pxxx.sfwxspxDisplay} </span> <span>培训周期: ${pxxx.pxzq}
									</span>
								</div>
								<div class="col-md-12 info2">
									<span>培训地点:${pxxx.pxdd}</span>
								</div>
							</div>
							<div class="col-md-4"
								style="text-align: right; vertical-align: middle;">
								<p>
									<span id="spanBmjzrq">报名截至日期:&nbsp;</span>
								</p>
								<p>
									<a href="#divTbxx">已有${pxxx.bmCount}人报名</a>
								</p>
								<c:choose>
									<c:when test="${hasBm==true}">
										<a href="javascript:void(0);"
											class="btn btn-lg btn-squared btn-default margin-right-20 product-tocart">
											<i class="fa fa-cart-plus"></i>已报名
										</a>
									</c:when>
									<c:otherwise>
										<c:choose>
											<c:when test="${pxxx.bmzt eq '1'}">
												<a href="javascript:void(0);" id="btnOpenTb"
													class="btn btn-lg btn-squared btn-primary margin-right-20 product-tocart">
													<i class="fa fa-cart-plus"></i> 我要报名
												</a>
											</c:when>
											<c:when test="${(pxxx.bmzt eq '2')}">
												<a href="javascript:void(0);"
													class="btn btn-lg btn-squared btn-default margin-right-20 product-tocart">
													<i class="fa fa-cart-plus"></i> 已结束
												</a>
											</c:when>
											<c:when test="${(pxxx.bmzt eq '0')}">
												<a href="javascript:void(0);"
													class="btn btn-lg btn-squared btn-default margin-right-20 product-tocart">
													<i class="fa fa-cart-plus"></i> 待开启
												</a>
											</c:when>
										</c:choose>
									</c:otherwise>

								</c:choose>
							</div>
						</div>

						<div style="clear: both;"></div>
					</div>

						
					<div class="met-editor lazyload clearfix"
						style="margin-top: 3px; padding-top: 0px;" style="divTrainPlan">
						<div class="editorlightgallery">
							<header class="rwxx-detail-header">培训安排</header>
							<div style="padding-top: 20px;">
								<div class="row">
									<div class="col-xs-4 col-sm-2 text-right">报名开始时间:</div>
									<div class="col-xs-8 col-sm-4">
										<span id="spanBmkssj">&nbsp;</span>
									</div>
									<div class="col-xs-4 col-sm-2 text-right">报名结束时间:</div>
									<div class="col-xs-8 col-sm-4">
										<span id="spanBmjssj">&nbsp;</span>
									</div>
									<div class="col-xs-4 col-sm-2 text-right">培训开始时间:</div>
									<div class="col-xs-8 col-sm-4"><span id="spanPxkssj">&nbsp;</span></div>
									<div class="col-xs-4 col-sm-2 text-right">培训结束时间:</div>
									<div class="col-xs-8 col-sm-4">
										<span id="spanPxjssj">&nbsp;</span>
									</div>
									<div class="col-xs-4 col-sm-2 text-right">培训描述:</div>
									<div class="col-xs-8 col-sm-10"><span id="spanPxms">&nbsp;</span></div>
								</div>
							</div>
						</div>
					</div>
					<c:if test="${isXqf==true and (not empty xqfId) and (xqfId eq pxxx.sqr)}">
						<div class="met-editor lazyload clearfix" >
							<div class="editorlightgallery">
								<header class="rwxx-detail-header"> 报名列表 </header>
								<div class="rwxx-detail-tbxx">
									<div class="rwxx-dtail-tbxx-content" id="divTbxxList"></div>

								</div>
							</div>
						</div>
					</c:if>
					<!-- <div class="met-shownews-footer">

						<ul class="pager pager-round">
							<li class="previous "><a
								href="shownews.php?lang=cn&amp;id=49"
								title="DONGTIAN品牌首次亮相连卡佛 新品彩妆闪耀上市"> 上一篇 <span
									aria-hidden="true" class="hidden-xs">：DONGTIAN品牌首次亮相连卡佛
										新品彩妆闪耀上市</span>
							</a></li>
							<li class="next "><a href="shownews.php?lang=cn&amp;id=53"
								title="本色肌肤 晶采生活 urara悠莱晶采双瓶全新上市"> 下一篇 <span
									aria-hidden="true" class="hidden-xs">：本色肌肤 晶采生活
										urara悠莱晶采双瓶全新上市</span>
							</a></li>
						</ul>
					</div>
					 -->
				</div>
			</div>
			<div class="col-md-3">
				<div class="row">

					<div class="met-news-bar">
						<div class="card m-b-0" style="text-align: center;">
							<div
								class="card-header  text-xs-center p-30 p-b-15 xqf_header_bg"
								style="text-align: center;">
								<a class="avatar avatar-100 img-bordered m-b-10 bg-white"
									target="_blank" href="javascript:void(0);" title="mycluster">
									<img
									src="<%=request.getContextPath()%>/statics/images/12.png?1509528657049"
									alt="mycluster">
								</a>
								<div class="font-size-20 ">
									<c:choose>
										<c:when test="${empty xqfxx.nc}">
										${xqfxx.xm}
									</c:when>
										<c:otherwise>
										${xqfxx.nc}
									</c:otherwise>
									</c:choose>
								</div>
								<div class="grey-600 font-size-14">需求方</div>
<%-- 								<div class="grey-600 font-size-14">信誉分：${score}分</div> --%>
							</div>
						</div>





					</div>
<!-- 					<div class="met-news-bar" style="margin-top: 10px;">
						<div class="card m-b-0 text-center">
							<div class="recommend news-list-md">
								<h3>最新发布</h3>
								<ul class="list-group list-group-bordered my-mt-10"
									id="ulNewRwjbxx"></ul>

							</div>
						</div>
					</div> -->

				</div>
			</div>
		</div>
	</section>


	<%@ include file="/jsp/footer/footer.jsp"%>
	<button type="button"
		class="btn btn-icon btn-primary btn-squared met-scroll-top hide">
		<i class="icon wb-chevron-up" aria-hidden="true"></i>
	</button>

	<div class="modal fade modal-primary trans" id="train-enroll-modal"
		aria-hidden="true" aria-labelledby="rbxx-modal-title" role="dialog"
		tabindex="-1">
		<div class="modal-dialog modal-center modal-md">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title" id="rbxx-modal-title">培训报名</h4>
				</div>
				<form id="formTrainEnrol" class="addr-edit-form met-form-validation">
					<input name="wid" type="hidden" id="wid">
					<div class="modal-body">
						<div class="form-group col-md-12">
							<label class="col-sm-2 control-label" style="font-size: 14px;">姓名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" name="xm"
									placeholder="请输入姓名" data-bv-notempty="true"
									data-bv-notempty-message="此项不能为空">
							</div>
						</div>
						
						<div class="form-group col-md-12">
							<label class="col-sm-2 control-label" style="font-size: 14px;">手机</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" name="sj"
									placeholder="请输入手机号" data-bv-notempty="true"
									data-bv-notempty-message="此项不能为空">
							</div>
						</div>

						<div class="form-group col-md-12">
							<label class="col-sm-2 control-label" style="font-size: 14px;">QQ</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" name="qq"
									placeholder="请输入QQ号" data-bv-notempty="true"
									data-bv-notempty-message="此项不能为空">
							</div>
						</div>
						
						<div class="form-group col-md-12">
							<label class="col-sm-2 control-label" style="font-size: 14px;">从业年份</label>
							<div class="col-sm-10">
								<input type="text" class="form-control datepicker" name="cynf"
									placeholder="请输入日期" data-bv-date="true"
									data-bv-date-format="YYYY-MM-DD"
									data-bv-date-message="请输入正确的日期格式"
									data-bv-notempty="true" data-bv-notempty-message="此项不能为空">
							</div>
						</div>
						
						<div class="form-group col-md-12">
							<label class="col-sm-2 control-label" style="font-size: 14px;">服务学校</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" name="fwxx"
									placeholder="请输入学校名称" data-bv-notempty="true"
									data-bv-notempty-message="此项不能为空">
							</div>
						</div>
						
						<div class="form-group col-md-12">
							<label class="col-sm-2 control-label" style="font-size: 14px;">擅长技术</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" name="scjs"
									placeholder="请输入擅长技术，逗号隔开" data-bv-notempty="true"
									data-bv-notempty-message="此项不能为空">
							</div>
						</div>

					</div>
					<div class="modal-footer text-xs-left">
						<button type="button" class="my-btn" id="btnSave">保存</button>
						<button type="button" class="my-btn-default" data-dismiss="modal">取消</button>
					</div>
				</form>
			</div>
		</div>
	</div>

	<script>
		var jsonurl = "";
		var pxid = "${pxid}";
		var page_type = "pxxxDetail";
		var date="${date}";
		var ldate="${ldate}";
	</script>
 
	<%@ include file="/jsp/bottom.jsp"%>
      

<%-- 	<script
		src="<%=request.getContextPath()%>/statics/pagejs/train/pxxxDetail.js"></script> --%>
</body>
</html>
