package com.trg.autowireXml;

public class EmployeeService {
	private Employee employee;
	
	
// constructor is used for autowire by constructor
	public EmployeeService(Employee employee) {
		System.out.println("Autowiring by cunstructor use");
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}
// used for autowire by name and type
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
// Default Constructor used to avoid BeanInstantionException for autowire 
// byName or byType
	public EmployeeService() {
		System.out.println("Default Constructor used");
	}
	
	
	
}
