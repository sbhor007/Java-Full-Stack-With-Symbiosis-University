package com.trg.annotationWithQulifier;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private Integer age;
	private String name;
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
