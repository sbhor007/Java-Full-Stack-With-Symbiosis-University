/*
 * Calculate Grade of  students based on there marks
 */

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Marks : ");
		int marks = scan.nextInt();
		char grade;
		if(marks > 100 || marks < 0) {
			grade = ' ';
		}
		else if (marks >= 90 ) {
			grade = 'O';
		} else if (marks >= 75) {
			grade = 'A';
		} else if (marks >= 60) {
			grade = 'B';
		} else if (marks >= 50) {
			grade = 'C';
		} else if (marks >= 40) {
			grade = 'D';
		} else{
			grade = 'F';
		}
		System.out.println("Your Grade Is : " + grade);
	}
}
