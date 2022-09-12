package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.sbeans.Hotel;

@SpringBootApplication
public class BasicProj04ValueAnnotationSpelApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BasicProj04ValueAnnotationSpelApplication.class, args);
		
		
		Hotel hotel=ctx.getBean("hotel",Hotel.class);
		System.out.println(hotel);
		//close the IOC container
			((ConfigurableApplicationContext) ctx).close();
		
	}

}
