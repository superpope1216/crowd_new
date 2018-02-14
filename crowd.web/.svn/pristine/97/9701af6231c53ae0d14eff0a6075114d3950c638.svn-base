package com.wisedu.crowd.controller.center;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("publishingQuestion")
public class PublishingQuestionController {

	@RequestMapping("index")
	public ModelAndView index(String parentId,String rwid) throws Exception{
		ModelAndView mv=new ModelAndView();
		mv.addObject("parentId", parentId);
		mv.addObject("rwid", rwid);
		mv.setViewName("center/publishingQuestion");
		return mv;
	}
}
