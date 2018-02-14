/**
 * 
 */
define(function(require, exports, module) {
	var $$ = jQuery$ = require('jquery');
	require('plugins/vendor/bootstrap/validator/entrance');
	var pjrwlwglChart = echarts.init(document.getElementById('main'));
	queryTotal();
	function queryTotal(){
		doGet(basePath+"/xqfMoney/queryTotal","",function(data){
			$("#spanTotal").html(data.datas);
		});
	}
	queryMonth();
	
	var _pageSize = 10;
	queryDetail(1, true);
	function queryMonth(){
		doGet(basePath+"/xqfMoney/queryMonth","",function(data){
			var xValue=new Array();
			var yValue=new Array();
			for(var k in data.datas){
				xValue.push(k);
				yValue.push(data.datas[k]);
			}
			var option = {
				    tooltip : {
				        trigger: 'axis'
				    },
				    legend: {
				        data:['支出']
				    },
				    toolbox: {
				        show : true
				    },
				    calculable : true,
				    xAxis : [
				        {
				            type : 'category',
				            boundaryGap : false,
				            data : xValue
				        }
				    ],
				    yAxis : [
				        {
				            type : 'value'
				        }
				    ],
				    series : [
				        {
				            name:'支出',
				            type:'line',
				            smooth:true,
				            itemStyle: {normal: {areaStyle: {type: 'default'}}},
				            data:yValue
				        }
				    ]
				};
			pjrwlwglChart.setOption(option);
		});
	} 
	
	function queryDetail(pageNum, needPage,beginDate,endDate,szlbid){
		
		var bashData={pageNum:pageNum,pageSize:_pageSize};
		if(typeof(beginDate)!=undefined&&beginDate !=""){
			bashData.beginDate=beginDate;
		}
		if(typeof(endDate)!=undefined&&endDate !=""){
			bashData.endDate=endDate;
		}
		if(typeof(szlbid)!=undefined&&szlbid !=""){
			bashData.szlbid=szlbid;
		}
		var flag=$("#searchLike").attr("data-flag");
		if(flag=="1"){
			var beginDate=$("input[name='beginDate']").val();
			var endDate=$("input[name='endDate']").val();
			var szlbid=$("#paralist a.queryActive").attr("data-key");
			bashData.beginDate=beginDate;
			bashData.endDate=endDate;
			bashData.szlbid=szlbid;
		}
		doPost(basePath+"/xqfMoney/queryDetail",bashData,function(data){
			if(data.datas){
				if(needPage){
					$('.mypaging2').pagination({
						pageCount:data.pageInfo.totalPage,
					    showData:data.pageInfo.pageSize,
					    coping:true,
					    callback:function(api){
					    	var _cPage=api.getCurrent();
					    	queryDetail(_cPage,false);
					    }
					});
				}
				$("#mainTable").empty();
				var html="";
				for(var i=0;i<data.datas.length;i++){
					var _data=data.datas[i];
					html+="<tr>";
					html+="<td>"+_data.jyztDisplay+"</td>";
					html+="<td>"+getLocalTime(_data.szsj)+"</td>";
					html+="<td>"+_data.szlbDisplay+"</td>";
					html+="<td><a target='_blank' href="+basePath+"/rwxxDetail/index?rwid="+_data.lyxmid+">"+_data.rwbh+"</a></td>";
                    html+="<td>"+_data.je+"</td>";
					html+="<td>"+_data.fysm+"</td>";
					html+="</tr>";
				}
				$("#mainTable").html(html);
			}
		});
	}
	
	//时间控件
	/*$(".datepicker").datepicker({
	    language: 'zh-CN',
	    autoclose:true,
	    todayHighlight:true
	});*/
	$("input[name='beginDate']").datepicker({
	    language: 'zh-CN',
	    autoclose:true,
	    todayHighlight:true
	}).on('hide',function(ev){
		var beginDate=$("input[name='beginDate']").val();
		var endDate=$("input[name='endDate']").val();
		if(endDate!=""&&new Date(beginDate).getTime()>new Date(endDate).getTime()){
			alert("开始时间不能大于结束时间");
			$("input[name='beginDate']").val("");
			return;
		}
		var szlbid=$("#paralist a.queryActive").attr("data-key");
		queryDetail(1,true,beginDate,endDate,szlbid);
	});
	$("input[name='endDate']").datepicker({
	    language: 'zh-CN',
	    autoclose:true,
	    todayHighlight:true
	}).on('hide',function(ev){
		var beginDate=$("input[name='beginDate']").val();
		var endDate=$("input[name='endDate']").val();
		if(beginDate!=""&&new Date(beginDate).getTime()>new Date(endDate).getTime()){
			$("input[name='endDate']").val("");
			alert("开始时间不能大于结束时间");
			return;
		}
		var szlbid=$("#paralist a.queryActive").attr("data-key");
		queryDetail(1,true,beginDate,endDate,szlbid);
	});
	$("#advancedSearch").click(function(){
		var flag=$("#searchLike").attr("data-flag");
		if(flag=="0"){
			$("#searchLike").show();
			$("#searchLike").attr("data-flag","1");
		}else{
			$("#searchLike").hide();
			$("#searchLike").attr("data-flag","0");
			queryDetail(1,true);
		}
	});
	
	  $("#paralist a").click(function(){
			var data_option=$(this).attr("data-option");
			$("#paralist a[data-option='"+data_option+"']").removeClass("queryActive");
			$(this).addClass("queryActive");
			var beginDate=$("input[name='beginDate']").val();
			var endDate=$("input[name='endDate']").val();
			if(beginDate!=""&&endDate!=""&&new Date(beginDate).getTime()>new Date(endDate).getTime()){
				alert("开始时间不能大于结束时间");
				return;
			}
			var szlbid =$(this).attr("data-key");
			queryDetail(1, true,beginDate,endDate,szlbid);
	   });
	
});