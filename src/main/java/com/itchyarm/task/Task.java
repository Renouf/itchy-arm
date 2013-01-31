package com.itchyarm.task;

import java.util.Date;

public interface Task {

	public String getName();

	public void setName(String name);

	public Date getLastDate();

	public void setLastDate();

	public void setLastDate(Date date);
}