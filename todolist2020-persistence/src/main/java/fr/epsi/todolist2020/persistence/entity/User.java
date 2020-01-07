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
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_user")
	private long id;
	
	@Column(length=100, nullable = false)
	private String name;
	
	@Column
	private String surname;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="id_user")
	private List<Todolist> todolists = new ArrayList<Todolist>();

	public List<Todolist> getTodolists() {
		return todolists;
	}

	public void setTodolists(List<Todolist> todolists) {
		this.todolists = todolists;
	}
	
	
}
