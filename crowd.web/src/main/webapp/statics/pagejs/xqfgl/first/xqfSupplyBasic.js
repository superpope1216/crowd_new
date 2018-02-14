/**
 * 
 */
define(function(require, exports, module) {
	var $ = jQuery = require('jquery');
	require('plugins/vendor/upload/jquery.form');
	require('plugins/vendor/upload/imageUploader');
	require('plugins/vendor/upload/uploader');
	require('plugins/vendor/bootstrap/validator/entrance');
	initSelect();
	initUserInfo();
	saveUserInfo();

	
	$(".nav-tabs li a").click(function(){
		//切换添加表单验证
		var flag=$(".nav-tabs li a.active").attr("id");
		if(flag=="aBasic"){//验证基本信息
		    $('#formBasicInfo').bootstrapValidator("validate");
			 var formBasicValidator = $('#formBasicInfo').data('bootstrapValidator');
			 formBasicValidator.validate();
			    if(!formBasicValidator.isValid()){
			    	 return false;
			     }
			     if($("#zpfjid").val()==""){
		    		 alert("请上传头像");
		    		 return false;
		    	 }
		}else{
			  checkChangeCard();
			   $("#formCardInfo").data('bootstrapValidator').destroy();
			   $('#formCardInfo').bootstrapValidator("validate");
				 var formCardValidator = $('#formCardInfo').data('bootstrapValidator');
			     if(!formCardValidator.isValid()){
			    	  return false;
			    	   if($("#zpfjid").val()==""){
				    		 alert("请上传头像");
				    		 return;
				      }
			     }
			     
		     var userRange=$("select[name='userRange']").val();
	  	       var enterpriseQualificateType=$("#tabs-green li a.active").attr("data-num");
			   if(userRange=="1"){//个人认证 保存
				   if($("#sfzzmztjid").val()==""||$("#sfzfmztjid").val()==""){
			  		   alert("请上传完整的身份信息感谢你的支持");
			  		   return;
			  	     } 
			   }else{//企业认证保存
				   if($("#sfzzmztjid").val()==""||$("#sfzfmztjid").val()==""||$("#businessLicenceScanner").val()==""){
			  		   alert("请上传完整的身份信息感谢你的支持");
			  		   return;
			  	     } 
				    if("1"==enterpriseQualificateType){//选择三证时  营业执照和组织机构代码 必填
				    	if($("#organizateCodeScanner").val()==""){
				    	    alert("请上传完整的身份信息感谢你的支持");
				    		return;
				    	}
				    }
               }
			
			
		}
		
		$(".nav-tabs li").removeClass("active");
	    $(".nav-tabs li a").removeClass("active");
		if($(this).attr("id")=="aBasic"){
			$("#ulCardInfo").hide();
			$("#ulResumeInfo").hide();
			$("#ulBasicInfo").show();
			$("#aBasic").addClass("active");
			
		}else if($(this).attr("id")=="aResume"){
			$("#ulBasicInfo").hide();
			$("#ulCardInfo").hide();
			$("#ulResumeInfo").show();
			$("#aResume").addClass("active");
		}else if($(this).attr("id")=="aCard"){
	    	 $("#ulBasicInfo").hide();
			 $("#ulResumeInfo").hide();
			 $("#ulCardInfo").show();
			 $("#aCard").addClass("active");
		}
	});
	
	function initUserInfo(){
		
	//  企业资质类型tab页切换
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
		$("select[name='userRange']").change(function(){
			 var value=$(this).find("option:selected").attr("value");
	        if(value=="2"){
	       	$("#enterpriseCard").show();
	       	$("input[name='companyMc']").parent("div").parent("div").show();
	       	$("input[name='xm']").parent("div").prev("label").text("法定代表人姓名");
	       	$("input[name='sfzjh']").parent("div").prev("label").text("法定代表人身份证号");
	       	$("#sfzzmztjidUpload").parent("div").prev("label").text("法定代表人身份证正面扫描件(500kb以内)");
	       	$("#sfzfmztjidUpload").parent("div").prev("label").text("法定代表人身份证反面扫描件(500kb以内)");
	         }else{
	           $("#enterpriseCard").hide();
	           $("input[name='companyMc']").parent("div").parent("div").hide();
	       	$("input[name='xm']").parent("div").prev("label").text("真实姓名");
	       	$("input[name='sfzjh']").parent("div").prev("label").text("身份证号");
	       	$("#sfzzmztjidUpload").parent("div").prev("label").text("身份证正面照附件(500kb以内)");
	       	$("#sfzfmztjidUpload").parent("div").prev("label").text("身份证反面照附件(500kb以内)");
	         }
		});
		$(".sfz-icon-container").mouseenter(function(){
			$(this).children(".bh-file-img-plus").css("color","#333");
		});
		$(".sfz-icon-container").mouseleave(function(){
			$(this).children(".bh-file-img-plus").css("color","#bbb");
		});
		$("#ckal").css("max-width","100%");
	
		$("#btnResumePre").click(function(){
			$(".nav-tabs li").removeClass("active");
		    $(".nav-tabs li a").removeClass("active");
			$("#aBasic").addClass("active");
			$("#ulCardInfo").hide();
			$("#ulBasicInfo").show();
		});
		
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
					$("#sfzzmztjidImg").css("width","303px");
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
					$("#sfzfmztjidImg").css("width","303px");
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
					$("#businessLicenceScannerImg").css("width","303px");
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
					$("#organizateCodeScannerImg").css("width","303px");
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
					$("#taxRegistrationScannerImg").css("width","303px");
					$("#taxRegistrationScannerImg").css("z-index","0");
				}
			}});
		$("#taxRegistrationScannerUpload").click(function(){
			$("#f_taxRegistrationScannerBrower").trigger("click");
		});
		 $("select[name='userRange']").val(1);//初次进入页面 默认 是个人
		//初始化  用户数据
		doSynchrPostBack("../xqfSupply/queryXqfxxInfo","",function(data){
			if(data.success&&isNotEmpty(data.datas)){
			
			    if(isNotEmpty(data.datas[0].zpfjid)){
			    	 $("#zpfjid").val(data.datas[0].zpfjid);
			         var imgPath=basePath+"/image/preView?wid="+data.datas[0].zpfjid;
					 $("#headImg").attr("src",imgPath);
	            }
	            if(isNotEmpty(data.datas[0].sfzzmztjid)){
			    	$("#sfzzmztjid").val(data.datas[0].sfzzmztjid);
			   	     var imgPath=basePath+"/image/preView?wid="+data.datas[0].sfzzmztjid;
				    $("#sfzzmztjidImg").attr("src",imgPath);
				    $("#sfzzmztjidImg").css("width","303px");
				    $("#sfzzmztjidImg").css("z-index","0");
	            }
	            if(isNotEmpty(data.datas[0].sfzfmztjid)){
			    	$("#sfzfmztjid").val(data.datas[0].sfzfmztjid);
			    	 var imgPath=basePath+"/image/preView?wid="+data.datas[0].sfzfmztjid;
					 $("#sfzfmztjidImg").attr("src",imgPath);
					 $("#sfzfmztjidImg").css("width","303px");
					 $("#sfzfmztjidImg").css("z-index","0");
	            }
	            if(isNotEmpty(data.datas[0].businessLicenceScanner)){
	            	$("#businessLicenceScanner").val(data.datas[0].businessLicenceScanner);
			    	 var imgPath=basePath+"/image/preView?wid="+data.datas[0].businessLicenceScanner;
					 $("#businessLicenceScannerImg").attr("src",imgPath);
					 $("#businessLicenceScannerImg").css("width","303px");
					 $("#businessLicenceScannerImg").css("z-index","0");
	            }
	            if(isNotEmpty(data.datas[0].organizateCodeScanner)){
	            	$("#organizateCodeScanner").val(data.datas[0].organizateCodeScanner);
			    	 var imgPath=basePath+"/image/preView?wid="+data.datas[0].organizateCodeScanner;
					 $("#organizateCodeScannerImg").attr("src",imgPath);
					 $("#organizateCodeScannerImg").css("width","303px");
					 $("#organizateCodeScannerImg").css("z-index","0");
	            }
	            if(isNotEmpty(data.datas[0].taxRegistrationScanner)){
	            	$("#taxRegistrationScanner").val(data.datas[0].taxRegistrationScanner);
			    	 var imgPath=basePath+"/image/preView?wid="+data.datas[0].taxRegistrationScanner;
					 $("#taxRegistrationScannerImg").attr("src",imgPath);
					 $("#taxRegistrationScannerImg").css("width","303px");
					 $("#taxRegistrationScannerImg").css("z-index","0");
	            }
	            if(isNotEmpty(data.datas[0].enterpriseQualificateType)){
	            	$("#tabs-green li a").removeClass("active");
	            	var  enterpriseQualificateType=data.datas[0].enterpriseQualificateType;
	            	$("#tabs-green li a[data-num='"+enterpriseQualificateType+"']").addClass("active");
	            	if("1"==enterpriseQualificateType){
	            		$("#three").show();
	    				$("#threeAndOne").hide();
	            	}else{
	            		$("#three").hide();
	    				$("#threeAndOne").show();
	            	}
	            }
				$("#wid").val(data.datas[0].wid);
				$("input[name='nc']").val(data.datas[0].nc);
				$("input[name='xqfdwmc']").val(data.datas[0].xqfdwmc);
				$("input[name='qqh']").val(data.datas[0].qqh);
				$("input[name='wxh']").val(data.datas[0].wxh);
				$("input[name='xm'").val(data.datas[0].xm);
				$("input[name='sfzjh'").val(data.datas[0].sfzjh);
	            
	            if(isNotEmpty(data.datas[0].perProvince)){
	            	$("select[name='perProvince']").val(data.datas[0].perProvince);
	            }
	            if(isNotEmpty(data.datas[0].perCity)){
	            	$("select[name='perCity']").val(data.datas[0].perCity);
	            }
	            if(isNotEmpty(data.datas[0].perArea)){
	            	$("select[name='perArea']").val(data.datas[0].perArea);
	            }
	            if(isNotEmpty(data.datas[0].xqflb)){
	            	$("select[name='xqflb']").val(data.datas[0].xqflb);
	            }
	            if(isNotEmpty(data.datas[0].userRange)){
	            	$("select[name='userRange']").val(data.datas[0].userRange);
	            	var userRange=data.datas[0].userRange;
	            	  if(userRange=="2"){
	      	        	$("#enterpriseCard").show();
	      	        	$("input[name='companyMc']").parent("div").parent("div").show();
	      	        	$("input[name='xm']").parent("div").prev("label").text("法定代表人姓名");
	      	        	$("input[name='sfzjh']").parent("div").prev("label").text("法定代表人身份证号");
	      	        	$("#sfzzmztjidUpload").parent("div").prev("label").text("法定代表人身份证正面扫描件(500kb以内)");
	      	        	$("#sfzfmztjidUpload").parent("div").prev("label").text("法定代表人身份证反面扫描件(500kb以内)");
	      	          }else{
	      	            $("#enterpriseCard").hide();
	      	            $("input[name='companyMc']").parent("div").parent("div").hide();
	      	        	$("input[name='xm']").parent("div").prev("label").text("真实姓名");
	      	        	$("input[name='sfzjh']").parent("div").prev("label").text("身份证号");
	      	        	$("#sfzzmztjidUpload").parent("div").prev("label").text("身份证正面照附件(500kb以内)");
	      	        	$("#sfzfmztjidUpload").parent("div").prev("label").text("身份证反面照附件(500kb以内)");
	      	          }
	            }
	            //新增字段
		           $("input[name='businessLicenceNo']").val(data.datas[0].businessLicenceNo);
		           $("input[name='organizateCodeNo']").val(data.datas[0].organizateCodeNo);
		           $("input[name='taxRegistrationNo']").val(data.datas[0].taxRegistrationNo);
		           $("input[name='socialCreditCode']").val(data.datas[0].socialCreditCode);
		           $("input[name='companyMc']").val(data.datas[0].companyMc);
		           $("input[name='zfbzh']").val(data.datas[0].zfbzh);
		           $("input[name='lxydzyx']").val(data.datas[0].lxydzyx);
			}
		});
		
		
	}
	
	function saveUserInfo(){
		
		
		//下一步
		$("#btnBasicNext").click(function(){
		   $('#formBasicInfo').bootstrapValidator("validate");
		    var formBasicValidator = $('#formBasicInfo').data('bootstrapValidator');
			formBasicValidator.validate();
		     if(formBasicValidator.isValid()){
		    	 if($("#zpfjid").val()==""){
		    		 alert("请上传头像");
		    		 return;
		    	 }
		        $(".nav-tabs li").removeClass("active");
		 	    $(".nav-tabs li a").removeClass("active");
				$("#aCard").addClass("active");
				$("#ulBasicInfo").hide();
				$("#ulCardInfo").show();
		     }
			
		});
		
		
		$("form").bootstrapValidator({  
		    excluded:[":disabled"]//关键配置，表示只对于禁用域不进行验证，其他的表单元素都要验证  
		});
		
		$("#saveXqfxxInfo").click(function(){
			   checkChangeCard();
			   $("#formCardInfo").data('bootstrapValidator').destroy();
			   $('#formBasicInfo').bootstrapValidator("validate");
			   $('#formCardInfo').bootstrapValidator("validate");
				 var formCardValidator = $('#formCardInfo').data('bootstrapValidator');
				 var formBasicValidator = $('#formBasicInfo').data('bootstrapValidator');
			     if(formCardValidator.isValid()&&formBasicValidator.isValid()){
			    	  var basicData=$("#formBasicInfo").serializeArray();
			    	  var cardData=$("#formCardInfo").serializeArray();
			    	  for(var i=0;i<cardData.length;i++){
							basicData.push(cardData[i]);
						}
			    	   if($("#zpfjid").val()==""){
				    		 alert("请上传头像");
				    		 return;
				    	 }
			    	   var userRange=$("select[name='userRange']").val();
			  	       var enterpriseQualificateType=$("#tabs-green li a.active").attr("data-num");

					   if(userRange=="1"){//个人认证 保存
						   if($("#sfzzmztjid").val()==""||$("#sfzfmztjid").val()==""){
					  		   alert("请上传完整的身份信息感谢你的支持");
					  		   return;
					  	     } 
					   }else{//企业认证保存
						   if($("#sfzzmztjid").val()==""||$("#sfzfmztjid").val()==""||$("#businessLicenceScanner").val()==""){
					  		   alert("请上传完整的身份信息感谢你的支持");
					  		   return;
					  	     } 
						    if("1"==enterpriseQualificateType){//选择三证时  营业执照和组织机构代码 必填
						    	if($("#organizateCodeScanner").val()==""){
						    	    alert("请上传完整的身份信息感谢你的支持");
						    		return;
						    	}
						    }
						    basicData.push({"name":"enterpriseQualificateType","value":enterpriseQualificateType});
	                     }
					   
			    	  basicData.push({"name":"shzt","value":"1"});
				      doPostBack(basePath+"/xqfSupply/insertFirstXqfxxInfo",basicData,function(data){
				    	  if(data.success){
				    		 window.location.href=basePath+"/xqfConfrim/index?flag=xqfconfirm";
				    	  }else{
				    		 alert(data.msg);
				    	  }
			          });
			     }
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
	  //个人企业  认证 变化校验 
	function checkChangeCard(){
		var userRange=$("select[name='userRange']").val();
		   if(userRange=="1"){//个人 去除 企业必填验证
	        $("input[name='socialCreditCode']").attr("data-bv-notempty","false");
	        $("input[name='organizateCodeNo']").attr("data-bv-notempty","false");
	        $("input[name='businessLicenceNo']").attr("data-bv-notempty","false");
		  }else{
		  $("input[name='socialCreditCode']").attr("data-bv-notempty","true");
	      $("input[name='organizateCodeNo']").attr("data-bv-notempty","true");
	      $("input[name='businessLicenceNo']").attr("data-bv-notempty","true");
		  }
	     var enterpriseQualificateType=$("#tabs-green li a.active").attr("data-num");
	     if(enterpriseQualificateType=="1"){
		      $("input[name='organizateCodeNo']").attr("data-bv-notempty","true");
		      $("input[name='businessLicenceNo']").attr("data-bv-notempty","true");
	    	  $("input[name='socialCreditCode']").attr("data-bv-notempty","false");
	     }else{
	    	 $("input[name='organizateCodeNo']").attr("data-bv-notempty","false");
		     $("input[name='businessLicenceNo']").attr("data-bv-notempty","false");
	    	 $("input[name='socialCreditCode']").attr("data-bv-notempty","true");
	     }
		
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

