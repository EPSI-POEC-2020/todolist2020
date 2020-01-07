package fr.epsi.todolist2020.service;

import static org.junit.Assert.assertTrue;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class TaskServiceTest {

	@Autowired
	private TaskService taskService;

	@Test
	public void testTasksWithStartDateGreaterThan10DaysAreDone() {
		assertTrue(CollectionUtils.isEmpty(taskService.getOldTasksUndone(10)));
	}

}
