package com.iiht.asssignment.bo;

public class TaskBo {
	
	long taskId; 
	long parentId;
	String task; 	
	Integer priority; 
	String startDate;
	String endDate;
	
	public TaskBo()
	{
		
	}

	public TaskBo(long taskId, long parentId, String task, Integer priority,
			String startDate, String endDate) {
		super();
		this.taskId = taskId;
		this.parentId = parentId;
		this.task = task;
		this.priority = priority;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "TaskBo [taskId=" + taskId + ", parentId=" + parentId
				+ ", task=" + task + ", priority=" + priority + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
	

}
