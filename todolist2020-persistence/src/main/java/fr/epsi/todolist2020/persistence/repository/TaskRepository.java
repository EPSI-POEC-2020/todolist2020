package fr.epsi.todolist2020.persistence.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.epsi.todolist2020.persistence.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

	List<Task> findByStatus(boolean status);

	List<Task> findByStatusAndStartDateLessThan(boolean status, Date date);

}
