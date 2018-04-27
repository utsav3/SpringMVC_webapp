package com.in28minutes.todo;

import java.util.Date;

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
	protected String showTodos( ModelMap model){
		
		model.addAttribute("todos", service.retrieveTodos("Utsav"));
		return "list-todos";
	}
	
	@RequestMapping(value="/add-todo", method=RequestMethod.POST)
	public String addTodo( Todo todo,ModelMap model){
		service.addTodo("Utsav", todo.getDesc(), new Date(), false);
		return "redirect:list-todos";
	}
	@RequestMapping(value="/add-todo", method=RequestMethod.GET)
	public String showTodoPage(ModelMap model){
		model.addAttribute("todo",new Todo(0,"Utsav",""
				, new Date(),false));
		return "todo";
	}
	
	@RequestMapping(value="/delete-todo", method=RequestMethod.GET)
	public String deleteTodo(ModelMap model,@RequestParam int id){
		service.deleteTodo(id);
		model.clear();
		return "redirect:list-todos";
	}
	
}
