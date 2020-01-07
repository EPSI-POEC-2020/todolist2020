package fr.epsi.todolist2020.service;

import java.util.List;

import fr.epsi.todolist2020.service.bo.TaskBO;

public interface TaskService {

	List<TaskBO> getOldTasksUndone(int nbDays);

}
