package fr.epsi.todolist2020.persistence.entity;

import java.util.Date;

public class Task {

	private String label;
	private Date startDate;
	private Todolist todolist;

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Todolist getTodolist() {
		return this.todolist;
	}

	public void setTodolist(Todolist todolist) {
		this.todolist = todolist;	
	}

}
