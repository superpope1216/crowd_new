/**
 * 
 */

$(document).ready(function(){
	//$('.dataStatistics').dataStatistics({min:100,max:1500,time:30000,len:6});
	/**
	$(".column-side li a[data-toggle='collapse']").click(function() {
		if($(this).find("i.icon").hasClass("wb-chevron-down")){
			
			
			$(this).find("i.icon").removeClass("wb-chevron-down").addClass("wb-chevron-up");
		}else{
			$(this).find("i.icon").removeClass("wb-chevron-up").addClass("wb-chevron-down");
		}
	});
	*/
	
	$("#btnQueryShow").click(function(){
		if($("#divQueryKfkj").css("display")=="none"){
			$("#divQueryKfkj").show();
			$("#divQueryXqzt").show();
			$("#divQueryRyyq").show();
			$("#divQueryXsrw").show();
			
			$("#divQueryPx").show();
			
			
			
		}else{
			$("#divQueryKfkj").hide();
			$("#divQueryXqzt").hide();
			$("#divQueryRyyq").hide();
			$("#divQueryXsrw").hide();
			$("#divQueryPx").hide();
		}
	});
	
	$("#header_navbar").css("margin-left",($("#mycontainer").width()-$("#header_navbar").width())/2)
	$("#paralist a").click(function(){
		var data_option=$(this).attr("data-option");
		$("#paralist a[data-option='"+data_option+"']").removeClass("queryActive");
		$(this).addClass("queryActive");
		
		if(data_option=="px"){
			var _key=$(this).attr("data-key");
			$("#paralist a>i").remove();
			if($(this).attr("data-order") && $(this).attr("data-order")=="1"){
				$(this).attr("data-order","-1");
			}else{
				$(this).attr("data-order","1");
			}
			
			if(_key!=""){
				if($(this).attr("data-order")=="1"){
					$(this).append('<i class="fa fa-long-arrow-down" style="margin-left:4px;" aria-hidden="true"></i>');
				}else{
					$(this).append('<i class="fa fa-long-arrow-up" style="margin-left:4px;" aria-hidden="true"></i>');
				}
			}
			
		}
		queryRwjbxx(getParam(1),true);
	});
	
	function getParam(pageNum,pageSize){
		var param="ywxlb="+$("#paralist a[data-option='ywx'].queryActive").attr("data-key");
		param+="&kfkj="+$("#paralist a[data-option='kfkj'].queryActive").attr("data-key");
		param+="&rwjd="+$("#paralist a[data-option='rwzt'].queryActive").attr("data-key");
		param+="&rwlb="+$("#paralist a[data-option='ryyq'].queryActive").attr("data-key");
		param+="&order="+$("#paralist a[data-option='px'].queryActive").attr("data-key");
		param+="&sfxsrw="+$("#paralist a[data-option='xsrw'].queryActive").attr("data-key");
		param+="&orderDesc="+$("#paralist a[data-option='px'].queryActive").attr("data-order");
		param+="&rwxs="+lbdm;
		param+="&queryCondition="+condition;
		if(pageSize){
			param+="&pageSize="+pageSize;
		}
		if(pageNum){
			param+="&startPage="+pageNum;
		}
		
		return param;
	}
	$("#queryForm [name='queryForm.ywx']").change(function(){
		
		queryRwjbxx(getParam(1),true);
	});
	
	$("#queryForm [name='queryForm.kfkj']").change(function(){
		queryRwjbxx(getParam(1),true);
	});
	
	$("#queryForm [name='queryForm.xqzt']").change(function(){
		queryRwjbxx(getParam(1),true);
	});
	$("#btnPublishing").click(function(){
		window.location.href=basePath+"/publishing/index";
	});
	
	$("#btnTb").click(function(){
		doGet(basePath+"/center/toNeed","",function(){
			alert("请在众包大厅中选择招标中的需求进行投标！");
		});
	});
	
	function addPreZero(num){
		 var t = (num+'').length,
		  s = '';
		  
		 for(var i=0; i<6-t; i++){
		  s += '0';
		 }
		  
		 return s+num;
	}
	//queryRwtjxxStatic();
	function queryRwtjxxStatic(){
		doGet(basePath+"/center/rwxxStatics","",function(data){
			if(data && data.datas){
				var _data=parseInt(data.datas);
				var _halfData=Math.round(_data/2);
				var timer=setInterval(function(){
					if(_halfData>_data){
						
						_halfData=_data;
						clearInterval(timer);
					}
					var _strHalfData=addPreZero(_halfData);
					var _num1=_strHalfData.substr(0,1);
					var _num2=_strHalfData.substr(1,1);
					var _num3=_strHalfData.substr(2,1);
					var _num4=_strHalfData.substr(3,1);
					var _num5=_strHalfData.substr(4,1);
					var _num6=_strHalfData.substr(5,1);
					$("#divNum1").html(_num1);
					$("#divNum2").html(_num2);
					$("#divNum3").html(_num3);
					$("#divNum4").html(_num4);
					$("#divNum5").html(_num5);
					$("#divNum6").html(_num6);
					_halfData+=100;
					
				},1000);
			}
		});
	}
	function setTimeValue(value){
		
	};
	queryRwjbxx(getParam(1),true);
	function queryRwjbxx(param,needPage){
		doGet(basePath+"/center/query",param,function(data){
			var html="";
			if(data && data.datas){
				if(needPage){
					$('.mypaging2').pagination({
						pageCount:data.pageInfo.totalPage,
					    showData:data.pageInfo.pageSize,
					    coping:true,
					    callback:function(api){
					    	var _cPage=api.getCurrent();
					    	queryRwjbxx(getParam(_cPage),false);
					    }
					});
				}
				
				for(var i=0;i<data.datas.length;i++){
					var _data=data.datas[i];
					var xmje=_data.xmysje;
					if(_data.zbje){
						xmje=_data.zbje;
					}
					if(_data.ptbzje){
						xmje=xmje+_data.ptbzje;
					}
					var _jd=""
					if(_data.rwjd=="1"){
						_jd="tsxx-green";
					}else if(_data.rwjd=="2"){
						_jd="tsxx-red";
					}else if( _data.rwjd=="3" || _data.rwjd=="4"){
						_jd="tsxx-blue";
					}else{
						_jd="tsxx-gray";
					}
					html+='<div class="center-left-body-block">';
					html+='	<div class="child">';
					html+='		<div class="img-div col-xs-2 col-sm-2">';
					html+='			<a href="'+basePath+'/rwxxDetail/index?rwid='+_data.wid+'" target="_blank" style="display:block;">';
					html+='				<img class="img-responsive" src="'+basePath+'/statics/images/home/'+getImagePath(_data.rwxs,_data.kfkj)+'.png">';
					html+='			</a>';
					html+='		</div>';
					html+='		<div class="left-bolck col-xs-9 col-sm-9">';
					html+='			<div class="info-body">';
					html+='				<div class="info-body-title">';
					html+='					<a href="'+basePath+'/rwxxDetail/index?rwid='+_data.wid+'" target="_blank"	class="info-body-title-name">';
					html+='						<span class="number-title">';
					html+='							<!-- react-text: 399 -->NO.<!-- /react-text -->	<!-- react-text: 400 -->'+_data.rwbh+'<!-- /react-text -->';
					html+='						</span>';
					html+='						<span class="number-title">';
					html+='							<span class="">'+_data.rwmc+'</span>';
					html+='						</span>';
					html+='						<span class="tsxx '+_jd+'">'+_data.rwjdDisplay+'</span>';
					var _rwlb="";
					var content="<div style=\'white-space: nowrap;\'>";
					if(_data.rwlb && _data.rwlb=="2"){
						
						_rwlb="金";
						content+="仅金智教育员工可投标";
					}else if(_data.rwlb && _data.rwlb=="3"){
						_rwlb="外";
						content+="仅外部开发者可投标";
					}
					content+="</div>";
					if(_rwlb){
						html+='					<span name="spanRwlb" class="tsxx tsxx-red" aria-hidden="true" data-trigger="hover" data-animation="fade" data-target="webuiPopover1" data-content="'+content+'"><i class="fa fa-fire fa-spin  fa-fw"></i>'+_rwlb+'</span>';
					}
					
					if(_data.sfxsrw=="1"){
						var contentXsrw="<div style=\'white-space: nowrap;\'>新手任务仅限新手可投标<br>新手定义：在平台中标金额<=5000元</div>";
						html+='					<span name="spanXsrw" class="tsxx tsxx-red" aria-hidden="true" data-trigger="hover" data-animation="fade" data-target="webuiPopover1" data-content="'+contentXsrw+'"><i class="fa fa-user fa-spin  fa-fw"></i>新</span>';
					}
					html+='					</a>';
					
				
					html+='				</div>';
					html+='			<div>';
					html+='			<div class="content1">';
					html+='				<label>分类：</label><span>'+toStr(_data.rwxsDisplay)+'</span>';
					html+='			</div>';
					html+='			<div class="content1">';
					html+='				<label>业务：</label><span>'+toStr(_data.ywxlbDisplay,'其他')+'</span>';
					html+='			</div>';
					html+='			<div class="content1">';
					html+='				<label>框架：</label><span>'+toStr(_data.kfkjDisplay,"无要求")+'</span>';
					html+='			</div>';
					html+='			<div class="content1">';
					html+='				<label>周期：</label>';
					html+='				<span> <!-- react-text: 417 -->'+toStr(_data.zbzq,1)+'<!-- /react-text -->';
					html+='						<!-- react-text: 418 --> 天<!-- /react-text -->';
					html+='				</span>';
					html+='			</div>';
					html+='		</div>';
					html+='		<div class="time-content">';
					html+='			<span> <!-- react-text: 421 -->'+_data.fbsj+'<!-- /react-text -->';
					html+='				<!-- react-text: 422 -->发布<!-- /react-text -->';
					html+='			</span>';
					html+='				<!-- react-text: 423 -->|<!-- /react-text -->';
					html+='			<span> <!-- react-text: 425 -->'+toStr(_data.childKfzCount,0)+'<!-- /react-text -->';
					html+='				<!-- react-text: 426 --> 人报名<!-- /react-text -->';
					html+='			</span>';
					html+=' 	</div>';
					html+='	</div>';
					html+='</div>';
					html+='		<div class="col-xs-12 col-sm-1">';
					html+='					<span class="pull-right">';
					html+='						<span	class="price"><span>¥'+xmje+'</span></span>';
					html+='					</span>';
					html+='		</div>';
					html+='	</div>';
					html+='</div>';
					
//					html+='<div class="col-sm-3 sm-margin-b-50"><a href="'+basePath+'/rwxxDetail/index?rwid='+_data.wid+'" title="'+_data.rwmc+'"	target="_self">';
//					html+='		<div class="margin-b-20">';
//					html+='			<div class="wow zoomIn animated" data-wow-duration=".3"	data-wow-delay=".1s" style="visibility: visible; animation-delay: 0.1s; animation-name: zoomIn; position: relative;">';
//					html+='				<img class="img-responsive"	style="max-width: 100%; heigth: auto; display: block;"	src="'+basePath+'/statics/images/home/'+getImagePath(_data.rwxs,_data.kfkj)+'.png" alt="'+_data.rwmc+'">';
//					var _jd=""
//					if(_data.rwjd=="1"){
//						_jd="label-danger";
//					}else if(_data.rwjd=="2"){
//						_jd="label-primary";
//					}else if( _data.rwjd=="3" || _data.rwjd=="4"){
//						_jd="label-success";
//					}else{
//						_jd="label-info"
//					}
//					html+='				<span class="label '+_jd+'" style="color: #fff; position: absolute; bottom: 0px; right: 0px;">'+_data.rwjdDisplay+'</span>';
//					html+='			</div>';
//					html+='   	</div>';
//					var _rwmc=_data.rwmc;
//					if(_rwmc && _rwmc.length>10){
//						_rwmc=_rwmc.substr(0,10)+"...";
//					}
//					html+='		<h4>';
//					html+='			<a href="javascript:void(0);"	style="color: #515769; font-family: Hind, sans-serif; line-height: 1.4; font-weight: 700;" title="'+_data.rwmc+'">'+_rwmc+'</a> ';
//					html+='			<span class="text-uppercase margin-l-20" style="color: #bfc1c7; font-size: 14px; margin-left: 20px; font-weight: 500;">'+_data.zbzq+'天</span>';
//					html+='		</h4>';
//					var _xmgs=_data.xmgs;
//					if(_xmgs && _xmgs.length>35){
//						_xmgs=_xmgs.substr(0,35)+"...";
//					}
//					html+='		<p	style="color: #a6a7aa; font-weight: 400; font-size: 15px; min-height: 50px; max-height: 50px;">'+_xmgs+'</p>';
//					html+='		<a href="#"	style="font-size: 15px; font-weight: 700; color: red; font-family: Hind, sans-serif;">$'+xmje+'元</a>';
//					html+='</a>	</div>';
					/**
					html+='<li class=" shown offer wow fadeInUp animated" data-wow-delay="0ms" data-wow-duration="1500ms" style="visibility: visible;  animation-duration: 1500ms; animation-delay: 0ms; animation-name: fadeInUp;">';
					html+='	  <a href="'+basePath+'/rwxxDetail/index?rwid='+_data.wid+'" title="'+_data.rwmc+'"	target="_self" class="my-card">';
					html+='	  	 <article class="inner-box">';
					html+='	        <figure class="image" style="margin:0;">';
					html+='				<img src="'+basePath+'/statics/images/home/'+getImagePath(_data.rwxs,_data.kfkj)+'.png" title="'+_data.rwmc+'" alt="'+_data.rwmc+'">';
					html+='				<div class="overlay-box">';
					html+='					<div class="date">';
					html+='					'+_data.xmgs+'';	
					html+='				    </div>';
					html+='				</div>';
					html+='			</figure>';
					html+='			<div class="text">';
					html+='				<div class="desc">';
					html+='				    <p><b>'+_data.rwmc+'</b></p>';
					html+='				    <p style="overflow: auto;">';
					var xmje=_data.xmysje;
					if(_data.zbje){
						xmje=_data.zbje;
					}
					if(_data.ptbzje){
						xmje=xmje+_data.ptbzje;
					}
					html+='				    	<span style="text-align: left; float: left; display: inline-block;" class="price">￥'+xmje+'元</span> ';
					html+='				        <span style="text-align: center; float: right; display: inline-block; width: 40px; background-color: #ddd; border: none; font-size: 12px; border-radius: 3px; cursor: pointer; display: inline-block; background-color: #65C279; color: #FFF;">'+_data.rwjdDisplay+'</span>'
					html+='				     </p>';
					html+='				  </div>';
					html+='				  <p style="overflow: auto; border-top: solid 1px #ddd; color: #999; padding-top: 4px;">';
					html+='				     <span	style="text-align: left; float: left; display: inline-block;">'+_data.kfkjDisplay+'</span>';
					html+='					 <span	style="text-align: center; float: right; cursor: pointer; display: inline-block;">'+_data.zbzq+'天</span>';
					html+='			     </p>';
					html+='			</div>';
					html+='	    </article>';
					html+='   </a>';
					html+='</li>';
					*/
				}
			}
			if(html==""){
				html='<div class="h-200 vertical-align text-xs-center order-null animation-fade"><div class="vertical-align-middle font-size-18 blue-grey-500">没有符合条件的需求</div></div>';
			}
			
			$("#divContent").html(html);
			$('span[name="spanRwlb"]').webuiPopover();
			$('span[name="spanXsrw"]').webuiPopover();
			
			
		});
	}
	
});