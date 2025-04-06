package com.trg.Model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	private String employeeId;
	private String employeeName;
	private String employeeDepartment;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeDepartment="
				+ employeeDepartment + "]";
	}
	
	
	
}
