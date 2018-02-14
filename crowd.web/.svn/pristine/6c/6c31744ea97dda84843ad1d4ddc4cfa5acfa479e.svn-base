/**
 * 
 */

define(function(require, exports, module) {
	var $$ = jQuery$ = require('jquery');
	require('plugins/vendor/bootstrap/validator/entrance');
	$$('#formDdqr').bootstrapValidator();
	queryOrders("0");
	
	$(".nav-tabs>li>a").click(function(){
		queryOrders($(this).attr("data-state"));
	});
	$(document).on('show.bs.modal', '.modal', function (event) {
        var zIndex = 9999 + (10 * $('.modal:visible').length);
        $(this).css('z-index', zIndex);
    });
	  $("input[name='rq']").datepicker({
	  	    language: 'zh-CN',
	  	    autoclose:true,
	  	    todayHighlight:true
	  	});
	
	
	$("#btnSaveDdqr").click(function(){
		var bootstrapValidator = $$('#formDdqr').data('bootstrapValidator');
		bootstrapValidator.validate();
		if (bootstrapValidator.isValid()) {
			confirm("确认保存嘛？",function(e){
				$("#btnSaveDdqr").attr("disabled",true);
				doPost(basePath+"/kfzCfOrder/accept","wid="+$("#formDdqr [name='wid']").val()+"&sfjs="+$("#formDdqr [name='sfjs']").val(),
						function(data){
					window.location.reload();
				},"#btnSaveDdqr")
			});
		};
	});
	$('#formRwcf [name="kfzid"]').autocomplete({  
		   source:function(query,process){
			 if(query){
				 doPost(basePath+"/kfzOrder/kfzxxs","condition="+query,function(data){
					 process(data.datas);
				});
				 
			 }
		   }, 
		   formatItem:function(item){  
		       return item["xm"]+"("+item["gh"]+")";  
		    },  
		   setValue:function(item){  
		       return{'data-value':item["xm"],'real-value':item["wid"]};  
		    },
		    minLength:2
		}); 
	
	//模糊查询
    $(".wb-search").click(function(){
	 	var serchCondition=$("input[name='keyword']").val();
    	 queryOrders($("ul.shop-order-state li.active a").attr("data-state"),1,serchCondition);
    });
    $("#searchLikeRwjbxx").keydown(function(event){
    	if(event.keyCode==13){
    	 var serchCondition=$("input[name='keyword']").val();
          queryOrders($("ul.shop-order-state li.active a").attr("data-state"),1,serchCondition);
    	}
    });
	
	function queryOrders(state,pageNum,serchCondition){
		if(pageNum==undefined){
			pageNum=1;
		}
		var bashData={state:state,pageNum:pageNum,pageSize:10};
		if(typeof(serchCondition)!=undefined&&serchCondition !=""){
			bashData.serchCondition=serchCondition;
		}
		doPost(basePath+"/kfzCfOrder/queryOrders",bashData,function(data){
			var html="";
			if(data && data.datas){
				for(var i=0;i<data.datas.length;i++){
					var _data=data.datas[i];
					html+='<div class="shop-order-lists state-1">';
					html+='		<div class="row shop-order-top">';
					html+=' 		<div class="col-md-8 col-sm-8 ting">';
					html+='					<h4>'+_data.rwztDisplay+'</h4>';
					html+='					<span class="info">需求方：<a href="'+basePath+'/xqfview/index?xqfid='+_data.xqfid+'" target="_blank"> '+(_data.xqfNc?_data.xqfNc:_data.xqfXm)+'</a></span>';
					html+='			        <span class="info">需求编号:<a href="'+basePath+'/rwxxDetail/index?rwid='+_data.rwid+'" target="_blank">'+_data.rwbh+'</a></span>';
					html+='				    <span class="info">交付日期: '+_data.jfrq+'</span>';
					html+='			</div>';
					html+='			<div class="col-md-4 col-sm-4 ting text-sm-right">';
					var _je=_data.rwjg;
					
					html+='				金额 ：<span class="price  red-600">￥'+_je+'元</span>';
					html+='			</div>';
					html+='		</div>';
					html+='		<div class="row shop-order-bottom">';
					html+='			<div class="col-sm-6 col-xl-8">';
					html+='				<div class="media media-xs m-t-10">';
					html+='						<div class="media-left">';
					html+='							<a href="'+basePath+'/rwxxDetail/index?rwid='+_data.rwid+'" target="_blank">';
					html+='								<img class="media-object" src="'+basePath+'/statics/images/home/'+getImagePath(_data.rwxs,_data.kfkj)+'.png" alt="点击查看需求明显">';
					html+='							</a>';
					html+='						</div>';
					html+='						<div class="media-body">';
					html+='							<h4 class="media-heading">';
					html+='									'+_data.rwnr;
					
					html+='							</h4>';
					html+='						</div>';
					html+='				</div>';
					html+='			</div>';
					html+='			<div class="col-xs-6 col-sm-3 col-xl-2 pull-right" id="groupBtn">';
					if(_data.rwzt=="0"){
						html+='				<a href="javascript:void(0);" data-option="ddqr" data-key="'+_data.wid+'" class="btn btn-danger btn-squared">';
						html+='					订单确认';
						html+='				</a> ';
					}else if(_data.rwzt=="1" || _data.rwzt=="5"){
						html+='				<a href="javascript:void(0);" data-option="sqys" data-key="'+_data.wid+'" class="btn btn-danger btn-squared">';
						html+='					申请验收';
						html+='				</a> ';
					}
					
					html+='				<a href="javascript:void(0);" data-option="rwrbgl" data-key="'+_data.rwid+'" class="btn btn-danger btn-squared">';
					html+='					日报填写';
					html+='				</a> ';
					
					html+='			</div>';
					
					html+='		</div>';
					html+='	</div>';
				}
			}
			if(html==""){
				html='<div class="h-200 vertical-align text-xs-center order-null animation-fade"><div class="vertical-align-middle font-size-18 blue-grey-500">没有符合条件的需求</div></div>'
			}
			$("#ulOrders").html(html);
			$("#groupBtn a").click(function(){
				var data_option=$(this).attr("data-option");
				var data_key=$(this).attr("data-key");
				if(data_option=="ddqr"){
					func_ddqr(data_key);
				}else if(data_option=="sqys"){
					func_sqys(data_key);
				}else if(data_option=="rwrbgl"){
					func_rwrbgl(data_key);
				}
				//else if{
					//func_modifyData();
				//}
				
			})
			
		});
	}
	$('#addr-edit-moda').on('show.bs.modal', function() {  
        $$('#formModifyDate').bootstrapValidator('resetForm', true);  
        $('#formModifyDate')[0].reset();  
    });  
	
	function func_ddqr(rwid){
		$$('#formDdqr').bootstrapValidator('resetForm', true); 
		$("#formDdqr")[0].reset();
		$("#formDdqr [name='wid']").val(rwid);
		$("#ddqrModal").modal("show");
	}
	
	function func_sqys(rwid){
		confirm("您确认申请验收吗？",function(){
			doPost(basePath+"/kfzCfOrder/applyAccept","wid="+rwid,
					function(data){
				window.location.reload();
			});
		});
	}
	
	function func_rwcf_delete(cfrwid){
		confirm("您确认删除该拆分需求？",function(e){
			doPost(basePath+"/kfzOrder/deleteCfrw","cfrwid="+cfrwid,function(data){
				alert("任务删除成功");
				func_rwcfHistory(data.datas);
			})
		});
	}
	
	function func_rwcf_edit(cfrwid){
		$$('#formRwcf').bootstrapValidator('resetForm', true); 
		$("#formRwcf")[0].reset();
		doGet(basePath+"/kfzOrder/queryCfrw","cfrwid="+cfrwid,function(data){
			//func_rwcfHistory(data.datas);
		
			$("#formRwcf [name='wid']").val(data.datas.wid);
			$("#formRwcf [name='rwid']").val(data.datas.rwid);
			$("#formRwcf [name='kfzid']").val(data.datas.kfzXm);
			$("#formRwcf [name='kfzid']").attr("real-value",data.datas.kfzid);
			$("#formRwcf [name='rwjg']").val(data.datas.rwjg);
			$("#formRwcf [name='sfsqfy']").val(data.datas.sfsqfy);
			$("#formRwcf [name='rwnr']").val(data.datas.rwnr);
			
		});
		$("#rwcfModal").modal("show");
	}
	
	function func_rwrbgl(wid){
		doGet(basePath+"/rwxxDetail/queryRwxx","rwid="+wid,function(data){
			if(data.success){
				$("input[name='rwbh']").val(data.datas.rwbh);
	    		$("input[name='rwmc']").val(data.datas.rwmc);
	    		$("#rwwid").val(data.datas.rwwid);
	    		$("input[name='rwbh']").attr("readonly",true);
	    		$("input[name='rwmc']").attr("readonly",true);
	    		$("#rwwid").val(wid);
				$("textarea[name='gznrsm']").text("");
	    		$("textarea[name='bz']").text("");
			}
		});
		$("#rbxx-edit-modal").modal("show");
	}
	//保存日报
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
				 var clientDate=new Date(rqDate);
				 var clientDateTime=clientDate.getTime();
				 var serverDate=new Date();
				 var serverDateTime=serverDate.getTime();
				 if(!checkRq(serverDateTime, clientDateTime, serverDate,rqDate)){
					 return;
				 }
					var url=basePath+"/kfzrbgl/saveOrUpdateRbxxNewInfo";
				    var basicData=$("#formRbxxgl").serializeArray();
				    doPostBack(url,basicData,function(data){
				      	$("#rbxx-edit-modal").modal("hide");
			          });
			 }
		});
	
	  function checkRq(serverDateTime,clientDateTime,serverDate,rqDate){
			
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
					 alert("选择日期必须为当日或者当日的前一日");
					 return false;
				 }
			 }else{
			   alert("选择日期不能大于当前日期");
			   return false;
			 }
			return true;
			
		}
	//减少当前日期 一天
	  function add0(m){return m<10?'0'+m:m }
	  function formatDate(time)
	  {
	  //shijianchuo是整数，否则要parseInt转换
	  var y = time.getFullYear();
	  var m = time.getMonth()+1;
	  var d = time.getDate()-1;
	  return y+'-'+add0(m)+'-'+add0(d);
	  }
});