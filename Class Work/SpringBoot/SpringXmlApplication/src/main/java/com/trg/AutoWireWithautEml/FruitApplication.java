package com.trg.AutoWireWithautEml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
class Apple{
	public Apple() {
	System.out.println("Apple bean Instantiated");
	}
	
	public void printFruitName() {
		System.out.println("Apple");
	}
}

@Component
class Mango{
	public Mango() {
	System.out.println("Mango bean Instantiated");
	}
	
	public void printFruitName() {
		System.out.println("Mango");
	}
}


@Component("fapp")
public class FruitApplication {
	@Autowired
	Apple apple;
	@Autowired
	Mango mango;
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.trg.AutoWireWithautEml");
		FruitApplication demo = (FruitApplication) context.getBean("fapp");
		demo.apple.printFruitName();
	}
}
