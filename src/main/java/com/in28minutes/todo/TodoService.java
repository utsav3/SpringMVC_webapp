package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

//import com.in28minutes.model.Todo;


//Uses List of TODOS to keep track
//Database is not used
@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;
	
	
	static {
		todos.add(new Todo(1, "Utsav", "Learn Spring MVC", new Date(),false));
		todos.add(new Todo(2, "Utsav", "Learn Struts", new Date(), false));
		todos.add(new Todo(3, "Utsav", "Learn Hibernate", new Date(),false));
	}
	
	public List<Todo> retrieveTodos(String user){
		List<Todo> filteredTodos = new ArrayList<Todo>();
		
		for (Todo todo: todos){
			if(todo.getUser().equals(user))
				filteredTodos.add(todo);
		}
		return filteredTodos;
	}
	
	
	public void addTodo(String name, String desc, Date targetDate, boolean isDone){
		todos.add(new Todo(++todoCount,name,desc,targetDate,isDone));
	}
	
	//Loop through the list and delete
	public void deleteTodo(int id){
		Iterator<Todo> iterator = todos.iterator();
		
		if(iterator.hasNext()){
			Todo todo = iterator.next();
			if(todo.getId() == id)
				iterator.remove();
		}
		
	}
}
