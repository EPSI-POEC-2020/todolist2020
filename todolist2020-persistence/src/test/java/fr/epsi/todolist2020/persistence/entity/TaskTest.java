package fr.epsi.todolist2020.persistence.entity;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

public class TaskTest {
	
	private static final String FRENCH_DATE_FORMAT = "dd/MM/yyyy";
	private static final String START_DATE_IN_THE_FUTURE = "03/01/2020";
	private static final String TASK_LABEL = "Je suis une tâche";
	static Task task = new Task();
	
	@BeforeClass
	public static void setUp () throws ParseException {
		task.setStartDate(new SimpleDateFormat(FRENCH_DATE_FORMAT).parse(START_DATE_IN_THE_FUTURE));
		task.setLabel(TASK_LABEL);
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
}
