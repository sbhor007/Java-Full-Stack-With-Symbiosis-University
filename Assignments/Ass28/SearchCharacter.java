package Ass28;

import java.util.Scanner;

/*
 * Define Two Strings as Value and Search Value, Return the Index of 
 * the First Character from the Search Value String in the Values 
 * String
 * Example: ("santosh", "harshal")—2nd string starts with 'h', 
 * search it in the 1st string.
 */
public class SearchCharacter {
	public static int searchFirstCharIndex(String str1, String str2) {
		int index = -1;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == str2.charAt(0))
				return i;
		}

		return index;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First String : ");
		String str1 = scan.next();
		System.out.print("Enter Second String : ");
		String str2 = scan.next();
		int index = searchFirstCharIndex(str1, str2);
		if(index != -1) {
			System.out.println("Second string First character ('" + str2.charAt(0) + "') Present at First string " + index + " index");
		}else {
			System.out.println("Second string First character ('" + str2.charAt(0) + "') Not Present at First string");
		}
	}

}
