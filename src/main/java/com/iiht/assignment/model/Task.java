package com.iiht.assignment.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="task")


public class Task implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long task_id;
	long parent_id;
	String task;
	int priority;
	Date start_date;
	Date end_date;
	
   public Task(){
		
	}

public Task(long task_id, long parent_id, String task, int priority,
		Date start_date, Date end_date) {
	super();
	this.task_id = task_id;
	this.parent_id = parent_id;
	this.task = task;
	this.priority = priority;
	this.start_date = start_date;
	this.end_date = end_date;
}

public long getTask_id() {
	return task_id;
}

public void setTask_id(long task_id) {
	this.task_id = task_id;
}

public long getParent_id() {
	return parent_id;
}

public void setParent_id(long parent_id) {
	this.parent_id = parent_id;
}

public String getTask() {
	return task;
}

public void setTask(String task) {
	this.task = task;
}

public int getPriority() {
	return priority;
}

public void setPriority(int priority) {
	this.priority = priority;
}

public Date getStart_date() {
	return start_date;
}

public void setStart_date(Date start_date) {
	this.start_date = start_date;
}

public Date getEnd_date() {
	return end_date;
}

public void setEnd_date(Date end_date) {
	this.end_date = end_date;
}

@Override
public String toString() {
	return "Task [task_id=" + task_id + ", parent_id=" + parent_id + ", task="
			+ task + ", priority=" + priority + ", start_date=" + start_date
			+ ", end_date=" + end_date + "]";
}
	
  

}
