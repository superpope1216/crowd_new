package com.wisedu.crowd.controller.gzzx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("concact")
public class ConcactController {

	@RequestMapping("index")
	public String index(){
		return "gzzx/concact";
	}
}
