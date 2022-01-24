package com.khauminhduy.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TodoListDto {

	private String name;
	private List<TodoItemDto> items = new ArrayList<>();
	
}
