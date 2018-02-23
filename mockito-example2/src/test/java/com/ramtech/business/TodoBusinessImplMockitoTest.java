package com.ramtech.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ramtech.service.TodoService;

public class TodoBusinessImplMockitoTest {

	@Test
	public void testByMockito() {
		TodoService todoService = mock(TodoService.class);
		List<String> todoListInput = Arrays.asList("Learn Driving","Learn Spring Boot","Learn Spring MVC");
		when(todoService.getTodoList("Dummy")).thenReturn(todoListInput);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		assertEquals(2, todoBusinessImpl.retriveSpringTodoList("Dummy").size());
	}

}
