<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
    <%
    response.setHeader("Pragma","No-cache");  
    response.setHeader("Cache-Control","no-cache");  
    response.setDateHeader("Expires", 0);
    %>
<head>
<title>智慧校园云工场</title>
<meta name="renderer" content="webkit">
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
<meta name="generator" content="CROWD"  data-variable="123,cn,10001,,10001,123" />
<meta name="description" content="智慧校园云工场" />
<meta name="keywords" content="智慧校园云工场" />
<link href="<%=request.getContextPath() %>/statics/images/favicon1.ico" rel="shortcut icon" type="image/x-icon" />
<!-- <link href="//cdn.bootcss.com/tether/1.3.6/css/tether.min.css" rel="stylesheet">
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/bootstrap/css/bootstrap.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/bootstrap/css/bootstrap-extend.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/assets/css/site.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/fonts/web-icons/web-icons.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/fonts/font-awesome/font-awesome.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/formvalidation/formValidation.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/asscrollable/asScrollable.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/alertify/alertify.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/webui-popover/webui-popover.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/flag-icon-css/flag-icon.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/bootstrap-touchspin/bootstrap-touchspin.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/ladda/ladda.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/filament-tablesaw/tablesaw.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/lightGallery/css/lightgallery.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/swiper/swiper-3.4.2.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/slick/slick.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/slick/slick-theme.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/fonts/7-stroke/7-stroke.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/css/common.css'>
 -->
 <link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/jquery.datastatistics_js/style/style.css'>
 <link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/bootstrap/css/bootstrap.min.css'>
 <link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/bootstrap/css/bootstrap-extend.min.css'>
     <!-- <link rel="stylesheet" href="<%=request.getContextPath() %>/statics/css/new/bootstrap.reset.css">
    
	<link rel="stylesheet" href="<%=request.getContextPath() %>/statics/css/new/style.css"> -->
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/fonts/font-awesome/css/font-awesome.css'>

<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/alertify/3/alertify.core.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/alertify/3/alertify.bootstrap.css'>
 <link rel='stylesheet' href='<%=request.getContextPath() %>/statics/fonts/7-stroke/7-stroke.min.css'>
 <link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/assets/css/site.min.css'>
 <link rel='stylesheet' href='<%=request.getContextPath() %>/statics/fonts/web-icons/web-icons.min.css'>
 <link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/swiper/swiper-3.4.2.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/css/animate.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/css/modal.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/slick/slick.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/slick/slick-theme.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/webui-popover/webui-popover.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/bootstrap-datepicker/css/bootstrap-datepicker3.min.css'>

<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/fonts/glyphicons/glyphicons.min.css'>
<!-- <link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/jQuery-pingfen/starts.css'> -->
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/ladda-bootstrap-master/dist/ladda.min.css'>
<link rel='stylesheet' href='<%=request.getContextPath() %>/statics/plugins/vendor/jQueryRunning/css/jquery.running.css'>


<!-- <link rel='stylesheet' href='<%=request.getContextPath() %>/statics/css/layout.min.css'>-->
 <link rel='stylesheet' href='<%=request.getContextPath() %>/statics/css/main.css'>
 <link rel='stylesheet' href='<%=request.getContextPath() %>/statics/css/crowd.css'>
 <link rel='stylesheet' href='<%=request.getContextPath() %>/statics/css/progress_bar.css'>
 <link rel='stylesheet' href='<%=request.getContextPath() %>/statics/css/advert.css?123'>
 
 <script>
 var jsonurl="";
 
 </script>
</head>