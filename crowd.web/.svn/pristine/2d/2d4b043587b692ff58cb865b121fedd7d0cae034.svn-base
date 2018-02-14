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
	    startDate:date,
	    todayHighlight:true
	})
	var _pageSize=5;
	queryOrders("0",xmzt,1,true);
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
	
	$("#btnSend").click(function(){
		doPost(basePath+"/messages/sendMessage","",function(data){
			alert("1");
		});
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
	$(".nav-tabs>li>a").click(function(){
		queryOrders($(this).attr("data-state"),null,1,true);
	});
	var _currentState="0";
	
	//模糊查询
    $(".wb-search").click(function(){
		var serchCondition=$("input[name='keyword']").val();

    	 queryOrders($("ul.shop-order-state li.active a").attr("data-state"),"",1,true,serchCondition);
    });
    $("#searchLikeRwjbxx").keydown(function(event){
    	if(event.keyCode==13){
    	 var serchCondition=$("input[name='keyword']").val();
          queryOrders($("ul.shop-order-state li.active a").attr("data-state"),"",1,true,serchCondition);
    	}
    });
	
	function queryOrders(states,xmzt,pageNum,needPage,serchCondition){
		if(pageNum==undefined){
			pageNum=1;
		}
		if(xmzt==undefined){
			xmzt="";
		}
		
		_currentState=states;
		var bashData={states:_currentState,pageNum:pageNum,pageSize:10,parentId:parentId,xmzt:xmzt,pageSize:_pageSize};
		if(typeof(serchCondition)!=undefined&&serchCondition !=""){
			bashData.serchCondition=serchCondition;
		}
		doPost(basePath+"/xqfOrder/orders",bashData,function(data){
			var html="";
			if(data && data.datas){
				if(needPage){
					$('.mypaging2').pagination({
						pageCount:data.pageInfo.totalPage,
					    showData:data.pageInfo.pageSize,
					    coping:true,
					    callback:function(api){
					    	var _cPage=api.getCurrent();
					    	queryOrders(_currentState,xmzt,_cPage,false);
					    }
					});
				}
				
				for(var i=0;i<data.datas.length;i++){
					var _data=data.datas[i];
					html+='<div class="shop-order-lists state-1">';
					html+='		<div class="row shop-order-top">';
					html+=' 		<div class="col-md-8 col-sm-8 ting">';
					html+='					<h4>'+_data.xmztDisplay;
					if(_data.xmzt=="1"){
						html+='<a data-option="queryShr" data-trigger="hover" data-key="'+_data.wid+'"  style="margin-left:4px;color:#333;"><i class="icon fa fa-user font-size-20" aria-hidden="true" ></i>';
						html+='</a>';
					}
					if(_data.xmzt=="2"){
						var _shbtgContent="<div style=\'white-space: nowrap;\'>";
						_shbtgContent+="审核人："+toStr(_data.shryxm)+"<br>";
						_shbtgContent+="不通过原因："+toStr(_data.shbtgyy);
						_shbtgContent+="</div>";
						html+='<a data-option="pop"><i class="icon pe-help1 font-size-20 hidden-xs res-tips" style="color:red;"';
						html+=' aria-hidden="true" ';
						html+=' data-trigger="hover"  ';
						html+='	data-content="'+_shbtgContent+'"';
						html+='	data-animation="fade" data-target="webuiPopover1"></i>';
						html+='</a>';
					}
					html+='					</h4>';
					if(_data.kfzid){
						html+='					<span class="info">开发者：<a href="javascript:void(0);" target="_blank"> '+toStr(_data.kfznc)+'</a></span>';
					}
					html+='			        <span class="info">需求类型:'+_data.rwlxDisplay+'</span>';
					html+='				    <span class="info">交付日期: '+_data.jfrq+'</span>';
					html+='			</div>';
					html+='			<div class="col-md-4 col-sm-4 ting text-sm-right">';
					var _je=_data.xmysje;
					var content="<div style=\'white-space: nowrap;\'>";
					var content2="需求预算："+_data.xmysje+"元";
					if(_data.zbje){
						_je=_data.zbje;
						content2="需求中标："+_data.zbje+"元";
					}
					if(_data.rwlx=="2"){//开发的BUG
						content2="该部分BUG金额由平台支付";
					}
					if(_data.jjbzje){
						_je=_je+_data.jjbzje;
						content2+="<br>平台收取加急费用："+_data.jjbzje+"元";
					}
					if(_data.ptbzje){
						_je=_je+_data.ptbzje;
						content2+="<br>平台补助开发者费用："+_data.ptbzje+"元";
						content2+="<br>补助费用是由平台支付。";
					}
					content+=content2;
					content+="</div>";
					html+='				金额 ：<span class="price  red-600">￥'+_je+'元</span>';
					html+='<a data-option="pop" style="margin-left:4px;"><i class="icon pe-help1 font-size-20 hidden-xs res-tips"';
					html+=' aria-hidden="true" ';
					html+=' data-trigger="hover"  ';
					html+='	data-content="'+content+'"';
					html+='	data-animation="fade" data-target="webuiPopover1"></i>';
					html+='</a>';
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
					var _rwmc=_data.rwmc;
					if(_rwmc && _rwmc.length>20){
						_rwmc=_rwmc.substr(0,20)+"...";
					}
					html+='								<a  href="'+basePath+'/rwxxDetail/index?rwid='+_data.wid+'" target="_blank" title="'+_data.rwmc+'">';
					html+='									NO.'+_data.rwbh+'&nbsp;&nbsp;'+_rwmc;
					html+='								</a>';
					if(_data.xmzt>=4 && _data.xmzt<=15){
						html+='								<a><span class="tsxx tsxx-green">已完成:'+_data.ywcbl+'%</span></a>';
					}
					
					html+='							</h4>';
					//html+='								<div class="col-xs-12 col-md-6">';
					html+='							<p>历史问题：'+_data.childCount+'</p>';
					//html+='                             </div>';
					//html+='								<div class="col-xs-12 col-md-6">';
					//html+='                               <span class="pull-left"> 进度：</span>'
					//html+='								  <div class="progress_bar pull-left" >';
					//html+='										<div class="pro-bar">';
					//html+='											<span class="progress-bar-inner" style="background-color: #fdba04; width: 75%;" data-value="75" data-percentage-value="75"></span>';  
					//html+='										</div>';  
					//html+='								  </div>';
					//html+='                             </div>';
					
					html+='						</div>';
					html+='				</div>';
					html+='			</div>';
					html+='			<div class="col-xs-6 col-sm-3 col-xl-2 ">';
					html+='				<div class="btn-group">';
					html+='						<a	href="javascript:void(0)" class="btn btn-outline btn-default btn-squared my-btn-white m-b-0 dropdown-toggle" data-toggle="dropdown">需求变更';
					if(_data.childCount && _data.childCount>0){
					html+='                     ('+_data.childCount+')';
					}
					html+='						</a>';
					html+='						<ul class="dropdown-menu"   role="menu">';
					if(_data.xmzt=="0"){//草稿
						html+='							<li><a data-option="edit" href="'+basePath+'/publishing/index?rwid='+_data.wid+'">编辑需求</a></li>';
						html+='							<li><a data-option="delete" data-key="'+_data.wid+'" href="javascript:void(0);">删除需求</a></li>';
					}else if(_data.xmzt=="1"){
						html+='							<li><a data-option="reback" data-key="'+_data.wid+'" href="javascript:void(0);">收回需求</a></li>';
					}
					else if(_data.xmzt=="2"){
						html+='							<li><a data-option="edit" href="'+basePath+'/publishing/index?rwid='+_data.wid+'">编辑需求</a></li>';
						
					}else if(_data.xmzt=="3"){
						html+='							<li><a data-option="modifyDate" data-key="'+_data.wid+'" href="javascript:void(0);" >修改日期</a></li>';
					}else if(_data.xmzt>=4 && _data.kfzid && _data.xmzt!=15 && _data.xmzt!=16 && _data.xmzt!=17){
						html+='							<li><a href="javascript:void(0);" data-option="publishingBug" data-key="'+_data.wid+'">发布问题</a></li>';
						html+='							<li><a href="'+basePath+'/xqfOrder/index?flag=order&parentId='+_data.wid+'" target="_blank" data-option="historyQuestion" data-key="'+_data.wid+'">历史问题('+_data.childCount+')</a></li>';
						
					}else if(_data.xmzt>=4 && _data.xmzt<=9 && _data.kfzid ){
						html+='							<li><a data-option="sqzz" data-key="'+_data.wid+'" href="#">申请终止</a></li>';
					}
					
					html+='							<li><a data-option="reSupplish" href="'+basePath+'/publishing/index?rwid='+_data.wid+'&rePublish=1">发布相似需求</a></li>';
					//html+='							<li><a href="#">重新发布</a></li>';
					//html+='							<li class="divider"></li>';
				
					html+='						</ul>';
					html+='				</div>';
					html+='			</div>';
					
						html+='			<div class="col-xs-6 col-sm-3 col-xl-2">';
						html+='				<a href="'+basePath+'/xqfOrderAction/index?rwid='+_data.wid+'&flag=order" target="_blank" class="btn btn-danger my-btn-blue btn-squared">';
						html+='					需求操作';
						html+='				</a> ';
						html+='			</div>';
					
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
			$('a[data-option="pop"]>i').webuiPopover();
//			('#addPop').on('click',function(e){
//	            $('<a href="#" class="show-pop data-placement="auto-bottom"  data-title="Dynamic Title" data-content="Dynamic content"> Dynamic created Pop </a>').appendTo('.pops');
//	        });
			$('a[data-option="queryShr"]').hover(function(){
				var _key=$(this).attr("data-key");
				doGet(basePath+"/xqfOrder/queryShr","rwid="+_key,function(data){
					var html="";
					if(data && data.datas){
						html+="<div style=\'white-space: nowrap;\'>";
						for(var i=0;i<data.datas.length;i++){
							html+=data.datas[i].kfzxm+"<br>";
						}
						html+="</div>";
					}
					$("a[data-key='"+_key+"']").webuiPopover({content:html});
				});
			});
			$("#ulOrders .dropdown-menu>li>a").click(function(){
				var data_option=$(this).attr("data-option");
				var data_key=$(this).attr("data-key");
				if(data_option=="reback"){
							func_reback(data_key);
					
					
				}else if(data_option=="modifyDate"){
					func_modifyData(data_key);
				}else if(data_option=="delete"){
					func_delete(data_key); 
				}else if(data_option=="publishingBug"){
					func_publishingBug(data_key);
				}else if(data_option=="historyQuestion"){
					//func_historyQuestion(data_key);
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
	/**
	 * 发布BUG
	 */
	function func_publishingBug(rwid){
		$$('#formQuestion').bootstrapValidator('resetForm', true); 
		$("#formQuestion")[0].reset();
		$("#formQuestion [name='rwid']").val(rwid);
		$("#questionModal").modal("show");
	}
	
	
	function func_reback(rwid){
		$$('#formReback').bootstrapValidator('resetForm', true);  
        $('#formReback')[0].reset();
        $('#formReback [name="rwid"]').val(rwid);
        var modal = $('#rebackModal');
		modal.modal("show");
	}
	
	function func_delete(rwid){
		confirm("您确认删除该需求？",function(e){
			doPost(basePath+"/xqfOrder/delete","rwid="+rwid,function(data){
				alert("任务删除成功");
				queryOrders(_currentState,null,1,true);
			})
		});
	}
	function func_modifyData(rwid){
		var modal = $('#addr-edit-modal');
		
		doGet(basePath+"/xqfOrder/queryDate","rwid="+rwid,function(data){
			if(data && data.datas){
				$("#formModifyDate [name='wid']").val(data.datas.wid);
				$("#formModifyDate [name='zbjzrq']").val(data.datas.zbjzrq);
				$("#formModifyDate [name='jfrq']").val(data.datas.jfrq);
				modal.modal("show");
			}
		});
	}
});