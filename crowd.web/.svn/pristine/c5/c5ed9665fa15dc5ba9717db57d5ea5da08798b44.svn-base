<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
.cardInfo .met-upfile .file-drop-zone {
	border: 0px;
	margin: 0px;
}

.cardInfo .met-upfile .file-preview {
	border-radius: 0px;
	max-width: 220px;
} /*display:none;*/
.cardInfo .met-upfile .kv-upload-progress {
	max-width: 220px;
} /*display:none;*/
.cardInfo .met-upfile .kv-upload-progress .progress {
	border-radius: 0px;
} /*display:none;*/
.cardInfo .met-upfile .file-preview .file-actions {
	display: none;
}

.cardInfo .met-upfile .file-preview-frame {
	box-shadow: none;
	display: block;
	margin: 0px;
	border: 0;
	padding: 0px;
	float: none;
	height: auto;
}

.cardInfo .met-upfile .file-preview-frame img {
	width: 100% !important;
	height: auto !important;
}

.cardInfo .met-upfile .file-preview-frame:hover {
	box-shadow: none;
}

.cardInfo .met-upfile .file-drop-zone-title {
	font-size: 30px;
}

.cardInfo .met-upfile .fileinput-cancel-button {
	width: 76px;
}

.cardInfo .met-upfile .progress {
	margin-bottom: 10px;
}

#tabs-green {
    border-bottom: 2px solid #62a8ea;
    background-color: #fff;
    margin-bottom: 30px;
}

.label {
    float: left;
    height: 32px;
    line-height: 25px;
    width: 180px;
    text-align: right;
    padding-right: 24px;
}


#tabs-green li {
    float: left;
    margin-right: 10px;
    list-style: none;
}

#tabs-green li a {
    display: block;
    padding: 0 14px;
    text-align: center;
    border-radius: 3px 3px 0 0;
}

#tabs-green li a.active {
    background-color: #62a8ea;
    color: #fff;
    text-decoration: none;
}

#tabs-green li a {
    height: 32px;
    line-height: 32px;
}


.information {
    color: #b1b1b1;
    float: left;
    /* margin-right: 210px; */
    margin-top: 14px;
    position: relative;
}

@media (max-width:500px) {
     #ckal img{
       margin-bottom: 20px;
       margin-left:0px!important;
     }
}

</style>
      <input type="hidden" name="sfzzmztjid" id="sfzzmztjid"/>
      <input type="hidden" name="sfzfmztjid"  id="sfzfmztjid"/>
      <input type="hidden" name="businessLicenceScanner"  id="businessLicenceScanner"/>
      <input type="hidden" name="organizateCodeScanner"   id="organizateCodeScanner"/>
      <input type="hidden" name="taxRegistrationScanner"  id="taxRegistrationScanner"/>
<div class="cardInfo">
   
    <div class="form-group col-md-12">
	<label class="col-sm-2 control-label" style="font-size: 14px;">用户类型</label>
	<div class="col-sm-10">
		<select class="form-control myinput" name="sfytd"  data-bv-notempty="true" 
			   data-fv-notempty-message="此项不能为空"  placeholder="用户类型">
			<option value="">---请选择用户类型---</option>
			<c:forEach  items="${rangeList}" var="list">
             <option value="${list.lbdm}">${list.lbmc}</option>
           </c:forEach>
		</select>
	</div>
</div>

<div class="form-group col-md-12" style="display:none">
		<label class="col-sm-2 control-label" style="font-size: 14px;">企业法人名称</label>
		<div class="col-sm-10">
			<input type="text" class="form-control myinput" name="companyMc"
				placeholder="请输入企业法人名称即企业名称" data-bv-notempty="true" 
			   data-fv-notempty-message="此项不能为空" >
			<div style="color: #ccc">即企业完整的公司名称</div>
		</div>
	</div>
   
	<div class="form-group col-md-12">
		<label class="col-sm-2 control-label" style="font-size: 14px;">真实姓名</label>
		<div class="col-sm-10">
			<input type="text" class="form-control myinput" name="xm"
				placeholder="请输入真实姓名" data-bv-notempty="true" 
			   data-fv-notempty-message="此项不能为空" >
		</div>

	</div>
	<div class="form-group col-md-12">
		<label class="col-sm-2 control-label" style="font-size: 14px;">身份证号</label>
		<div class="col-sm-10">
			<input type="text" class="form-control myinput" name="sfzjh"
				placeholder="请输入身份证号"  data-bv-notempty="true" 
			   data-fv-notempty-message="此项不能为空" 
			   data-bv-regexp="true" 
			   data-bv-regexp-regexp="^(\d{15}$|^\d{18}$|^\d{17}(\d|X|x))$" 
			   data-bv-regexp-message="身份证号格式不正确">
		</div>
	</div>
	
	<div class="form-group col-md-12">
		<label class="col-sm-2 control-label" style="font-size: 14px;">认证须知</label>
		<div class="col-sm-10">
			<p style="margin-bottom:15px;background-color:#EEE;padding:10px;font-size:12px;color:#999;">您的个人信息不会透露给第三方，请放心填写。已经提交的认证信息无法自行修改，如果需要修改认证信息请 <a>联系客服</a></p>
			
		</div>
	</div>
	
	
	<div class="form-group col-sm-12">
		<label class="col-sm-2 control-label" style="font-size: 14px;">参考样例</label>
		<div class="col-sm-10">
		    <div id="ckal">
				 <img src="../statics/images/card/certificateFront.png" style="width:300px;"/>
				 <img src="../statics/images/card/certificateBack.png"  style="width:300px;" />	
			</div>
		</div>
	</div>
	
	
	
	<div class="form-group  met-upfile">
		<label class="col-sm-2 control-label" style="font-size: 14px;">身份证正面照附件(500kb以内)</label>
		<div class="col-sm-10" style="padding-bottom: 10px;">
			<div id="sfzzmztjidUpload" class="bh-l-inline sfz-icon-container pointed">
			    <i class="bh-file-img-plus">+</i>
				<img
					src=""
					id="sfzzmztjidImg" class="sfzImg" />
			</div>
			<div id="sfzzmztjidBrower" class="uploadBrower"></div>
		</div>
	</div>
	
	<div class="form-group  met-upfile">
		<label class="col-sm-2 control-label" style="font-size: 14px;">身份证反面照附件(500kb以内)</label>
		<div class="col-sm-10" style="padding-bottom: 10px;">
			<div id="sfzfmztjidUpload" class="bh-l-inline sfz-icon-container pointed">
			<i class="bh-file-img-plus">+</i>
				<img
					src=""
					id="sfzfmztjidImg" class="sfzImg" />
			</div>
			<div id="sfzfmztjidBrower" class="uploadBrower"></div>
		</div>
	</div>
	
	<div  id="enterpriseCard" style="display:none;">
       
       
        <div class="form-group col-md-12">
	      <div class="label">
			<span data-fv-labelfor="fv-jurCode">企业资质类型</span>
		  </div>
		  <div id="tabs-green" style="font-size:14px;height:32px;line-height: 32px">
						<ul>
							<li><a href="javascript:void(0)" class="tab active" data-num="1" id="threeCardTab">三证</a></li>
							<li><a href="javascript:void(0)" class="tab" data-num="2" id="oneCardTab">三证合一</a></li>
						</ul>
		 </div>
	   </div>
	   
	   <div class="form-group  met-upfile">
		<label class="col-sm-2 control-label" style="font-size: 14px;">营业执照扫描件(500kb以内)</label>
		<div class="col-sm-10" style="padding-bottom: 10px;">
			<div id="businessLicenceScannerUpload" class="bh-l-inline sfz-icon-container pointed">
			<i class="bh-file-img-plus">+</i>
				<img
					src=""
					id="businessLicenceScannerImg" class="sfzImg" />
			</div>
			<div id="businessLicenceScannerBrower" class="uploadBrower"></div>
		</div>
	</div>
         <!--  三证  -->
	   <div  id="three">
	   <div class="form-group col-md-12">
		<label class="col-sm-2 control-label" style="font-size: 14px;">营业执照号</label>
		<div class="col-sm-10">
			<input type="text" class="form-control myinput" name="businessLicenceNo"
				placeholder="请输入营业执照号"  data-bv-notempty="true" 
			   data-fv-notempty-message="此项不能为空">
		  </div>
	   </div>   
	      
	      
	   <div class="form-group  met-upfile">
		<label class="col-sm-2 control-label" style="font-size: 14px;">组织机构代码扫描件(500kb以内)</label>
		<div class="col-sm-10" style="padding-bottom: 10px;">
			<div id="organizateCodeScannerUpload" class="bh-l-inline sfz-icon-container pointed">
			<i class="bh-file-img-plus">+</i>
				<img
					src=""
					id="organizateCodeScannerImg" class="sfzImg" />
			</div>
			<div id="organizateCodeScannerBrower" class="uploadBrower"></div>
		</div>
	   </div>
	   
	   <div class="form-group col-md-12">
	   	<label class="col-sm-2 control-label" style="font-size: 14px;">组织机构代码</label>
		<div class="col-sm-10">
			<input type="text" class="form-control myinput" name="organizateCodeNo"
				placeholder="请输入组织机构代码"  data-bv-notempty="true" 
			   data-fv-notempty-message="此项不能为空" >
		  </div>
	   </div>   
	   
	   <div class="form-group col-md-12">
		<label class="col-sm-2 control-label" style="font-size: 14px;">选填信息</label>
		<div class="col-sm-10">
			<p style="margin-bottom:15px;background-color:#EEE;padding:10px;font-size:12px;color:#999;">税务登记信息可随您企业的实际情况随时调整，不影响您在平台上的签单发包行为。</p>
		</div>
	  </div>
	   
	 <div class="form-group  met-upfile">
		<label class="col-sm-2 control-label" style="font-size: 14px;">税务登记扫描件(500kb以内)</label>
		<div class="col-sm-10" style="padding-bottom: 10px;">
			<div id="taxRegistrationScannerUpload" class="bh-l-inline sfz-icon-container pointed">
			<i class="bh-file-img-plus">+</i>
				<img
					src=""
					id="taxRegistrationScannerImg" class="sfzImg" />
			</div>
			<div id="taxRegistrationScannerBrower" class="uploadBrower"></div>
		</div>
	   </div>
	   
	   <div class="form-group col-md-12">
	   	<label class="col-sm-2 control-label" style="font-size: 14px;">税务登记证号</label>
		<div class="col-sm-10">
			<input type="text" class="form-control myinput" name="taxRegistrationNo"
				placeholder="请输入税务登记证号">
		  </div>
	   </div>   
	
  </div>
	 <!--  三证合一 --> 
    <div id="threeAndOne"  style="display:none;">
        <div class="form-group col-md-12">
	   	<label class="col-sm-2 control-label" style="font-size: 14px;">统一社会信用代码</label>
		<div class="col-sm-10">
			<input type="text" class="form-control myinput" name="socialCreditCode"
				placeholder="请输入统一社会信用代码"  data-bv-notempty="true" 
			   data-fv-notempty-message="此项不能为空" >
		  </div>
	   </div>   
    </div>	   
	   
       
   </div>
	
</div>
