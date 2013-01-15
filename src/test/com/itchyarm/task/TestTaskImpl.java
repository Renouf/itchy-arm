package com.itchyarm.task;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTaskImpl {
	
	@Test
	public void testLifeCycle() {
		Task task = new TaskImpl();
		String name = task.getName();
		task.setName("Testing");
		assertEquals("Setting task name doesn't seem to work.", name, task.getName());
	}
}