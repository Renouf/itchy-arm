package com.itchyarm.task;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TestTaskImpl {
	
	@Test
	public void testLifeCycle() {
		Task task = new TaskImpl();
		
		// Check the name getter and setter
		String taskName = "testLifeCycle";
		task.setName(taskName);
		assertEquals("Setting task name doesn't seem to work.", taskName, task.getName());
		
		// Check the date getter and setter
		Date taskDate = null;
		try {
			taskDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse("2013-02-01 12:42:00.0");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		task.setLastDate(taskDate);
		assertEquals("Setting task date doesn't seem to work.", taskDate, task.getLastDate());
	}

	@Test
	public void testConstructors() {
		Date date = new Date(); 
		Task task = new TaskImpl();
		task = new TaskImpl("testConstructors1");
		task = new TaskImpl("testConstructors2", date);
	}
}