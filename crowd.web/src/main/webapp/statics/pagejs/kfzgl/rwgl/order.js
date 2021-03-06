/**
 * 
 */

define(function(require, exports, module) {
	var $$ = jQuery$ = require('jquery');
	require('plugins/vendor/bootstrap/validator/entrance');
	$$('#formModifyDate').bootstrapValidator();
	$$('#formRwcf').bootstrapValidator();
	
	$$("#formYsqr").bootstrapValidator();
	queryOrders("1",1,true);
	
	$(".nav-tabs>li>a").click(function(){
		queryOrders($(this).attr("data-state"),1,true);
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
	  
	
	$("#btnSaveYsqr").click(function(){
		var bootstrapValidator = $$('#formYsqr').data('bootstrapValidator');
		bootstrapValidator.validate();
		if (bootstrapValidator.isValid()) {
				$("#btnSaveYsqr").attr("disabled",true);
				var param="cfrwid="+$("#formYsqr [name='wid']").val();
				param+="&sfjs="+$("#formYsqr [name='sfjs']").val();
				doPost(basePath+"/kfzOrder/supply",param,function(data){
					window.location.reload();
				},"#btnSaveYsqr")
		};
	});
	$("#btnSaveRwcf").click(function(){
		var bootstrapValidator = $$('#formRwcf').data('bootstrapValidator');
		bootstrapValidator.validate();
		if (bootstrapValidator.isValid()) {
			confirm("您确认将订单拆分给该开发者吗？",function(e){
				$("#btnSaveRwcf").find("i").show();
				$("#btnSaveRwcf").addClass("disabled");
				var _saveData=$("#formRwcf").serializeArray();
				for(var i=0;i<_saveData.length;i++){
					if(_saveData[i].name=="kfzid"){
						_saveData[i].value=$('#formRwcf [name="kfzid"]').attr("real-value");
					}
				}
				doPost(basePath+"/kfzOrder/rwcf",_saveData,function(data){
					window.location.reload();
				},"#btnSaveRwcf")
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

    	 queryOrders($("ul.shop-order-state li.active a").attr("data-state"),1,true,serchCondition);
    });
    $("#searchLikeRwjbxx").keydown(function(event){
    	if(event.keyCode==13){
    	 var serchCondition=$("input[name='keyword']").val();
          queryOrders($("ul.shop-order-state li.active a").attr("data-state"),1,true,serchCondition);
    	}
    });
	
	var _currentState="1";
	function queryOrders(state,pageNum,needPage,serchCondition){
		if(pageNum==undefined){
			pageNum=1;
		}
		_currentState=state;
		var bashData={state:state,pageNum:pageNum,pageSize:10};
		if(typeof(serchCondition)!=undefined&&serchCondition !=""){
			bashData.serchCondition=serchCondition;
		}
		doPost(basePath+"/kfzOrder/orders",bashData,function(data){
			var html="";
			if(data && data.datas){
				for(var i=0;i<data.datas.length;i++){
					var _data=data.datas[i];
					if(needPage){
						$('.mypaging2').pagination({
							pageCount:data.pageInfo.totalPage,
						    showData:data.pageInfo.pageSize,
						    coping:true,
						    callback:function(api){
						    	var _cPage=api.getCurrent();
						    	queryOrders(_currentState,_cPage,false);
						    }
						});
					}
					
					html+='<div class="shop-order-lists state-1">';
					html+='		<div class="row shop-order-top">';
					html+=' 		<div class="col-md-8 col-sm-8 ting">';
					html+='					<h4>'+_data.xmztDisplay+'';
					if(_data.xmzt=="9"){
						html+='<a data-option="queryYsbtg" data-trigger="hover" data-key="'+_data.wid+'"  style="margin-left:4px;color:#333;"><i class="icon pe-help1 font-size-20 hidden-xs res-tips" aria-hidden="true" ></i>';
						html+='</a>';
					}
					html+='                 </h4>';
					html+='					<span class="info">需求方：<a href="javascript:void(0);" target="_blank"> '+(_data.xqfnc?_data.xqfnc:_data.xqfxm)+'</a></span>';
					html+='			        <span class="info">需求类型:'+_data.rwlxDisplay+'</span>';
					html+='				    <span class="info">交付日期: '+_data.jfrq+'</span>';
					html+='			</div>';
					html+='			<div class="col-md-4 col-sm-4 ting text-sm-right">';
					var _je=_data.xmysje;
					if(_data.zbje){
						_je=_data.zbje;
						
					}
					//BUG类型
					if(_data.rwlx=="2" && _data.kfzid==_data.bugZrr){
						_je=0;
					}
//					if(_data.jjbzje){
//						_je=_je+jjbzje;
//					}
					if(_data.ptbzje){
						_je=_je+_data.ptbzje;
					}
					
					html+='				金额 ：<span class="price  red-600">￥'+_je+'元</span>';
					html+='			</div>';
					html+='		</div>';
					html+='		<div class="row shop-order-bottom">';
					html+='			<div class="col-sm-6 col-xl-8">';
					html+='				<div class="media media-xs m-t-10">';
					html+='						<div class="media-left">';
					html+='							<a href="'+basePath+'/rwxxDetail/index?rwid='+_data.wid+'" target="_blank">';
					html+='								<img class="media-object" src="'+basePath+'/statics/images/home/'+getImagePath(_data.rwxs,_data.kfkj)+'.png" alt="点击查看需求明显">';
					html+='							</a>';
					html+='						</div>';
					html+='						<div class="media-body">';
					html+='							<h4 class="media-heading">';
					html+='								<a href="'+basePath+'/rwxxDetail/index?rwid='+_data.wid+'" target="_blank">';
					html+='									NO.'+_data.rwbh+'&nbsp;&nbsp;'+_data.rwmc;
					html+='								</a>';
					html+='							</h4>';
					html+='						</div>';
					html+='				</div>';
					html+='			</div>';
					if( _data.kfzid && !_data.rwtbxxInfoExtend && _data.xmzt>=4 && _data.xmzt<=14){
					html+='			<div class="col-xs-6 col-sm-3 col-xl-2 ">';
					html+='				<div class="btn-group">';
					html+='						<a	href="javascript:void(0)" class="btn btn-outline btn-default btn-squared m-b-0 dropdown-toggle" data-toggle="dropdown">需求变更</a>';
					html+='						<ul class="dropdown-menu"   role="menu">';
					if(_data.xmzt=="4"){//开发中
						if(isnbkfz){
							html+='							<li><a data-option="rwcf" data-key="'+_data.wid+'" data-option="rwcf">订单拆分</a></li>';
						}
					}else if(_data.xmzt>=4 && _data.xmzt<=14 ){
						//html+='							<li><a data-option="sqzz" data-key="'+_data.wid+'" href="#">申请终止</a></li>';
					}
					if(_data.childCount>0){
						html+='							<li><a data-option="edit" href="'+basePath+'/publishing/index?rwid='+_data.wid+'">问题列表('+_data.childCount+')</a></li>';
						
					}
					if(_data.rwcfCount && isnbkfz){
						html+='							<li><a data-option="rwcfxx" href="javascript:void(0);" data-key="'+_data.wid+'">拆分信息('+_data.rwcfCount+')</a></li>';
					}
					if(_data.childKfzCount && _data.childKfzCount>0){
						html+='							<li><a data-option="question" href="javascript:void(0);" data-key="'+_data.wid+'">问题记录('+_data.childKfzCount+')</a></li>';
					}
					html+='<li><a data-option="rwrbgl" href="javascript:void(0);" data-key="'+_data.wid+'">日报填写</a></li>';

					//html+='							<li><a href="#">重新发布</a></li>';
					//html+='							<li class="divider"></li>';
				
					html+='						</ul>';
					html+='				</div>';
					html+='			</div>';
					html+='			<div class="col-xs-6 col-sm-3 col-xl-2">';
					html+='				<a href="'+basePath+'/kfzOrderAction/index?rwid='+_data.wid+'&flag=order" target="_blank" class="btn btn-danger btn-squared">';
					html+='					需求操作';
					html+='				</a> ';
					html+='			</div>';
					}
					html+='		</div>';
					html+='	</div>';
				}
			}
			if(html==""){
				if(needPage){
					$('.mypaging2').pagination({
						pageCount:0,
					    coping:true,
					    callback:function(api){
					    }
					});
					}
				html='<div class="h-200 vertical-align text-xs-center order-null animation-fade"><div class="vertical-align-middle font-size-18 blue-grey-500">没有符合条件的需求</div></div>'
			}
			$("#ulOrders").html(html);
			$('a[data-option="queryYsbtg"]').hover(function(){
				var _key=$(this).attr("data-key");
				doGet(basePath+"/kfzOrder/queryYsbtg","rwid="+_key,function(data){
					var html="";
					if(data && data.datas){
						html+="<div style=\'white-space: nowrap;\'>";
						html+="原因:"+toStr(data.datas.shyy)+"<br>";
						html+="</div>";
					}
					$("a[data-key='"+_key+"']").webuiPopover({content:html});
				});
			});
			$("#ulOrders .dropdown-menu>li>a").click(function(){
				var data_option=$(this).attr("data-option");
				var data_key=$(this).attr("data-key");
				if(data_option=="rwcf"){
							func_rwcf(data_key);
				}else if(data_option=="rwcfxx"){
					func_rwcfHistory(data_key);
				}else if(data_option=="delete"){
					func_delete(data_key); 
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
	
	function func_rwcf(rwid){
		$$('#formRwcf').bootstrapValidator('resetForm', true); 
		$("#formRwcf")[0].reset();
		$("#formRwcf [name='rwid']").val(rwid);
		$("#rwcfModal").modal("show");
	}
	
	function func_rwcfHistory(rwid){
		doGet(basePath+"/kfzOrder/rwcfHistory","rwid="+rwid,function(data){
			if(data && data.datas){
				var html="";
				for(var i=0;i<data.datas.length;i++){
					var _data=data.datas[i];
					html+='<tr>';
					html+='<td class="text-xs-center">';
					html+='<div class="btn-group btn-group-xs">';
					if(_data.rwzt=="0"){
						html+='<button type="button" class="btn  btn-danger" data-option="delete" data-key="'+_data.wid+'">删除</button>';
						html+='<button type="button" class="btn  btn-info" data-option="edit" data-key="'+_data.wid+'">修改</button>';
						
					}
					if(_data.rwzt=="2"){
						html+='<button type="button" class="btn  btn-success" data-option="ys" data-key="'+_data.wid+'">验收确认</button>';
					}
					html+='</div>';
					html+='</td>';
					html+='<td class="text-xs-left"><span class="tag tag-default">'+_data.kfzXm+'</span></td>';
					html+='<td class="text-xs-left"><span class="tag tag-default">'+_data.rwjg+'</span></td>';
					html+='<td class="text-xs-left"><span class="tag tag-default">'+(_data.sfsqfy=="1"?"是":"否")+'</span></td>';
					var _sjje=_data.rwjg;
					if(_data.sfsqfy=="1"){
						_sjje=   _sjje*(100-rwcfsqbl)/100;
					}
					html+='<td class="text-xs-left"><span class="tag tag-default">'+_sjje+'</span></td>';
					html+='<td class="text-xs-left"><span class="tag tag-default">'+_data.rwztDisplay+'</span></td>';
					html+='</tr>';
				}
				$("#tblRwcf").html(html);
				$("#tblRwcf button").click(function(){
					var data_option=$(this).attr("data-option");
					var data_key=$(this).attr("data-key");
					if(data_option=="delete"){
							func_rwcf_delete(data_key);
					}else if(data_option=="edit"){
						func_rwcf_edit(data_key);
					}else if(data_option=="ys"){
						func_rwcf_ys(data_key); 
					}
					//else if{
						//func_modifyData();
					//}
					
				})
			}
		});
		$("#rwcfJlModal").modal("show");
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
	
	function func_rwcf_ys(cfrwid){
		$$('#formYsqr').bootstrapValidator('resetForm', true); 
		$("#formYsqr")[0].reset();
		$("#formYsqr [name='wid']").val(cfrwid);
		$("#ysqrModal").modal("show");
	}
	//填写日报
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
	    		$("#rbxx-edit-modal").modal("show");
			}
		});
		
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