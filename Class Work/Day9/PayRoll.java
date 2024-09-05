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
	float totalAllowance = 0, PF_RUPIES = 2500;
	String empDepartment;

//	public Employee() {}
	public Employee() {
		this.basicSalary = 10000;
	}


	public void calculateAllowance(float ...allowance) {
		for(float a : allowance) {
			this.totalAllowance += a;
		}
	}
	public float calculateNetSalary() {
		return (basicSalary + this.totalAllowance) - PF_RUPIES;
	}

	

	public String toString() {
		return "Person [\n" + "personName : " + personName + "\npersonDOB : " + personDOB + "\npersonAge : " + personAge
				+ "\nNetPay : " + calculateNetSalary() + "\n]";
	}
}

public class PayRoll {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float TA = 0,DA = 0 ,HRA = 0;
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
		
		char ch;
		System.out.println("Do Yo allow TA (y/n) : ");
		ch = scan.next().charAt(0);
		if(ch == 'y' || ch == 'Y')
		{
			System.out.println("Enter Your TA : ");
			TA = scan.nextFloat();
		}
		
		System.out.println("Do Yo allow DA (y/n) : ");
		ch = scan.next().charAt(0);
		if(ch == 'y' || ch == 'Y')
		{
			System.out.println("Enter Your DA : ");
			DA = scan.nextFloat();
		}
		
		System.out.println("Do Yo allow HRA (y/n) : ");
		ch = scan.next().charAt(0);
		if(ch == 'y' || ch == 'Y')
		{
			System.out.println("Enter Your HRA : ");
			HRA = scan.nextFloat();
		}
		
		// calculayion part
		if(TA > 0 && DA > 0 && HRA > 0) {
			emp.calculateAllowance(TA,DA,HRA);
		}
		if(TA > 0 && DA > 0 && HRA == 0) {
			emp.calculateAllowance(DA,TA);
		}
		if(TA > 0 && DA == 0 && HRA > 0) {
			emp.calculateAllowance(TA,HRA);
		}
		if(TA == 0 && DA > 0 && HRA > 0) {
			emp.calculateAllowance(DA,HRA);
		}
		if(TA == 0 && DA > 0 && HRA == 0) {
			emp.calculateAllowance(DA);
		}
		if(TA > 0 && DA == 0 && HRA == 0) {
			emp.calculateAllowance(TA);
		}
		if(TA == 0 && DA == 0 && HRA > 0 ) {
			emp.calculateAllowance(HRA);
		}
		
			
		
		System.out.println(emp);

	}

}
