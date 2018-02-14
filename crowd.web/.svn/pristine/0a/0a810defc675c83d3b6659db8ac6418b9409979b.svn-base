/**
 * 
 */

define(function(require, exports, module) {
	var $$ = jQuery$ = require('jquery');
	require('plugins/vendor/bootstrap/validator/entrance');
	$$('#formModifyDate').bootstrapValidator();
	$$('#formQuestion').bootstrapValidator();
	new Swiper('.mynav',{
		initialSlide : $('.nav-item.active').index(),
		wrapperClass : 'nav-tabs',
		slideClass : 'nav-item',
		freeMode : true,
		freeModeMomentumRatio : .1,
		freeModeSticky : true,
		freeModeSticky : true,
		slidesPerView : 'auto',
		mousewheelControl: true,
		observer : true,
		observeParents : true,
		onTouchStart : function(swiper,even){
			$('.nav-hover ul').removeClass('active');
		}
	});
	
	$('.datepicker').datepicker({
	    language: 'zh-CN',
	    autoclose:true,
	    todayHighlight:true
	})
	var _pageSize=5;
	
	var param = getParam(0, 1, _pageSize);
	queryOrders(0, param);
	$("#btnSaveDate").click(function(){
		var bootstrapValidator = $$('#formModifyDate').data('bootstrapValidator');
		bootstrapValidator.validate();
		if (bootstrapValidator.isValid()) {
			confirm("您确认修改需求的日期信息？",function(e){
				doPost(basePath+"/xqfOrder/modifyDate",$("#formModifyDate").serializeArray(),function(data){
					window.location.reload();
				})
			});
		}
	});
	
	$("#btnSaveQuestion").click(function(){
		var bootstrapValidator = $$('#formQuestion').data('bootstrapValidator');
		bootstrapValidator.validate();
		if (bootstrapValidator.isValid()) {
			confirm("您确认发布该问题吗？",function(e){
				doPost(basePath+"/xqfOrder/publishingQuestion",$("#formQuestion").serializeArray(),function(data){
					window.location.reload();
				})
			});
		}
	});
	//收回需求
	
	$("#btnSaveReback").click(function(){
		var bootstrapValidator = $$('#formReback').data('bootstrapValidator');
		bootstrapValidator.validate();
		if (bootstrapValidator.isValid()) {
			confirm("您确认收回该需求？",function(e){
				doPost(basePath+"/xqfOrder/reback",$("#formReback").serializeArray(),function(data){
					if(data && data.datas){
						window.location.reload();
					}
				});
			});
			
		}
	});
	
	$('[name=keyword]').on('keypress',function(event){ 
        if(event.keyCode == 13) { 
        	var states = $('[aria-expanded="true"]').attr('data-state');
        	if(states == undefined){
        		states = 0;
        	}
            var param = getParam(states, 1, 5);
            queryOrders(states, param);
        }  
    });
	
	$(".nav-tabs>li>a").click(function(){
		var states = $(this).attr("data-state");
		var param = getParam(states, 1, 5);
		queryOrders(states, param);
	});
	var _currentState="0";
	
	function queryOrders(states, param){
		_currentState=states;
		doGet(basePath+"/xyTrain/trains",param,function(data){
			var html="";
			if(data && data.datas){
				$('.mypaging2').pagination({
					pageCount:data.pageInfo.totalPage,
				    showData:data.pageInfo.pageSize,
				    coping:true,
				    callback:function(api){
				    	var _cPage=api.getCurrent();
				    	var param = getParam(_currentState, _cPage, 5);
				    	reloadData(_currentState, param);
				    }
				});
			}
			reloadData(states, param);
		});
	}
	
	function reloadData(states, param){
		doGet(basePath+"/xyTrain/trains",param,function(data){
			var html="";
			if(data && data.datas){
				for(var i=0;i<data.datas.length;i++){
					var _data=data.datas[i];
					html+='<div class="shop-order-lists state-1">';
					html+='		<div class="row shop-order-top">';
					html+=' 		<div class="col-md-8 col-sm-8 ting">';
					if(_data.bmzt == "1"){
						html+='					<h4>'+_data.bmztDisplay+'</h4>';
					}else{
						if(_data.khjg){
							html+='					<h4>'+_data.khjgDisplay+'</h4>';
						}else{
							html+='					<h4>'+_data.yykhztDisplay+'</h4>';
						}
					}
					html+='			        <span class="info">培训编号:<a href="'+basePath+'/trainDetail/index?pxid='+_data.pxid+'" target="_blank">'+_data.pxrwbh+'</a></span>';
					html+='			</div>';
					html+='			<div class="col-md-4 col-sm-4 ting text-sm-right">';
					var _khsj=_data.yykhsj;
					var content="<div style=\'white-space: nowrap;\'>";
					var content2="";
					if(_data.yykhzt == "1" || _data.yykhzt == "5"){
						_khsj = "未预约";
						content2 = "未预约";
					}else if(_data.yykhzt == "2"){
						_khsj = "未安排";
						content2 = "等待安排";
					}else if(_data.yykhzt == "3" && _data.yykhsj){
						content2="预约考核时间："+_data.yhkhsj;
					}else if(_data.yykhzt == "4"){
						_khsj = _data.khsj;
						content2="考核时间："+_data.khsj;
					}
					content+=content2;
					content+="</div>";
					html+='				考核时间：<span class="price  red-600">'+_khsj+'</span>';
					html+='<a data-option="pop" style="margin-left:4px;"><i class="icon pe-help1 font-size-20 hidden-xs res-tips"';
					html+=' aria-hidden="true" ';
					html+=' data-trigger="hover"  ';
					html+='	data-content="'+content+'"';
					html+='	data-animation="fade" data-target="webuiPopover1"></i>';
					html+='</a>';
					html+='			</div>';
					html+='		</div>';
					html+='		<div class="row shop-order-bottom">';
					html+='			<div class="col-sm-6 col-xl-9">';
					html+='				<div class="media media-xs m-t-10">';
					html+='						<div class="media-body">';
					html+='							<h4 class="media-heading">';
					html+='								<a href="'+basePath+'/trainDetail/index?pxid='+_data.pxid+'" target="_blank">';
					html+='									'+_data.pxkcDisplay;
					html+='								</a>';
					html+='							</h4>';
					html+='				    <span class="info">培训时间: '+_data.pxkssj+'  至  '+_data.pxjssj+'</span></br>';
					html+='				    <span class="info">培训地点: '+_data.pxdd+'</span>';
					html+='						</div>';
					html+='				</div>';
					html+='			</div>';
					html+='			<div class="col-xs-6 col-sm-3 col-xl-1 ">';
					html+='				<div class="btn-group">';
					html+='						<a	href="javascript:void(0)" class="btn btn-outline btn-default btn-squared my-btn-white m-b-0 dropdown-toggle" data-toggle="dropdown">培训操作';
					html+='						</a>';
					html+='						<ul class="dropdown-menu"   role="menu">';
					if(_data.bmzt == "1" && _data.jcnljcdz){
						html+='							<li><a data-option="survey" data-key="'+_data.wid+'" href="javascript:void(0);">课前调查</a></li>';
					}
					if(_data.yykhzt == "1" || _data.yykhzt == "5"){
						html+='							<li><a data-option="reserve" data-key="'+_data.wid+'" href="javascript:void(0);">预约考核</a></li>';
					}
					if(_data.yykhzt == "2" || _data.yykhzt=="3"){
						html+='							<li><a data-option="cancel" data-key="'+_data.wid+'" href="javascript:void(0);">取消预约</a></li>';
					}
					if(_data.khjg == "1"){
						html+='							<li><a data-option="view" data-key="'+_data.wid+'" href="javascript:void(0);">查看证书</a></li>';
					}					
					html+='						</ul>';
					html+='				</div>';
					html+='			</div>';
					html+='		</div>';
					html+='	</div>';
				}
			}
			if(html==""){
				html='<div class="h-200 vertical-align text-xs-center order-null animation-fade"><div class="vertical-align-middle font-size-18 blue-grey-500">没有符合条件的需求</div></div>';
			}else{
				$('.mypaging2').show();
			}
			$("#ulOrders").html(html);
			$("#ulOrders .dropdown-menu>li>a").click(function(){
				var data_option=$(this).attr("data-option");
				var data_wid=$(this).attr("data-key");
				if(data_option=="survey"){
					func_survey(data_wid);
				}else if(data_option=="reserve"){
					func_reserve(data_wid);
				}else if(data_option=="cancel"){
					func_cancel(data_wid); 
				}else if(data_option=="view"){
					func_view(data_wid);
				}
				
			})
			
		});
	}
	
	$('#addr-edit-moda').on('show.bs.modal', function() {  
        $$('#formModifyDate').bootstrapValidator('resetForm', true);  
        $('#formModifyDate')[0].reset();  
    });  
	
	function getParam(states, pageNum, pageSize){
		var param = "states="+states;
		if(pageSize){
			param+="&pageSize="+pageSize;
		}
		if(pageNum){
			param+="&pageNum="+pageNum;
		}
		if($('[name=keyword]').val() != null && $('[name=keyword]').val() != undefined && $('[name=keyword]').val() != ""){
			param+="&pxrwbh="+$('[name=keyword]').val();
		}
		return param;
	}
	
	function func_view(wid){
		doPost(basePath+"/xyTrain/view","wid="+wid,function(data){
			if(data.code == "0"){
				$("#khsj").html(data.datas.khsj);
				$("#zsbh").html(data.datas.zsbh);
				if(isNotEmpty(data.datas.dzzs)){
			         var imgPath=basePath+"/image/preView?wid="+data.datas.dzzs;
					 $("#dzzsImg").attr("src",imgPath)
	            }
			}
		});
		$("#addr-edit-modal").modal("show");
	}
	
	
	function func_survey(wid){
		doPost(basePath+"/xyTrain/survey","wid="+wid,function(data){
			if(data.code == "0"){
				window.location = data.datas[0].jcnljcdz;
			}
		});
	}
	
	function func_reserve(wid){
		confirm("系统将邮件通知培训人员进行考核安排，并将安排结果短信通知您，确认预约考核？",function(e){
			doPost(basePath+"/xyTrain/reserve","wid="+wid,function(data){
				if(data.code == "0"){
					alert("预约成功");
					queryOrders();
				}
			});
		});
	}
	function func_cancel(wid){
		confirm("确认取消考核预约？",function(e){
			doPost(basePath+"/xyTrain/cancel","wid="+wid,function(data){
				if(data.code == "0"){
					alert("取消成功");
					queryOrders();
				}
			});
		});
	}
});