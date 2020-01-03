package fr.epsi.todolist2020.persistence.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="todolist")
public class Todolist {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_todolist")
	private long id;
	
	@Column
	private String name;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="id_todolist")
	private List<Task> tasks = new ArrayList<Task>();

	public List<Task> getTasks() {
		return this.tasks ;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

}
