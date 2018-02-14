/**
 * 
 */

define(function(require, exports, module) {
	var $$ = jQuery$ = require('jquery');
	require('plugins/vendor/bootstrap/validator/entrance');
	
	$('.datepicker').datepicker({
	    language: 'zh-CN',
	    autoclose:true,
	    todayHighlight:true
	})
	var _pageSize=5;
	
	var param = getParam(0, 1, _pageSize);
	queryOrders(0, param);
	
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
	
	var _currentState="0";
	
	function queryOrders(states, param){
		_currentState=states;
		doGet(basePath+"/developerQualify/queryQualify",param,function(data){
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
		doGet(basePath+"/developerQualify/queryQualify",param,function(data){
			var html="";
			if(data && data.datas){
				for(var i=0;i<data.datas.length;i++){

					var _data=data.datas[i];
					html+='<div class="center-left-body-block">';
					html+='	<div class="child">';
					html+='		<div class="img-div col-xs-2 col-sm-2">';
					html+='			<a href="'+basePath+'/rwxxDetail/index?rwid='+_data.wid+'" target="_blank" style="display:block;">';
					html+='				<img class="img-responsive" src="'+basePath+'/image/preView?wid='+_data.fjid+'">';
					html+='			</a>';
					html+='		</div>';
					html+='		<div class="left-bolck col-xs-9 col-sm-9">';
					html+='			<div class="info-body">';
					html+='				<div class="info-body-title">';
					html+='					<a href="'+basePath+'/rwxxDetail/index?rwid='+_data.wid+'" target="_blank"	class="info-body-title-name">';
					html+='						<span class="number-title">';
					html+='							<span class="">'+_data.zzlbidDisplay+'</span>';
					html+='						</span>';
					html+='						<span class="tsxx tsxx-red">已获取</span>';
					html+='					</a>';
					html+='				</div>';
					html+='			<div>';
					html+='			<div class="content1">';
					html+='				<span>'+_data.zzsm+'</span>';
					html+='			</div>';
					html+='		</div>';
					html+='		<div class="content1">';
					html+='			<label>获取时间：</label><span>'+format(_data.hqrq)+'</span>';
					html+=' 	</div>';
					html+='	</div>';
					html+='</div>';
					html+='		<div class="col-xs-12 col-sm-1">';
					html+='					<span class="pull-right">';
					html+='						<span	class="price"><span style="font-size:20px;">'+_data.zzdjidDisplay+'</span></span>';
					html+='					</span>';
					html+='		</div>';
					html+='	</div>';
					html+='</div>';
				}
			}
			if(html==""){
				html='<div class="h-200 vertical-align text-xs-center order-null animation-fade">';
				html+='<div class="vertical-align-middle font-size-18 blue-grey-500">您还没有获得证书，</div>';
				html+='<div class="vertical-align-middle font-size-18 blue-grey-500">查看<a style="color:#62a8ea"> 资质攻略 </a></div>';
				html+='</div>';
			}else{
				$('.mypaging2').show();
			}
			$("#ulOrders").html(html);
			
		});
	}
  
	
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
	

	function add0(m) {
		return m < 10 ? '0' + m : m
	}

	function format(shijianchuo) {
		// shijianchuo是整数，否则要parseInt转换
		var time = new Date(shijianchuo);
		var y = time.getFullYear();
		var m = time.getMonth() + 1;
		var d = time.getDate();

		return y + '-' + add0(m) + '-' + add0(d);
	}
	

});