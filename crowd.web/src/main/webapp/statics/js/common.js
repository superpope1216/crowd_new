/**
 * 
 */
 
 
 function getLocalTime(nS) {  
	    var date = new Date(nS);
	    var year = date.getFullYear();
	    var month = date.getMonth()+1;
	    var day = date.getDate();
	    var hour=date.getHours();
	    var minu=date.getMinutes();
	    return year+"-"+month+"-"+day+" "+hour+":"+minu;
	} 
 function getImagePath(rwxs,kfkj){
	 
	 if(rwxs=='1'){
		 if(kfkj=="1"){
			 return "emap";
		 }else if(kfkj=="2"){
			 return "epstar";
		 }else if(kfkj=="3"){
			 return "cmstar";
		 }else if(kfkj=="4"){
			 return "home";
		 }else if(kfkj=="5"){
			 return "mobile";
		 }else if(kfkj=="9"){
			 return "other";
		 }else{
			 return "wd";
		 }
	 }else if(rwxs=="2"){
		 return "doing";
	 }else if(rwxs=="3"){
		 return "ui";
	 }else if(rwxs=="4"){
		 return "market";
	 }else if(rwxs=="5"){
		 return "buy";
	 }else if(rwxs=="6"){
		 return "train";
	 }else if(rwxs=="7"){
		 return "test";
	 }else{
		 return "wd";
	 }
 }
 function doSyncGet(url,params,callback){
	 $.ajax({
	 		  type: "GET",
	 		  url: url,
	 		  async:false,
	 		  data: params,
	 		  dataType: 'json',  
	 		  success:function(data){
	 			 ajaxBack(data,callback);
	 		  }
	 		});	
	 }
 
 function ajaxBack(data,callBack){
	 if (data.success == true) {
        	if(callBack){
        		callBack(data);
        	}
     } else{
    	 if(parseInt(data.code)>=-14 && parseInt(data.code)<=-7){
    		 window.location.href=basePath+"/error/index?errorCode="+data.code;
    	 }else{
    		 alert(data.msg);
    	 }
     }
 }

 function doGet(url,params,callback,other){
	 $.ajax({
	 		  type: "GET",
	 		  url: url,
	 		  data: params,
	 		  dataType: 'json',  
	 		  success:function(data){
	 			 if(other){
	 				 $(other).attr("disabled",false);
	 			 }
	 			 ajaxBack(data,callback);
	 		  }
	 		});	
	 }
 function doPost(url,params,callback,other){
	 var aContentType="";
	 $.ajax({
	 		  type: "POST",
	 		  url: url,
	 		  data: params,
	 		  dataType: 'json',  
	 		  success:function(data){
	 			  if(other){
	 				  $(other).removeClass("disabled");
	 				  $(other).find("i").hide();
	 			  }
	 			 ajaxBack(data,callback);
	 		  }
	 		});	
	 }
 
 
 

 function setSelect(obj,text,data,value,callback){
	 $(obj).empty();
	 if(!text){
		 text="--请选择--";
	 }
	 var str="<option value=''>"+text+"</option>";
	 if(data){
		 if(data && data.length>0){
			 for(var i=0;i<data.length;i++){
				 var checked="";
				if(value && value==data[i].lbdm){
					checked=" selected='selected' ";
				}
				 str+="<option "+checked+" value='"+data[i].lbdm+"'>"+data[i].lbmc+"</option>"
			 }
		 }
		
	 }
	 $(obj).append(str);
	 if(callback){
		 callback();
	 }
 }
 
 function doGetSelect(url,params,obj,data2,callBack){
	 doGet(url,params,function(data){
		 var str="<option value=''>--请选择--</option>";
		 if(data.data && data.data.length>0){
			 for(var i=0;i<data.data.length;i++){
				 var checked="";
				if(data2 && data2==data.data[i].lbdm){
					checked=" selected='selected' ";
				}
				 str+="<option "+checked+" value='"+data.data[i].lbdm+"'>"+data.data[i].lbmc+"</option>"
			 }
		 }
		 $(obj).append(str);
		 if(callBack){
				 callBack();
		}
	 });
 }
 function doGetSelect2(tblName,obj,data2,callBack){
	 doGet(basePath+"/zdbdetail/list","tableName="+tblName,function(data){
		 $(obj).empty();
		 var str="<option value=''>--请选择--</option>";
		 if(data.data && data.data.length>0){
			 for(var i=0;i<data.data.length;i++){
				 var checked="";
				if(data2 && data2==data.data[i].lbdm){
					checked=" selected='selected' ";
				}
				 str+="<option "+checked+" value='"+data.data[i].lbdm+"'>"+data.data[i].lbmc+"</option>"
			 }
		 }
		 $(obj).append(str);
		 if(callBack){
				 callBack();
		}
	 });
 }

 function doGetMulSelect(url,params,obj,data2,callBack){
	 $.ajax({
	 		  type: "GET",
	 		  url: url,
	 		  data: params,
	 		  dataType: 'json',  
	 		  success:function(data){
	 			 $(obj).empty();
	 			 var str="";
	 			 if(data && data.success){
	 				 
	 				 if(data.data && data.data.length>0){
	 					 for(var i=0;i<data.data.length;i++){
	 						 var checked="";
	 						if(data2 && data2==data.data[i].LBDM){
	 							checked=" selected='selected' ";
	 						}
	 						 str+="<option "+checked+" value='"+data.data[i].LBDM+"'>"+data.data[i].LBMC+"</option>"
	 					 }
	 				 }
	 				
	 			 }
	 			 $(obj).append(str);
	 			 if(callBack){
	 				 callBack();
	 			 }
	 		  }
	 		});	
	 }
   function isEmpty(obj){
		if(obj==""||obj==null){
			return true;
		}
		return false;
	}

	function isNotEmpty(obj){
		if(obj==""||obj==null){
			return false;
		}
		return true;
	}
	
	function toStr(obj,replaceValue){
		if(obj==undefined || obj==null){
			if(replaceValue!=undefined){
				return replaceValue;
			}
			return "";
		}
		return obj;
	}
	function doPostBack(url, params, callback) {
		var aContentType = "";
		$.ajax({
			type : "POST",
			url : url,
			data : params,
			dataType : 'json',
			success : function(data) {
				if(callback){
					callback(data);
				}
			}
		});
	}
	
	function doSynchrPostBack(url, params, callback) {
		var aContentType = "";
		$.ajax({
			type : "POST",
			url : url,
			async:false,
			data : params,
			dataType : 'json',
			success : function(data) {
				if(callback){
					callback(data);
				}
			}
		});
	}
	
	function toThousands(num) {
	    var num = (num || 0).toString(), result = '';
	    while (num.length > 3) {
	        result = ',' + num.slice(-3) + result;
	        num = num.slice(0, num.length - 3);
	    }
	    if (num) { result = num + result; }
	    return result;
	}
	
	function resetAlert() {
		  alertify.set({
		    labels : {
		      ok   : "确认",
		      cancel : "取消"
		    },
		    delay:3000,
		    buttonReverse : false,
		    buttonFocus  : "ok"
		  });
		};
		function resetConfirm() {
			  alertify.set({
			    labels : {
			      ok   : "确认",
			      cancel : "取消"
			    },
			    
			    buttonReverse : false,
			    buttonFocus  : "ok"
			  });
			};
	window.alert=function(msg){
		resetAlert();
		alertify.alert(msg);
		
	}
	
	window.confirm=function(msg,callBack){
		resetConfirm();
			
			
		   alertify.confirm(msg, function (e) {
		     if (e) {
		       //alertify.success("点击确认");
		    	 if(callBack){
		    		 callBack();
		    	 }
		     } else {
		       //alertify.error("点击取消");
		     }
		   });
	}
	
	//把评分转换为小星星
	function changeScoreToStar(_score){
		var _starNum=0;
		if(_score==null || _score==undefined){
			_score=0;
		}
		_score=parseInt(_score);
		if(_score<=30){
			_starNum=1;
		}else if(_score<=50){
			_starNum=2;
		}else if(_score<=70){
			_starNum=3;
		}else if(_score<=90){
			_starNum=4;
		}else if(_score<=100){
			_starNum=5;
		}
		var html="";
		for(var i=1;i<6;i++){
			html+='<span style="display: inline-block;">';
			if(i<=_starNum){
				html+='		<i	class="fa fa-star my-score-color"></i>';
			}else{
				html+=' 	<i	class="fa fa-star-o my-score-color"></i>';
			}
			
			html+='</span>';
		}
		html+='<span style="display: inline-block;">'+_starNum+'分</span>';
		return html;
	}
	
 