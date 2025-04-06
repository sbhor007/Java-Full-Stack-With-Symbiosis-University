package com.trg.annotationWithDi;

public class SchoolBean {
	private Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	private PrincipleBean principlebean;
// using constructor Injection
	public SchoolBean(PrincipleBean principlebean) {
		super();
		this.principlebean = principlebean;
		System.out.println("Using constructor for DI");
	}

	// using setter Injection
	public void setPrinciplebean(PrincipleBean principlebean) {
		this.principlebean = principlebean;
		System.out.println("Using Setter For DI");
	}
	
	public void show() {
		System.out.println("SchoolBean Show()");
		principlebean.showName();
		teacher.teach();
	}
	
	
	
	
	
	
	
}
