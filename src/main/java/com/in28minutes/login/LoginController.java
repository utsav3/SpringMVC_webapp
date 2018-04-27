package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.login.LoginService;


@Controller
//Name is set for the session used
@SessionAttributes("name")
public class LoginController { 

	//Set Login Service- Autowiring 
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	protected String sayHello(){
		return "login";
	}
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	protected String postMethod(@RequestParam String name, 
			@RequestParam String password,ModelMap model){
		
		if(!service.validateUser(name, password)){
			model.put("ErrorMessage", "Invalid User");
			return "login";
		}
		model.put("name" , name);
		model.put("password", password);
		return "welcome";
		
	}
}
