package com.ramtech.business;

import java.util.ArrayList;
import java.util.List;

import com.ramtech.service.TodoService;

public class TodoBusinessImpl {
	
	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	public List<String> retriveSpringTodoList(String Users){
		List<String> todoAllList = todoService.getTodoList("Dummy");
		List<String> filteredTodoList = new ArrayList<String>();
		for(String todo:todoAllList) {
			if(todo.contains("Spring")) {
				filteredTodoList.add(todo);
			}
		}
		return filteredTodoList;
		
	}
	
	
}
