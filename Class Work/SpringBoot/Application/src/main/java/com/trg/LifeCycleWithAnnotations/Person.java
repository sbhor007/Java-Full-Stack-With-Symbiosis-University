package com.trg.LifeCycleWithAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {
	private String name;
	private Integer age;
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("Inside init method");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Inside destroy  method");
	}
	
}
