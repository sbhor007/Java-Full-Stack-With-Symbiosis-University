package EmployeeDepartment;

import java.util.Scanner;

public class EmployeeWithDepartment {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String deptId,deptName,empId,empName;
		
		System.out.print("Enter Department Id : ");
		deptId = scan.next();
		
		System.out.print("Enter Department Name : ");
		deptName = scan.next();
		
		System.out.print("Enter Employee Id : ");
		empId = scan.next();
		
		System.out.print("Enter Eployee Name : ");
		empName = scan.next();
				

		Department department = new Department();
		department.setDeptId(deptId);
		department.setDeptName(deptName);
		Employee emp = new Employee(empId, empName, department);
		
		System.out.println(emp);

	}

}
