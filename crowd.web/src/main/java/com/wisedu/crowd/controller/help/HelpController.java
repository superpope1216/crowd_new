package com.wisedu.crowd.controller.help;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wisedu.crowd.controller.BaseController;

@Controller
@RequestMapping("help")
public class HelpController extends BaseController{

	@RequestMapping("about")
	public String aboutUs() throws Exception{
		
		return "help/aboutUs";
	}
	
	
}
