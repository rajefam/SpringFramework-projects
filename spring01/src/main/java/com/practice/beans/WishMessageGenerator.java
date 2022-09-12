package com.practice.beans;

import java.util.*;

public class WishMessageGenerator {

	private Date date;
	
	public WishMessageGenerator() {
		System.out.println("0 - param constructor");
	}

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	
	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()");
		int hrs= date.getHours();
		if(hrs < 12) 
			return "Good Morning:"+user;
			else if(hrs<16)
				return "Good Afternoon:"+user;
			else if(hrs<20)
				return "Good evening:"+user;
			else
				return "Good night:"+user;
	}

	

	
	
}
