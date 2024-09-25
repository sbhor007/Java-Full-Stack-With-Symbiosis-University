package Assingnment19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Write a Program for accepting employees data like 
 * employee ID , Name, Salary, location.
 * Depending upon user choice to search a employee from the collection of employee
 */

class MainMenuChoiceException extends Exception {

	public MainMenuChoiceException(String massage) {
		super(massage);
	}

}

class Employee {
	static int ID;
	private int empId;
	private String empName, empLocation;
	private float salary;
	static {
		ID = 1000;
	}

	public Employee(String empName, String empLocation, float salary) {
		super();
		this.empId = ID++;
		this.empName = empName;
		this.empLocation = empLocation;
		this.salary = salary;

	}

	public static int getID() {
		return ID;
	}

	public static void setID(int iD) {
		ID = iD;
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

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return this.empName +" [\nempId : " + empId + "\nEmployee Name : " + empName + "\nEmployee Address : " + empLocation
				+ "\nSalary : " + salary + "\n]";
	}
}

class SortWithEmployeeId implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if (emp1.getEmpId() == emp2.getEmpId())
			return 0;
		else if (emp1.getEmpId() > emp2.getEmpId())
			return 1;
		else
			return -1;
	}

}

class SortWithEmployeeName implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {

		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}
}

class SortWithEmployeeLocation implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {

		return emp1.getEmpLocation().compareTo(emp2.getEmpLocation());
	}
}

class SortWithEmployeeSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if (emp1.getSalary() == emp2.getSalary())
			return 0;
		else if (emp1.getSalary() < emp2.getSalary())
			return 1;
		else
			return -1;
	}
}

public class EmployeeRecords {

	static void displayEmployee(ArrayList<Employee> employee) {
		for (Employee e : employee) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<Employee>();

		char ch = 'y';
		do {

			try {
				System.out.print(
						"\n1. To Add Employee Record" + "\n2. Display Employees" + "\n3. Sort Employee whith there ID"
								+ "\n4. Sort Employee whith there Name" + "\n5. Sort Employee whith there Salary"
								+ "\n6. Sort Employee whith there Location" + "\nEnter Your Choice : ");
				int choice = scan.nextInt();

				switch (choice) {
				case 1:
					char cha = 'y'; // TODO :
					do {
						try {
							System.out.println("\n------Enter Employee Details-----");
							System.out.print("Enter Name : ");
							String empName = scan.next();
							System.out.print("Enter Location : ");
							String location = scan.next();
							System.out.print("Enter Salary : ");
							float salary = scan.nextFloat();
							employees.add(new Employee(empName, location, salary));
						} catch (InputMismatchException e) {
							System.out.println(e.getMessage());
							scan.nextLine();
						}

						// TODO :
//						try {
							System.out.print("\nDo You Want To Add Another Record (y/n) : ");
							cha = scan.next().charAt(0);
//							if (Character.isDigit(cha))
//								throw new MainMenuChoiceException("Invalid Input \nTray agein....");
//						} catch (MainMenuChoiceException e) {
//							System.out.println(e.getMessage());
//							cha = 'y';
//						}
					} while (cha == 'Y' || cha == 'y');
					break;

				case 2:
					displayEmployee(employees);
					break;
				case 3:
					Collections.sort(employees, new SortWithEmployeeId());
					System.out.println("Sorting With Employe ID Successfull....\n");
					displayEmployee(employees);

					break;
				case 4:
					Collections.sort(employees, new SortWithEmployeeName());
					System.out.println("Sorting With Employee Name Successfull....\n");
					displayEmployee(employees);

					break;
				case 5:
					Collections.sort(employees, new SortWithEmployeeSalary());
					System.out.println("Sorting With Employe Salry Successfull....\n");
					displayEmployee(employees);

					break;
				case 6:
					Collections.sort(employees, new SortWithEmployeeLocation());
					System.out.println("Sorting With Employe Location Successfull....\n");
					displayEmployee(employees);
					break;
				default:
					System.out.println("Invalid Input");
				}

			} catch (InputMismatchException e) {
				System.out.println("Invalid Input\nPlease Try Agein....");
				scan.nextLine();
			}
			// TODO :
//			try {
				System.out.print("\nGo For Main Menu (y/n) : ");
				ch = scan.next().charAt(0);
//				if (Character.isDigit(ch))
//					throw new MainMenuChoiceException("Invalid Input \nTray agein....");
//			} catch (MainMenuChoiceException e) {
//				System.out.println(e.getMessage());
//				ch = 'y';
//			}
		} while (ch == 'Y' || ch == 'y');
		System.out.println("Program Terminated..");
	}

}
