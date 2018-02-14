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
		if($(this).attr("id")=="aBasic"){
			$("#ulCardInfo").hide();
			$("#ulResumeInfo").hide();
			$("#ulBasicInfo").show();
		    $(".nav-tabs li a").removeClass("active");
			$("#aBasic").addClass("active");
		//	$(".fileinput-remove").attr("disabled",false); 
		}else if($(this).attr("id")=="aResume"){
			$("#ulBasicInfo").hide();
			$("#ulCardInfo").hide();
			$("#ulResumeInfo").show();
			 $(".nav-tabs li a").removeClass("active");
			$("#aResume").addClass("active");
		}else if($(this).attr("id")=="aCard"){
	    	 $("#ulBasicInfo").hide();
			 $("#ulResumeInfo").hide();
			 $("#ulCardInfo").show();
			 $(".nav-tabs li a").removeClass("active");
			 $("#aCard").addClass("active");
			
		}
	});
	

	$("#ckal").css("max-width","100%");
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
	
		//初始化
		doSynchrPostBack("../xqfSupply/queryXqfxxInfo","",function(data){
			if(data.success&&isNotEmpty(data.datas)){
				if(isNotEmpty(data.datas[0])){
					var shzt=data.datas[0].shzt;
					var shztHtml="";
					$("#saveCardInfo").text("保存");
					if(shzt=="1"){
						shztHtml='<p style="background-color:#EEE;padding-left:10px;padding-top:10px;font-size:18px;color:#32be77;margin-right:7px;">正在审核中!</p>';
						shztHtml+='<p style="margin-bottom:15px;background-color:#EEE;padding-left:10px;padding-bottom:10px;font-size:12px;color:#999;margin-right:7px;margin-top:-18px;">3个工作日内将为您审核身份，请耐心等待</p>';
					}else if(shzt=="2"){
						shztHtml='<p style="background-color:#EEE;padding-left:10px;padding-top:10px;font-size:18px;color:#32be77;margin-right:7px;">审核通过</p>';
						shztHtml+='<p style="margin-bottom:15px;background-color:#EEE;padding-left:10px;padding-bottom:10px;font-size:12px;color:#999;margin-right:7px;margin-top:-18px;">您已通过了开发者审核,成为crowd的一员,恭喜,您已经打了未来成功的一扇门!</p>';
					}else if(shzt=="3"){
						$("#saveCardInfo").text("提交审核");
						shztHtml='<p style="background-color:#EEE;padding-left:10px;padding-top:10px;font-size:18px;color:#F91818;margin-right:7px;">审核不通过!</p>';
						if(isNotEmpty(data.datas[0].shyj)){
							shztHtml+='<p style="margin-bottom:15px;background-color:#EEE;padding-left:10px;padding-bottom:10px;font-size:12px;color:#999;margin-right:7px;margin-top:-18px;">请重新提交你的身份认证信息, 审核意见:'+data.datas[0].shyj+'</p>';
                        }else{
							shztHtml+='<p style="margin-bottom:15px;background-color:#EEE;padding-left:10px;padding-bottom:10px;font-size:12px;color:#999;margin-right:7px;margin-top:-18px;">请重新提交你的身份认证信息.</p>';
                         }
					}else{
						shztHtml='<p style="background-color:#EEE;padding-left:10px;padding-top:10px;font-size:18px;color:#F91818;margin-right:7px;">未提交!</p>';
						shztHtml+='<p style="margin-bottom:15px;background-color:#EEE;padding-left:10px;padding-bottom:10px;font-size:12px;color:#999;margin-right:7px;margin-top:-18px;">请提交你的身份认证信息</p>';
					}
					var html="";
					html='<div class="form-group col-md-12">'
						+shztHtml;
					    +'</div>';
					$("#first_p").after(html);
				}
				
				if(data.datas[0].shzt=='1'||data.datas[0].shzt=='2'){
					$("input[name='xm']").attr("disabled",true);
					$("input[name='sfzjh']").attr("disabled",true);
					$("select[name='userRange']").attr("disabled",true);
					$("input[name='businessLicenceNo']").attr("disabled",true);
		            $("input[name='organizateCodeNo']").attr("disabled",true);;
		            $("input[name='taxRegistrationNo']").attr("disabled",true);
		            $("input[name='socialCreditCode']").attr("disabled",true);
		            $("input[name='companyMc']").attr("disabled",true);
		        	
					$("#tabs-green li a").unbind();
					
					$("#sfzzmztjidUpload").unbind("click");
					$("#sfzfmztjidUpload").unbind("click");
					$("#businessLicenceScannerUpload").unbind();
					$("#organizateCodeScannerUpload").unbind();
					$("#taxRegistrationScannerUpload").unbind();
					
					$("#sfzzmztjidUpload").removeClass("pointed");
					$("#sfzfmztjidUpload").removeClass("pointed");
					$("#businessLicenceScannerUpload").removeClass("pointed");
					$("#taxRegistrationScannerUpload").removeClass("pointed");
					$("#taxRegistrationScannerUpload").removeClass("pointed");
                    $("#saveCardInfo").hide();
				}else{
					$("#saveCardInfo").show();
				}
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
		$("#saveCardInfo").click(function(){
			 $('#formCardInfo').bootstrapValidator("validate");
			 var formCardValidator = $('#formCardInfo').data('bootstrapValidator');
			 if(formCardValidator.isValid()){
				    var wid=$("#wid").val();
				    var basicData=$("#formCardInfo").serializeArray();
				    basicData.push({"name":"wid","value":wid});
				    basicData.push({"name":"shzt","value":1});
				  
				    var userRange=$("select[name='userRange']").val();
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
						   var enterpriseQualificateType=$("#tabs-green li a.active").attr("data-num");
						    if("1"==enterpriseQualificateType){//选择三证时  营业执照和组织机构代码 必填
						    	if($("#organizateCodeScanner").val()==""){
						    	    alert("请上传完整的身份信息感谢你的支持");
						    		return;
						    	}
						    }
						    basicData.push({"name":"enterpriseQualificateType","value":enterpriseQualificateType});
	                     }
				        
				    doPostBack(basePath+"/xqfConfrim/saveXqfxxCardInfo",basicData,function(data){
				    	  if(data.success){
				    		  window.location.href=basePath+"/xqfConfrim/index?flag=xqfconfirm";
				    	  }else{
				    		 alert(data.msg);
				    	  }
				    });
			 }
		});
		
		$("#saveBasicInfo").click(function(){
			 $('#formBasicInfo').bootstrapValidator("validate");
			 var formCardValidator = $('#formBasicInfo').data('bootstrapValidator');
			 if(formCardValidator.isValid()){
					 if($("#zpfjid").val()==""){
			    		 alert("请上传头像");
			    		 return;
			    	 }
				    var basicData=$("#formBasicInfo").serializeArray();
				    doPostBack(basePath+"/xqfConfrim/saveXqfxxBasicInfo",basicData,function(data){
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


