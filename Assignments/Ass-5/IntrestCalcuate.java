// calculate compound intrest and simple intrest

import java.util.Scanner;

public class IntrestCalcuate {

	static double compoundIntrest() {
		Scanner scan = new Scanner(System.in);
		double principle, rate, duration, no, amount;

		System.out.print("Enter The Principle Amount :");
		principle = scan.nextFloat();


		System.out.print("Enter The Rate of Intrest  :");
		rate = scan.nextFloat();

		System.out.print("Enter The Principle Duration :");
		duration = scan.nextFloat();

		System.out.print("Enter The Number of Times Intrest Compounded Yearly  :");
		no = scan.nextFloat();

		amount = principle + (Math.pow((1 + (rate / no)), (no * duration)));
		return (amount - principle);
	}

	static double simpleIntrest() {

		Scanner scan = new Scanner(System.in);
		double principle, rate, duration;

		System.out.print("Enter The Principle Amount :");
		principle = scan.nextFloat();

		

		System.out.print("Enter The Rate of Intrest  :");
		rate = scan.nextFloat();

		System.out.print("Enter The Principle Duration :");
		duration = scan.nextFloat();

		return (principle * rate * duration) / 100;

	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int choice;
		double result;
		System.out.print("1. Calculate Compound Intrest \n" + "2. calculate simple intrest\n" + "Enter Your Choice : ");
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			result = compoundIntrest();
			System.out.println("Compound Intrest " + result);
			break;

		case 2:
			result = simpleIntrest();
			System.out.println("Simple Intrest " + result);
			break;
		default:
			System.out.println("Invalid Input.....");
		}

	}
}
