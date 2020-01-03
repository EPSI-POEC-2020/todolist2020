package fr.epsi.todolist2020.persistence.entity;

import java.util.ArrayList;
import java.util.List;

public class Todolist {

	private List<Task> tasks = new ArrayList<Task>();

	public List<Task> getTasks() {
		return this.tasks ;
	}

}
