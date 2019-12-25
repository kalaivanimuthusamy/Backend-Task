package com.iiht.assignment.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.iiht.assignment.model.Task;


@Repository 
public interface TaskRepo extends JpaRepository <Task,Long>,TaskCustomRepo{	

	
	public Task save(Task task);
	
	
	public Task findById(long task_id );
	
	
	public void deleteById(long task_id);	
	
	public List<Task> findAll();	
	
	
	
}

