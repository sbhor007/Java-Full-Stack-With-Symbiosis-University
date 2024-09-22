/*
 * Swap Two Numbers
 */

import java.util.*;
public class Assignment4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter A First Number : ");
		num1 = scan.nextInt();
		
		System.out.println("Enter A Second Number : ");
		num2 = scan.nextInt();
		
		System.out.println("Before Swaping : \nNum-1 : " + num1 + "\nNum-2 : " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swaping : \nNum-1 : " + num1 + "\nNum-2 : " + num2);
		
	}

}
