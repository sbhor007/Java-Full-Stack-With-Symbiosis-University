package com.trg.AOPAnnotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		 ApplicationContext myContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 EmployeeManagement emp = (EmployeeManagement) myContext.getBean("manageEmployee");
		 emp.addEmployee(12L);
		 emp.removeEmployee(12L);
	}

}
