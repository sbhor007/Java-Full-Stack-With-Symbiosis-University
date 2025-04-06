package com.trg.autowireXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
class Employees {
	private String empName,empAddress,empCode;
	private int salary;
	public String getEmpName() {
		return empName;
	}
	@Value("Santosh")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpAddress() {
		return empAddress;
	}
	@Value("Rohile")
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpCode() {
		return empCode;
	}
	@Value("15260")
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	
	public int getSalary() {
		return salary;
	}
	@Value("1256")
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [empName=" + empName + ", empAddress=" + empAddress + ", empCode=" + empCode + ", salary="
				+ salary + "]";
	}
	
	public Employees() {
		System.out.println("Default Constructor Called");
	}
}

@Component
class EmployeeServices {
	@Autowired
	private Employees employee;
	
	

public Employees getEmployee() {
		return employee;
	}



	public void setEmployee(Employees employee) {
		this.employee = employee;
	}



	// Default Constructor used to avoid BeanInstantionException for autowire 
// byName or byType
	public EmployeeServices() {
		System.out.println("Default Constructor used");
	}
}


@Component("employeeApp")
public class EmployeServiceApp {
	@Autowired
	EmployeeServices employeeServices;

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.trg.autowireXml");
		EmployeServiceApp demo = (EmployeServiceApp) context.getBean("employeeApp");
		System.out.println(demo.employeeServices.getEmployee());

	}

}
