package com.todo.items.todolist;

import java.util.Date;

public class TodoItems {
	private int id;
	private String user_name;
	private String user_desc;
	private Date targetDate;
	private boolean isDone;
	
	public TodoItems(int id, String user_name, String user_desc, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.user_desc = user_desc;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_desc() {
		return user_desc;
	}
	public void setUser_desc(String user_desc) {
		this.user_desc = user_desc;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	@Override
	public String toString() {
		return String.format("ToString = TodoItems [id=%s, user_name=%s, user_desc=%s, targetDate=%s, isDone=%s]", id, user_name,
				user_desc, targetDate, isDone);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TodoItems other = (TodoItems) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	

}




