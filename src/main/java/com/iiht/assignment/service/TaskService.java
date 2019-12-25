package com.iiht.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.iiht.assignment.model.Task;
import com.iiht.assignment.repo.TaskRepo;

@Service
public class TaskService {
	
	@Autowired
	TaskRepo repo;
	
	@Transactional
	public void addTask(Task t1)
	{
		repo.save(t1);
	}
	
	@Transactional
	public void delTask(long taskId)
	{
		repo.deleteById(taskId);
	}
	
	@Transactional
	public void updateTask(Task taskId)
	{
		repo.updateTask(taskId);
	}
	
	public Task serTask(long taskId)
	{
		Task task=repo.findById(taskId);;
		return task;
	}
	
	public List<Task> loadAllTasks()
	{
		List<Task> book=repo.findAll();
		return book;
	}
	

}
