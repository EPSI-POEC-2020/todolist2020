package fr.epsi.todolist2020.persistence.repository;

import static org.junit.Assert.assertTrue;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class TaskRepositoryTest {

	@Autowired
	private TaskRepository taskRepository;

	@Test
	public void testTaskIsFindable() {
		assertTrue(taskRepository.findOne(1L) != null);
	}
	
	@Test
	public void testFindAllTasksUndone() {
		assertTrue(CollectionUtils.isNotEmpty(taskRepository.findByStatus(false)));
	}
	
	@Test
	public void testFindAllTasksDone() {
		assertTrue(CollectionUtils.isNotEmpty(taskRepository.findByStatus(true)));
	}

}
