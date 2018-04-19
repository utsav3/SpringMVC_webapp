package com.in28minutes.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.login.LoginService;


@Controller
public class TodoController { 

	//Set Login Service- Autowiring 
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos", method = RequestMethod.GET)
	protected String showTodos(ModelMap model){
		model.addAttribute("todos", service.retrieveTodos("Utsav"));
		return "list-todos";
	}
	
	
	
}
