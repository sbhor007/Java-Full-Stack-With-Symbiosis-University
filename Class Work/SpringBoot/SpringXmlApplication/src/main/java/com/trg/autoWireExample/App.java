package com.trg.autoWireExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	@Autowired
	SchoolBean sbean;
	@Autowired
	ComputerTeacher computerTeacher;
	@Autowired
	PrincipleBean principleBeanId;

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.trg.autoWireExample");
		SchoolBean schoolBean = (SchoolBean) context.getBean("cApp");
		schoolBean.show();
//		System.out.println("SchoolBean Object Created : " + schoolBean);
//		schoolBean.show();
		context.close();

	}

}
