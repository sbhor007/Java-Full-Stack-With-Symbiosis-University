package Ass21;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		try {
		Scanner scan = new Scanner(System.in);
		final int retirementAge = 58;
		System.out.print("Enter Your Joining Date (YYYY-MM-DD) : ");
		String jDate = scan.next();
		System.out.println("Enter Employee Date Of Birth (YYYY-MM-DD) : ");
		String dOBirth = scan.next();
		
		LocalDate joiningDate = LocalDate.parse(jDate);
		LocalDate dateOfBirth = LocalDate.parse(dOBirth);
		
		LocalDate retirementDate = dateOfBirth.plusYears(retirementAge);
		Period remainingYears = Period.between(joiningDate,retirementDate);
		System.out.println("Remaining Years for Retirement : " + remainingYears.getYears() + " Years " + remainingYears.getMonths() + " Months " + remainingYears.getDays() + " Days");
		
		System.out.println("Retirement Date : "+dateOfBirth.plusYears(58)); // retirement date
		}catch (Exception e) {
			System.out.println("Invslid age...");
		}

	}

}
