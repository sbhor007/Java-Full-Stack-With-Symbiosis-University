package com.trg.ApplicationOne;

public class Employee {
	private int employeeId;
	private String name;
	
	private Address address;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
												//constructor injection
	public Employee(int employeeId, String name, Address address) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.address = address;
	}
	
	
	public Employee(int employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee \n"
				+ "[\nemployeeId=" + employeeId 
				+ "\nname=" + name 
				+ "\n\t" + address + "\n]";
	}
	
	
	
}
