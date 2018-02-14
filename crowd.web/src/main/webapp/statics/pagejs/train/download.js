define(function(require, exports, module) {
	//新手引导连接
    $(".btn-group button").click(function(){
    	   var text=$(this).text();
    	   if(text=="前往云工场"){
  			 window.location.href=basePath+"/index.jsp";
    	   }else if(text=="下载配套材料"){
		        window.open("http://pan.baidu.com/s/1pL3CSXX");

    	   }else if(text=="学习圈"){
		        window.open("http://bbs.wisedu.com");

    	   }else if(text=="免费下载(Mac)"){
		        window.open("http://pan.baidu.com/s/1jIdoaMU");

    	   }else if(text=="免费下载(Win)"){
 		        window.open("http://pan.baidu.com/s/1c1QAN4G");

    	   }else if(text=="支持网站(res)"){
		       window.open("http://res.wisedu.com/");
    	   }else if(text=="支持网站(jqx)"){
  		       window.open("http://www.jqwidgets.com/jquery-widgets-demo/");

    	   }else if(text=="课程"){
  		        window.open("http://campuscrowd.chinamoocs.com/portal/course/1545/1957.mooc");

    	   }
    });
});