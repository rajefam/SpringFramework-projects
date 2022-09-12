package com.practice.sbeans;

import java.util.*;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp1")
@Data
@ConfigurationProperties(prefix="org.practice")
public class Employee {
	
	private Integer eno;
	private String ename;
	
	//array type
	private String[] favColors;
	
	//Collection type
	private List<String> nickNames;
	
	private Set<Long> phoneNumbers;
	
	private Map<String,Object> idDetails;
	
	//HAS-A property
	
	private Company company;
	
	

}
