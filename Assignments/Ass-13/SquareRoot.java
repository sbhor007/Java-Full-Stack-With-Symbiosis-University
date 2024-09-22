//Find Square root of a given number

import java.util.Scanner;

public class SquareRoot {

	static int squareRoot(int no) {
		if (no == 1) {
			return 1;
		}
		for (int i = 1; i <= (int) no / 2; i++) {
			if (i * i == no)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("----- Find Square Root -----");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int no = scan.nextInt();
		int result = squareRoot(no);
		if (result != -1) {
			System.out.println(" Square root of " + no + " is : " + result);
		} else {
			System.out.println("No Square root found...");
		}

	}

}
