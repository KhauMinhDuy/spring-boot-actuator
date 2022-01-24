package com.khauminhduy.repository;

import org.springframework.data.repository.CrudRepository;

import com.khauminhduy.model.TodoList;

public interface TodoRepository extends CrudRepository<TodoList, Long>{

}
