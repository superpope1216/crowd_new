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
			//$("#spanTotal").html(data.datas);
			$("#aZzc").html(data.datas);
		});
	}
	queryMonth();
	queryDxb();
	queryDys();
	queryDsh();
	function queryDxb(){
		doGet(basePath+"/xqfxx/queryDxb","",function(data){
			$("#spanDxb").html(data.datas);
		});
	}
	
	
	function queryDys(){
		doGet(basePath+"/xqfxx/queryDys","",function(data){
			$("#spanDys").html(data.datas);
		});
	}
	function queryDsh(){
		doGet(basePath+"/xqfxx/queryDsh","",function(data){
			$("#spanDsh").html(data.datas);
		});
	}
	function queryShbtg(){
		doGet(basePath+"/xqfxx/queryShbtg","",function(data){
			$("#spanShbtg").html(data.datas);
		});
	}
	
	$("#spanShbtg").click(function(){
		window.location.href=basePath+"/xqfOrder/index?flag=order&rwState=2&tabValue=6";
	});
	
	$("#spanDxb").click(function(){
		window.location.href=basePath+"/xqfOrder/index?flag=order&rwState=3&rwxb=1&tabValue=3";
	});
	//queryDetail();
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
	
	function queryDetail(){
		doGet(basePath+"/xqfMoney/queryDetail","",function(data){
			if(data.datas){
				var html="";
				for(var i=0;i<data.datas.length;i++){
					var _data=data.datas[i];
					html+="<tr>";
					html+="<td>"+_data.jyztDisplay+"</td>";
					html+="<td>"+getLocalTime(_data.szsj)+"</td>";
					html+="<td>"+_data.szlbDisplay+"</td>";
					html+="<td><a href='"+basePath+"/'>"+_data.rwbh+"</a></td>";
					html+="<td>"+_data.je+"</td>";
					html+="<td>"+_data.fysm+"</td>";
					html+="</tr>";
				}
				$("#mainTable").html(html);
			}
		});
	}
	

		                    
});