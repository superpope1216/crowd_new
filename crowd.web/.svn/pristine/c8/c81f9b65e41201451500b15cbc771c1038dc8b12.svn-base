<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<link rel='stylesheet'
	href='<%=request.getContextPath()%>/statics/css/yhgl/login.css'>
	
<%@ include file="/jsp/top/top.jsp"%>
<%@ include file="/jsp/top/other.jsp"%>
<%@ include file="/jsp/param.jsp"%>

<link rel='stylesheet'
	href='<%=request.getContextPath()%>/statics/css/advert.css'>

<style>

.blocks, [class*=blocks-] {
  font-size: 80%;
}

#regTop ul {
    margin-left: 16%;
}

@media (min-width:768px) {
    #regTop {
     float:none;
    }
}

@media (max-width:500px) {
    #regTop {
      margin-bottom:100px;
      float:none;
    }
    #regTop ul li{
     text-align:left;
    }
    #regTop ul {
     margin-left:10%;
  }
  .login_code_img{
     font-size
  }
}
   
</style>
<body>
	<%@include file="/jsp/header_not_login.jsp"%>

	<div class="register_index met-member">
		<div class="container">
		    <!-- 头部标签 -->
			<div id="regTop" class="col-xs-6">
		       <ul>
		    		<li class="now"><span>1</span>注册账号</li>
		    		<li><span>2</span>完善基本信息</li>
		    		<li><span>3</span>完善简历信息</li>
		    		<li><span>4</span>完善身份认证</li>
		       </ul>
		    </div>
			<!-- 注册 -->
			<form  id="userRegister" class="form-register met-form" method="post" action="" style="display:block;">
				<div class="form-group">
					<h3 style="text-align: center">用户注册</h3>
				</div>

				<div class="form-group">
					<div class="input-group">
						<span class="input-group-addon"><i class="fa fa-user"></i></span>
						<input type="text" name="sjh" required class="form-control"
							placeholder="手机号" data-bv-remote="false" data-bv-remote-url=""
							data-bv-remote-message="手机号已存在" data-bv-notempty="true"
							data-bv-notempty-message="此项不能为空" data-bv-regexp="true" 
			     data-bv-regexp-regexp="^1[34578]\d{9}$" 
			     data-bv-regexp-message="请输入正确的手机号格式"/>

					</div>
				</div>


				<div class="form-group">
					<div class="input-group">
						<span class="input-group-addon"><i class="fa fa-unlock-alt"></i></span>
						<input type="password" name="yhmm" required class="form-control"
							placeholder="密码" data-bv-notempty="true"
							data-bv-notempty-message="此项不能为空" data-bv-identical="true"
							data-bv-identical-field="confirmYhmm"
							data-bv-identical-message="两次密码输入不一致" data-bv-stringlength="true"
							data-bv-stringlength-min="6" data-bv-stringlength-max="30"
							data-bv-stringlength-message="密码必须在6-30个字符之间">
					</div>
				</div>

				<div class="form-group">
					<div class="input-group">
						<span class="input-group-addon"><i class="fa fa-unlock-alt"></i></span>
						<input type="password" name="confirmYhmm" required
							data-password="password" class="form-control" placeholder="重复密码"
							data-bv-identical="true" data-bv-identical-field="yhmm"
							data-bv-identical-message="两次密码输入不一致"
							data-bv-notempty-message="此项不能为空">

					</div>
				</div>

				<div class="row login_code">
					<div class="col-xs-8">
						<div class="form-group">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-shield"></i></span>
								<input type="text" value="" name="yzm" required
									class="form-control" placeholder="验证码" data-bv-notempty="true"
									data-bv-notempty-message="此项不能为空">
							</div>
						</div>
					</div>
					<div class="col-xs-4 login_code_img">

						<input type="button" value="点击获取验证码" name="code"
							class="form-control" id="btnGetVerification"  style="cursor:pointer;">
					</div>
				</div>
				<button class="btn btn-lg btn-primary btn-block" type="button"
					id="btnRegister">立即注册</button>
				<div class="login_link">
					<a href="<%=request.getContextPath()%>/login/index">已有账号？</a>
				</div>
			</form>
			
			<!-- 完善个人资料 -->
		     <div class="page-content row" style="margin-bottom: 30px;display:none;"  id="perfectData" >
				<div class="col-lg-9 crowd-col-center">

					<div class="panel m-b-0 " boxmh-mh >
						<div class="panel-body shop-order">
						   <ul
								class="shop-discount-list blocks-100 blocks-sm-2 blocks-xl-3 m-t-20 met-member-index"
								data-scale="1" data-size="&amp;x=400&amp;y=400" id="ulBasicInfo">
								<form class="form-horizontal" role="form" id="formBasicInfo" style="max-width: 100%;">
									<%@include file="/jsp/kfzxx/first/registerBasic.jsp"%>
									<div class="row" style="border-bottom: none;">
										<div class="col-xs-3 "></div>
										<div class="col-xs-9">
											<button class="btn btn-primary mybtn" type="button" id="btnBasicNext">保存并继续</button>
										</div>
									</div>
								</form>
							</ul>
							<ul
								class="shop-discount-list blocks-100 blocks-sm-2 blocks-xl-3 m-t-20"
								data-scale="1" data-size="&amp;x=400&amp;y=400"
								style="display: none;" id="ulResumeInfo">
								<form class="form-horizontal" role="form" id="formResumeInfo" style="max-width: 100%;">
									<%@include file="/jsp/kfzxx/first/registerResume.jsp"%>
									<div class="row" style="border-bottom: none;">
										<div class="col-xs-3 "></div>
										<div class="col-xs-9">
											<button class="btn btn-primary mybtn" type="button" id="btnBasicPre">上一步</button>
											<button class="btn btn-primary mybtn" type="button" style="margin-left:20px;" id="btnResumeNext">保存并继续</button>
										</div>
									</div>
								</form>
							</ul>
							<ul
								class="shop-discount-list blocks-100 blocks-sm-2 blocks-xl-3 m-t-20"
								data-scale="1" data-size="&amp;x=400&amp;y=400"
								style="display: none;" id="ulCardInfo">
								<form class="form-horizontal" role="form" id="formCardInfo" style="max-width: 100%;">
									<%@include file="/jsp/kfzxx/first/registerEnterpriseCard.jsp"%>
									<div class="row" style="border-bottom: none;">
										<div class="col-xs-3 "></div>
										<div class="col-xs-9">
											<button class="btn btn-primary mybtn" type="button" id="btnResumePre">上一步</button>
											<button class="btn btn-primary mybtn" type="button" style="margin-left:20px;" id="saveKfzxxInfo">提交审核</button>
										</div>
									</div>
								</form>
							</ul>
						
						
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</div>
	
	<footer class="container met-footer">
		<script type="text/javascript">
			var page_type = "developerEnterprise";
		</script>
		<%@ include file="/jsp/bottom.jsp"%>
		<%@ include file="/jsp/footer/footer_bq.jsp"%>

	</footer>
	<%@ include file="/jsp/bottom.jsp"%>

</body>
</html>