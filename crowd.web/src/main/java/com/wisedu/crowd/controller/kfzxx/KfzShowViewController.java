package com.wisedu.crowd.controller.kfzxx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wisedu.crowd.controller.BaseController;

@Controller
@RequestMapping("kfzview")
public class KfzShowViewController extends BaseController{

	@RequestMapping("index")
	public String index(){
		return "kfzgl/kfzxx/view/showview";
	}
}
