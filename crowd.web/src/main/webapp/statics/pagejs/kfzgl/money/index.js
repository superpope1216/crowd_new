/**
 * 
 */
define(function(require, exports, module) {
	var $$ = jQuery$ = require('jquery');
	require('plugins/vendor/bootstrap/validator/entrance');
	$$('#formTxsq').bootstrapValidator();
	
	var pjrwlwglChart = echarts.init(document.getElementById('main'));
	queryTotal();
	function queryTotal(){
		doGet(basePath+"/kfzMoney/queryTotal","",function(data){
			$("#spanTotal").html(data.datas);
		});
	}
	
	
	
	$("#btnSaveTxsq").click(function(){
		var bootstrapValidator = $$('#formTxsq').data('bootstrapValidator');
		bootstrapValidator.validate();
		if (bootstrapValidator.isValid()) {
			var _je=$("#formTxsq [name='je']").val();
			
			var ktxje=parseFloat($("#formTxsq [name='txfw']").html());
			if(parseFloat($.trim(_je))>ktxje){
				alert("提现金额已超过您可提现的范围，请重新确认！");
				return;
			}
			confirm("您确认提现申请吗？",function(){
				$("#btnSaveTxsq").attr("disabled",true);
				var param="txje="+_je;
				param+="&yzm="+$("#formTxsq [name='yzm']");
				param+="&zfbzh="+$("#formTxsq [name='zfbzh']");	
					
				doPost(basePath+"/kfzMoney/applyTx",param,function(data){
					$("#btnSaveTxsq").attr("disabled",false);
					window.location.reload();
				});
			});
		}
	});
	$("#btnCalcuGs").click(function(){
		var ktxje=parseFloat($("#formTxsq [name='txfw']").html());
		var _je=$("#formTxsq [name='je']").val();
		if(_je==""){
			alert("请输入提现金额！");
			return;
		}
		
		var ktxje=parseFloat($("#formTxsq [name='txfw']").html());
		if(parseFloat($.trim(_je))>ktxje){
			alert("提现金额已超过您可提现的范围，请重新确认！");
			return;
		}
		doGet(basePath+"/kfzMoney/calcuYkgs","txje="+_je,function(data){
			if(data && data.datas){
				$("#formTxsq [name='bcks']").html(data.datas);
			}
		})
		
	});
	
	$("#btnTxsq").click(function(){
		doGet(basePath+"/kfzMoney/queryTxsq","",function(data){
			if(data && data.datas){
				$("#formTxsq [name='byytx']").html(data.datas.je);
				$("#formTxsq [name='byykgs']").html(data.datas.ykgs);
				$("#formTxsq [name='zhye']").html(data.datas.zhye);
				$("#formTxsq [name='sjh']").html(data.datas.sjh);
				$("#formTxsq [name='zfbzh']").val(data.datas.zfbzh);
				$("#formTxsq [name='yzm']").val("");
				$("#formTxsq [name='bcks']").val("");
				$("#formTxsq [name='je']").val("");
				$("#formTxsq [name='txfw']").html(data.datas.ktxje);
				
				$("#moadl_txsq").modal("show");
			}
		});
		
	});
	queryMonth();
	var _pageSize = 10;
	queryDetail(1, true);
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
	
	function queryDetail(pageNum, needPage){
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
		doPost(basePath+"/kfzMoney/queryDetail",bashData,function(data){
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
					if(_data.szlbid=="1"){
						html+="<td>"+_data.jsztDisplay+"</td>";
					}else{
						html+="<td>"+_data.jyztDisplay+"</td>";	
					}
					
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