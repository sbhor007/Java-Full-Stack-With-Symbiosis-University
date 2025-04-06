package com.trg.annotationWithQulifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentProfile.class);
		Student profile = (Student) context.getBean("createStudent");
		System.out.println(profile.getAge());
		System.out.println(profile.getName());
		
//		profile.printAge();
//		profile.printName();

	}

}
