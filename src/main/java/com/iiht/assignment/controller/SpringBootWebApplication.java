package com.iiht.assignment.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 

   @ComponentScan("com.iiht")
   @EntityScan("com.iiht.assignment.model")
   @EnableJpaRepositories("com.iiht.assignment.repo")
	@SpringBootApplication
	public class SpringBootWebApplication  {

		
		public static void main(String[] args) throws Exception {
			SpringApplication.run(SpringBootWebApplication.class, args);
		}

	}


