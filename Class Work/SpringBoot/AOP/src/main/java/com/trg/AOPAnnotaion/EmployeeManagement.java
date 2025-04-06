package com.trg.AOPAnnotaion;

public class EmployeeManagement {
	public void addEmployee(Long empId) {
		System.out.println("Add Employee Called");
	}
	public void removeEmployee(Long empId) {
		System.out.println("Remove Employee Called");
	}
}
