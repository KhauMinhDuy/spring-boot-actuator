package com.khauminhduy.converter;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.khauminhduy.dto.TodoItemDto;
import com.khauminhduy.dto.TodoListDto;
import com.khauminhduy.model.TodoItem;
import com.khauminhduy.model.TodoList;

@Component
public class TodoListConverter implements Converter<TodoList, TodoListDto>{

	@Autowired
	private TodoItemConverter itemConverter;
	
	@Override
	public TodoListDto convert(TodoList source) {
		List<TodoItem> items = source.getItems();
		List<TodoItemDto> itemDtos = items.stream().map(itemConverter::convert).collect(toList());
		return new TodoListDto(source.getName(), itemDtos);
	}

}
