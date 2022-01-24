package com.khauminhduy.service;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khauminhduy.converter.TodoListConverter;
import com.khauminhduy.dto.TodoListDto;
import com.khauminhduy.repository.TodoRepository;

@Service
public class TodoService {

	@Autowired
	private TodoListConverter todoListConverter;
	
	@Autowired
	private TodoRepository todoRepository;
	
	public List<TodoListDto> getTodoList() {
		return StreamSupport.stream(todoRepository.findAll().spliterator(), false)
				.map(todoListConverter::convert)
				.collect(toList());
	}
	
}
