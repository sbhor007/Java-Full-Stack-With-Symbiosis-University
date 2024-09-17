package Day17Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Employee implements Comparable<Employee> {
	private int empId;
	private String empName;
	private float empSalary;

	public Employee(int empId, String empName, float empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [\nempId : " + empId + "\nempName=" + empName + "\nempSalary : " + empSalary + "\n]";
	}

	@Override
	public int compareTo(Employee e) {
		if (empName.compareTo(e.empName) == 0) {
			return 0;
		} else if (empName.compareTo(e.empName) > 0) {
			return 1;
		}
		return -1;
	}
}

public class EmployeesList {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Scanner scan = new Scanner(System.in);
		String s = "San", d = "san";

		char ch;
		do {
			int choice, empId;
			String empName;
			float empSalary;
			System.out.println(
					"\n1. To Add Employee Detais.\n2. To display Employee Records\n3. Sort records on the basis of employee Name");
			System.out.print("Enter Your Choice : ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				try {
					System.out.println("\nEnter Employee Information");
					System.out.println("-----------------------------");
					System.out.print("Employee ID : ");
					empId = scan.nextInt();
					System.out.print("Employee Name : ");
					empName = scan.next();
					System.out.print("Employee Salary : ");
					empSalary = scan.nextFloat();
					employees.add(new Employee(empId, empName, empSalary));
				} catch (Exception e) {
					System.out.println(e.getMessage());
					scan.nextLine();
				}
				break;
			case 2:
				System.out.println("\nEmployee details");
				System.out.println("------------------");

				for (Employee e : employees) {
					System.out.println(e);
				}
				break;
			case 3:
				Collections.sort(employees);
				System.out.println("Sorting Successfully...");
				break;
			default:
				System.out.println("Invalid Input....");
			}

			System.out.print("Do you want to agein (y/n) : ");
			ch = scan.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

	}

}
