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
<link rel='stylesheet'
	href='<%=request.getContextPath()%>/statics/css/yhgl/account/account.css'>
<style>
	.myinput{
	margin-bottom:5px;
	}
</style>
<body>
	
  	<%@include file="/jsp/header.jsp"%>
<!-- <div class="page bg-pagebg1">
		<div class="container">
			<div class="page-content row"> -->
				

				<div class="member-profile met-member">
                  	<div class="container">
                  	    <div class="col-lg-3">
					   <%@include file="/jsp/kfzxx/left_menu.jsp"%>
				       </div>
						<div class="member-profile-content">
							<div class="page-content row  "> 
								<div
									class="col-xs-12 col-sm-9 met-member-safety met-member-profile" style="top:-47px;">
									<div class="media">
										<div class="media-left media-middle">
											<i class="fa fa-unlock-alt"></i>
										</div>
										<div class="media-body">
											<div class="row">
												<div class="col-xs-8 col-sm-10">
													<h4 class="media-heading">帐号密码</h4>
													用于保护帐号信息和登录安全
												</div>
												<div class="col-xs-4 col-sm-2">
													<button type="button" class="btn btn-default"
														id="fixPasswordModal">修改</button>
												</div>
											</div>
										</div>
									</div>
									<div class="media">
										<div class="media-left media-middle">
											<i class="fa fa-envelope"></i>
										</div>
										<div class="media-body">
											<div class="row">
												<div class="col-xs-8 col-sm-10">
													<h4 class="media-heading">
														邮箱绑定 <span class="text-muted">
														<c:if test="${empty kfzEmail}">
														 未绑定
							                          	</c:if>
														<c:if test="${not empty kfzEmail}">
														    已绑定
														</c:if>
														</span>
													</h4>
													邮箱绑定可以用于登录帐号，重置密码或其他安全验证
												</div>
												<div class="col-xs-4 col-sm-2">
													<button type="button" class="btn btn-default emailadd"
														id="bindEmailModal">
														<c:if test="${empty kfzEmail}">绑定
							                          	</c:if>
														<c:if test="${not empty kfzEmail}">修改
														</c:if>
														</button>
												</div>
											</div>
										</div>
									</div>
									<div class="media">
										<div class="media-left media-middle">
											<i class="fa fa-mobile"></i>
										</div>
										<div class="media-body">
											<div class="row">
												<div class="col-xs-8 col-sm-10">
													<h4 class="media-heading">
														手机绑定 <span class="text-muted">
														<c:if test="${empty sjh}">
														 未绑定
							                          	</c:if>
														<c:if test="${not empty sjh}">
														    已绑定
														</c:if>
														</span>
													</h4>
													手机绑定可以用于登录帐号，重置密码或其他安全验证
												</div>
												<div class="col-xs-4 col-sm-2">
													<button type="button" class="btn btn-default teladd"
														id="bindPhoneModal">
													    <c:if test="${empty sjh}">绑定
							                          	</c:if>
														<c:if test="${not empty sjh}">修改
														</c:if>
														</button>
												</div>
											</div>
										</div>
									</div>



									<!-- Modal    密码修改-->
									<div class="modal fade safety-modal-pass" tabindex="-1"
										role="dialog" aria-labelledby="myModalLabel"
										aria-hidden="true">
										<div class="modal-dialog modal-sm">
											<div class="modal-content">
												<form class="met-form" method="post">
													<div class="modal-header">
														<button type="button" class="close" data-dismiss="modal"
															aria-label="Close">
															<span aria-hidden="true">&times;</span>
														</button>
														<h4 class="modal-title" id="myModalLabel">密码修改</h4>
													</div>
													<div class="modal-body">
														<div class="form-group">
															<div class="input-group">
																<span class="input-group-addon"><i
																	class="fa fa-unlock-alt"></i></span> <input type="password"
																	name="oldPassword" required class="form-control"
																	placeholder="原密码" data-bv-notempty="true"
																	data-bv-notempty-message="此项不能为空">
															</div>
														</div>
														<div class="form-group">
															<div class="input-group">
																<span class="input-group-addon"><i
																	class="fa fa-unlock-alt"></i></span> <input type="password"
																	name="newPassword" required class="form-control"
																	placeholder="新密码" data-bv-notempty="true"
																	data-bv-notempty-message="此项不能为空"
																	data-bv-identical="true"
																	data-bv-identical-field="confirmPassword"
																	data-bv-identical-message="两次密码输入不一致"
																	data-bv-stringlength="true"
																	data-bv-stringlength-min="6"
																	data-bv-stringlength-max="30"
																	data-bv-stringlength-message="密码必须在6-30个字符之间">
															</div>
														</div>

														<div class="form-group">
															<div class="input-group">
																<span class="input-group-addon"><i
																	class="fa fa-unlock-alt"></i></span> <input type="password"
																	name="confirmPassword" required
																	data-password="password" class="form-control"
																	placeholder="重复密码" data-bv-identical="true"
																	data-bv-identical-field="newPassword"
																	data-bv-identical-message="两次密码输入不一致">
															</div>
														</div>
													</div>
													<div class="modal-footer">
														<button type="button" class="btn btn-primary"
															id="fixPassword">确定</button>
														<button type="button" class="btn btn-default"
															data-dismiss="modal">取消</button>
													</div>
												</form>
											</div>
										</div>
									</div>


									<!-- 邮箱绑定 -->
									<div class="modal fade safety-modal-emailadd" tabindex="-1"
										role="dialog" aria-labelledby="myEmailLabel"
										aria-hidden="true">
										<div class="modal-dialog modal-sm">
											<div class="modal-content">
												<form class="met-form" method="post"
													action="https://show.metinfo.cn/muban/M1156014/381/member/basic.php?lang=cn&a=dosafety_emailadd">
													<div class="modal-header">
														<button type="button" class="close" data-dismiss="modal"
															aria-label="Close">
															<span aria-hidden="true">&times;</span>
														</button>
														<h4 class="modal-title" id="myEmailLabel">邮箱绑定</h4>
													</div>
													
													<div class="modal-body">
														<div class="form-group">
															<input type="text" name="email" required
																class="form-control" placeholder="邮箱"
																data-bv-notempty="true"
																data-bv-notempty-message="此项不能为空" data-bv-regexp="true"
																data-bv-regexp-regexp="^(\w)+(\.\w+)*@(\w)+((\.\w+)+)$"
																data-bv-regexp-message="请输入正确的邮箱格式">
														</div>
														<div class="row login_code">
															<div class="col-xs-7">
																<div class="form-group">
																	<input type="text" name="captchaCodeEmail" required
																		class="form-control" placeholder="验证码"
																		data-bv-notempty="true"
																		data-bv-notempty-message="此项不能为空">
																</div>
															</div>
															<div class="col-xs-5">
																<button type="button" class="btn btn-success phone_code"
																	data-retxt="重发" id="btnGetEmailVerification">获取验证码</button>
															</div>
														</div>
													</div>
													
													<div class="modal-footer">
														<button type="button" class="btn btn-primary"  id="bindEmail">确定</button>
														<button type="button" class="btn btn-default"
															data-dismiss="modal">取消</button>
													</div>
												</form>
											</div>
										</div>
									</div>

									<!-- 修改手机绑定 -->
									<div class="modal fade safety-modal-teledit" tabindex="-1"
										role="dialog" aria-labelledby="myModalLabel"
										aria-hidden="true">
										<div class="modal-dialog modal-sm">
											<div class="modal-content">
												<form class="met-form" method="post"
													action="https://show.metinfo.cn/muban/M1156014/381/member/basic.php?lang=cn&a=dosafety_teledit">
													<div class="modal-header">
														<button type="button" class="close" data-dismiss="modal"
															aria-label="Close">
															<span aria-hidden="true">&times;</span>
														</button>
														<h4 class="modal-title" id="myModalLabel">手机绑定</h4>
													</div>
													<div class="modal-body">
														<div class="form-group">
															<input type="text" name="sjh" required
																class="form-control" placeholder="手机号"
																data-bv-notempty="true"
																data-bv-notempty-message="此项不能为空" data-bv-regexp="true"
																data-bv-regexp-regexp="^1[34578]\d{9}$"
																data-bv-regexp-message="请输入正确的手机号格式">
														</div>
														<div class="row login_code">
															<div class="col-xs-7">
																<div class="form-group">
																	<input type="text" name="captchaCodePhone" required
																		class="form-control" placeholder="验证码"
																		data-bv-notempty="true"
																		data-bv-notempty-message="此项不能为空">
																</div>
															</div>
															<div class="col-xs-5">
																<button type="button" class="btn btn-success phone_code"
																	data-retxt="重发" id="btnGetPhoneVerification">获取验证码</button>
															</div>
														</div>
													</div>
													<div class="modal-footer">
														<button type="button" class="btn btn-primary"
															id="bindPhone">确定</button>
														<button type="button" class="btn btn-default"
															data-dismiss="modal">取消</button>
													</div>
												</form>
											</div>
										</div>
									</div>

								</div>
							</div>
						</div>
					</div>
				</div>
		<!-- 		</div>



			</div>
		</div>
	</div> -->

	<%@include file="/jsp/footer/footer2.jsp" %>
		<script type="text/javascript">
			var page_type = "kfzAccount";
		</script>
		
	<%@ include file="/jsp/bottom.jsp"%> 
	
</body>
</html>
