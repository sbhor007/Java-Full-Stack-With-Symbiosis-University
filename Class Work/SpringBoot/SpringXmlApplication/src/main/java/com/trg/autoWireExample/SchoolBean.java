package com.trg.autoWireExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("cApp")
public class SchoolBean {
	@Autowired
	private Teacher teacher;

	
	@Autowired
	private PrincipleBean principlebean;
	
	
	public void show() {
		System.out.println("SchoolBean Show()");
		principlebean.showName();
		teacher.teach();
	}
	
	
	
	
	
	
	
}
