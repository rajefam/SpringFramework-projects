package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.practice.sbeans.Employee;

@SpringBootApplication
public class BasicProj06ConfigurationPropertiesOnArrayListSetHasAPropertiesApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx=SpringApplication.run(BasicProj06ConfigurationPropertiesOnArrayListSetHasAPropertiesApplication.class, args);
	
	Employee emp = ctx.getBean("emp1",Employee.class);
	
	System.out.println(emp);
	
	
	}

}
