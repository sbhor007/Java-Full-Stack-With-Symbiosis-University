package com.trg.LifeCycleWithAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		ctx.registerShutdownHook();

	}

}
