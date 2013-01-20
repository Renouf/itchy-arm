package com.itchyarm.task;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class TestTaskImpl {
	
	@Test
	public void testLifeCycle() {
		Task task = new TaskImpl();
		
		// Check the name getter and setter
		String taskName = "Oil change";
		task.setName(taskName);
		assertEquals("Setting task name doesn't seem to work.", taskName, task.getName());
		
		// Check the date getter and setter
		Date taskDate = new Date();
		task.setLastDate(taskDate);
		assertEquals("Setting task date doesn't seem to work.", taskDate, task.getLastDate());
	}
}