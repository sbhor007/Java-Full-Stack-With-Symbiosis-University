package com.trg.annotationWithQulifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentProfile {
	/*
	@Autowired
	@Qualifier("student")
	private Student student;
	
	public StudentProfile() {
	System.out.println("Inside studentQualifieer constuctoe");
		// TODO Auto-generated constructor stub
	}
	
	public void printAge() {
		System.out.println("age : " + student.getAge());
	}
	public void printName() {
		System.out.println("Name : " + student.getName());
	}*/
	@Bean("student1")
	public Student createStudent() {
		
		Student s = new Student();
		s.setName("Santosh");
		s.setAge(21);
		return s;
	}
}
