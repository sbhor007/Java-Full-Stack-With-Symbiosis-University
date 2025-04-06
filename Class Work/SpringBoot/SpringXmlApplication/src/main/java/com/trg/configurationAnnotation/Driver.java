package com.trg.configurationAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class A{

	@Override
	public String toString() {
		return "Class A";
	}
	
}

class B{
	
	@Override
	public String toString() {
		return "Class B";
	}
	
}

@Configuration
class config{
	@Bean
	public A myA() {
		return new A();
	}
	@Bean(name = "testB")
	public B myB() {
		return new B();
	}
}

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		A objA = (A) context.getBean("myA");
		System.out.println(objA + " : bean without name");
		
		B objB = (B) context.getBean("testB");
		System.out.println(objB + " : bean with name");
	}
}
