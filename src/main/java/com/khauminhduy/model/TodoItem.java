package com.khauminhduy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TODO_ITEM")
@Getter
@Setter
public class TodoItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "todo_item_id")
	private Long id;

	@Column(nullable = false)
	private String item;

	@Column(nullable = false)
	private boolean complete;
	
	@ManyToOne
	@JoinColumn(name = "todo_list_id", insertable = false, updatable = false)
	private TodoList todoList;

}
