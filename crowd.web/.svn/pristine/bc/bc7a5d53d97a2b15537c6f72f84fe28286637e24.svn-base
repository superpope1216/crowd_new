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
									<span>NO.${rwjbxx.rwbh}&nbsp;&nbsp;${fn:substring(rwjbxx.rwmc,0,15)}</span> 
									<c:choose>
										<c:when test="${rwjbxx.rwjd eq '1'}">
											<c:set value="tsxx-green" var="xmztDisplay"></c:set>
										</c:when>
										<c:when test="${rwjbxx.rwjd eq '2'}">
											<c:set value="tsxx-red" var="xmztDisplay"></c:set>
										</c:when>
										
										<c:when test="${(rwjbxx.rwjd eq '3') or (rwjbxx.rwjd eq '4')}">
											<c:set value="tsxx-blue" var="xmztDisplay"></c:set>
										</c:when>
										<c:otherwise>
											<c:set value="tsxx-gray" var="xmztDisplay"></c:set>
										</c:otherwise>
									</c:choose>
									<span class="tsxx ${xmztDisplay}">${rwjbxx.xmztDisplay}</span>
									<c:choose>
										<c:when test="${rwjbxx.rwlb eq '2'}">
											<c:set value="金" var="rwlbDisplay"></c:set>
											<c:set value="仅金智教育员工可投标" var="rwlbContent"></c:set>
										</c:when>
										<c:otherwise>
											<c:set value="外" var="rwlbDisplay"></c:set>
											<c:set value="仅外部开发者可投标" var="rwlbContent"></c:set>
											
										</c:otherwise>
									</c:choose>
									<span name="spanRwlb" class="tsxx tsxx-red" aria-hidden="true" data-trigger="hover" data-animation="fade" data-target="webuiPopover1" data-content="${rwlbContent}"><i class="fa fa-fire fa-spin  fa-fw"></i>${rwlbDisplay}</span>
									<c:if test="${rwjbxx.sfxsrw eq '1'}">
										<span name="spanXsrw" class="tsxx tsxx-red" aria-hidden="true" data-trigger="hover" data-animation="fade" data-target="webuiPopover1" data-content="<div style=\'white-space: nowrap;\'>新手任务仅限新手可投标<br>新手定义：在平台中标金额<=5000元</div>"><i class="fa fa-user fa-spin  fa-fw"></i>新</span>
									</c:if>
									
								</h1>

								<div class="col-md-12 info2">
									<span>交付日期:${rwjbxx.jfrq}</span><span>需求性质:${rwjbxx.rwxsDisplay}</span>
									<span>需求类型:${rwjbxx.rwlxDisplay} </span> <span>需求级别: <c:choose>
											<c:when test="${empty rwjbxx.rwnyd}">
												易
											</c:when>
											<c:otherwise>
												${rwjbxx.rwnydDisplay}
											</c:otherwise>
										</c:choose>
									</span> <span>定制级别: <c:choose>
											<c:when test="${empty rwjbxx.dzjb}">
												暂无
											</c:when>
											<c:otherwise>
												${rwjbxx.dzjbDisplay}
											</c:otherwise>
										</c:choose>
									</span>
								</div>
								<div>

									<p>
										<c:choose>
											<c:when
												test="${(empty rwjbxx.ptbzje) || (rwjbxx.ptbzje=='0')} ">
												<c:choose>
													<c:when
														test="${(not empty rwjbxx.zbje) and rwjbxx.zbje!='0'}">
														<span id="price" class="red-600" style="font-size: 32px"
															title="需求原金额为${rwjbxx.zbje}"> ${rwjbxx.zbje} </span>
													</c:when>
													<c:otherwise>
														<span id="price" class="red-600" style="font-size: 32px"
															title="需求原金额为${rwjbxx.xmysje}"> ${rwjbxx.xmysje} </span>
													</c:otherwise>
												</c:choose>
											</c:when>
											<c:otherwise>
												<c:choose>
													<c:when
														test="${(not empty rwjbxx.zbje) and rwjbxx.zbje!='0'}">
														<span id="price" class="red-600" style="font-size: 32px"
															title="需求原金额为${rwjbxx.xmysje},平台额外补助开发者${rwjbxx.ptbzje}">
															${rwjbxx.zbje+rwjbxx.ptbzje} </span>
													</c:when>
													<c:otherwise>
														<span id="price" class="red-600" style="font-size: 32px"
															title="需求原金额为${rwjbxx.xmysje},平台额外补助开发者${rwjbxx.ptbzje}">
															${rwjbxx.xmysje+rwjbxx.ptbzje} </span>
													</c:otherwise>
												</c:choose>

											</c:otherwise>
										</c:choose>
										元

										<c:choose>
											<c:when
												test="${(empty rwjbxx.ptbzje) or (rwjbxx.ptbzje=='0')}">
											</c:when>
											<c:otherwise>
												<del>￥${rwjbxx.xmysje}元</del>

											</c:otherwise>
										</c:choose>
										<a> </a>
									</p>
								</div>
							</div>
							<div class="col-md-4"
								style="text-align: right; vertical-align: middle;">
								<p>
									招标截至日期:
									<fmt:formatDate value="${rwjbxx.zbjzrq}" pattern="yyyy-MM-dd" />
								</p>
								<p>
									<a href="#divTbxx">已有${rwtbxxCount}人投标</a>
								</p>
								<c:choose>
									<c:when test="${rwjbxx.xmzt eq '1'}">

									</c:when>
								</c:choose>

								<c:choose>
									<c:when test="${(hasTb==true) and (rwjbxx.xmzt eq '3')}">
										<a href="javascript:void(0);"
											class="btn btn-lg btn-squared btn-primary margin-right-20 product-tocart" id="btnOutTb">
											<i class="fa fa-jpy"></i>退出投标
										</a>
									</c:when>
									<c:otherwise>
										<c:choose>
											<c:when test="${rwjbxx.xmzt eq '3'}">
												<a href="javascript:void(0);" id="btnOpenTb"
													class="btn btn-lg btn-squared btn-primary margin-right-20 product-tocart">
													<i class="fa fa-jpy"></i> 我要投标
												</a>
											</c:when>
											<c:when test="${(rwjbxx.xmzt eq '16')}">
												<a href="javascript:void(0);"
													class="btn btn-lg btn-squared btn-default margin-right-20 product-tocart">
													<i class="fa fa-jpy"></i> 已关闭
												</a>
											</c:when>
											<c:when test="${(rwjbxx.xmzt eq '14')}">
												<a href="javascript:void(0);"
													class="btn btn-lg btn-squared btn-default margin-right-20 product-tocart">
													<i class="fa fa-jpy"></i> 已结束
												</a>
											</c:when>
											<c:otherwise>
												<a href="javascript:void(0);"
													class="btn btn-lg btn-squared btn-default margin-right-20 product-tocart">
													<i class="fa fa-jpy"></i> 进行中
												</a>
											</c:otherwise>
										</c:choose>
									</c:otherwise>

								</c:choose>
							</div>
						</div>

						<div style="clear: both;"></div>
					</div>


					<div class="met-editor lazyload clearfix"
						style="margin-top: 3px; padding-top: 0px;">
						<div class="editorlightgallery">
							<header class="rwxx-detail-header"> 项目详情 </header>
							<div style="padding-top: 20px;">
								<div class="row">
									<div class="col-xs-4 col-sm-2 text-right">项目编号:</div>
									<div class="col-xs-8 col-sm-4 text-slh">
										<span id="spanXmbh" title="">&nbsp;</span>
									</div>
									
									<div class="col-xs-4 col-sm-2 text-right">项目名称:</div>
									<div class="col-xs-8 col-sm-4 text-slh">
										<span id="spanXmmc" title="">&nbsp;</span>
									</div>
									
									<div class="col-xs-4 col-sm-2 text-right">所属学校:</div>
									<div class="col-xs-8 col-sm-4 text-slh">
										<span id="spanSsxx" title="">&nbsp;</span>
									</div>
									
									<div class="col-xs-4 col-sm-2 text-right">业务线:</div>
									<div class="col-xs-8 col-sm-4 text-slh">
									<span title="${rwjbxx.ywxlbDisplay}">${rwjbxx.ywxlbDisplay}</span>
									</div>
									
									<div class="col-xs-4 col-sm-2 text-right">模块:</div>
									<div class="col-xs-8 col-sm-4 text-slh">
										<span id="spanMkxx" title="">&nbsp;</span>
									</div>
									
									<div class="col-xs-4 col-sm-2 text-right">需求描述:</div>
									<div class="col-xs-8 col-sm-4 text-slh">
									<span title="${rwjbxx.xmgs}">${rwjbxx.xmgs}</span>
									</div>
									
								   <div class="col-xs-4 col-sm-2 text-right">需求文档:</div>
								   <div class="col-xs-8 col-sm-4 text-slh">
								   <c:if test="${not empty rwjbxx.xqwdfjid}">
								     <span  id="download" style="color: #60BE29;cursor: pointer;" data-wid="${rwjbxx.xqwdfjid}">下载</span>
								   </c:if>
								    <c:if test="${empty rwjbxx.xqwdfjid}">
								     <span title="无">无</span>
								   </c:if>
								   </div>
								   
								</div>
							</div>
						</div>
					</div>
					<c:if
						test="${isXqf==true and (not empty xqfId) and (xqfId eq rwjbxx.xqfid)}">
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
									src="<%=request.getContextPath()%>/image/preView?wid=${xqfxx.zpfjid}"
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
								<div class="grey-600 font-size-14">信誉分：${(empty score)?"100":score}分</div>
							</div>
						</div>





					</div>
					<div class="met-news-bar" style="margin-top: 10px;">
						<div class="card m-b-0 text-center">
							<div class="recommend news-list-md">
								<h3>最新发布</h3>
								<ul class="list-group list-group-bordered my-mt-10"
									id="ulNewRwjbxx"></ul>

							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</section>


	<%@ include file="/jsp/footer/footer.jsp"%>
	<button type="button"
		class="btn btn-icon btn-primary btn-squared met-scroll-top hide">
		<i class="icon wb-chevron-up" aria-hidden="true"></i>
	</button>
	<div class="modal fade modal-primary in" id="moadl_tbxx"
		aria-labelledby="moadl_tbxx" role="dialog" tabindex="-1">
		<div class="modal-dialog modal-center">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title">我要投标</h4>
				</div>
				<div class="modal-body">
					<form id="formRbxxgl" class="form-horizontal" role="form">
						<input type="hidden" name="wid" value=""> <input
							type="hidden" name="rwid" value="${rwjbxx.wid}">
						<div class="well well-sm" style="padding: 10px;">
							如果可以提供更具竞争力的价格，可增加中标机率；如果是遵循发包预算价，则此项可不填;投标价格只能在预算价格上下范围${fdxt}%以内.
							<c:if
								test="${(not empty rwjbxx.ptbzje) && (rwjbxx.ptbzje != '0')}">
								<br>
								<span style="color: red">该需求的原价是${rwjbxx.xmysje}元，您的投标参考价格为原价。</span>
							</c:if>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">您的报价：</label>
							<div class="col-sm-2">
								<input type="text" class="form-control" name="tbje"
									value="${rwjbxx.xmysje}" placeholder="投标价格只能在预算价格上下范围30%以内"
									required data-fv-notempty-message="此项不能为空"
									pattern="^\+?[1-9]\d*$" data-fv-regexp-message="请输入正确的正整数类型数字"
									data-fv-stringlength="true" data-fv-stringlength-min="1"
									data-fv-stringlength-max="6">
							</div>

							<div class="col-sm-8">

								<p class="form-control-static">
									<c:if
										test="${(not empty rwjbxx.ptbzje) && (rwjbxx.ptbzje != '0')}">
										<span>+平台补助:<span name="spanPtbzje">${rwjbxx.ptbzje}</span>=我的收入
										</span>
										<span class="red-600 control-label" style="font-size: 32px;"
											name="spanAllje">${rwjbxx.xmysje+rwjbxx.ptbzje}</span>元
									</c:if>
								</p>


							</div>
						</div>
						<div class=" form-group">
							<label class="col-sm-2 control-label">您的优势：</label>
							<div class="col-sm-10">
								<textarea rows="3" class="form-control" name="tbcs"></textarea>
							</div>
						</div>
					</form>
				</div>

				<div class="modal-footer text-xs-left">
					<button type="button" class="btn btn-primary btn-squared"
						id="btnSaveTbxx">保存</button>
					<button type="button" class="btn btn-default btn-squared"
						data-dismiss="modal">取消</button>
				</div>


			</div>
		</div>
	</div>
	<script>
		var jsonurl = "";
		var rwid = "${rwid}";
	</script>

	<%@ include file="/jsp/bottom.jsp"%>


	<script
		src="<%=request.getContextPath()%>/statics/pagejs/center/rwxxDetail.js"></script>
</body>
</html>
