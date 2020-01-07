package fr.epsi.todolist2020.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epsi.todolist2020.persistence.repository.TaskRepository;
import fr.epsi.todolist2020.service.TaskService;
import fr.epsi.todolist2020.service.bo.TaskBO;
import fr.epsi.todolist2020.service.util.DozerUtils;

@Service("TaskService")
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	@Autowired
	private Mapper mapper;

	public List<TaskBO> getOldTasksUndone(int nbDays) {
		Date date = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(date); 
		c.add(Calendar.DATE, -nbDays);
		date = c.getTime();
		return DozerUtils.map(mapper, taskRepository.findByStatusAndStartDateLessThan(false, date), TaskBO.class);
	}

}
