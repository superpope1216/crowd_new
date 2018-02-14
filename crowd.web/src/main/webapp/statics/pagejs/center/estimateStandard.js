/**
 * 
 */
define(function(require, exports, module) {
	var $$ = jQuery$ = require('jquery');
	require('plugins/vendor/bootstrap/validator/entrance');
       var url=basePath+"/estimateStandard/query";
	   var params={startPage:1,pageSize:10};
	   doPostBack(url,params,function(data){
		   	if(data.success&&isNotEmpty(data.datas)){
		   		$('.mypaging2').pagination({
					pageCount:data.pageInfo.totalPage,
				    showData:data.pageInfo.pageSize,
				    coping:true,
				    callback:function(api){
				    	var _cPage=api.getCurrent();
				    	refreshTable(_cPage);
				    }
				});
		   		refreshTable(1);
		   	}
	     });
	
	  /* 业务线选择查询*/
	   $("#paralist a").click(function(){
			var data_option=$(this).attr("data-option");
			$("#paralist a[data-option='"+data_option+"']").removeClass("queryActive");
			$(this).addClass("queryActive");
			initPage(1);
	   });
	   
	   
});


//刷新表格
function refreshTable(page){
   
   $("tbody tr").remove();
   var url=basePath+"/estimateStandard/query";
   var ywx=$("#paralist a.queryActive").attr("data-key");
   var params={startPage:page,pageSize:10,ywx:ywx};
   doPostBack(url,params,function(data){
	   	if(data.success&&isNotEmpty(data.datas)){
			var html="";
			for(var i=0;i<data.datas.length;i++){
				var result=data.datas[i];
				html+='<tr class="text-xs-center"><td class="text-xs-left">'+decideIsNull(result.optionName)+'</td>';
				html+='<td>'+decideIsNull(result.ywxDisplay)+'</td>';
				html+='<td>'+decideIsNull(result.price)+'</td>';
				html+='<td class="text-xs-left">'+decideIsNull(result.remarks)+'</td>';
				html+='<td>'+decideIsNull(result.version)+'</td>';
				html+='</tr>';
			}
			$("tbody").append(html);
	   	}
     });
}

function initPage(page){
	  
	   var url=basePath+"/estimateStandard/query";
	   var ywx=$("#paralist a.queryActive").attr("data-key");
	   var params={startPage:page,pageSize:10,ywx:ywx};
	   doPostBack(url,params,function(data){
		   	if(data.success&&isNotEmpty(data.datas)&&data.datas!="[]"){
		   		$('.mypaging2').pagination({
					pageCount:data.pageInfo.totalPage,
				    showData:data.pageInfo.pageSize,
				    coping:true,
				    callback:function(api){
				    	var _cPage=api.getCurrent();
				    	refreshTable(_cPage);
				    }
				});
		     	refreshTable(1);
		   	}else{
		   	 $("tbody tr").remove();
		   	 console.log("无数据");
		   	$('.mypaging2').pagination({
				pageCount:1,
			    showData:10,
			    coping:true,
			    callback:function(api){
			    	
			    }
			});
		   	}
	     });
}
function decideIsNull(str){
	   if("null"==str||null==str||""==str||typeof(str)=="undefined"){
		   return "";
	   }else{
		   return str;
	   }
	   
}