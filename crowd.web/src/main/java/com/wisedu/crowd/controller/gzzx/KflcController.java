/**
 * Project Name:crowd.web
 * File Name:KflcController.java
 * Package Name:com.wisedu.crowd.controller.gzzx
 * Date:2018年2月8日上午10:01:04
 * Copyright (c) 2018, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.controller.gzzx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wisedu.crowd.controller.BaseController;

/**
 * ClassName:KflcController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年2月8日 上午10:01:04 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Controller
@RequestMapping("kflc")
public class KflcController extends BaseController{

	@RequestMapping("index")
	public String index() {
		return "gzzx/kflc";
	}
}

