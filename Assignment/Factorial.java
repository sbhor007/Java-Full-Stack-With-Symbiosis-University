// Find the factorial of a given number

import java.util.Scanner;

public class Factorial {

	static int factorial(int no) {
		int fact = 1;
		
		for(int i = 1; i <= no; i++)
		{
			fact *= i;
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int no = scan.nextInt();
		System.out.println("Factorial of " + no + " is : " + factorial(no));
		
	}

}
