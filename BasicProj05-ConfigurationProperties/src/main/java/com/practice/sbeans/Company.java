package com.practice.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Component("cmp")
@Setter
@ToString
@ConfigurationProperties(prefix ="com.practice" )
@PropertySource("App.properties")
public class Company {
	
	private String name;
	private  String addrs;
	private  Long pincode;
	@Value("${practice.phone}")
	private  Long contact;
	
	@Value("${practice.size}")
	private Integer size;
	

}
