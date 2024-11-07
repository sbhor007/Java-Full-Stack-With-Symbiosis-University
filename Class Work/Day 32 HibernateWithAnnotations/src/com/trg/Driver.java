package com.trg;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.log.Log;

public class Driver {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		// get session from session factory
		Session session = sf.openSession();

		// being transaction
		Transaction t;
		t = session.beginTransaction();
		Scanner scan = new Scanner(System.in);
		char ch;
		do {
			System.out.print("\n1) Insert \n2) Update first name \n3) delete\nEnter Your Choice : ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1: {
				t = session.beginTransaction();
				Employee employee = new Employee();
				System.out.print("Enter employee id : ");
				employee.setId(scan.nextInt());
				System.out.print("First name : ");
				employee.setFirstName(scan.next());
				System.out.print("Last Name : ");
				employee.setLastName(scan.next());
				session.save(employee);
				t.commit();
				System.out.println("data inserted");
				break;
			}
			case 2:
				t = session.beginTransaction();
				System.out.println("Enter Id : ");
				int id = scan.nextInt();
				Employee updateEmployee = (Employee) session.get(Employee.class, id);
				if (updateEmployee != null) {
					System.out.println("Enter new First Name : ");
					String fName = scan.next();
					updateEmployee.setFirstName(fName);
					t.commit();
					System.out.println("Record Updated");
					break;
				}
				System.out.println("Invalid Id");
				break;

			case 3:
				t = session.beginTransaction();
				System.out.println("Enter Employee Id : ");
				id = scan.nextInt();
				Employee deleteEmployee = (Employee) session.get(Employee.class, id);

				if (deleteEmployee != null) {
					session.delete(deleteEmployee);
					t.commit();

					System.out.println("Deleted");
					break;
				}

				System.out.println("Id Not Found");
				break;

			default:
				System.out.println("Invalid Choice");
			}
			System.out.print("Do You Want To Again (Y/N) : ");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

//		Employee employee = new Employee();
//		employee.setId(33);
//		employee.setFirstName("Santosh");
//		employee.setLastName("Bhor");
//		session.save(employee);
//		t.commit();
//		System.out.println("Successfully saved");
//		t = session.beginTransaction();
//		session.delete(employees);
//		t.commit();
//		System.out.println("All records deleted");
		session.close();
	}

}
