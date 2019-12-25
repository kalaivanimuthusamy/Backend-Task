package com.iiht.assignment.controller;


import java.util.List;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.assignment.model.Task;

import com.iiht.assignment.service.TaskService;

import com.iiht.asssignment.bo.TaskBo;


@RestController
@RequestMapping("/SpringHibernateCapRest")
@CrossOrigin("*")
public class HomeController  {
	
	

	@Autowired	
	TaskService serviceTask;	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {	
		
		System.out.println("Welcome");
		return "menu";
	}
	
		

		
	@RequestMapping(method=RequestMethod.DELETE, path="/deltask/{taskId}")
	public ResponseEntity<Void> deleteTask(@PathVariable("taskId") long taskId){

		serviceTask.delTask(taskId);
		return new ResponseEntity<Void>(HttpStatus.GONE);
	}

	
	
	
	
	
@RequestMapping(method=RequestMethod.GET,value="/task/{taskId}")
	
	public @ResponseBody Task fetchTask(@PathVariable("taskId") long serTask){
		
		
		return serviceTask.serTask(serTask);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, path="/addtask")
	//@ResponseBody
	public ResponseEntity<Void> addTask(@RequestBody TaskBo bo){
		 
		Task s =null;
		try { 
	    System.out.println("bo.getStartDate()"+bo.getStartDate());
	    System.out.println("bo.getEndDate()"+bo.getEndDate());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
         java.util.Date date = sdf.parse(bo.getStartDate()); 
         java.sql.Date sqlDate = new java.sql.Date(date.getTime()); 
         
         java.util.Date edate = sdf.parse(bo.getEndDate()); 
         java.sql.Date esqlDate = new java.sql.Date(edate.getTime()); 
         
 		 s=new Task();
 		 System.out.println(""+bo.getParentId());
 		System.out.println(""+bo.getTask());
 		System.out.println(""+sqlDate);
 		System.out.println(""+esqlDate);
 		System.out.println(""+bo.getPriority());
 		s.setParent_id(bo.getParentId());
 		s.setTask(bo.getTask());
 		s.setStart_date(sqlDate);
 		s.setEnd_date(esqlDate);
 		s.setPriority(bo.getPriority());
 		serviceTask.addTask(s);
 		
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e.getStackTrace());
		}
				
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/tasks")
	public @ResponseBody List<Task> fetchAllTasks(){
		
		return serviceTask.loadAllTasks();
		 
	}
	
	
	
	
	@RequestMapping(method=RequestMethod.PUT, path="/updatetask")
	@ResponseBody
	public ResponseEntity<Void> updateTask(@RequestBody TaskBo bo){
		
		Task s =null;
		try { 
	    System.out.println("bo.getStartDate()"+bo.getStartDate());
	    System.out.println("bo.getEndDate()"+bo.getEndDate());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
         java.util.Date date = sdf.parse(bo.getStartDate()); 
         java.sql.Date sqlDate = new java.sql.Date(date.getTime()); 
         
         java.util.Date edate = sdf.parse(bo.getEndDate()); 
         java.sql.Date esqlDate = new java.sql.Date(edate.getTime()); 
         
 		 s=new Task();
 		 System.out.println(""+bo.getParentId());
 		System.out.println(""+bo.getTask());
 		System.out.println(""+sqlDate);
 		System.out.println(""+esqlDate);
 		System.out.println(""+bo.getPriority());
 		s.setTask_id(bo.getTaskId());
 		s.setParent_id(bo.getParentId());
 		s.setTask(bo.getTask());
 		s.setStart_date(sqlDate);
 		s.setEnd_date(esqlDate);
 		s.setPriority(bo.getPriority());
 		serviceTask.updateTask(s);
 		
		}
		catch(Exception e)
		{
			System.out.println("e"+e);
		}
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	
	
}
