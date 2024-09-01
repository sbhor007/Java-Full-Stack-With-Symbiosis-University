// find the ascii value of a given character

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter A Single Character : ");
		char ch = scan.next().charAt(0);
		
		int asciiValue = (int)ch;
		System.out.println("Ascci Value of " + ch + " is : " + asciiValue);

	}

}
