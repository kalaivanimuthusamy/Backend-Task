package com.iiht.assignment.repo;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.iiht.assignment.model.Task;

public class TaskCustomRepoImpl implements TaskCustomRepo{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void updateTask(Task t1) {
		// TODO Auto-generated method stub
		

		Task updateTask=em.find(Task.class,t1.getTask_id());
		updateTask.setPriority(t1.getPriority());
		updateTask.setParent_id(t1.getParent_id());
		updateTask.setTask(t1.getTask());
		updateTask.setStart_date(t1.getStart_date());
		updateTask.setEnd_date(t1.getEnd_date());
 		

		em.merge(updateTask);
		
	}	

}
