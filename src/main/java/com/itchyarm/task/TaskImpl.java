package com.itchyarm.task;

import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TaskImpl implements Task {

	private static Logger logger = LogManager.getLogger(TaskImpl.class
			.getName());

	private String name = null;
	private Date lastDate = null;

	public TaskImpl() {
		logger.debug("New task created: " + this);
	}

	public TaskImpl(String name) {
		setName(name);
		logger.debug("New task created: " + this);
	}

	public TaskImpl(String name, Date date) {
		setName(name);
		setLastDate(date);
		logger.debug("New task created: " + this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		logger.debug("Changed name to " + name);
	}

	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate() {
		this.lastDate = new Date();
	}

	public void setLastDate(Date date) {
		this.lastDate = date;
	}

	public String toString() {
		return "Task Name: " + getName() + ", Task Date: " + getLastDate();
	}
}