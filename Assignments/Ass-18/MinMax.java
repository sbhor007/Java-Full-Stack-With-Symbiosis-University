//find the maximum and minimum of a given array

import java.util.Scanner;

public class MinMax {

	public static int findMax(int[] arr) {

		int max = arr[0], min;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		
		return max;
		
	}
	
	public static int findMin(int[] arr) {

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] marks = new int[5];
		System.out.println("Enter Ther 5 subject marks");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = scan.nextInt();
		}
		
		System.out.println("Max : " + findMax(marks) + "\nMin : " + findMin(marks));
	}
}
