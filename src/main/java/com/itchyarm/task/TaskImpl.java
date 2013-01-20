package com.itchyarm.task;

import java.util.Date;

public class TaskImpl implements Task {
	
	private String name = "";
	private Date lastDate = null;

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
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