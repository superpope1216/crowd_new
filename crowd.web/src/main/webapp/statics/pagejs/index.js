/**
 * 
 */

$(document).ready(function(){
	queryNewRwxx();
	function queryNewRwxx(){
		doGet(basePath+"/first/queryList","",function(data){
			if(data && data.datas){
				var html="";
				for(var i=0;i<data.datas.length;i++){
					var _data=data.datas[i];
					html+='<li class="groom-cut-slide">';
					html+='		<a class=""	href="'+basePath+'/rwxxDetail/index?rwid='+_data.wid+'"	title="" target="_self">';
					html+='			<img src="'+basePath+'/statics/images/home/'+getImagePath(_data.rwxs,_data.kfkj)+'.png"	alt="" style="margin-top: 10px">';
					html+='				<span> ';
					html+='					<b	style="text-align: left">'+_data.rwmc+'</b>';
					html+='					<p style="overflow: auto;">';
					html+='						<span	style="text-align: left; float: left; display: inline-block; font-size: 16px;">￥'+_data.xmysje+'元</span>';
					html+='						<span	style="text-align: center; float: right; display: inline-block; width: 40px; background-color: #ddd; border: none; font-size: 12px; border-radius: 3px; cursor: pointer; display: inline-block; background-color: #65C279; color: #FFF;">'+_data.rwjdDisplay+'</span>';
					html+='					</p>';
					html+='					<p	style="overflow: auto; border-top: solid 1px #ddd; color: #999; padding-top: 4px;">';
					html+='						<span	style="text-align: left; float: left; display: inline-block;">'+_data.kfkjDisplay+'</span>';
					html+='						<span	style="text-align: center; float: right; cursor: pointer; display: inline-block;">'+_data.zbzq+'天</span>';
					html+='					</p>';
					html+='				</span>';
					html+='		</a>';
					html+='</li>';
				}
				$("#ulNewRwjbxx").html(html);
			}
		})
	}
	
	$("#ulMoneyTab li").click(function(){
		$("#ulMoneyTab li").removeClass("active");
		$(this).addClass("active");
		var _option=$(this).attr("data-option");
		if(_option=="person"){
			$("#ulPserson").show();
			$("#ulCompany").hide();
		}else{
			$("#ulPserson").hide();
			$("#ulCompany").show();
		}
	});
	
/*	$("#ulStarTab li").click(function(){
		$("#ulStarTab li").removeClass("active");
		$(this).addClass("active");
		var _option=$(this).attr("data-option");
		if(_option=="developer"){
			$("#ulDeveloper").show();
			$("#ulDemander").hide();
		}else{
			$("#ulDeveloper").hide();
			$("#ulDemander").show();
		}
	});*/
	
	getUser(1);
	//企业用户
	getUser(2);
	function getUser(yhlx){
		doGet(basePath+"/kfzzx/sort","pageNum=1&pageSize=10&flag=1&yhlx="+yhlx,function(data){
			 if(data && data.datas){
				 var html="";
				 for(var i=0;i<data.datas.length;i++){
					 var _data=data.datas[i];
					 html+='<li class="info-cut-slide ">';
					 html+='	<div class="card card-with-border">';
					 html+='		<div class="header">';
					 html+='			<div class="icon">';
					 if(_data.grzpfjid){
						 html+='				<img class="img-responsive headImg" src="'+basePath+'/image/preView?wid='+_data.grzpfjid+'">';
					 }else{
						 html+='				<img class="img-responsive headImg" src="'+basePath+'/statics/images/card/kfz.png">';
					 }
					 html+='			</div>';
					 html+='		</div>';
					 html+='		<div class="content text-center">';
					 html+='			<p><span style="color:red;">￥'+toStr(_data.zsr,0)+'</span></p>';
					 html+='			<h4 class="title text-center">'+(_data.kfzNc?_data.kfzNc:_data.kfzXm)+'</h4>';
					 html+='			<p class="description">';
					 html+='				<span>'+(_data.ptrzjn?(_data.ptrzjnDisplay+_data.ptrzdjDisplay):"无")+'</span>';
					 html+='			</p>';
					 html+='	    </div>';
					 html+='	</div>';
					 html+='</li>';
				 }
				 if(yhlx=="1"){
					 $("#ulPserson").html(html);
				 }else{
					 $("#ulCompany").html(html);
				 }
				 
			 }
		});
	}
	
	getStaticsData();
	function getStaticsData(){
		doGet(basePath+"/first/getStaticsData","",function(data){
			if(data && data.datas){
				var _data=data.datas;
				 $("#pTotalMoney").html(toStr(_data.fbxqzje,0));
				 $("#pTotalMoney").attr("data-animatetarget",parseInt(toStr(_data.fbxqzje,0)));
				 $('#pTotalMoney').running();
				 
				 $("#pTotalCount").html(toStr(_data.fbxqzs,0));
				 $("#pTotalCount").attr("data-animatetarget",parseInt(toStr(_data.fbxqzs,0)));
				 $('#pTotalCount').running();
				 
				 $("#pTotalXqf").html(toStr(_data.shxqf,0));
				 $("#pTotalXqf").attr("data-animatetarget",parseInt(toStr(_data.shxqf,0)));
				 $('#pTotalXqf').running();
				 
				 $("#pTotalKfz").html(toStr(_data.shkfz,0));
				 $("#pTotalKfz").attr("data-animatetarget",parseInt(_data.shkfz,0));
				 $('#pTotalKfz').running();
			}
		});
	}
//	getTotalMoney();
//	
//	function getTotalMoney(){
//		doGet(basePath+"/first/getTotalMoney","",function(data){
//			 if(data && data.datas){
//				
//				 
//			 }
//		});
//	}
//	getTotalCount();
//	function getTotalCount(){
//		doGet(basePath+"/first/getTotalCount","",function(data){
//			 if(data && data.datas){
//				 $("#pTotalCount").html(data.datas);
//				 $("#pTotalCount").attr("data-animatetarget",data.datas);
//				 $('#pTotalCount').running();
//			 }
//		});
//	}
//	getKfzCount();
//	function getKfzCount(){
//		doGet(basePath+"/first/getKfzCount","",function(data){
//			 if(data && data.datas){
//				 $("#pTotalKfz").html(data.datas);
//				 $("#pTotalKfz").attr("data-animatetarget",data.datas);
//				 $('#pTotalKfz').running();
//			 }
//		});
//	}
//	getXqfCount();
//	function getXqfCount(){
//		doGet(basePath+"/first/getXqfCount","",function(data){
//			 if(data && data.datas){
//				 $("#pTotalXqf").html(data.datas);
//				 $("#pTotalXqf").attr("data-animatetarget",data.datas);
//				 $('#pTotalXqf').running();
//			 }
//		});
//	}
	
	getDeveloperStar();
	function getDeveloperStar(){
		doGet(basePath+"/publishing/selectDeveloperStar","",function(data){
			 if(data && data.datas){
				 var html="";
				 for(var i=0;i<data.datas.length;i++){
					 var rowData = data.datas[i];
					 
					 html+='<li class="info-cut-slide ">';
					 html+='	<div class="card card-with-border">';
					 html+='		<div class="header">';
					 html+='			<div class="icon">';
					 if(rowData.grzp){
						 html+='				<img class="img-responsive headImg" src="'+basePath+'/image/preView?wid='+rowData.grzp+'">';
					 }else{
						 html+='				<img class="img-responsive headImg" src="'+basePath+'/statics/images/card/kfz.png">';
					 }
					 html+='			</div>';
					 html+='		</div>';
					 html+='		<div class="content text-center">';
					 html+='			<p><span style="color:red;">'+(parseInt(rowData.score)>=100?100:rowData.score)+'</span></p>';
					 html+='			<h4 class="title text-center">'+(rowData.kfzxm)+'</h4>';
					 html+='			<p class="description">';
					 html+='				<span>'+(rowData.ptrzjn?(rowData.ptrzjnDisplay+rowData.ptrzdjDisplay):"无")+'</span>';
					 html+='			</p>';
					 html+='	    </div>';
					 html+='	</div>';
					 html+='</li>';
				 }
				 $("#ulDeveloper").html(html);
			 }
		});
	}
	
/*	getDemanderStar();
	function getDemanderStar(){
		doGet(basePath+"/publishing/selectDemanderStar","",function(data){
			 if(data && data.datas){
				 var html="";
				 for(var i=0;i<data.datas.length;i++){
					 html+=' <li class="info-cut-slide">';
					 html+='	<a	href="javascript:void(0);"	 target="_self">';
					 html+='		<img	src="'+basePath+'/image/preView?wid='+data.datas[i].kfzid+'">';
					 html+='		<span>';
					 html+='			<p></p>';
					 html+='			<i>累计收入<em>'+data.datas[i].je+'元</em></i>';
					 html+='			<b>'+data.datas[i].xqfxm+'</b>';
					 html+='	    </span>';
					 html+='	</a>';
					 html+='</li>';
				 }
				 $("#ulDemander").html(html);
			 }
		});
	}*/
	
});