package com.in28minutes.usercontrol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	
	@RequestMapping(value = "/portfolio")
	protected String userMapping(){
		return "portfolio";
	}

}
