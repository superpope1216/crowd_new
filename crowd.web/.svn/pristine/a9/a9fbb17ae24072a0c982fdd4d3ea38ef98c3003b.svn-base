/**
 * 
 */

define(function(require, exports, module) {
	var $$ = jQuery$ = require('jquery');
	require('plugins/vendor/bootstrap/validator/entrance');
	
	var _pageSize=5;
	queryList();
	function queryList(condition,states,pageNum){
		if(pageNum==undefined){
			pageNum=1;
		}
		if(condition==undefined){
			condition="";
		}
		if(states==undefined){
			states="";
		}
		
		
		doGet(basePath+"/xqfTrainInfo/query","condition="+condition+"&states="+states+"&pageNum="+pageNum+"&pageSize="+_pageSize,function(data){
				var html="";
				if(data && data.datas){
					$('.mypaging2').pagination({
						pageCount:data.pageInfo.totalPage,
					    showData:data.pageInfo.pageSize,
					    coping:true,
					    callback:function(api){
					    	var _cPage=api.getCurrent();
					    	queryRwjbxx(_currentState,_cPage);
					    }
					});
					for(var i=0;i<data.datas.length;i++){
						var _data=data.datas[i];
						html+='<div class="shop-order-lists state-1">';
						html+='		<div class="row shop-order-top">';
						html+=' 		<div class="col-md-8 col-sm-8 ting">';
						html+='					<h4>'+_data.pxztDisplay+'</h4>';
						
						html+='			        <span class="info">需求编号:<a href="'+basePath+'/trainDetail/index?pxid='+_data.wid+'" target="_blank">'+_data.pxrwbh+'</a></span>';
						var _je=_data.jgys;
						var content="<div style=\'white-space: nowrap;\'>";
						var content2="培训预算："+_data._je+"元";
						if(_data.pxjg){
							_je=_data.pxjg;
							content2="最终金额："+_data.pxjg+"元";
						}
						content+=content2;
						content+="</div>";
						if(_data.pxzt=="1"|| _data.pxzt=="0" ||_data.pxzt=="3"){
							html+='				    <span class="info">计划开始时间: '+_data.pxjhsj+'</span>';
						}else if(_data.pxzt=="2"){
							if(_data.pxkssj){
								html+='				    <span class="info">培训开始时间: '+_data.pxkssj+'</span>';
							}else{
								html+='				    <span class="info">计划开始时间: '+_data.pxjhsj+'</span>';
							}
							
						}
						
						html+='			</div>';
						html+='			<div class="col-md-4 col-sm-4 ting text-sm-right">';
						
						html+='				金额 ：<span class="price  red-600">￥'+_je+'元</span>';
						html+='<a> <i class="icon pe-help1 font-size-20 hidden-xs res-tips"';
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
						html+='						<div class="media-body">';
						html+='							<h4 class="media-heading">';
						html+='								<a href="'+basePath+'/trainDetail/index?pxid='+_data.wid+'" target="_blank">';
						html+='									'+_data.pxkcDisplay;
						html+='								</a>';
						html+='							</h4>';
						html+='						</div>';
						html+='				</div>';
						html+='			</div>';
						html+='			<div class="col-xs-6 col-sm-3 col-xl-2 pull-right">';
						html+='				<div class="btn-group">';
						html+='						<a	href="javascript:void(0)" class="btn btn-outline btn-default btn-squared my-btn-white m-b-0 dropdown-toggle" data-toggle="dropdown">培训详情';
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
							
						}else {
							html+='							<li><a data-option="modifyDate" data-key="'+_data.wid+'" href="javascript:void(0);" >培训安排</a></li>';
						}
						
						//html+='							<li><a href="#">重新发布</a></li>';
						//html+='							<li class="divider"></li>';
					
						html+='						</ul>';
						html+='				</div>';
						html+='			</div>';
						
						html+='		</div>';
						html+='	</div>';
					}
				}
				if(html==""){
					$('.mypaging2').pagination({
						pageCount:0,
					    coping:true,
					    callback:function(api){
					    }
					});
					html='<div class="h-200 vertical-align text-xs-center order-null animation-fade"><div class="vertical-align-middle font-size-18 blue-grey-500">没有符合条件的需求</div></div>'
				}
				$("#ulOrders").html(html);
		});
	}
});