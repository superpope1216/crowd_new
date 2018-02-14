define(function(require, exports, module) {

	var $ = jQuery = require('jquery');
	
	require('plugins/vendor/bootstrap/validator/entrance');
	$('.login_index form').bootstrapValidator();
	
	$("#btnLogin").click(function(){
		 var bootstrapValidator = $('.login_index form').data('bootstrapValidator');
		 bootstrapValidator.validate();
		 if(bootstrapValidator.isValid()){
	           doPost(basePath+"/login/login",$(".login_index form").serializeArray(),function(data){
	        	   if(backurl){
	        		   window.location.href=backurl;
	        	   }else{
	        		   window.location.href=basePath+"/index.jsp";
	        	   }
	           });
	       }
	});	
	
	//忘记密码
	$(".login_link a").click(function(){
		window.location.href=basePath+"/resetPwd/index";
	});
	
	
    //添加页面  回车事件
	document.onkeydown=keyDownSearch;  
    function keyDownSearch(e) {   
        var theEvent = e || window.event;    
        var code = theEvent.keyCode || theEvent.which || theEvent.charCode;    
        if (code == 13) {    
        	$("#btnLogin").trigger("click"); 
        }    
    }  
	
});