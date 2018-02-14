/**
 * 
 */
define(function(require, exports, module) {
	var $$ = jQuery$ = require('jquery');
	require('plugins/vendor/bootstrap/validator/entrance');
	
	queryTotal();
	function queryTotal(){
		if($("#aTotal").size()<=0){
			return;
		}
		doGet(basePath+"/xyxx/queryTotal","",function(data){
			$("#aTotal").html(toStr(data.datas,0));
		});
	}
	
	queryPass();
	function queryPass(){
		if($("#aPass").size()<=0){
			return;
		}
		doGet(basePath+"/xyxx/queryPass","",function(data){
			$("#aPass").html(toStr(data.datas,0));
		});
	}
	
	queryDbm();
	function queryDbm(){
		if($("#spanDbm").size()<=0){
			return;
		}
		doGet(basePath+"/xyxx/queryDbm","",function(data){
			$("#spanDbm").html(toStr(data.datas,0));
		});
	}
	
	queryDyy();
	function queryDyy(){
		if($("#spanDyy").size()<=0){
			return;
		}
		doGet(basePath+"/xyxx/queryDyy","",function(data){
			$("#spanDyy").html(toStr(data.datas,0));
		});
	}
	
	queryDkh();
	function queryDkh(){
		if($("#spanDkh").size()<=0){
			return;
		}
		doGet(basePath+"/xyxx/queryDkh","",function(data){
			$("#spanDkh").html(toStr(data.datas,0));
		});
	}
	
});