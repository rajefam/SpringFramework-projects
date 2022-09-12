package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.sbeans.Company;

@SpringBootApplication
public class BasicProj05ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BasicProj05ConfigurationPropertiesApplication.class, args);
		
		Company company=ctx.getBean("cmp",Company.class);
		System.out.println(company);
		
		//close container
		 ((ConfigurableApplicationContext) ctx).close();
	}

}
