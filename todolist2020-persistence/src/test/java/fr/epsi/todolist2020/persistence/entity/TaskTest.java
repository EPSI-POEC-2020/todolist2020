package fr.epsi.todolist2020.persistence.entity;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.BeforeClass;
import org.junit.Test;

public class TaskTest {

	private static final String TASK_LABEL = "Je suis une tâche";
	static Task task = new Task();
	private static Calendar startDateInFuture = Calendar.getInstance();
	private static Todolist todolist = new Todolist();

	@BeforeClass
	public static void setUp(){
		startDateInFuture.add(Calendar.DATE, 1);
		task.setStartDate(startDateInFuture.getTime());
		task.setLabel(TASK_LABEL);
		task.setTodolist(todolist);
		todolist.getTasks().add(task);
	}

	@Test
	public void testTaskGotAName() {

		assertTrue(task.getLabel() != null);
	}

	@Test
	public void testTaskHasStartDate() {

		assertTrue(task.getStartDate() != null);
	}

	@Test
	public void testTaskHasStartDateNotInThePast() {

		assertTrue(task.getStartDate().after(new Date()));
	}
	
	@Test
	public void testTaskHasATodolist() {
		
		assertTrue(task.getTodolist() != null);
	}
	
	@Test
	public void testTaskIsInATodolist() {
	
		assertTrue(CollectionUtils.isNotEmpty(task.getTodolist().getTasks()));
	}
}
