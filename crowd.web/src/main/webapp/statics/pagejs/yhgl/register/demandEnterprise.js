define(function(require, exports, module) {

	var $$ = jQuery = require('jquery');
	require('plugins/vendor/upload/jquery.form');
	require('plugins/vendor/upload/imageUploader');
	require('plugins/vendor/upload/uploader');
	require('plugins/vendor/bootstrap/validator/entrance');
    //基本事件
	addEvent();
	//初始化完善用户基本信息事件
	initPerfectUser();
	initSelect();
	saveUserInfo();
	//initCaklScroll();//参考案例滚动
	//$$('#userRegister').bootstrapValidator();
	function addEvent(){
		//注册按钮 
		$("#btnRegister").click(function(){
			 $$('#userRegister').bootstrapValidator("validate");
			 var bootstrapValidator = $$('#userRegister').data('bootstrapValidator');
			 if(bootstrapValidator.isValid()){
				    var basicData=$("#userRegister").serializeArray();
			        basicData.push({"name":"userRange","value":"2"});
		            doPost(basePath+"/register/demandRegister",basicData,function(data){
		       	   if(data.success){
		        		initUserInfo();
		        		$("#userRegister").hide();
		       			$("#regTop ul li").eq(0).removeClass("now");
		       			$("#regTop ul li").eq(1).addClass("now");
		       			$("#perfectData").show();
		        	   }else{
		        		   alert(data.msg);
		        	   }
		          });
		       }
		});
		//点击获取验证码
		$("#btnGetVerification").click(function(){
			  $$("#userRegister").bootstrapValidator("validate");
			  $$("#userRegister").data('bootstrapValidator').resetForm();
			  $$("#userRegister").data('bootstrapValidator').validateField("sjh");
			  var bootstrapValidator = $$('#userRegister').data('bootstrapValidator');
			  var _sjh=$("input[name='sjh']").val();
			  if(_sjh==""||!(/^1[34578]\d{9}$/.test(_sjh))){
				  return;
			  }
			  $("#btnGetVerification").attr("disabled",true);
			  $("#btnGetVerification").val("正在发送...");
			doPostBack(basePath+"/register/sendVerification",{phone:_sjh},function(data){
				if(data.success){
					var times = 60;
		        	var timer = setInterval(function() {
		        		if (times < 1) {
		        			clearInterval(timer); 
		        			$("#btnGetVerification").val("点击获取验证码"); 
		        			$("#btnGetVerification").attr("disabled",false); 
		        			return;
		        		}
		        		$("#btnGetVerification").val("已发送 ("+ times +")");
		        		times --;
		        	}, 1000);
				}else{
					$$("#userRegister").data('bootstrapValidator').resetForm();
					$("#btnGetVerification").val("点击获取验证码"); 
        			$("#btnGetVerification").attr("disabled",false);
        			if(data.code=="-4"){
		               $("input[name='sjh']").parent("div").after('<small class="help-block" data-bv-validator="regexp" data-bv-for="sjh" data-bv-result="INVALID" style="display: inline;color:#f96868;">'+data.msg+'</small>');
                    }else{
 		               $("input[name='sjh']").parent("div").after('<small class="help-block" data-bv-validator="regexp" data-bv-for="sjh" data-bv-result="INVALID" style="display: inline;color:#f96868;">'+data.msg+'</small>');
                    }
				}
			});
		 });
	}
	
	function initPerfectUser(){
		
		$("#tabs-green li a").click(function(){
			$("#tabs-green li a").removeClass("active");
			$(this).addClass("active");
			if($(this).attr("data-num")=="1"){
				$("#three").show();
				$("#threeAndOne").hide();
			}else{
				$("#three").hide();
				$("#threeAndOne").show();
			}
		});
		$("select[name='userRange']").val(2);
		$("select[name='userRange']").attr("disabled",true);
		$(".sfz-icon-container").mouseenter(function(){
			$(this).children(".bh-file-img-plus").css("color","#333");
		});
		$(".sfz-icon-container").mouseleave(function(){
			$(this).children(".bh-file-img-plus").css("color","#bbb");
		});
		$("#ckal").css("max-width","100%");
		
		//上传
		 var uploader=new Uploader({id:"headBrower",maxSize:1024*500,propExplain:"请上传照片",uploadedFunc:function(data){
				if(true){
					var imgPath=basePath+"/image/preView?wid="+uploader.params.value;
					$("#headImg").attr("src",imgPath);
					$("#zpfjid").val(uploader.params.value);
				}
			}});
		$("#headUpload").click(function(){
			$("#f_headBrower").trigger("click");
		});
		
		
		 var sfzzmztjidUploader=new Uploader({id:"sfzzmztjidBrower",maxSize:1024*500,propExplain:"请上传照片",uploadedFunc:function(data){
				if(true){
					var imgPath=basePath+"/image/preView?wid="+sfzzmztjidUploader.params.value;
					$("#sfzzmztjidImg").attr("src",imgPath);
					$("#sfzzmztjid").val(sfzzmztjidUploader.params.value);
					$("#sfzzmztjidImg").css("width","290px");
					$("#sfzzmztjidImg").css("z-index","0");
				}
			}});
		$("#sfzzmztjidUpload").click(function(){
			$("#f_sfzzmztjidBrower").trigger("click");
		});
		
		 var sfzfmztjidUploader=new Uploader({id:"sfzfmztjidBrower",maxSize:1024*500,propExplain:"请上传照片",uploadedFunc:function(data){
				if(true){
					var imgPath=basePath+"/image/preView?wid="+sfzfmztjidUploader.params.value;
					$("#sfzfmztjidImg").attr("src",imgPath);
					$("#sfzfmztjid").val(sfzfmztjidUploader.params.value);
					$("#sfzfmztjidImg").css("width","290px");
					$("#sfzfmztjidImg").css("z-index","0");
				}
			}});
		$("#sfzfmztjidUpload").click(function(){
			$("#f_sfzfmztjidBrower").trigger("click");
		});
		 var businessLicenceScannerUploader=new Uploader({id:"businessLicenceScannerBrower",maxSize:1024*500,propExplain:"请上传照片",uploadedFunc:function(data){
				if(true){
					var imgPath=basePath+"/image/preView?wid="+businessLicenceScannerUploader.params.value;
					$("#businessLicenceScannerImg").attr("src",imgPath);
					$("#businessLicenceScanner").val(businessLicenceScannerUploader.params.value);
					$("#businessLicenceScannerImg").css("width","290px");
					$("#businessLicenceScannerImg").css("z-index","0");
				}
			}});
		$("#businessLicenceScannerUpload").click(function(){
			$("#f_businessLicenceScannerBrower").trigger("click");
		});
		
		
		 var organizateCodeScannerUploader=new Uploader({id:"organizateCodeScannerBrower",maxSize:1024*500,propExplain:"请上传照片",uploadedFunc:function(data){
				if(true){
					var imgPath=basePath+"/image/preView?wid="+organizateCodeScannerUploader.params.value;
					$("#organizateCodeScannerImg").attr("src",imgPath);
					$("#organizateCodeScanner").val(organizateCodeScannerUploader.params.value);
					$("#organizateCodeScannerImg").css("width","290px");
					$("#organizateCodeScannerImg").css("z-index","0");
				}
			}});
		$("#organizateCodeScannerUpload").click(function(){
			$("#f_organizateCodeScannerBrower").trigger("click");
		});
		
		 var taxRegistrationScannerUploader=new Uploader({id:"taxRegistrationScannerBrower",maxSize:1024*500,propExplain:"请上传照片",uploadedFunc:function(data){
				if(true){
					var imgPath=basePath+"/image/preView?wid="+taxRegistrationScannerUploader.params.value;
					$("#taxRegistrationScannerImg").attr("src",imgPath);
					$("#taxRegistrationScanner").val(taxRegistrationScannerUploader.params.value);
					$("#taxRegistrationScannerImg").css("width","290px");
					$("#taxRegistrationScannerImg").css("z-index","0");
				}
			}});
		$("#taxRegistrationScannerUpload").click(function(){
			$("#f_taxRegistrationScannerBrower").trigger("click");
		});
	}
	
	function initSelect(){
		//省
		$("select[name='perProvince']").change(function(){
			 var value=$(this).find("option:selected").attr("value");
			 var text=$(this).find("option:selected").text();
			 
	             if(isEmpty(value)){
	            	 return;
	             }
			 $("select[name='perCity']").empty();
			 var url=basePath+"/kfzSupply/queryXzqhInfoList";
             var params={ls:value};
             doSynchrPostBack(url, params, function(data){
					var result=data.datas;
					for(var i=0;i<result.length;i++){
						if(i==0){
							value=result[i].lbdm;
						}
						$("select[name='perCity']").append("<option  value="+result[i].lbdm+">"+result[i].lbmc+"</option>");
		            }
				});
           
             $("select[name='perArea']").empty();
             var params={ls:value};
             doSynchrPostBack(url, params, function(data){
					var result=data.datas;
					for(var i=0;i<result.length;i++){
						$("select[name='perArea']").append("<option value="+result[i].lbdm+">"+result[i].lbmc+"</option>");
		            }
				});
             
		});
		//市
		$("select[name='perCity']").change(function(){
			
			 var value=$(this).find("option:selected").attr("value");
             var params={ls:value};
             if(isEmpty(value)){
            	 return;
             }
             $("select[name='perArea']").empty();
             var url=basePath+"/kfzSupply/queryXzqhInfoList";
             doPostBack(url, params, function(data){
					var result=data.datas;
					for(var i=0;i<result.length;i++){
						$("select[name='perArea']").append("<option value="+result[i].lbdm+">"+result[i].lbmc+"</option>");
		            }
				});
			
		});
		
	}
	
	function saveUserInfo(){
		
		//上一步
		$("#btnResumePre").click(function(){
			$("#regTop ul li").eq(2).removeClass("now");
       	    $("#regTop ul li").eq(1).addClass("now");
			$("#ulCardInfo").hide();
			$("#ulBasicInfo").show();
		});
		
		//保存并继续
		$("#btnBasicNext").click(function(){
			$$('#formBasicInfo').bootstrapValidator("validate");
		    var formBasicValidator = $$('#formBasicInfo').data('bootstrapValidator');
			formBasicValidator.validate();
		     if(formBasicValidator.isValid()){
		    	 if($("#zpfjid").val()==""){
		    		 alert("请上传头像");
		    		 return;
		    	 }
	    	  var basicData=$("#formBasicInfo").serializeArray();
			  doPostBack(basePath+"/xqfConfrim/saveXqfxxBasicInfo",basicData,function(data){
		    	  if(data.success){
		    		    $("#regTop ul li").eq(1).removeClass("now");
			       	    $("#regTop ul li").eq(2).addClass("now");
						$("#ulBasicInfo").hide();
						$("#ulCardInfo").show();
		    	  }else{
		    		 alert(data.msg);
		    	  }
	           });
		     }
			
		});
		
		$("#saveXqfxxInfo").click(function(){
			   $$('#formCardInfo').bootstrapValidator("validate");
				 var formCardValidator = $$('#formCardInfo').data('bootstrapValidator');
			     if(formCardValidator.isValid()){
			    	 if($("#sfzzmztjid").val()==""||$("#sfzfmztjid").val()==""||$("#businessLicenceScanner").val()==""){
				  		   alert("请上传完整的身份信息感谢你的支持");
				  		   return;
				  	     }
					    var enterpriseQualificateType=$("#tabs-green li a.active").attr("data-num");
					    if("1"==enterpriseQualificateType){//选择三证时  营业执照和组织机构代码 必填
					    	if($("#organizateCodeScanner").val()==""){
					    	    alert("请上传完整的身份信息感谢你的支持");
					    		return;
					    	}
					    }
					    var wid=$("#wid").val();
					    var basicData=$("#formCardInfo").serializeArray();
					    basicData.push({"name":"wid","value":wid});
					    basicData.push({"name":"shzt","value":1});
					    basicData.push({"name":"userRange","value":2});
					    basicData.push({"name":"enterpriseQualificateType","value":enterpriseQualificateType});
				      doPostBack(basePath+"/xqfConfrim/saveRegisterXqfxxCardInfo",basicData,function(data){
				    	  if(data.success){
				    		 window.location.href=basePath+"/xqfConfrim/index?flag=xqfconfirm";
				    	  }else{
				    		 alert(data.msg);
				    	  }
			          });
			     }
		});
		
	}
	
	function initUserInfo(){
		doPostBack("../xqfSupply/queryXqfxxInfo","",function(data){
			if(data.success&&isNotEmpty(data.datas)){
				$("#wid").val(data.datas[0].wid);
			}
		});
	}
	
	function initCaklScroll(){
	   
	}
});