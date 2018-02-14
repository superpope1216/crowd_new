package com.wisedu.crowd.controller.yhgl.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("xy")
public class XjController {

	@RequestMapping("index")
	public String index(){
		return "yhgl/login/xy";
	}
}
