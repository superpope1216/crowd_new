/**
 * 
 */
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
   //初始化基本事件
	initEvent();
	//零碎事件
	initOtherEvent();
  //初始化用户基本信息
	initUserInfo();
	
    //保存用户基本信息
	saveUserInfo();
	//初始省市区 级联下拉
	initSelect();
	
	function initEvent(){
		//初始化tab切换
		$(".nav-tabs li a").click(function(){
			
			var flag=$(".nav-tabs li a.active").attr("id");
			if(flag=="aBasic"){//验证基本信息
				 checkChangeRwxs();
				 $("#formBasicInfo").data('bootstrapValidator').destroy(); 
				 $('#formBasicInfo').bootstrapValidator("validate");
				 var formBasicValidator = $('#formBasicInfo').data('bootstrapValidator');
				 if(!formBasicValidator.isValid()){
					 return false;
				 }
				 if($("#grzpfjid").val()==""){
					 alert("请上传头像");
					 return false;
				 }
			}else if(flag=="aResume"){
				 $('#formResumeInfo').bootstrapValidator("validate");
			     var formResumeValidator = $('#formResumeInfo').data('bootstrapValidator');
				 if(!formResumeValidator.isValid()){
					 return false;
				 }
			}else{
				 checkChangeCard();
				 $("#formCardInfo").data('bootstrapValidator').destroy(); 
				 $('#formCardInfo').bootstrapValidator("validate");
				 var formCardValidator = $('#formCardInfo').data('bootstrapValidator');
				 formCardValidator.validate();
				 if(!formCardValidator.isValid()){
					 return false;
				 }
				 var sfytd=$("select[name='sfytd']").val();
				   if(sfytd=="1"){//个人认证 验证
					   if($("#sfzzmztjid").val()==""||$("#sfzfmztjid").val()==""){
				  		   alert("请上传完整的身份信息感谢你的支持");
				  		   return false;
				  	     } 
				   }else{//企业认证验证
					   if($("#sfzzmztjid").val()==""||$("#sfzfmztjid").val()==""||$("#businessLicenceScanner").val()==""){
				  		   alert("请上传完整的身份信息感谢你的支持");
				  		   return false;
				  	     } 
					   var enterpriseQualificateType=$("#tabs-green li a.active").attr("data-num");
					    if("1"==enterpriseQualificateType){//选择三证时  营业执照和组织机构代码 必填
					    	if($("#organizateCodeScanner").val()==""){
					    	    alert("请上传完整的身份信息感谢你的支持");
					    		return false;
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
		        $(this).addClass("active");
			}else if($(this).attr("id")=="aResume"){
				$("#ulBasicInfo").hide();
				$("#ulCardInfo").hide();
				$("#ulResumeInfo").show();
				$(this).addClass("active");
			}else if($(this).attr("id")=="aCard"){
				$("#ulBasicInfo").hide();
				$("#ulResumeInfo").hide();
				$("#ulCardInfo").show();
				$(this).addClass("active");
			}
		});
	  //参考案例宽度
		$("#ckal").css("max-width","100%");
	  //企业资质类型tab页切换
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
		//上传控件+号变化
		$(".sfz-icon-container").mouseenter(function(){
			$(this).children(".bh-file-img-plus").css("color","#333");
		});
		$(".sfz-icon-container").mouseleave(function(){
			$(this).children(".bh-file-img-plus").css("color","#bbb");
		});
		
		
		
		$("#btnResumePre").click(function(){
			$(".nav-tabs li a").removeClass("active");
			$(".nav-tabs li").removeClass("active");
			$("#aResume").addClass("active");
			$("#ulCardInfo").hide();
			$("#ulResumeInfo").show();
		});
		
		$("#btnBasicPre").click(function(){
			$(".nav-tabs li a").removeClass("active");
			$(".nav-tabs li").removeClass("active");
		    $("#aBasic").addClass("active");
			$("#ulResumeInfo").hide();
			$("#ulBasicInfo").show();
			
		});
		
		
		//上传控件初始化
		 var uploader=new Uploader({id:"headBrower",maxSize:1024*500,propExplain:"请上传照片",uploadedFunc:function(data){
				if(true){
					var imgPath=basePath+"/image/preView?wid="+uploader.params.value;
					$("#headImg").attr("src",imgPath);
					$("#grzpfjid").val(uploader.params.value);
				}
			}});
			$("#headImg").click(function(){
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
		
		//初始化多选下位
		 $("#rwkfkj").select2({
		        tags: true,
		        createTag:function (decorated, params) {  
		            return null;  
		        },  
		        placeholder:'请选择平台技能'
		    });
		  $("#gzlbdm").select2({
		        tags: true,
		        createTag:function (decorated, params) {  
		            return null;  
		        },  
		        placeholder:'请选择工作类别代码'
		    });
		  $("#scjsdm").select2({
		        tags: true,
		        createTag:function (decorated, params) {  
		            return null;  
		        },  
		        placeholder:'请选择擅长技术代码'
		    });
	   $(".select2").css("width","100%");
	   $(".select2-search__field").css("width","100%");
	   
	}
	
	function initOtherEvent(){
		
		
		
		 //初始化生日时间控件
		$("input[name='csrq']").datepicker({
		    language: 'zh-CN',
		    autoclose:true,
		    todayHighlight:true
		});
		//推送任务 下拉变化
		$("select[name='sfjstj']").change(function(){
			 var value=$(this).find("option:selected").attr("value");
	         if(value=="1"){
	        	$("#rwxs_select").show();
	        	var rwxsValue=$("select[name='rwxs']").val();
	        	if(rwxsValue&&rwxsValue=="1"){
		            $("#rwkfkj_select").show();
	        	}
	          }else{
	            $("#rwxs_select").hide();
	            $("#rwkfkj_select").hide();
	          }
		});
		$("select[name='rwxs']").change(function(){
			 var value=$(this).find("option:selected").attr("value");
	         if(value=="1"){
	        	$("#rwkfkj_select").show();
	          }else{
	            $("#rwkfkj_select").hide();
	          }
		});
		//用户类型下拉
		$("select[name='sfytd']").change(function(){
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
	}
	
	//初始化 用户基本信息
	function initUserInfo(){
		$("select[name='sfytd']").val(1);//初次进入页面 默认 是个人
		doPostBack("../kfzSupply/queryKfzxxInfo","",function(data){
			if(data.success&&isNotEmpty(data.datas)){
				
			    if(isNotEmpty(data.datas[0].grzpfjid)){
			         $("#grzpfjid").val(data.datas[0].grzpfjid);
			         var imgPath=basePath+"/image/preView?wid="+data.datas[0].grzpfjid;
					 $("#headImg").attr("src",imgPath);
	            }
	            if(isNotEmpty(data.datas[0].sfzzmztjid)){
			    	//$("#sfzzmztjidImg").attr("value","../image/preView?wid="+data.datas[0].sfzzmztjid);
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
				$("#kfzxxWid").val(data.datas[0].wid);
				$("input[name='nc']").val(data.datas[0].nc);
				if(isNotEmpty(data.datas[0].csrq)){
					$("input[name='csrq']").val(format((data.datas[0].csrq)));
				}
				$("input[name='qq']").val(data.datas[0].qq);
				$("input[name='wxh']").val(data.datas[0].wxh);
				$("input[name='qtjn'").val(data.datas[0].qtjn);
				if(isNotEmpty(data.datas[0].gzjl)){
					$("textarea[name='gzjl']").text(data.datas[0].gzjl);
				}
				if(isNotEmpty(data.datas[0].xmjy)){
					$("textarea[name='xmjy']").text(data.datas[0].xmjy);
				}
				$("input[name='zslj'").val(data.datas[0].zslj);
				$("input[name='xm'").val(data.datas[0].xm);
				$("input[name='sfzjh'").val(data.datas[0].sfzjh);
	            if(isNotEmpty(data.datas[0].sfytd)){
	            	$("select[name='sfytd']").val(data.datas[0].sfytd);
	            	 var value=data.datas[0].sfytd;
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
	            }
	            if(isNotEmpty(data.datas[0].kxsjid)){
	            	$("select[name='kxsjid']").val(data.datas[0].kxsjid);
	            }
	            if(isNotEmpty(data.datas[0].gzlbdm)){
	            	var gzlbdm=data.datas[0].gzlbdm.split(",");
	                $("#gzlbdm").val(gzlbdm).trigger("change");
	            }
	            if(isNotEmpty(data.datas[0].scjsdm)){
	            	var scjsdm=data.datas[0].scjsdm.split(",");
	                $("#scjsdm").val(scjsdm).trigger("change");
	            }
	            if(isNotEmpty(data.datas[0].jygznx)){
	            	$("select[name='jygznx']").val(data.datas[0].jygznx);
	            }
	            if(isNotEmpty(data.datas[0].gznx)){
	            	$("select[name='gznx']").val(data.datas[0].gznx);
	            }
	            if(isNotEmpty(data.datas[0].gzxz)){
	            	$("select[name='gzxz']").val(data.datas[0].gzxz);
	            }
	            if(isNotEmpty(data.datas[0].perProvince)){
	            	$("select[name='perProvince']").val(data.datas[0].perProvince);
	            }
	            if(isNotEmpty(data.datas[0].perCity)){
	            	$("select[name='perCity']").val(data.datas[0].perCity);
	            }
	            if(isNotEmpty(data.datas[0].perArea)){
	            	$("select[name='perArea']").val(data.datas[0].perArea);
	            }
	            if(isNotEmpty(data.datas[0].rwxs)){
	            	$("select[name='rwxs']").val(data.datas[0].rwxs);
	            	 if(data.datas[0].rwxs=="1"){
	                 	$("#rwkfkj_select").show();
	                   }else{
	                     $("#rwkfkj_select").hide();
	                   }
	            }else{
	              $("#rwkfkj_select").hide();
	            }
	          
	            if(isNotEmpty(data.datas[0].rwkfkj)){
	            	var rwkfkj=data.datas[0].rwkfkj.split(",");
	                $("#rwkfkj").val(rwkfkj).trigger("change");
	            }else{
	            	$("#rwkfkj_select").hide();
	            }
	            if(data.datas[0].sfjstj=="0"||isNotEmpty(data.datas[0].sfjstj)){
	            	$("select[name='sfjstj']").val(data.datas[0].sfjstj);
	            	 if(data.datas[0].sfjstj=="1"){
	                 	 $("#rwxs_select").show();
	                   }else{
	                     $("#rwkfkj_select").hide();
		            	 $("#rwxs_select").hide();
	                   }
	            }else{
	            	 $("#rwkfkj_select").hide();
	            	 $("#rwxs_select").hide();
	            }
	            //新增字段
		           $("input[name='businessLicenceNo']").val(data.datas[0].businessLicenceNo);
		           $("input[name='organizateCodeNo']").val(data.datas[0].organizateCodeNo);
		           $("input[name='taxRegistrationNo']").val(data.datas[0].taxRegistrationNo);
		           $("input[name='socialCreditCode']").val(data.datas[0].socialCreditCode);
		           $("input[name='companyMc']").val(data.datas[0].companyMc);
		           $("input[name='zfbzh']").val(data.datas[0].zfbzh);
		           $("input[name='dzyx']").val(data.datas[0].dzyx);

			}
		});
	}
	
	
	function saveUserInfo(){
		
		
		
		$("form").bootstrapValidator({  
		    excluded:[":disabled"]//关键配置，表示只对于禁用域不进行验证，其他的表单元素都要验证  
		});
		
		//下一步 表单校验
		$("#btnBasicNext").click(function(){
			 checkChangeRwxs();
			 $("#formBasicInfo").data('bootstrapValidator').destroy(); 
			 $('#formBasicInfo').bootstrapValidator("validate");
			 var formBasicValidator = $('#formBasicInfo').data('bootstrapValidator');
			 if(formBasicValidator.isValid()){
				 if($("#grzpfjid").val()==""){
					 alert("请上传头像");
					 return;
				 }
				    $(".nav-tabs li a").removeClass("active");
					$(".nav-tabs li").removeClass("active");
					$("#aResume").addClass("active");
					$("#ulBasicInfo").hide();
					$("#ulResumeInfo").show();
			 }
		});
		
		$("#btnResumeNext").click(function(){
			 $('#formResumeInfo').bootstrapValidator("validate");
		     var formResumeValidator = $('#formResumeInfo').data('bootstrapValidator');
			 if(formResumeValidator.isValid()){
				    $(".nav-tabs li a").removeClass("active");
					$(".nav-tabs li").removeClass("active");
					$("#aCard").addClass("active");
					$("#ulResumeInfo").hide();
					$("#ulCardInfo").show();
			 }
		});
		
		
		
		$("#saveKfzxxInfo").click(function(){
			 $("#formCardInfo").data('bootstrapValidator').destroy(); 
		//	 $("#formBasicInfo").data('bootstrapValidator').resetForm(); 
		//	 $("#formBasicInfo").data('bootstrapValidator').destroy(); 
			 checkChangeRwxs();
			 checkChangeCard();
			 $('#formBasicInfo').bootstrapValidator("validate");
			 $('#formResumeInfo').bootstrapValidator("validate");
			 $('#formCardInfo').bootstrapValidator("validate");
			 
		//	 $('#formBasicInfo .help-block').css("display","block");
		     var formBasicValidator = $('#formBasicInfo').data('bootstrapValidator');
			 var formResumeValidator = $('#formResumeInfo').data('bootstrapValidator');
			 var formCardValidator = $('#formCardInfo').data('bootstrapValidator');
			 formBasicValidator.validate();
			 formResumeValidator.validate();
			 formCardValidator.validate();
			 
			 if(!formBasicValidator.isValid()||!formResumeValidator.isValid()||!formCardValidator.isValid()){
				 return ;
			 }
			 if($("#grzpfjid").val()==""){
				 alert("请上传头像");
				 return;
			 }
			 
			    var wid=$("#kfzxxWid").val();
			    var sfjstj=$("select[name='sfjstj']").val();
				   if(sfjstj!="1"){
					  $("select[name='rwxs']").val("");
				   }
			    var basicData=$("#formBasicInfo").serializeArray();
			    var resumeData=$("#formResumeInfo").serializeArray();
				var cardData=$("#formCardInfo").serializeArray();
				for(var i=0;i<resumeData.length;i++){
					basicData.push(resumeData[i]);
				}
				for(var i=0;i<cardData.length;i++){
					basicData.push(cardData[i]);
				}
			   var sfytd=$("select[name='sfytd']").val();
			   if(sfytd=="1"){//个人认证 保存
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
					checkMultipleSelect(basicData);//多选赋值
					
					doPostBack(basePath+"/kfzSupply/insertFirstKfzxxInfo",basicData,function(data){
						if(data.success){
							 window.location.href=basePath+"/kfzConfrim/index?flag=kfzconfirm";
						}else{
							 alert(data.msg);
						}
			          });
			    
		});
	}
	
	function checkMultipleSelect(basicData){
	    var data = $("#rwkfkj").select2("data");
		var saveIds="";
		for(var i=0;i<data.length;i++){
			saveIds+=data[i].id+","
		}
		if(saveIds.length>=1){
			saveIds=saveIds.substr(0,saveIds.length-1);
		}
		var sfjstj=$("select[name='sfjstj']").val();
		var rwxsVal=$("select[name='rwxs']").val();
		if(sfjstj==""||sfjstj=="0"||isEmpty(rwxsVal)||rwxsVal!="1"){
			saveIds="";
		}
		basicData.push({"name":"rwkfkj","value":saveIds});
		 data = $("#gzlbdm").select2("data");
		 saveIds="";
			for(var i=0;i<data.length;i++){
				saveIds+=data[i].id+","
			}
			if(saveIds.length>=1){
				saveIds=saveIds.substr(0,saveIds.length-1);
			}
			basicData.push({"name":"gzlbdm","value":saveIds});
			data = $("#scjsdm").select2("data");
			saveIds="";
			for(var i=0;i<data.length;i++){
				saveIds+=data[i].id+","
			}
			if(saveIds.length>=1){
				saveIds=saveIds.substr(0,saveIds.length-1);
			}
			basicData.push({"name":"scjsdm","value":saveIds});
    }

	//初始省市区 下拉
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
	//任务形式校验变化
	function checkChangeRwxs(){
    	 var sfjstj=$("select[name='sfjstj']").val();
         if(sfjstj=="1"){
        	$("select[name='rwxs']").attr("data-bv-notempty","true");
          }else{
            $("select[name='rwxs']").attr("data-bv-notempty","false");
          }
         
	}
	//个人企业  认证校验切换
	function checkChangeCard(){
		var sfytd=$("select[name='sfytd']").val();
		   if(sfytd=="1"){//个人 去除 企业必填验证
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