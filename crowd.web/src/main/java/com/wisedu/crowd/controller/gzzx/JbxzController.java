package com.wisedu.crowd.controller.gzzx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wisedu.crowd.controller.BaseController;

@Controller
@RequestMapping("jbxz")
public class JbxzController extends BaseController{

	@RequestMapping("index")
	public String index(){
		return "gzzx/jbxz";
	}
}
