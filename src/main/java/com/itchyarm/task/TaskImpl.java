package com.itchyarm.task;

import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TaskImpl implements Task {
	
	private static Logger logger = LogManager.getLogger(TaskImpl.class.getName());
    
	private String name = "";
	private Date lastDate = null;

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
		logger.info("Changed name to " + name);
	}

	public Date getLastDate() {
		return lastDate;
	}
		
	public void setLastDate() {
		this.lastDate = new Date();
	}
	
	public void setLastDate( Date date ) {
		this.lastDate = date;
	}
}