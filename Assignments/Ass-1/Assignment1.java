// Find remaindor without using modular operator

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numerator , denominator;
		
		System.out.print("Enter The numerator : ");
		numerator = scan.nextInt();
		System.out.print("Enter The denominator : ");
		denominator = scan.nextInt();
		
		int quotient = (int)(numerator/denominator);
		int remaindor = numerator - (quotient*denominator);
		
		System.out.println("Remaindor is : " + remaindor);

	}

}
