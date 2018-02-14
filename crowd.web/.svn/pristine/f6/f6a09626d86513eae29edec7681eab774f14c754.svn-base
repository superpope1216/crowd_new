<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<%@ include file="/jsp/top/top.jsp"%>
<%@ include file="/jsp/top/other.jsp"%>
<%@ include file="/jsp/param.jsp"%>
<link rel='stylesheet'
	href='<%=request.getContextPath()%>/statics/css/order.css'>
	<style>
		.my-score span{
			text-indent:0em;
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
	<%@include file="/jsp/header.jsp"%>

	<div class="page bg-pagebg1">
		<div class="container">
			<div class="page-content row text-xs-center">
				<div class="col-lg-9 ">
					<div class="panel m-b-0" boxmh-mh>
						<div class="panel-body  shop-order">
							<div class="row">
								<div class="col-xs-12 gzzx-header">信誉值管理须知</div>
								<div class="col-xs-12 gzzx-subheader">第一条 概述</div>
								<div class="col-xs-12 gzxx-content">
									<p>信誉值是双方在平台上交易的过程中，对双方的信誉做出的一个约束数据，在平台中，需求方/开发者分别有对应的信誉值，满分为100分，双方的信誉值互不影响。</p>
								</div>
								<div class="col-xs-12 gzzx-subheader">第二条 开发者信誉值得分规则</div>
								<div class="col-xs-12 gzxx-content">
									<p>1、需求首次验收通过+1分。（需求验收不通过后再次验收通过不得分）</p>
									<p>2、需求首次售后通过+1分。（需求售后不通过后再次售后通过不得分）</p>
									<p>3、5星评价+2分，3-4星评价+0分</p>
									<p>4、最高分为100分，当得分超过100分，平台只记录最高分100分，其余将会被忽略。</p>
									
								</div>
								<div class="col-xs-12 gzzx-subheader">第三条 开发者信誉值扣分规则</div>
								<div class="col-xs-12 gzxx-content">
									<p>1、发生一个BUG并且该BUG已验收或者售后结果，则被认定为BUG有效，开发者-5分。</p>
									<p>2、需求延期一天-3分，2天-6分，一次类推。</p>
									<p>3、同一需求，第一次验收不通过-2分，第二次-5分，第三次扣-5，以此类推。</p>
									<p>4、0-2星评价-5分。</p>
									<p>5、被对方投诉，并且经平台确认投诉为真实有效，则-10分。</p>
									<p>6、信誉值低于50分，平台将冻结该开发者账户，禁止该开发者再次投标</p>
								</div>
								<div class="col-xs-12 gzzx-subheader">第四条 需求方信誉值得分规则</div>
								<div class="col-xs-12 gzxx-content">
									<p>1、需求审核通过一次+1分。（同一需求只记录一次得分）</p>
									<p>2、手工验收需求+1分（同一需求验收多次，只记录一次得分）</p>
									<p>3、5星评价+2分，3-4分+0分。</p>
									<p>4、最高分为100分，当得分超过100分，平台只记录最高分100分，其余将会被忽略。</p>
								</div>
								<div class="col-xs-12 gzzx-subheader">第五条 需求方信誉值扣分规则</div>
								<div class="col-xs-12 gzxx-content">
									<div>
										<p>1、需求审核不通过一次-5分。（多次可重复扣分，不通过原因为需求方未遵守平台约定要求）。
										</p>
										<p>2、  需求自动验收1次-5分。
										</p>
										<p>3、0-2星评价-5分。
										</p>
										<p>4、被对方投诉，并且经平台确认投诉为真实有效，则-10分。</p>
										<p>5、信誉值低于50分，平台将冻结该需求方账户，禁止该需求方发布需求</p>
									</div>
								</div>
								
								<div class="col-xs-12 gzzx-subheader">第六条 信誉值和星标得分对应关系</div>
								<div class="col-xs-12 gzxx-content">
									<div>
										<p class="my-score">1、信誉值(&lt;=30分)获得：<span style="display: inline-block;"><i	class="fa fa-star my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star-o my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star-o my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star-o my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star-o my-score-color"></i></span>
										</p>
										<p class="my-score">2、信誉值(&lt;=50分)获得：<span style="display: inline-block;"><i	class="fa fa-star my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star-o my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star-o my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star-o my-score-color"></i></span>
										</p>
										<p class="my-score">3、信誉值(&lt;=70分)获得：<span style="display: inline-block;"><i	class="fa fa-star my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star-o my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star-o my-score-color"></i></span>
										</p>
										<p class="my-score">4、信誉值(&lt;=90分)获得：<span style="display: inline-block;"><i	class="fa fa-star my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star-o my-score-color"></i></span>
										</p>
										<p class="my-score">5、信誉值(&lt;=100分)获得：<span style="display: inline-block;"><i	class="fa fa-star my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star my-score-color"></i></span>
										<span style="display: inline-block;"><i	class="fa fa-star my-score-color"></i></span>
										</p>
									</div>
								</div>
								<div class="col-xs-12 gzzx-subheader">第七条 本规则自指定之日起施行</div>
								
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