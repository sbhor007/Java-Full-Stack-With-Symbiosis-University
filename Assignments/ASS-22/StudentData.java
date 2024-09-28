package Ass22;

/*
 * Create a Hash Table for a Student Data like RollNo, Date_of_birth, student_name and cource_enroll
 * where Roll_no key for a RollNo and print the Hash Table.
 */

import java.time.LocalDate;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

class Student {
	int rollNo;
	LocalDate DOB;
	String studName;
	String courseEnrolled;

	public Student(int rollNo, String dOB, String studName, String courseEnrolled) {
		this.rollNo = rollNo;
		DOB = LocalDate.parse(dOB);
		this.studName = studName;
		this.courseEnrolled = courseEnrolled;
	}

	@Override
	public String toString() {
		return "Student [\nrollNo : " + rollNo 
				+ "\nDOB :" + DOB 
				+ "\nstudName : " + studName 
				+ "\ncourseEnrolled : "	+ courseEnrolled 
				+ "\n]";
	}
}

public class StudentData {
	public static void main(String[] args) {
		Hashtable<Integer, Student> studentTable = new Hashtable<>();
		Scanner scan = new Scanner(System.in);
		char ch;

		do {
			try {
				System.out.print("Enter Roll No: ");
				int rollNo = scan.nextInt();

				System.out.print("Enter Date of Birth (yyyy-mm-dd): ");
				String dob = scan.next();

				System.out.print("Enter Student Name: ");
				String studName = scan.next();

				System.out.println("Enter Your Cource Name : ");
				String courceEnrolled = scan.next();

				studentTable.put(rollNo, new Student(rollNo, dob, studName, courceEnrolled));
			} catch (Exception e) {
				System.out.println("An unexpected error occurred: " + e.getMessage());
			}

			System.out.print("Do you want to add another student? (y/n): ");
			ch = scan.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');

		Enumeration<Integer> rollNumbers = studentTable.keys();
		while (rollNumbers.hasMoreElements()) {
			System.out.println(studentTable.get(rollNumbers.nextElement()));
		}

	}
}

