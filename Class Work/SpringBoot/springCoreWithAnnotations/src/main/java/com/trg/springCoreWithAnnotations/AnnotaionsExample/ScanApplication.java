package com.trg.springCoreWithAnnotations.AnnotaionsExample;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;




@ComponentScan(basePackages = {"com.trg.springCoreWithAnnotations.AnnotaionsExample"})
public class ScanApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ScanApplication.class);
		context.refresh();
		
		ScanEmployee employee =  (ScanEmployee) context.getBean("scanEmployee");
		employee.printEmployeeName("Santosh");
		context.close();

	}

}
