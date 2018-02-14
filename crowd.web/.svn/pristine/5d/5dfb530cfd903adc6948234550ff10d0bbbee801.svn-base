define(function(require, exports, module) {

	var $$ = jQuery = require('jquery');
	var clickAgree=false;
	require('plugins/vendor/bootstrap/validator/entrance');
	$("#myModal").modal("show");
	$('#myModal').on('hidden.bs.modal', function () {
		if(clickAgree==false){
			window.location.href=basePath+"/index.jsp";
		}
	});
	
	$("#btnAgree").click(function(){
		clickAgree=true;
		$("#myModal").modal("hide");
	});
	
	
	
	//新增
	$("#btnNextStep").click(function(){
		$("#demandSideDeveloper").hide();
		$("#personalSideEnterprise").show();
	});
	$("#btnBackStep").click(function(){
		$("#demandSideDeveloper").show();
		$("#personalSideEnterprise").hide();
	});

	$("#demand").click(function(){
		$("#developer").removeClass("radio-select");
		$("#developer").addClass("radio-moren");
		$(this).removeClass("radio-moren");
		$(this).addClass("radio-select");
	});
	$("#developer").click(function(){
		$("#demand").removeClass("radio-select");
		$("#demand").addClass("radio-moren");
		$(this).removeClass("radio-moren");
		$(this).addClass("radio-select");
	});
	$("#personal").click(function(){
		$("#enterprise").removeClass("radio-select");
		$("#enterprise").addClass("radio-moren");
		$(this).removeClass("radio-moren");
		$(this).addClass("radio-select");
	});
	$("#enterprise").click(function(){
		$("#personal").removeClass("radio-select");
		$("#personal").addClass("radio-moren");
		$(this).removeClass("radio-moren");
		$(this).addClass("radio-select");
	});
		
	$("#registerNow").click(function(){
	  if($("#demand").hasClass("radio-select")&&$("#personal").hasClass("radio-select")){
			window.location.href=basePath+"/register/demandPersonal";
	  }
	  if($("#demand").hasClass("radio-select")&&$("#enterprise").hasClass("radio-select")){
			window.location.href=basePath+"/register/demandEnterprise";
	  }
	  if($("#developer").hasClass("radio-select")&&$("#personal").hasClass("radio-select")){
			window.location.href=basePath+"/register/developerPersonal";
	  }
	  if($("#developer").hasClass("radio-select")&&$("#enterprise").hasClass("radio-select")){
			window.location.href=basePath+"/register/developerEnterprise";
	  }
	     
	});
    	
});