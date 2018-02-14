<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
	
.met-upfile .file-drop-zone {
	border: 0px;
	margin: 0px;
}

.met-upfile .file-preview {
	border-radius: 0px;
	max-width: 220px;
} /*display:none;*/
.met-upfile .kv-upload-progress {
	max-width: 220px;
} /*display:none;*/
.met-upfile .kv-upload-progress .progress {
	border-radius: 0px;
} /*display:none;*/
.met-upfile .file-preview .file-actions {
	display: none;
}

.met-upfile .file-preview-frame {
	box-shadow: none;
	display: block;
	margin: 0px;
	border: 0;
	padding: 0px;
	float: none;
	height: auto;
}

.met-upfile .file-preview-frame img {
	width: 100% !important;
	height: auto !important;
}

.met-upfile .file-preview-frame:hover {
	box-shadow: none;
}

.met-upfile .file-drop-zone-title {
	font-size: 30px;
}

.met-upfile .fileinput-cancel-button {
	width: 76px;
}

.met-upfile .progress {
	margin-bottom: 10px;
}

.uploadBrower {
     width: 106px;
     position: absolute;
     top: 8px;
     left: 166px;
     visibility: hidden;
}

.headImg {
     width: 97px;
     height: 97px;
     position: relative;
     top: -1px;
     border-radius: 52px;
}

.sfzImg {
  /*    width: 303px; */
     height: 193px;
     position: relative;
     top: -105px;
     z-index:-1;
     
}

.bh-file-img-plus{
    position:relative;
    color: #bbb;
    font-size: 60px;
    display: block;
    font-style: normal;
    left: 40%;
    top: 20%;
}


.sfz-icon-container {
    width:303px;
    height:193px;
    background-color:#F3F3F3;    
    border: solid 1px #ddd;
}

.uploadPosition {
     border-radius: 52px;
     vertical-align: middle;
}

.bi-icon-container {
    width:97px;
    height:97px;
    background-color:#F3F3F3;    
    border: solid 1px #ddd;
}

.pointed{
    cursor:pointer;
}

</style>
   
     <input type="hidden" name="wid" id="xyWid" />
     <input type="hidden" name="yhid" id="yhId" />
     <input type="hidden" name="pxxyzpid"  id="pxxyzpid"/>
     
      <div class="form-group col-md-12">
			<label class="col-sm-2 control-label" style="font-size: 14px;">上传头像须知</label>
			<div class="col-sm-10">
				<p style="margin-bottom:15px;background-color:#EEE;padding:10px;font-size:12px;color:#999;">请上传500K以内的图片,建议200*200</p>
			</div>
	  </div>
	
	 <div class="form-group  col-md-12">
		<label class="col-sm-2 control-label" style="font-size: 14px;margin-top:28px;">头像</label>
           <div class="col-sm-10" style="padding-bottom: 10px;">
		<div id="headUpload" class="bh-l-inline bi-icon-container uploadPosition pointed">
			 <img src="<%=request.getContextPath()%>/statics/images/card/kfz.png" id="headImg" class="headImg" />
		</div>
		<div id="headBrower" class="uploadBrower"></div>
		</div>
	</div>
	
	<div class="form-group col-md-12">
		<label class="col-sm-2 control-label" style="font-size: 14px;" >姓名</label>
		<div class="col-sm-10">
			<input type="text" class="form-control myinput " name="xm" 
				placeholder="请输入姓名"  data-bv-notempty="true"  
				data-bv-notempty-message="此项不能为空">
		</div>
	</div>
	
	<div class="form-group col-md-12">
		<label class="col-sm-2 control-label" style="font-size: 14px;">手机</label>
		<div class="col-sm-10">
			<input type="text" class="form-control myinput" name="sj"
			  data-bv-notempty="true"  data-fv-notempty-message="此项不能为空" 
				placeholder="为了方便需求方与您沟通，请输入手机号">
		</div>
	</div>
	
	<div class="form-group col-md-12">
		<label class="col-sm-2 control-label" style="font-size: 14px;">QQ</label>
		<div class="col-sm-10">
			<input type="text" class="form-control myinput" name="qq"
			data-bv-notempty="true" data-fv-notempty-message="此项不能为空" 
			placeholder="为了方便需求方与您沟通，请输入QQ号">
		</div>
	</div>
	
	<div class="form-group col-md-12">
		<label class="col-sm-2 control-label" style="font-size: 14px;">从业年份</label>
		<div class="col-sm-10">
		<input class="form-control datepicker" type="text"  name="cynf"
			placeholder="请输入从业年份"data-bv-date="true" 
			data-bv-date-format="YYYY-MM-DD"
			data-bv-date-message="请输入正确的日期格式">
		</div>
	</div>
	
	<div class="form-group col-md-12">
		<label class="col-sm-2 control-label" style="font-size: 14px;" >服务学校</label>
		<div class="col-sm-10">
			<input type="text" class="form-control myinput " name="fwxx" 
				placeholder="请输入学校名称"  data-bv-notempty="true"  
				data-bv-notempty-message="此项不能为空">
		</div>
	</div>
	
	<div class="form-group col-md-12">
		<label class="col-sm-2 control-label" style="font-size: 14px;" >擅长技术</label>
		<div class="col-sm-10">
			<input type="text" class="form-control myinput " name="scjs" 
				placeholder="请输入擅长技术，用逗号隔开"  data-bv-notempty="true"  
				data-bv-notempty-message="此项不能为空">
		</div>
	</div>
	
	


	