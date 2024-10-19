package JDBC;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 5;i++)
		{
			Employee e = new Employee();
			System.out.println("ID : ");
			e.setEmpId(scan.nextInt());
			System.out.println("First Name : ");
			e.setFirstName(scan.next());
			System.out.println("Last Name : ");
			e.setLastName(scan.next());
			CrudeOperation.insertEmployee(e);
		}
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp = CrudeOperation.getEmployee();
		
		for(Employee e : emp)
		{
			System.out.println(e.getEmpId());
		}

	}

}
