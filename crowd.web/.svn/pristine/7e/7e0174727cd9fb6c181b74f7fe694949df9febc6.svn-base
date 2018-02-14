/**
 * 
 */

define(function(require, exports, module) {
	var $$ = jQuery = require('jquery');

	$("#btnFbjyModal").click(function() {
		$("#formPtjy [name='content']").val("");
		$("#fbjyModal").modal("show");
	});
	queryDcl();
	queryClz();
	queryYcl();
	Bcl();
	$("#btnSaveJy").click(
			function() {
				doPost(basePath + "/yjsjjnjy/publish", "content="
						+ $("#formPtjy [name='content']").val(),
						function(data) {
							alert("发布成功！");
							$("#fbjyModal").modal("hide");
							queryDcl();
							queryClz();
							queryYcl();
							Bcl();
						});
			});
	$('#txtContent').keydown(function(e) {
		if (e.keyCode == 13) {
			
			
				queryDcl();
				queryClz();
				queryYcl();
				Bcl();
			
		}
	});
	$("#btnQuery").click(function() {
		
			queryDcl();
			queryClz();
			queryYcl();
			Bcl();
		

	})
	$(".nav-tabs>li>a").click(function() {
		var state = $(this).attr("data-state");
		if (state == "1") {
			$("#divDcl").show();
			$("#divClz").hide();
			$("#divYcl").hide();
			$("#divBcl").hide();

		} else if (state == "2") {
			$("#divDcl").hide();
			$("#divClz").show();
			$("#divYcl").hide();
			$("#divBcl").hide();

		} else if (state == "3") {
			$("#divDcl").hide();
			$("#divClz").hide();
			$("#divYcl").show();
			$("#divBcl").hide();
		} else if (state == "4") {
			$("#divDcl").hide();
			$("#divClz").hide();
			$("#divYcl").hide();
			$("#divBcl").show();
		}
	});
	function queryDcl() {
		doGet(basePath + "/yjsjjnjy/query", "content=" + $("#txtContent").val()
				+ "&zt=1", function(data) {
			if (data && data.datas) {
				var html = "";
				for (var i = 0; i < data.datas.length; i++) {
					var _data = data.datas[i];
					html += '<tr>';
					html += '<td>' + (i + 1) + '</td>';
					html += '<td class="text-left">' + _data.content + '</td>';
					html += '<td>' + _data.fbsj + '</td>';
					html += '</tr>';
				}
				$("#tblDcl").html(html);
			}
		});
	}

	function queryClz() {
		doGet(basePath + "/yjsjjnjy/query", "content=" + $("#txtContent").val()
				+ "&zt=2", function(data) {
			if (data && data.datas) {
				var html = "";
				for (var i = 0; i < data.datas.length; i++) {
					var _data = data.datas[i];
					html += '<tr>';
					html += '<td>' + (i + 1) + '</td>';
					html += '<td class="text-left">' + _data.content + '</td>';
					html += '<td>' + _data.fbsj + '</td>';
					html += '</tr>';
				}
				$("#tblClz").html(html);
			}
		});

	}

	function queryYcl() {
		doGet(basePath + "/yjsjjnjy/query", "content=" + $("#txtContent").val()
				+ "&zt=3", function(data) {
			if (data && data.datas) {
				var html = "";
				for (var i = 0; i < data.datas.length; i++) {
					var _data = data.datas[i];
					html += '<tr>';
					html += '<td>' + (i + 1) + '</td>';
					html += '<td class="text-left">' + _data.content + '</td>';
					html += '<td>' + _data.fbsj + '</td>';
					html += '<td class="text-left">' + _data.clyj + '</td>';
					html += '<td >' + _data.wcsj + '</td>';
					html += '</tr>';
				}
				$("#tblYcl").html(html);
			}
		});
	}

	function Bcl() {
		doGet(basePath + "/yjsjjnjy/query", "content=" + $("#txtContent").val()
				+ "&zt=4", function(data) {
			if (data && data.datas) {
				var html = "";
				for (var i = 0; i < data.datas.length; i++) {
					var _data = data.datas[i];
					html += '<tr>';
					html += '<td>' + (i + 1) + '</td>';
					html += '<td class="text-left">' + _data.content + '</td>';
					html += '<td>' + _data.fbsj + '</td>';
					html += '<td class="text-left">' + _data.clyj + '</td>';
					html += '<td >' + _data.wcsj + '</td>';
					html += '</tr>';
				}
				$("#tblBcl").html(html);
			}
		});
	}
});
