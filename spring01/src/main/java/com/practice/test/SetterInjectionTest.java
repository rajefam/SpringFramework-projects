package com.practice.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.practice.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
FileSystemResource res = new FileSystemResource("src/main/java/com/practice/cfgs/applicationContext.xml");
		
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		System.out.println(".......................");
		
		Object object = factory.getBean("wmg");
		
		WishMessageGenerator generator =  (WishMessageGenerator)object;
		
		System.out.println(".......................");
		
		String msg = generator.generateMessage("raja");
		
		System.out.println("Wish Message is :"+msg);
		
		System.out.println("...........................");

	}

}
