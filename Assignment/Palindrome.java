// check given number is Palindrome or not

import java.util.Scanner;

public class Palindrome {

	static boolean isPalindrome(int no) {
		int rev = 0, temp = no;

		while (no != 0) {
			rev = (10 * rev) + (no % 10);
			no = (int) no / 10;
		}

		if (temp == rev) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int no = scan.nextInt();
		if (isPalindrome(no)) {
			System.out.println("Given Number is palindrome");
		} else {
			System.out.println("Given Number is NOT palindrome");
		}

	}

}
