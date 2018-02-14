
define(function(require, exports, module) {
	var $$ = jQuery$ = require('jquery');
	require('plugins/vendor/bootstrap/validator/entrance');
	initPage(1,true);
	addEvent();
    
	function addEvent(){
		$(".datepicker").datepicker({
		    language: 'zh-CN',
		    autoclose:true,
		    todayHighlight:true
		});
		$("#rbxx-edit-modal").on("hidden.bs.modal", function() {
		   $$("#formRbxxgl").bootstrapValidator("validate");
		   $$("#formRbxxgl").data('bootstrapValidator').destroy(); 
		})
		$("#rbxx-edit-modal").on("show.bs.modal", function() {
		   $$("#formRbxxgl").bootstrapValidator(); 
		})
		$("#btnAddRbxx").click(function(){
			$("#rbxx-modal-title").text("日报新建");
			$("input[name='rq']").parent("div").parent("div").show();
			$("#formRbxxgl")[0].reset();
			$("textarea[name='gznrsm']").text("");
    		$("textarea[name='bz']").text("");
			$("#wid").val("");
			$("#rbxx-edit-modal").modal("show");
		});
		
		$("input[name='rwbh']").autocomplete({
	    	 source:function(query,process){
	    		 if(query){
	    			  var params={"rwbh":query};
	    			  var url=basePath+"/kfzrbgl/queryRwjbxxInfo";
	    		       doPostBack(url,params,function(data){
	    		       process(data.datas);
	    		   });
	    		 }
	    	 },
	    	formatItem:function(item){  
	    		  $("input[name='rwmc']").val(item["rwmc"]);
	    		  $("#rwwid").val(item["wid"]);
			       return item["rwbh"]+"("+item["rwmc"]+")";  
			    },  
		     setValue:function(item){  
			       return{'data-value':item["rwbh"],'real-value':item["rwbh"],'real-wid':item["wid"],'real-rwmc':item["rwmc"]};
			    }
		});
	
		
	   $("#btnSave").click(function(){
		   $$("#formRbxxgl").bootstrapValidator("validate");
		   var formRbxxglValidator = $$("#formRbxxgl").data('bootstrapValidator');
		   formRbxxglValidator.validate();
		   if(formRbxxglValidator.isValid()){
			     var rqDate=$("input[name='rq']").val();
			     if(rqDate==""){
			    	 alert("请选择日报日期");
			    	 return;
			     }
			     var rwmc=$("input[name='rwmc']").val();
			     if(rwmc==""){
			    	 alert("任务编号不正确请重新选择");
			    	 return;
			     }
				 var clientDate=new Date(rqDate);
				 var clientDateTime=clientDate.getTime();
				 var serverDate=new Date();
				 var serverDateTime=serverDate.getTime();
				 var wid=$("#wid").val();
				 if(wid==""){
					 if(!checkRq(serverDateTime, clientDateTime, serverDate,rqDate,"1")){
						 return;
					 } 
				 }else{
					 if(!checkRq(serverDateTime, clientDateTime, serverDate,rqDate,"2")){
						 return;
					 } 
				 }
				 
					var url=basePath+"/kfzrbgl/saveOrUpdateRbxxNewInfo";
					 //判断   任务名称  和任务wid
					$("input[name='rwbh']").next("ul").children("li").each(function(index,value){
						if($(value).hasClass("active")){
							$("#rwwid").val($(value).attr("real-wid"));
							$("input[name='rwmc']").val($(value).attr("real-rwmc"));
						}
					});
					//return;
				    var basicData=$("#formRbxxgl").serializeArray();
				    doPostBack(url,basicData,function(data){
				    	initPage(1,true);
				    	$("#rbxx-edit-modal").modal("hide");
			          });
			 }
		});
	
	}
	
	
});
var pageSize=10;//默认显示十条
//日报  日期限定 (新增,修改,删除) 1月30号日报  只能1月30号或者1月31号(0-12点)填写
function checkRq(serverDateTime,clientDateTime,serverDate,rqDate,flag){
	
	 if(serverDateTime>=clientDateTime){
		 var removeOneDay=new Date(formatDate(serverDate)).getTime();
		 if(clientDateTime>=removeOneDay){
			 if(clientDateTime==removeOneDay){
				 var newClientDate=new Date(rqDate+" 12:00:00");
				 newClientDate.setDate(newClientDate.getDate()+1);
				 if(new Date().getTime()>newClientDate.getTime()){
					
					 alert("日报已过期,不能填写昨天的日报");
					 return false;
				 }
			 }
		 }else{
			 alert("日报日期必须为当日或者当日的前一日");
			 return false;
		 }
	 }else{
	   alert("日报日期不能大于当前日期");
	   /* if(flag=="1"){
			alert("日报已过期,不能填写昨天的日报");
		 }else if(flag=="2"){
			alert("日报已过期,不能修改以前的日报"); 
		 }else if(flag=="3"){
			alert("日报已过期,不能删除以前的日报"); 
		 }else{
		    alert("日报已过期,不能填写昨天的日报");
		 }*/
	   return false;
	 }
	return true;
	
}




function editRbxx(wid,rqDate){
	 var clientDate=new Date(rqDate);
	 var clientDateTime=clientDate.getTime();
	 var serverDate=new Date();
	 var serverDateTime=serverDate.getTime();
	 if(!checkRq(serverDateTime, clientDateTime, serverDate,rqDate,"2")){
		 return;
	 }
	$("#rbxx-modal-title").text("日报编辑");
	$("#wid").val(wid);
	var url=basePath+"/kfzrbgl/queryRbxxNewInfo";
    var basicData={wid:wid};
    doSynchrPostBack(url,basicData,function(data){
    	if(data.success&&isNotEmpty(data.datas)){
    		console.log("data.datas[0].rq"+data.datas[0].rq);
    		$("input[name='rwbh']").val(data.datas[0].rwbh);
    		$("input[name='rwmc']").val(data.datas[0].rwmc);
    		$("input[name='rq']").val(data.datas[0].rq);
    		$("select[name='sjd']").val(data.datas[0].sjd);
    		$("input[name='sjgzl']").val(data.datas[0].sjgzl);
    		$("textarea[name='gznrsm']").text(data.datas[0].gznrsm);
    		$("textarea[name='bz']").text(data.datas[0].bz);
    		$("#rwwid").val(data.datas[0].rwwid);
        }
      });
	$("#rbxx-edit-modal").modal("show");
}

function delRbxx(wid,rqDate){
	 var clientDate=new Date(rqDate);
	 var clientDateTime=clientDate.getTime();
	 var serverDate=new Date();
	 var serverDateTime=serverDate.getTime();
	 if(!checkRq(serverDateTime, clientDateTime, serverDate,rqDate,"3")){
		 return;
	 }
	confirm("确认删除该条数据吗",function(data){
		var url=basePath+"/kfzrbgl/delRbxxNewInfo";
	    var basicData={wid:wid};
	    doPostBack(url,basicData,function(data){
	    	initPage(1,true);
	      });
	});
}

function initPage(startPage,needPage){
	   var url=basePath+"/kfzrbgl/queryRbxxNewInfo";
	   var params={startPage:startPage,pageSize:pageSize};
	   doPostBack(url,params,function(data){
		   	if(data.success&&isNotEmpty(data.datas)){
		   		if(needPage){
		   			$('.mypaging2').pagination({
						pageCount:data.pageInfo.totalPage,
					    showData:data.pageInfo.pageSize,
					    coping:true,
					    callback:function(api){
					    	var _cPage=api.getCurrent();
					    	initPage(_cPage,false);
					    }
					});
		   		}
		   	   //刷新表格
		   	   $("tbody tr").remove();
		   		var html="";
				for(var i=0;i<data.datas.length;i++){
					var result=data.datas[i];
					html+='<tr class="text-xs-center"><td>'+result.rwbh+'</td>';
					html+='<td class="text-xs-left">'+result.rwmc+'</td><td>'+result.rq+'</td>';
					html+='<td>'+result.sjdDisplay+'</td>';
					html+='<td><span class="red-600 subtotal" data-id="32">'+result.sjgzl+'</span></td>';
					html+='<td><a href="#"><i class="icon wb-edit" aria-hidden="true" ';
					html+=' onclick="editRbxx(\''+result.wid+'\',\''+result.rq+'\')"></i></a>';
					html+='<a href="#"><i class="icon wb-trash" aria-hidden="true" ';
					html+='onclick="delRbxx(\''+result.wid+'\',\''+result.rq+'\')"></i></a></td></tr>';
				}
				$("tbody").append(html);
		   	}
	     });
}


//将当前日期减少一个
function add0(m){return m<10?'0'+m:m }
function formatDate(time)
{
//shijianchuo是整数，否则要parseInt转换
var y = time.getFullYear();
var m = time.getMonth()+1;
var d = time.getDate()-1;
return y+'-'+add0(m)+'-'+add0(d);
}
