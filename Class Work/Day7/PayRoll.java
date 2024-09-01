/*
 * write a program to calculate NetPay for an employee whose basic salary is 10000. 
 * D.A 2% of basic, H.R.A 5% of basic, T.A 1% of basic & his eligible for as 2500 per month P.A 
 * contribution you are requested o access the data as personal details like Name,DOB, Address etc.
 */

import java.util.Scanner;

class Person {
	String personName, personDOB;
	int personAge;

	public Person() {
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void setPersonDOB(String personDOB) {
		this.personDOB = personDOB;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

}

class Employee extends Person {
	private float newtPay, basicSalary;
	final float DA_PERCENTAGE = 2, HRA_PERCENTAGE = 5, TA_PERCENTAGE = 1, PF_RUPIES = 2500;
	String empDepartment;

//	public Employee() {}
	public Employee() {
		this.basicSalary = 10000;
	}

	private float calculateDA() {
		return basicSalary * (DA_PERCENTAGE / 100);
	}

	private float calculateHRA() {
		return (basicSalary * HRA_PERCENTAGE) / 100;
	}

	private float calculateTA() {
		return (basicSalary * TA_PERCENTAGE) / 100;
	}

	private float calculateNetSalary() {
		return ((basicSalary + calculateDA() + calculateHRA() + calculateTA()) - PF_RUPIES);
	}

	public String toString() {
		return "Person [\n" + "personName : " + personName + "\npersonDOB : " + personDOB + "\npersonAge : " + personAge
				+ "\nNetPay : " + calculateNetSalary() + "\n]";
	}
}

public class PayRoll {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String empName, empDOB;
		int empAge;

		System.out.println("Enter the Employee Name : ");
		empName = scan.next();
		System.out.println("Enter Ther Employee Date of Birth");
		empDOB = scan.next();
		System.out.println("Enter the Employee age : ");
		empAge = scan.nextInt();

		Employee emp = new Employee();
		emp.setPersonName(empName);
		emp.setPersonDOB(empDOB);
		emp.setPersonAge(empAge);
		System.out.println(emp);

	}

}
