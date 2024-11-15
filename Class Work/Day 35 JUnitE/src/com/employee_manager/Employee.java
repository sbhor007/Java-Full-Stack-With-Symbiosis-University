package com.employee_manager;

public class Employee {
	private String firstname;
	private String lastname;
	public String phoneNo;
	
	public String getFirstname() 
	{
		return firstname;
	}
	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}
	public String getLastname() 
	{
		return lastname;
	}
	public void setLastname(String lastname) 
	{
		this.lastname = lastname;
	}
	
	public String getPhoneNo() 
	{
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) 
	{
		this.phoneNo = phoneNo;
	}
	
	
	public void validFname()
	{
		if(this.firstname == null)
		{
			throw new RuntimeException("fisrt name can not be empty");
		}
	}
	
	
	public void validLname()
	{
		if(this.lastname == null)
		{
			throw new RuntimeException("last name can not be empty");
		}
	}
	
	
	public void validPhoneNo()
	{
		if(this.phoneNo.length() != 10)
		{
			throw new RuntimeException("Phone nuumber should be 10 digit long");
		}
	}
	
	
	public Employee(String firstname, String lastname, String phoneNo) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", phoneNo=" + phoneNo + "]";
	}

}
