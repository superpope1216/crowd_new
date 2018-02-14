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

					<%@include file="/jsp/gzzx/left_menu_czsc.jsp"%>
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
								<div class="col-xs-12 gzzx-header">平台须知</div>
								<div class="col-xs-12 gzzx-subheader">第一种方式 注册为开发方</div>
								<div class="col-xs-12 gzxx-content">
									<p>1、打开crowd系统 进入首页或登录页面   都有注册入口   点击注册。</p>
									<p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/zcrk01.png" class="col-xs-12"/>
									</p>
									<p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/zcrk02.png" class="col-xs-12"/>
									</p>
									<p>2、进入注册画面,可以查看智慧校园云工场平台服务协议,点击同意协议,否则会进入首页</p>
									<p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register01.png" class="col-xs-12"/>
									
									<p>3、然后选择注册为身份为 开发方</p>
									<p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register_kfz01.png" class="col-xs-12"/>
									
									<p>4、选择开发方注册的用户类型(个人或者企业  选择后对应的身份认证页面不同) 点击注册</p>
									<p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register_userType.png" class="col-xs-12"/>
									
									<p>5、填写手机号 ,密码,确认密码,输入手机接收到的验证码  点击立即注册</p>
									<p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register02.png" class="col-xs-12"/>
									
									<p>6、注册成功之后进入完善基本信息,填写必填的选项(上传头像,昵称,常住省,QQ,支付宝账号,邮箱,是否接受任务推荐)</p>
									<p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register_kfz_basic01.png" class="col-xs-12"/>
									<p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register_kfz_basic02.png" class="col-xs-12"/>
									<p>如果选择接受接受任务推荐  用户可以选择推荐的任务形式,如果选择开发性质的任务形式,用户接下来还可以选择推荐的技能平台(支持多选),信息填写完毕后  点击保存并继续按钮</p>
									<p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register_kfz_basic03.png" class="col-xs-12"/>
									<p>7、进入完善简历信息,填写必填的选项(工作年限,工作现状),点击保存并继续按钮 。 还可以点击上一步 查看和修改上一步的信息</p>
									<p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register_kfz_resume01.png" class="col-xs-12"/>
									<p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register_kfz_resume02.png" class="col-xs-12"/>
									
									<p>8、进入完善身份认证  这里以个人身份认证为例,填写必填项,身份证正反面附件按照参考案例上传,点击提交审核,信息提交完成后,系统会自动进入个人基本信息页面</p>
                                    <p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register_kfz_card01.png" class="col-xs-12"/>
                                    <p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register_kfz_card02.png" class="col-xs-12"/>
                                    
								</div>
								<div class="col-xs-12 gzzx-subheader">第二种方式  成为开发方</div>
								<div class="col-xs-12 gzxx-content">
									<p>1、用户如果以需求方身份注册,可以通过其它入口成为开发方</p>
									<p>2、点击首页的开发方中心,点击自由职业之路,如果你不是开发方  系统会提示并跳转成为开发方页面</p>
								    <p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/become_kfz01.png" class="col-xs-12"/>
									<p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/become_kfz02.png" class="col-xs-12"/>
									
									<p>3、用户还可以  首页页面  点击我想投标,如果你不是开发方  系统会提示并跳转成为开发方页面</p>
									<p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/become_kfz03.png" class="col-xs-12"/>
									<p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/become_kfz02.png" class="col-xs-12"/>
									
									
								<div class="col-xs-12 gzzx-subheader">如何成为企业用户</div>
								<div class="col-xs-12 gzxx-content">
									<p>智慧校园云工场企业用户，必须是一个真实的企业实体，通过在线申请注册并由运营方进行线下认证（提交下述资料并通过审核）后，可成为企业用户：
									</p>
									<p class="col-xs-12 gzzx-subheader">第一种方式   用户注册时  选择用户类型为企业  点击注册即可  </p>
									<p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/enterprise01.png" class="col-xs-12"/>
									<p>在完善身份认证   填写必填项(企业法人名称,法定代表人姓名,法定代表人身份证号,营业执照号,组织机构代码等),如实上传法人身份证正反面扫描件
									营业执照扫描件  企业资质可以选择三证或三证合一的方式,会填写不同的必选项,真实填写企业资质信息,上传清晰可见的扫描件,提交即可,等待审核人员审核</p>
								 <p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register_enterprise01.png" class="col-xs-12"/>
							     <p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register_enterprise02.png" class="col-xs-12"/>
								 <p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register_enterprise03.png" class="col-xs-12"/>
								 <p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register_enterprise04.png" class="col-xs-12"/>
								
								    <p class="col-xs-12 gzzx-subheader">第二种方式   登录系统修改企业认证信息</p>
								    <p>用户登录之后  进入首页   切换页面头部个人信息 进入基本信息页面  </p>
								     <p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/enterprise_modify_auth01.png" class="col-xs-12"/>
								     <p>用户登录之后  进入个人信息页面  如果自己身份认证信息没提交或者  没有审核通过 可以修改 企业认证消息</p>
								     <p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/enterprise_modify_auth02.png" class="col-xs-12"/>
								    
								</div>
								<div class="col-xs-12 gzzx-subheader">如何成为个人用户</div>
								<div class="col-xs-12 gzxx-content">
									<p>在遵守国家法律法规和平台所有规则的前提下，符合下列条件的自然人可以通过“平台的注册要求“完成相应的注册步骤并通过审核成为平台的个人用户：
									</p>
									<p>1、年满十八周岁，并具有民事权利能力和民事行为能力的自然人。</p>
									<p>2、无民事行为能力人或限制民事行为能力人应经过其监护人的同意。</p>
									<p>3、用户需要对平台提供明确的联系方式，并提供真实姓名（这是支付有保障的前提）；在交易的过程中可以使用昵称，平台将充分保护用户的隐私权。
									</p>
								</div>
								<div class="col-xs-12 gzxx-content">
									<p class="col-xs-12 gzzx-subheader">第一种方式   用户注册时  选择用户类型为个人  点击注册即可  </p>
									<p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/person01.png" class="col-xs-12"/>
									<p>在完善身份认证   填写必填项(真实姓名,身份证号),如实上传个人身份证正反面扫描件提交即可,等待审核人员审核</p>
								   <p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register_kfz_card01.png" class="col-xs-12"/>
							   	   <p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/register_kfz_card02.png" class="col-xs-12"/>
							   
								    <p class="col-xs-12 gzzx-subheader">第二种方式   登录系统修改个人认证信息</p>
								    <p>用户登录之后  进入首页   切换页面头部个人信息 进入基本信息页面  </p>
								     <p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/enterprise_modify_auth01.png" class="col-xs-12"/>
								     <p>用户登录之后  进入个人信息页面  如果自己身份认证信息没提交或者  没有审核通过 可以修改 个人认证消息</p>
								     <p><img src="<%=request.getContextPath()%>/statics/images/operation/yhgl/person_modify_autho1.png" class="col-xs-12"/>
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

