/**
 * 
 */

define(function(require, exports, module) {
	var $$ = jQuery = require('jquery');
	require('plugins/vendor/bootstrap/validator/entrance');
	$$('#formPxxx').bootstrapValidator();
	$('#formPxxx .datepicker').datepicker({
	    language: 'zh-CN',
	    autoclose:true,
	    startDate:date,
	    todayHighlight:true
	});
	
	$('#formPxxx [name="xmbh"]').autocomplete({  
		   source:function(query,process){
			 if(query){
				 doPost(basePath+"/publishing/xmxxs","condition="+query,function(data){
					 process(data.datas);
				});
				 
			 }else{
				 if(_xmxx){
					 return _xmxx;
				 }else{
					 doPost(basePath+"/publishing/xmxxs","condition="+query,function(data){
						 _xmxx=data.datas;
						 process(data.datas);
					});
				 }
			 }
		   }, 
		   formatItem:function(item){  
		       return item["xmbh"]+"("+item["ssxx"]+")";  
		    },  
		   setValue:function(item){  
		       return{'data-value':item["xmbh"],'real-value':item["xmbh"]};  
		    },
		    minLength:0
	});
	
	$("#btnSaveSh").click(function(){
		var bootstrapValidator = $$('#formPxxx').data('bootstrapValidator');
		bootstrapValidator.validate();
		var datas=$('#formPxxx').serializeArray();
		if (bootstrapValidator.isValid()) {
			doPost(basePath+"/trainApply/apply",datas,function(data){
				window.location.href=basePath+"/xqfOrder/index";
			});
		}
	});
	$("#ulPhb a").click(function(){
		var _state=$(this).attr("data-state");
		if(_state==0){
			$("#ulPerson").show();
			$("#ulCompany").hide();
			
		}else{
			$("#ulPerson").hide();
			$("#ulCompany").show();
		}
	});
	getNewTb();
	function getNewTb(){
		doGet(basePath+"/publishing/selectNewTb","",function(data){
			 if(data && data.datas){
				 var html="";
				 for(var i=0;i<data.datas.length;i++){
					 html+='<li class="list-group-item" style="border:0px;">';
					 html+='<div class="row">';
					 html+='<div class="col-xs-4 text-left my-mt-5 no-padding-div">';
					 html+=data.datas[i].NC
					 html+='</div>';
					 html+='<div class="col-xs-3 text-center my-mt-5 no-padding-div">';
					 html+=data.datas[i].ts+data.datas[i].dw+"前"
					 html+='</div>';
					 html+='<div class="col-xs-5 text-right my-mt-5 no-padding-div" style="color:red;">';
					 html+='￥'+data.datas[i].ZBJE+"";
					 html+='</div>';
					 html+='</div>';
					 html+='</li>';
				 }
				 $("#ulNewTb").html(html);
			 }
		});
	}
	getUserMoney(1);
	getUserMoney(2);
	function getUserMoney(yhlx){
		doGet(basePath+"/kfzzx/sort","pageNum=1&pageSize=8&flag=1&yhlx="+yhlx,function(data){
			 if(data && data.datas){
				 var html="";
				 for(var i=0;i<data.datas.length;i++){
					 var _data=data.datas[i];
					 html+='<li class="list-group-item" style="border:0px;">';
					 html+='<div class="row">';
					 html+='<div class="col-xs-6 text-left my-mt-5 no-padding-div" >';
					 var _xm=(_data.kfzNc?_data.kfzNc:_data.kfzXm);
					 var _sxxm=_xm;
					 if(_xm && _xm.length>5){
						 _sxxm=_xm.substr(0,5)+"...";
					 }
					 html+='<span title="'+_xm+'">'+_sxxm+'</span>';
					 html+='</div>';
					 html+='<div class="col-xs-6 text-right my-mt-5 no-padding-div" style="color:red;">';
					 html+='￥'+toStr(_data.zsr,0)+"";
					 html+='</div>';
					 html+='</div>';
					 html+='</li>';
				 }
				 if(yhlx=="1"){
					 $("#ulPerson").html(html);
				 }else{
					 $("#ulCompany").html(html);
				 }
			 } 
		});
	}
	
});