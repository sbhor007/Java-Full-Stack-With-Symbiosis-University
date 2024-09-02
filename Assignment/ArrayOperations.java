/*
 * calculate average of number of given  , reverse array , sort an array in ascending order
 */

import java.util.Scanner;

public class ArrayOperations {
	
	static float averageOfArrayElements(int[] arr)
	{
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		return (float)total / arr.length;
	}
	
	static void displayArray(int[] arr) {
		for(int i : arr)
			System.out.print(i + "\t");
	}
	
	static void sortArray(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter The Array Elements : ");
		for(int i = 0; i < arr.length;i++) {
			System.out.print("Element - " + (i+1) + " : ");
			arr[i] = scan.nextInt();
		}
		char ch;
		do {
			int choice;
			System.out.print("-----Menu-----\n"
					+ "1. Calculate Average \n"
					+ "2. Reverse Array \n"
					+ "3. Sort Array\n"
					+ "4. Display Array\n"
					+ "Enter Your Choice : ");
			
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Average of array elements : " + averageOfArrayElements(arr));
				break;
				
			case 2:
				System.out.println("Orignal Array \n");
				displayArray(arr);
				System.out.println("\nReverse array : ");
				for(int i = arr.length-1; i >= 0;i-- ) {
					System.out.print(arr[i] + "\t");					
				}
				break;
				
			case 3:
				System.out.println("Before Sorting\n");
				displayArray(arr);
				System.out.println("\nAfter Sorting\n");
				sortArray(arr);
				displayArray(arr);
				break;
				
			case 4:
				System.out.println("array elements : \n");
				displayArray(arr);
				break;
				
			default:
				System.out.println("Invalid Input");
			}
			System.out.print("\nDo You Want to again (Y/N) : ");
			ch = scan.next().charAt(0);
			
		}while(ch == 'Y' || ch == 'y');
	}

}
