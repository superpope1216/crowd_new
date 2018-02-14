
define(function(require, exports, module) {
	var $ = jQuery = require('jquery');
	require('plugins/vendor/upload/jquery.form');
	require('plugins/vendor/upload/imageUploader');
	require('plugins/vendor/upload/uploader');
	require('plugins/vendor/bootstrap/validator/entrance');
	require('plugins/vendor/select2/select2.min.css');
	require('plugins/vendor/select2/select2.full.min');
	require('plugins/vendor/bootstrap-datepicker/js/bootstrap-datepicker.min');
	require('plugins/vendor/bootstrap-datepicker/locales/bootstrap-datepicker.zh-CN.min');
	
	
	

	//初始化用户信息
    initEvent();
	initUserInfo();
	saveUserInfo();
	
	function initEvent(){
		$("#ckal").css("max-width","100%");
		$(".sfz-icon-container").mouseenter(function(){
			$(this).children(".bh-file-img-plus").css("color","#333");
		});
		$(".sfz-icon-container").mouseleave(function(){
			$(this).children(".bh-file-img-plus").css("color","#bbb");
		});
		   
	     //从业年份
	    $("input[name='cynf']").datepicker({
	  	    language: 'zh-CN',
	  	    autoclose:true,
	  	    todayHighlight:true
	  	});
	}
	
	function initUserInfo(){
		
		//上传控件
		 var uploader=new Uploader({id:"headBrower",maxSize:1024*500,propExplain:"请上传照片",uploadedFunc:function(data){
				if(true){
					var imgPath=basePath+"/image/preView?wid="+uploader.params.value;
					$("#headImg").attr("src",imgPath);
					$("#pxxyzpid").val(uploader.params.value);
				}
			}});
		$("#headUpload").click(function(){
			$("#f_headBrower").trigger("click");
		});
		
		doPostBack("../xyBasicInfo/queryTrainStudentInfo","",function(data){
			if(data.success&&isNotEmpty(data.datas)){
			    if(isNotEmpty(data.datas[0].pxxyzpid)){
			        $("#pxxyzpid").val(data.datas[0].pxxyzpid);
			         var imgPath=basePath+"/image/preView?wid="+data.datas[0].pxxyzpid;
					 $("#headImg").attr("src",imgPath)
	            }
				$("#xyWid").val(data.datas[0].wid);
				$("#yhIid").val(data.datas[0].yhid);
				$("input[name='xm']").val(data.datas[0].xm);
				$("input[name='sj']").val((data.datas[0].sj));
				$("input[name='qq']").val(data.datas[0].qq);
				$("input[name='cynf']").val(data.datas[0].cynf);
				$("input[name='fwxx'").val(data.datas[0].fwxx);
				$("input[name='scjs'").val(data.datas[0].scjs);
			}
		});
		
	}
	
	function saveUserInfo(){
		$("#saveBasicInfo").click(function(){
			 $('#formBasicInfo').bootstrapValidator("validate");
			 var formCardValidator = $('#formBasicInfo').data('bootstrapValidator');
			 if(formCardValidator.isValid()){
				 if($("#pxxyzpid").val()==""){
					 alert("请上传头像");
					 return;
				 }
				    var basicData=$("#formBasicInfo").serializeArray();
				    doPostBack(basePath+"/xyBasicInfo/saveOrUpdateTrainStudentInfo",basicData,function(data){
				    	if(data.success){
							 window.location.href=basePath+"/xyBasicInfo/index?flag=xyBasicInfo";
						}else{
							 alert(data.msg);
						}			         
				    });
			 }
		});
	}
	 function add0(m){return m<10?'0'+m:m }
	 function format(shijianchuo)
	 {
	 //shijianchuo是整数，否则要parseInt转换
	 var time = new Date(shijianchuo);
	 var y = time.getFullYear();
	 var m = time.getMonth()+1;
	 var d = time.getDate();
	
	 return y+'-'+add0(m)+'-'+add0(d);
	 }
});