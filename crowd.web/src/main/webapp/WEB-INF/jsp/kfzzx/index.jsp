<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<%@ include file="/jsp/top/top.jsp"%>
<%@ include file="/jsp/param.jsp"%>
<body>
	<header>
		<%@ include file="/jsp/header.jsp"%>
		<div class="met-banner banner-ny-h " data-height='' style=''>

			<div class="slick-slide">
				<img class="cover-image"
					src="<%=request.getContextPath()%>/statics/images/kfzzx_header.png"
					sizes="(max-width: 767px) 767px" alt="培训">

			</div>

		</div>
	</header>
	<div class="container">
		<!-- <section id="step">
			<div class="developer-step">
				<div class="header">
					<div class="title1">智慧校园云工场，</div>
					<div class="title1">开启自由职业之路</div>
				</div>


			</div>
		</section> -->
		<div class="container developer-step-content mt-50" style="margin-top:50px;">
			<div class="rows">
				<div class="col-xs-3 text-xs-center">
					<p style="color: #89bceb">
						<i class="fa fa-user-plus fa-5x"></i>
					</p>
					<p class="step-title">认证成为开发者</p>
					<div class="step-desc">
                        <p><span class="highlight">5</span>分钟完善技能与经验</p>
                        <p><span class="highlight">1</span>分钟完成身份认证</p>
                    </div>
				</div>
				<div class="col-xs-3 text-xs-center">
					<p style="color: #89bceb">
						<i class="fa fa-hand-paper-o fa-5x"></i>
					</p>
					<p class="step-title">报名项目</p>
					<div class="step-desc">
                        <p>项目均价<span class="highlight" id="spanXqjj">0</span>元</p>
                        <p>每日百余个项目正在招募</p>
                    </div>
				</div>
				<div class="col-xs-3 text-xs-center">
					<p style="color: #89bceb">
						<i class="fa fa-signing fa-5x"></i>
					</p>
					<p class="step-title">确认合作</p>
					<div class="step-desc">
                        <p>平均耗时<span class="highlight" id="spanShsj">0</span>天</p>
                        <p>即可进入开发阶段</p>
                    </div>
				</div>
				<div class="col-xs-3 text-xs-center">
					<p style="color: #89bceb">
						<i class="fa fa-dollar fa-5x"></i>
					</p>
					<p class="step-title">获取收益</p>
					<div class="step-desc">
                        <p>收益排行榜第一的开发者</p>
                        <p>在云工场赚取了<span class="highlight" id="spanMaxMoney">0</span>万元！</p>
                    </div>
				</div>
			</div>
		</div>
		<div class="container mubutton-container text-xs-center">
			<a class="mybutton" href="<%=request.getContextPath() %>/center/toIndex" > 开启自由职业之路 </a>

		</div>
	</div>
	<section class="developer-sort">
		<div class="container clearfix">
			<h1 class="title1">开发者排行榜</h1>
			<div class="types">
				<a href="javascript:void(0);" class="type active" data-target="kfzMoney">收入榜</a> <a
					href="javascript:void(0);" class="type" data-target="kfzSorce">评分榜</a> <a
					href="javascript:void(0);" class="type" data-target="kfzTbb">勤奋榜</a>
			</div>
			<ul class="ranking-list income clearfix" id="kfzMoney"
				style="display: flex;">
			</ul>
			<div class="mypaging2 clearfix" id="kfzMoneyPage"></div>
			<ul class="ranking-list evaluation clearfix" id="kfzSorce"
				style="display: none;">
				
			</ul>
			<div class="mypaging2 clearfix" style="display:none;" id="kfzSorcePage"></div>
			<ul class="ranking-list diligent clearfix" id="kfzTbb"
				style="display: none;">	
			</ul>
			<div class="mypaging2 clearfix" style="display:none;" id="kfzTbbPage"></div>
		</div>
	</section>
	
	<section class="developer-map">
        <div class="container section-container">
            <h1 class="title1">平台开发者地域分布</h1>
            <h3 >（单位：人）</h3>
            <div class="region-container">
                <div id="region-map">
                    <div id="developer-map" style="width:100%;height:400px;">
                    	
                    </div>
                </div>
                <div id="region-chart">
                    <div class="count-title">区域人数分布</div>
                    <div class="regions" id="divAreaNum">
                       
                    </div>
                </div>
            </div>
        </div>
    </section>
    <section class="developer-sort">
        <div class="section-container border-bottom">
            <h1 class="title1">平台培训通过趋势</h1>
            <h3>（单位：人）</h3>
            <div class="chart-container text-xs-center">
                 <div  id="divTrainData" style="height:340px;width:100%;max-width:946px;margin:auto;">
                       
                 </div>
            </div>
        </div>
    </section>
	<%@ include file="/jsp/footer/footer.jsp"%>
	<button type="button"
		class="btn btn-icon btn-primary btn-squared met-scroll-top hide">
		<i class="icon wb-chevron-up" aria-hidden="true"></i>
	</button>
	<script>
		var jsonurl = "";
		var page_type="kfzzxIndex";
	</script>

	<%@ include file="/jsp/bottom.jsp"%>


	<script
		src="<%=request.getContextPath()%>/statics/pagejs/hall/index.js"></script>
</body>
</html>