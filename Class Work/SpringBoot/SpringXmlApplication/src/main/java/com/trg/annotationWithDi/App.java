package com.trg.annotationWithDi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ShoolConfig.class);
		SchoolBean schoolBean = context.getBean("beanObjId",SchoolBean.class);
		System.out.println("SchoolBean Object Created : " + schoolBean);
		schoolBean.show();
		context.close();

	}

}
