package com.trg.annotationWithDi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//will remove componentscan if u r not using component
//@componentScan(basePackage = "com.trg.annotationWithDi")
public class ShoolConfig {
//	@Bean
		//shcooBeanId -- method name is Bean Id
		//if u want to give diff id  to bean use following
		//@bean(name = "beanObjId")
		//if u want to give multiple Ids use following
	@Bean(name = {"beanObjId","beanObjId1","beanObjId"})
	public SchoolBean schoolBeanId() {
		//return new SchoolBEan
//		this is same as, using constructor injection
//		schoolBean sbean = new Schoolbean(principleId)
		SchoolBean sbean = new SchoolBean(new PrincipleBean());
		// using setter injection
		//SchoolBean sbean = new SchoolBean();
		sbean.setPrinciplebean(principleBeanId());
		sbean.setTeacher(ComputerTeacher());
		return sbean;
	}
	
	private Teacher ComputerTeacher() {
		
		return new ComputerTeacher();
	}

	@Bean
	public PrincipleBean principleBeanId() {
		return new PrincipleBean();
	}
}
