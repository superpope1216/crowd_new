/**
 * 
 */
define(function(require, exports, module) {
	var $$ = jQuery$ = require('jquery');
	require('plugins/vendor/bootstrap/validator/entrance');
	var pjrwlwglChart = echarts.init(document.getElementById('main'));
	queryTotal();
	function queryTotal(){
		if($("#aZzc").size()<=0){
			return;
		}
		doGet(basePath+"/kfzxx/queryTotal","",function(data){
			//$("#spanTotal").html(data.datas);
			$("#aZzc").html(toStr(data.datas,0));
		});
	}
	//获取本月收入
	queryMonthTotal();
	function queryMonthTotal(){
		if($("#aMonthTotal").size()<=0){
			return;
		}
		doGet(basePath+"/kfzxx/queryMonthTotal","",function(data){
			//$("#spanTotal").html(data.datas);
			$("#aMonthTotal").html(toStr(data.datas,0));
		});
	}
	//获取本月工资
	queryMonthMoney();
	function queryMonthMoney(){
		if($("#aMonthMoney").size()<=0){
			return;
		}
	}
	//获取所有待支付金额
	queryDzfTotal();
	function queryDzfTotal(){
		if($("#aDzf").size()<=0){
			return;
		}
		doGet(basePath+"/kfzxx/queryDzfTotal","",function(data){
			if(data && data.datas){
				$("#aDzf").html(toStr(data.datas,0));
			}
		});
	}
	queryMonth();
	queryKfz();
	queryDsqjc();
	queryDsqys();
	queryDsqsh();
	function queryKfz(){
		doGet(basePath+"/kfzxx/queryKfzTotal","",function(data){
			$("#spanKfz").html(toStr(data.datas,0));
		});
	}
	
	
	function queryDsqjc(){
		doGet(basePath+"/kfzxx/queryDsqjcTotal","",function(data){
			$("#spanSqjc").html(toStr(data.datas,0));
		});
	}
	function queryDsqys(){
		doGet(basePath+"/kfzxx/queryDsqysTotal","",function(data){
			$("#spanSqys").html(toStr(data.datas,0));
		});
	}
	function queryDsqsh(){
		doGet(basePath+"/kfzxx/queryDsqshTotal","",function(data){
			$("#spanSqsh").html(toStr(data.datas,0));
		});
	}
	
	//queryDetail();
	function queryMonth(){
		doGet(basePath+"/kfzMoney/queryMonth","",function(data){
			var xValue=new Array();
			var yValue=new Array();
			var yValue2=new Array();
			for(var k in data.datas[0]){
				xValue.push(k);
				yValue.push(data.datas[0][k]);
			}
			for(var j in data.datas[1]){
				yValue2.push(data.datas[1][j]);
			}
			var option = {
				    tooltip : {
				        trigger: 'axis'
				    },
				    legend: {
				        data:['收入','提现']
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
				            name:'收入',
				            type:'line',
				            smooth:true,
				            itemStyle: {normal: {areaStyle: {type: 'default'}}},
				            data:yValue
				        }, {
				            name:'提现',
				            type:'line',
				            smooth:true,
				            itemStyle: {normal: {areaStyle: {}}},
				            data:yValue2
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