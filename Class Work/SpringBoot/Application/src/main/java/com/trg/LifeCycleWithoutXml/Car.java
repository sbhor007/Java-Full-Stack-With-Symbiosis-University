package com.trg.LifeCycleWithoutXml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Car {
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void test() {
		System.out.println("Car test Method");
	}
	
	@PreDestroy
	public void distroy() throws Exception {
		System.out.println("Inside Destroy method");
	}
	
	@PostConstruct
	public void initMethod() throws Exception{
		System.out.println("Insid Init Method");
	}
}
