package com.wisedu.crowd.controller.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("error")
public class ErrorController {

	@RequestMapping("index")
	public ModelAndView index(String errorCode) throws Exception{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("error/error");
		mv.addObject("errorCode", errorCode);
		return mv;
	}
}
