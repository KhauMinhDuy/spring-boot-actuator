package com.khauminhduy.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.khauminhduy.dto.TodoItemDto;
import com.khauminhduy.model.TodoItem;

@Component
public class TodoItemConverter implements Converter<TodoItem, TodoItemDto>{

	@Override
	public TodoItemDto convert(TodoItem item) {
		return new TodoItemDto(item.getItem(), item.isComplete());
	}

}
