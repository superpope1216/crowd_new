define(function(require, exports, module) {

	var $ = jQuery = require('jquery');
	require('plugins/vendor/bootstrap/bootstrap.min');
	if(page_type == 'login')require.async('pagejs/yhgl/login');
	if(page_type == 'register')require.async('pagejs/yhgl/register');
	if(page_type == 'yhjbxx')require.async('pagejs/yhgl/yhjbxx');
	if(page_type == 'rbxxgl')require.async('pagejs/yhgl/kfzxx/rbxxgl');
	if(page_type == 'kfzrbgl')require.async('pagejs/kfzgl/kfzrbgl/kfzrbgl');
	if(page_type == 'publishing')require.async('pagejs/center/publishing');
	if(page_type == 'demandMessage')require.async('pagejs/message/demandMessage/demandMessage');
	if(page_type=="kfzSupplyBasic"){
		require.async('pagejs/kfzgl/first/kfzSupplyBasic');
	}
	if(page_type=="xqfOrder")require.async('pagejs/xqfgl/rwgl/order');
	if(page_type=="kfzOrder")require.async('pagejs/kfzgl/rwgl/order');
	if(page_type=="kfzCfOrder")require.async('pagejs/kfzgl/rwgl/cf_order');
	if(page_type=="kfzOrderAction")require.async('pagejs/kfzgl/rwgl/orderAction');
	if(page_type=="xqfxx")require.async('pagejs/xqfgl/xqfxx/index');
	if(page_type=="kfzxx")require.async('pagejs/kfzgl/kfzxx/index');
	if(page_type=="xqfMoney")require.async('pagejs/xqfgl/money/index');
	if(page_type=="kfzMoney")require.async('pagejs/kfzgl/money/index');
	if(page_type=="xqfOrderAction"){
		require.async('pagejs/xqfgl/rwgl/orderAction');
	}
	if(page_type=="xqfSupplyBasic"){
		require.async('pagejs/xqfgl/first/xqfSupplyBasic');
	}
	if(page_type=="kfzxxConfirm"){
		require.async('pagejs/kfzgl/confirm/kfzxxConfirm');
	}
	if(page_type=="xqfxxConfirm"){
		require.async('pagejs/xqfgl/confirm/xqfxxConfirm');
	}
	
	if(page_type=="yjsjptjy")require.async('pagejs/gzzx/yjsjptjy');
	if(page_type=="yjsjjnjy")require.async('pagejs/gzzx/yjsjjnjy');
	if(page_type=="yjsjpxjy")require.async('pagejs/gzzx/yjsjpxjy');
	if(page_type=="trainApply")require.async('pagejs/train/apply');
	if(page_type=="trainCenter")require.async('pagejs/train/center');
	if(page_type=="xqfTrainInfo")require.async('pagejs/xqfgl/train/index');   
	if(page_type=="pxxxDetail")require.async('pagejs/train/pxxxDetail');
	if(page_type=="xyxx")require.async('pagejs/train/trainee/index');
	if(page_type=="xyBasicInfo")require.async('pagejs/train/trainee/xyBasicInfo');
	if(page_type=="myTrain")require.async('pagejs/train/trainee/myTrain');
	if(page_type=="demandPersonal")require.async('pagejs/yhgl/register/demandPersonal');
	if(page_type=="demandEnterprise")require.async('pagejs/yhgl/register/demandEnterprise');
	if(page_type=="developerPersonal")require.async('pagejs/yhgl/register/developerPersonal');
	if(page_type=="developerEnterprise")require.async('pagejs/yhgl/register/developerEnterprise');
	if(page_type=="download")require.async('pagejs/train/download');
	if(page_type=="deskstop")require.async('pagejs/yhgl/deskstop');
	if(page_type=="kfzAccount")require('pagejs/kfzgl/account/kfzAccount');
	if(page_type=="xqfAccount")require('pagejs/xqfgl/account/xqfAccount');
	if(page_type=="resetPwd")require('pagejs/yhgl/resetPwd/resetPwd');
	if(page_type=="qualify")require.async('pagejs/train/trainee/qualify');
	if(page_type=="estimateStandard")require('pagejs/center/estimateStandard');
	if(page_type=="kfzzxIndex")require('pagejs/kfzzx/index');
	
	
});
