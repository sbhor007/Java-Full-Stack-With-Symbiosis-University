package com.trg.LifeCycleWithoutXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext contex = new AnnotationConfigApplicationContext(CarConfig.class);
				Car p = contex.getBean("CarBean",Car.class);
				System.out.println(p.getId());
				System.out.println(p.getName());
				((ConfigurableApplicationContext)contex).close();

	}

}
