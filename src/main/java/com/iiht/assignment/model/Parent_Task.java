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
@Table(name="parent_task")

public class Parent_Task implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long parent_id;
	String parent_task;
	
	public Parent_Task(long parent_id, String parent_task) {
		super();
		this.parent_id = parent_id;
		this.parent_task = parent_task;
	}

	public Parent_Task(){
		
	}

	public long getParent_id() {
		return parent_id;
	}

	public void setParent_id(long parent_id) {
		this.parent_id = parent_id;
	}

	public String getParent_task() {
		return parent_task;
	}

	public void setParent_task(String parent_task) {
		this.parent_task = parent_task;
	}

	@Override
	public String toString() {
		return "Parent_Task [parent_id=" + parent_id + ", parent_task="
				+ parent_task + "]";
	}
	
	


}
