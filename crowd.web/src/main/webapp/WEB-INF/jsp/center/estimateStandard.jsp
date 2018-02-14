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

 .btn-success{
   border-color:#335EE9;
   background-color:#335EE9;
   border-radius: 4px;
} 

.btn-success.focus, .btn-success:focus, .btn-success:hover {
    border-color:#335EE9!important;
	background-color: #335EE9!important;
}

.btn-primary{
    color: #fff;
    border-color: #335EE9;
    background-color: #335EE9;
    border-radius: 4px;
}

.trans{
  transform: translate3d(0px, 0px, 0px);
}

.met-muban-paralist.in dl {
	opacity: 1;
	-moz-opacity: 1;
	filter: alpha(opacity = 100);
}

.met-muban-paralist .container {
	padding-right: 14px;
	padding-left: 0px !important;
}

.met-muban-paralist>div {
	padding-bottom: 0px;
}

@media ( max-width : 991px) {
	.met-muban-paralist>div {
		padding-bottom: 10px;
	}
}

@media ( max-width : 767px) {
	.met-muban-paralist>div {
		padding-bottom: 5px;
	}
}

.met-muban-paralist dl {
	overflow: hidden;
	margin-bottom: 0px;
	margin-top: 10px;
	color: #2a333c;
	transition: all 0.5s;
	-moz-transition: all 0.5s;
	-webkit-transition: all 0.5s;
	-o-transition: all 0.5s;
	filter: alpha(opacity = 0);
}

.met-muban-paralist dl dt {
	font-weight: 300;
}

.met-muban-paralist dl dd a.link {
	color: #5e7387;
}

.met-muban-paralist dl dd a.link:hover {
	color: #4e97d9;
}

@media ( min-width : 768px) {
	 .met-muban-paralist dl dt {
		width: 100px;
		float: left;
		padding: 7px 0px;
		text-align: left;
	}
	.met-muban-paralist dl dd {
		margin-left: 100px;
	}
}
    
   dt{
      margin-left:42px;
    }
    
    
 @media (max-width : 500px) {
   dt{
      margin-left:0;
    }
    #paralist{
      padding-top: 0;
      padding-bottom: 0;
    }
}

  
  #paralist{
    padding-top: 20px;
    padding-bottom: 20px;
  }
  
  

.met-muban-paralist dl .res-tips {
	top: 5px;
}

</style>

<body>
	<%@include file="/jsp/header.jsp"%>

	<div class="page bg-pagebg1">
		<div class="container">
			<div class="page-content row">
				<%-- <div class="col-lg-3">
					<%@include file="/jsp/kfzxx/left_menu.jsp"%>
				</div>
                 --%>
         	<div class="col-lg-12">
					<div class="panel m-b-0 met-muban-paralist" boxmh-mh>
				<dl id="paralist">
					<dt >
						<i class="fa fa-list" data-original-title="" title=""
							style="margin-right: 10px" id="btnQueryShow"></i>按业务域
					</dt>
					<dd>

						<a class="btn ${(empty ywxselect)?'queryActive':''} link"
							href="javascript:void(0);" title="全部" data-key=""
							data-option="ywx">全部</a>
						<c:forEach items="${ywx}" var="data">
							<a
								class="btn link ${((not empty ywxselect) and (ywxselect eq data.lbdm))?'queryActive':''}"
								href="javascript:void(0);" data-option="ywx"
								title="${data.lbmc}" data-key="${data.lbdm}">${data.lbmc}</a>
						</c:forEach>
					</dd>
				 </dl>
			</div>
			</div>

				<div class="col-lg-12">
					<div class="panel m-b-0" boxmh-mh>
						<div class="panel-body shop-order">
							<div>
							<!-- <button type="button"
									class="my-btn" id="btnAddRbxx" >新建</button> -->
								<div class="cart-list animation-fade" data-scale="1">
									<div class="table-responsive">
										<table class="table table-hover table-striped">
											<thead>
												<tr class="trans">
													<th class="text-xs-left">选项</th>
													<th class="text-xs-center">业务线</th>
													<th class="text-xs-center">价格</th>
													 <th class="text-xs-left">备注</th>
													 <th class="text-xs-center">版本号</th>
												</tr>
											</thead>
											<tbody>
												
											</tbody>
										</table>
										
								<footer class="bg-white">
									<div class="mypaging2 clearfix"></div>
								</footer>
								
										
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

    
	<%@include file="/jsp/footer/footer2.jsp" %>
		<script type="text/javascript">
			var page_type = "estimateStandard";
		</script>
	<%@ include file="/jsp/bottom.jsp"%>
</body>
</html>