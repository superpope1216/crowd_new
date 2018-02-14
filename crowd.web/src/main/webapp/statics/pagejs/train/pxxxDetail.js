/**
 * 
 */
//$(document).ready(function(require, exports, module){
	
define(function(require, exports, module) {
    var $$ = jQuery$ = require('jquery');
    require('plugins/vendor/bootstrap/validator/entrance');
	 var IE9 = (navigator.userAgent.indexOf("MSIE 9.0") > 0) ? true: false;
	
	 $('#formTrainEnrol .datepicker').datepicker({
		    language: 'zh-CN',
		    autoclose:true,
		    todayHighlight:true
		})
	 
   $("#btnOpenTb").click(function(){
	    doGet(basePath+"/trainDetail/doTrainEnroll","pxid="+pxid,function(data){
	    	if(data.success&&isNotEmpty(data.datas)){
	    		$("input[name='xm']").val(data.datas[0].xm);
	    		$("input[name='sj']").val(data.datas[0].sj);
	    		$("input[name='qq']").val(data.datas[0].qq);
	    		$("input[name='cynf']").val(data.datas[0].cynf);
	    		$("input[name='fwxx']").val(data.datas[0].fwxx);
	    		$("input[name='scjs']").val(data.datas[0].scjs);
	    		$("#wid").val(data.datas[0].wid);
	        }
	    	$("#train-enroll-modal").modal("show");
	    });
	   
   })
   
   $("#btnSave").click(function(){
	   $$("#formTrainEnrol").bootstrapValidator("validate");
	   var formTrainEnrolValidator = $$("#formTrainEnrol").data('bootstrapValidator');
	   formTrainEnrolValidator.validate();
	   if(formTrainEnrolValidator.isValid()){
		   var url=basePath+"/trainDetail/toTrainEnroll";
		   var basicData=$("#formTrainEnrol").serializeArray();
		    basicData.push({"name":"pxid","value":pxid});

		   doPostBack(url,basicData,function(data){
			   $("#train-enroll-modal").modal("hide");
		   });
		}
	});
   
   /**
    * 查询培训计划
    */
   queryPlanInfo();
   function queryPlanInfo(){
	   doGet(basePath+"/trainDetail/queryPlan","pxid="+pxid,function(data){
		   if(data && data.datas){
			   $("#spanBmjzrq").html("报名截至日期:"+data.datas.bmjssj);
			   $("#spanBmkssj").html(data.datas.bmkssj);
			   $("#spanBmjssj").html(data.datas.bmjssj);
			   $("#spanPxkssj").html(data.datas.pxkssj);
			   $("#spanPxjssj").html(data.datas.pxjssj);
			   $("#spanPxms").html(data.datas.pxap);
			   $("#divTrainPlan").show();
		   }
	   });
   }
   queryBmzxx();
    function queryBmzxx(){
    	if($("#divTbxxList").size()<=0){
			return;
		}
    	doGet(basePath+"/trainDetail/queryEnrol","pxid="+pxid,function(data){
    		  if(data && data.datas){
    			  var html="";
    			  for(var i=0;i<data.datas.length;i++){
    				  var _data=data.datas[i]
    				  
    				  html+='<div class="rwxx-dtail-tbxx-content-item">';
    				  html+='	<div class="rwxx-dtail-tbxx-content-left">';
    				  html+='		<div>';
    				  html+='			<img class="apply-avatar-1QsRa"	src="https://coding.net/static/fruit_avatar/Fruit-19.png">';
    				  html+='		</div>';
    				  html+='	<!-- react-empty: 369 -->';
    				  html+='	</div>';
					//</div>
    				  html+='	<div class="rwxx-dtail-tbxx-content-center">';
    				  html+='		<div class="rwxx-dtail-tbxx-content-center-title">';
    				  html+='			<!-- react-text: 372 -->';
    				  html+='					'+_data.xm;
    				  html+='			<!-- /react-text -->';
    				  html+='			<!-- react-text: 373 -->';
    				  html+='					&nbsp;';
    				  html+='			<div class="my-score">';
    				  if(_data.khjg){
    					  html+='					<strong style="display: inline-block;color:red;font-size:30px;">'+_data.khjgDisplay;
    					  if(_data.nlpg){
    						  html+='('+_data.nlpgDisplay+')</strong>';
    					  }else{
    						  html+='</strong>';
    					  }
    				  }else{
    					  html+='					<strong style="display: inline-block;color:red;font-size:30px;">未考核</strong>';
    				  }
/*    				  html+='							<!-- react-text: 393 -->';
    				  html+='								&nbsp;';
    				  html+='							<!-- /react-text -->';
    				  html+='							<span style="display: inline-block;">';
    				  html+='								<i	class="fa fa-star my-score-color"></i>';
    				  html+='							</span>';
    				  html+='							<span>';
    				  html+='								<i class="fa fa-star my-score-color"></i>';
    				  html+='							</span>';
    				  html+='							<span>';
    				  html+='								<i class="fa fa-star my-score-color"></i>';
    				  html+='							</span>';
    				  html+='							<span>';
    				  html+='								<i	class="fa fa-star-o my-score-color"></i>';
    				  html+='							</span>';
    				  html+='							<span>';
    				  html+='								<i	class="fa fa-star-o my-score-color"></i>';
    				  html+='							</span>';
    				  html+='							<!-- react-text: 405 -->';
    				  html+='							<span style="display: inline-block;">3</span>';*/
    				  html+='			</div>';
    				  html+='		</div>';
//    				  html+='		<div class="rwxx-dtail-tbxx-content-center-sm">';
//   				  html+='			<!-- react-text: 388 -->';
//    				  var kfzlx="个人开发者";
//    				  if(_data.sfytd=="1"){
//    					  kfzlx="企业开发者";
//    				  }
//    				  html+=kfzlx;	
//    				  html+='				';
//    				  html+='			<!-- /react-text -->';
//    				  html+='			<!-- react-text: 389 -->';
//    				  html+='				&nbsp;|&nbsp;';
//    				  html+='			<!-- /react-text -->';
//    				  html+='			<!-- react-text: 390 -->';
//    				  var kfzlb="金智员工";
//    				  if(_data.kfzlb=="1"){
//    					  kfzlb="外部人员";
//    				  }
//    				  html+='			'+kfzlb;
//    				  html+='			<!-- /react-text -->';
//    				  html+='			<!-- react-text: 391 -->';
//   				  html+='			&nbsp; |&nbsp;';
//    				  html+='			<!-- /react-text -->';
//    				  html+='			<!-- /react-text -->';
//    				  html+='		</div>';
    				  html+='		<div class="apply-message">';
    				  html+='			<span class="apply-message-span1">报名状态：</span>';
    				  html+='			<span class="apply-message-span2" style="color:red;">';
    				  html+=               _data.bmztDisplay;
    				  html+='			</span>';
    				  html+='		</div>'
    				  html+='		<div class="apply-message">';
    				  html+='			<span class="apply-message-span1">预约考核状态：</span>';
    				  html+='			<span class="apply-message-span2">';
    				  html+=               _data.yykhztDisplay;
    				  html+='			</span>';
    				  html+='		</div>';
    				  html+='		<div class="apply-message">';
    				  html+='			<span class="apply-message-span1">联系方式：</span>';
    				  html+='				<!-- react-empty: 411 -->';
    				  html+='QQ:'+_data.qq+"&nbsp;&nbsp;手机:"+_data.sj
    				  
    				  html+='		</div>';
//    				  html+='		<div class="apply-message">';
//    				  html+='			<!-- react-text: 414 -->';
//    				  html+='			报名时间：';
//    				  html+='			<!-- /react-text -->';
//    				  html+='			<!-- react-text: 415 -->';
//    				  html+=_data.tbsj
//    				  html+='			<!-- /react-text -->';
//    				  html+='		</div>';
//    				  html+='		<div class="apply-message-2EwTK">';
//    				  html+='			<!-- react-text: 417 -->';
//    				  html+='			申请资料：';
//    				  html+='			<!-- /react-text -->';
//    				  html+='			<button type="button" class="btn btn-link">查看</button>';
//    				  html+='		</div>';
    				  html+='	</div>';
//    				  html+='	<div class="rwxx-dtail-tbxx-content-center-line"></div>';
//    				  html+='		<div class="right-column-1oumq">';
//    				  html+='			<a href="xqfOrderAction/index" target="_blank"	class="btn btn-danger my-btn-white btn-squared">不适合</a>';
//    				  if(_data.zbzt=="0"){
//    					  html+='			<a href="javascript:void(0)"; data-key="'+_data.key+'"	data-option="selectTA" class="btn btn-danger my-btn-blue btn-squared">确认合作</a>';
//    				  }else if(_data.zbzt=="1"){
//    					  html+='			<a href="javascript:void(0);" target="_blank"	class="btn btn-danger my-btn-red btn-squared">已选中</a>';  
//    				  }else if(_data.zbzt=="2"){
//    					  html+='			<a href="javascript:void(0);" target="_blank"	class="btn btn-danger my-btn-white btn-squared">未选中</a>';
//    				  }
    				  
//    				  html+='		</div>';
//    				  html+='	</div>';
    				  html+='</div>';
//					</div>
//    				  html+='<li class=" shown offer wow fadeInUp animated" data-wow-delay="0ms" data-wow-duration="1500ms" style="visibility: visible; animation-duration: 1500ms; animation-delay: 0ms; animation-name: fadeInUp;">';
//    				  html+='	<a href="'+basePath+'/kfzview/index?kfzid='+_data.kfzid+'" title="'+(_data.kfzNc?_data.kfzNc:_data.kfzXm)+'" target="_blank" style="padding: 2px; background: #fff;">';
//    				  html+='			<article class="inner-box" style="border: 1px solid #f5f5f5;">';
//    				  html+='				<figure class="image" style="margin-bottom:0px;">';
//    				  html+='					<img src="'+basePath+'/statics/images/12.png" title="'+(_data.kfzNc?_data.kfzNc:_data.kfzXm)+'" alt="'+(_data.kfzNc?_data.kfzNc:_data.kfzXm)+'">';
//    				  html+='					<div class="overlay-box">';
//    				  html+='						<div class="date">'+(_data.kfzNc?_data.kfzNc:_data.kfzXm)+'</div>';
//    				  html+='    				</div>';
//    				  html+='			    </figure>';
//    				  html+='               <div class="text">';
//    				  html+='					<div class="desc">';
//    				  html+='						<p style="overflow: auto;">';
//    				  html+='						<span style="text-align: left; float: left; display: inline-block;">'+(_data.kfzNc?_data.kfzNc:_data.kfzXm)+'</span>';
//    				  html+='						<span style="text-align: center; float: right; display: inline-block; width: 40px; background-color: #ddd; border: none; font-size: 12px; border-radius: 3px; cursor: pointer; display: inline-block; background-color: #65C279; color: #FFF;">'+_data.zbztDisplay+'</span>';
//    				  html+='				        </p>';
//    				  html+='				        <p>';
//    				  html+='							<b style="text-align: center;  display: inline-block;" class="price">￥'+_data.tbje+'元</b>';
//    				  html+='				        </p>';
//    				  html+='					</div>';
//    				  html+='					<div class="link text-center">';
//    				  html+='							<a href="javascript:void(0);" data-option="selectTA" data-key="'+_data.wid+'" title="选中TA" target="_self" class="theme-btn btn-skew style-two btn-sm">选中TA</a>';
//    				  html+='	                </div>';
//    				  html+='                </div>';
//    				  html+='			</article>';
//    				  html+='	</a>';
//    				  html+='</li>';
    			  }
    			  $("#divTbxxList").html(html);
    			  $("#divTbxxList [data-option='selectTA']").click(function(){
    				  var _tbId=$(this).attr("data-key");
    				  confirm("您确认选择该开发者参与需求的开发吗？",function(){
    					  doPost(basePath+"/rwxxDetail/selectTb","tbid="+_tbId,function(data){
    						  if(data && data.datas){
    							  alert("选标成功！");
    							  queryTbzxx();
    						  }
    					  })
    				  })
    			  });
    		  }
    	   });
    }
});
