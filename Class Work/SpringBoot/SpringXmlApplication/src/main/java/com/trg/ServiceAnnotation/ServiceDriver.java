package com.trg.ServiceAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service("ms")
class myService{
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int substraction(int a,int b) {
		return a-b;
	}
}

public class ServiceDriver {

	public static void main(String[] args) {
		//contex creation
		AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext();
		contex.scan("com.trg.ServiceAnnotation");
		contex.refresh();
		myService service1 = (myService) contex.getBean("ms");
		System.out.println("Addiotn : "+service1.addition(5, 4));
		System.out.println("Substraction: "+service1.substraction(5, 4));

	}

}
