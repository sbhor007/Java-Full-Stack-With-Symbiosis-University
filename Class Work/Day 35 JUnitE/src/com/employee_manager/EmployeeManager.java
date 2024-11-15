package com.employee_manager;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
Map<String,Employee> emplist = new HashMap<String, Employee>();
	public void addEmp(String firstname,String lastname,String phoneNo)
	{
		Employee emp1 = new Employee(firstname, lastname, phoneNo);
		validEmp(emp1);
		emplist.put(genKey(emp1),emp1);
	}
	
	private void validEmp(Employee emp1)
	{
		emp1.validFname();
		emp1.validLname();
		emp1.validPhoneNo();
	}
	
	public String genKey(Employee emp1)
	{
		return emp1.getFirstname() + " - " + emp1.getLastname();
	}
	
	public Collection<Employee> getAllEmp()
	{
		return emplist.values();
	}

	public Map<String, Employee> getEmplist() {
		return emplist;
	}

//	public void setEmplist(Map<String, Employee> emplist) {
//		this.emplist = emplist;
//	}
	

}
